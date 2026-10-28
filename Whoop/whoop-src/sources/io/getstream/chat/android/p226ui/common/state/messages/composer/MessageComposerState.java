package io.getstream.chat.android.p226ui.common.state.messages.composer;

import androidx.profileinstaller.ProfileVerifier;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Command;
import io.getstream.chat.android.models.LinkPreview;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.Mention;
import io.getstream.chat.android.p226ui.common.state.messages.MessageAction;
import io.getstream.chat.android.p226ui.common.state.messages.MessageMode;
import java.util.List;
import java.util.Set;
import jh3.AbstractC21702c;
import m83.C25235a0;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0001\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0018\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\"\u0010#J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010H\u001a\u00020\u0012HÆ\u0003J\t\u0010I\u001a\u00020\u0014HÆ\u0003J\t\u0010J\u001a\u00020\u0016HÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018HÆ\u0003J\t\u0010L\u001a\u00020\u0016HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010N\u001a\u00020\u001cHÆ\u0003J\t\u0010O\u001a\u00020\u0016HÆ\u0003J\t\u0010P\u001a\u00020\u0016HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020 0\u0018HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jé\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u00162\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00182\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010T\u001a\u00020\u00162\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020\u0012HÖ\u0001J\t\u0010W\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0019\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u001d\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b<\u00104R\u0011\u0010\u001e\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0018¢\u0006\b\n\u0000\u001a\u0004\b>\u00106R\u0013\u0010!\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@¨\u0006X"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;", "", "inputValue", "", "attachments", "", "Lio/getstream/chat/android/models/Attachment;", "action", "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "validationErrors", "Lio/getstream/chat/android/ui/common/state/messages/composer/ValidationError;", "mentionSuggestions", "Lio/getstream/chat/android/models/User;", "commandSuggestions", "Lio/getstream/chat/android/models/Command;", "linkPreview", "Lio/getstream/chat/android/models/LinkPreview;", "coolDownTime", "", "messageMode", "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;", "alsoSendToChannel", "", "ownCapabilities", "", "hasCommands", "currentUser", "recording", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;", "pollsEnabled", "sendEnabled", "selectedMentions", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;", "activeCommand", "<init>", "(Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/LinkPreview;ILio/getstream/chat/android/ui/common/state/messages/MessageMode;ZLjava/util/Set;ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;ZZLjava/util/Set;Lio/getstream/chat/android/models/Command;)V", "getInputValue", "()Ljava/lang/String;", "getAttachments", "()Ljava/util/List;", "getAction", "()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "getValidationErrors", "getMentionSuggestions", "getCommandSuggestions", "getLinkPreview", "()Lio/getstream/chat/android/models/LinkPreview;", "getCoolDownTime", "()I", "getMessageMode", "()Lio/getstream/chat/android/ui/common/state/messages/MessageMode;", "getAlsoSendToChannel", "()Z", "getOwnCapabilities", "()Ljava/util/Set;", "getHasCommands", "getCurrentUser", "()Lio/getstream/chat/android/models/User;", "getRecording", "()Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;", "getPollsEnabled", "getSendEnabled", "getSelectedMentions", "getActiveCommand", "()Lio/getstream/chat/android/models/Command;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageComposerState {
    public static final int $stable = 8;
    private final MessageAction action;
    private final Command activeCommand;
    private final boolean alsoSendToChannel;
    private final List<Attachment> attachments;
    private final List<Command> commandSuggestions;
    private final int coolDownTime;
    private final User currentUser;
    private final boolean hasCommands;
    private final String inputValue;
    private final LinkPreview linkPreview;
    private final List<User> mentionSuggestions;
    private final MessageMode messageMode;
    private final Set<String> ownCapabilities;
    private final boolean pollsEnabled;
    private final RecordingState recording;
    private final Set<Mention> selectedMentions;
    private final boolean sendEnabled;
    private final List<ValidationError> validationErrors;

    public MessageComposerState() {
        this(null, null, null, null, null, null, null, 0, null, false, null, false, null, null, false, false, null, null, 262143, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageComposerState copy$default(MessageComposerState messageComposerState, String str, List list, MessageAction messageAction, List list2, List list3, List list4, LinkPreview linkPreview, int i13, MessageMode messageMode, boolean z4, Set set, boolean z13, User user, RecordingState recordingState, boolean z14, boolean z15, Set set2, Command command, int i14, Object obj) {
        Command command2;
        Set set3;
        String str2 = (i14 & 1) != 0 ? messageComposerState.inputValue : str;
        List list5 = (i14 & 2) != 0 ? messageComposerState.attachments : list;
        MessageAction messageAction2 = (i14 & 4) != 0 ? messageComposerState.action : messageAction;
        List list6 = (i14 & 8) != 0 ? messageComposerState.validationErrors : list2;
        List list7 = (i14 & 16) != 0 ? messageComposerState.mentionSuggestions : list3;
        List list8 = (i14 & 32) != 0 ? messageComposerState.commandSuggestions : list4;
        LinkPreview linkPreview2 = (i14 & 64) != 0 ? messageComposerState.linkPreview : linkPreview;
        int i15 = (i14 & 128) != 0 ? messageComposerState.coolDownTime : i13;
        MessageMode messageMode2 = (i14 & 256) != 0 ? messageComposerState.messageMode : messageMode;
        boolean z16 = (i14 & 512) != 0 ? messageComposerState.alsoSendToChannel : z4;
        Set set4 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageComposerState.ownCapabilities : set;
        boolean z17 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageComposerState.hasCommands : z13;
        User user2 = (i14 & 4096) != 0 ? messageComposerState.currentUser : user;
        RecordingState recordingState2 = (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageComposerState.recording : recordingState;
        String str3 = str2;
        boolean z18 = (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageComposerState.pollsEnabled : z14;
        boolean z19 = (i14 & 32768) != 0 ? messageComposerState.sendEnabled : z15;
        Set set5 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageComposerState.selectedMentions : set2;
        if ((i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            set3 = set5;
            command2 = messageComposerState.activeCommand;
        } else {
            command2 = command;
            set3 = set5;
        }
        return messageComposerState.copy(str3, list5, messageAction2, list6, list7, list8, linkPreview2, i15, messageMode2, z16, set4, z17, user2, recordingState2, z18, z19, set3, command2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInputValue() {
        return this.inputValue;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getAlsoSendToChannel() {
        return this.alsoSendToChannel;
    }

    public final Set<String> component11() {
        return this.ownCapabilities;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getHasCommands() {
        return this.hasCommands;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final User getCurrentUser() {
        return this.currentUser;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final RecordingState getRecording() {
        return this.recording;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getPollsEnabled() {
        return this.pollsEnabled;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getSendEnabled() {
        return this.sendEnabled;
    }

    public final Set<Mention> component17() {
        return this.selectedMentions;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Command getActiveCommand() {
        return this.activeCommand;
    }

    public final List<Attachment> component2() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MessageAction getAction() {
        return this.action;
    }

    public final List<ValidationError> component4() {
        return this.validationErrors;
    }

    public final List<User> component5() {
        return this.mentionSuggestions;
    }

    public final List<Command> component6() {
        return this.commandSuggestions;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final LinkPreview getLinkPreview() {
        return this.linkPreview;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getCoolDownTime() {
        return this.coolDownTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final MessageMode getMessageMode() {
        return this.messageMode;
    }

    public final MessageComposerState copy(String inputValue, List<Attachment> attachments, MessageAction action, List<? extends ValidationError> validationErrors, List<User> mentionSuggestions, List<Command> commandSuggestions, LinkPreview linkPreview, int coolDownTime, MessageMode messageMode, boolean alsoSendToChannel, Set<String> ownCapabilities, boolean hasCommands, User currentUser, RecordingState recording, boolean pollsEnabled, boolean sendEnabled, Set<? extends Mention> selectedMentions, Command activeCommand) {
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(mentionSuggestions, "mentionSuggestions");
        AbstractC22676k.m65750j(commandSuggestions, "commandSuggestions");
        AbstractC22676k.m65750j(messageMode, "messageMode");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(recording, "recording");
        AbstractC22676k.m65750j(selectedMentions, "selectedMentions");
        return new MessageComposerState(inputValue, attachments, action, validationErrors, mentionSuggestions, commandSuggestions, linkPreview, coolDownTime, messageMode, alsoSendToChannel, ownCapabilities, hasCommands, currentUser, recording, pollsEnabled, sendEnabled, selectedMentions, activeCommand);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageComposerState)) {
            return false;
        }
        MessageComposerState messageComposerState = (MessageComposerState) other;
        return AbstractC22676k.m65745e(this.inputValue, messageComposerState.inputValue) && AbstractC22676k.m65745e(this.attachments, messageComposerState.attachments) && AbstractC22676k.m65745e(this.action, messageComposerState.action) && AbstractC22676k.m65745e(this.validationErrors, messageComposerState.validationErrors) && AbstractC22676k.m65745e(this.mentionSuggestions, messageComposerState.mentionSuggestions) && AbstractC22676k.m65745e(this.commandSuggestions, messageComposerState.commandSuggestions) && AbstractC22676k.m65745e(this.linkPreview, messageComposerState.linkPreview) && this.coolDownTime == messageComposerState.coolDownTime && AbstractC22676k.m65745e(this.messageMode, messageComposerState.messageMode) && this.alsoSendToChannel == messageComposerState.alsoSendToChannel && AbstractC22676k.m65745e(this.ownCapabilities, messageComposerState.ownCapabilities) && this.hasCommands == messageComposerState.hasCommands && AbstractC22676k.m65745e(this.currentUser, messageComposerState.currentUser) && AbstractC22676k.m65745e(this.recording, messageComposerState.recording) && this.pollsEnabled == messageComposerState.pollsEnabled && this.sendEnabled == messageComposerState.sendEnabled && AbstractC22676k.m65745e(this.selectedMentions, messageComposerState.selectedMentions) && AbstractC22676k.m65745e(this.activeCommand, messageComposerState.activeCommand);
    }

    public final MessageAction getAction() {
        return this.action;
    }

    public final Command getActiveCommand() {
        return this.activeCommand;
    }

    public final boolean getAlsoSendToChannel() {
        return this.alsoSendToChannel;
    }

    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final List<Command> getCommandSuggestions() {
        return this.commandSuggestions;
    }

    public final int getCoolDownTime() {
        return this.coolDownTime;
    }

    public final User getCurrentUser() {
        return this.currentUser;
    }

    public final boolean getHasCommands() {
        return this.hasCommands;
    }

    public final String getInputValue() {
        return this.inputValue;
    }

    public final LinkPreview getLinkPreview() {
        return this.linkPreview;
    }

    public final List<User> getMentionSuggestions() {
        return this.mentionSuggestions;
    }

    public final MessageMode getMessageMode() {
        return this.messageMode;
    }

    public final Set<String> getOwnCapabilities() {
        return this.ownCapabilities;
    }

    public final boolean getPollsEnabled() {
        return this.pollsEnabled;
    }

    public final RecordingState getRecording() {
        return this.recording;
    }

    public final Set<Mention> getSelectedMentions() {
        return this.selectedMentions;
    }

    public final boolean getSendEnabled() {
        return this.sendEnabled;
    }

    public final List<ValidationError> getValidationErrors() {
        return this.validationErrors;
    }

    public final int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.inputValue.hashCode() * 31, 31, this.attachments);
        MessageAction messageAction = this.action;
        int iM31983b2 = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b((iM31983b + (messageAction == null ? 0 : messageAction.hashCode())) * 31, 31, this.validationErrors), 31, this.mentionSuggestions), 31, this.commandSuggestions);
        LinkPreview linkPreview = this.linkPreview;
        int iM8289b = AbstractC2875y.m8289b(AbstractC25012a.m73368a(this.ownCapabilities, AbstractC2875y.m8289b((this.messageMode.hashCode() + AbstractC11266d.m30448b(this.coolDownTime, (iM31983b2 + (linkPreview == null ? 0 : linkPreview.hashCode())) * 31, 31)) * 31, 31, this.alsoSendToChannel), 31), 31, this.hasCommands);
        User user = this.currentUser;
        int iM73368a = AbstractC25012a.m73368a(this.selectedMentions, AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.recording.hashCode() + ((iM8289b + (user == null ? 0 : user.hashCode())) * 31)) * 31, 31, this.pollsEnabled), 31, this.sendEnabled), 31);
        Command command = this.activeCommand;
        return iM73368a + (command != null ? command.hashCode() : 0);
    }

    public final String toString() {
        String str = this.inputValue;
        List<Attachment> list = this.attachments;
        MessageAction messageAction = this.action;
        List<ValidationError> list2 = this.validationErrors;
        List<User> list3 = this.mentionSuggestions;
        List<Command> list4 = this.commandSuggestions;
        LinkPreview linkPreview = this.linkPreview;
        int i13 = this.coolDownTime;
        MessageMode messageMode = this.messageMode;
        boolean z4 = this.alsoSendToChannel;
        Set<String> set = this.ownCapabilities;
        boolean z13 = this.hasCommands;
        User user = this.currentUser;
        RecordingState recordingState = this.recording;
        boolean z14 = this.pollsEnabled;
        boolean z15 = this.sendEnabled;
        Set<Mention> set2 = this.selectedMentions;
        Command command = this.activeCommand;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("MessageComposerState(inputValue=", str, ", attachments=", ", action=", list);
        sbM94766o.append(messageAction);
        sbM94766o.append(", validationErrors=");
        sbM94766o.append(list2);
        sbM94766o.append(", mentionSuggestions=");
        AbstractC21702c.m61148s(sbM94766o, list3, ", commandSuggestions=", list4, ", linkPreview=");
        sbM94766o.append(linkPreview);
        sbM94766o.append(", coolDownTime=");
        sbM94766o.append(i13);
        sbM94766o.append(", messageMode=");
        sbM94766o.append(messageMode);
        sbM94766o.append(", alsoSendToChannel=");
        sbM94766o.append(z4);
        sbM94766o.append(", ownCapabilities=");
        sbM94766o.append(set);
        sbM94766o.append(", hasCommands=");
        sbM94766o.append(z13);
        sbM94766o.append(", currentUser=");
        sbM94766o.append(user);
        sbM94766o.append(", recording=");
        sbM94766o.append(recordingState);
        sbM94766o.append(", pollsEnabled=");
        AbstractC38963t7.m124392v(sbM94766o, z14, ", sendEnabled=", z15, ", selectedMentions=");
        sbM94766o.append(set2);
        sbM94766o.append(", activeCommand=");
        sbM94766o.append(command);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue) {
        this(inputValue, null, null, null, null, null, null, 0, null, false, null, false, null, null, false, false, null, null, 262142, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue, List<Attachment> attachments) {
        this(inputValue, attachments, null, null, null, null, null, 0, null, false, null, false, null, null, false, false, null, null, 262140, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue, List<Attachment> attachments, MessageAction messageAction) {
        this(inputValue, attachments, messageAction, null, null, null, null, 0, null, false, null, false, null, null, false, false, null, null, 262136, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue, List<Attachment> attachments, MessageAction messageAction, List<? extends ValidationError> validationErrors) {
        this(inputValue, attachments, messageAction, validationErrors, null, null, null, 0, null, false, null, false, null, null, false, false, null, null, 262128, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue, List<Attachment> attachments, MessageAction messageAction, List<? extends ValidationError> validationErrors, List<User> mentionSuggestions) {
        this(inputValue, attachments, messageAction, validationErrors, mentionSuggestions, null, null, 0, null, false, null, false, null, null, false, false, null, null, 262112, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(mentionSuggestions, "mentionSuggestions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue, List<Attachment> attachments, MessageAction messageAction, List<? extends ValidationError> validationErrors, List<User> mentionSuggestions, List<Command> commandSuggestions) {
        this(inputValue, attachments, messageAction, validationErrors, mentionSuggestions, commandSuggestions, null, 0, null, false, null, false, null, null, false, false, null, null, 262080, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(mentionSuggestions, "mentionSuggestions");
        AbstractC22676k.m65750j(commandSuggestions, "commandSuggestions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue, List<Attachment> attachments, MessageAction messageAction, List<? extends ValidationError> validationErrors, List<User> mentionSuggestions, List<Command> commandSuggestions, LinkPreview linkPreview) {
        this(inputValue, attachments, messageAction, validationErrors, mentionSuggestions, commandSuggestions, linkPreview, 0, null, false, null, false, null, null, false, false, null, null, 262016, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(mentionSuggestions, "mentionSuggestions");
        AbstractC22676k.m65750j(commandSuggestions, "commandSuggestions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue, List<Attachment> attachments, MessageAction messageAction, List<? extends ValidationError> validationErrors, List<User> mentionSuggestions, List<Command> commandSuggestions, LinkPreview linkPreview, int i13) {
        this(inputValue, attachments, messageAction, validationErrors, mentionSuggestions, commandSuggestions, linkPreview, i13, null, false, null, false, null, null, false, false, null, null, 261888, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(mentionSuggestions, "mentionSuggestions");
        AbstractC22676k.m65750j(commandSuggestions, "commandSuggestions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue, List<Attachment> attachments, MessageAction messageAction, List<? extends ValidationError> validationErrors, List<User> mentionSuggestions, List<Command> commandSuggestions, LinkPreview linkPreview, int i13, MessageMode messageMode) {
        this(inputValue, attachments, messageAction, validationErrors, mentionSuggestions, commandSuggestions, linkPreview, i13, messageMode, false, null, false, null, null, false, false, null, null, 261632, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(mentionSuggestions, "mentionSuggestions");
        AbstractC22676k.m65750j(commandSuggestions, "commandSuggestions");
        AbstractC22676k.m65750j(messageMode, "messageMode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue, List<Attachment> attachments, MessageAction messageAction, List<? extends ValidationError> validationErrors, List<User> mentionSuggestions, List<Command> commandSuggestions, LinkPreview linkPreview, int i13, MessageMode messageMode, boolean z4) {
        this(inputValue, attachments, messageAction, validationErrors, mentionSuggestions, commandSuggestions, linkPreview, i13, messageMode, z4, null, false, null, null, false, false, null, null, 261120, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(mentionSuggestions, "mentionSuggestions");
        AbstractC22676k.m65750j(commandSuggestions, "commandSuggestions");
        AbstractC22676k.m65750j(messageMode, "messageMode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue, List<Attachment> attachments, MessageAction messageAction, List<? extends ValidationError> validationErrors, List<User> mentionSuggestions, List<Command> commandSuggestions, LinkPreview linkPreview, int i13, MessageMode messageMode, boolean z4, Set<String> ownCapabilities) {
        this(inputValue, attachments, messageAction, validationErrors, mentionSuggestions, commandSuggestions, linkPreview, i13, messageMode, z4, ownCapabilities, false, null, null, false, false, null, null, 260096, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(mentionSuggestions, "mentionSuggestions");
        AbstractC22676k.m65750j(commandSuggestions, "commandSuggestions");
        AbstractC22676k.m65750j(messageMode, "messageMode");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue, List<Attachment> attachments, MessageAction messageAction, List<? extends ValidationError> validationErrors, List<User> mentionSuggestions, List<Command> commandSuggestions, LinkPreview linkPreview, int i13, MessageMode messageMode, boolean z4, Set<String> ownCapabilities, boolean z13) {
        this(inputValue, attachments, messageAction, validationErrors, mentionSuggestions, commandSuggestions, linkPreview, i13, messageMode, z4, ownCapabilities, z13, null, null, false, false, null, null, 258048, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(mentionSuggestions, "mentionSuggestions");
        AbstractC22676k.m65750j(commandSuggestions, "commandSuggestions");
        AbstractC22676k.m65750j(messageMode, "messageMode");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue, List<Attachment> attachments, MessageAction messageAction, List<? extends ValidationError> validationErrors, List<User> mentionSuggestions, List<Command> commandSuggestions, LinkPreview linkPreview, int i13, MessageMode messageMode, boolean z4, Set<String> ownCapabilities, boolean z13, User user) {
        this(inputValue, attachments, messageAction, validationErrors, mentionSuggestions, commandSuggestions, linkPreview, i13, messageMode, z4, ownCapabilities, z13, user, null, false, false, null, null, 253952, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(mentionSuggestions, "mentionSuggestions");
        AbstractC22676k.m65750j(commandSuggestions, "commandSuggestions");
        AbstractC22676k.m65750j(messageMode, "messageMode");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue, List<Attachment> attachments, MessageAction messageAction, List<? extends ValidationError> validationErrors, List<User> mentionSuggestions, List<Command> commandSuggestions, LinkPreview linkPreview, int i13, MessageMode messageMode, boolean z4, Set<String> ownCapabilities, boolean z13, User user, RecordingState recording) {
        this(inputValue, attachments, messageAction, validationErrors, mentionSuggestions, commandSuggestions, linkPreview, i13, messageMode, z4, ownCapabilities, z13, user, recording, false, false, null, null, 245760, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(mentionSuggestions, "mentionSuggestions");
        AbstractC22676k.m65750j(commandSuggestions, "commandSuggestions");
        AbstractC22676k.m65750j(messageMode, "messageMode");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(recording, "recording");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue, List<Attachment> attachments, MessageAction messageAction, List<? extends ValidationError> validationErrors, List<User> mentionSuggestions, List<Command> commandSuggestions, LinkPreview linkPreview, int i13, MessageMode messageMode, boolean z4, Set<String> ownCapabilities, boolean z13, User user, RecordingState recording, boolean z14) {
        this(inputValue, attachments, messageAction, validationErrors, mentionSuggestions, commandSuggestions, linkPreview, i13, messageMode, z4, ownCapabilities, z13, user, recording, z14, false, null, null, 229376, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(mentionSuggestions, "mentionSuggestions");
        AbstractC22676k.m65750j(commandSuggestions, "commandSuggestions");
        AbstractC22676k.m65750j(messageMode, "messageMode");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(recording, "recording");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue, List<Attachment> attachments, MessageAction messageAction, List<? extends ValidationError> validationErrors, List<User> mentionSuggestions, List<Command> commandSuggestions, LinkPreview linkPreview, int i13, MessageMode messageMode, boolean z4, Set<String> ownCapabilities, boolean z13, User user, RecordingState recording, boolean z14, boolean z15) {
        this(inputValue, attachments, messageAction, validationErrors, mentionSuggestions, commandSuggestions, linkPreview, i13, messageMode, z4, ownCapabilities, z13, user, recording, z14, z15, null, null, ProfileVerifier.CompilationStatus.f6515xf2722a21, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(mentionSuggestions, "mentionSuggestions");
        AbstractC22676k.m65750j(commandSuggestions, "commandSuggestions");
        AbstractC22676k.m65750j(messageMode, "messageMode");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(recording, "recording");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerState(String inputValue, List<Attachment> attachments, MessageAction messageAction, List<? extends ValidationError> validationErrors, List<User> mentionSuggestions, List<Command> commandSuggestions, LinkPreview linkPreview, int i13, MessageMode messageMode, boolean z4, Set<String> ownCapabilities, boolean z13, User user, RecordingState recording, boolean z14, boolean z15, Set<? extends Mention> selectedMentions) {
        this(inputValue, attachments, messageAction, validationErrors, mentionSuggestions, commandSuggestions, linkPreview, i13, messageMode, z4, ownCapabilities, z13, user, recording, z14, z15, selectedMentions, null, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ, null);
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(mentionSuggestions, "mentionSuggestions");
        AbstractC22676k.m65750j(commandSuggestions, "commandSuggestions");
        AbstractC22676k.m65750j(messageMode, "messageMode");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(recording, "recording");
        AbstractC22676k.m65750j(selectedMentions, "selectedMentions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageComposerState(String inputValue, List<Attachment> attachments, MessageAction messageAction, List<? extends ValidationError> validationErrors, List<User> mentionSuggestions, List<Command> commandSuggestions, LinkPreview linkPreview, int i13, MessageMode messageMode, boolean z4, Set<String> ownCapabilities, boolean z13, User user, RecordingState recording, boolean z14, boolean z15, Set<? extends Mention> selectedMentions, Command command) {
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(attachments, "attachments");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(mentionSuggestions, "mentionSuggestions");
        AbstractC22676k.m65750j(commandSuggestions, "commandSuggestions");
        AbstractC22676k.m65750j(messageMode, "messageMode");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        AbstractC22676k.m65750j(recording, "recording");
        AbstractC22676k.m65750j(selectedMentions, "selectedMentions");
        this.inputValue = inputValue;
        this.attachments = attachments;
        this.action = messageAction;
        this.validationErrors = validationErrors;
        this.mentionSuggestions = mentionSuggestions;
        this.commandSuggestions = commandSuggestions;
        this.linkPreview = linkPreview;
        this.coolDownTime = i13;
        this.messageMode = messageMode;
        this.alsoSendToChannel = z4;
        this.ownCapabilities = ownCapabilities;
        this.hasCommands = z13;
        this.currentUser = user;
        this.recording = recording;
        this.pollsEnabled = z14;
        this.sendEnabled = z15;
        this.selectedMentions = selectedMentions;
        this.activeCommand = command;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MessageComposerState(String str, List list, MessageAction messageAction, List list2, List list3, List list4, LinkPreview linkPreview, int i13, MessageMode messageMode, boolean z4, Set set, boolean z13, User user, RecordingState recordingState, boolean z14, boolean z15, Set set2, Command command, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        String str2 = (i14 & 1) != 0 ? "" : str;
        int i15 = i14 & 2;
        List list5 = C25271y.f99162w;
        List list6 = i15 != 0 ? list5 : list;
        MessageAction messageAction2 = (i14 & 4) != 0 ? null : messageAction;
        List list7 = (i14 & 8) != 0 ? list5 : list2;
        List list8 = (i14 & 16) != 0 ? list5 : list3;
        list5 = (i14 & 32) == 0 ? list4 : list5;
        LinkPreview linkPreview2 = (i14 & 64) != 0 ? null : linkPreview;
        int i16 = (i14 & 128) != 0 ? 0 : i13;
        MessageMode messageMode2 = (i14 & 256) != 0 ? MessageMode.Normal.INSTANCE : messageMode;
        boolean z16 = (i14 & 512) != 0 ? false : z4;
        int i17 = i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        Set set3 = C25235a0.f99113w;
        this(str2, list6, messageAction2, list7, list8, list5, linkPreview2, i16, messageMode2, z16, i17 != 0 ? set3 : set, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z13, (i14 & 4096) != 0 ? null : user, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? RecordingState.Idle.INSTANCE : recordingState, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z14, (i14 & 32768) != 0 ? true : z15, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 0 ? set2 : set3, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : command);
    }
}
