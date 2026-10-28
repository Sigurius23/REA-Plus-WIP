package io.getstream.chat.android.client.persistance.repository.noop;

import io.getstream.chat.android.client.persistance.repository.ThreadsRepository;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Thread;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006H\u0096@¢\u0006\u0004\b\u0016\u0010\u0010J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0017\u0010\fJ$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0096@¢\u0006\u0004\b\u0019\u0010\u0010J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u001b\u0010\fJ\u0010\u0010\u001c\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/noop/NoOpThreadsRepository;", "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;", "<init>", "()V", "", "id", "", "order", "Ll83/a0;", "insertThreadOrder", "(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "selectThreadOrder", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Thread;", "threads", "insertThreads", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Message;", "message", "upsertMessageInThread", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "messages", "upsertMessagesInThread", "selectThread", "ids", "selectThreads", "cid", "deleteChannelThreads", "clear", "(Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NoOpThreadsRepository implements ThreadsRepository {
    public static final NoOpThreadsRepository INSTANCE = new NoOpThreadsRepository();

    private NoOpThreadsRepository() {
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object deleteChannelThreads(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object insertThreadOrder(String str, List<String> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object insertThreads(List<Thread> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object selectThread(String str, InterfaceC30057d<? super Thread> interfaceC30057d) {
        return null;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object selectThreadOrder(String str, InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object selectThreads(List<String> list, InterfaceC30057d<? super List<Thread>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object upsertMessageInThread(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object upsertMessagesInThread(List<Message> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }
}
