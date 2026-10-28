package live.hms.video.sdk.transcripts;

import com.google.gson.annotations.SerializedName;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSPeer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J;\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, m65681d2 = {"Llive/hms/video/sdk/transcripts/HmsTranscript;", "", "start", "", "end", "transcript", "", "peerId", "isFinal", "", "<init>", "(IILjava/lang/String;Ljava/lang/String;Z)V", "getStart", "()I", "getEnd", "getTranscript", "()Ljava/lang/String;", "getPeerId", "()Z", "store", "Llive/hms/video/sdk/SDKStore;", "getStore$lib_release", "()Llive/hms/video/sdk/SDKStore;", "setStore$lib_release", "(Llive/hms/video/sdk/SDKStore;)V", "peer", "Llive/hms/video/sdk/models/HMSPeer;", "getPeer", "()Llive/hms/video/sdk/models/HMSPeer;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HmsTranscript {

    @SerializedName("end")
    private final int end;

    @SerializedName("final")
    private final boolean isFinal;

    @SerializedName("peer_id")
    private final String peerId;

    @SerializedName("start")
    private final int start;
    public SDKStore store;

    @SerializedName("transcript")
    private final String transcript;

    public HmsTranscript(int i13, int i14, String transcript, String peerId, boolean z4) {
        AbstractC22676k.m65750j(transcript, "transcript");
        AbstractC22676k.m65750j(peerId, "peerId");
        this.start = i13;
        this.end = i14;
        this.transcript = transcript;
        this.peerId = peerId;
        this.isFinal = z4;
    }

    public static /* synthetic */ HmsTranscript copy$default(HmsTranscript hmsTranscript, int i13, int i14, String str, String str2, boolean z4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = hmsTranscript.start;
        }
        if ((i15 & 2) != 0) {
            i14 = hmsTranscript.end;
        }
        if ((i15 & 4) != 0) {
            str = hmsTranscript.transcript;
        }
        if ((i15 & 8) != 0) {
            str2 = hmsTranscript.peerId;
        }
        if ((i15 & 16) != 0) {
            z4 = hmsTranscript.isFinal;
        }
        boolean z13 = z4;
        String str3 = str;
        return hmsTranscript.copy(i13, i14, str3, str2, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTranscript() {
        return this.transcript;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPeerId() {
        return this.peerId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsFinal() {
        return this.isFinal;
    }

    public final HmsTranscript copy(int start, int end, String transcript, String peerId, boolean isFinal) {
        AbstractC22676k.m65750j(transcript, "transcript");
        AbstractC22676k.m65750j(peerId, "peerId");
        return new HmsTranscript(start, end, transcript, peerId, isFinal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HmsTranscript)) {
            return false;
        }
        HmsTranscript hmsTranscript = (HmsTranscript) other;
        return this.start == hmsTranscript.start && this.end == hmsTranscript.end && AbstractC22676k.m65745e(this.transcript, hmsTranscript.transcript) && AbstractC22676k.m65745e(this.peerId, hmsTranscript.peerId) && this.isFinal == hmsTranscript.isFinal;
    }

    public final int getEnd() {
        return this.end;
    }

    public final HMSPeer getPeer() {
        return getStore$lib_release().getPeerById(this.peerId);
    }

    public final String getPeerId() {
        return this.peerId;
    }

    public final int getStart() {
        return this.start;
    }

    public final SDKStore getStore$lib_release() {
        SDKStore sDKStore = this.store;
        if (sDKStore != null) {
            return sDKStore;
        }
        AbstractC22676k.m65757q("store");
        throw null;
    }

    public final String getTranscript() {
        return this.transcript;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFinal) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.end, Integer.hashCode(this.start) * 31, 31), 31, this.transcript), 31, this.peerId);
    }

    public final boolean isFinal() {
        return this.isFinal;
    }

    public final void setStore$lib_release(SDKStore sDKStore) {
        AbstractC22676k.m65750j(sDKStore, "<set-?>");
        this.store = sDKStore;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HmsTranscript(start=");
        sb4.append(this.start);
        sb4.append(", end=");
        sb4.append(this.end);
        sb4.append(", transcript=");
        sb4.append(this.transcript);
        sb4.append(", peerId=");
        sb4.append(this.peerId);
        sb4.append(", isFinal=");
        return AbstractC2875y.m8305r(sb4, this.isFinal, ')');
    }
}
