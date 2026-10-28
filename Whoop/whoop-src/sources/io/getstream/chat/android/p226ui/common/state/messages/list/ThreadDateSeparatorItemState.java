package io.getstream.chat.android.p226ui.common.state.messages.list;

import com.mapbox.common.HttpHeaders;
import java.util.Date;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/ThreadDateSeparatorItemState;", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;", HttpHeaders.DATE, "Ljava/util/Date;", "replyCount", "", "<init>", "(Ljava/util/Date;I)V", "getDate", "()Ljava/util/Date;", "getReplyCount", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ThreadDateSeparatorItemState extends MessageListItemState {
    public static final int $stable = 8;
    private final Date date;
    private final int replyCount;

    public ThreadDateSeparatorItemState(Date date, int i13) {
        AbstractC22676k.m65750j(date, "date");
        this.date = date;
        this.replyCount = i13;
    }

    public static /* synthetic */ ThreadDateSeparatorItemState copy$default(ThreadDateSeparatorItemState threadDateSeparatorItemState, Date date, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            date = threadDateSeparatorItemState.date;
        }
        if ((i14 & 2) != 0) {
            i13 = threadDateSeparatorItemState.replyCount;
        }
        return threadDateSeparatorItemState.copy(date, i13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getReplyCount() {
        return this.replyCount;
    }

    public final ThreadDateSeparatorItemState copy(Date date, int replyCount) {
        AbstractC22676k.m65750j(date, "date");
        return new ThreadDateSeparatorItemState(date, replyCount);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreadDateSeparatorItemState)) {
            return false;
        }
        ThreadDateSeparatorItemState threadDateSeparatorItemState = (ThreadDateSeparatorItemState) other;
        return AbstractC22676k.m65745e(this.date, threadDateSeparatorItemState.date) && this.replyCount == threadDateSeparatorItemState.replyCount;
    }

    public final Date getDate() {
        return this.date;
    }

    public final int getReplyCount() {
        return this.replyCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.replyCount) + (this.date.hashCode() * 31);
    }

    public final String toString() {
        return "ThreadDateSeparatorItemState(date=" + this.date + ", replyCount=" + this.replyCount + ")";
    }
}
