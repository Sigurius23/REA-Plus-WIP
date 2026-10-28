package live.hms.video.connection.stats.clientside.model;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0012\u0010\u0010\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/connection/stats/clientside/model/PublishBaseSamples;", "Llive/hms/video/connection/stats/clientside/model/BaseSample;", "avgRoundTripTimeMs", "", "getAvgRoundTripTimeMs", "()I", "avgJitterMs", "", "getAvgJitterMs", "()F", "totalPacketsLost", "", "getTotalPacketsLost", "()J", "avgBitrateBps", "getAvgBitrateBps", "avgAvailableOutgoingBitrateBps", "getAvgAvailableOutgoingBitrateBps", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface PublishBaseSamples extends BaseSample {
    long getAvgAvailableOutgoingBitrateBps();

    long getAvgBitrateBps();

    float getAvgJitterMs();

    int getAvgRoundTripTimeMs();

    long getTotalPacketsLost();
}
