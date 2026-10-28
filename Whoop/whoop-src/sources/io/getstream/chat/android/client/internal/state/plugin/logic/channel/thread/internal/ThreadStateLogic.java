package io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal;

import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.thread.internal.ThreadMutableState;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.SyncStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;", "", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;", "mutableState", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;)V", "Lio/getstream/chat/android/models/Message;", "currentMessage", "newMessage", "", "isMessageNewerThanCurrent", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z", "", "lastUpdateTime", "(Lio/getstream/chat/android/models/Message;)J", "lastLocalUpdateTime", "writeThreadState", "()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;", "message", "Ll83/a0;", "deleteMessage", "(Lio/getstream/chat/android/models/Message;)V", "upsertMessage", "", "messages", "upsertMessages", "(Ljava/util/List;)V", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadStateLogic {
    private final ThreadMutableState mutableState;

    public ThreadStateLogic(ThreadMutableState mutableState) {
        AbstractC22676k.m65750j(mutableState, "mutableState");
        this.mutableState = mutableState;
    }

    private final boolean isMessageNewerThanCurrent(Message currentMessage, Message newMessage) {
        if (newMessage.getSyncStatus() == SyncStatus.COMPLETED) {
            return (currentMessage != null ? lastUpdateTime(currentMessage) : MessageKt.getNEVER().getTime()) <= lastUpdateTime(newMessage);
        }
        return (currentMessage != null ? lastLocalUpdateTime(currentMessage) : MessageKt.getNEVER().getTime()) <= lastLocalUpdateTime(newMessage);
    }

    private final long lastLocalUpdateTime(Message message) {
        Long l7;
        Iterator it = AbstractC25260n.m74077r0(new Date[]{message.getCreatedLocallyAt(), message.getUpdatedLocallyAt(), message.getDeletedAt()}).iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((Date) it.next()).getTime());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((Date) it.next()).getTime());
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l7 = lValueOf;
        } else {
            l7 = null;
        }
        return l7 != null ? l7.longValue() : MessageKt.getNEVER().getTime();
    }

    private final long lastUpdateTime(Message message) {
        Long l7;
        Iterator it = AbstractC25260n.m74077r0(new Date[]{message.getCreatedAt(), message.getUpdatedAt(), message.getDeletedAt()}).iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((Date) it.next()).getTime());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((Date) it.next()).getTime());
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l7 = lValueOf;
        } else {
            l7 = null;
        }
        return l7 != null ? l7.longValue() : MessageKt.getNEVER().getTime();
    }

    public final void deleteMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        this.mutableState.deleteMessage(message);
    }

    public final void upsertMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        upsertMessages(AbstractC37056f.m118958J(message));
    }

    public final void upsertMessages(List<Message> messages) {
        AbstractC22676k.m65750j(messages, "messages");
        Map map = (Map) this.mutableState.getRawMessage().getValue();
        ThreadMutableState threadMutableState = this.mutableState;
        ArrayList arrayList = new ArrayList();
        for (Object obj : messages) {
            Message message = (Message) obj;
            if (isMessageNewerThanCurrent((Message) map.get(message.getId()), message)) {
                arrayList.add(obj);
            }
        }
        threadMutableState.upsertMessages(arrayList);
    }

    /* JADX INFO: renamed from: writeThreadState, reason: from getter */
    public final ThreadMutableState getMutableState() {
        return this.mutableState;
    }
}
