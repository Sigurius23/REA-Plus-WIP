package io.getstream.chat.android.models;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/models/MessagesState;", "", "<init>", "()V", "NoQueryActive", "Loading", "OfflineNoResults", "Result", "Lio/getstream/chat/android/models/MessagesState$Loading;", "Lio/getstream/chat/android/models/MessagesState$NoQueryActive;", "Lio/getstream/chat/android/models/MessagesState$OfflineNoResults;", "Lio/getstream/chat/android/models/MessagesState$Result;", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class MessagesState {

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/models/MessagesState$Loading;", "Lio/getstream/chat/android/models/MessagesState;", "<init>", "()V", "toString", "", "equals", "", "other", "", "hashCode", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Loading extends MessagesState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -649355324;
        }

        public String toString() {
            return "Loading";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/models/MessagesState$NoQueryActive;", "Lio/getstream/chat/android/models/MessagesState;", "<init>", "()V", "toString", "", "equals", "", "other", "", "hashCode", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class NoQueryActive extends MessagesState {
        public static final NoQueryActive INSTANCE = new NoQueryActive();

        private NoQueryActive() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NoQueryActive);
        }

        public int hashCode() {
            return 921742837;
        }

        public String toString() {
            return "NoQueryActive";
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/models/MessagesState$OfflineNoResults;", "Lio/getstream/chat/android/models/MessagesState;", "<init>", "()V", "toString", "", "equals", "", "other", "", "hashCode", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class OfflineNoResults extends MessagesState {
        public static final OfflineNoResults INSTANCE = new OfflineNoResults();

        private OfflineNoResults() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OfflineNoResults);
        }

        public int hashCode() {
            return 1569396426;
        }

        public String toString() {
            return "OfflineNoResults";
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/models/MessagesState$Result;", "Lio/getstream/chat/android/models/MessagesState;", "messages", "", "Lio/getstream/chat/android/models/Message;", "<init>", "(Ljava/util/List;)V", "getMessages", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Result extends MessagesState {
        private final List<Message> messages;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Result(List<Message> messages) {
            super(null);
            AbstractC22676k.m65750j(messages, "messages");
            this.messages = messages;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Result copy$default(Result result, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = result.messages;
            }
            return result.copy(list);
        }

        public final List<Message> component1() {
            return this.messages;
        }

        public final Result copy(List<Message> messages) {
            AbstractC22676k.m65750j(messages, "messages");
            return new Result(messages);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && AbstractC22676k.m65745e(this.messages, ((Result) other).messages);
        }

        public final List<Message> getMessages() {
            return this.messages;
        }

        public int hashCode() {
            return this.messages.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("Result(messages=", ")", this.messages);
        }
    }

    public /* synthetic */ MessagesState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MessagesState() {
    }
}
