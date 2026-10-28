package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c93.InterfaceC4339a;
import com.google.android.material.imageview.ShapeableImageView;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader;
import io.getstream.chat.android.p226ui.common.state.messages.list.CancelGiphy;
import io.getstream.chat.android.p226ui.common.state.messages.list.SendGiphy;
import io.getstream.chat.android.p226ui.common.state.messages.list.ShuffleGiphy;
import io.getstream.chat.android.p226ui.common.utils.GiphyInfo;
import io.getstream.chat.android.p226ui.common.utils.GiphyInfoType;
import io.getstream.chat.android.p226ui.common.utils.GiphyInfoTypeKt;
import io.getstream.chat.android.p226ui.common.utils.extensions.AttachmentKt;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMessageGiphyBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.GiphyViewHolderStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.ImageUtilsKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB;\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "Landroid/view/ViewGroup;", "parent", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "decorators", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "listeners", "Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;", "style", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;", "binding", "<init>", "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;)V", "Ll83/a0;", "applyStyle", "()V", "data", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "diff", "bindData", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V", "Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;", "getStyle", "()Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class GiphyViewHolder extends DecoratedBaseMessageItemViewHolder<MessageListItem.MessageItem> {
    private static final Companion Companion = new Companion();
    private static final String GIPHY_PREFIX = "/giphy ";
    private final StreamUiItemMessageGiphyBinding binding;
    private final GiphyViewHolderStyle style;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder$Companion;", "", "<init>", "()V", "GIPHY_PREFIX", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ GiphyViewHolder(ViewGroup viewGroup, List list, MessageListListeners messageListListeners, GiphyViewHolderStyle giphyViewHolderStyle, StreamUiItemMessageGiphyBinding streamUiItemMessageGiphyBinding, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, list, messageListListeners, giphyViewHolderStyle, (i13 & 16) != 0 ? StreamUiItemMessageGiphyBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup, false) : streamUiItemMessageGiphyBinding);
    }

    private final void applyStyle() {
        StreamUiItemMessageGiphyBinding streamUiItemMessageGiphyBinding = this.binding;
        streamUiItemMessageGiphyBinding.cardView.setBackgroundTintList(ColorStateList.valueOf(this.style.getCardBackgroundColor()));
        streamUiItemMessageGiphyBinding.cardView.setElevation(this.style.getCardElevation());
        streamUiItemMessageGiphyBinding.horizontalDivider.setBackgroundColor(this.style.getCardButtonDividerColor());
        streamUiItemMessageGiphyBinding.verticalDivider1.setBackgroundColor(this.style.getCardButtonDividerColor());
        streamUiItemMessageGiphyBinding.verticalDivider2.setBackgroundColor(this.style.getCardButtonDividerColor());
        streamUiItemMessageGiphyBinding.giphyIconImageView.setImageDrawable(this.style.getGiphyIcon());
        TextView giphyLabelTextView = streamUiItemMessageGiphyBinding.giphyLabelTextView;
        AbstractC22676k.m65749i(giphyLabelTextView, "giphyLabelTextView");
        TextStyleKt.setTextStyle(giphyLabelTextView, this.style.getLabelTextStyle());
        TextView giphyQueryTextView = streamUiItemMessageGiphyBinding.giphyQueryTextView;
        AbstractC22676k.m65749i(giphyQueryTextView, "giphyQueryTextView");
        TextStyleKt.setTextStyle(giphyQueryTextView, this.style.getQueryTextStyle());
        TextView cancelButton = streamUiItemMessageGiphyBinding.cancelButton;
        AbstractC22676k.m65749i(cancelButton, "cancelButton");
        TextStyleKt.setTextStyle(cancelButton, this.style.getCancelButtonTextStyle());
        TextView shuffleButton = streamUiItemMessageGiphyBinding.shuffleButton;
        AbstractC22676k.m65749i(shuffleButton, "shuffleButton");
        TextStyleKt.setTextStyle(shuffleButton, this.style.getShuffleButtonTextStyle());
        TextView sendButton = streamUiItemMessageGiphyBinding.sendButton;
        AbstractC22676k.m65749i(sendButton, "sendButton");
        TextStyleKt.setTextStyle(sendButton, this.style.getSendButtonTextStyle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindData$lambda$7$lambda$5(GiphyViewHolder giphyViewHolder) {
        ProgressBar loadingProgressBar = giphyViewHolder.binding.loadingProgressBar;
        AbstractC22676k.m65749i(loadingProgressBar, "loadingProgressBar");
        loadingProgressBar.setVisibility(0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindData$lambda$7$lambda$6(GiphyViewHolder giphyViewHolder) {
        ProgressBar loadingProgressBar = giphyViewHolder.binding.loadingProgressBar;
        AbstractC22676k.m65749i(loadingProgressBar, "loadingProgressBar");
        loadingProgressBar.setVisibility(8);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void lambda$4$lambda$3$lambda$0(MessageListListeners messageListListeners, GiphyViewHolder giphyViewHolder, View view) {
        messageListListeners.getGiphySendListener().onGiphySend(new CancelGiphy(((MessageListItem.MessageItem) giphyViewHolder.getData()).getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void lambda$4$lambda$3$lambda$1(MessageListListeners messageListListeners, GiphyViewHolder giphyViewHolder, View view) {
        messageListListeners.getGiphySendListener().onGiphySend(new ShuffleGiphy(((MessageListItem.MessageItem) giphyViewHolder.getData()).getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void lambda$4$lambda$3$lambda$2(MessageListListeners messageListListeners, GiphyViewHolder giphyViewHolder, View view) {
        messageListListeners.getGiphySendListener().onGiphySend(new SendGiphy(((MessageListItem.MessageItem) giphyViewHolder.getData()).getMessage()));
    }

    public final StreamUiItemMessageGiphyBinding getBinding() {
        return this.binding;
    }

    public final GiphyViewHolderStyle getStyle() {
        return this.style;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder, io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void bindData(MessageListItem.MessageItem data, MessageListItemPayloadDiff diff) {
        String giphyFallbackPreviewUrl;
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(diff, "diff");
        super.bindData(data, diff);
        applyStyle();
        Attachment attachment = (Attachment) AbstractC25265s.m74100H0(data.getMessage().getAttachments());
        if (attachment != null) {
            GiphyInfo giphyInfo = GiphyInfoTypeKt.giphyInfo(attachment, GiphyInfoType.FIXED_HEIGHT);
            if ((giphyInfo == null || (giphyFallbackPreviewUrl = giphyInfo.getUrl()) == null) && (giphyFallbackPreviewUrl = AttachmentKt.getGiphyFallbackPreviewUrl(attachment)) == null) {
                return;
            }
            String str = giphyFallbackPreviewUrl;
            ShapeableImageView giphyPreview = this.binding.giphyPreview;
            AbstractC22676k.m65749i(giphyPreview, "giphyPreview");
            final int i13 = 0;
            InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.h

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ GiphyViewHolder f74688x;

                {
                    this.f74688x = this;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i13) {
                        case 0:
                            GiphyViewHolder.bindData$lambda$7$lambda$5(this.f74688x);
                            break;
                        default:
                            GiphyViewHolder.bindData$lambda$7$lambda$6(this.f74688x);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            };
            final int i14 = 1;
            ImageUtilsKt.load$default(giphyPreview, str, (Integer) null, (StreamImageLoader.ImageTransformation) null, interfaceC4339a, new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.h

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ GiphyViewHolder f74688x;

                {
                    this.f74688x = this;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            GiphyViewHolder.bindData$lambda$7$lambda$5(this.f74688x);
                            break;
                        default:
                            GiphyViewHolder.bindData$lambda$7$lambda$6(this.f74688x);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            }, 6, (Object) null);
        }
        this.binding.giphyQueryTextView.setText(AbstractC39421y.m125926K(data.getMessage().getText(), GIPHY_PREFIX, "", false));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GiphyViewHolder(ViewGroup parent, List<? extends Decorator> decorators, final MessageListListeners messageListListeners, GiphyViewHolderStyle style, StreamUiItemMessageGiphyBinding binding) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(decorators, "decorators");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(binding, "binding");
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root, decorators);
        this.style = style;
        this.binding = binding;
        if (messageListListeners != null) {
            final int i13 = 0;
            binding.cancelButton.setOnClickListener(new View.OnClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            GiphyViewHolder.lambda$4$lambda$3$lambda$0(messageListListeners, this, view);
                            break;
                        case 1:
                            GiphyViewHolder.lambda$4$lambda$3$lambda$1(messageListListeners, this, view);
                            break;
                        default:
                            GiphyViewHolder.lambda$4$lambda$3$lambda$2(messageListListeners, this, view);
                            break;
                    }
                }
            });
            final int i14 = 1;
            binding.shuffleButton.setOnClickListener(new View.OnClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            GiphyViewHolder.lambda$4$lambda$3$lambda$0(messageListListeners, this, view);
                            break;
                        case 1:
                            GiphyViewHolder.lambda$4$lambda$3$lambda$1(messageListListeners, this, view);
                            break;
                        default:
                            GiphyViewHolder.lambda$4$lambda$3$lambda$2(messageListListeners, this, view);
                            break;
                    }
                }
            });
            final int i15 = 2;
            binding.sendButton.setOnClickListener(new View.OnClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            GiphyViewHolder.lambda$4$lambda$3$lambda$0(messageListListeners, this, view);
                            break;
                        case 1:
                            GiphyViewHolder.lambda$4$lambda$3$lambda$1(messageListListeners, this, view);
                            break;
                        default:
                            GiphyViewHolder.lambda$4$lambda$3$lambda$2(messageListListeners, this, view);
                            break;
                    }
                }
            });
        }
    }
}
