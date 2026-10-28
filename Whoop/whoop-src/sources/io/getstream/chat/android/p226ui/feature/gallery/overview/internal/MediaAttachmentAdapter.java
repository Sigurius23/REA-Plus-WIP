package io.getstream.chat.android.p226ui.feature.gallery.overview.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1738u;
import androidx.recyclerview.widget.AbstractC1759z0;
import b30.ViewOnClickListenerC2558k3;
import h02.C16587n0;
import i01.C17841d;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader;
import io.getstream.chat.android.p226ui.common.images.resizing.StringExtensionsKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMediaAttachmentBinding;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryItem;
import io.getstream.chat.android.p226ui.feature.gallery.MediaAttachmentGridViewStyle;
import io.getstream.chat.android.p226ui.utils.ImageUtilsKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0017\u0018\u0019B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;", "Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;", "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;", "mediaAttachmentClickListener", "<init>", "(Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;", "holder", "position", "Ll83/a0;", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;I)V", "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;", "Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;", "MediaAttachmentViewHolder", "MediaAttachmentClickListener", "AttachmentGalleryItemDiffCallback", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MediaAttachmentAdapter extends AbstractC1759z0 {
    private final MediaAttachmentClickListener mediaAttachmentClickListener;
    private final MediaAttachmentGridViewStyle style;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$AttachmentGalleryItemDiffCallback;", "Landroidx/recyclerview/widget/u;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;)Z", "areContentsTheSame", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class AttachmentGalleryItemDiffCallback extends AbstractC1738u {
        public static final AttachmentGalleryItemDiffCallback INSTANCE = new AttachmentGalleryItemDiffCallback();

        private AttachmentGalleryItemDiffCallback() {
        }

        @Override // androidx.recyclerview.widget.AbstractC1738u
        public final boolean areContentsTheSame(AttachmentGalleryItem oldItem, AttachmentGalleryItem newItem) {
            AbstractC22676k.m65750j(oldItem, "oldItem");
            AbstractC22676k.m65750j(newItem, "newItem");
            return oldItem.equals(newItem);
        }

        @Override // androidx.recyclerview.widget.AbstractC1738u
        public final boolean areItemsTheSame(AttachmentGalleryItem oldItem, AttachmentGalleryItem newItem) {
            AbstractC22676k.m65750j(oldItem, "oldItem");
            AbstractC22676k.m65750j(newItem, "newItem");
            String imageUrl = oldItem.getAttachment().getImageUrl();
            if (imageUrl == null) {
                imageUrl = oldItem.getAttachment().getThumbUrl();
            }
            String imageUrl2 = newItem.getAttachment().getImageUrl();
            if (imageUrl2 == null) {
                imageUrl2 = newItem.getAttachment().getThumbUrl();
            }
            return AbstractC22676k.m65745e(imageUrl, imageUrl2) && AbstractC22676k.m65745e(oldItem.getCreatedAt(), newItem.getCreatedAt());
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;", "", "", "position", "Ll83/a0;", "onMediaAttachmentClick", "(I)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MediaAttachmentClickListener {
        void onMediaAttachmentClick(int position);
    }

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;", "binding", "Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;", "mediaAttachmentClickListener", "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;", "style", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;)V", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;", "attachmentGalleryItem", "Ll83/a0;", "loadImage", "(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;)V", "setupUserAvatar", "", "attachmentType", "setupPlayButton", "(Ljava/lang/String;)V", "setupPlayButtonIcon", "()V", "setupPlayButtonCard", "bind", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;", "Lio/getstream/chat/android/ui/feature/gallery/overview/internal/MediaAttachmentAdapter$MediaAttachmentClickListener;", "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class MediaAttachmentViewHolder extends AbstractC1717o2 {
        private final StreamUiItemMediaAttachmentBinding binding;
        private final MediaAttachmentClickListener mediaAttachmentClickListener;
        private final MediaAttachmentGridViewStyle style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaAttachmentViewHolder(StreamUiItemMediaAttachmentBinding binding, MediaAttachmentClickListener mediaAttachmentClickListener, MediaAttachmentGridViewStyle style) {
            super(binding.getRoot());
            AbstractC22676k.m65750j(binding, "binding");
            AbstractC22676k.m65750j(mediaAttachmentClickListener, "mediaAttachmentClickListener");
            AbstractC22676k.m65750j(style, "style");
            this.binding = binding;
            this.mediaAttachmentClickListener = mediaAttachmentClickListener;
            this.style = style;
            binding.mediaContainer.setOnClickListener(new ViewOnClickListenerC2558k3(this, 11));
        }

        /* JADX INFO: renamed from: b */
        public static void m55170b(MediaAttachmentViewHolder mediaAttachmentViewHolder, View view) {
            mediaAttachmentViewHolder.mediaAttachmentClickListener.onMediaAttachmentClick(mediaAttachmentViewHolder.getBindingAdapterPosition());
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0024  */
        private final void loadImage(AttachmentGalleryItem attachmentGalleryItem) {
            String strApplyStreamCdnImageResizingIfEnabled;
            boolean zIsVideo = AttachmentUtilsKt.isVideo(attachmentGalleryItem.getAttachment());
            if (AttachmentUtilsKt.isImage(attachmentGalleryItem.getAttachment()) || (AttachmentUtilsKt.isVideo(attachmentGalleryItem.getAttachment()) && ChatUI.getVideoThumbnailsEnabled())) {
                Attachment attachment = attachmentGalleryItem.getAttachment();
                String imageUrl = AttachmentUtilsKt.isImage(attachment) ? attachment.getImageUrl() : attachment.getThumbUrl();
                if (imageUrl != null) {
                    strApplyStreamCdnImageResizingIfEnabled = StringExtensionsKt.applyStreamCdnImageResizingIfEnabled(imageUrl, ChatUI.getStreamCdnImageResizing());
                } else {
                    strApplyStreamCdnImageResizingIfEnabled = null;
                }
            } else {
                strApplyStreamCdnImageResizingIfEnabled = null;
            }
            ImageView mediaImageView = this.binding.mediaImageView;
            AbstractC22676k.m65749i(mediaImageView, "mediaImageView");
            ImageUtilsKt.load$default(mediaImageView, strApplyStreamCdnImageResizingIfEnabled, zIsVideo ? null : this.style.getImagePlaceholder(), (StreamImageLoader.ImageTransformation) null, new C16587n0(this, 28), new C17841d(17, this, attachmentGalleryItem), 4, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C23454a0 loadImage$lambda$1(MediaAttachmentViewHolder mediaAttachmentViewHolder) {
            mediaAttachmentViewHolder.binding.progressBar.setVisibility(0);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C23454a0 loadImage$lambda$2(MediaAttachmentViewHolder mediaAttachmentViewHolder, AttachmentGalleryItem attachmentGalleryItem) {
            CardView playButtonCardView = mediaAttachmentViewHolder.binding.playButtonCardView;
            AbstractC22676k.m65749i(playButtonCardView, "playButtonCardView");
            playButtonCardView.setVisibility(AttachmentUtilsKt.isVideo(attachmentGalleryItem.getAttachment()) ? 0 : 8);
            mediaAttachmentViewHolder.binding.progressBar.setVisibility(8);
            return C23454a0.f92919a;
        }

        private final void setupPlayButton(String attachmentType) {
            if (AbstractC22676k.m65745e(attachmentType, "video")) {
                setupPlayButtonIcon();
                setupPlayButtonCard();
            }
        }

        private final void setupPlayButtonCard() {
            CardView cardView = this.binding.playButtonCardView;
            cardView.setElevation(this.style.getPlayVideoIconElevation());
            cardView.setCardBackgroundColor(this.style.getPlayVideoIconBackgroundColor());
            cardView.setRadius(this.style.getPlayVideoIconCornerRadius());
        }

        private final void setupPlayButtonIcon() {
            Drawable drawableMutate;
            ImageView imageView = this.binding.playButtonImageView;
            Drawable playVideoButtonIcon = this.style.getPlayVideoButtonIcon();
            if (playVideoButtonIcon == null || (drawableMutate = playVideoButtonIcon.mutate()) == null) {
                drawableMutate = null;
            } else {
                Integer playVideoIconTint = this.style.getPlayVideoIconTint();
                if (playVideoIconTint != null) {
                    drawableMutate.setTint(playVideoIconTint.intValue());
                }
            }
            imageView.setImageDrawable(drawableMutate);
            imageView.setPaddingRelative(this.style.getPlayVideoIconPaddingStart(), this.style.getPlayVideoIconPaddingTop(), this.style.getPlayVideoIconPaddingEnd(), this.style.getPlayVideoIconPaddingBottom());
        }

        private final void setupUserAvatar(AttachmentGalleryItem attachmentGalleryItem) {
            User user = attachmentGalleryItem.getUser();
            if (!this.style.getShowUserAvatars()) {
                CardView userAvatarCardView = this.binding.userAvatarCardView;
                AbstractC22676k.m65749i(userAvatarCardView, "userAvatarCardView");
                userAvatarCardView.setVisibility(8);
            } else {
                CardView userAvatarCardView2 = this.binding.userAvatarCardView;
                AbstractC22676k.m65749i(userAvatarCardView2, "userAvatarCardView");
                userAvatarCardView2.setVisibility(0);
                UserAvatarView.setUser$default(this.binding.userAvatarView, user, false, 2, null);
            }
        }

        public final void bind(AttachmentGalleryItem attachmentGalleryItem) {
            AbstractC22676k.m65750j(attachmentGalleryItem, "attachmentGalleryItem");
            setupUserAvatar(attachmentGalleryItem);
            setupPlayButton(attachmentGalleryItem.getAttachment().getType());
            loadImage(attachmentGalleryItem);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaAttachmentAdapter(MediaAttachmentGridViewStyle style, MediaAttachmentClickListener mediaAttachmentClickListener) {
        super(AttachmentGalleryItemDiffCallback.INSTANCE);
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(mediaAttachmentClickListener, "mediaAttachmentClickListener");
        this.style = style;
        this.mediaAttachmentClickListener = mediaAttachmentClickListener;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(MediaAttachmentViewHolder holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        Object item = getItem(position);
        AbstractC22676k.m65749i(item, "getItem(...)");
        holder.bind((AttachmentGalleryItem) item);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final MediaAttachmentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        return new MediaAttachmentViewHolder(StreamUiItemMediaAttachmentBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false), this.mediaAttachmentClickListener, this.style);
    }
}
