package io.getstream.chat.android.client.persistance.repository.noop;

import io.getstream.chat.android.client.persistance.repository.ReactionRepository;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.SyncStatus;
import java.util.Date;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0016\u0010\bJ\u0010\u0010\u0017\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b!\u0010\"J&\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/noop/NoOpReactionRepository;", "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;", "<init>", "()V", "Lio/getstream/chat/android/models/Reaction;", "reaction", "Ll83/a0;", "insertReaction", "(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;", "", "id", "selectReactionById", "(ILq83/d;)Ljava/lang/Object;", "", "ids", "selectReactionsByIds", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/SyncStatus;", "syncStatus", "selectReactionIdsBySyncStatus", "(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;", "selectReactionsBySyncStatus", "deleteReaction", "clear", "(Lq83/d;)Ljava/lang/Object;", "", "userId", "messageId", "Ljava/util/Date;", "deletedAt", "updateReactionsForMessageByDeletedDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "reactionType", "selectUserReactionToMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "selectUserReactionsToMessage", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NoOpReactionRepository implements ReactionRepository {
    public static final NoOpReactionRepository INSTANCE = new NoOpReactionRepository();

    private NoOpReactionRepository() {
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object deleteReaction(Reaction reaction, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object insertReaction(Reaction reaction, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object selectReactionById(int i13, InterfaceC30057d<? super Reaction> interfaceC30057d) {
        return null;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object selectReactionIdsBySyncStatus(SyncStatus syncStatus, InterfaceC30057d<? super List<Integer>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object selectReactionsByIds(List<Integer> list, InterfaceC30057d<? super List<Reaction>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object selectReactionsBySyncStatus(SyncStatus syncStatus, InterfaceC30057d<? super List<Reaction>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object selectUserReactionToMessage(String str, String str2, String str3, InterfaceC30057d<? super Reaction> interfaceC30057d) {
        return null;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object selectUserReactionsToMessage(String str, String str2, InterfaceC30057d<? super List<Reaction>> interfaceC30057d) {
        return C25271y.f99162w;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object updateReactionsForMessageByDeletedDate(String str, String str2, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }
}
