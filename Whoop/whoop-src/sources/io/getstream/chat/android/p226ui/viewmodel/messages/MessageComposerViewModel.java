package io.getstream.chat.android.p226ui.viewmodel.messages;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import com.whoop.service.network.model.UserState;
import ec3.InterfaceC13037f2;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Command;
import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController;
import io.getstream.chat.android.p226ui.common.state.messages.MessageAction;
import io.getstream.chat.android.p226ui.common.state.messages.MessageInput;
import io.getstream.chat.android.p226ui.common.state.messages.MessageMode;
import io.getstream.chat.android.p226ui.common.state.messages.composer.MessageComposerState;
import java.util.List;
import o23.InterfaceC27471a;
import p213i7.C18194g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\b¢\u0006\u0004\b!\u0010\u0018J\u0015\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J)\u0010*\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020&2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020&0(H\u0007¢\u0006\u0004\b*\u0010+J)\u0010,\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\u00062\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\u0018J\u0015\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\b2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\b¢\u0006\u0004\b7\u0010\u0018J\r\u00108\u001a\u00020\b¢\u0006\u0004\b8\u0010\u0018J\r\u00109\u001a\u00020\b¢\u0006\u0004\b9\u0010\u0018J\r\u0010:\u001a\u00020\b¢\u0006\u0004\b:\u0010\u0018J\r\u0010;\u001a\u00020\b¢\u0006\u0004\b;\u0010\u0018J\r\u0010<\u001a\u00020\b¢\u0006\u0004\b<\u0010\u0018J\r\u0010=\u001a\u00020\b¢\u0006\u0004\b=\u0010\u0018J\r\u0010>\u001a\u00020\b¢\u0006\u0004\b>\u0010\u0018J+\u0010B\u001a\u00020\b2\u001c\b\u0002\u0010A\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0@\u0012\u0004\u0012\u00020\b\u0018\u00010?¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\b¢\u0006\u0004\bD\u0010\u0018J\u0015\u0010G\u001a\u00020\b2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\b¢\u0006\u0004\bI\u0010\u0018J\u000f\u0010J\u001a\u00020\bH\u0014¢\u0006\u0004\bJ\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010KR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020M0L8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020R0L8\u0006¢\u0006\f\n\u0004\bS\u0010O\u001a\u0004\bT\u0010Q¨\u0006U"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;", "Landroidx/lifecycle/w1;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;", "messageComposerController", "<init>", "(Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;)V", "", "value", "Ll83/a0;", "setMessageInput", "(Ljava/lang/String;)V", "", "alsoSendToChannel", "setAlsoSendToChannel", "(Z)V", "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;", "messageMode", "setMessageMode", "(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V", "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "messageAction", "performMessageAction", "(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V", "dismissMessageActions", "()V", "", "Lio/getstream/chat/android/models/Attachment;", "attachments", "addAttachments", "(Ljava/util/List;)V", "attachment", "removeAttachment", "(Lio/getstream/chat/android/models/Attachment;)V", "clearAttachments", "Lio/getstream/chat/android/models/CreatePollParams;", "createPollParams", "createPoll", "(Lio/getstream/chat/android/models/CreatePollParams;)V", "Lio/getstream/chat/android/models/Message;", "message", "Lo23/a;", "callback", "sendMessage", "(Lio/getstream/chat/android/models/Message;Lo23/a;)V", "buildNewMessage", "(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/Message;", "leaveThread", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "selectMention", "(Lio/getstream/chat/android/models/User;)V", "Lio/getstream/chat/android/models/Command;", "command", "selectCommand", "(Lio/getstream/chat/android/models/Command;)V", "toggleCommandsVisibility", "clearData", "dismissSuggestionsPopup", "startRecording", "lockRecording", "cancelRecording", "stopRecording", "toggleRecordingPlayback", "Lkotlin/Function1;", "Ln23/h;", "onComplete", "completeRecording", "(Lkotlin/jvm/functions/Function1;)V", "pauseRecording", "", NotificationCompat.CATEGORY_PROGRESS, "seekRecordingTo", "(F)V", "sendRecording", "onCleared", "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;", "Lec3/f2;", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;", "messageComposerState", "Lec3/f2;", "getMessageComposerState", "()Lec3/f2;", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput;", "messageInput", "getMessageInput", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageComposerViewModel extends AbstractC1637w1 {
    private final MessageComposerController messageComposerController;
    private final InterfaceC13037f2 messageComposerState;
    private final InterfaceC13037f2 messageInput;

    public MessageComposerViewModel(MessageComposerController messageComposerController) {
        AbstractC22676k.m65750j(messageComposerController, "messageComposerController");
        this.messageComposerController = messageComposerController;
        this.messageComposerState = messageComposerController.getState();
        this.messageInput = messageComposerController.getMessageInput();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Message buildNewMessage$default(MessageComposerViewModel messageComposerViewModel, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = ((MessageInput) messageComposerViewModel.messageInput.getValue()).getText();
        }
        if ((i13 & 2) != 0) {
            list = ((MessageComposerState) messageComposerViewModel.messageComposerState.getValue()).getAttachments();
        }
        return messageComposerViewModel.buildNewMessage(str, list);
    }

    public static /* synthetic */ void completeRecording$default(MessageComposerViewModel messageComposerViewModel, Function1 function1, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            function1 = null;
        }
        messageComposerViewModel.completeRecording(function1);
    }

    public static /* synthetic */ void sendMessage$default(MessageComposerViewModel messageComposerViewModel, Message message, InterfaceC27471a interfaceC27471a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            message = buildNewMessage$default(messageComposerViewModel, null, null, 3, null);
        }
        if ((i13 & 2) != 0) {
            interfaceC27471a = new C18194g(13);
        }
        messageComposerViewModel.sendMessage(message, interfaceC27471a);
    }

    public final void addAttachments(List<Attachment> attachments) {
        AbstractC22676k.m65750j(attachments, "attachments");
        this.messageComposerController.addAttachments(attachments);
    }

    public final Message buildNewMessage() {
        return buildNewMessage$default(this, null, null, 3, null);
    }

    public final void cancelRecording() {
        this.messageComposerController.cancelRecording();
    }

    public final void clearAttachments() {
        this.messageComposerController.clearAttachments();
    }

    public final void clearData() {
        this.messageComposerController.clearData();
    }

    public final void completeRecording(Function1 onComplete) {
        this.messageComposerController.completeRecording(onComplete);
    }

    public final void createPoll(CreatePollParams createPollParams) {
        AbstractC22676k.m65750j(createPollParams, "createPollParams");
        MessageComposerController.createPoll$default(this.messageComposerController, createPollParams, null, 2, null);
    }

    public final void dismissMessageActions() {
        this.messageComposerController.dismissMessageActions();
    }

    public final void dismissSuggestionsPopup() {
        this.messageComposerController.dismissSuggestionsPopup();
    }

    public final InterfaceC13037f2 getMessageComposerState() {
        return this.messageComposerState;
    }

    public final InterfaceC13037f2 getMessageInput() {
        return this.messageInput;
    }

    public final void leaveThread() {
        this.messageComposerController.leaveThread();
    }

    public final void lockRecording() {
        this.messageComposerController.lockRecording();
    }

    @Override // androidx.lifecycle.AbstractC1637w1
    public final void onCleared() {
        super.onCleared();
        this.messageComposerController.onCleared();
    }

    public final void pauseRecording() {
        this.messageComposerController.pauseRecording();
    }

    public final void performMessageAction(MessageAction messageAction) {
        AbstractC22676k.m65750j(messageAction, "messageAction");
        this.messageComposerController.performMessageAction(messageAction);
    }

    public final void removeAttachment(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        this.messageComposerController.removeAttachment(attachment);
    }

    public final void seekRecordingTo(float progress) {
        this.messageComposerController.seekRecordingTo(progress);
    }

    public final void selectCommand(Command command) {
        AbstractC22676k.m65750j(command, "command");
        this.messageComposerController.selectCommand(command);
    }

    public final void selectMention(User user) {
        AbstractC22676k.m65750j(user, "user");
        this.messageComposerController.selectMention(user);
    }

    public final void sendMessage() {
        sendMessage$default(this, null, null, 3, null);
    }

    public final void sendRecording() {
        this.messageComposerController.sendRecording();
    }

    public final void setAlsoSendToChannel(boolean alsoSendToChannel) {
        this.messageComposerController.setAlsoSendToChannel(alsoSendToChannel);
    }

    public final void setMessageInput(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.messageComposerController.setMessageInput(value);
    }

    public final void setMessageMode(MessageMode messageMode) {
        AbstractC22676k.m65750j(messageMode, "messageMode");
        this.messageComposerController.setMessageMode(messageMode);
    }

    public final void startRecording() {
        this.messageComposerController.startRecording();
    }

    public final void stopRecording() {
        this.messageComposerController.stopRecording();
    }

    public final void toggleCommandsVisibility() {
        this.messageComposerController.toggleCommandsVisibility();
    }

    public final void toggleRecordingPlayback() {
        this.messageComposerController.toggleRecordingPlayback();
    }

    public final Message buildNewMessage(String message) {
        AbstractC22676k.m65750j(message, "message");
        return buildNewMessage$default(this, message, null, 2, null);
    }

    public final void sendMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        sendMessage$default(this, message, null, 2, null);
    }

    public final Message buildNewMessage(String message, List<Attachment> attachments) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(attachments, "attachments");
        return this.messageComposerController.buildNewMessage(message, attachments);
    }

    public final void sendMessage(Message message, InterfaceC27471a callback) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(callback, "callback");
        MessageComposerController.sendMessage$default(this.messageComposerController, message, callback, null, 4, null);
    }
}
