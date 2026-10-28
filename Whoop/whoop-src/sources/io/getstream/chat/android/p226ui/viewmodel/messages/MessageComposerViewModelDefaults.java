package io.getstream.chat.android.p226ui.viewmodel.messages;

import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Command;
import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.models.User;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\nR!\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\r*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\r*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R'\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\b0\r*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010R!\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\r*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R!\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\r*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R!\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\r*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010R!\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\r*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010R!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\r*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b$\u0010\u0010R\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b)\u0010'R\u001b\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b+\u0010'R\u001b\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b-\u0010'R\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b/\u0010'R\u001b\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b1\u0010'R\u001b\u00104\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b3\u0010'R\u001b\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b5\u0010'R\u001b\u00108\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b7\u0010'R!\u0010;\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\b0\r*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b:\u0010\u0010R!\u0010=\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\b0\r*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b<\u0010\u0010¨\u0006>"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelDefaults;", "", "<init>", "()V", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;", "", "sendOnComplete", "Lkotlin/Function0;", "Ll83/a0;", "audioRecordButtonReleaseListener", "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Z)Lc93/a;", "audioCompleteButtonClickListener", "defaultAudioRecordingFinishedListener", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Message;", "getSendMessageButtonClickListener", "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lkotlin/jvm/functions/Function1;", "sendMessageButtonClickListener", "", "getTextInputChangeListener", "textInputChangeListener", "", "Lio/getstream/chat/android/models/Attachment;", "getAttachmentSelectionListener", "attachmentSelectionListener", "Lio/getstream/chat/android/models/CreatePollParams;", "getPollSubmissionListener", "pollSubmissionListener", "getAttachmentRemovalListener", "attachmentRemovalListener", "Lio/getstream/chat/android/models/User;", "getMentionSelectionListener", "mentionSelectionListener", "Lio/getstream/chat/android/models/Command;", "getCommandSelectionListener", "commandSelectionListener", "getAlsoSendToChannelSelectionListener", "alsoSendToChannelSelectionListener", "getDismissActionClickListener", "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lc93/a;", "dismissActionClickListener", "getCommandsButtonClickListener", "commandsButtonClickListener", "getDismissSuggestionsListener", "dismissSuggestionsListener", "getAudioRecordButtonHoldListener", "audioRecordButtonHoldListener", "getAudioRecordButtonLockListener", "audioRecordButtonLockListener", "getAudioRecordButtonCancelListener", "audioRecordButtonCancelListener", "getAudioDeleteButtonClickListener", "audioDeleteButtonClickListener", "getAudioStopButtonClickListener", "audioStopButtonClickListener", "getAudioPlaybackButtonClickListener", "audioPlaybackButtonClickListener", "", "getAudioSliderDragStartListener", "audioSliderDragStartListener", "getAudioSliderDragStopListener", "audioSliderDragStopListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageComposerViewModelDefaults {
    public static final MessageComposerViewModelDefaults INSTANCE = new MessageComposerViewModelDefaults();

    private MessageComposerViewModelDefaults() {
    }

    private static final C23454a0 _get_alsoSendToChannelSelectionListener_$lambda$4(MessageComposerViewModel messageComposerViewModel, boolean z4) {
        messageComposerViewModel.setAlsoSendToChannel(z4);
        return C23454a0.f92919a;
    }

    private static final C23454a0 _get_audioDeleteButtonClickListener_$lambda$11(MessageComposerViewModel messageComposerViewModel) {
        messageComposerViewModel.cancelRecording();
        return C23454a0.f92919a;
    }

    private static final C23454a0 _get_audioPlaybackButtonClickListener_$lambda$13(MessageComposerViewModel messageComposerViewModel) {
        messageComposerViewModel.toggleRecordingPlayback();
        return C23454a0.f92919a;
    }

    private static final C23454a0 _get_audioRecordButtonCancelListener_$lambda$10(MessageComposerViewModel messageComposerViewModel) {
        messageComposerViewModel.cancelRecording();
        return C23454a0.f92919a;
    }

    private static final C23454a0 _get_audioRecordButtonHoldListener_$lambda$8(MessageComposerViewModel messageComposerViewModel) {
        messageComposerViewModel.startRecording();
        return C23454a0.f92919a;
    }

    private static final C23454a0 _get_audioRecordButtonLockListener_$lambda$9(MessageComposerViewModel messageComposerViewModel) {
        messageComposerViewModel.lockRecording();
        return C23454a0.f92919a;
    }

    private static final C23454a0 _get_audioSliderDragStartListener_$lambda$14(MessageComposerViewModel messageComposerViewModel, float f13) {
        messageComposerViewModel.pauseRecording();
        return C23454a0.f92919a;
    }

    private static final C23454a0 _get_audioSliderDragStopListener_$lambda$15(MessageComposerViewModel messageComposerViewModel, float f13) {
        messageComposerViewModel.seekRecordingTo(f13);
        return C23454a0.f92919a;
    }

    private static final C23454a0 _get_audioStopButtonClickListener_$lambda$12(MessageComposerViewModel messageComposerViewModel) {
        messageComposerViewModel.stopRecording();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 _get_commandSelectionListener_$lambda$3(MessageComposerViewModel messageComposerViewModel, Command it) {
        AbstractC22676k.m65750j(it, "it");
        messageComposerViewModel.selectCommand(it);
        return C23454a0.f92919a;
    }

    private static final C23454a0 _get_commandsButtonClickListener_$lambda$6(MessageComposerViewModel messageComposerViewModel) {
        messageComposerViewModel.toggleCommandsVisibility();
        return C23454a0.f92919a;
    }

    private static final C23454a0 _get_dismissActionClickListener_$lambda$5(MessageComposerViewModel messageComposerViewModel) {
        messageComposerViewModel.dismissMessageActions();
        return C23454a0.f92919a;
    }

    private static final C23454a0 _get_dismissSuggestionsListener_$lambda$7(MessageComposerViewModel messageComposerViewModel) {
        messageComposerViewModel.dismissSuggestionsPopup();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 _get_mentionSelectionListener_$lambda$2(MessageComposerViewModel messageComposerViewModel, User it) {
        AbstractC22676k.m65750j(it, "it");
        messageComposerViewModel.selectMention(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 _get_pollSubmissionListener_$lambda$1(MessageComposerViewModel messageComposerViewModel, CreatePollParams it) {
        AbstractC22676k.m65750j(it, "it");
        messageComposerViewModel.createPoll(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 _get_textInputChangeListener_$lambda$0(MessageComposerViewModel messageComposerViewModel, String it) {
        AbstractC22676k.m65750j(it, "it");
        messageComposerViewModel.setMessageInput(it);
        return C23454a0.f92919a;
    }

    private static final C23454a0 defaultAudioRecordingFinishedListener$lambda$16(MessageComposerViewModel messageComposerViewModel) {
        messageComposerViewModel.sendRecording();
        return C23454a0.f92919a;
    }

    private static final C23454a0 defaultAudioRecordingFinishedListener$lambda$17(MessageComposerViewModel messageComposerViewModel) {
        MessageComposerViewModel.completeRecording$default(messageComposerViewModel, null, 1, null);
        return C23454a0.f92919a;
    }

    public final InterfaceC4339a audioCompleteButtonClickListener(MessageComposerViewModel messageComposerViewModel, boolean z4) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return defaultAudioRecordingFinishedListener(messageComposerViewModel, z4);
    }

    public final InterfaceC4339a audioRecordButtonReleaseListener(MessageComposerViewModel messageComposerViewModel, boolean z4) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return defaultAudioRecordingFinishedListener(messageComposerViewModel, z4);
    }

    public final InterfaceC4339a defaultAudioRecordingFinishedListener(MessageComposerViewModel messageComposerViewModel, boolean z4) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return z4 ? new C19939c(messageComposerViewModel, 11) : new C19939c(messageComposerViewModel, 12);
    }

    public final Function1 getAlsoSendToChannelSelectionListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19941e(messageComposerViewModel, 6);
    }

    public final Function1 getAttachmentRemovalListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new MessageComposerViewModelDefaults$attachmentRemovalListener$1(messageComposerViewModel);
    }

    public final Function1 getAttachmentSelectionListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new MessageComposerViewModelDefaults$attachmentSelectionListener$1(messageComposerViewModel);
    }

    public final InterfaceC4339a getAudioDeleteButtonClickListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19939c(messageComposerViewModel, 4);
    }

    public final InterfaceC4339a getAudioPlaybackButtonClickListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19939c(messageComposerViewModel, 3);
    }

    public final InterfaceC4339a getAudioRecordButtonCancelListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19939c(messageComposerViewModel, 2);
    }

    public final InterfaceC4339a getAudioRecordButtonHoldListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19939c(messageComposerViewModel, 5);
    }

    public final InterfaceC4339a getAudioRecordButtonLockListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19939c(messageComposerViewModel, 10);
    }

    public final Function1 getAudioSliderDragStartListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19941e(messageComposerViewModel, 4);
    }

    public final Function1 getAudioSliderDragStopListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19941e(messageComposerViewModel, 0);
    }

    public final InterfaceC4339a getAudioStopButtonClickListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19939c(messageComposerViewModel, 7);
    }

    public final Function1 getCommandSelectionListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19941e(messageComposerViewModel, 2);
    }

    public final InterfaceC4339a getCommandsButtonClickListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19939c(messageComposerViewModel, 9);
    }

    public final InterfaceC4339a getDismissActionClickListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19939c(messageComposerViewModel, 6);
    }

    public final InterfaceC4339a getDismissSuggestionsListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19939c(messageComposerViewModel, 8);
    }

    public final Function1 getMentionSelectionListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19941e(messageComposerViewModel, 1);
    }

    public final Function1 getPollSubmissionListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19941e(messageComposerViewModel, 3);
    }

    public final Function1 getSendMessageButtonClickListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19926x567aebad(messageComposerViewModel);
    }

    public final Function1 getTextInputChangeListener(MessageComposerViewModel messageComposerViewModel) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        return new C19941e(messageComposerViewModel, 5);
    }
}
