package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1717o2;
import io.getstream.chat.android.models.Attachment;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;", "Landroidx/recyclerview/widget/o2;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lio/getstream/chat/android/models/Attachment;", "attachment", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/models/Attachment;)V", "unbind", "()V", "Landroid/view/View;", "getItemView", "()Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class AttachmentPreviewViewHolder extends AbstractC1717o2 {
    private final Context context;
    private final View itemView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentPreviewViewHolder(View itemView) {
        super(itemView.getRootView());
        AbstractC22676k.m65750j(itemView, "itemView");
        this.itemView = itemView;
        Context context = itemView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        this.context = context;
    }

    public abstract void bind(Attachment attachment);

    public final Context getContext() {
        return this.context;
    }

    public final View getItemView() {
        return this.itemView;
    }

    public void unbind() {
    }
}
