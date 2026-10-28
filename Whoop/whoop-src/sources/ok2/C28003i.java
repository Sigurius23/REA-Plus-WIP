package ok2;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ok2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0015\u0010\u001e¨\u0006\""}, m65681d2 = {"Lok2/i;", "Lm91/u;", "", "id", "", "heartRateBpm", "", "isConnected", "Lok2/e;", "zoneLabelState", "centerInContent", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;ZLok2/e;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Z", "e", "()Z", "d", "Lok2/e;", "()Lok2/e;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28003i implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f112922f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer heartRateBpm;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isConnected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27999e zoneLabelState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean centerInContent;

    public C28003i(String id4, Integer num, boolean z4, C27999e c27999e, boolean z13) {
        AbstractC22676k.m65750j(id4, "id");
        this.id = id4;
        this.heartRateBpm = num;
        this.isConnected = z4;
        this.zoneLabelState = c27999e;
        this.centerInContent = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCenterInContent() {
        return this.centerInContent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getHeartRateBpm() {
        return this.heartRateBpm;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27999e getZoneLabelState() {
        return this.zoneLabelState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28003i)) {
            return false;
        }
        C28003i c28003i = (C28003i) other;
        return AbstractC22676k.m65745e(this.id, c28003i.id) && AbstractC22676k.m65745e(this.heartRateBpm, c28003i.heartRateBpm) && this.isConnected == c28003i.isConnected && AbstractC22676k.m65745e(this.zoneLabelState, c28003i.zoneLabelState) && this.centerInContent == c28003i.centerInContent;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Integer num = this.heartRateBpm;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.isConnected);
        C27999e c27999e = this.zoneLabelState;
        return Boolean.hashCode(this.centerInContent) + ((iM8289b + (c27999e != null ? c27999e.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        Integer num = this.heartRateBpm;
        boolean z4 = this.isConnected;
        C27999e c27999e = this.zoneLabelState;
        boolean z13 = this.centerInContent;
        StringBuilder sb4 = new StringBuilder("TrackActivityLiveHeartRateItemViewState(id=");
        sb4.append(str);
        sb4.append(", heartRateBpm=");
        sb4.append(num);
        sb4.append(", isConnected=");
        sb4.append(z4);
        sb4.append(", zoneLabelState=");
        sb4.append(c27999e);
        sb4.append(", centerInContent=");
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }

    public /* synthetic */ C28003i(String str, Integer num, boolean z4, C27999e c27999e, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "TRACK_ACTIVITY_LIVE_HEART_RATE" : str, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? null : c27999e, (i13 & 16) != 0 ? false : z13);
    }
}
