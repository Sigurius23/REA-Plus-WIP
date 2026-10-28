package io.getstream.chat.android.client.persistance.repository.noop;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.persistance.repository.MessageRepository;
import io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.SyncStatus;
import java.util.Date;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0096@¢\u0006\u0004\b\u000f\u0010\tJ\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0018\u0010\fJ\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0019\u0010\u0012J\u001e\u0010\u001a\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0096@¢\u0006\u0004\b\u001a\u0010\tJ\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001f\u0010\u001eJ\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010 \u001a\u00020\u0005H\u0096@¢\u0006\u0004\b!\u0010\fJ\u0018\u0010#\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\"H\u0096@¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u0004H\u0096@¢\u0006\u0004\b%\u0010&J\u001a\u0010'\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0013\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b'\u0010\fJ\u001a\u0010)\u001a\u0004\u0018\u00010\"2\u0006\u0010(\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b)\u0010\fJ\u0018\u0010*\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\"H\u0096@¢\u0006\u0004\b*\u0010$J\u0010\u0010+\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b+\u0010&J\u0018\u0010,\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b,\u0010\fJ\u0018\u0010-\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0005H\u0096@¢\u0006\u0004\b-\u0010\fJ\u0010\u0010.\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b.\u0010&J(\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0013\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010/H\u0096@¢\u0006\u0004\b1\u00102J&\u00105\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\n\u001a\u00020\u00052\u0006\u00104\u001a\u000203H\u0096@¢\u0006\u0004\b5\u00106J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u00107\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b8\u0010\fJ&\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b9\u0010:J\u001e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0013\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b;\u0010\f¨\u0006<"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/noop/NoOpMessageRepository;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "<init>", "()V", "", "", "messageIds", "Lio/getstream/chat/android/models/Message;", "selectMessages", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "messageId", "selectMessage", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "messages", "Ll83/a0;", "insertMessages", "message", "insertMessage", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "cid", "Ljava/util/Date;", "hideMessagesBefore", "deleteChannelMessagesBefore", "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "deleteChannelMessages", "deleteChannelMessage", "deleteMessages", "Lio/getstream/chat/android/models/SyncStatus;", "syncStatus", "selectMessageIdsBySyncState", "(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;", "selectMessageBySyncState", "pollId", "selectMessagesWithPoll", "Lio/getstream/chat/android/models/DraftMessage;", "deleteDraftMessage", "(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;", "selectDraftMessages", "(Lq83/d;)Ljava/lang/Object;", "selectDraftMessagesByCid", "parentId", "selectDraftMessageByParentId", "insertDraftMessage", "evictMessages", "evictMessage", "deletePoll", "clear", "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;", "pagination", "selectMessagesForChannel", "(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;", "", MapboxMap.QFE_LIMIT, "selectMessagesForThread", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "userId", "selectAllUserMessages", "selectAllChannelUserMessages", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "selectLocalOnlyMessagesForChannel", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NoOpMessageRepository implements MessageRepository {
    public static final NoOpMessageRepository INSTANCE = new NoOpMessageRepository();

    private NoOpMessageRepository() {
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deleteChannelMessage(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deleteChannelMessages(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deleteChannelMessagesBefore(String str, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deleteDraftMessage(DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deleteMessages(List<Message> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deletePoll(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object evictMessage(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object evictMessages(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object insertDraftMessage(DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object insertMessage(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object insertMessages(List<Message> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectAllChannelUserMessages(String str, String str2, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectAllUserMessages(String str, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectDraftMessageByParentId(String str, InterfaceC30057d<? super DraftMessage> interfaceC30057d) {
        return null;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectDraftMessages(InterfaceC30057d<? super List<DraftMessage>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectDraftMessagesByCid(String str, InterfaceC30057d<? super DraftMessage> interfaceC30057d) {
        return null;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectLocalOnlyMessagesForChannel(String str, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessage(String str, InterfaceC30057d<? super Message> interfaceC30057d) {
        return null;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessageBySyncState(SyncStatus syncStatus, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessageIdsBySyncState(SyncStatus syncStatus, InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessages(List<String> list, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessagesForChannel(String str, AnyChannelPaginationRequest anyChannelPaginationRequest, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessagesForThread(String str, int i13, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessagesWithPoll(String str, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return C25271y.f99162w;
    }
}
