package io.getstream.chat.android.client.persistance.repository;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.SyncStatus;
import java.util.Date;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\bg\u0018\u00002\u00020\u0001J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0017\u0010\u0011J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0019\u0010\u0011J\u001e\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H¦@¢\u0006\u0004\b\u001c\u0010\u0016J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\"\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H¦@¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b$\u0010\u0011J\u0018\u0010%\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0007H¦@¢\u0006\u0004\b%\u0010\u001fJ\u001e\u0010&\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H¦@¢\u0006\u0004\b&\u0010\u0016J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010(\u001a\u00020'H¦@¢\u0006\u0004\b)\u0010*J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010(\u001a\u00020'H¦@¢\u0006\u0004\b+\u0010*J\u0018\u0010-\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020,H¦@¢\u0006\u0004\b-\u0010.J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020,0\u0006H¦@¢\u0006\u0004\b/\u00100J\u001a\u00101\u001a\u0004\u0018\u00010,2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b1\u0010\u0011J\u001a\u00103\u001a\u0004\u0018\u00010,2\u0006\u00102\u001a\u00020\u0002H¦@¢\u0006\u0004\b3\u0010\u0011J\u0018\u00104\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020,H¦@¢\u0006\u0004\b4\u0010.J\u0010\u00105\u001a\u00020\u001bH¦@¢\u0006\u0004\b5\u00100J\u0018\u00106\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u0002H¦@¢\u0006\u0004\b6\u0010\u0011J\u0018\u00107\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0002H¦@¢\u0006\u0004\b7\u0010\u0011J\u0010\u00108\u001a\u00020\u001bH¦@¢\u0006\u0004\b8\u00100J\u001e\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b9\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006:À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "", "", "cid", "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;", "pagination", "", "Lio/getstream/chat/android/models/Message;", "selectMessagesForChannel", "(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;", "messageId", "", MapboxMap.QFE_LIMIT, "selectMessagesForThread", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "userId", "selectAllUserMessages", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "selectAllChannelUserMessages", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "messageIds", "selectMessages", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "selectMessage", "pollId", "selectMessagesWithPoll", "messages", "Ll83/a0;", "insertMessages", "message", "insertMessage", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "Ljava/util/Date;", "hideMessagesBefore", "deleteChannelMessagesBefore", "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "deleteChannelMessages", "deleteChannelMessage", "deleteMessages", "Lio/getstream/chat/android/models/SyncStatus;", "syncStatus", "selectMessageIdsBySyncState", "(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;", "selectMessageBySyncState", "Lio/getstream/chat/android/models/DraftMessage;", "insertDraftMessage", "(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;", "selectDraftMessages", "(Lq83/d;)Ljava/lang/Object;", "selectDraftMessagesByCid", "parentId", "selectDraftMessageByParentId", "deleteDraftMessage", "evictMessages", "evictMessage", "deletePoll", "clear", "selectLocalOnlyMessagesForChannel", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MessageRepository {
    Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteChannelMessage(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteChannelMessages(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteChannelMessagesBefore(String str, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteDraftMessage(DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteMessages(List<Message> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deletePoll(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object evictMessage(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object evictMessages(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertDraftMessage(DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertMessage(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertMessages(List<Message> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object selectAllChannelUserMessages(String str, String str2, InterfaceC30057d<? super List<Message>> interfaceC30057d);

    Object selectAllUserMessages(String str, InterfaceC30057d<? super List<Message>> interfaceC30057d);

    Object selectDraftMessageByParentId(String str, InterfaceC30057d<? super DraftMessage> interfaceC30057d);

    Object selectDraftMessages(InterfaceC30057d<? super List<DraftMessage>> interfaceC30057d);

    Object selectDraftMessagesByCid(String str, InterfaceC30057d<? super DraftMessage> interfaceC30057d);

    Object selectLocalOnlyMessagesForChannel(String str, InterfaceC30057d<? super List<Message>> interfaceC30057d);

    Object selectMessage(String str, InterfaceC30057d<? super Message> interfaceC30057d);

    Object selectMessageBySyncState(SyncStatus syncStatus, InterfaceC30057d<? super List<Message>> interfaceC30057d);

    Object selectMessageIdsBySyncState(SyncStatus syncStatus, InterfaceC30057d<? super List<String>> interfaceC30057d);

    Object selectMessages(List<String> list, InterfaceC30057d<? super List<Message>> interfaceC30057d);

    Object selectMessagesForChannel(String str, AnyChannelPaginationRequest anyChannelPaginationRequest, InterfaceC30057d<? super List<Message>> interfaceC30057d);

    Object selectMessagesForThread(String str, int i13, InterfaceC30057d<? super List<Message>> interfaceC30057d);

    Object selectMessagesWithPoll(String str, InterfaceC30057d<? super List<Message>> interfaceC30057d);
}
