package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment;

import android.content.Context;
import android.view.View;
import io.getstream.chat.android.models.Message;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;", "", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onBindViewHolder", "(Lio/getstream/chat/android/models/Message;)V", "onUnbindViewHolder", "()V", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class InnerAttachmentViewHolder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final Context context;
    private final View itemView;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder$Companion;", "", "<init>", "()V", "stub", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;", "itemView", "Landroid/view/View;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final InnerAttachmentViewHolder stub(View itemView) {
            AbstractC22676k.m65750j(itemView, "itemView");
            return new InnerAttachmentViewHolder$Companion$stub$1(itemView);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public InnerAttachmentViewHolder(View itemView) {
        AbstractC22676k.m65750j(itemView, "itemView");
        this.itemView = itemView;
        Context context = itemView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        this.context = context;
    }

    public final Context getContext() {
        return this.context;
    }

    public final View getItemView() {
        return this.itemView;
    }

    public final void onBindViewHolder(Message message) {
        AbstractC22676k.m65750j(message, "message");
    }

    public final void onUnbindViewHolder() {
    }

    public final void onViewAttachedToWindow() {
    }

    public final void onViewDetachedFromWindow() {
    }
}
