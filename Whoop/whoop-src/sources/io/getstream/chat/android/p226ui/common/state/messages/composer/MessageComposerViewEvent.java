package io.getstream.chat.android.p226ui.common.state.messages.composer;

import io.getstream.chat.android.p226ui.common.state.messages.MessageAction;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent;", "", "CommandUnavailable", "CancelCommandRequired", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MessageComposerViewEvent {

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent$CancelCommandRequired;", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent;", "action", "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "<init>", "(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V", "getAction", "()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class CancelCommandRequired implements MessageComposerViewEvent {
        public static final int $stable = 0;
        private final MessageAction action;

        public CancelCommandRequired(MessageAction action) {
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        public static /* synthetic */ CancelCommandRequired copy$default(CancelCommandRequired cancelCommandRequired, MessageAction messageAction, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                messageAction = cancelCommandRequired.action;
            }
            return cancelCommandRequired.copy(messageAction);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MessageAction getAction() {
            return this.action;
        }

        public final CancelCommandRequired copy(MessageAction action) {
            AbstractC22676k.m65750j(action, "action");
            return new CancelCommandRequired(action);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CancelCommandRequired) && AbstractC22676k.m65745e(this.action, ((CancelCommandRequired) other).action);
        }

        public final MessageAction getAction() {
            return this.action;
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final String toString() {
            return "CancelCommandRequired(action=" + this.action + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent$CommandUnavailable;", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent;", "action", "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "<init>", "(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V", "getAction", "()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class CommandUnavailable implements MessageComposerViewEvent {
        public static final int $stable = 0;
        private final MessageAction action;

        public CommandUnavailable(MessageAction action) {
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        public static /* synthetic */ CommandUnavailable copy$default(CommandUnavailable commandUnavailable, MessageAction messageAction, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                messageAction = commandUnavailable.action;
            }
            return commandUnavailable.copy(messageAction);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MessageAction getAction() {
            return this.action;
        }

        public final CommandUnavailable copy(MessageAction action) {
            AbstractC22676k.m65750j(action, "action");
            return new CommandUnavailable(action);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CommandUnavailable) && AbstractC22676k.m65745e(this.action, ((CommandUnavailable) other).action);
        }

        public final MessageAction getAction() {
            return this.action;
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final String toString() {
            return "CommandUnavailable(action=" + this.action + ")";
        }
    }
}
