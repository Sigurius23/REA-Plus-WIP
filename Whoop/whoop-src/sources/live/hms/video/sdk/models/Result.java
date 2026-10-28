package live.hms.video.sdk.models;

import com.google.gson.annotations.SerializedName;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Llive/hms/video/sdk/models/Result;", "", "mode", "Llive/hms/video/sdk/models/TranscriptionsMode;", "<init>", "(Llive/hms/video/sdk/models/TranscriptionsMode;)V", "getMode", "()Llive/hms/video/sdk/models/TranscriptionsMode;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class Result {

    @SerializedName("mode")
    private final TranscriptionsMode mode;

    public Result(TranscriptionsMode transcriptionsMode) {
        this.mode = transcriptionsMode;
    }

    public static /* synthetic */ Result copy$default(Result result, TranscriptionsMode transcriptionsMode, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            transcriptionsMode = result.mode;
        }
        return result.copy(transcriptionsMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TranscriptionsMode getMode() {
        return this.mode;
    }

    public final Result copy(TranscriptionsMode mode) {
        return new Result(mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Result) && this.mode == ((Result) other).mode;
    }

    public final TranscriptionsMode getMode() {
        return this.mode;
    }

    public int hashCode() {
        TranscriptionsMode transcriptionsMode = this.mode;
        if (transcriptionsMode == null) {
            return 0;
        }
        return transcriptionsMode.hashCode();
    }

    public String toString() {
        return "Result(mode=" + this.mode + ')';
    }
}
