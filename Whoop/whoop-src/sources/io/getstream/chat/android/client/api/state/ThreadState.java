package io.getstream.chat.android.client.api.state;

import ec3.InterfaceC13037f2;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\nR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\nR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api/state/ThreadState;", "", "", "getParentId", "()Ljava/lang/String;", "parentId", "Lec3/f2;", "", "Lio/getstream/chat/android/models/Message;", "getMessages", "()Lec3/f2;", "messages", "", "getLoading", "loading", "getEndOfOlderMessages", "endOfOlderMessages", "getEndOfNewerMessages", "endOfNewerMessages", "getOldestInThread", "oldestInThread", "getNewestInThread", "newestInThread", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ThreadState {
    InterfaceC13037f2 getEndOfNewerMessages();

    InterfaceC13037f2 getEndOfOlderMessages();

    InterfaceC13037f2 getLoading();

    InterfaceC13037f2 getMessages();

    InterfaceC13037f2 getNewestInThread();

    InterfaceC13037f2 getOldestInThread();

    String getParentId();
}
