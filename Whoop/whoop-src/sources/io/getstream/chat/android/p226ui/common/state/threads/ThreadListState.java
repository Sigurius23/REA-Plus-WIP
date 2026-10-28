package io.getstream.chat.android.p226ui.common.state.threads;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.models.Thread;
import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;", "", "threads", "", "Lio/getstream/chat/android/models/Thread;", "isLoading", "", "isLoadingMore", "unseenThreadsCount", "", "loadingError", "<init>", "(Ljava/util/List;ZZIZ)V", "getThreads", "()Ljava/util/List;", "()Z", "getUnseenThreadsCount", "()I", "getLoadingError", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ThreadListState {
    public static final int $stable = 8;
    private final boolean isLoading;
    private final boolean isLoadingMore;
    private final boolean loadingError;
    private final List<Thread> threads;
    private final int unseenThreadsCount;

    public ThreadListState(List<Thread> threads, boolean z4, boolean z13, int i13, boolean z14) {
        AbstractC22676k.m65750j(threads, "threads");
        this.threads = threads;
        this.isLoading = z4;
        this.isLoadingMore = z13;
        this.unseenThreadsCount = i13;
        this.loadingError = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThreadListState copy$default(ThreadListState threadListState, List list, boolean z4, boolean z13, int i13, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            list = threadListState.threads;
        }
        if ((i14 & 2) != 0) {
            z4 = threadListState.isLoading;
        }
        if ((i14 & 4) != 0) {
            z13 = threadListState.isLoadingMore;
        }
        if ((i14 & 8) != 0) {
            i13 = threadListState.unseenThreadsCount;
        }
        if ((i14 & 16) != 0) {
            z14 = threadListState.loadingError;
        }
        boolean z15 = z14;
        boolean z16 = z13;
        return threadListState.copy(list, z4, z16, i13, z15);
    }

    public final List<Thread> component1() {
        return this.threads;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUnseenThreadsCount() {
        return this.unseenThreadsCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getLoadingError() {
        return this.loadingError;
    }

    public final ThreadListState copy(List<Thread> threads, boolean isLoading, boolean isLoadingMore, int unseenThreadsCount, boolean loadingError) {
        AbstractC22676k.m65750j(threads, "threads");
        return new ThreadListState(threads, isLoading, isLoadingMore, unseenThreadsCount, loadingError);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreadListState)) {
            return false;
        }
        ThreadListState threadListState = (ThreadListState) other;
        return AbstractC22676k.m65745e(this.threads, threadListState.threads) && this.isLoading == threadListState.isLoading && this.isLoadingMore == threadListState.isLoadingMore && this.unseenThreadsCount == threadListState.unseenThreadsCount && this.loadingError == threadListState.loadingError;
    }

    public final boolean getLoadingError() {
        return this.loadingError;
    }

    public final List<Thread> getThreads() {
        return this.threads;
    }

    public final int getUnseenThreadsCount() {
        return this.unseenThreadsCount;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.loadingError) + AbstractC11266d.m30448b(this.unseenThreadsCount, AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.threads.hashCode() * 31, 31, this.isLoading), 31, this.isLoadingMore), 31);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public final String toString() {
        List<Thread> list = this.threads;
        boolean z4 = this.isLoading;
        boolean z13 = this.isLoadingMore;
        int i13 = this.unseenThreadsCount;
        boolean z14 = this.loadingError;
        StringBuilder sb4 = new StringBuilder("ThreadListState(threads=");
        sb4.append(list);
        sb4.append(", isLoading=");
        sb4.append(z4);
        sb4.append(", isLoadingMore=");
        AbstractC30802r.m94769r(i13, ", unseenThreadsCount=", ", loadingError=", sb4, z13);
        return AbstractC18489d0.m53372m(sb4, z14, ")");
    }

    public /* synthetic */ ThreadListState(List list, boolean z4, boolean z13, int i13, boolean z14, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z4, z13, i13, (i14 & 16) != 0 ? false : z14);
    }
}
