package io.getstream.chat.android.client.internal.state.sync.internal;

import ec3.InterfaceC13058l;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/sync/internal/SyncHistoryManager;", "", "Ll83/a0;", "start", "()V", "sync", "(Lq83/d;)Ljava/lang/Object;", "awaitSyncing", "stop", "Lec3/l;", "", "Lio/getstream/chat/android/client/events/ChatEvent;", "getSyncedEvents", "()Lec3/l;", "syncedEvents", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface SyncHistoryManager {
    Object awaitSyncing(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    InterfaceC13058l getSyncedEvents();

    void start();

    void stop();

    Object sync(InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
