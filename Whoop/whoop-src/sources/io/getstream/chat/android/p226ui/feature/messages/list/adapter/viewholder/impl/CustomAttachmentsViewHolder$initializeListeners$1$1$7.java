package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class CustomAttachmentsViewHolder$initializeListeners$1$1$7 extends C22656a implements Function1 {
    public CustomAttachmentsViewHolder$initializeListeners$1$1$7(Object obj) {
        super(1, 8, MessageListView.OnLinkClickListener.class, obj, "onLinkClick", "onLinkClick(Ljava/lang/String;)Z");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C23454a0.f92919a;
    }

    public final void invoke(String p13) {
        AbstractC22676k.m65750j(p13, "p0");
        ((MessageListView.OnLinkClickListener) this.receiver).onLinkClick(p13);
    }
}
