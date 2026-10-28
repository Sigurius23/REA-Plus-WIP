package io.getstream.chat.android.p226ui.viewmodel.messages;

import androidx.lifecycle.InterfaceC1585g0;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerView;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 H2\u00020\u0001:\u0001HB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00002\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0014\u0010\u000fJ!\u0010\u0015\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0015\u0010\u000fJ!\u0010\u0017\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0017\u0010\u000fJ!\u0010\u0019\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0019\u0010\u000fJ!\u0010\u001b\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u001b\u0010\u000fJ\u001b\u0010\u001c\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u001c\u0010\nJ\u001b\u0010\u001d\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u001d\u0010\nJ\u001b\u0010\u001e\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u001e\u0010\nJ\u001b\u0010\u001f\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u001f\u0010\nJ\u001b\u0010 \u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b \u0010\nJ\u001b\u0010!\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b!\u0010\nJ\u001b\u0010\"\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\"\u0010\nJ\u001b\u0010#\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b#\u0010\nJ\u001b\u0010$\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b$\u0010\nJ\u001b\u0010%\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b%\u0010\nJ\u001b\u0010&\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b&\u0010\nJ!\u0010(\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b(\u0010\u000fJ!\u0010)\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b)\u0010\u000fJ\u001f\u00100\u001a\u00020\f2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00102R\"\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\"\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R(\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\"\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00104R\"\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00104R\"\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00104R\"\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00104R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00102R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00102R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00102R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00102R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00102R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00102R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00102R\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00102R\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00102R\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00102R\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00102R\"\u0010F\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00104R\"\u0010G\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00104¨\u0006I"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;", "", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;", "vm", "<init>", "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)V", "Lkotlin/Function0;", "Lio/getstream/chat/android/models/Message;", "builder", "messageBuilder", "(Lc93/a;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;", "Lkotlin/Function1;", "Ll83/a0;", "listener", "onSendMessageButtonClick", "(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;", "", "onTextInputChange", "", "Lio/getstream/chat/android/models/Attachment;", "onAttachmentSelection", "onAttachmentRemoval", "Lio/getstream/chat/android/models/User;", "onMentionSelection", "Lio/getstream/chat/android/models/Command;", "onCommandSelection", "", "onAlsoSendToChannelSelection", "onDismissActionClick", "onCommandsButtonClick", "onDismissSuggestions", "onAudioRecordButtonHold", "onAudioRecordButtonLock", "onAudioRecordButtonCancel", "onAudioRecordButtonRelease", "onAudioDeleteButtonClick", "onAudioStopButtonClick", "onAudioPlaybackButtonClick", "onAudioCompleteButtonClick", "", "onAudioSliderDragStart", "onAudioSliderDragStop", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;", ProfileAnalyticsKt.VIEW, "Landroidx/lifecycle/g0;", "lifecycleOwner", "bind", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroidx/lifecycle/g0;)V", "bindView", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;", "Lc93/a;", "sendMessageButtonClickListener", "Lkotlin/jvm/functions/Function1;", "textInputChangeListener", "attachmentSelectionListener", "attachmentRemovalListener", "mentionSelectionListener", "commandSelectionListener", "alsoSendToChannelSelectionListener", "dismissActionClickListener", "commandsButtonClickListener", "dismissSuggestionsListener", "audioRecordButtonHoldListener", "audioRecordButtonLockListener", "audioRecordButtonCancelListener", "audioRecordButtonReleaseListener", "audioDeleteButtonClickListener", "audioStopButtonClickListener", "audioPlaybackButtonClickListener", "audioCompleteButtonClickListener", "audioSliderDragStartListener", "audioSliderDragStopListener", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageComposerViewModelBinder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private Function1 alsoSendToChannelSelectionListener;
    private Function1 attachmentRemovalListener;
    private Function1 attachmentSelectionListener;
    private InterfaceC4339a audioCompleteButtonClickListener;
    private InterfaceC4339a audioDeleteButtonClickListener;
    private InterfaceC4339a audioPlaybackButtonClickListener;
    private InterfaceC4339a audioRecordButtonCancelListener;
    private InterfaceC4339a audioRecordButtonHoldListener;
    private InterfaceC4339a audioRecordButtonLockListener;
    private InterfaceC4339a audioRecordButtonReleaseListener;
    private Function1 audioSliderDragStartListener;
    private Function1 audioSliderDragStopListener;
    private InterfaceC4339a audioStopButtonClickListener;
    private Function1 commandSelectionListener;
    private InterfaceC4339a commandsButtonClickListener;
    private InterfaceC4339a dismissActionClickListener;
    private InterfaceC4339a dismissSuggestionsListener;
    private Function1 mentionSelectionListener;
    private InterfaceC4339a messageBuilder;
    private Function1 sendMessageButtonClickListener;
    private Function1 textInputChangeListener;
    private final MessageComposerViewModel vm;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder$Companion;", "", "<init>", "()V", "with", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;", "vm", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final MessageComposerViewModelBinder with(MessageComposerViewModel vm3) {
            AbstractC22676k.m65750j(vm3, "vm");
            return new MessageComposerViewModelBinder(vm3, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ MessageComposerViewModelBinder(MessageComposerViewModel messageComposerViewModel, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageComposerViewModel);
    }

    /* JADX INFO: renamed from: a */
    public static Message m55717a(MessageComposerViewModelBinder messageComposerViewModelBinder) {
        return MessageComposerViewModel.buildNewMessage$default(messageComposerViewModelBinder.vm, null, null, 3, null);
    }

    private static final C23454a0 onAudioCompleteButtonClick$lambda$1(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    public static final MessageComposerViewModelBinder with(MessageComposerViewModel messageComposerViewModel) {
        return INSTANCE.with(messageComposerViewModel);
    }

    public final void bind(MessageComposerView view, InterfaceC1585g0 lifecycleOwner) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        MessageComposerViewModel messageComposerViewModel = this.vm;
        InterfaceC4339a interfaceC4339a = this.messageBuilder;
        Function1 function1 = this.sendMessageButtonClickListener;
        Function1 function2 = this.textInputChangeListener;
        Function1 function3 = this.attachmentSelectionListener;
        Function1 function4 = this.attachmentRemovalListener;
        Function1 function5 = this.mentionSelectionListener;
        Function1 function6 = this.commandSelectionListener;
        Function1 function7 = this.alsoSendToChannelSelectionListener;
        InterfaceC4339a interfaceC4339a2 = this.dismissActionClickListener;
        InterfaceC4339a interfaceC4339a3 = this.commandsButtonClickListener;
        InterfaceC4339a interfaceC4339a4 = this.dismissSuggestionsListener;
        InterfaceC4339a interfaceC4339a5 = this.audioRecordButtonHoldListener;
        InterfaceC4339a interfaceC4339a6 = this.audioRecordButtonLockListener;
        InterfaceC4339a interfaceC4339a7 = this.audioRecordButtonCancelListener;
        InterfaceC4339a interfaceC4339aAudioRecordButtonReleaseListener = this.audioRecordButtonReleaseListener;
        if (interfaceC4339aAudioRecordButtonReleaseListener == null) {
            interfaceC4339aAudioRecordButtonReleaseListener = MessageComposerViewModelDefaults.INSTANCE.audioRecordButtonReleaseListener(messageComposerViewModel, view.getComposerStyle$stream_chat_android_ui_components_release().getAudioRecordingSendOnComplete());
        }
        InterfaceC4339a interfaceC4339a8 = interfaceC4339aAudioRecordButtonReleaseListener;
        InterfaceC4339a interfaceC4339a9 = this.audioDeleteButtonClickListener;
        InterfaceC4339a interfaceC4339a10 = this.audioStopButtonClickListener;
        InterfaceC4339a interfaceC4339a11 = this.audioPlaybackButtonClickListener;
        InterfaceC4339a interfaceC4339aAudioCompleteButtonClickListener = this.audioCompleteButtonClickListener;
        if (interfaceC4339aAudioCompleteButtonClickListener == null) {
            interfaceC4339aAudioCompleteButtonClickListener = MessageComposerViewModelDefaults.INSTANCE.audioCompleteButtonClickListener(this.vm, view.getComposerStyle$stream_chat_android_ui_components_release().getAudioRecordingSendOnComplete());
        }
        MessageComposerViewModelBinding.bind$default(messageComposerViewModel, view, lifecycleOwner, interfaceC4339a, function1, function2, function3, function4, null, function5, function6, function7, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, interfaceC4339a6, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, interfaceC4339a10, interfaceC4339a11, interfaceC4339aAudioCompleteButtonClickListener, this.audioSliderDragStartListener, this.audioSliderDragStopListener, 128, null);
    }

    public final MessageComposerViewModelBinder messageBuilder(InterfaceC4339a builder) {
        AbstractC22676k.m65750j(builder, "builder");
        this.messageBuilder = builder;
        return this;
    }

    public final MessageComposerViewModelBinder onAlsoSendToChannelSelection(Function1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.alsoSendToChannelSelectionListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onAttachmentRemoval(Function1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.attachmentRemovalListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onAttachmentSelection(Function1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.attachmentSelectionListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onAudioCompleteButtonClick(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.audioCompleteButtonClickListener = new C19938b(listener, 1);
        return this;
    }

    public final MessageComposerViewModelBinder onAudioDeleteButtonClick(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.audioDeleteButtonClickListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onAudioPlaybackButtonClick(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.audioPlaybackButtonClickListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onAudioRecordButtonCancel(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.audioRecordButtonCancelListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onAudioRecordButtonHold(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.audioRecordButtonHoldListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onAudioRecordButtonLock(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.audioRecordButtonLockListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onAudioRecordButtonRelease(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.audioRecordButtonReleaseListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onAudioSliderDragStart(Function1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.audioSliderDragStartListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onAudioSliderDragStop(Function1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.audioSliderDragStopListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onAudioStopButtonClick(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.audioStopButtonClickListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onCommandSelection(Function1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.commandSelectionListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onCommandsButtonClick(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.commandsButtonClickListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onDismissActionClick(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.dismissActionClickListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onDismissSuggestions(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.dismissSuggestionsListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onMentionSelection(Function1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.mentionSelectionListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onSendMessageButtonClick(Function1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.sendMessageButtonClickListener = listener;
        return this;
    }

    public final MessageComposerViewModelBinder onTextInputChange(Function1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.textInputChangeListener = listener;
        return this;
    }

    private MessageComposerViewModelBinder(MessageComposerViewModel messageComposerViewModel) {
        this.vm = messageComposerViewModel;
        this.messageBuilder = new C19938b(this, 2);
        MessageComposerViewModelDefaults messageComposerViewModelDefaults = MessageComposerViewModelDefaults.INSTANCE;
        this.sendMessageButtonClickListener = messageComposerViewModelDefaults.getSendMessageButtonClickListener(messageComposerViewModel);
        this.textInputChangeListener = messageComposerViewModelDefaults.getTextInputChangeListener(messageComposerViewModel);
        this.attachmentSelectionListener = messageComposerViewModelDefaults.getAttachmentSelectionListener(messageComposerViewModel);
        this.attachmentRemovalListener = messageComposerViewModelDefaults.getAttachmentRemovalListener(messageComposerViewModel);
        this.mentionSelectionListener = messageComposerViewModelDefaults.getMentionSelectionListener(messageComposerViewModel);
        this.commandSelectionListener = messageComposerViewModelDefaults.getCommandSelectionListener(messageComposerViewModel);
        this.alsoSendToChannelSelectionListener = messageComposerViewModelDefaults.getAlsoSendToChannelSelectionListener(messageComposerViewModel);
        this.dismissActionClickListener = messageComposerViewModelDefaults.getDismissActionClickListener(messageComposerViewModel);
        this.commandsButtonClickListener = messageComposerViewModelDefaults.getCommandsButtonClickListener(messageComposerViewModel);
        this.dismissSuggestionsListener = messageComposerViewModelDefaults.getDismissSuggestionsListener(messageComposerViewModel);
        this.audioRecordButtonHoldListener = messageComposerViewModelDefaults.getAudioRecordButtonHoldListener(messageComposerViewModel);
        this.audioRecordButtonLockListener = messageComposerViewModelDefaults.getAudioRecordButtonLockListener(messageComposerViewModel);
        this.audioRecordButtonCancelListener = messageComposerViewModelDefaults.getAudioRecordButtonCancelListener(messageComposerViewModel);
        this.audioDeleteButtonClickListener = messageComposerViewModelDefaults.getAudioDeleteButtonClickListener(messageComposerViewModel);
        this.audioStopButtonClickListener = messageComposerViewModelDefaults.getAudioStopButtonClickListener(messageComposerViewModel);
        this.audioPlaybackButtonClickListener = messageComposerViewModelDefaults.getAudioPlaybackButtonClickListener(messageComposerViewModel);
        this.audioSliderDragStartListener = messageComposerViewModelDefaults.getAudioSliderDragStartListener(messageComposerViewModel);
        this.audioSliderDragStopListener = messageComposerViewModelDefaults.getAudioSliderDragStopListener(messageComposerViewModel);
    }
}
