package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.media.internal;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import b30.ViewOnClickListenerC2558k3;
import c93.InterfaceC4339a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import io.getstream.chat.android.p226ui.common.utils.MediaStringUtil;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemAttachmentMediaAddMoreBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemAttachmentMediaBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.ImageUtilsKt;
import io.getstream.chat.android.p226ui.utils.extensions.DrawableKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000301/B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010#\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010.¨\u00062"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;", "Landroidx/recyclerview/widget/i1;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "style", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "Ll83/a0;", "onAttachmentSelected", "Lkotlin/Function0;", "onAddMoreClick", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Lkotlin/jvm/functions/Function1;Lc93/a;)V", "attachment", "", "isSelected", "toggleAttachmentSelection", "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;Z)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/o2;I)V", "getItemCount", "()I", "", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentListItem;", "attachments", "setItems", "(Ljava/util/List;)V", "selectAttachment", "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V", "deselectAttachment", "clearAttachments", "()V", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "Lkotlin/jvm/functions/Function1;", "Lc93/a;", "", "Ljava/util/List;", "Companion", "AddMoreViewHolder", "MediaAttachmentViewHolder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MediaAttachmentAdapter extends AbstractC1692i1 {
    private static final int VIEW_TYPE_ADD_MORE = 0;
    private static final int VIEW_TYPE_MEDIA_ATTACHMENT = 1;
    private final List<MediaAttachmentListItem> attachments;
    private final InterfaceC4339a onAddMoreClick;
    private final Function1 onAttachmentSelected;
    private final AttachmentsPickerDialogStyle style;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$AddMoreViewHolder;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaAddMoreBinding;", "binding", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaAddMoreBinding;Lc93/a;)V", "Lc93/a;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class AddMoreViewHolder extends AbstractC1717o2 {
        private final InterfaceC4339a onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddMoreViewHolder(StreamUiItemAttachmentMediaAddMoreBinding binding, InterfaceC4339a onClick) {
            super(binding.getRoot());
            AbstractC22676k.m65750j(binding, "binding");
            AbstractC22676k.m65750j(onClick, "onClick");
            this.onClick = onClick;
            binding.getRoot().setOnClickListener(new ViewOnClickListenerC2558k3(this, 17));
        }

        /* JADX INFO: renamed from: a */
        public static void m55258a(AddMoreViewHolder addMoreViewHolder, View view) {
            addMoreViewHolder.onClick.invoke();
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;", "binding", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "Ll83/a0;", "onAttachmentSelected", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "style", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V", "attachment", "bindMediaImage", "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V", "bindSelectionMark", "bindSelectionOverlay", "bindAttachmentType", "bind", "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;", "Lkotlin/jvm/functions/Function1;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "getAttachment", "()Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "setAttachment", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class MediaAttachmentViewHolder extends AbstractC1717o2 {
        public AttachmentMetaData attachment;
        private final StreamUiItemAttachmentMediaBinding binding;
        private final Function1 onAttachmentSelected;
        private final AttachmentsPickerDialogStyle style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaAttachmentViewHolder(StreamUiItemAttachmentMediaBinding binding, Function1 onAttachmentSelected, AttachmentsPickerDialogStyle style) {
            super(binding.getRoot());
            AbstractC22676k.m65750j(binding, "binding");
            AbstractC22676k.m65750j(onAttachmentSelected, "onAttachmentSelected");
            AbstractC22676k.m65750j(style, "style");
            this.binding = binding;
            this.onAttachmentSelected = onAttachmentSelected;
            this.style = style;
            binding.getRoot().setOnClickListener(new ViewOnClickListenerC2558k3(this, 18));
        }

        /* JADX INFO: renamed from: a */
        public static void m55259a(MediaAttachmentViewHolder mediaAttachmentViewHolder, View view) {
            mediaAttachmentViewHolder.onAttachmentSelected.invoke(mediaAttachmentViewHolder.getAttachment());
        }

        private final void bindAttachmentType(AttachmentMetaData attachment) {
            if (!AbstractC22676k.m65745e(attachment.getType(), "video")) {
                ConstraintLayout videoInformationConstraintLayout = this.binding.videoInformationConstraintLayout;
                AbstractC22676k.m65749i(videoInformationConstraintLayout, "videoInformationConstraintLayout");
                videoInformationConstraintLayout.setVisibility(8);
                this.binding.videoLengthTextView.setText("");
                return;
            }
            ConstraintLayout videoInformationConstraintLayout2 = this.binding.videoInformationConstraintLayout;
            AbstractC22676k.m65749i(videoInformationConstraintLayout2, "videoInformationConstraintLayout");
            videoInformationConstraintLayout2.setVisibility(this.style.getVideoLengthTextVisible() || this.style.getVideoIconVisible() ? 0 : 8);
            TextView videoLengthTextView = this.binding.videoLengthTextView;
            AbstractC22676k.m65749i(videoLengthTextView, "videoLengthTextView");
            videoLengthTextView.setVisibility(this.style.getVideoLengthTextVisible() ? 0 : 8);
            ImageView videoLogoImageView = this.binding.videoLogoImageView;
            AbstractC22676k.m65749i(videoLogoImageView, "videoLogoImageView");
            videoLogoImageView.setVisibility(this.style.getVideoIconVisible() ? 0 : 8);
            this.binding.videoLogoImageView.setImageDrawable(DrawableKt.applyTint(this.style.getVideoIconDrawable(), this.style.getVideoIconDrawableTint()));
            TextView videoLengthTextView2 = this.binding.videoLengthTextView;
            AbstractC22676k.m65749i(videoLengthTextView2, "videoLengthTextView");
            TextStyleKt.setTextStyle(videoLengthTextView2, this.style.getVideoLengthTextStyle());
            this.binding.videoLengthTextView.setText(MediaStringUtil.convertVideoLength$default(attachment.getVideoLength(), null, 2, null));
        }

        private final void bindMediaImage(AttachmentMetaData attachment) {
            if (!AbstractC22676k.m65745e(attachment.getType(), "video")) {
                ImageView mediaThumbnailImageView = this.binding.mediaThumbnailImageView;
                AbstractC22676k.m65749i(mediaThumbnailImageView, "mediaThumbnailImageView");
                ImageUtilsKt.load$default(mediaThumbnailImageView, attachment.getUri(), (Integer) null, (StreamImageLoader.ImageTransformation) null, (InterfaceC4339a) null, (InterfaceC4339a) null, 30, (Object) null);
                this.binding.mediaThumbnailImageView.setBackgroundColor(0);
                return;
            }
            ImageView mediaThumbnailImageView2 = this.binding.mediaThumbnailImageView;
            AbstractC22676k.m65749i(mediaThumbnailImageView2, "mediaThumbnailImageView");
            ImageUtilsKt.loadVideoThumbnail$default(mediaThumbnailImageView2, attachment.getUri(), Integer.valueOf(C19469R.drawable.stream_ui_placeholder), null, null, null, 28, null);
            this.binding.mediaThumbnailImageView.setBackgroundColor(AbstractC32122c.getColor(this.itemView.getContext(), C19469R.color.stream_ui_white_smoke));
        }

        private final void bindSelectionMark(AttachmentMetaData attachment) {
            ImageView selectionMarkImageView = this.binding.selectionMarkImageView;
            AbstractC22676k.m65749i(selectionMarkImageView, "selectionMarkImageView");
            selectionMarkImageView.setVisibility(attachment.getIsSelected() ? 0 : 8);
        }

        private final void bindSelectionOverlay(AttachmentMetaData attachment) {
            View selectionOverlayView = this.binding.selectionOverlayView;
            AbstractC22676k.m65749i(selectionOverlayView, "selectionOverlayView");
            selectionOverlayView.setVisibility(attachment.getIsSelected() ? 0 : 8);
        }

        public final void bind(AttachmentMetaData attachment) {
            AbstractC22676k.m65750j(attachment, "attachment");
            this.attachment = attachment;
            bindMediaImage(attachment);
            bindSelectionMark(attachment);
            bindSelectionOverlay(attachment);
            bindAttachmentType(attachment);
        }

        public final AttachmentMetaData getAttachment() {
            AttachmentMetaData attachmentMetaData = this.attachment;
            if (attachmentMetaData != null) {
                return attachmentMetaData;
            }
            AbstractC22676k.m65757q("attachment");
            throw null;
        }

        public final void setAttachment(AttachmentMetaData attachmentMetaData) {
            AbstractC22676k.m65750j(attachmentMetaData, "<set-?>");
            this.attachment = attachmentMetaData;
        }
    }

    public MediaAttachmentAdapter(AttachmentsPickerDialogStyle style, Function1 onAttachmentSelected, InterfaceC4339a onAddMoreClick) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(onAttachmentSelected, "onAttachmentSelected");
        AbstractC22676k.m65750j(onAddMoreClick, "onAddMoreClick");
        this.style = style;
        this.onAttachmentSelected = onAttachmentSelected;
        this.onAddMoreClick = onAddMoreClick;
        this.attachments = new ArrayList();
    }

    private final void toggleAttachmentSelection(AttachmentMetaData attachment, boolean isSelected) {
        Iterator<MediaAttachmentListItem> it = this.attachments.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            MediaAttachmentListItem next = it.next();
            if ((next instanceof MediaAttachmentListItem.MediaAttachmentItem) && AbstractC22676k.m65745e(((MediaAttachmentListItem.MediaAttachmentItem) next).getAttachment(), attachment)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 != -1) {
            MediaAttachmentListItem mediaAttachmentListItem = this.attachments.get(i13);
            AbstractC22676k.m65748h(mediaAttachmentListItem, "null cannot be cast to non-null type io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.media.internal.MediaAttachmentListItem.MediaAttachmentItem");
            ((MediaAttachmentListItem.MediaAttachmentItem) mediaAttachmentListItem).getAttachment().setSelected(isSelected);
            notifyItemChanged(i13);
        }
    }

    public final void clearAttachments() {
        this.attachments.clear();
        notifyDataSetChanged();
    }

    public final void deselectAttachment(AttachmentMetaData attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        toggleAttachmentSelection(attachment, false);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public final int getDisplayCount() {
        return this.attachments.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final int getItemViewType(int position) {
        MediaAttachmentListItem mediaAttachmentListItem = this.attachments.get(position);
        if (mediaAttachmentListItem instanceof MediaAttachmentListItem.AddMoreItem) {
            return 0;
        }
        if (mediaAttachmentListItem instanceof MediaAttachmentListItem.MediaAttachmentItem) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(AbstractC1717o2 holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        MediaAttachmentListItem mediaAttachmentListItem = this.attachments.get(position);
        if ((mediaAttachmentListItem instanceof MediaAttachmentListItem.MediaAttachmentItem) && (holder instanceof MediaAttachmentViewHolder)) {
            ((MediaAttachmentViewHolder) holder).bind(((MediaAttachmentListItem.MediaAttachmentItem) mediaAttachmentListItem).getAttachment());
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final AbstractC1717o2 onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        return viewType == 1 ? new MediaAttachmentViewHolder(StreamUiItemAttachmentMediaBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false), this.onAttachmentSelected, this.style) : new AddMoreViewHolder(StreamUiItemAttachmentMediaAddMoreBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false), this.onAddMoreClick);
    }

    public final void selectAttachment(AttachmentMetaData attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        toggleAttachmentSelection(attachment, true);
    }

    public final void setItems(List<? extends MediaAttachmentListItem> attachments) {
        AbstractC22676k.m65750j(attachments, "attachments");
        this.attachments.clear();
        this.attachments.addAll(attachments);
        notifyDataSetChanged();
    }
}
