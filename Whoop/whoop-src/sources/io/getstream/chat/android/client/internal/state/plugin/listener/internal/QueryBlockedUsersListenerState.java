package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState;
import io.getstream.chat.android.client.plugin.listeners.QueryBlockedUsersListener;
import io.getstream.chat.android.models.UserBlock;
import java.util.ArrayList;
import java.util.Iterator;
import m83.AbstractC25267u;
import n23.AbstractC26205h;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/QueryBlockedUsersListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/QueryBlockedUsersListener;", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "globalState", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V", "Ln23/h;", "", "Lio/getstream/chat/android/models/UserBlock;", "result", "Ll83/a0;", "onQueryBlockedUsersResult", "(Ln23/h;)V", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryBlockedUsersListenerState implements QueryBlockedUsersListener {
    private final MutableGlobalState globalState;

    public QueryBlockedUsersListenerState(MutableGlobalState globalState) {
        AbstractC22676k.m65750j(globalState, "globalState");
        this.globalState = globalState;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.QueryBlockedUsersListener
    public final void onQueryBlockedUsersResult(AbstractC26205h result) {
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof C26204g) {
            Iterable iterable = (Iterable) ((C26204g) result).f103919a;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((UserBlock) it.next()).getUserId());
            }
            this.globalState.setBlockedUserIds(arrayList);
        }
    }
}
