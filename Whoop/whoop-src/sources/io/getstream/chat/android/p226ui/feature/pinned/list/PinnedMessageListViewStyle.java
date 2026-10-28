package io.getstream.chat.android.p226ui.feature.pinned.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.feature.messages.preview.MessagePreviewStyle;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import nh3.AbstractC26725a;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "backgroundColor", "", "emptyStateDrawable", "Landroid/graphics/drawable/Drawable;", "messagePreviewStyle", "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;", "<init>", "(ILandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V", "getBackgroundColor", "()I", "getEmptyStateDrawable", "()Landroid/graphics/drawable/Drawable;", "getMessagePreviewStyle", "()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class PinnedMessageListViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final int backgroundColor;
    private final Drawable emptyStateDrawable;
    private final MessagePreviewStyle messagePreviewStyle;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\u0002¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final PinnedMessageListViewStyle invoke(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.PinnedMessageListView, C19469R.attr.streamUiPinnedMessageListStyle, C19469R.style.StreamUi_PinnedMessageList);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int color = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.PinnedMessageListView_streamUiPinnedMessageListBackground, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white_snow));
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.f74392x46b1300e);
            if (drawable == null) {
                drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_pinned_messages_empty);
                AbstractC22676k.m65747g(drawable);
            }
            TextStyle.Builder builder = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder.size(C19469R.styleable.f74402x801c5d5a, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder.color(C19469R.styleable.f74399x82905d2a, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder.font(C19469R.styleable.f74401xf9d80b4b, C19469R.styleable.f74400x801689a8);
            builder.style(C19469R.styleable.f74403x83744b78, 0);
            TextStyle textStyleBuild = builder.build();
            TextStyle.Builder builder2 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder2.size(C19469R.styleable.PinnedMessageListView_streamUiPinnedMessageListMessageTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder2.color(C19469R.styleable.PinnedMessageListView_streamUiPinnedMessageListMessageTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder2.font(C19469R.styleable.f74393x55cff21a, C19469R.styleable.PinnedMessageListView_streamUiPinnedMessageListMessageTextFont);
            builder2.style(C19469R.styleable.PinnedMessageListView_streamUiPinnedMessageListMessageTextStyle, 0);
            TextStyle textStyleBuild2 = builder2.build();
            TextStyle.Builder builder3 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder3.size(C19469R.styleable.f74397xc6ed1fd6, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder3.color(C19469R.styleable.f74394x15d7ea2e, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder3.font(C19469R.styleable.f74396xfd1400c7, C19469R.styleable.f74395xc6e74c24);
            builder3.style(C19469R.styleable.f74398x16bbd87c, 0);
            return TransformStyle.getPinnedMessageListViewStyleTransformer().transform(new PinnedMessageListViewStyle(color, drawable, new MessagePreviewStyle(textStyleBuild, textStyleBuild2, builder3.build())));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public PinnedMessageListViewStyle(int i13, Drawable emptyStateDrawable, MessagePreviewStyle messagePreviewStyle) {
        AbstractC22676k.m65750j(emptyStateDrawable, "emptyStateDrawable");
        AbstractC22676k.m65750j(messagePreviewStyle, "messagePreviewStyle");
        this.backgroundColor = i13;
        this.emptyStateDrawable = emptyStateDrawable;
        this.messagePreviewStyle = messagePreviewStyle;
    }

    public static /* synthetic */ PinnedMessageListViewStyle copy$default(PinnedMessageListViewStyle pinnedMessageListViewStyle, int i13, Drawable drawable, MessagePreviewStyle messagePreviewStyle, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = pinnedMessageListViewStyle.backgroundColor;
        }
        if ((i14 & 2) != 0) {
            drawable = pinnedMessageListViewStyle.emptyStateDrawable;
        }
        if ((i14 & 4) != 0) {
            messagePreviewStyle = pinnedMessageListViewStyle.messagePreviewStyle;
        }
        return pinnedMessageListViewStyle.copy(i13, drawable, messagePreviewStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Drawable getEmptyStateDrawable() {
        return this.emptyStateDrawable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MessagePreviewStyle getMessagePreviewStyle() {
        return this.messagePreviewStyle;
    }

    public final PinnedMessageListViewStyle copy(int backgroundColor, Drawable emptyStateDrawable, MessagePreviewStyle messagePreviewStyle) {
        AbstractC22676k.m65750j(emptyStateDrawable, "emptyStateDrawable");
        AbstractC22676k.m65750j(messagePreviewStyle, "messagePreviewStyle");
        return new PinnedMessageListViewStyle(backgroundColor, emptyStateDrawable, messagePreviewStyle);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinnedMessageListViewStyle)) {
            return false;
        }
        PinnedMessageListViewStyle pinnedMessageListViewStyle = (PinnedMessageListViewStyle) other;
        return this.backgroundColor == pinnedMessageListViewStyle.backgroundColor && AbstractC22676k.m65745e(this.emptyStateDrawable, pinnedMessageListViewStyle.emptyStateDrawable) && AbstractC22676k.m65745e(this.messagePreviewStyle, pinnedMessageListViewStyle.messagePreviewStyle);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Drawable getEmptyStateDrawable() {
        return this.emptyStateDrawable;
    }

    public final MessagePreviewStyle getMessagePreviewStyle() {
        return this.messagePreviewStyle;
    }

    public final int hashCode() {
        return this.messagePreviewStyle.hashCode() + AbstractC26725a.m79497a(this.emptyStateDrawable, Integer.hashCode(this.backgroundColor) * 31, 31);
    }

    public final String toString() {
        return "PinnedMessageListViewStyle(backgroundColor=" + this.backgroundColor + ", emptyStateDrawable=" + this.emptyStateDrawable + ", messagePreviewStyle=" + this.messagePreviewStyle + ")";
    }
}
