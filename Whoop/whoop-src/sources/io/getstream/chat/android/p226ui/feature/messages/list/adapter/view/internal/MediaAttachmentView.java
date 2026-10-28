package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.C1141d;
import androidx.constraintlayout.widget.C1153p;
import androidx.constraintlayout.widget.ConstraintLayout;
import c93.InterfaceC4339a;
import com.google.android.material.imageview.ShapeableImageView;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader;
import io.getstream.chat.android.p226ui.common.images.resizing.StringExtensionsKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiMediaAttachmentViewBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.MediaAttachmentViewStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.ImageUtilsKt;
import io.getstream.chat.android.p226ui.utils.extensions.ConstraintLayoutKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import kr.C22782a;
import kr.C22786e;
import kr.C22788g;
import kr.C22790i;
import kr.C22792k;
import l83.C23454a0;
import p133f1.C13990x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 D2\u00020\u0001:\u0001DB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001a\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\b\b\u0002\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b%\u0010&J-\u0010,\u001a\u00020\f2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'¢\u0006\u0004\b,\u0010-R$\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010=\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "(Landroid/util/AttributeSet;)V", "setupPlayIcon", "()V", "", "isLoading", "showLoading", "(Z)V", "", "mediaUrl", "showImagePlaceholder", "Lkotlin/Function0;", "onCompleteCallback", "showMediaPreview", "(Ljava/lang/Object;ZLc93/a;)V", "andMoreCount", "showMoreCount", "(I)V", "Lkr/k;", "shapeAppearanceModel", "setMediaPreviewShape", "(Lkr/k;)V", "Lio/getstream/chat/android/models/Attachment;", "attachment", "showAttachment", "(Lio/getstream/chat/android/models/Attachment;I)V", "", "topLeft", "topRight", "bottomRight", "bottomLeft", "setMediaPreviewShapeByCorners", "(FFFF)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;", "attachmentClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;", "getAttachmentClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;", "setAttachmentClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;", "attachmentLongClickListener", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;", "getAttachmentLongClickListener", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;", "setAttachmentLongClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;", "getBinding$stream_chat_android_ui_components_release", "()Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MediaAttachmentView extends ConstraintLayout {
    private static final int NO_MORE_COUNT = 0;
    private AttachmentClickListener attachmentClickListener;
    private AttachmentLongClickListener attachmentLongClickListener;
    private final StreamUiMediaAttachmentViewBinding binding;
    private MediaAttachmentViewStyle style;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaAttachmentView(Context context) {
        this(context, null, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 binding$lambda$1$lambda$0(StreamUiMediaAttachmentViewBinding streamUiMediaAttachmentViewBinding, C1153p updateConstraints) {
        AbstractC22676k.m65750j(updateConstraints, "$this$updateConstraints");
        ConstraintLayout root = streamUiMediaAttachmentViewBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ConstraintLayoutKt.constrainViewToParentBySide(updateConstraints, root, 1);
        ConstraintLayout root2 = streamUiMediaAttachmentViewBinding.getRoot();
        AbstractC22676k.m65749i(root2, "getRoot(...)");
        ConstraintLayoutKt.constrainViewToParentBySide(updateConstraints, root2, 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public static void m55504f(MediaAttachmentView mediaAttachmentView, Attachment attachment, View view) {
        AttachmentClickListener attachmentClickListener = mediaAttachmentView.attachmentClickListener;
        if (attachmentClickListener != null) {
            attachmentClickListener.onAttachmentClick(attachment);
        }
    }

    private final void init(AttributeSet attrs) {
        MediaAttachmentViewStyle.Companion companion = MediaAttachmentViewStyle.INSTANCE;
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        MediaAttachmentViewStyle mediaAttachmentViewStyleInvoke = companion.invoke(context, attrs);
        this.style = mediaAttachmentViewStyleInvoke;
        ProgressBar progressBar = this.binding.loadingProgressBar;
        if (mediaAttachmentViewStyleInvoke == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        progressBar.setIndeterminateDrawable(mediaAttachmentViewStyleInvoke.getProgressIcon());
        TextView moreCountLabel = this.binding.moreCountLabel;
        AbstractC22676k.m65749i(moreCountLabel, "moreCountLabel");
        MediaAttachmentViewStyle mediaAttachmentViewStyle = this.style;
        if (mediaAttachmentViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        TextStyleKt.setTextStyle(moreCountLabel, mediaAttachmentViewStyle.getMoreCountTextStyle());
        setupPlayIcon();
    }

    /* JADX INFO: renamed from: k */
    public static void m55506k(MediaAttachmentView mediaAttachmentView, View view) {
        AttachmentLongClickListener attachmentLongClickListener = mediaAttachmentView.attachmentLongClickListener;
        if (attachmentLongClickListener != null) {
            attachmentLongClickListener.onAttachmentLongClick();
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m55508m(MediaAttachmentView mediaAttachmentView) {
        mediaAttachmentView.showLoading(true);
    }

    private final void setMediaPreviewShape(C22792k shapeAppearanceModel) {
        this.binding.imageView.setShapeAppearanceModel(shapeAppearanceModel);
        ShapeableImageView shapeableImageView = this.binding.imageView;
        C22788g c22788g = new C22788g(shapeAppearanceModel);
        MediaAttachmentViewStyle mediaAttachmentViewStyle = this.style;
        if (mediaAttachmentViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        c22788g.setTint(mediaAttachmentViewStyle.getMediaPreviewBackgroundColor());
        shapeableImageView.setBackground(c22788g);
        FrameLayout frameLayout = this.binding.loadImage;
        C22788g c22788g2 = new C22788g(shapeAppearanceModel);
        MediaAttachmentViewStyle mediaAttachmentViewStyle2 = this.style;
        if (mediaAttachmentViewStyle2 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        c22788g2.setTint(mediaAttachmentViewStyle2.getMediaPreviewBackgroundColor());
        frameLayout.setBackground(c22788g2);
        FrameLayout frameLayout2 = this.binding.moreCount;
        C22788g c22788g3 = new C22788g(shapeAppearanceModel);
        MediaAttachmentViewStyle mediaAttachmentViewStyle3 = this.style;
        if (mediaAttachmentViewStyle3 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        c22788g3.setTint(mediaAttachmentViewStyle3.getMoreCountOverlayColor());
        frameLayout2.setBackground(c22788g3);
    }

    private final void setupPlayIcon() {
        Drawable drawableMutate;
        CardView cardView = this.binding.playIconCardView;
        MediaAttachmentViewStyle mediaAttachmentViewStyle = this.style;
        if (mediaAttachmentViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        cardView.setElevation(mediaAttachmentViewStyle.getPlayVideoIconElevation());
        MediaAttachmentViewStyle mediaAttachmentViewStyle2 = this.style;
        if (mediaAttachmentViewStyle2 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        cardView.setCardBackgroundColor(mediaAttachmentViewStyle2.getPlayVideoIconBackgroundColor());
        MediaAttachmentViewStyle mediaAttachmentViewStyle3 = this.style;
        if (mediaAttachmentViewStyle3 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        cardView.setRadius(mediaAttachmentViewStyle3.getPlayVideoIconCornerRadius());
        ImageView imageView = this.binding.playIconImageView;
        MediaAttachmentViewStyle mediaAttachmentViewStyle4 = this.style;
        if (mediaAttachmentViewStyle4 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        Drawable playVideoIcon = mediaAttachmentViewStyle4.getPlayVideoIcon();
        if (playVideoIcon == null || (drawableMutate = playVideoIcon.mutate()) == null) {
            drawableMutate = null;
        } else {
            MediaAttachmentViewStyle mediaAttachmentViewStyle5 = this.style;
            if (mediaAttachmentViewStyle5 == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            Integer playVideoIconTint = mediaAttachmentViewStyle5.getPlayVideoIconTint();
            if (playVideoIconTint != null) {
                drawableMutate.setTint(playVideoIconTint.intValue());
            }
        }
        imageView.setImageDrawable(drawableMutate);
        MediaAttachmentViewStyle mediaAttachmentViewStyle6 = this.style;
        if (mediaAttachmentViewStyle6 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        int playVideoIconPaddingStart = mediaAttachmentViewStyle6.getPlayVideoIconPaddingStart();
        MediaAttachmentViewStyle mediaAttachmentViewStyle7 = this.style;
        if (mediaAttachmentViewStyle7 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        int playVideoIconPaddingTop = mediaAttachmentViewStyle7.getPlayVideoIconPaddingTop();
        MediaAttachmentViewStyle mediaAttachmentViewStyle8 = this.style;
        if (mediaAttachmentViewStyle8 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        int playVideoIconPaddingEnd = mediaAttachmentViewStyle8.getPlayVideoIconPaddingEnd();
        MediaAttachmentViewStyle mediaAttachmentViewStyle9 = this.style;
        if (mediaAttachmentViewStyle9 != null) {
            imageView.setPaddingRelative(playVideoIconPaddingStart, playVideoIconPaddingTop, playVideoIconPaddingEnd, mediaAttachmentViewStyle9.getPlayVideoIconPaddingBottom());
        } else {
            AbstractC22676k.m65757q("style");
            throw null;
        }
    }

    public static /* synthetic */ void showAttachment$default(MediaAttachmentView mediaAttachmentView, Attachment attachment, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        mediaAttachmentView.showAttachment(attachment, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 showAttachment$lambda$5(int i13, MediaAttachmentView mediaAttachmentView) {
        if (i13 > 0) {
            mediaAttachmentView.showMoreCount(i13);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 showAttachment$lambda$6(InterfaceC4339a interfaceC4339a, MediaAttachmentView mediaAttachmentView, Attachment attachment) {
        interfaceC4339a.invoke();
        ImageView playIconImageView = mediaAttachmentView.binding.playIconImageView;
        AbstractC22676k.m65749i(playIconImageView, "playIconImageView");
        playIconImageView.setVisibility(AttachmentUtilsKt.isVideo(attachment) ? 0 : 8);
        return C23454a0.f92919a;
    }

    private static final void showAttachment$lambda$7(MediaAttachmentView mediaAttachmentView, Attachment attachment, View view) {
        AttachmentClickListener attachmentClickListener = mediaAttachmentView.attachmentClickListener;
        if (attachmentClickListener != null) {
            attachmentClickListener.onAttachmentClick(attachment);
        }
    }

    private static final boolean showAttachment$lambda$8(MediaAttachmentView mediaAttachmentView, View view) {
        AttachmentLongClickListener attachmentLongClickListener = mediaAttachmentView.attachmentLongClickListener;
        if (attachmentLongClickListener == null) {
            return true;
        }
        attachmentLongClickListener.onAttachmentLongClick();
        return true;
    }

    private final void showLoading(boolean isLoading) {
        FrameLayout loadImage = this.binding.loadImage;
        AbstractC22676k.m65749i(loadImage, "loadImage");
        loadImage.setVisibility(isLoading ? 0 : 8);
    }

    private final void showMediaPreview(Object mediaUrl, boolean showImagePlaceholder, InterfaceC4339a onCompleteCallback) {
        Drawable drawable;
        if (showImagePlaceholder) {
            MediaAttachmentViewStyle mediaAttachmentViewStyle = this.style;
            if (mediaAttachmentViewStyle == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            Drawable drawableMutate = mediaAttachmentViewStyle.getPlaceholderIcon().mutate();
            MediaAttachmentViewStyle mediaAttachmentViewStyle2 = this.style;
            if (mediaAttachmentViewStyle2 == null) {
                AbstractC22676k.m65757q("style");
                throw null;
            }
            Integer placeholderIconTint = mediaAttachmentViewStyle2.getPlaceholderIconTint();
            if (placeholderIconTint != null) {
                drawableMutate.setTint(placeholderIconTint.intValue());
            }
            drawable = drawableMutate;
        } else {
            drawable = null;
        }
        ShapeableImageView imageView = this.binding.imageView;
        AbstractC22676k.m65749i(imageView, "imageView");
        ImageUtilsKt.load$default(imageView, mediaUrl, drawable, (StreamImageLoader.ImageTransformation) null, new C19773d(this, 1), new C19788s(2, this, onCompleteCallback), 4, (Object) null);
    }

    private static final C23454a0 showMediaPreview$lambda$10(MediaAttachmentView mediaAttachmentView) {
        mediaAttachmentView.showLoading(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 showMediaPreview$lambda$11(MediaAttachmentView mediaAttachmentView, InterfaceC4339a interfaceC4339a) {
        mediaAttachmentView.showLoading(false);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    private final void showMoreCount(int andMoreCount) {
        FrameLayout moreCount = this.binding.moreCount;
        AbstractC22676k.m65749i(moreCount, "moreCount");
        moreCount.setVisibility(0);
        this.binding.moreCountLabel.setText(getContext().getString(C19469R.string.stream_ui_message_list_attachment_more_count, Integer.valueOf(andMoreCount)));
    }

    public final AttachmentClickListener getAttachmentClickListener() {
        return this.attachmentClickListener;
    }

    public final AttachmentLongClickListener getAttachmentLongClickListener() {
        return this.attachmentLongClickListener;
    }

    /* JADX INFO: renamed from: getBinding$stream_chat_android_ui_components_release, reason: from getter */
    public final StreamUiMediaAttachmentViewBinding getBinding() {
        return this.binding;
    }

    public final void setAttachmentClickListener(AttachmentClickListener attachmentClickListener) {
        this.attachmentClickListener = attachmentClickListener;
    }

    public final void setAttachmentLongClickListener(AttachmentLongClickListener attachmentLongClickListener) {
        this.attachmentLongClickListener = attachmentLongClickListener;
    }

    public final void setMediaPreviewShapeByCorners(float topLeft, float topRight, float bottomRight, float bottomLeft) {
        C22790i c22790i = new C22790i();
        C22790i c22790i2 = new C22790i();
        C22790i c22790i3 = new C22790i();
        C22790i c22790i4 = new C22790i();
        C22786e c22786e = new C22786e(0);
        C22786e c22786e2 = new C22786e(0);
        C22786e c22786e3 = new C22786e(0);
        C22786e c22786e4 = new C22786e(0);
        C22782a c22782a = new C22782a(topLeft);
        C22782a c22782a2 = new C22782a(topRight);
        C22782a c22782a3 = new C22782a(bottomRight);
        C22782a c22782a4 = new C22782a(bottomLeft);
        C22792k c22792k = new C22792k();
        c22792k.f89766a = c22790i;
        c22792k.f89767b = c22790i2;
        c22792k.f89768c = c22790i3;
        c22792k.f89769d = c22790i4;
        c22792k.f89770e = c22782a;
        c22792k.f89771f = c22782a2;
        c22792k.f89772g = c22782a3;
        c22792k.f89773h = c22782a4;
        c22792k.f89774i = c22786e;
        c22792k.f89775j = c22786e2;
        c22792k.f89776k = c22786e3;
        c22792k.f89777l = c22786e4;
        setMediaPreviewShape(c22792k);
    }

    public final void showAttachment(Attachment attachment, int andMoreCount) {
        Object objApplyStreamCdnImageResizingIfEnabled;
        AbstractC22676k.m65750j(attachment, "attachment");
        if (AttachmentUtilsKt.isImage(attachment)) {
            String imageUrl = attachment.getImageUrl();
            if (imageUrl != null) {
                objApplyStreamCdnImageResizingIfEnabled = StringExtensionsKt.applyStreamCdnImageResizingIfEnabled(imageUrl, ChatUI.getStreamCdnImageResizing());
            } else {
                objApplyStreamCdnImageResizingIfEnabled = attachment.getUpload();
                if (objApplyStreamCdnImageResizingIfEnabled == null) {
                    return;
                }
            }
        } else if (AttachmentUtilsKt.isVideo(attachment) && ChatUI.getVideoThumbnailsEnabled() && attachment.getThumbUrl() != null) {
            String thumbUrl = attachment.getThumbUrl();
            if (thumbUrl == null) {
                return;
            } else {
                objApplyStreamCdnImageResizingIfEnabled = StringExtensionsKt.applyStreamCdnImageResizingIfEnabled(thumbUrl, ChatUI.getStreamCdnImageResizing());
            }
        } else {
            objApplyStreamCdnImageResizingIfEnabled = null;
        }
        showMediaPreview(objApplyStreamCdnImageResizingIfEnabled, AttachmentUtilsKt.isImage(attachment), new C19787r(new C13990x(andMoreCount, this), this, attachment, 1));
        setOnClickListener(new ViewOnClickListenerC19771b(8, this, attachment));
        setOnLongClickListener(new ViewOnLongClickListenerC19775f(this, 2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaAttachmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaAttachmentView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        StreamUiMediaAttachmentViewBinding streamUiMediaAttachmentViewBindingInflate = StreamUiMediaAttachmentViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), null, false);
        streamUiMediaAttachmentViewBindingInflate.getRoot().setLayoutParams(new C1141d(-1, -1));
        int iDpToPx = IntKt.dpToPx(1);
        streamUiMediaAttachmentViewBindingInflate.getRoot().setPadding(iDpToPx, iDpToPx, iDpToPx, iDpToPx);
        addView(streamUiMediaAttachmentViewBindingInflate.getRoot());
        ConstraintLayoutKt.updateConstraints(this, new C19781l(streamUiMediaAttachmentViewBindingInflate, 1));
        this.binding = streamUiMediaAttachmentViewBindingInflate;
        init(attributeSet);
    }
}
