package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class MediaAttachmentsViewHolder$setLinkMovementMethod$1$2 extends C22656a implements Function1 {
    public MediaAttachmentsViewHolder$setLinkMovementMethod$1$2(Object obj) {
        super(1, 8, MessageListView.OnMentionClickListener.class, obj, "onMentionClick", "onMentionClick(Lio/getstream/chat/android/models/User;)Z");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((User) obj);
        return C23454a0.f92919a;
    }

    public final void invoke(User p13) {
        AbstractC22676k.m65750j(p13, "p0");
        ((MessageListView.OnMentionClickListener) this.receiver).onMentionClick(p13);
    }
}
