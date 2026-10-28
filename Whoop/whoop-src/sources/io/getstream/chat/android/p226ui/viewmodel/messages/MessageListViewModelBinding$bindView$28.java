package io.getstream.chat.android.p226ui.viewmodel.messages;

import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class MessageListViewModelBinding$bindView$28 extends C22672i implements Function1 {
    public MessageListViewModelBinding$bindView$28(Object obj) {
        super(1, 0, MessageListView.class, obj, "setUnreadCount", "setUnreadCount$stream_chat_android_ui_components_release(I)V");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C23454a0.f92919a;
    }

    public final void invoke(int i13) {
        ((MessageListView) this.receiver).setUnreadCount$stream_chat_android_ui_components_release(i13);
    }
}
