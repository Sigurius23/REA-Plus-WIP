package io.getstream.chat.android.client.api2.model.requests;

import com.mapbox.maps.MapboxMap;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/GetThreadRequest;", "", "watch", "", "reply_limit", "", "participant_limit", "member_limit", MapboxMap.QFE_LIMIT, "next", "", "<init>", "(ZIIIILjava/lang/String;)V", "getWatch", "()Z", "getReply_limit", "()I", "getParticipant_limit", "getMember_limit", "getLimit", "getNext", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class GetThreadRequest {
    private final int limit;
    private final int member_limit;
    private final String next;
    private final int participant_limit;
    private final int reply_limit;
    private final boolean watch;

    public GetThreadRequest() {
        this(false, 0, 0, 0, 0, null, 63, null);
    }

    public static /* synthetic */ GetThreadRequest copy$default(GetThreadRequest getThreadRequest, boolean z4, int i13, int i14, int i15, int i16, String str, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            z4 = getThreadRequest.watch;
        }
        if ((i17 & 2) != 0) {
            i13 = getThreadRequest.reply_limit;
        }
        if ((i17 & 4) != 0) {
            i14 = getThreadRequest.participant_limit;
        }
        if ((i17 & 8) != 0) {
            i15 = getThreadRequest.member_limit;
        }
        if ((i17 & 16) != 0) {
            i16 = getThreadRequest.limit;
        }
        if ((i17 & 32) != 0) {
            str = getThreadRequest.next;
        }
        int i18 = i16;
        String str2 = str;
        return getThreadRequest.copy(z4, i13, i14, i15, i18, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getWatch() {
        return this.watch;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getReply_limit() {
        return this.reply_limit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getParticipant_limit() {
        return this.participant_limit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMember_limit() {
        return this.member_limit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    public final GetThreadRequest copy(boolean watch, int reply_limit, int participant_limit, int member_limit, int limit, String next) {
        return new GetThreadRequest(watch, reply_limit, participant_limit, member_limit, limit, next);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetThreadRequest)) {
            return false;
        }
        GetThreadRequest getThreadRequest = (GetThreadRequest) other;
        return this.watch == getThreadRequest.watch && this.reply_limit == getThreadRequest.reply_limit && this.participant_limit == getThreadRequest.participant_limit && this.member_limit == getThreadRequest.member_limit && this.limit == getThreadRequest.limit && AbstractC22676k.m65745e(this.next, getThreadRequest.next);
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getMember_limit() {
        return this.member_limit;
    }

    public final String getNext() {
        return this.next;
    }

    public final int getParticipant_limit() {
        return this.participant_limit;
    }

    public final int getReply_limit() {
        return this.reply_limit;
    }

    public final boolean getWatch() {
        return this.watch;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.limit, AbstractC11266d.m30448b(this.member_limit, AbstractC11266d.m30448b(this.participant_limit, AbstractC11266d.m30448b(this.reply_limit, Boolean.hashCode(this.watch) * 31, 31), 31), 31), 31);
        String str = this.next;
        return iM30448b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z4 = this.watch;
        int i13 = this.reply_limit;
        int i14 = this.participant_limit;
        int i15 = this.member_limit;
        int i16 = this.limit;
        String str = this.next;
        StringBuilder sb4 = new StringBuilder("GetThreadRequest(watch=");
        sb4.append(z4);
        sb4.append(", reply_limit=");
        sb4.append(i13);
        sb4.append(", participant_limit=");
        AbstractC30802r.m94773v(sb4, i14, ", member_limit=", i15, ", limit=");
        return AbstractC38963t7.m124376f(i16, ", next=", str, ")", sb4);
    }

    public GetThreadRequest(boolean z4, int i13, int i14, int i15, int i16, String str) {
        this.watch = z4;
        this.reply_limit = i13;
        this.participant_limit = i14;
        this.member_limit = i15;
        this.limit = i16;
        this.next = str;
    }

    public /* synthetic */ GetThreadRequest(boolean z4, int i13, int i14, int i15, int i16, String str, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? true : z4, (i17 & 2) != 0 ? 2 : i13, (i17 & 4) != 0 ? 100 : i14, (i17 & 8) != 0 ? 100 : i15, (i17 & 16) != 0 ? 10 : i16, (i17 & 32) != 0 ? null : str);
    }
}
