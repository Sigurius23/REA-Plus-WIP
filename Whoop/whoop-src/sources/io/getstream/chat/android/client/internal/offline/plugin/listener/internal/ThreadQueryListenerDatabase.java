package io.getstream.chat.android.client.internal.offline.plugin.listener.internal;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.client.persistance.repository.MessageRepository;
import io.getstream.chat.android.client.persistance.repository.UserRepository;
import io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener;
import io.getstream.chat.android.models.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import n23.AbstractC26205h;
import n23.C26204g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\u0015\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ<\u0010\u001d\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ>\u0010\u001f\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006#"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ThreadQueryListenerDatabase;", "Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "messageRepository", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "userRepository", "<init>", "(Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/UserRepository;)V", "Ln23/h;", "", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "onResult", "(Ln23/h;Lq83/d;)Ljava/lang/Object;", "", "parentId", "", MapboxMap.QFE_LIMIT, "onGetRepliesRequest", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "onGetRepliesResult", "(Ln23/h;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "firstId", "onGetRepliesMoreRequest", "(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "lastId", "onGetNewerRepliesRequest", "(Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "onGetRepliesMoreResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "onGetNewerRepliesResult", "(Ln23/h;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadQueryListenerDatabase implements ThreadQueryListener {
    private final MessageRepository messageRepository;
    private final UserRepository userRepository;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.ThreadQueryListenerDatabase$onResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.ThreadQueryListenerDatabase", m100430f = "ThreadQueryListenerDatabase.kt", m100431l = {76, 77}, m100432m = "onResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191281 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C191281(InterfaceC30057d<? super C191281> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ThreadQueryListenerDatabase.this.onResult(null, this);
        }
    }

    public ThreadQueryListenerDatabase(MessageRepository messageRepository, UserRepository userRepository) {
        AbstractC22676k.m65750j(messageRepository, "messageRepository");
        AbstractC22676k.m65750j(userRepository, "userRepository");
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object onResult(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C191281 c191281;
        List<Message> list;
        if (interfaceC30057d instanceof C191281) {
            c191281 = (C191281) interfaceC30057d;
            int i13 = c191281.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191281.label = i13 - Integer.MIN_VALUE;
            } else {
                c191281 = new C191281(interfaceC30057d);
            }
        } else {
            c191281 = new C191281(interfaceC30057d);
        }
        Object obj = c191281.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c191281.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (abstractC26205h instanceof C26204g) {
                list = (List) ((C26204g) abstractC26205h).f103919a;
                UserRepository userRepository = this.userRepository;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC25265s.m74141p0(arrayList, MessageKt.users((Message) it.next()));
                }
                c191281.L$0 = null;
                c191281.L$1 = list;
                c191281.label = 1;
                if (userRepository.insertUsers(arrayList, c191281) != enumC31071a) {
                }
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        list = (List) c191281.L$1;
        AbstractC34132o.m107864I(obj);
        MessageRepository messageRepository = this.messageRepository;
        c191281.L$0 = null;
        c191281.L$1 = null;
        c191281.label = 2;
        return messageRepository.insertMessages(list, c191281) == enumC31071a ? enumC31071a : c23454a0;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetNewerRepliesRequest(String str, int i13, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetNewerRepliesResult(AbstractC26205h abstractC26205h, String str, int i13, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objOnResult = onResult(abstractC26205h, interfaceC30057d);
        return objOnResult == EnumC31071a.f128113w ? objOnResult : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesMoreRequest(String str, String str2, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesMoreResult(AbstractC26205h abstractC26205h, String str, String str2, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objOnResult = onResult(abstractC26205h, interfaceC30057d);
        return objOnResult == EnumC31071a.f128113w ? objOnResult : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesRequest(String str, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesResult(AbstractC26205h abstractC26205h, String str, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objOnResult = onResult(abstractC26205h, interfaceC30057d);
        return objOnResult == EnumC31071a.f128113w ? objOnResult : C23454a0.f92919a;
    }
}
