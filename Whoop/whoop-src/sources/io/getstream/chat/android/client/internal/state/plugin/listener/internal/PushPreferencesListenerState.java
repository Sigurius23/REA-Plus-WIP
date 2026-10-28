package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.plugin.listeners.PushPreferencesListener;
import io.getstream.chat.android.models.PushPreference;
import io.getstream.chat.android.models.PushPreferenceLevel;
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
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/PushPreferencesListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/PushPreferencesListener;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V", "", "cid", "Lio/getstream/chat/android/models/PushPreference;", "pushPreference", "Ll83/a0;", "updateChannelPushPreference", "(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreference;)V", "Lio/getstream/chat/android/models/PushPreferenceLevel;", "level", "Ln23/h;", "result", "onChannelPushPreferenceSet", "(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;Ln23/h;Lq83/d;)Ljava/lang/Object;", "Ljava/util/Date;", "until", "onChannelPushNotificationsSnoozed", "(Ljava/lang/String;Ljava/util/Date;Ln23/h;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PushPreferencesListenerState implements PushPreferencesListener {
    private final LogicRegistry logic;

    public PushPreferencesListenerState(LogicRegistry logic) {
        AbstractC22676k.m65750j(logic, "logic");
        this.logic = logic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateChannelPushPreference(String cid, PushPreference pushPreference) {
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(cid);
        this.logic.channel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x).setPushPreference(pushPreference);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.PushPreferencesListener
    public final Object onChannelPushNotificationsSnoozed(String str, Date date, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (abstractC26205h instanceof C26204g) {
            updateChannelPushPreference(str, (PushPreference) ((C26204g) abstractC26205h).f103919a);
        } else if (!(abstractC26205h instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.PushPreferencesListener
    public final Object onChannelPushPreferenceSet(String str, PushPreferenceLevel pushPreferenceLevel, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (abstractC26205h instanceof C26204g) {
            updateChannelPushPreference(str, (PushPreference) ((C26204g) abstractC26205h).f103919a);
        } else if (!(abstractC26205h instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        return C23454a0.f92919a;
    }
}
