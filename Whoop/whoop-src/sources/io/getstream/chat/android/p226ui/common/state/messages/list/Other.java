package io.getstream.chat.android.p226ui.common.state.messages.list;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/Other;", "Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;", "ts", "", "<init>", "(Ljava/lang/Long;)V", "getTs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lio/getstream/chat/android/ui/common/state/messages/list/Other;", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class Other extends NewMessageState {
    public static final int $stable = 0;
    private final Long ts;

    public Other(Long l7) {
        this.ts = l7;
    }

    public static Other copy$default(Other other, Long l7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            l7 = other.ts;
        }
        other.getClass();
        return new Other(l7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTs() {
        return this.ts;
    }

    public final Other copy(Long ts3) {
        return new Other(ts3);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Other) && AbstractC22676k.m65745e(this.ts, ((Other) other).ts);
    }

    public final Long getTs() {
        return this.ts;
    }

    public final int hashCode() {
        Long l7 = this.ts;
        if (l7 == null) {
            return 0;
        }
        return l7.hashCode();
    }

    public final String toString() {
        return "Other(ts=" + this.ts + ")";
    }
}
