package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import io.getstream.chat.android.client.extensions.internal.PairKt;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.plugin.listeners.HideChannelListener;
import io.getstream.chat.android.client.utils.internal.ValidationKt;
import java.util.Date;
import l83.C23454a0;
import l83.C23465k;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eJ6\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/HideChannelListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V", "", "channelType", "channelId", "", "clearHistory", "Ln23/h;", "Ll83/a0;", "onHideChannelPrecondition", "(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "onHideChannelRequest", "result", "onHideChannelResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class HideChannelListenerState implements HideChannelListener {
    private final LogicRegistry logic;

    public HideChannelListenerState(LogicRegistry logic) {
        AbstractC22676k.m65750j(logic, "logic");
        this.logic = logic;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.HideChannelListener
    public final Object onHideChannelPrecondition(String str, String str2, boolean z4, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return ValidationKt.validateCidWithResult(PairKt.toCid(new C23465k(str, str2))).m77818d();
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.HideChannelListener
    public final Object onHideChannelRequest(String str, String str2, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.logic.channel(str, str2).setHidden(true);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.HideChannelListener
    public final Object onHideChannelResult(AbstractC26205h abstractC26205h, String str, String str2, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ChannelLogic channelLogicChannel = this.logic.channel(str, str2);
        if (abstractC26205h instanceof C26204g) {
            if (z4) {
                Date date = new Date();
                channelLogicChannel.hideMessagesBefore(date);
                channelLogicChannel.removeMessagesBefore(date);
            }
        } else {
            if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            channelLogicChannel.setHidden(false);
        }
        return C23454a0.f92919a;
    }
}
