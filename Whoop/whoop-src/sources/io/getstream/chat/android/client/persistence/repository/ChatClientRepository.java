package io.getstream.chat.android.client.persistence.repository;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.persistence.p225db.ChatClientDatabase;
import io.getstream.chat.android.client.receipts.MessageReceipt;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096A¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096A¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0013\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0096A¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0005H\u0096A¢\u0006\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;", "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;", "messageReceiptRepository", "<init>", "(Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;)V", "Ll83/a0;", "clear", "(Lq83/d;)Ljava/lang/Object;", "", "Lio/getstream/chat/android/client/receipts/MessageReceipt;", "receipts", "upsertMessageReceipts", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", MapboxMap.QFE_LIMIT, "selectMessageReceipts", "(ILq83/d;)Ljava/lang/Object;", "", "messageIds", "deleteMessageReceiptsByMessageIds", "clearMessageReceipts", "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatClientRepository implements MessageReceiptRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final MessageReceiptRepository messageReceiptRepository;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository$Companion;", "", "<init>", "()V", "from", "Lio/getstream/chat/android/client/persistence/repository/ChatClientRepository;", "database", "Lio/getstream/chat/android/client/persistence/db/ChatClientDatabase;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ChatClientRepository from(ChatClientDatabase database) {
            AbstractC22676k.m65750j(database, "database");
            return new ChatClientRepository(MessageReceiptRepository.INSTANCE.invoke(database));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ChatClientRepository(MessageReceiptRepository messageReceiptRepository) {
        AbstractC22676k.m65750j(messageReceiptRepository, "messageReceiptRepository");
        this.messageReceiptRepository = messageReceiptRepository;
    }

    public final Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objClearMessageReceipts = this.messageReceiptRepository.clearMessageReceipts(interfaceC30057d);
        return objClearMessageReceipts == EnumC31071a.f128113w ? objClearMessageReceipts : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistence.repository.MessageReceiptRepository
    public final Object clearMessageReceipts(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.messageReceiptRepository.clearMessageReceipts(interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistence.repository.MessageReceiptRepository
    public final Object deleteMessageReceiptsByMessageIds(List<String> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.messageReceiptRepository.deleteMessageReceiptsByMessageIds(list, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistence.repository.MessageReceiptRepository
    public final Object selectMessageReceipts(int i13, InterfaceC30057d<? super List<MessageReceipt>> interfaceC30057d) {
        return this.messageReceiptRepository.selectMessageReceipts(i13, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistence.repository.MessageReceiptRepository
    public final Object upsertMessageReceipts(List<MessageReceipt> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.messageReceiptRepository.upsertMessageReceipts(list, interfaceC30057d);
    }
}
