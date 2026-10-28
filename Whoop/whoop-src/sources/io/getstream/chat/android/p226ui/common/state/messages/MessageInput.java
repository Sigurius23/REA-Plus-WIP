package io.getstream.chat.android.p226ui.common.state.messages;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/MessageInput;", "", "text", "", "source", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;)V", "getText", "()Ljava/lang/String;", "getSource", "()Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Source", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageInput {
    public static final int $stable = 0;
    private final Source source;
    private final String text;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;", "", "<init>", "()V", "Default", "External", "Internal", "Edit", "CommandSelected", "MentionSelected", "DraftMessage", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Default;", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$External;", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Internal;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class Source {
        public static final int $stable = 0;

        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$CommandSelected;", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Internal;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class CommandSelected extends Internal {
            public static final int $stable = 0;
            public static final CommandSelected INSTANCE = new CommandSelected();

            private CommandSelected() {
            }

            public final boolean equals(Object other) {
                return this == other || (other instanceof CommandSelected);
            }

            public final int hashCode() {
                return 850715543;
            }

            public final String toString() {
                return "CommandSelected";
            }
        }

        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Default;", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class Default extends Source {
            public static final int $stable = 0;
            public static final Default INSTANCE = new Default();

            private Default() {
            }

            public final boolean equals(Object other) {
                return this == other || (other instanceof Default);
            }

            public final int hashCode() {
                return -333766702;
            }

            public final String toString() {
                return "Default";
            }
        }

        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$DraftMessage;", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Internal;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class DraftMessage extends Internal {
            public static final int $stable = 0;
            public static final DraftMessage INSTANCE = new DraftMessage();

            private DraftMessage() {
            }

            public final boolean equals(Object other) {
                return this == other || (other instanceof DraftMessage);
            }

            public final int hashCode() {
                return -2045951947;
            }

            public final String toString() {
                return "DraftMessage";
            }
        }

        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Edit;", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Internal;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class Edit extends Internal {
            public static final int $stable = 0;
            public static final Edit INSTANCE = new Edit();

            private Edit() {
            }

            public final boolean equals(Object other) {
                return this == other || (other instanceof Edit);
            }

            public final int hashCode() {
                return -1933445607;
            }

            public final String toString() {
                return "Edit";
            }
        }

        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$External;", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class External extends Source {
            public static final int $stable = 0;
            public static final External INSTANCE = new External();

            private External() {
            }

            public final boolean equals(Object other) {
                return this == other || (other instanceof External);
            }

            public final int hashCode() {
                return 73092186;
            }

            public final String toString() {
                return "External";
            }
        }

        @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Internal;", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;", "<init>", "()V", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$CommandSelected;", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$DraftMessage;", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Edit;", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$MentionSelected;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static abstract class Internal extends Source {
            public static final int $stable = 0;

            private Internal() {
            }

            public Internal(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$MentionSelected;", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source$Internal;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class MentionSelected extends Internal {
            public static final int $stable = 0;
            public static final MentionSelected INSTANCE = new MentionSelected();

            private MentionSelected() {
            }

            public final boolean equals(Object other) {
                return this == other || (other instanceof MentionSelected);
            }

            public final int hashCode() {
                return 1830228790;
            }

            public final String toString() {
                return "MentionSelected";
            }
        }

        private Source() {
        }

        public Source(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MessageInput copy$default(MessageInput messageInput, String str, Source source, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = messageInput.text;
        }
        if ((i13 & 2) != 0) {
            source = messageInput.source;
        }
        return messageInput.copy(str, source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    public final MessageInput copy(String text, Source source) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(source, "source");
        return new MessageInput(text, source);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageInput)) {
            return false;
        }
        MessageInput messageInput = (MessageInput) other;
        return AbstractC22676k.m65745e(this.text, messageInput.text) && AbstractC22676k.m65745e(this.source, messageInput.source);
    }

    public final Source getSource() {
        return this.source;
    }

    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        return this.source.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return "MessageInput(text=" + this.text + ", source=" + this.source + ")";
    }

    public MessageInput(String text, Source source) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(source, "source");
        this.text = text;
        this.source = source;
    }

    public /* synthetic */ MessageInput(String str, Source source, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? Source.Default.INSTANCE : source);
    }
}
