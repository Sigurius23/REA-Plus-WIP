package io.getstream.chat.android.p226ui.feature.messages.list.internal.poll;

import android.content.DialogInterface;
import ec.InterfaceC13008a;
import io.getstream.chat.android.p226ui.databinding.StreamUiDialogAddPollCommentBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiDialogSuggestPollOptionBinding;
import p314m.DialogInterfaceC24846j;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.internal.poll.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnShowListenerC19853b implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74753a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DialogInterfaceC24846j f74754b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC13008a f74755c;

    public /* synthetic */ DialogInterfaceOnShowListenerC19853b(DialogInterfaceC24846j dialogInterfaceC24846j, InterfaceC13008a interfaceC13008a, int i13) {
        this.f74753a = i13;
        this.f74754b = dialogInterfaceC24846j;
        this.f74755c = interfaceC13008a;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f74753a) {
            case 0:
                AddPollCommentDialogFragment.onCreateDialog$lambda$2(this.f74754b, (StreamUiDialogAddPollCommentBinding) this.f74755c, dialogInterface);
                break;
            default:
                SuggestPollOptionDialogFragment.onCreateDialog$lambda$3(this.f74754b, (StreamUiDialogSuggestPollOptionBinding) this.f74755c, dialogInterface);
                break;
        }
    }
}
