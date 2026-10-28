package live.hms.video.connection.stats;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import live.hms.video.connection.degredation.Track;
import live.hms.video.media.settings.HMSLayer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000fR0\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/connection/stats/BitrateCalculator;", "", "<init>", "()V", "Llive/hms/video/connection/degredation/Track;", "stat", "", "getBitrateFromTrackUpdatePrev", "(Llive/hms/video/connection/degredation/Track;)D", "", "trackId", "remoteTimeStamp", "Ljava/math/BigInteger;", "bytesTransported", "postfix", "(Ljava/lang/String;Ljava/lang/Double;Ljava/math/BigInteger;Ljava/lang/String;)Ljava/lang/Double;", "Ljava/util/HashMap;", "Ll83/k;", "prevTrackStatsReceivedTime", "Ljava/util/HashMap;", "", "prevBitrate", "Ljava/util/Map;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class BitrateCalculator {
    private final HashMap<String, C23465k> prevTrackStatsReceivedTime = new HashMap<>();
    private final Map<String, Double> prevBitrate = new LinkedHashMap();

    public final double getBitrateFromTrackUpdatePrev(Track stat) {
        String strName;
        HMSLayer hmsLayer;
        AbstractC22676k.m65750j(stat, "stat");
        BigInteger bytesTransported = stat.getBytesTransported();
        Float fValueOf = bytesTransported != null ? Float.valueOf(bytesTransported.floatValue()) : null;
        Track.LocalTrack.LocalVideo localVideo = stat instanceof Track.LocalTrack.LocalVideo ? (Track.LocalTrack.LocalVideo) stat : null;
        if (localVideo == null || (hmsLayer = localVideo.getHmsLayer()) == null || (strName = hmsLayer.name()) == null) {
            strName = "";
        }
        String str = stat instanceof Track.LocalTrack ? "_publish" : "_subscribe";
        if (fValueOf == null || fValueOf.floatValue() < 0.0d) {
            Double d3 = this.prevBitrate.get(stat.getTrackIdentifier() + '_' + strName + '_' + str);
            if (d3 != null) {
                return d3.doubleValue();
            }
            return 0.0d;
        }
        Double bitrateFromTrackUpdatePrev = getBitrateFromTrackUpdatePrev(stat.getTrackIdentifier(), stat.getRemoteTimestamp(), stat.getBytesTransported(), strName.concat(str));
        if (bitrateFromTrackUpdatePrev != null) {
            return bitrateFromTrackUpdatePrev.doubleValue();
        }
        Double d14 = this.prevBitrate.get(stat.getTrackIdentifier() + '_' + strName + '_' + str);
        if (d14 != null) {
            return d14.doubleValue();
        }
        return 0.0d;
    }

    public final Double getBitrateFromTrackUpdatePrev(String trackId, Double remoteTimeStamp, BigInteger bytesTransported, String postfix) {
        AbstractC22676k.m65750j(postfix, "postfix");
        Double dValueOf = Double.valueOf(0.0d);
        if (trackId != null && remoteTimeStamp != null) {
            C23465k c23465k = this.prevTrackStatsReceivedTime.get(trackId + '_' + postfix);
            Double d3 = c23465k != null ? (Double) c23465k.f92937w : null;
            BigInteger bigInteger = c23465k != null ? (BigInteger) c23465k.f92938x : null;
            if (bigInteger != null && d3 != null && bytesTransported != null) {
                double dDoubleValue = (remoteTimeStamp.doubleValue() - d3.doubleValue()) / ((double) DurationKt.NANOS_IN_MILLIS);
                dValueOf = dDoubleValue > 0.0d ? Double.valueOf(((double) ((bytesTransported.floatValue() - bigInteger.floatValue()) * 0.008f)) / dDoubleValue) : null;
            }
            if (dValueOf != null) {
                this.prevTrackStatsReceivedTime.put(AbstractC11895b.m31992k('_', trackId, postfix), new C23465k(remoteTimeStamp, bytesTransported));
                this.prevBitrate.put(trackId + '_' + postfix, dValueOf);
            }
        }
        return dValueOf;
    }
}
