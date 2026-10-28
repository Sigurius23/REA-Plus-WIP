package io.getstream.chat.android.p226ui.feature.messages.composer;

import d93.InterfaceC11820a;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent;
import java.util.Iterator;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"io/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1$iterator$1", "", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;", "index", "", "hasNext", "", "next", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageComposerViewKt$asContentContainer$1$iterator$1 implements Iterator<MessageComposerContent>, InterfaceC11820a {
    private int index;
    final /* synthetic */ MessageComposerViewKt.C196731 this$0;

    public MessageComposerViewKt$asContentContainer$1$iterator$1(MessageComposerViewKt.C196731 c196731) {
        this.this$0 = c196731;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.index < this.this$0.childCount;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final MessageComposerContent next() {
        MessageComposerViewKt.C196731 c196731 = this.this$0;
        int i13 = this.index;
        this.index = i13 + 1;
        MessageComposerContent childAt = c196731.getChildAt(i13);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }
}
