package io.getstream.chat.android.p226ui.feature.threads.list.adapter;

import io.getstream.chat.android.models.Thread;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \b2\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;", "", "stableId", "", "getStableId", "()J", "ThreadItem", "LoadingMoreItem", "Companion", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$LoadingMoreItem;", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ThreadListItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$Companion;", "", "<init>", "()V", "LOADING_MORE_ITEM_STABLE_ID", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final long LOADING_MORE_ITEM_STABLE_ID = 1;

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$LoadingMoreItem;", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;", "<init>", "()V", "stableId", "", "getStableId", "()J", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class LoadingMoreItem implements ThreadListItem {
        public static final LoadingMoreItem INSTANCE = new LoadingMoreItem();

        private LoadingMoreItem() {
        }

        public final boolean equals(Object other) {
            return this == other || (other instanceof LoadingMoreItem);
        }

        @Override // io.getstream.chat.android.p226ui.feature.threads.list.adapter.ThreadListItem
        public final long getStableId() {
            return 1L;
        }

        public final int hashCode() {
            return -849924482;
        }

        public final String toString() {
            return "LoadingMoreItem";
        }
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem$ThreadItem;", "Lio/getstream/chat/android/ui/feature/threads/list/adapter/ThreadListItem;", "thread", "Lio/getstream/chat/android/models/Thread;", "<init>", "(Lio/getstream/chat/android/models/Thread;)V", "getThread", "()Lio/getstream/chat/android/models/Thread;", "stableId", "", "getStableId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class ThreadItem implements ThreadListItem {
        private final Thread thread;

        public ThreadItem(Thread thread) {
            AbstractC22676k.m65750j(thread, "thread");
            this.thread = thread;
        }

        public static /* synthetic */ ThreadItem copy$default(ThreadItem threadItem, Thread thread, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                thread = threadItem.thread;
            }
            return threadItem.copy(thread);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Thread getThread() {
            return this.thread;
        }

        public final ThreadItem copy(Thread thread) {
            AbstractC22676k.m65750j(thread, "thread");
            return new ThreadItem(thread);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ThreadItem) && AbstractC22676k.m65745e(this.thread, ((ThreadItem) other).thread);
        }

        @Override // io.getstream.chat.android.p226ui.feature.threads.list.adapter.ThreadListItem
        public final long getStableId() {
            return this.thread.getParentMessage().identifierHash();
        }

        public final Thread getThread() {
            return this.thread;
        }

        public final int hashCode() {
            return this.thread.hashCode();
        }

        public final String toString() {
            return "ThreadItem(thread=" + this.thread + ")";
        }
    }

    long getStableId();
}
