package io.getstream.chat.android.p226ui.feature.channels.list.adapter.viewholder.internal;

import android.view.View;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.LongClickFriendlyLinkMovementMethod;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.channels.list.adapter.viewholder.internal.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnLongClickListenerC19642b implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74495a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f74496b;

    public /* synthetic */ ViewOnLongClickListenerC19642b(Object obj, int i13) {
        this.f74495a = i13;
        this.f74496b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f74495a) {
            case 0:
                return ChannelViewHolder.lambda$11$lambda$10$lambda$9$lambda$7((ChannelViewHolder) this.f74496b, view);
            default:
                return LongClickFriendlyLinkMovementMethod._init_$lambda$0((LongClickFriendlyLinkMovementMethod) this.f74496b, view);
        }
    }
}
