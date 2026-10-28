package io.getstream.chat.android.p226ui.viewmodel.messages;

import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class MessageListViewModelBinding$bindView$25 extends C22672i implements Function1 {
    public MessageListViewModelBinding$bindView$25(Object obj) {
        super(1, 0, MessageListView.class, obj, "setLoadingMore", "setLoadingMore(Z)V");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C23454a0.f92919a;
    }

    public final void invoke(boolean z4) {
        ((MessageListView) this.receiver).setLoadingMore(z4);
    }
}
