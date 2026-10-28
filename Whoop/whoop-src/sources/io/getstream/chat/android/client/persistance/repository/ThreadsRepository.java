package io.getstream.chat.android.client.persistance.repository;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Thread;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bg\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H¦@¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0015\u0010\nJ$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H¦@¢\u0006\u0004\b\u0017\u0010\u000eJ\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0019\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;", "", "", "id", "", "order", "Ll83/a0;", "insertThreadOrder", "(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "selectThreadOrder", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Thread;", "threads", "insertThreads", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Message;", "message", "upsertMessageInThread", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "messages", "upsertMessagesInThread", "selectThread", "ids", "selectThreads", "cid", "deleteChannelThreads", "clear", "(Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ThreadsRepository {
    Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteChannelThreads(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertThreadOrder(String str, List<String> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertThreads(List<Thread> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object selectThread(String str, InterfaceC30057d<? super Thread> interfaceC30057d);

    Object selectThreadOrder(String str, InterfaceC30057d<? super List<String>> interfaceC30057d);

    Object selectThreads(List<String> list, InterfaceC30057d<? super List<Thread>> interfaceC30057d);

    Object upsertMessageInThread(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object upsertMessagesInThread(List<Message> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
