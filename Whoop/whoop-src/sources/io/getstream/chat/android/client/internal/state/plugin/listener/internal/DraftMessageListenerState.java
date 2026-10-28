package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.errors.ChatErrorKt;
import io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState;
import io.getstream.chat.android.client.plugin.listeners.DraftMessageListener;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.DraftsSort;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.QueryDraftsResult;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.Iterator;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u000e\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0010\u0010\u000fJF\u0010\u001a\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DraftMessageListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "mutableGlobalState", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V", "Ln23/h;", "Lio/getstream/chat/android/models/DraftMessage;", "result", "", "channelType", "channelId", "message", "Ll83/a0;", "onCreateDraftMessageResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;", "onDeleteDraftMessagesResult", "Lio/getstream/chat/android/models/QueryDraftsResult;", "Lio/getstream/chat/android/models/FilterObject;", "filter", "", MapboxMap.QFE_LIMIT, "next", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/DraftsSort;", "sort", "onQueryDraftMessagesResult", "(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DraftMessageListenerState implements DraftMessageListener {
    private final MutableGlobalState mutableGlobalState;

    public DraftMessageListenerState(MutableGlobalState mutableGlobalState) {
        AbstractC22676k.m65750j(mutableGlobalState, "mutableGlobalState");
        this.mutableGlobalState = mutableGlobalState;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DraftMessageListener
    public final Object onCreateDraftMessageResult(AbstractC26205h abstractC26205h, String str, String str2, DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean z4 = abstractC26205h instanceof C26204g;
        if (z4) {
            this.mutableGlobalState.updateDraftMessage((DraftMessage) ((C26204g) abstractC26205h).f103919a);
        } else if (!(abstractC26205h instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!z4) {
            if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            if (ChatErrorKt.isPermanent(((C26203f) abstractC26205h).f103918a)) {
                draftMessage = null;
            }
            if (draftMessage != null) {
                this.mutableGlobalState.updateDraftMessage(draftMessage);
            }
        }
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DraftMessageListener
    public final Object onDeleteDraftMessagesResult(AbstractC26205h abstractC26205h, String str, String str2, DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean z4 = abstractC26205h instanceof C26204g;
        if (z4) {
            this.mutableGlobalState.removeDraftMessage(draftMessage);
        } else if (!(abstractC26205h instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!z4) {
            if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            if (ChatErrorKt.isPermanent(((C26203f) abstractC26205h).f103918a)) {
                draftMessage = null;
            }
            if (draftMessage != null) {
                this.mutableGlobalState.removeDraftMessage(draftMessage);
            }
        }
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DraftMessageListener
    public final Object onQueryDraftMessagesResult(AbstractC26205h abstractC26205h, FilterObject filterObject, int i13, String str, QuerySorter<DraftsSort> querySorter, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (abstractC26205h instanceof C26204g) {
            Iterator<T> it = ((QueryDraftsResult) ((C26204g) abstractC26205h).f103919a).getDrafts().iterator();
            while (it.hasNext()) {
                this.mutableGlobalState.updateDraftMessage((DraftMessage) it.next());
            }
        } else if (!(abstractC26205h instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        return C23454a0.f92919a;
    }
}
