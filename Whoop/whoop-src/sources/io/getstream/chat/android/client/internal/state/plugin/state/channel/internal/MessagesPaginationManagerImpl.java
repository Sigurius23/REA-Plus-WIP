package io.getstream.chat.android.client.internal.state.plugin.state.channel.internal;

import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import java.util.List;
import m83.AbstractC25265s;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0003R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManagerImpl;", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;", "<init>", "()V", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "query", "Ll83/a0;", "begin", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V", "Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "result", "end", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Ln23/h;)V", "Lio/getstream/chat/android/models/Message;", "message", "setOldestMessage", "(Lio/getstream/chat/android/models/Message;)V", "setNewestMessage", "", "hasLoadedAll", "setEndOfOlderMessages", "(Z)V", "setEndOfNewerMessages", "reset", "Lec3/p1;", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationState;", "_state", "Lec3/p1;", "Lec3/f2;", "getState", "()Lec3/f2;", "state", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessagesPaginationManagerImpl implements MessagesPaginationManager {
    private final InterfaceC13075p1 _state = AbstractC13091v.m36593c(new MessagesPaginationState(null, null, false, false, false, false, false, 127, null));

    @Override // io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.MessagesPaginationManager
    public final void begin(QueryChannelRequest query) {
        MessagesPaginationState messagesPaginationStateCopy$default;
        C13045h2 c13045h2;
        Object value;
        AbstractC22676k.m65750j(query, "query");
        MessagesPaginationState messagesPaginationState = (MessagesPaginationState) ((C13045h2) this._state).getValue();
        if (query.filteringOlderMessages()) {
            messagesPaginationStateCopy$default = MessagesPaginationState.copy$default(messagesPaginationState, null, null, false, false, false, true, false, 95, null);
        } else if (query.isFilteringNewerMessages()) {
            messagesPaginationStateCopy$default = MessagesPaginationState.copy$default(messagesPaginationState, null, null, false, false, true, false, false, 111, null);
        } else {
            messagesPaginationStateCopy$default = query.isFilteringAroundIdMessages() ? MessagesPaginationState.copy$default(messagesPaginationState, null, null, false, false, false, false, true, 59, null) : new MessagesPaginationState(null, null, false, false, false, false, false, 127, null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, messagesPaginationStateCopy$default));
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.MessagesPaginationManager
    public final void end(QueryChannelRequest query, AbstractC26205h result) {
        MessagesPaginationState messagesPaginationStateCopy$default;
        C13045h2 c13045h2;
        Object value;
        C13045h2 c13045h3;
        Object value2;
        AbstractC22676k.m65750j(query, "query");
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof C26203f) {
            InterfaceC13075p1 interfaceC13075p1 = this._state;
            do {
                c13045h3 = (C13045h2) interfaceC13075p1;
                value2 = c13045h3.getValue();
            } while (!c13045h3.m36569i(value2, MessagesPaginationState.copy$default((MessagesPaginationState) value2, null, null, false, false, false, false, false, 15, null)));
            return;
        }
        MessagesPaginationState messagesPaginationState = (MessagesPaginationState) ((C13045h2) this._state).getValue();
        List<Message> messages = ((Channel) ((C26204g) result).f103919a).getMessages();
        Message message = (Message) AbstractC25265s.m74100H0(messages);
        Message message2 = (Message) AbstractC25265s.m74114R0(messages);
        if (query.filteringOlderMessages()) {
            messagesPaginationStateCopy$default = MessagesPaginationState.copy$default(messagesPaginationState, message, null, false, messages.size() < query.messagesLimit(), false, false, false, 6, null);
        } else if (query.isFilteringNewerMessages()) {
            boolean z4 = messages.size() < query.messagesLimit();
            if (z4) {
                message2 = null;
            }
            messagesPaginationStateCopy$default = MessagesPaginationState.copy$default(messagesPaginationState, null, message2, z4, false, false, false, false, 9, null);
        } else if (query.isFilteringAroundIdMessages()) {
            messagesPaginationState.getClass();
            messagesPaginationStateCopy$default = new MessagesPaginationState(message, message2, false, false, false, false, false);
        } else {
            messagesPaginationStateCopy$default = MessagesPaginationState.copy$default(messagesPaginationState, message, null, true, messages.size() < query.messagesLimit(), false, false, false, 112, null);
        }
        InterfaceC13075p1 interfaceC13075p2 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p2;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, messagesPaginationStateCopy$default));
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.MessagesPaginationManager
    public final InterfaceC13037f2 getState() {
        return AbstractC13091v.m36598h(this._state);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.MessagesPaginationManager
    public final void reset() {
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        MessagesPaginationState messagesPaginationState = new MessagesPaginationState(null, null, false, false, false, false, false, 127, null);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, messagesPaginationState);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.MessagesPaginationManager
    public final void setEndOfNewerMessages(boolean hasLoadedAll) {
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        while (true) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Object value = c13045h2.getValue();
            MessagesPaginationState messagesPaginationState = (MessagesPaginationState) value;
            boolean z4 = hasLoadedAll;
            if (c13045h2.m36569i(value, MessagesPaginationState.copy$default(messagesPaginationState, null, hasLoadedAll ? null : messagesPaginationState.getNewestMessage(), z4, false, false, false, false, 121, null))) {
                return;
            } else {
                hasLoadedAll = z4;
            }
        }
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.MessagesPaginationManager
    public final void setEndOfOlderMessages(boolean hasLoadedAll) {
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        while (true) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Object value = c13045h2.getValue();
            boolean z4 = hasLoadedAll;
            if (c13045h2.m36569i(value, MessagesPaginationState.copy$default((MessagesPaginationState) value, null, null, false, z4, false, false, false, 119, null))) {
                return;
            } else {
                hasLoadedAll = z4;
            }
        }
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.MessagesPaginationManager
    public final void setNewestMessage(Message message) {
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        while (true) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Object value = c13045h2.getValue();
            Message message2 = message;
            if (c13045h2.m36569i(value, MessagesPaginationState.copy$default((MessagesPaginationState) value, null, message2, false, false, false, false, false, 125, null))) {
                return;
            } else {
                message = message2;
            }
        }
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.MessagesPaginationManager
    public final void setOldestMessage(Message message) {
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        while (true) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Object value = c13045h2.getValue();
            Message message2 = message;
            if (c13045h2.m36569i(value, MessagesPaginationState.copy$default((MessagesPaginationState) value, message2, null, false, false, false, false, false, 126, null))) {
                return;
            } else {
                message = message2;
            }
        }
    }
}
