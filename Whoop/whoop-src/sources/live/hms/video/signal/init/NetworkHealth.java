package live.hms.video.signal.init;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.SortedMap;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m65681d2 = {"Llive/hms/video/signal/init/NetworkHealth;", "", "timeout", "", QueryParams.URL, "", "scoreMap", "Ljava/util/SortedMap;", "", "Llive/hms/video/signal/init/RangeLimits;", "<init>", "(JLjava/lang/String;Ljava/util/SortedMap;)V", "getTimeout", "()J", "getUrl", "()Ljava/lang/String;", "getScoreMap", "()Ljava/util/SortedMap;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class NetworkHealth {

    @SerializedName("scoreMap")
    private final SortedMap<Integer, RangeLimits> scoreMap;

    @SerializedName("timeout")
    private final long timeout;

    @SerializedName(QueryParams.URL)
    private final String url;

    public NetworkHealth(long j7, String url, SortedMap<Integer, RangeLimits> scoreMap) {
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(scoreMap, "scoreMap");
        this.timeout = j7;
        this.url = url;
        this.scoreMap = scoreMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkHealth copy$default(NetworkHealth networkHealth, long j7, String str, SortedMap sortedMap, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = networkHealth.timeout;
        }
        if ((i13 & 2) != 0) {
            str = networkHealth.url;
        }
        if ((i13 & 4) != 0) {
            sortedMap = networkHealth.scoreMap;
        }
        return networkHealth.copy(j7, str, sortedMap);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeout() {
        return this.timeout;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final SortedMap<Integer, RangeLimits> component3() {
        return this.scoreMap;
    }

    public final NetworkHealth copy(long timeout, String url, SortedMap<Integer, RangeLimits> scoreMap) {
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(scoreMap, "scoreMap");
        return new NetworkHealth(timeout, url, scoreMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkHealth)) {
            return false;
        }
        NetworkHealth networkHealth = (NetworkHealth) other;
        return this.timeout == networkHealth.timeout && AbstractC22676k.m65745e(this.url, networkHealth.url) && AbstractC22676k.m65745e(this.scoreMap, networkHealth.scoreMap);
    }

    public final SortedMap<Integer, RangeLimits> getScoreMap() {
        return this.scoreMap;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.scoreMap.hashCode() + AbstractC11266d.m30450d(Long.hashCode(this.timeout) * 31, 31, this.url);
    }

    public String toString() {
        return "NetworkHealth(timeout=" + this.timeout + ", url=" + this.url + ", scoreMap=" + this.scoreMap + ')';
    }
}
