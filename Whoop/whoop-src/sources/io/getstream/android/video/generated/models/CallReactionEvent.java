package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import jg3.C21682i;
import p000.AbstractC30802r;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ8\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b&\u0010\r¨\u0006'"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallReactionEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Lio/getstream/android/video/generated/models/WSCallEvent;", "", "callCid", "Ljg3/i;", "createdAt", "Lio/getstream/android/video/generated/models/ReactionResponse;", "reaction", "type", "<init>", "(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/ReactionResponse;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getCallCID", "component1", "component2", "()Ljg3/i;", "component3", "()Lio/getstream/android/video/generated/models/ReactionResponse;", "component4", "copy", "(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/ReactionResponse;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallReactionEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallCid", "Ljg3/i;", "getCreatedAt", "Lio/getstream/android/video/generated/models/ReactionResponse;", "getReaction", "getType", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallReactionEvent extends VideoEvent implements WSCallEvent {
    private final String callCid;
    private final C21682i createdAt;
    private final ReactionResponse reaction;
    private final String type;

    public CallReactionEvent(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "reaction") ReactionResponse reaction, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(reaction, "reaction");
        AbstractC22676k.m65750j(type, "type");
        this.callCid = callCid;
        this.createdAt = createdAt;
        this.reaction = reaction;
        this.type = type;
    }

    public static /* synthetic */ CallReactionEvent copy$default(CallReactionEvent callReactionEvent, String str, C21682i c21682i, ReactionResponse reactionResponse, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = callReactionEvent.callCid;
        }
        if ((i13 & 2) != 0) {
            c21682i = callReactionEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            reactionResponse = callReactionEvent.reaction;
        }
        if ((i13 & 8) != 0) {
            str2 = callReactionEvent.type;
        }
        return callReactionEvent.copy(str, c21682i, reactionResponse, str2);
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
    public final ReactionResponse getReaction() {
        return this.reaction;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final CallReactionEvent copy(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "reaction") ReactionResponse reaction, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(reaction, "reaction");
        AbstractC22676k.m65750j(type, "type");
        return new CallReactionEvent(callCid, createdAt, reaction, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallReactionEvent)) {
            return false;
        }
        CallReactionEvent callReactionEvent = (CallReactionEvent) other;
        return AbstractC22676k.m65745e(this.callCid, callReactionEvent.callCid) && AbstractC22676k.m65745e(this.createdAt, callReactionEvent.createdAt) && AbstractC22676k.m65745e(this.reaction, callReactionEvent.reaction) && AbstractC22676k.m65745e(this.type, callReactionEvent.type);
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

    @Override // io.getstream.android.video.generated.models.VideoEvent
    /* JADX INFO: renamed from: getEventType */
    public String getType() {
        return this.type;
    }

    public final ReactionResponse getReaction() {
        return this.reaction;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + ((this.reaction.hashCode() + AbstractC3855a.m11822f(this.createdAt, this.callCid.hashCode() * 31, 31)) * 31);
    }

    public String toString() {
        String str = this.callCid;
        C21682i c21682i = this.createdAt;
        ReactionResponse reactionResponse = this.reaction;
        String str2 = this.type;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("CallReactionEvent(callCid=", c21682i, str, ", createdAt=", ", reaction=");
        sbM94767p.append(reactionResponse);
        sbM94767p.append(", type=");
        sbM94767p.append(str2);
        sbM94767p.append(")");
        return sbM94767p.toString();
    }
}
