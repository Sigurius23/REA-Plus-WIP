package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState;
import io.getstream.chat.android.client.plugin.listeners.BlockUserListener;
import io.getstream.chat.android.models.UserBlock;
import java.util.List;
import m83.AbstractC25265s;
import n23.AbstractC26205h;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/BlockUserListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/BlockUserListener;", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "globalState", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V", "Ln23/h;", "Lio/getstream/chat/android/models/UserBlock;", "result", "Ll83/a0;", "onBlockUserResult", "(Ln23/h;)V", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class BlockUserListenerState implements BlockUserListener {
    private final MutableGlobalState globalState;

    public BlockUserListenerState(MutableGlobalState globalState) {
        AbstractC22676k.m65750j(globalState, "globalState");
        this.globalState = globalState;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.BlockUserListener
    public final void onBlockUserResult(AbstractC26205h result) {
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof C26204g) {
            String userId = ((UserBlock) ((C26204g) result).f103919a).getUserId();
            List list = (List) this.globalState.getBlockedUserIds().getValue();
            if (list.contains(userId)) {
                return;
            }
            this.globalState.setBlockedUserIds(AbstractC25265s.m74128f1(userId, list));
        }
    }
}
