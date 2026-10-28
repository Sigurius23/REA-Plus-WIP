package io.getstream.chat.android.p226ui.common.state.pinned;

import io.getstream.chat.android.p226ui.common.model.MessageResult;
import java.util.Date;
import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;", "", "canLoadMore", "", "results", "", "Lio/getstream/chat/android/ui/common/model/MessageResult;", "isLoading", "nextDate", "Ljava/util/Date;", "<init>", "(ZLjava/util/List;ZLjava/util/Date;)V", "getCanLoadMore", "()Z", "getResults", "()Ljava/util/List;", "getNextDate", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PinnedMessageListState {
    public static final int $stable = 8;
    private final boolean canLoadMore;
    private final boolean isLoading;
    private final Date nextDate;
    private final List<MessageResult> results;

    public PinnedMessageListState() {
        this(false, null, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PinnedMessageListState copy$default(PinnedMessageListState pinnedMessageListState, boolean z4, List list, boolean z13, Date date, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = pinnedMessageListState.canLoadMore;
        }
        if ((i13 & 2) != 0) {
            list = pinnedMessageListState.results;
        }
        if ((i13 & 4) != 0) {
            z13 = pinnedMessageListState.isLoading;
        }
        if ((i13 & 8) != 0) {
            date = pinnedMessageListState.nextDate;
        }
        return pinnedMessageListState.copy(z4, list, z13, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCanLoadMore() {
        return this.canLoadMore;
    }

    public final List<MessageResult> component2() {
        return this.results;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getNextDate() {
        return this.nextDate;
    }

    public final PinnedMessageListState copy(boolean canLoadMore, List<MessageResult> results, boolean isLoading, Date nextDate) {
        AbstractC22676k.m65750j(results, "results");
        AbstractC22676k.m65750j(nextDate, "nextDate");
        return new PinnedMessageListState(canLoadMore, results, isLoading, nextDate);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinnedMessageListState)) {
            return false;
        }
        PinnedMessageListState pinnedMessageListState = (PinnedMessageListState) other;
        return this.canLoadMore == pinnedMessageListState.canLoadMore && AbstractC22676k.m65745e(this.results, pinnedMessageListState.results) && this.isLoading == pinnedMessageListState.isLoading && AbstractC22676k.m65745e(this.nextDate, pinnedMessageListState.nextDate);
    }

    public final boolean getCanLoadMore() {
        return this.canLoadMore;
    }

    public final Date getNextDate() {
        return this.nextDate;
    }

    public final List<MessageResult> getResults() {
        return this.results;
    }

    public final int hashCode() {
        return this.nextDate.hashCode() + AbstractC2875y.m8289b(AbstractC11895b.m31983b(Boolean.hashCode(this.canLoadMore) * 31, 31, this.results), 31, this.isLoading);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String toString() {
        return "PinnedMessageListState(canLoadMore=" + this.canLoadMore + ", results=" + this.results + ", isLoading=" + this.isLoading + ", nextDate=" + this.nextDate + ")";
    }

    public PinnedMessageListState(boolean z4, List<MessageResult> results, boolean z13, Date nextDate) {
        AbstractC22676k.m65750j(results, "results");
        AbstractC22676k.m65750j(nextDate, "nextDate");
        this.canLoadMore = z4;
        this.results = results;
        this.isLoading = z13;
        this.nextDate = nextDate;
    }

    public /* synthetic */ PinnedMessageListState(boolean z4, List list, boolean z13, Date date, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? true : z13, (i13 & 8) != 0 ? new Date() : date);
    }
}
