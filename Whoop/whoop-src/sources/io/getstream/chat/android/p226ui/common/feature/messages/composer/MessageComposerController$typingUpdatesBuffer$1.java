package io.getstream.chat.android.p226ui.common.feature.messages.composer;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class MessageComposerController$typingUpdatesBuffer$1 extends C22672i implements InterfaceC4339a {
    public MessageComposerController$typingUpdatesBuffer$1(Object obj) {
        super(0, 0, MessageComposerController.class, obj, "sendKeystrokeEvent", "sendKeystrokeEvent()V");
    }

    @Override // c93.InterfaceC4339a
    public final /* bridge */ /* synthetic */ Object invoke() {
        m134224invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m134224invoke() {
        ((MessageComposerController) this.receiver).sendKeystrokeEvent();
    }
}
