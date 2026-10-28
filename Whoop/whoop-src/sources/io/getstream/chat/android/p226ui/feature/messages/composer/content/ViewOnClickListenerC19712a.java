package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.view.View;
import c93.InterfaceC4339a;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.content.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC19712a implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74570w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f74571x;

    public /* synthetic */ ViewOnClickListenerC19712a(Object obj, int i13) {
        this.f74570w = i13;
        this.f74571x = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f74570w;
        Object obj = this.f74571x;
        switch (i13) {
            case 0:
                CommandViewHolder._init_$lambda$0((CommandViewHolder) obj, view);
                break;
            case 1:
                MentionsViewHolder._init_$lambda$0((MentionsViewHolder) obj, view);
                break;
            case 2:
                int i14 = DefaultMessageComposerHeaderContent.f74568w;
                InterfaceC4339a dismissActionClickListener = ((DefaultMessageComposerHeaderContent) obj).getDismissActionClickListener();
                if (dismissActionClickListener != null) {
                    dismissActionClickListener.invoke();
                }
                break;
            default:
                DefaultMessageComposerTrailingContent.Companion companion = DefaultMessageComposerTrailingContent.Companion;
                InterfaceC4339a sendMessageButtonClickListener = ((DefaultMessageComposerTrailingContent) obj).getSendMessageButtonClickListener();
                if (sendMessageButtonClickListener != null) {
                    sendMessageButtonClickListener.invoke();
                }
                break;
        }
    }
}
