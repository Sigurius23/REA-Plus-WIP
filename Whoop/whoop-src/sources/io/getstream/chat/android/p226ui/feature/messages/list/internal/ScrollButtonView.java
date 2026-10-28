package io.getstream.chat.android.p226ui.feature.messages.list.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import io.getstream.chat.android.p226ui.databinding.StreamUiScrollButtonViewBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.ScrollButtonViewStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u0012R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "setActionButtonStyle", "()V", "setBadgeStyle", "unreadCount", "setUnreadCountValue", "(I)V", "", "isVisible", "setUnreadCountTextViewVisible", "(Z)V", "", "formatUnreadCount", "(I)Ljava/lang/CharSequence;", "Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;", "scrollButtonViewStyle", "setScrollButtonViewStyle", "(Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;)V", "Landroid/view/View$OnClickListener;", "listener", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "setUnreadCount", "Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;", "I", "Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiScrollButtonViewBinding;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ScrollButtonView extends FrameLayout {
    private static final Companion Companion = new Companion();
    private static final int MAX_UNREAD_VALUE = 999;
    private final StreamUiScrollButtonViewBinding binding;
    private ScrollButtonViewStyle scrollButtonViewStyle;
    private int unreadCount;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView$Companion;", "", "<init>", "()V", "MAX_UNREAD_VALUE", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollButtonView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context));
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiScrollButtonViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this);
    }

    private final CharSequence formatUnreadCount(int unreadCount) {
        return unreadCount > 999 ? "999+" : String.valueOf(unreadCount);
    }

    private final void setActionButtonStyle() {
        ViewGroup.LayoutParams layoutParams = this.binding.scrollActionButton.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            ScrollButtonViewStyle scrollButtonViewStyle = this.scrollButtonViewStyle;
            if (scrollButtonViewStyle == null) {
                AbstractC22676k.m65757q("scrollButtonViewStyle");
                throw null;
            }
            int scrollButtonInternalMargin = scrollButtonViewStyle.getScrollButtonInternalMargin();
            layoutParams2.setMargins(scrollButtonInternalMargin, scrollButtonInternalMargin, scrollButtonInternalMargin, scrollButtonInternalMargin);
        }
        FloatingActionButton floatingActionButton = this.binding.scrollActionButton;
        ScrollButtonViewStyle scrollButtonViewStyle2 = this.scrollButtonViewStyle;
        if (scrollButtonViewStyle2 == null) {
            AbstractC22676k.m65757q("scrollButtonViewStyle");
            throw null;
        }
        floatingActionButton.setRippleColor(scrollButtonViewStyle2.getScrollButtonRippleColor());
        FloatingActionButton floatingActionButton2 = this.binding.scrollActionButton;
        ScrollButtonViewStyle scrollButtonViewStyle3 = this.scrollButtonViewStyle;
        if (scrollButtonViewStyle3 == null) {
            AbstractC22676k.m65757q("scrollButtonViewStyle");
            throw null;
        }
        floatingActionButton2.setImageDrawable(scrollButtonViewStyle3.getScrollButtonIcon());
        FloatingActionButton floatingActionButton3 = this.binding.scrollActionButton;
        ScrollButtonViewStyle scrollButtonViewStyle4 = this.scrollButtonViewStyle;
        if (scrollButtonViewStyle4 == null) {
            AbstractC22676k.m65757q("scrollButtonViewStyle");
            throw null;
        }
        floatingActionButton3.setBackgroundTintList(ColorStateList.valueOf(scrollButtonViewStyle4.getScrollButtonColor()));
        FloatingActionButton floatingActionButton4 = this.binding.scrollActionButton;
        ScrollButtonViewStyle scrollButtonViewStyle5 = this.scrollButtonViewStyle;
        if (scrollButtonViewStyle5 != null) {
            floatingActionButton4.setCompatElevation(scrollButtonViewStyle5.getScrollButtonElevation());
        } else {
            AbstractC22676k.m65757q("scrollButtonViewStyle");
            throw null;
        }
    }

    private final void setBadgeStyle() {
        ViewGroup.LayoutParams layoutParams = this.binding.unreadCountTextView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            ScrollButtonViewStyle scrollButtonViewStyle = this.scrollButtonViewStyle;
            if (scrollButtonViewStyle == null) {
                AbstractC22676k.m65757q("scrollButtonViewStyle");
                throw null;
            }
            layoutParams2.gravity = scrollButtonViewStyle.getScrollButtonBadgeGravity();
        }
        TextView textView = this.binding.unreadCountTextView;
        ScrollButtonViewStyle scrollButtonViewStyle2 = this.scrollButtonViewStyle;
        if (scrollButtonViewStyle2 == null) {
            AbstractC22676k.m65757q("scrollButtonViewStyle");
            throw null;
        }
        textView.setElevation(scrollButtonViewStyle2.getScrollButtonBadgeElevation());
        TextView textView2 = this.binding.unreadCountTextView;
        ScrollButtonViewStyle scrollButtonViewStyle3 = this.scrollButtonViewStyle;
        if (scrollButtonViewStyle3 == null) {
            AbstractC22676k.m65757q("scrollButtonViewStyle");
            throw null;
        }
        textView2.setBackground(scrollButtonViewStyle3.getScrollButtonBadgeIcon());
        ScrollButtonViewStyle scrollButtonViewStyle4 = this.scrollButtonViewStyle;
        if (scrollButtonViewStyle4 == null) {
            AbstractC22676k.m65757q("scrollButtonViewStyle");
            throw null;
        }
        Integer scrollButtonBadgeColor = scrollButtonViewStyle4.getScrollButtonBadgeColor();
        if (scrollButtonBadgeColor != null) {
            this.binding.unreadCountTextView.setBackgroundTintList(ColorStateList.valueOf(scrollButtonBadgeColor.intValue()));
        }
        TextView unreadCountTextView = this.binding.unreadCountTextView;
        AbstractC22676k.m65749i(unreadCountTextView, "unreadCountTextView");
        ScrollButtonViewStyle scrollButtonViewStyle5 = this.scrollButtonViewStyle;
        if (scrollButtonViewStyle5 != null) {
            TextStyleKt.setTextStyle(unreadCountTextView, scrollButtonViewStyle5.getScrollButtonBadgeTextStyle());
        } else {
            AbstractC22676k.m65757q("scrollButtonViewStyle");
            throw null;
        }
    }

    private final void setUnreadCountTextViewVisible(boolean isVisible) {
        TextView unreadCountTextView = this.binding.unreadCountTextView;
        AbstractC22676k.m65749i(unreadCountTextView, "unreadCountTextView");
        unreadCountTextView.setVisibility(isVisible ? 0 : 8);
    }

    private final void setUnreadCountValue(int unreadCount) {
        if (this.unreadCount != unreadCount) {
            this.unreadCount = unreadCount;
            this.binding.unreadCountTextView.setText(formatUnreadCount(unreadCount));
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
        this.binding.scrollActionButton.setOnClickListener(listener);
    }

    public final void setScrollButtonViewStyle(ScrollButtonViewStyle scrollButtonViewStyle) {
        AbstractC22676k.m65750j(scrollButtonViewStyle, "scrollButtonViewStyle");
        this.scrollButtonViewStyle = scrollButtonViewStyle;
        setActionButtonStyle();
        setBadgeStyle();
    }

    public final void setUnreadCount(int unreadCount) {
        ScrollButtonViewStyle scrollButtonViewStyle = this.scrollButtonViewStyle;
        if (scrollButtonViewStyle == null) {
            AbstractC22676k.m65757q("scrollButtonViewStyle");
            throw null;
        }
        if (scrollButtonViewStyle.getScrollButtonEnabled()) {
            ScrollButtonViewStyle scrollButtonViewStyle2 = this.scrollButtonViewStyle;
            if (scrollButtonViewStyle2 == null) {
                AbstractC22676k.m65757q("scrollButtonViewStyle");
                throw null;
            }
            if (scrollButtonViewStyle2.getScrollButtonUnreadEnabled()) {
                setUnreadCountValue(unreadCount);
                setUnreadCountTextViewVisible(unreadCount > 0);
                return;
            }
        }
        setUnreadCountTextViewVisible(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollButtonView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiScrollButtonViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollButtonView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiScrollButtonViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this);
    }
}
