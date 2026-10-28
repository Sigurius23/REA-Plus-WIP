package live.hms.video.sdk.models;

import java.util.ArrayList;
import live.hms.video.error.HMSException;
import live.hms.video.sdk.models.enums.HMSStreamingState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\"\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JL\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR'\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSHLSStreamingState;", "", "running", "", "variants", "Lkotlin/collections/ArrayList;", "Llive/hms/video/sdk/models/HMSHLSVariant;", "Ljava/util/ArrayList;", "error", "Llive/hms/video/error/HMSException;", "state", "Llive/hms/video/sdk/models/enums/HMSStreamingState;", "<init>", "(ZLjava/util/ArrayList;Llive/hms/video/error/HMSException;Llive/hms/video/sdk/models/enums/HMSStreamingState;)V", "getRunning", "()Z", "getVariants", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "getError", "()Llive/hms/video/error/HMSException;", "getState", "()Llive/hms/video/sdk/models/enums/HMSStreamingState;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/util/ArrayList;Llive/hms/video/error/HMSException;Llive/hms/video/sdk/models/enums/HMSStreamingState;)Llive/hms/video/sdk/models/HMSHLSStreamingState;", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSHLSStreamingState {
    private final HMSException error;
    private final boolean running;
    private final HMSStreamingState state;
    private final ArrayList<HMSHLSVariant> variants;

    public HMSHLSStreamingState(boolean z4, ArrayList<HMSHLSVariant> arrayList, HMSException hMSException, HMSStreamingState state) {
        AbstractC22676k.m65750j(state, "state");
        this.running = z4;
        this.variants = arrayList;
        this.error = hMSException;
        this.state = state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMSHLSStreamingState copy$default(HMSHLSStreamingState hMSHLSStreamingState, boolean z4, ArrayList arrayList, HMSException hMSException, HMSStreamingState hMSStreamingState, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = hMSHLSStreamingState.running;
        }
        if ((i13 & 2) != 0) {
            arrayList = hMSHLSStreamingState.variants;
        }
        if ((i13 & 4) != 0) {
            hMSException = hMSHLSStreamingState.error;
        }
        if ((i13 & 8) != 0) {
            hMSStreamingState = hMSHLSStreamingState.state;
        }
        return hMSHLSStreamingState.copy(z4, arrayList, hMSException, hMSStreamingState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getRunning() {
        return this.running;
    }

    public final ArrayList<HMSHLSVariant> component2() {
        return this.variants;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HMSException getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HMSStreamingState getState() {
        return this.state;
    }

    public final HMSHLSStreamingState copy(boolean running, ArrayList<HMSHLSVariant> variants, HMSException error, HMSStreamingState state) {
        AbstractC22676k.m65750j(state, "state");
        return new HMSHLSStreamingState(running, variants, error, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSHLSStreamingState)) {
            return false;
        }
        HMSHLSStreamingState hMSHLSStreamingState = (HMSHLSStreamingState) other;
        return this.running == hMSHLSStreamingState.running && AbstractC22676k.m65745e(this.variants, hMSHLSStreamingState.variants) && AbstractC22676k.m65745e(this.error, hMSHLSStreamingState.error) && this.state == hMSHLSStreamingState.state;
    }

    public final HMSException getError() {
        return this.error;
    }

    public final boolean getRunning() {
        return this.running;
    }

    public final HMSStreamingState getState() {
        return this.state;
    }

    public final ArrayList<HMSHLSVariant> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.running) * 31;
        ArrayList<HMSHLSVariant> arrayList = this.variants;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        HMSException hMSException = this.error;
        return this.state.hashCode() + ((iHashCode2 + (hMSException != null ? hMSException.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "HMSHLSStreamingState(running=" + this.running + ", variants=" + this.variants + ", error=" + this.error + ", state=" + this.state + ')';
    }
}
