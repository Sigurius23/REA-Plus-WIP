package io.getstream.chat.android.client.api.models;

import java.util.LinkedHashMap;
import java.util.Map;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H\u0000¢\u0006\u0002\b\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/GetThreadOptions;", "", "watch", "", "replyLimit", "", "participantLimit", "memberLimit", "<init>", "(ZIII)V", "getWatch", "()Z", "getReplyLimit", "()I", "getParticipantLimit", "getMemberLimit", "toMap", "", "", "toMap$stream_chat_android_client_release", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class GetThreadOptions {
    private final int memberLimit;
    private final int participantLimit;
    private final int replyLimit;
    private final boolean watch;

    public GetThreadOptions() {
        this(false, 0, 0, 0, 15, null);
    }

    public static GetThreadOptions copy$default(GetThreadOptions getThreadOptions, boolean z4, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            z4 = getThreadOptions.watch;
        }
        if ((i16 & 2) != 0) {
            i13 = getThreadOptions.replyLimit;
        }
        if ((i16 & 4) != 0) {
            i14 = getThreadOptions.participantLimit;
        }
        if ((i16 & 8) != 0) {
            i15 = getThreadOptions.memberLimit;
        }
        getThreadOptions.getClass();
        return new GetThreadOptions(z4, i13, i14, i15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getWatch() {
        return this.watch;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getReplyLimit() {
        return this.replyLimit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getParticipantLimit() {
        return this.participantLimit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMemberLimit() {
        return this.memberLimit;
    }

    public final GetThreadOptions copy(boolean watch, int replyLimit, int participantLimit, int memberLimit) {
        return new GetThreadOptions(watch, replyLimit, participantLimit, memberLimit);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetThreadOptions)) {
            return false;
        }
        GetThreadOptions getThreadOptions = (GetThreadOptions) other;
        return this.watch == getThreadOptions.watch && this.replyLimit == getThreadOptions.replyLimit && this.participantLimit == getThreadOptions.participantLimit && this.memberLimit == getThreadOptions.memberLimit;
    }

    public final int getMemberLimit() {
        return this.memberLimit;
    }

    public final int getParticipantLimit() {
        return this.participantLimit;
    }

    public final int getReplyLimit() {
        return this.replyLimit;
    }

    public final boolean getWatch() {
        return this.watch;
    }

    public final int hashCode() {
        return Integer.hashCode(this.memberLimit) + AbstractC11266d.m30448b(this.participantLimit, AbstractC11266d.m30448b(this.replyLimit, Boolean.hashCode(this.watch) * 31, 31), 31);
    }

    public final Map<String, String> toMap$stream_chat_android_client_release() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("watch", String.valueOf(this.watch));
        linkedHashMap.put("reply_limit", String.valueOf(this.replyLimit));
        linkedHashMap.put("participant_limit", String.valueOf(this.participantLimit));
        linkedHashMap.put("member_limit", String.valueOf(this.memberLimit));
        return linkedHashMap;
    }

    public final String toString() {
        boolean z4 = this.watch;
        int i13 = this.replyLimit;
        int i14 = this.participantLimit;
        int i15 = this.memberLimit;
        StringBuilder sb4 = new StringBuilder("GetThreadOptions(watch=");
        sb4.append(z4);
        sb4.append(", replyLimit=");
        sb4.append(i13);
        sb4.append(", participantLimit=");
        return AbstractC26725a.m79505i(sb4, i14, ", memberLimit=", i15, ")");
    }

    public GetThreadOptions(boolean z4) {
        this(z4, 0, 0, 0, 14, null);
    }

    public GetThreadOptions(boolean z4, int i13) {
        this(z4, i13, 0, 0, 12, null);
    }

    public GetThreadOptions(boolean z4, int i13, int i14) {
        this(z4, i13, i14, 0, 8, null);
    }

    public GetThreadOptions(boolean z4, int i13, int i14, int i15) {
        this.watch = z4;
        this.replyLimit = i13;
        this.participantLimit = i14;
        this.memberLimit = i15;
    }

    public /* synthetic */ GetThreadOptions(boolean z4, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? true : z4, (i16 & 2) != 0 ? 2 : i13, (i16 & 4) != 0 ? 100 : i14, (i16 & 8) != 0 ? 100 : i15);
    }
}
