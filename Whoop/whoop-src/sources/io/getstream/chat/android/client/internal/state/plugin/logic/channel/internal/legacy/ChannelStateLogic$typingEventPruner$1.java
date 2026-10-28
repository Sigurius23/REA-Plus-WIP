package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy;

import c93.InterfaceC4351m;
import io.getstream.chat.android.client.events.TypingStartEvent;
import io.getstream.chat.android.models.TypingEvent;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class ChannelStateLogic$typingEventPruner$1 extends C22672i implements InterfaceC4351m {
    public ChannelStateLogic$typingEventPruner$1(Object obj) {
        super(2, 0, ChannelStateLogic.class, obj, "updateTypingStates", "updateTypingStates(Ljava/util/Map;Lio/getstream/chat/android/models/TypingEvent;)V");
    }

    @Override // c93.InterfaceC4351m
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Map<String, TypingStartEvent>) obj, (TypingEvent) obj2);
        return C23454a0.f92919a;
    }

    public final void invoke(Map<String, TypingStartEvent> p13, TypingEvent p14) {
        AbstractC22676k.m65750j(p13, "p0");
        AbstractC22676k.m65750j(p14, "p1");
        ((ChannelStateLogic) this.receiver).updateTypingStates(p13, p14);
    }
}
