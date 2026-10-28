package io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal;

import java.util.Collection;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\b\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;", "thread", "Ll83/a0;", "insertThread", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;Lq83/d;)Ljava/lang/Object;", "", "threads", "insertThreads", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "id", "selectThread", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "ids", "selectThreads", "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;", "cid", "deleteThreads", "deleteAll", "(Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ThreadDao {
    Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteThreads(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertThread(ThreadEntity threadEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertThreads(List<ThreadEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object selectThread(String str, InterfaceC30057d<? super ThreadEntity> interfaceC30057d);

    Object selectThreads(Collection<String> collection, InterfaceC30057d<? super List<ThreadEntity>> interfaceC30057d);
}
