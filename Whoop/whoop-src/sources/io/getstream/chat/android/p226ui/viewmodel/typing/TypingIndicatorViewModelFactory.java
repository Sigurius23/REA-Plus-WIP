package io.getstream.chat.android.p226ui.viewmodel.typing;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1563a2;
import io.getstream.chat.android.client.ChatClient;
import j93.InterfaceC21461d;
import p298l8.AbstractC23420c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModelFactory;", "Landroidx/lifecycle/a2;", "", "cid", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "messageId", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)V", "Landroidx/lifecycle/w1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w1;", "Ljava/lang/String;", "Lio/getstream/chat/android/client/ChatClient;", "Builder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TypingIndicatorViewModelFactory implements InterfaceC1563a2 {
    private final ChatClient chatClient;
    private final String cid;
    private final String messageId;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u0006J\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModelFactory$Builder;", "", "<init>", "()V", "", "cid", "(Ljava/lang/String;)Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModelFactory$Builder;", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModelFactory$Builder;", "messageId", "Landroidx/lifecycle/a2;", "build", "()Landroidx/lifecycle/a2;", "Ljava/lang/String;", "Lio/getstream/chat/android/client/ChatClient;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private ChatClient chatClient;
        private String cid;
        private String messageId;

        public final InterfaceC1563a2 build() {
            String str = this.cid;
            if (str == null) {
                throw new IllegalStateException("Channel cid should not be null");
            }
            ChatClient chatClientInstance = this.chatClient;
            if (chatClientInstance == null) {
                chatClientInstance = ChatClient.INSTANCE.instance();
            }
            return new TypingIndicatorViewModelFactory(str, chatClientInstance, this.messageId);
        }

        public final Builder chatClient(ChatClient chatClient) {
            AbstractC22676k.m65750j(chatClient, "chatClient");
            this.chatClient = chatClient;
            return this;
        }

        public final Builder cid(String cid) {
            AbstractC22676k.m65750j(cid, "cid");
            this.cid = cid;
            return this;
        }

        public final Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
    }

    public TypingIndicatorViewModelFactory(String cid, ChatClient chatClient, String str) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        this.cid = cid;
        this.chatClient = chatClient;
        this.messageId = str;
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final <T extends AbstractC1637w1> T create(InterfaceC21461d interfaceC21461d, AbstractC23420c abstractC23420c) {
        return (T) super.create(interfaceC21461d, abstractC23420c);
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final <T extends AbstractC1637w1> T create(Class<T> cls, AbstractC23420c abstractC23420c) {
        return (T) super.create(cls, abstractC23420c);
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final <T extends AbstractC1637w1> T create(Class<T> modelClass) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        if (modelClass.equals(TypingIndicatorViewModel.class)) {
            return new TypingIndicatorViewModel(this.cid, this.chatClient, this.messageId);
        }
        throw new IllegalArgumentException("TypingIndicatorViewModelFactory can only create instances of TypingIndicatorViewModel");
    }

    public /* synthetic */ TypingIndicatorViewModelFactory(String str, ChatClient chatClient, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? ChatClient.INSTANCE.instance() : chatClient, (i13 & 4) != 0 ? null : str2);
    }
}
