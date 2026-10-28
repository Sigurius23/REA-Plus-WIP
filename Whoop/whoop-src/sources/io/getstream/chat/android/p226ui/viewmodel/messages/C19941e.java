package io.getstream.chat.android.p226ui.viewmodel.messages;

import io.getstream.chat.android.models.Command;
import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.models.User;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19941e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74872w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageComposerViewModel f74873x;

    public /* synthetic */ C19941e(MessageComposerViewModel messageComposerViewModel, int i13) {
        this.f74872w = i13;
        this.f74873x = messageComposerViewModel;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74872w) {
            case 0:
                this.f74873x.seekRecordingTo(((Float) obj).floatValue());
                break;
            case 1:
                MessageComposerViewModelDefaults._get_mentionSelectionListener_$lambda$2(this.f74873x, (User) obj);
                break;
            case 2:
                MessageComposerViewModelDefaults._get_commandSelectionListener_$lambda$3(this.f74873x, (Command) obj);
                break;
            case 3:
                MessageComposerViewModelDefaults._get_pollSubmissionListener_$lambda$1(this.f74873x, (CreatePollParams) obj);
                break;
            case 4:
                ((Float) obj).floatValue();
                this.f74873x.pauseRecording();
                break;
            case 5:
                MessageComposerViewModelDefaults._get_textInputChangeListener_$lambda$0(this.f74873x, (String) obj);
                break;
            default:
                this.f74873x.setAlsoSendToChannel(((Boolean) obj).booleanValue());
                break;
        }
        return C23454a0.f92919a;
    }
}
