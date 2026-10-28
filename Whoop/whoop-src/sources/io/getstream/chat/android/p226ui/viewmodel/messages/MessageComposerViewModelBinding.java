package io.getstream.chat.android.p226ui.viewmodel.messages;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.profileinstaller.ProfileVerifier;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import g32.C15310j;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerView;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p699b70.C2777c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\r\u001aÅ\u0003\u0010)\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\b2\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b'\u0010(\u001aï\u0003\u0010+\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007¢\u0006\u0004\b*\u0010(\u001aH\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\"\u0004\b\u0000\u0010,*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0082\u0004¢\u0006\u0004\b.\u0010/\u001a0\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\u0005*\b\u0012\u0004\u0012\u00020\t0\u00052\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005H\u0082\u0004¢\u0006\u0004\b.\u00100¨\u00061"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;", ProfileAnalyticsKt.VIEW, "Landroidx/lifecycle/g0;", "lifecycleOwner", "Lkotlin/Function0;", "Lio/getstream/chat/android/models/Message;", "messageBuilder", "Lkotlin/Function1;", "Ll83/a0;", "sendMessageButtonClickListener", "", "textInputChangeListener", "", "Lio/getstream/chat/android/models/Attachment;", "attachmentSelectionListener", "attachmentRemovalListener", "Lio/getstream/chat/android/models/CreatePollParams;", "pollSubmissionListener", "Lio/getstream/chat/android/models/User;", "mentionSelectionListener", "Lio/getstream/chat/android/models/Command;", "commandSelectionListener", "", "alsoSendToChannelSelectionListener", "dismissActionClickListener", "commandsButtonClickListener", "dismissSuggestionsListener", "audioRecordButtonHoldListener", "audioRecordButtonLockListener", "audioRecordButtonCancelListener", "audioRecordButtonReleaseListener", "audioDeleteButtonClickListener", "audioStopButtonClickListener", "audioPlaybackButtonClickListener", "audioCompleteButtonClickListener", "", "audioSliderDragStartListener", "audioSliderDragStopListener", "bind", "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroidx/lifecycle/g0;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "bindView", "bindDefaults", "bindViewDefaults", "T", "that", "and", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "(Lc93/a;Lc93/a;)Lc93/a;", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageComposerViewModelBinding {
    private static final <T> Function1 and(Function1 function1, Function1 function2) {
        return function2 == null ? function1 : new C2777c(function1, 4, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 and$lambda$3(Function1 function1, Function1 function2, Object obj) {
        function1.invoke(obj);
        function2.invoke(obj);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 and$lambda$4(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        interfaceC4339a.invoke();
        interfaceC4339a2.invoke();
        return C23454a0.f92919a;
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        bind$default(messageComposerViewModel, view, lifecycleOwner, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777212, null);
    }

    public static /* synthetic */ void bind$default(MessageComposerViewModel messageComposerViewModel, MessageComposerView messageComposerView, InterfaceC1585g0 interfaceC1585g0, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5, InterfaceC4339a interfaceC4339a6, InterfaceC4339a interfaceC4339a7, InterfaceC4339a interfaceC4339a8, InterfaceC4339a interfaceC4339a9, InterfaceC4339a interfaceC4339a10, InterfaceC4339a interfaceC4339a11, InterfaceC4339a interfaceC4339a12, Function1 function9, Function1 function10, int i13, Object obj) {
        bind(messageComposerViewModel, messageComposerView, interfaceC1585g0, (i13 & 4) != 0 ? new C19939c(messageComposerViewModel, 1) : interfaceC4339a, (i13 & 8) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getSendMessageButtonClickListener(messageComposerViewModel) : function1, (i13 & 16) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getTextInputChangeListener(messageComposerViewModel) : function2, (i13 & 32) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getAttachmentSelectionListener(messageComposerViewModel) : function3, (i13 & 64) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getAttachmentRemovalListener(messageComposerViewModel) : function4, (i13 & 128) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getPollSubmissionListener(messageComposerViewModel) : function5, (i13 & 256) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getMentionSelectionListener(messageComposerViewModel) : function6, (i13 & 512) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getCommandSelectionListener(messageComposerViewModel) : function7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getAlsoSendToChannelSelectionListener(messageComposerViewModel) : function8, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getDismissActionClickListener(messageComposerViewModel) : interfaceC4339a2, (i13 & 4096) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getCommandsButtonClickListener(messageComposerViewModel) : interfaceC4339a3, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getDismissSuggestionsListener(messageComposerViewModel) : interfaceC4339a4, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getAudioRecordButtonHoldListener(messageComposerViewModel) : interfaceC4339a5, (32768 & i13) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getAudioRecordButtonLockListener(messageComposerViewModel) : interfaceC4339a6, (65536 & i13) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getAudioRecordButtonCancelListener(messageComposerViewModel) : interfaceC4339a7, (131072 & i13) != 0 ? MessageComposerViewModelDefaults.INSTANCE.audioRecordButtonReleaseListener(messageComposerViewModel, messageComposerView.getComposerStyle$stream_chat_android_ui_components_release().getAudioRecordingSendOnComplete()) : interfaceC4339a8, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getAudioDeleteButtonClickListener(messageComposerViewModel) : interfaceC4339a9, (i13 & 524288) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getAudioStopButtonClickListener(messageComposerViewModel) : interfaceC4339a10, (i13 & 1048576) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getAudioPlaybackButtonClickListener(messageComposerViewModel) : interfaceC4339a11, (i13 & 2097152) != 0 ? MessageComposerViewModelDefaults.INSTANCE.audioCompleteButtonClickListener(messageComposerViewModel, messageComposerView.getComposerStyle$stream_chat_android_ui_components_release().getAudioRecordingSendOnComplete()) : interfaceC4339a12, (i13 & 4194304) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getAudioSliderDragStartListener(messageComposerViewModel) : function9, (i13 & 8388608) != 0 ? MessageComposerViewModelDefaults.INSTANCE.getAudioSliderDragStopListener(messageComposerViewModel) : function10);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777212, null);
    }

    public static /* synthetic */ void bindDefaults$default(MessageComposerViewModel messageComposerViewModel, MessageComposerView messageComposerView, InterfaceC1585g0 interfaceC1585g0, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5, InterfaceC4339a interfaceC4339a6, InterfaceC4339a interfaceC4339a7, InterfaceC4339a interfaceC4339a8, InterfaceC4339a interfaceC4339a9, InterfaceC4339a interfaceC4339a10, InterfaceC4339a interfaceC4339a11, InterfaceC4339a interfaceC4339a12, Function1 function9, Function1 function10, int i13, Object obj) {
        MessageComposerViewModel messageComposerViewModel2;
        InterfaceC4339a c19939c;
        if ((i13 & 4) != 0) {
            messageComposerViewModel2 = messageComposerViewModel;
            c19939c = new C19939c(messageComposerViewModel2, 0);
        } else {
            messageComposerViewModel2 = messageComposerViewModel;
            c19939c = interfaceC4339a;
        }
        bindDefaults(messageComposerViewModel2, messageComposerView, interfaceC1585g0, c19939c, (i13 & 8) != 0 ? null : function1, (i13 & 16) != 0 ? null : function2, (i13 & 32) != 0 ? null : function3, (i13 & 64) != 0 ? null : function4, (i13 & 128) != 0 ? null : function5, (i13 & 256) != 0 ? null : function6, (i13 & 512) != 0 ? null : function7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : function8, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : interfaceC4339a2, (i13 & 4096) != 0 ? null : interfaceC4339a3, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : interfaceC4339a4, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : interfaceC4339a5, (32768 & i13) != 0 ? null : interfaceC4339a6, (65536 & i13) != 0 ? null : interfaceC4339a7, (131072 & i13) != 0 ? null : interfaceC4339a8, (262144 & i13) != 0 ? null : interfaceC4339a9, (524288 & i13) != 0 ? null : interfaceC4339a10, (1048576 & i13) != 0 ? null : interfaceC4339a11, (2097152 & i13) != 0 ? null : interfaceC4339a12, (4194304 & i13) != 0 ? null : function9, (i13 & 8388608) != 0 ? null : function10);
    }

    private static final C23454a0 bindView$lambda$1(Function1 function1, InterfaceC4339a interfaceC4339a) {
        function1.invoke(interfaceC4339a.invoke());
        return C23454a0.f92919a;
    }

    private static final InterfaceC4339a and(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        return interfaceC4339a2 == null ? interfaceC4339a : new C19940d(0, interfaceC4339a, interfaceC4339a2);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777208, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777208, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777200, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777200, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777184, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777184, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777152, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777152, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777088, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777088, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, pollSubmissionListener, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16776960, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, function5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16776960, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener, Function1 mentionSelectionListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, pollSubmissionListener, mentionSelectionListener, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16776704, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, function5, function6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16776704, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener, Function1 mentionSelectionListener, Function1 commandSelectionListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, pollSubmissionListener, mentionSelectionListener, commandSelectionListener, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16776192, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, function5, function6, function7, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16776192, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener, Function1 mentionSelectionListener, Function1 commandSelectionListener, Function1 alsoSendToChannelSelectionListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        AbstractC22676k.m65750j(alsoSendToChannelSelectionListener, "alsoSendToChannelSelectionListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, pollSubmissionListener, mentionSelectionListener, commandSelectionListener, alsoSendToChannelSelectionListener, null, null, null, null, null, null, null, null, null, null, null, null, null, 16775168, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, function5, function6, function7, function8, null, null, null, null, null, null, null, null, null, null, null, null, null, 16775168, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener, Function1 mentionSelectionListener, Function1 commandSelectionListener, Function1 alsoSendToChannelSelectionListener, InterfaceC4339a dismissActionClickListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        AbstractC22676k.m65750j(alsoSendToChannelSelectionListener, "alsoSendToChannelSelectionListener");
        AbstractC22676k.m65750j(dismissActionClickListener, "dismissActionClickListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, pollSubmissionListener, mentionSelectionListener, commandSelectionListener, alsoSendToChannelSelectionListener, dismissActionClickListener, null, null, null, null, null, null, null, null, null, null, null, null, 16773120, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, function5, function6, function7, function8, interfaceC4339a, null, null, null, null, null, null, null, null, null, null, null, null, 16773120, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener, Function1 mentionSelectionListener, Function1 commandSelectionListener, Function1 alsoSendToChannelSelectionListener, InterfaceC4339a dismissActionClickListener, InterfaceC4339a commandsButtonClickListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        AbstractC22676k.m65750j(alsoSendToChannelSelectionListener, "alsoSendToChannelSelectionListener");
        AbstractC22676k.m65750j(dismissActionClickListener, "dismissActionClickListener");
        AbstractC22676k.m65750j(commandsButtonClickListener, "commandsButtonClickListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, pollSubmissionListener, mentionSelectionListener, commandSelectionListener, alsoSendToChannelSelectionListener, dismissActionClickListener, commandsButtonClickListener, null, null, null, null, null, null, null, null, null, null, null, 16769024, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, function5, function6, function7, function8, interfaceC4339a, interfaceC4339a2, null, null, null, null, null, null, null, null, null, null, null, 16769024, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener, Function1 mentionSelectionListener, Function1 commandSelectionListener, Function1 alsoSendToChannelSelectionListener, InterfaceC4339a dismissActionClickListener, InterfaceC4339a commandsButtonClickListener, InterfaceC4339a dismissSuggestionsListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        AbstractC22676k.m65750j(alsoSendToChannelSelectionListener, "alsoSendToChannelSelectionListener");
        AbstractC22676k.m65750j(dismissActionClickListener, "dismissActionClickListener");
        AbstractC22676k.m65750j(commandsButtonClickListener, "commandsButtonClickListener");
        AbstractC22676k.m65750j(dismissSuggestionsListener, "dismissSuggestionsListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, pollSubmissionListener, mentionSelectionListener, commandSelectionListener, alsoSendToChannelSelectionListener, dismissActionClickListener, commandsButtonClickListener, dismissSuggestionsListener, null, null, null, null, null, null, null, null, null, null, 16760832, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, function5, function6, function7, function8, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, null, null, null, null, null, null, null, null, null, null, 16760832, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener, Function1 mentionSelectionListener, Function1 commandSelectionListener, Function1 alsoSendToChannelSelectionListener, InterfaceC4339a dismissActionClickListener, InterfaceC4339a commandsButtonClickListener, InterfaceC4339a dismissSuggestionsListener, InterfaceC4339a audioRecordButtonHoldListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        AbstractC22676k.m65750j(alsoSendToChannelSelectionListener, "alsoSendToChannelSelectionListener");
        AbstractC22676k.m65750j(dismissActionClickListener, "dismissActionClickListener");
        AbstractC22676k.m65750j(commandsButtonClickListener, "commandsButtonClickListener");
        AbstractC22676k.m65750j(dismissSuggestionsListener, "dismissSuggestionsListener");
        AbstractC22676k.m65750j(audioRecordButtonHoldListener, "audioRecordButtonHoldListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, pollSubmissionListener, mentionSelectionListener, commandSelectionListener, alsoSendToChannelSelectionListener, dismissActionClickListener, commandsButtonClickListener, dismissSuggestionsListener, audioRecordButtonHoldListener, null, null, null, null, null, null, null, null, null, 16744448, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, function5, function6, function7, function8, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, null, null, null, null, null, null, null, null, null, 16744448, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener, Function1 mentionSelectionListener, Function1 commandSelectionListener, Function1 alsoSendToChannelSelectionListener, InterfaceC4339a dismissActionClickListener, InterfaceC4339a commandsButtonClickListener, InterfaceC4339a dismissSuggestionsListener, InterfaceC4339a audioRecordButtonHoldListener, InterfaceC4339a audioRecordButtonLockListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        AbstractC22676k.m65750j(alsoSendToChannelSelectionListener, "alsoSendToChannelSelectionListener");
        AbstractC22676k.m65750j(dismissActionClickListener, "dismissActionClickListener");
        AbstractC22676k.m65750j(commandsButtonClickListener, "commandsButtonClickListener");
        AbstractC22676k.m65750j(dismissSuggestionsListener, "dismissSuggestionsListener");
        AbstractC22676k.m65750j(audioRecordButtonHoldListener, "audioRecordButtonHoldListener");
        AbstractC22676k.m65750j(audioRecordButtonLockListener, "audioRecordButtonLockListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, pollSubmissionListener, mentionSelectionListener, commandSelectionListener, alsoSendToChannelSelectionListener, dismissActionClickListener, commandsButtonClickListener, dismissSuggestionsListener, audioRecordButtonHoldListener, audioRecordButtonLockListener, null, null, null, null, null, null, null, null, 16711680, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, function5, function6, function7, function8, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, null, null, null, null, null, null, null, null, 16711680, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener, Function1 mentionSelectionListener, Function1 commandSelectionListener, Function1 alsoSendToChannelSelectionListener, InterfaceC4339a dismissActionClickListener, InterfaceC4339a commandsButtonClickListener, InterfaceC4339a dismissSuggestionsListener, InterfaceC4339a audioRecordButtonHoldListener, InterfaceC4339a audioRecordButtonLockListener, InterfaceC4339a audioRecordButtonCancelListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        AbstractC22676k.m65750j(alsoSendToChannelSelectionListener, "alsoSendToChannelSelectionListener");
        AbstractC22676k.m65750j(dismissActionClickListener, "dismissActionClickListener");
        AbstractC22676k.m65750j(commandsButtonClickListener, "commandsButtonClickListener");
        AbstractC22676k.m65750j(dismissSuggestionsListener, "dismissSuggestionsListener");
        AbstractC22676k.m65750j(audioRecordButtonHoldListener, "audioRecordButtonHoldListener");
        AbstractC22676k.m65750j(audioRecordButtonLockListener, "audioRecordButtonLockListener");
        AbstractC22676k.m65750j(audioRecordButtonCancelListener, "audioRecordButtonCancelListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, pollSubmissionListener, mentionSelectionListener, commandSelectionListener, alsoSendToChannelSelectionListener, dismissActionClickListener, commandsButtonClickListener, dismissSuggestionsListener, audioRecordButtonHoldListener, audioRecordButtonLockListener, audioRecordButtonCancelListener, null, null, null, null, null, null, null, 16646144, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5, InterfaceC4339a interfaceC4339a6) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, function5, function6, function7, function8, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, interfaceC4339a6, null, null, null, null, null, null, null, 16646144, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener, Function1 mentionSelectionListener, Function1 commandSelectionListener, Function1 alsoSendToChannelSelectionListener, InterfaceC4339a dismissActionClickListener, InterfaceC4339a commandsButtonClickListener, InterfaceC4339a dismissSuggestionsListener, InterfaceC4339a audioRecordButtonHoldListener, InterfaceC4339a audioRecordButtonLockListener, InterfaceC4339a audioRecordButtonCancelListener, InterfaceC4339a audioRecordButtonReleaseListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        AbstractC22676k.m65750j(alsoSendToChannelSelectionListener, "alsoSendToChannelSelectionListener");
        AbstractC22676k.m65750j(dismissActionClickListener, "dismissActionClickListener");
        AbstractC22676k.m65750j(commandsButtonClickListener, "commandsButtonClickListener");
        AbstractC22676k.m65750j(dismissSuggestionsListener, "dismissSuggestionsListener");
        AbstractC22676k.m65750j(audioRecordButtonHoldListener, "audioRecordButtonHoldListener");
        AbstractC22676k.m65750j(audioRecordButtonLockListener, "audioRecordButtonLockListener");
        AbstractC22676k.m65750j(audioRecordButtonCancelListener, "audioRecordButtonCancelListener");
        AbstractC22676k.m65750j(audioRecordButtonReleaseListener, "audioRecordButtonReleaseListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, pollSubmissionListener, mentionSelectionListener, commandSelectionListener, alsoSendToChannelSelectionListener, dismissActionClickListener, commandsButtonClickListener, dismissSuggestionsListener, audioRecordButtonHoldListener, audioRecordButtonLockListener, audioRecordButtonCancelListener, audioRecordButtonReleaseListener, null, null, null, null, null, null, 16515072, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5, InterfaceC4339a interfaceC4339a6, InterfaceC4339a interfaceC4339a7) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, function5, function6, function7, function8, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, interfaceC4339a6, interfaceC4339a7, null, null, null, null, null, null, 16515072, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener, Function1 mentionSelectionListener, Function1 commandSelectionListener, Function1 alsoSendToChannelSelectionListener, InterfaceC4339a dismissActionClickListener, InterfaceC4339a commandsButtonClickListener, InterfaceC4339a dismissSuggestionsListener, InterfaceC4339a audioRecordButtonHoldListener, InterfaceC4339a audioRecordButtonLockListener, InterfaceC4339a audioRecordButtonCancelListener, InterfaceC4339a audioRecordButtonReleaseListener, InterfaceC4339a audioDeleteButtonClickListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        AbstractC22676k.m65750j(alsoSendToChannelSelectionListener, "alsoSendToChannelSelectionListener");
        AbstractC22676k.m65750j(dismissActionClickListener, "dismissActionClickListener");
        AbstractC22676k.m65750j(commandsButtonClickListener, "commandsButtonClickListener");
        AbstractC22676k.m65750j(dismissSuggestionsListener, "dismissSuggestionsListener");
        AbstractC22676k.m65750j(audioRecordButtonHoldListener, "audioRecordButtonHoldListener");
        AbstractC22676k.m65750j(audioRecordButtonLockListener, "audioRecordButtonLockListener");
        AbstractC22676k.m65750j(audioRecordButtonCancelListener, "audioRecordButtonCancelListener");
        AbstractC22676k.m65750j(audioRecordButtonReleaseListener, "audioRecordButtonReleaseListener");
        AbstractC22676k.m65750j(audioDeleteButtonClickListener, "audioDeleteButtonClickListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, pollSubmissionListener, mentionSelectionListener, commandSelectionListener, alsoSendToChannelSelectionListener, dismissActionClickListener, commandsButtonClickListener, dismissSuggestionsListener, audioRecordButtonHoldListener, audioRecordButtonLockListener, audioRecordButtonCancelListener, audioRecordButtonReleaseListener, audioDeleteButtonClickListener, null, null, null, null, null, 16252928, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5, InterfaceC4339a interfaceC4339a6, InterfaceC4339a interfaceC4339a7, InterfaceC4339a interfaceC4339a8) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, function5, function6, function7, function8, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, interfaceC4339a6, interfaceC4339a7, interfaceC4339a8, null, null, null, null, null, 16252928, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener, Function1 mentionSelectionListener, Function1 commandSelectionListener, Function1 alsoSendToChannelSelectionListener, InterfaceC4339a dismissActionClickListener, InterfaceC4339a commandsButtonClickListener, InterfaceC4339a dismissSuggestionsListener, InterfaceC4339a audioRecordButtonHoldListener, InterfaceC4339a audioRecordButtonLockListener, InterfaceC4339a audioRecordButtonCancelListener, InterfaceC4339a audioRecordButtonReleaseListener, InterfaceC4339a audioDeleteButtonClickListener, InterfaceC4339a audioStopButtonClickListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        AbstractC22676k.m65750j(alsoSendToChannelSelectionListener, "alsoSendToChannelSelectionListener");
        AbstractC22676k.m65750j(dismissActionClickListener, "dismissActionClickListener");
        AbstractC22676k.m65750j(commandsButtonClickListener, "commandsButtonClickListener");
        AbstractC22676k.m65750j(dismissSuggestionsListener, "dismissSuggestionsListener");
        AbstractC22676k.m65750j(audioRecordButtonHoldListener, "audioRecordButtonHoldListener");
        AbstractC22676k.m65750j(audioRecordButtonLockListener, "audioRecordButtonLockListener");
        AbstractC22676k.m65750j(audioRecordButtonCancelListener, "audioRecordButtonCancelListener");
        AbstractC22676k.m65750j(audioRecordButtonReleaseListener, "audioRecordButtonReleaseListener");
        AbstractC22676k.m65750j(audioDeleteButtonClickListener, "audioDeleteButtonClickListener");
        AbstractC22676k.m65750j(audioStopButtonClickListener, "audioStopButtonClickListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, pollSubmissionListener, mentionSelectionListener, commandSelectionListener, alsoSendToChannelSelectionListener, dismissActionClickListener, commandsButtonClickListener, dismissSuggestionsListener, audioRecordButtonHoldListener, audioRecordButtonLockListener, audioRecordButtonCancelListener, audioRecordButtonReleaseListener, audioDeleteButtonClickListener, audioStopButtonClickListener, null, null, null, null, 15728640, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5, InterfaceC4339a interfaceC4339a6, InterfaceC4339a interfaceC4339a7, InterfaceC4339a interfaceC4339a8, InterfaceC4339a interfaceC4339a9) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, function5, function6, function7, function8, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, interfaceC4339a6, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, null, null, null, null, 15728640, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener, Function1 mentionSelectionListener, Function1 commandSelectionListener, Function1 alsoSendToChannelSelectionListener, InterfaceC4339a dismissActionClickListener, InterfaceC4339a commandsButtonClickListener, InterfaceC4339a dismissSuggestionsListener, InterfaceC4339a audioRecordButtonHoldListener, InterfaceC4339a audioRecordButtonLockListener, InterfaceC4339a audioRecordButtonCancelListener, InterfaceC4339a audioRecordButtonReleaseListener, InterfaceC4339a audioDeleteButtonClickListener, InterfaceC4339a audioStopButtonClickListener, InterfaceC4339a audioPlaybackButtonClickListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        AbstractC22676k.m65750j(alsoSendToChannelSelectionListener, "alsoSendToChannelSelectionListener");
        AbstractC22676k.m65750j(dismissActionClickListener, "dismissActionClickListener");
        AbstractC22676k.m65750j(commandsButtonClickListener, "commandsButtonClickListener");
        AbstractC22676k.m65750j(dismissSuggestionsListener, "dismissSuggestionsListener");
        AbstractC22676k.m65750j(audioRecordButtonHoldListener, "audioRecordButtonHoldListener");
        AbstractC22676k.m65750j(audioRecordButtonLockListener, "audioRecordButtonLockListener");
        AbstractC22676k.m65750j(audioRecordButtonCancelListener, "audioRecordButtonCancelListener");
        AbstractC22676k.m65750j(audioRecordButtonReleaseListener, "audioRecordButtonReleaseListener");
        AbstractC22676k.m65750j(audioDeleteButtonClickListener, "audioDeleteButtonClickListener");
        AbstractC22676k.m65750j(audioStopButtonClickListener, "audioStopButtonClickListener");
        AbstractC22676k.m65750j(audioPlaybackButtonClickListener, "audioPlaybackButtonClickListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, pollSubmissionListener, mentionSelectionListener, commandSelectionListener, alsoSendToChannelSelectionListener, dismissActionClickListener, commandsButtonClickListener, dismissSuggestionsListener, audioRecordButtonHoldListener, audioRecordButtonLockListener, audioRecordButtonCancelListener, audioRecordButtonReleaseListener, audioDeleteButtonClickListener, audioStopButtonClickListener, audioPlaybackButtonClickListener, null, null, null, 14680064, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5, InterfaceC4339a interfaceC4339a6, InterfaceC4339a interfaceC4339a7, InterfaceC4339a interfaceC4339a8, InterfaceC4339a interfaceC4339a9, InterfaceC4339a interfaceC4339a10) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, function5, function6, function7, function8, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, interfaceC4339a6, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, interfaceC4339a10, null, null, null, 14680064, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener, Function1 mentionSelectionListener, Function1 commandSelectionListener, Function1 alsoSendToChannelSelectionListener, InterfaceC4339a dismissActionClickListener, InterfaceC4339a commandsButtonClickListener, InterfaceC4339a dismissSuggestionsListener, InterfaceC4339a audioRecordButtonHoldListener, InterfaceC4339a audioRecordButtonLockListener, InterfaceC4339a audioRecordButtonCancelListener, InterfaceC4339a audioRecordButtonReleaseListener, InterfaceC4339a audioDeleteButtonClickListener, InterfaceC4339a audioStopButtonClickListener, InterfaceC4339a audioPlaybackButtonClickListener, InterfaceC4339a audioCompleteButtonClickListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        AbstractC22676k.m65750j(alsoSendToChannelSelectionListener, "alsoSendToChannelSelectionListener");
        AbstractC22676k.m65750j(dismissActionClickListener, "dismissActionClickListener");
        AbstractC22676k.m65750j(commandsButtonClickListener, "commandsButtonClickListener");
        AbstractC22676k.m65750j(dismissSuggestionsListener, "dismissSuggestionsListener");
        AbstractC22676k.m65750j(audioRecordButtonHoldListener, "audioRecordButtonHoldListener");
        AbstractC22676k.m65750j(audioRecordButtonLockListener, "audioRecordButtonLockListener");
        AbstractC22676k.m65750j(audioRecordButtonCancelListener, "audioRecordButtonCancelListener");
        AbstractC22676k.m65750j(audioRecordButtonReleaseListener, "audioRecordButtonReleaseListener");
        AbstractC22676k.m65750j(audioDeleteButtonClickListener, "audioDeleteButtonClickListener");
        AbstractC22676k.m65750j(audioStopButtonClickListener, "audioStopButtonClickListener");
        AbstractC22676k.m65750j(audioPlaybackButtonClickListener, "audioPlaybackButtonClickListener");
        AbstractC22676k.m65750j(audioCompleteButtonClickListener, "audioCompleteButtonClickListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, pollSubmissionListener, mentionSelectionListener, commandSelectionListener, alsoSendToChannelSelectionListener, dismissActionClickListener, commandsButtonClickListener, dismissSuggestionsListener, audioRecordButtonHoldListener, audioRecordButtonLockListener, audioRecordButtonCancelListener, audioRecordButtonReleaseListener, audioDeleteButtonClickListener, audioStopButtonClickListener, audioPlaybackButtonClickListener, audioCompleteButtonClickListener, null, null, 12582912, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5, InterfaceC4339a interfaceC4339a6, InterfaceC4339a interfaceC4339a7, InterfaceC4339a interfaceC4339a8, InterfaceC4339a interfaceC4339a9, InterfaceC4339a interfaceC4339a10, InterfaceC4339a interfaceC4339a11) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, function5, function6, function7, function8, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, interfaceC4339a6, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, interfaceC4339a10, interfaceC4339a11, null, null, 12582912, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener, Function1 mentionSelectionListener, Function1 commandSelectionListener, Function1 alsoSendToChannelSelectionListener, InterfaceC4339a dismissActionClickListener, InterfaceC4339a commandsButtonClickListener, InterfaceC4339a dismissSuggestionsListener, InterfaceC4339a audioRecordButtonHoldListener, InterfaceC4339a audioRecordButtonLockListener, InterfaceC4339a audioRecordButtonCancelListener, InterfaceC4339a audioRecordButtonReleaseListener, InterfaceC4339a audioDeleteButtonClickListener, InterfaceC4339a audioStopButtonClickListener, InterfaceC4339a audioPlaybackButtonClickListener, InterfaceC4339a audioCompleteButtonClickListener, Function1 audioSliderDragStartListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        AbstractC22676k.m65750j(alsoSendToChannelSelectionListener, "alsoSendToChannelSelectionListener");
        AbstractC22676k.m65750j(dismissActionClickListener, "dismissActionClickListener");
        AbstractC22676k.m65750j(commandsButtonClickListener, "commandsButtonClickListener");
        AbstractC22676k.m65750j(dismissSuggestionsListener, "dismissSuggestionsListener");
        AbstractC22676k.m65750j(audioRecordButtonHoldListener, "audioRecordButtonHoldListener");
        AbstractC22676k.m65750j(audioRecordButtonLockListener, "audioRecordButtonLockListener");
        AbstractC22676k.m65750j(audioRecordButtonCancelListener, "audioRecordButtonCancelListener");
        AbstractC22676k.m65750j(audioRecordButtonReleaseListener, "audioRecordButtonReleaseListener");
        AbstractC22676k.m65750j(audioDeleteButtonClickListener, "audioDeleteButtonClickListener");
        AbstractC22676k.m65750j(audioStopButtonClickListener, "audioStopButtonClickListener");
        AbstractC22676k.m65750j(audioPlaybackButtonClickListener, "audioPlaybackButtonClickListener");
        AbstractC22676k.m65750j(audioCompleteButtonClickListener, "audioCompleteButtonClickListener");
        AbstractC22676k.m65750j(audioSliderDragStartListener, "audioSliderDragStartListener");
        bind$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, sendMessageButtonClickListener, textInputChangeListener, attachmentSelectionListener, attachmentRemovalListener, pollSubmissionListener, mentionSelectionListener, commandSelectionListener, alsoSendToChannelSelectionListener, dismissActionClickListener, commandsButtonClickListener, dismissSuggestionsListener, audioRecordButtonHoldListener, audioRecordButtonLockListener, audioRecordButtonCancelListener, audioRecordButtonReleaseListener, audioDeleteButtonClickListener, audioStopButtonClickListener, audioPlaybackButtonClickListener, audioCompleteButtonClickListener, audioSliderDragStartListener, null, 8388608, null);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5, InterfaceC4339a interfaceC4339a6, InterfaceC4339a interfaceC4339a7, InterfaceC4339a interfaceC4339a8, InterfaceC4339a interfaceC4339a9, InterfaceC4339a interfaceC4339a10, InterfaceC4339a interfaceC4339a11, Function1 function9) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        bindDefaults$default(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1, function2, function3, function4, function5, function6, function7, function8, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, interfaceC4339a6, interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, interfaceC4339a10, interfaceC4339a11, function9, null, 8388608, null);
    }

    public static final void bind(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 sendMessageButtonClickListener, Function1 textInputChangeListener, Function1 attachmentSelectionListener, Function1 attachmentRemovalListener, Function1 pollSubmissionListener, Function1 mentionSelectionListener, Function1 commandSelectionListener, Function1 alsoSendToChannelSelectionListener, InterfaceC4339a dismissActionClickListener, InterfaceC4339a commandsButtonClickListener, InterfaceC4339a dismissSuggestionsListener, InterfaceC4339a audioRecordButtonHoldListener, InterfaceC4339a audioRecordButtonLockListener, InterfaceC4339a audioRecordButtonCancelListener, InterfaceC4339a audioRecordButtonReleaseListener, InterfaceC4339a audioDeleteButtonClickListener, InterfaceC4339a audioStopButtonClickListener, InterfaceC4339a audioPlaybackButtonClickListener, InterfaceC4339a audioCompleteButtonClickListener, Function1 audioSliderDragStartListener, Function1 audioSliderDragStopListener) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        AbstractC22676k.m65750j(sendMessageButtonClickListener, "sendMessageButtonClickListener");
        AbstractC22676k.m65750j(textInputChangeListener, "textInputChangeListener");
        AbstractC22676k.m65750j(attachmentSelectionListener, "attachmentSelectionListener");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        AbstractC22676k.m65750j(pollSubmissionListener, "pollSubmissionListener");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        AbstractC22676k.m65750j(alsoSendToChannelSelectionListener, "alsoSendToChannelSelectionListener");
        AbstractC22676k.m65750j(dismissActionClickListener, "dismissActionClickListener");
        AbstractC22676k.m65750j(commandsButtonClickListener, "commandsButtonClickListener");
        AbstractC22676k.m65750j(dismissSuggestionsListener, "dismissSuggestionsListener");
        AbstractC22676k.m65750j(audioRecordButtonHoldListener, "audioRecordButtonHoldListener");
        AbstractC22676k.m65750j(audioRecordButtonLockListener, "audioRecordButtonLockListener");
        AbstractC22676k.m65750j(audioRecordButtonCancelListener, "audioRecordButtonCancelListener");
        AbstractC22676k.m65750j(audioRecordButtonReleaseListener, "audioRecordButtonReleaseListener");
        AbstractC22676k.m65750j(audioDeleteButtonClickListener, "audioDeleteButtonClickListener");
        AbstractC22676k.m65750j(audioStopButtonClickListener, "audioStopButtonClickListener");
        AbstractC22676k.m65750j(audioPlaybackButtonClickListener, "audioPlaybackButtonClickListener");
        AbstractC22676k.m65750j(audioCompleteButtonClickListener, "audioCompleteButtonClickListener");
        AbstractC22676k.m65750j(audioSliderDragStartListener, "audioSliderDragStartListener");
        AbstractC22676k.m65750j(audioSliderDragStopListener, "audioSliderDragStopListener");
        view.setSendMessageButtonClickListener(new C15310j(sendMessageButtonClickListener, messageBuilder, 2));
        view.setTextInputChangeListener(textInputChangeListener);
        view.setAttachmentSelectionListener(attachmentSelectionListener);
        view.setAttachmentRemovalListener(attachmentRemovalListener);
        view.setPollSubmissionListener(pollSubmissionListener);
        view.setMentionSelectionListener(mentionSelectionListener);
        view.setCommandSelectionListener(commandSelectionListener);
        view.setAlsoSendToChannelSelectionListener(alsoSendToChannelSelectionListener);
        view.setDismissActionClickListener(dismissActionClickListener);
        view.setCommandsButtonClickListener(commandsButtonClickListener);
        view.setDismissSuggestionsListener(dismissSuggestionsListener);
        view.setAudioRecordButtonHoldListener(audioRecordButtonHoldListener);
        view.setAudioRecordButtonLockListener(audioRecordButtonLockListener);
        view.setAudioRecordButtonCancelListener(audioRecordButtonCancelListener);
        view.setAudioRecordButtonReleaseListener(audioRecordButtonReleaseListener);
        view.setAudioDeleteButtonClickListener(audioDeleteButtonClickListener);
        view.setAudioStopButtonClickListener(audioStopButtonClickListener);
        view.setAudioPlaybackButtonClickListener(audioPlaybackButtonClickListener);
        view.setAudioCompleteButtonClickListener(audioCompleteButtonClickListener);
        view.setAudioSliderDragStartListener(audioSliderDragStartListener);
        view.setAudioSliderDragStopListener(audioSliderDragStopListener);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(lifecycleOwner), null, null, new MessageComposerViewModelBinding$bindView$3(messageComposerViewModel, view, null), 3);
    }

    public static final void bindDefaults(MessageComposerViewModel messageComposerViewModel, MessageComposerView view, InterfaceC1585g0 lifecycleOwner, InterfaceC4339a messageBuilder, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, Function1 function7, Function1 function8, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, InterfaceC4339a interfaceC4339a5, InterfaceC4339a interfaceC4339a6, InterfaceC4339a interfaceC4339a7, InterfaceC4339a interfaceC4339a8, InterfaceC4339a interfaceC4339a9, InterfaceC4339a interfaceC4339a10, InterfaceC4339a interfaceC4339a11, Function1 function9, Function1 function10) {
        AbstractC22676k.m65750j(messageComposerViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(messageBuilder, "messageBuilder");
        boolean audioRecordingSendOnComplete = view.getComposerStyle$stream_chat_android_ui_components_release().getAudioRecordingSendOnComplete();
        MessageComposerViewModelDefaults messageComposerViewModelDefaults = MessageComposerViewModelDefaults.INSTANCE;
        Function1 function1And = and(messageComposerViewModelDefaults.getSendMessageButtonClickListener(messageComposerViewModel), function1);
        Function1 function1And2 = and(messageComposerViewModelDefaults.getTextInputChangeListener(messageComposerViewModel), function2);
        Function1 function1And3 = and(messageComposerViewModelDefaults.getAttachmentSelectionListener(messageComposerViewModel), function3);
        Function1 function1And4 = and(messageComposerViewModelDefaults.getAttachmentRemovalListener(messageComposerViewModel), function4);
        Function1 function1And5 = and(messageComposerViewModelDefaults.getPollSubmissionListener(messageComposerViewModel), function5);
        Function1 function1And6 = and(messageComposerViewModelDefaults.getMentionSelectionListener(messageComposerViewModel), function6);
        Function1 function1And7 = and(messageComposerViewModelDefaults.getCommandSelectionListener(messageComposerViewModel), function7);
        Function1 function1And8 = and(messageComposerViewModelDefaults.getAlsoSendToChannelSelectionListener(messageComposerViewModel), function8);
        InterfaceC4339a interfaceC4339aAnd = and(messageComposerViewModelDefaults.getDismissActionClickListener(messageComposerViewModel), interfaceC4339a);
        InterfaceC4339a interfaceC4339aAnd2 = and(messageComposerViewModelDefaults.getCommandsButtonClickListener(messageComposerViewModel), interfaceC4339a2);
        InterfaceC4339a interfaceC4339aAnd3 = and(messageComposerViewModelDefaults.getDismissSuggestionsListener(messageComposerViewModel), interfaceC4339a3);
        InterfaceC4339a interfaceC4339aAnd4 = and(messageComposerViewModelDefaults.getAudioRecordButtonHoldListener(messageComposerViewModel), interfaceC4339a4);
        InterfaceC4339a interfaceC4339aAnd5 = and(messageComposerViewModelDefaults.getAudioRecordButtonLockListener(messageComposerViewModel), interfaceC4339a5);
        InterfaceC4339a interfaceC4339aAnd6 = and(messageComposerViewModelDefaults.getAudioRecordButtonCancelListener(messageComposerViewModel), interfaceC4339a6);
        messageComposerViewModelDefaults.getClass();
        InterfaceC4339a interfaceC4339aAnd7 = and(messageComposerViewModelDefaults.defaultAudioRecordingFinishedListener(messageComposerViewModel, audioRecordingSendOnComplete), interfaceC4339a7);
        InterfaceC4339a interfaceC4339aAnd8 = and(messageComposerViewModelDefaults.getAudioDeleteButtonClickListener(messageComposerViewModel), interfaceC4339a8);
        InterfaceC4339a interfaceC4339aAnd9 = and(messageComposerViewModelDefaults.getAudioStopButtonClickListener(messageComposerViewModel), interfaceC4339a9);
        InterfaceC4339a interfaceC4339aAnd10 = and(messageComposerViewModelDefaults.getAudioPlaybackButtonClickListener(messageComposerViewModel), interfaceC4339a10);
        messageComposerViewModelDefaults.getClass();
        bind(messageComposerViewModel, view, lifecycleOwner, messageBuilder, function1And, function1And2, function1And3, function1And4, function1And5, function1And6, function1And7, function1And8, interfaceC4339aAnd, interfaceC4339aAnd2, interfaceC4339aAnd3, interfaceC4339aAnd4, interfaceC4339aAnd5, interfaceC4339aAnd6, interfaceC4339aAnd7, interfaceC4339aAnd8, interfaceC4339aAnd9, interfaceC4339aAnd10, and(messageComposerViewModelDefaults.defaultAudioRecordingFinishedListener(messageComposerViewModel, audioRecordingSendOnComplete), interfaceC4339a11), and(messageComposerViewModelDefaults.getAudioSliderDragStartListener(messageComposerViewModel), function9), and(messageComposerViewModelDefaults.getAudioSliderDragStopListener(messageComposerViewModel), function10));
    }
}
