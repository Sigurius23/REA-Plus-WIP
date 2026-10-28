package io.getstream.chat.android.p226ui.common.state.messages;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/React;", "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "reaction", "Lio/getstream/chat/android/models/Reaction;", "message", "Lio/getstream/chat/android/models/Message;", "skipPush", "", "<init>", "(Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/Message;Z)V", "getReaction", "()Lio/getstream/chat/android/models/Reaction;", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getSkipPush", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class React extends MessageAction {
    public static final int $stable = 0;
    private final Message message;
    private final Reaction reaction;
    private final boolean skipPush;

    public React(Reaction reaction, Message message, boolean z4) {
        AbstractC22676k.m65750j(reaction, "reaction");
        AbstractC22676k.m65750j(message, "message");
        this.reaction = reaction;
        this.message = message;
        this.skipPush = z4;
    }

    public static /* synthetic */ React copy$default(React react, Reaction reaction, Message message, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            reaction = react.reaction;
        }
        if ((i13 & 2) != 0) {
            message = react.message;
        }
        if ((i13 & 4) != 0) {
            z4 = react.skipPush;
        }
        return react.copy(reaction, message, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Reaction getReaction() {
        return this.reaction;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSkipPush() {
        return this.skipPush;
    }

    public final React copy(Reaction reaction, Message message, boolean skipPush) {
        AbstractC22676k.m65750j(reaction, "reaction");
        AbstractC22676k.m65750j(message, "message");
        return new React(reaction, message, skipPush);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof React)) {
            return false;
        }
        React react = (React) other;
        return AbstractC22676k.m65745e(this.reaction, react.reaction) && AbstractC22676k.m65745e(this.message, react.message) && this.skipPush == react.skipPush;
    }

    @Override // io.getstream.chat.android.p226ui.common.state.messages.MessageAction
    public final Message getMessage() {
        return this.message;
    }

    public final Reaction getReaction() {
        return this.reaction;
    }

    public final boolean getSkipPush() {
        return this.skipPush;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.skipPush) + ((this.message.hashCode() + (this.reaction.hashCode() * 31)) * 31);
    }

    public final String toString() {
        Reaction reaction = this.reaction;
        Message message = this.message;
        boolean z4 = this.skipPush;
        StringBuilder sb4 = new StringBuilder("React(reaction=");
        sb4.append(reaction);
        sb4.append(", message=");
        sb4.append(message);
        sb4.append(", skipPush=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ React(Reaction reaction, Message message, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(reaction, message, (i13 & 4) != 0 ? false : z4);
    }
}
