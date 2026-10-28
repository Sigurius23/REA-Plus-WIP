package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment;

import android.view.ViewGroup;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;", "", "attachmentFactories", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactory;", "<init>", "(Ljava/util/List;)V", "canHandle", "", "message", "Lio/getstream/chat/android/models/Message;", "createViewHolder", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;", "listeners", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "parent", "Landroid/view/ViewGroup;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentFactoryManager {
    private final List<AttachmentFactory> attachmentFactories;

    public AttachmentFactoryManager() {
        this(null, 1, null);
    }

    public final boolean canHandle(Message message) {
        AbstractC22676k.m65750j(message, "message");
        List<AttachmentFactory> list = this.attachmentFactories;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((AttachmentFactory) it.next()).canHandle(message)) {
                return true;
            }
        }
        return false;
    }

    public final InnerAttachmentViewHolder createViewHolder(Message message, MessageListListeners listeners, ViewGroup parent) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(parent, "parent");
        for (AttachmentFactory attachmentFactory : this.attachmentFactories) {
            if (attachmentFactory.canHandle(message)) {
                return attachmentFactory.createViewHolder(message, listeners, parent);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachmentFactoryManager(List<? extends AttachmentFactory> attachmentFactories) {
        AbstractC22676k.m65750j(attachmentFactories, "attachmentFactories");
        this.attachmentFactories = attachmentFactories;
    }

    public AttachmentFactoryManager(List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC37056f.m118958J(new UnsupportedAttachmentFactory()) : list);
    }
}
