package live.hms.video.sdk.transcripts;

import com.google.gson.annotations.SerializedName;
import hc3.AbstractC17176i;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/sdk/transcripts/HmsTranscripts;", "", "transcripts", "", "Llive/hms/video/sdk/transcripts/HmsTranscript;", "<init>", "(Ljava/util/List;)V", "getTranscripts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HmsTranscripts {

    @SerializedName("results")
    private final List<HmsTranscript> transcripts;

    public HmsTranscripts(List<HmsTranscript> transcripts) {
        AbstractC22676k.m65750j(transcripts, "transcripts");
        this.transcripts = transcripts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HmsTranscripts copy$default(HmsTranscripts hmsTranscripts, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = hmsTranscripts.transcripts;
        }
        return hmsTranscripts.copy(list);
    }

    public final List<HmsTranscript> component1() {
        return this.transcripts;
    }

    public final HmsTranscripts copy(List<HmsTranscript> transcripts) {
        AbstractC22676k.m65750j(transcripts, "transcripts");
        return new HmsTranscripts(transcripts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HmsTranscripts) && AbstractC22676k.m65745e(this.transcripts, ((HmsTranscripts) other).transcripts);
    }

    public final List<HmsTranscript> getTranscripts() {
        return this.transcripts;
    }

    public int hashCode() {
        return this.transcripts.hashCode();
    }

    public String toString() {
        return AbstractC17176i.m48506h(new StringBuilder("HmsTranscripts(transcripts="), this.transcripts, ')');
    }
}
