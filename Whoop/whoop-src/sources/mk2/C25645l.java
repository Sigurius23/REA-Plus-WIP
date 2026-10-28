package mk2;

import c13.AbstractC3855a;
import com.whoop.hrZones.network.ZoneID;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.time.Duration;
import java.util.Map;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: mk2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001a\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b$\u0010(¨\u0006)"}, m65681d2 = {"Lmk2/l;", "", "Lmk2/i;", "strain", "Lmk2/e;", "heartRate", "", "Lcom/whoop/hrZones/network/ZoneID;", "Ljava/time/Duration;", "hrZoneDurations", "Lmk2/d;", AttachmentExtensionsKt.EXTRA_DURATION, "Lmk2/f;", "map", "<init>", "(Lmk2/i;Lmk2/e;Ljava/util/Map;Lmk2/d;Lmk2/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk2/i;", "e", "()Lmk2/i;", "b", "Lmk2/e;", "()Lmk2/e;", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "d", "Lmk2/d;", "()Lmk2/d;", "Lmk2/f;", "()Lmk2/f;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25645l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C25642i strain;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C25638e heartRate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<ZoneID, Duration> hrZoneDurations;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C25637d duration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C25639f map;

    public C25645l(C25642i strain, C25638e heartRate, Map<ZoneID, Duration> hrZoneDurations, C25637d duration, C25639f c25639f) {
        AbstractC22676k.m65750j(strain, "strain");
        AbstractC22676k.m65750j(heartRate, "heartRate");
        AbstractC22676k.m65750j(hrZoneDurations, "hrZoneDurations");
        AbstractC22676k.m65750j(duration, "duration");
        this.strain = strain;
        this.heartRate = heartRate;
        this.hrZoneDurations = hrZoneDurations;
        this.duration = duration;
        this.map = c25639f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C25637d getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C25638e getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: c */
    public final Map<ZoneID, Duration> m75460c() {
        return this.hrZoneDurations;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C25639f getMap() {
        return this.map;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C25642i getStrain() {
        return this.strain;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25645l)) {
            return false;
        }
        C25645l c25645l = (C25645l) other;
        return AbstractC22676k.m65745e(this.strain, c25645l.strain) && AbstractC22676k.m65745e(this.heartRate, c25645l.heartRate) && AbstractC22676k.m65745e(this.hrZoneDurations, c25645l.hrZoneDurations) && AbstractC22676k.m65745e(this.duration, c25645l.duration) && AbstractC22676k.m65745e(this.map, c25645l.map);
    }

    public int hashCode() {
        int iHashCode = (this.duration.hashCode() + AbstractC3855a.m11821e(this.hrZoneDurations, (this.heartRate.hashCode() + (this.strain.hashCode() * 31)) * 31, 31)) * 31;
        C25639f c25639f = this.map;
        return iHashCode + (c25639f == null ? 0 : c25639f.hashCode());
    }

    public String toString() {
        return "TrackSessionDomainState(strain=" + this.strain + ", heartRate=" + this.heartRate + ", hrZoneDurations=" + this.hrZoneDurations + ", duration=" + this.duration + ", map=" + this.map + ")";
    }

    public /* synthetic */ C25645l(C25642i c25642i, C25638e c25638e, Map map, C25637d c25637d, C25639f c25639f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C25642i(0.0f, 0.0f, 0.0f, null, 0.0f, 0.0f, 0.0d, 0.0d, 255, null) : c25642i, (i13 & 2) != 0 ? new C25638e(null, null, 3, null) : c25638e, (i13 & 4) != 0 ? C25272z.f99163w : map, (i13 & 8) != 0 ? new C25637d(null, null, 3, null) : c25637d, (i13 & 16) != 0 ? null : c25639f);
    }
}
