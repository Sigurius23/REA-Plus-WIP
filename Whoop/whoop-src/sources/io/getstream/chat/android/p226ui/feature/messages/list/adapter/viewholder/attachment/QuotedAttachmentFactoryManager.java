package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment;

import android.view.View;
import android.view.ViewGroup;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.ChatUI;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;", "", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactory;", "quotedAttachmentFactories", "<init>", "(Ljava/util/List;)V", "Lio/getstream/chat/android/models/Message;", "message", "", "canHandle", "(Lio/getstream/chat/android/models/Message;)Z", "Landroid/view/ViewGroup;", "parent", "Ll83/a0;", "createAndAddQuotedView", "(Lio/getstream/chat/android/models/Message;Landroid/view/ViewGroup;)V", "Ljava/util/List;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QuotedAttachmentFactoryManager {
    private final List<QuotedAttachmentFactory> quotedAttachmentFactories;

    /* JADX WARN: Multi-variable type inference failed */
    public QuotedAttachmentFactoryManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean canHandle(Message message) {
        AbstractC22676k.m65750j(message, "message");
        List<QuotedAttachmentFactory> list = this.quotedAttachmentFactories;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((QuotedAttachmentFactory) it.next()).canHandle(message)) {
                    return true;
                }
            }
        }
        return ChatUI.getAttachmentFactoryManager().canHandle(message);
    }

    public final void createAndAddQuotedView(Message message, ViewGroup parent) {
        Object next;
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(parent, "parent");
        Iterator<T> it = this.quotedAttachmentFactories.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((QuotedAttachmentFactory) next).canHandle(message));
        QuotedAttachmentFactory fallbackQuotedAttachmentMessageFactory = (QuotedAttachmentFactory) next;
        if (fallbackQuotedAttachmentMessageFactory == null) {
            fallbackQuotedAttachmentMessageFactory = new FallbackQuotedAttachmentMessageFactory();
        }
        View viewGenerateQuotedAttachmentView = fallbackQuotedAttachmentMessageFactory.generateQuotedAttachmentView(message, parent);
        parent.removeAllViews();
        parent.addView(viewGenerateQuotedAttachmentView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuotedAttachmentFactoryManager(List<? extends QuotedAttachmentFactory> quotedAttachmentFactories) {
        AbstractC22676k.m65750j(quotedAttachmentFactories, "quotedAttachmentFactories");
        this.quotedAttachmentFactories = quotedAttachmentFactories;
    }

    public /* synthetic */ QuotedAttachmentFactoryManager(List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list);
    }
}
