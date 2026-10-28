package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.AttachmentPreviewFactoryManager;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.AttachmentPreviewViewHolder;
import java.util.ArrayList;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentPreviewAdapter;", "Landroidx/recyclerview/widget/i1;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/AttachmentAdapter;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;", "factoryManager", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Attachment;", "Ll83/a0;", "attachmentRemovalListener", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;Lkotlin/jvm/functions/Function1;)V", "", "attachments", "setAttachments", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parentView", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;", "holder", "position", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "onViewDetachedFromWindow", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "Lkotlin/jvm/functions/Function1;", "", "Ljava/util/List;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class AttachmentPreviewAdapter extends AbstractC1692i1 implements AttachmentAdapter {
    private final Function1 attachmentRemovalListener;
    private final List<Attachment> attachments;
    private final AttachmentPreviewFactoryManager factoryManager;
    private final MessageComposerViewStyle style;

    public AttachmentPreviewAdapter(AttachmentPreviewFactoryManager factoryManager, MessageComposerViewStyle style, Function1 attachmentRemovalListener) {
        AbstractC22676k.m65750j(factoryManager, "factoryManager");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(attachmentRemovalListener, "attachmentRemovalListener");
        this.factoryManager = factoryManager;
        this.style = style;
        this.attachmentRemovalListener = attachmentRemovalListener;
        this.attachments = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public final int getDisplayCount() {
        return this.attachments.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final int getItemViewType(int position) {
        return this.factoryManager.getItemViewType(this.attachments.get(position));
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.AttachmentAdapter
    @SuppressLint({"NotifyDataSetChanged"})
    public final void setAttachments(List<Attachment> attachments) {
        AbstractC22676k.m65750j(attachments, "attachments");
        this.attachments.clear();
        this.attachments.addAll(attachments);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(AttachmentPreviewViewHolder holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.bind(this.attachments.get(position));
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final AttachmentPreviewViewHolder onCreateViewHolder(ViewGroup parentView, int viewType) {
        AbstractC22676k.m65750j(parentView, "parentView");
        return this.factoryManager.onCreateViewHolder(parentView, viewType, this.attachmentRemovalListener, this.style);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onViewDetachedFromWindow(AttachmentPreviewViewHolder holder) {
        AbstractC22676k.m65750j(holder, "holder");
        super.onViewDetachedFromWindow((AbstractC1717o2) holder);
        holder.unbind();
    }
}
