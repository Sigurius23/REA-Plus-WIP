package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.RecyclerView;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.extensions.internal.RecyclerViewKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemFileAttachmentBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemRecordingAttachmentBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.FileAttachmentViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.internal.SimpleListAdapter;
import l83.C23454a0;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B-\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsAdapter;", "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;", "Lio/getstream/chat/android/models/Attachment;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;", "attachmentClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;", "attachmentLongClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;", "attachmentDownloadClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;", "style", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;", "holder", "Ll83/a0;", "onViewAttachedToWindow", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;)V", "onViewDetachedFromWindow", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onDetachedFromRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;", "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class FileAttachmentsAdapter extends SimpleListAdapter<Attachment, FileAttachmentViewHolder> {
    private static final int VIEW_TYPE_GENERAL = 2;
    private static final int VIEW_TYPE_RECORDING = 1;
    private final AttachmentClickListener attachmentClickListener;
    private final AttachmentDownloadClickListener attachmentDownloadClickListener;
    private final AttachmentLongClickListener attachmentLongClickListener;
    private final FileAttachmentViewStyle style;

    public FileAttachmentsAdapter(AttachmentClickListener attachmentClickListener, AttachmentLongClickListener attachmentLongClickListener, AttachmentDownloadClickListener attachmentDownloadClickListener, FileAttachmentViewStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.attachmentClickListener = attachmentClickListener;
        this.attachmentLongClickListener = attachmentLongClickListener;
        this.attachmentDownloadClickListener = attachmentDownloadClickListener;
        this.style = style;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onDetachedFromRecyclerView$lambda$2(FileAttachmentViewHolder it) {
        AbstractC22676k.m65750j(it, "it");
        it.clearScope();
        return C23454a0.f92919a;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final int getItemViewType(int position) {
        Attachment attachment = (Attachment) AbstractC25265s.m74102I0(position, getItemList());
        return AbstractC22676k.m65745e(attachment != null ? Boolean.valueOf(AttachmentUtilsKt.isAudioRecording(attachment)) : null, Boolean.TRUE) ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        AbstractC22676k.m65750j(recyclerView, "recyclerView");
        RecyclerViewKt.doForAllViewHolders(this, recyclerView, new C19778i(0));
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final FileAttachmentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        return viewType == 1 ? new RecordingFileAttachmentViewHolder(StreamUiItemRecordingAttachmentBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false), this.attachmentClickListener, this.attachmentLongClickListener, this.attachmentDownloadClickListener, this.style) : new GeneralFileAttachmentViewHolder(StreamUiItemFileAttachmentBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false), this.attachmentClickListener, this.attachmentLongClickListener, this.attachmentDownloadClickListener, this.style);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onViewAttachedToWindow(FileAttachmentViewHolder holder) {
        AbstractC22676k.m65750j(holder, "holder");
        super.onViewAttachedToWindow((AbstractC1717o2) holder);
        holder.restartJob();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onViewDetachedFromWindow(FileAttachmentViewHolder holder) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.clearScope();
        super.onViewDetachedFromWindow((AbstractC1717o2) holder);
    }
}
