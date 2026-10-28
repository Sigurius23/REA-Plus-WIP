package live.hms.video.connection.degredation;

import java.math.BigInteger;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0007¨\u0006\""}, m65681d2 = {"Llive/hms/video/connection/degredation/RemoteTrack;", "Llive/hms/video/connection/degredation/Track;", "<init>", "()V", "jitter", "", "getJitter", "()Ljava/lang/Double;", "jitterBufferDelay", "getJitterBufferDelay", "packetsLost", "", "getPacketsLost", "()Ljava/lang/Integer;", "packetsReceived", "", "getPacketsReceived", "()Ljava/lang/Long;", "ssrc", "getSsrc", "lastPacketReceivedTimestamp", "getLastPacketReceivedTimestamp", "timestampUs", "getTimestampUs", "bytesTransported", "Ljava/math/BigInteger;", "getBytesTransported", "()Ljava/math/BigInteger;", "trackIdentifier", "", "getTrackIdentifier", "()Ljava/lang/String;", "remoteTimestamp", "getRemoteTimestamp", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class RemoteTrack extends Track {
    public RemoteTrack() {
        super(null);
    }

    @Override // live.hms.video.connection.degredation.Track
    public abstract BigInteger getBytesTransported();

    public abstract Double getJitter();

    public abstract Double getJitterBufferDelay();

    public abstract Double getLastPacketReceivedTimestamp();

    public abstract Integer getPacketsLost();

    public abstract Long getPacketsReceived();

    @Override // live.hms.video.connection.degredation.Track
    public abstract Double getRemoteTimestamp();

    public abstract Long getSsrc();

    public abstract Double getTimestampUs();

    @Override // live.hms.video.connection.degredation.Track
    public abstract String getTrackIdentifier();
}
