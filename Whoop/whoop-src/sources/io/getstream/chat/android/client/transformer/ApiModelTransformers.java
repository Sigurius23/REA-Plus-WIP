package io.getstream.chat.android.client.transformer;

import io.getstream.chat.android.models.ChannelTransformer;
import io.getstream.chat.android.models.MessageTransformer;
import io.getstream.chat.android.models.NoOpChannelTransformer;
import io.getstream.chat.android.models.NoOpMessageTransformer;
import io.getstream.chat.android.models.NoOpUserTransformer;
import io.getstream.chat.android.models.UserTransformer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/client/transformer/ApiModelTransformers;", "", "outgoingMessageTransformer", "Lio/getstream/chat/android/models/MessageTransformer;", "incomingMessageTransformer", "incomingChannelTransformer", "Lio/getstream/chat/android/models/ChannelTransformer;", "outgoingUserTransformers", "Lio/getstream/chat/android/models/UserTransformer;", "incomingUserTransformer", "<init>", "(Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/MessageTransformer;Lio/getstream/chat/android/models/ChannelTransformer;Lio/getstream/chat/android/models/UserTransformer;Lio/getstream/chat/android/models/UserTransformer;)V", "getOutgoingMessageTransformer", "()Lio/getstream/chat/android/models/MessageTransformer;", "getIncomingMessageTransformer", "getIncomingChannelTransformer", "()Lio/getstream/chat/android/models/ChannelTransformer;", "getOutgoingUserTransformers", "()Lio/getstream/chat/android/models/UserTransformer;", "getIncomingUserTransformer", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ApiModelTransformers {
    private final ChannelTransformer incomingChannelTransformer;
    private final MessageTransformer incomingMessageTransformer;
    private final UserTransformer incomingUserTransformer;
    private final MessageTransformer outgoingMessageTransformer;
    private final UserTransformer outgoingUserTransformers;

    public ApiModelTransformers() {
        this(null, null, null, null, null, 31, null);
    }

    public final ChannelTransformer getIncomingChannelTransformer() {
        return this.incomingChannelTransformer;
    }

    public final MessageTransformer getIncomingMessageTransformer() {
        return this.incomingMessageTransformer;
    }

    public final UserTransformer getIncomingUserTransformer() {
        return this.incomingUserTransformer;
    }

    public final MessageTransformer getOutgoingMessageTransformer() {
        return this.outgoingMessageTransformer;
    }

    public final UserTransformer getOutgoingUserTransformers() {
        return this.outgoingUserTransformers;
    }

    public ApiModelTransformers(MessageTransformer outgoingMessageTransformer, MessageTransformer incomingMessageTransformer, ChannelTransformer incomingChannelTransformer, UserTransformer outgoingUserTransformers, UserTransformer incomingUserTransformer) {
        AbstractC22676k.m65750j(outgoingMessageTransformer, "outgoingMessageTransformer");
        AbstractC22676k.m65750j(incomingMessageTransformer, "incomingMessageTransformer");
        AbstractC22676k.m65750j(incomingChannelTransformer, "incomingChannelTransformer");
        AbstractC22676k.m65750j(outgoingUserTransformers, "outgoingUserTransformers");
        AbstractC22676k.m65750j(incomingUserTransformer, "incomingUserTransformer");
        this.outgoingMessageTransformer = outgoingMessageTransformer;
        this.incomingMessageTransformer = incomingMessageTransformer;
        this.incomingChannelTransformer = incomingChannelTransformer;
        this.outgoingUserTransformers = outgoingUserTransformers;
        this.incomingUserTransformer = incomingUserTransformer;
    }

    public /* synthetic */ ApiModelTransformers(MessageTransformer messageTransformer, MessageTransformer messageTransformer2, ChannelTransformer channelTransformer, UserTransformer userTransformer, UserTransformer userTransformer2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? NoOpMessageTransformer.INSTANCE : messageTransformer, (i13 & 2) != 0 ? NoOpMessageTransformer.INSTANCE : messageTransformer2, (i13 & 4) != 0 ? NoOpChannelTransformer.INSTANCE : channelTransformer, (i13 & 8) != 0 ? NoOpUserTransformer.INSTANCE : userTransformer, (i13 & 16) != 0 ? NoOpUserTransformer.INSTANCE : userTransformer2);
    }
}
