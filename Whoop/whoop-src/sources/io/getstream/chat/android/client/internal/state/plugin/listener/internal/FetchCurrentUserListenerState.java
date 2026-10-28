package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import ec3.C13045h2;
import io.getstream.chat.android.client.internal.state.event.handler.internal.model.SelfUserFull;
import io.getstream.chat.android.client.internal.state.event.handler.internal.utils.SelfUserUtilsKt;
import io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState;
import io.getstream.chat.android.client.plugin.listeners.FetchCurrentUserListener;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.User;
import l83.C23454a0;
import l83.InterfaceC23462h;
import n23.AbstractC26205h;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/FetchCurrentUserListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "globalMutableState", "<init>", "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V", "Ln23/h;", "Lio/getstream/chat/android/models/User;", "result", "Ll83/a0;", "onFetchCurrentUserResult", "(Ln23/h;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FetchCurrentUserListenerState implements FetchCurrentUserListener {
    private final ClientState clientState;
    private final MutableGlobalState globalMutableState;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    public FetchCurrentUserListenerState(ClientState clientState, MutableGlobalState globalMutableState) {
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(globalMutableState, "globalMutableState");
        this.clientState = clientState;
        this.globalMutableState = globalMutableState;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:FetchCurUserLST");
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.FetchCurrentUserListener
    public final Object onFetchCurrentUserResult(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (abstractC26205h instanceof C26204g) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[onFetchCurrentUserResult] result: " + abstractC26205h, null);
            }
            SelfUserUtilsKt.updateCurrentUser(this.globalMutableState, (User) ((C13045h2) this.clientState.getUser()).getValue(), new SelfUserFull((User) abstractC26205h.m77817c()));
        }
        return C23454a0.f92919a;
    }
}
