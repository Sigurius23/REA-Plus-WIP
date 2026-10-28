package am2;

import cm2.EnumC4821i;
import com.mapbox.common.HttpHeaders;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import or2.EnumC28166h0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vl2.EnumC36106a;

/* JADX INFO: renamed from: am2.d0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, m65681d2 = {"Lam2/d0;", "", "", HttpHeaders.DATE, "Lor2/h0;", "graphKey", "Lvl2/a;", AttachmentExtensionsKt.EXTRA_DURATION, "Lcm2/i;", "measurementType", "<init>", "(Ljava/lang/String;Lor2/h0;Lvl2/a;Lcm2/i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lor2/h0;", "c", "()Lor2/h0;", "Lvl2/a;", "()Lvl2/a;", "d", "Lcm2/i;", "()Lcm2/i;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C1013d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC28166h0 graphKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC36106a duration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC4821i measurementType;

    public C1013d0(String date, EnumC28166h0 graphKey, EnumC36106a duration, EnumC4821i enumC4821i) {
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(graphKey, "graphKey");
        AbstractC22676k.m65750j(duration, "duration");
        this.date = date;
        this.graphKey = graphKey;
        this.duration = duration;
        this.measurementType = enumC4821i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC36106a getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC28166h0 getGraphKey() {
        return this.graphKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC4821i getMeasurementType() {
        return this.measurementType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1013d0)) {
            return false;
        }
        C1013d0 c1013d0 = (C1013d0) other;
        return AbstractC22676k.m65745e(this.date, c1013d0.date) && this.graphKey == c1013d0.graphKey && this.duration == c1013d0.duration && this.measurementType == c1013d0.measurementType;
    }

    public int hashCode() {
        int iHashCode = (this.duration.hashCode() + ((this.graphKey.hashCode() + (this.date.hashCode() * 31)) * 31)) * 31;
        EnumC4821i enumC4821i = this.measurementType;
        return iHashCode + (enumC4821i == null ? 0 : enumC4821i.hashCode());
    }

    public String toString() {
        return "TrendsMetaDataV3(date=" + this.date + ", graphKey=" + this.graphKey + ", duration=" + this.duration + ", measurementType=" + this.measurementType + ")";
    }
}
