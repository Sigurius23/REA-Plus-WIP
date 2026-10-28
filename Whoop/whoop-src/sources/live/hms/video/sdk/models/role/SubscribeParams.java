package live.hms.video.sdk.models.role;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/sdk/models/role/SubscribeParams;", "", "subscribeTo", "Ljava/util/ArrayList;", "", "maxSubsBitRate", "", "subscribeDegradationParam", "Llive/hms/video/sdk/models/role/SubscribeDegradationParams;", "<init>", "(Ljava/util/ArrayList;ILlive/hms/video/sdk/models/role/SubscribeDegradationParams;)V", "getSubscribeTo", "()Ljava/util/ArrayList;", "getMaxSubsBitRate", "()I", "getSubscribeDegradationParam", "()Llive/hms/video/sdk/models/role/SubscribeDegradationParams;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class SubscribeParams {

    @SerializedName("maxSubsBitRate")
    private final int maxSubsBitRate;

    @SerializedName("subscribeDegradation")
    private final SubscribeDegradationParams subscribeDegradationParam;

    @SerializedName("subscribeToRoles")
    private final ArrayList<String> subscribeTo;

    public SubscribeParams(ArrayList<String> arrayList, int i13, SubscribeDegradationParams subscribeDegradationParams) {
        this.subscribeTo = arrayList;
        this.maxSubsBitRate = i13;
        this.subscribeDegradationParam = subscribeDegradationParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscribeParams copy$default(SubscribeParams subscribeParams, ArrayList arrayList, int i13, SubscribeDegradationParams subscribeDegradationParams, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            arrayList = subscribeParams.subscribeTo;
        }
        if ((i14 & 2) != 0) {
            i13 = subscribeParams.maxSubsBitRate;
        }
        if ((i14 & 4) != 0) {
            subscribeDegradationParams = subscribeParams.subscribeDegradationParam;
        }
        return subscribeParams.copy(arrayList, i13, subscribeDegradationParams);
    }

    public final ArrayList<String> component1() {
        return this.subscribeTo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxSubsBitRate() {
        return this.maxSubsBitRate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SubscribeDegradationParams getSubscribeDegradationParam() {
        return this.subscribeDegradationParam;
    }

    public final SubscribeParams copy(ArrayList<String> subscribeTo, int maxSubsBitRate, SubscribeDegradationParams subscribeDegradationParam) {
        return new SubscribeParams(subscribeTo, maxSubsBitRate, subscribeDegradationParam);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscribeParams)) {
            return false;
        }
        SubscribeParams subscribeParams = (SubscribeParams) other;
        return AbstractC22676k.m65745e(this.subscribeTo, subscribeParams.subscribeTo) && this.maxSubsBitRate == subscribeParams.maxSubsBitRate && AbstractC22676k.m65745e(this.subscribeDegradationParam, subscribeParams.subscribeDegradationParam);
    }

    public final int getMaxSubsBitRate() {
        return this.maxSubsBitRate;
    }

    public final SubscribeDegradationParams getSubscribeDegradationParam() {
        return this.subscribeDegradationParam;
    }

    public final ArrayList<String> getSubscribeTo() {
        return this.subscribeTo;
    }

    public int hashCode() {
        ArrayList<String> arrayList = this.subscribeTo;
        int iM30448b = AbstractC11266d.m30448b(this.maxSubsBitRate, (arrayList == null ? 0 : arrayList.hashCode()) * 31, 31);
        SubscribeDegradationParams subscribeDegradationParams = this.subscribeDegradationParam;
        return iM30448b + (subscribeDegradationParams != null ? subscribeDegradationParams.hashCode() : 0);
    }

    public String toString() {
        return "SubscribeParams(subscribeTo=" + this.subscribeTo + ", maxSubsBitRate=" + this.maxSubsBitRate + ", subscribeDegradationParam=" + this.subscribeDegradationParam + ')';
    }
}
