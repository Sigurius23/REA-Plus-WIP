package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal.ThreadLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.persistance.repository.MessageRepository;
import io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener;
import io.getstream.chat.android.models.Message;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u0019\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0096@¢\u0006\u0004\b\u001f\u0010 J<\u0010!\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b!\u0010\"J>\u0010#\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0096@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/ThreadQueryListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "messageRepository", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;", "threadLogic", "Ln23/h;", "", "Lio/getstream/chat/android/models/Message;", "result", "", MapboxMap.QFE_LIMIT, "Ll83/a0;", "onResult", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;Ln23/h;I)V", "", "parentId", "onGetRepliesPrecondition", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "onGetRepliesRequest", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "onGetRepliesResult", "(Ln23/h;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "firstId", "onGetRepliesMoreRequest", "(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "lastId", "onGetNewerRepliesRequest", "(Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "onGetRepliesMoreResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "onGetNewerRepliesResult", "(Ln23/h;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadQueryListenerState implements ThreadQueryListener {

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final LogicRegistry logic;
    private final MessageRepository messageRepository;

    public ThreadQueryListenerState(LogicRegistry logic, MessageRepository messageRepository) {
        AbstractC22676k.m65750j(logic, "logic");
        AbstractC22676k.m65750j(messageRepository, "messageRepository");
        this.logic = logic;
        this.messageRepository = messageRepository;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:ThreadQueryListener");
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void onResult(ThreadLogic threadLogic, AbstractC26205h result, int limit) {
        if (result instanceof C26204g) {
            List<Message> list = (List) ((C26204g) result).f103919a;
            threadLogic.updateOldestMessageInThread$stream_chat_android_client_release(list);
            threadLogic.setEndOfOlderMessages$stream_chat_android_client_release(list.size() < limit);
            threadLogic.upsertMessages$stream_chat_android_client_release(list);
        }
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetNewerRepliesRequest(String str, int i13, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.logic.thread(str).setLoading$stream_chat_android_client_release(true);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetNewerRepliesResult(AbstractC26205h abstractC26205h, String str, int i13, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ThreadLogic threadLogicThread = this.logic.thread(str);
        if (abstractC26205h instanceof C26204g) {
            List<Message> list = (List) ((C26204g) abstractC26205h).f103919a;
            threadLogicThread.updateNewestMessageInThread$stream_chat_android_client_release(list);
            threadLogicThread.setEndOfNewerMessages$stream_chat_android_client_release(list.size() < i13);
            threadLogicThread.upsertMessages$stream_chat_android_client_release(list);
        } else if (!(abstractC26205h instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        threadLogicThread.setLoading$stream_chat_android_client_release(false);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesMoreRequest(String str, String str2, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.logic.thread(str).setLoading$stream_chat_android_client_release(true);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesMoreResult(AbstractC26205h abstractC26205h, String str, String str2, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ThreadLogic threadLogicThread = this.logic.thread(str);
        threadLogicThread.setLoading$stream_chat_android_client_release(false);
        onResult(threadLogicThread, abstractC26205h, i13);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesPrecondition(String str, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        if (!this.logic.thread(str).isLoadingMessages()) {
            return new C26204g(C23454a0.f92919a);
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str2 = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            logger.f9274b.log(enumC2341g, str2, "already loading messages for this thread, ignoring the load requests.", null);
        }
        return new C26203f(new C26198a("already loading messages for this thread, ignoring the load requests."));
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesRequest(String str, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.logic.thread(str).setLoading$stream_chat_android_client_release(true);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesResult(AbstractC26205h abstractC26205h, String str, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ThreadLogic threadLogicThread = this.logic.thread(str);
        threadLogicThread.setLoading$stream_chat_android_client_release(false);
        onResult(threadLogicThread, abstractC26205h, i13);
        return C23454a0.f92919a;
    }
}
