package io.getstream.chat.android.client.persistance.repository;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.SyncStatus;
import java.util.Date;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0017\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u001a\u0010\u0019J*\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b \u0010\u0006J\u0010\u0010!\u001a\u00020\u0004H¦@¢\u0006\u0004\b!\u0010\"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;", "", "Lio/getstream/chat/android/models/Reaction;", "reaction", "Ll83/a0;", "insertReaction", "(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;", "", "userId", "messageId", "Ljava/util/Date;", "deletedAt", "updateReactionsForMessageByDeletedDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "", "id", "selectReactionById", "(ILq83/d;)Ljava/lang/Object;", "", "ids", "selectReactionsByIds", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/SyncStatus;", "syncStatus", "selectReactionIdsBySyncStatus", "(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;", "selectReactionsBySyncStatus", "reactionType", "selectUserReactionToMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "selectUserReactionsToMessage", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "deleteReaction", "clear", "(Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ReactionRepository {
    Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteReaction(Reaction reaction, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertReaction(Reaction reaction, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object selectReactionById(int i13, InterfaceC30057d<? super Reaction> interfaceC30057d);

    Object selectReactionIdsBySyncStatus(SyncStatus syncStatus, InterfaceC30057d<? super List<Integer>> interfaceC30057d);

    Object selectReactionsByIds(List<Integer> list, InterfaceC30057d<? super List<Reaction>> interfaceC30057d);

    Object selectReactionsBySyncStatus(SyncStatus syncStatus, InterfaceC30057d<? super List<Reaction>> interfaceC30057d);

    Object selectUserReactionToMessage(String str, String str2, String str3, InterfaceC30057d<? super Reaction> interfaceC30057d);

    Object selectUserReactionsToMessage(String str, String str2, InterfaceC30057d<? super List<Reaction>> interfaceC30057d);

    Object updateReactionsForMessageByDeletedDate(String str, String str2, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
