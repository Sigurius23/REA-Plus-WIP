package io.getstream.chat.android.p226ui.viewmodel.messages;

import io.getstream.chat.android.models.Message;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.MessageComposerViewModelDefaults$sendMessageButtonClickListener$1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class C19926x567aebad extends C22656a implements Function1 {
    public C19926x567aebad(Object obj) {
        super(1, 0, MessageComposerViewModel.class, obj, "sendMessage", "sendMessage(Lio/getstream/chat/android/models/Message;Lio/getstream/result/call/Call$Callback;)V");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Message) obj);
        return C23454a0.f92919a;
    }

    public final void invoke(Message p13) {
        AbstractC22676k.m65750j(p13, "p0");
        MessageComposerViewModel.sendMessage$default((MessageComposerViewModel) this.receiver, p13, null, 2, null);
    }
}
