package io.getstream.chat.android.client.extensions.internal;

import io.getstream.chat.android.client.errors.ChatErrorKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a3\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"", "Lio/getstream/chat/android/models/Reaction;", "", "", "Lio/getstream/chat/android/models/User;", "userMap", "updateByUsers", "(Ljava/util/Collection;Ljava/util/Map;)Ljava/util/Collection;", "recentReactions", "cachedReactions", "mergeReactions", "(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;", "Ln23/h;", "result", "updateSyncStatus", "(Lio/getstream/chat/android/models/Reaction;Ln23/h;)Lio/getstream/chat/android/models/Reaction;", "Ln23/e;", "error", "updateFailedReactionSyncStatus", "(Lio/getstream/chat/android/models/Reaction;Ln23/e;)Lio/getstream/chat/android/models/Reaction;", "currentUser", "", "isOnline", "enforceUnique", "skipPush", "enrichWithDataBeforeSending", "(Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/User;ZZZ)Lio/getstream/chat/android/models/Reaction;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ReactionKt {
    @InternalStreamChatApi
    public static final Reaction enrichWithDataBeforeSending(Reaction reaction, User currentUser, boolean z4, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(reaction, "<this>");
        AbstractC22676k.m65750j(currentUser, "currentUser");
        return reaction.copy((16319 & 1) != 0 ? reaction.messageId : null, (16319 & 2) != 0 ? reaction.type : null, (16319 & 4) != 0 ? reaction.score : 0, (16319 & 8) != 0 ? reaction.user : currentUser, (16319 & 16) != 0 ? reaction.userId : currentUser.getId(), (16319 & 32) != 0 ? reaction.createdAt : null, (16319 & 64) != 0 ? reaction.createdLocallyAt : null, (16319 & 128) != 0 ? reaction.updatedAt : null, (16319 & 256) != 0 ? reaction.deletedAt : null, (16319 & 512) != 0 ? reaction.syncStatus : z4 ? SyncStatus.IN_PROGRESS : SyncStatus.SYNC_NEEDED, (16319 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? reaction.extraData : null, (16319 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? reaction.enforceUnique : z13, (16319 & 4096) != 0 ? reaction.skipPush : z14, (16319 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? reaction.emojiCode : null);
    }

    @InternalStreamChatApi
    public static final Collection<Reaction> mergeReactions(Collection<Reaction> recentReactions, Collection<Reaction> cachedReactions) {
        AbstractC22676k.m65750j(recentReactions, "recentReactions");
        AbstractC22676k.m65750j(cachedReactions, "cachedReactions");
        Collection<Reaction> collection = cachedReactions;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(collection, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : collection) {
            linkedHashMap.put(((Reaction) obj).getType(), obj);
        }
        Collection<Reaction> collection2 = recentReactions;
        int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(collection2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W2 >= 16 ? iM73988W2 : 16);
        for (Object obj2 : collection2) {
            linkedHashMap2.put(((Reaction) obj2).getType(), obj2);
        }
        return AbstractC25247g0.m73995d0(linkedHashMap, linkedHashMap2).values();
    }

    @InternalStreamChatApi
    public static final Collection<Reaction> updateByUsers(Collection<Reaction> collection, Map<String, User> userMap) {
        String userId;
        Collection<Reaction> arrayList = collection;
        AbstractC22676k.m65750j(arrayList, "<this>");
        AbstractC22676k.m65750j(userMap, "userMap");
        Collection<Reaction> collection2 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            User user = ((Reaction) it.next()).getUser();
            String id4 = user != null ? user.getId() : null;
            if (id4 != null) {
                arrayList2.add(id4);
            }
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (userMap.containsKey((String) it3.next())) {
                arrayList = new ArrayList<>(AbstractC25267u.m74163i0(collection2, 10));
                for (Reaction reactionCopy : collection2) {
                    User user2 = reactionCopy.getUser();
                    if (user2 == null || (userId = user2.getId()) == null) {
                        userId = reactionCopy.getUserId();
                    }
                    if (userMap.containsKey(userId)) {
                        User user3 = userMap.get(reactionCopy.getUserId());
                        if (user3 == null) {
                            user3 = reactionCopy.getUser();
                        }
                        reactionCopy = reactionCopy.copy((16319 & 1) != 0 ? reactionCopy.messageId : null, (16319 & 2) != 0 ? reactionCopy.type : null, (16319 & 4) != 0 ? reactionCopy.score : 0, (16319 & 8) != 0 ? reactionCopy.user : user3, (16319 & 16) != 0 ? reactionCopy.userId : null, (16319 & 32) != 0 ? reactionCopy.createdAt : null, (16319 & 64) != 0 ? reactionCopy.createdLocallyAt : null, (16319 & 128) != 0 ? reactionCopy.updatedAt : null, (16319 & 256) != 0 ? reactionCopy.deletedAt : null, (16319 & 512) != 0 ? reactionCopy.syncStatus : null, (16319 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? reactionCopy.extraData : null, (16319 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? reactionCopy.enforceUnique : false, (16319 & 4096) != 0 ? reactionCopy.skipPush : false, (16319 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? reactionCopy.emojiCode : null);
                    }
                    arrayList.add(reactionCopy);
                }
                break;
            }
        }
        return arrayList;
    }

    private static final Reaction updateFailedReactionSyncStatus(Reaction reaction, AbstractC26202e abstractC26202e) {
        return reaction.copy((16319 & 1) != 0 ? reaction.messageId : null, (16319 & 2) != 0 ? reaction.type : null, (16319 & 4) != 0 ? reaction.score : 0, (16319 & 8) != 0 ? reaction.user : null, (16319 & 16) != 0 ? reaction.userId : null, (16319 & 32) != 0 ? reaction.createdAt : null, (16319 & 64) != 0 ? reaction.createdLocallyAt : null, (16319 & 128) != 0 ? reaction.updatedAt : null, (16319 & 256) != 0 ? reaction.deletedAt : null, (16319 & 512) != 0 ? reaction.syncStatus : ChatErrorKt.isPermanent(abstractC26202e) ? SyncStatus.FAILED_PERMANENTLY : SyncStatus.SYNC_NEEDED, (16319 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? reaction.extraData : null, (16319 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? reaction.enforceUnique : false, (16319 & 4096) != 0 ? reaction.skipPush : false, (16319 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? reaction.emojiCode : null);
    }

    @InternalStreamChatApi
    public static final Reaction updateSyncStatus(Reaction reaction, AbstractC26205h result) {
        AbstractC22676k.m65750j(reaction, "<this>");
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof C26204g) {
            return reaction.copy((16319 & 1) != 0 ? reaction.messageId : null, (16319 & 2) != 0 ? reaction.type : null, (16319 & 4) != 0 ? reaction.score : 0, (16319 & 8) != 0 ? reaction.user : null, (16319 & 16) != 0 ? reaction.userId : null, (16319 & 32) != 0 ? reaction.createdAt : null, (16319 & 64) != 0 ? reaction.createdLocallyAt : null, (16319 & 128) != 0 ? reaction.updatedAt : null, (16319 & 256) != 0 ? reaction.deletedAt : null, (16319 & 512) != 0 ? reaction.syncStatus : SyncStatus.COMPLETED, (16319 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? reaction.extraData : null, (16319 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? reaction.enforceUnique : false, (16319 & 4096) != 0 ? reaction.skipPush : false, (16319 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? reaction.emojiCode : null);
        }
        if (result instanceof C26203f) {
            return updateFailedReactionSyncStatus(reaction, ((C26203f) result).f103918a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
