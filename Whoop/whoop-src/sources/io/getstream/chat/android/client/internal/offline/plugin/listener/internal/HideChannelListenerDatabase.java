package io.getstream.chat.android.client.internal.offline.plugin.listener.internal;

import io.getstream.chat.android.client.extensions.internal.PairKt;
import io.getstream.chat.android.client.persistance.repository.ChannelRepository;
import io.getstream.chat.android.client.persistance.repository.MessageRepository;
import io.getstream.chat.android.client.plugin.listeners.HideChannelListener;
import io.getstream.chat.android.client.utils.internal.ValidationKt;
import java.util.Date;
import l83.C23454a0;
import l83.C23465k;
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
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0010J6\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase;", "Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "channelRepository", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "messageRepository", "<init>", "(Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V", "", "channelType", "channelId", "", "clearHistory", "Ln23/h;", "Ll83/a0;", "onHideChannelPrecondition", "(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "onHideChannelRequest", "result", "onHideChannelResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class HideChannelListenerDatabase implements HideChannelListener {
    private final ChannelRepository channelRepository;
    private final MessageRepository messageRepository;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.listener.internal.HideChannelListenerDatabase$onHideChannelResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.plugin.listener.internal.HideChannelListenerDatabase", m100430f = "HideChannelListenerDatabase.kt", m100431l = {84, 85, 87}, m100432m = "onHideChannelResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191171 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C191171(InterfaceC30057d<? super C191171> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HideChannelListenerDatabase.this.onHideChannelResult(null, null, null, false, this);
        }
    }

    public HideChannelListenerDatabase(ChannelRepository channelRepository, MessageRepository messageRepository) {
        AbstractC22676k.m65750j(channelRepository, "channelRepository");
        AbstractC22676k.m65750j(messageRepository, "messageRepository");
        this.channelRepository = channelRepository;
        this.messageRepository = messageRepository;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.HideChannelListener
    public final Object onHideChannelPrecondition(String str, String str2, boolean z4, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return ValidationKt.validateCidWithResult(PairKt.toCid(new C23465k(str, str2))).m77818d();
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.HideChannelListener
    public final Object onHideChannelRequest(String str, String str2, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.plugin.listeners.HideChannelListener
    public final Object onHideChannelResult(AbstractC26205h abstractC26205h, String str, String str2, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C191171 c191171;
        String cid;
        Date date;
        if (interfaceC30057d instanceof C191171) {
            c191171 = (C191171) interfaceC30057d;
            int i13 = c191171.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191171.label = i13 - Integer.MIN_VALUE;
            } else {
                c191171 = new C191171(interfaceC30057d);
            }
        } else {
            c191171 = new C191171(interfaceC30057d);
        }
        Object obj = c191171.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c191171.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (abstractC26205h instanceof C26204g) {
                cid = PairKt.toCid(new C23465k(str, str2));
                if (z4) {
                    date = new Date();
                    ChannelRepository channelRepository = this.channelRepository;
                    c191171.L$0 = null;
                    c191171.L$1 = null;
                    c191171.L$2 = null;
                    c191171.L$3 = cid;
                    c191171.L$4 = date;
                    c191171.Z$0 = z4;
                    c191171.label = 1;
                    if (channelRepository.setHiddenForChannel(cid, true, date, c191171) != enumC31071a) {
                    }
                } else {
                    ChannelRepository channelRepository2 = this.channelRepository;
                    c191171.L$0 = null;
                    c191171.L$1 = null;
                    c191171.L$2 = null;
                    c191171.L$3 = null;
                    c191171.Z$0 = z4;
                    c191171.label = 3;
                    if (channelRepository2.setHiddenForChannel(cid, true, c191171) == enumC31071a) {
                    }
                }
            }
        }
        if (i14 != 1) {
            if (i14 == 2) {
            } else if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        z4 = c191171.Z$0;
        date = (Date) c191171.L$4;
        cid = (String) c191171.L$3;
        AbstractC34132o.m107864I(obj);
        MessageRepository messageRepository = this.messageRepository;
        c191171.L$0 = null;
        c191171.L$1 = null;
        c191171.L$2 = null;
        c191171.L$3 = null;
        c191171.L$4 = null;
        c191171.Z$0 = z4;
        c191171.label = 2;
        return messageRepository.deleteChannelMessagesBefore(cid, date, c191171) == enumC31071a ? enumC31071a : c23454a0;
    }
}
