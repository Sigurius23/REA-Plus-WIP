package io.getstream.chat.android.extensions;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageType;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m65681d2 = {"lastMessageAt", "Ljava/util/Date;", "", "Lio/getstream/chat/android/models/Message;", "skipLastMsgUpdateForSystemMsgs", "", "stream-chat-android-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessagesExtensionsKt {
    @InternalStreamChatApi
    public static final Date lastMessageAt(List<Message> list, boolean z4) {
        Object next;
        AbstractC22676k.m65750j(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((Message) obj).getShadowed()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            Message message = (Message) obj2;
            if (message.getParentId() == null || message.getShowInChannel()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (!AbstractC22676k.m65745e(((Message) obj3).getType(), MessageType.SYSTEM) || !z4) {
                arrayList3.add(obj3);
            }
        }
        Iterator it = arrayList3.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Message message2 = (Message) next;
                Date createdLocallyAt = message2.getCreatedLocallyAt();
                if (createdLocallyAt == null && (createdLocallyAt = message2.getCreatedAt()) == null) {
                    createdLocallyAt = new Date(0L);
                }
                do {
                    Object next2 = it.next();
                    Message message3 = (Message) next2;
                    Date createdLocallyAt2 = message3.getCreatedLocallyAt();
                    if (createdLocallyAt2 == null && (createdLocallyAt2 = message3.getCreatedAt()) == null) {
                        createdLocallyAt2 = new Date(0L);
                    }
                    if (createdLocallyAt.compareTo(createdLocallyAt2) < 0) {
                        next = next2;
                        createdLocallyAt = createdLocallyAt2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Message message4 = (Message) next;
        if (message4 == null) {
            return null;
        }
        Date createdLocallyAt3 = message4.getCreatedLocallyAt();
        return createdLocallyAt3 == null ? message4.getCreatedAt() : createdLocallyAt3;
    }
}
