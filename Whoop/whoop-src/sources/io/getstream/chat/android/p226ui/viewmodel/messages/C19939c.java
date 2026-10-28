package io.getstream.chat.android.p226ui.viewmodel.messages;

import c93.InterfaceC4339a;
import l83.C23454a0;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19939c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74867w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageComposerViewModel f74868x;

    public /* synthetic */ C19939c(MessageComposerViewModel messageComposerViewModel, int i13) {
        this.f74867w = i13;
        this.f74868x = messageComposerViewModel;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f74867w) {
            case 0:
                return MessageComposerViewModel.buildNewMessage$default(this.f74868x, null, null, 3, null);
            case 1:
                return MessageComposerViewModel.buildNewMessage$default(this.f74868x, null, null, 3, null);
            case 2:
                this.f74868x.cancelRecording();
                return C23454a0.f92919a;
            case 3:
                this.f74868x.toggleRecordingPlayback();
                return C23454a0.f92919a;
            case 4:
                this.f74868x.cancelRecording();
                return C23454a0.f92919a;
            case 5:
                this.f74868x.startRecording();
                return C23454a0.f92919a;
            case 6:
                this.f74868x.dismissMessageActions();
                return C23454a0.f92919a;
            case 7:
                this.f74868x.stopRecording();
                return C23454a0.f92919a;
            case 8:
                this.f74868x.dismissSuggestionsPopup();
                return C23454a0.f92919a;
            case 9:
                this.f74868x.toggleCommandsVisibility();
                return C23454a0.f92919a;
            case 10:
                this.f74868x.lockRecording();
                return C23454a0.f92919a;
            case 11:
                this.f74868x.sendRecording();
                return C23454a0.f92919a;
            default:
                MessageComposerViewModel.completeRecording$default(this.f74868x, null, 1, null);
                return C23454a0.f92919a;
        }
    }
}
