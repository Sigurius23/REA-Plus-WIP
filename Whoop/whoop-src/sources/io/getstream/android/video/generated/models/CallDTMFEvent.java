package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import jg3.C21682i;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0012J`\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\u00052\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\u0012J\u0010\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b,\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0019R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b/\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b0\u0010\u0016R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b3\u0010\u0012¨\u00064"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallDTMFEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Lio/getstream/android/video/generated/models/WSCallEvent;", "", "callCid", "Ljg3/i;", "createdAt", "digit", "", "durationMs", "seqNumber", "timestamp", "Lio/getstream/android/video/generated/models/UserResponse;", UserState.Sources.USER, "type", "<init>", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;IILjg3/i;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getCallCID", "component1", "component2", "()Ljg3/i;", "component3", "component4", "()I", "component5", "component6", "component7", "()Lio/getstream/android/video/generated/models/UserResponse;", "component8", "copy", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;IILjg3/i;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallDTMFEvent;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallCid", "Ljg3/i;", "getCreatedAt", "getDigit", "I", "getDurationMs", "getSeqNumber", "getTimestamp", "Lio/getstream/android/video/generated/models/UserResponse;", "getUser", "getType", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallDTMFEvent extends VideoEvent implements WSCallEvent {
    private final String callCid;
    private final C21682i createdAt;
    private final String digit;
    private final int durationMs;
    private final int seqNumber;
    private final C21682i timestamp;
    private final String type;
    private final UserResponse user;

    public CallDTMFEvent(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "digit") String digit, @InterfaceC30731q(name = "duration_ms") int i13, @InterfaceC30731q(name = "seq_number") int i14, @InterfaceC30731q(name = "timestamp") C21682i timestamp, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(digit, "digit");
        AbstractC22676k.m65750j(timestamp, "timestamp");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        this.callCid = callCid;
        this.createdAt = createdAt;
        this.digit = digit;
        this.durationMs = i13;
        this.seqNumber = i14;
        this.timestamp = timestamp;
        this.user = user;
        this.type = type;
    }

    public static /* synthetic */ CallDTMFEvent copy$default(CallDTMFEvent callDTMFEvent, String str, C21682i c21682i, String str2, int i13, int i14, C21682i c21682i2, UserResponse userResponse, String str3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = callDTMFEvent.callCid;
        }
        if ((i15 & 2) != 0) {
            c21682i = callDTMFEvent.createdAt;
        }
        if ((i15 & 4) != 0) {
            str2 = callDTMFEvent.digit;
        }
        if ((i15 & 8) != 0) {
            i13 = callDTMFEvent.durationMs;
        }
        if ((i15 & 16) != 0) {
            i14 = callDTMFEvent.seqNumber;
        }
        if ((i15 & 32) != 0) {
            c21682i2 = callDTMFEvent.timestamp;
        }
        if ((i15 & 64) != 0) {
            userResponse = callDTMFEvent.user;
        }
        if ((i15 & 128) != 0) {
            str3 = callDTMFEvent.type;
        }
        UserResponse userResponse2 = userResponse;
        String str4 = str3;
        int i16 = i14;
        C21682i c21682i3 = c21682i2;
        return callDTMFEvent.copy(str, c21682i, str2, i13, i16, c21682i3, userResponse2, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallCid() {
        return this.callCid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDigit() {
        return this.digit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDurationMs() {
        return this.durationMs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSeqNumber() {
        return this.seqNumber;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final C21682i getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final UserResponse getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final CallDTMFEvent copy(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "digit") String digit, @InterfaceC30731q(name = "duration_ms") int durationMs, @InterfaceC30731q(name = "seq_number") int seqNumber, @InterfaceC30731q(name = "timestamp") C21682i timestamp, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(digit, "digit");
        AbstractC22676k.m65750j(timestamp, "timestamp");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        return new CallDTMFEvent(callCid, createdAt, digit, durationMs, seqNumber, timestamp, user, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallDTMFEvent)) {
            return false;
        }
        CallDTMFEvent callDTMFEvent = (CallDTMFEvent) other;
        return AbstractC22676k.m65745e(this.callCid, callDTMFEvent.callCid) && AbstractC22676k.m65745e(this.createdAt, callDTMFEvent.createdAt) && AbstractC22676k.m65745e(this.digit, callDTMFEvent.digit) && this.durationMs == callDTMFEvent.durationMs && this.seqNumber == callDTMFEvent.seqNumber && AbstractC22676k.m65745e(this.timestamp, callDTMFEvent.timestamp) && AbstractC22676k.m65745e(this.user, callDTMFEvent.user) && AbstractC22676k.m65745e(this.type, callDTMFEvent.type);
    }

    @Override // io.getstream.android.video.generated.models.WSCallEvent
    public String getCallCID() {
        return this.callCid;
    }

    public final String getCallCid() {
        return this.callCid;
    }

    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final String getDigit() {
        return this.digit;
    }

    public final int getDurationMs() {
        return this.durationMs;
    }

    @Override // io.getstream.android.video.generated.models.VideoEvent
    /* JADX INFO: renamed from: getEventType */
    public String getType() {
        return this.type;
    }

    public final int getSeqNumber() {
        return this.seqNumber;
    }

    public final C21682i getTimestamp() {
        return this.timestamp;
    }

    public final String getType() {
        return this.type;
    }

    public final UserResponse getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.type.hashCode() + ((this.user.hashCode() + AbstractC3855a.m11822f(this.timestamp, AbstractC11266d.m30448b(this.seqNumber, AbstractC11266d.m30448b(this.durationMs, AbstractC11266d.m30450d(AbstractC3855a.m11822f(this.createdAt, this.callCid.hashCode() * 31, 31), 31, this.digit), 31), 31), 31)) * 31);
    }

    public String toString() {
        String str = this.callCid;
        C21682i c21682i = this.createdAt;
        String str2 = this.digit;
        int i13 = this.durationMs;
        int i14 = this.seqNumber;
        C21682i c21682i2 = this.timestamp;
        UserResponse userResponse = this.user;
        String str3 = this.type;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("CallDTMFEvent(callCid=", c21682i, str, ", createdAt=", ", digit=");
        AbstractC11266d.m30470x(i13, str2, ", durationMs=", ", seqNumber=", sbM94767p);
        sbM94767p.append(i14);
        sbM94767p.append(", timestamp=");
        sbM94767p.append(c21682i2);
        sbM94767p.append(", user=");
        sbM94767p.append(userResponse);
        sbM94767p.append(", type=");
        sbM94767p.append(str3);
        sbM94767p.append(")");
        return sbM94767p.toString();
    }
}
