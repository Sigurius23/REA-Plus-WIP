package io.getstream.chat.android.p226ui.feature.messages.list;

import android.content.Context;
import android.content.res.TypedArray;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "unreadLabelButtonEnabled", "", "unreadLabelButtonColor", "", "unreadLabelButtonRippleColor", "unreadLabelButtonTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "<init>", "(ZIILio/getstream/chat/android/ui/font/TextStyle;)V", "getUnreadLabelButtonEnabled", "()Z", "getUnreadLabelButtonColor", "()I", "getUnreadLabelButtonRippleColor", "getUnreadLabelButtonTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "Builder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UnreadLabelButtonStyle implements ViewStyle {
    private final int unreadLabelButtonColor;
    private final boolean unreadLabelButtonEnabled;
    private final int unreadLabelButtonRippleColor;
    private final TextStyle unreadLabelButtonTextStyle;

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tJ\u001a\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle$Builder;", "", "context", "Landroid/content/Context;", "attrs", "Landroid/content/res/TypedArray;", "<init>", "(Landroid/content/Context;Landroid/content/res/TypedArray;)V", "unreadLabelButtonEnabled", "", "unreadLabelButtonColor", "", "unreadLabelButtonRippleColor", "unreadLabelButtonEnabledStyleableId", "defaultValue", "unreadLabelButtonColorStyleableId", "unreadLabelButtonRippleColorStyleableId", "defaultColor", "build", "Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private final TypedArray attrs;
        private final Context context;
        private int unreadLabelButtonColor;
        private boolean unreadLabelButtonEnabled;
        private int unreadLabelButtonRippleColor;

        public Builder(Context context, TypedArray attrs) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(attrs, "attrs");
            this.context = context;
            this.attrs = attrs;
            this.unreadLabelButtonEnabled = true;
        }

        public final UnreadLabelButtonStyle build() {
            TextStyle.Builder builder = new TextStyle.Builder(this.attrs);
            builder.size(C19469R.styleable.MessageListView_streamUiUnreadLabelButtonTextSize, ContextKt.getDimension(this.context, C19469R.dimen.stream_ui_scroll_button_unread_badge_text_size));
            builder.color(C19469R.styleable.MessageListView_streamUiUnreadLabelButtonTextColor, ContextKt.getColorCompat(this.context, C19469R.color.stream_ui_literal_white));
            builder.font(C19469R.styleable.MessageListView_streamUiUnreadLabelButtonFontAssets, C19469R.styleable.MessageListView_streamUiUnreadLabelButtonTextFont);
            builder.style(C19469R.styleable.MessageListView_streamUiUnreadLabelButtonTextStyle, 1);
            return TransformStyle.getUnreadLabelButtonStyleTransformer().transform(new UnreadLabelButtonStyle(this.unreadLabelButtonEnabled, this.unreadLabelButtonColor, this.unreadLabelButtonRippleColor, builder.build()));
        }

        public final Builder unreadLabelButtonColor(int unreadLabelButtonColorStyleableId, int defaultValue) {
            this.unreadLabelButtonColor = this.attrs.getColor(unreadLabelButtonColorStyleableId, defaultValue);
            return this;
        }

        public final Builder unreadLabelButtonEnabled(int unreadLabelButtonEnabledStyleableId, boolean defaultValue) {
            this.unreadLabelButtonEnabled = this.attrs.getBoolean(unreadLabelButtonEnabledStyleableId, defaultValue);
            return this;
        }

        public final Builder unreadLabelButtonRippleColor(int unreadLabelButtonRippleColorStyleableId, int defaultColor) {
            this.unreadLabelButtonRippleColor = this.attrs.getColor(unreadLabelButtonRippleColorStyleableId, defaultColor);
            return this;
        }
    }

    public UnreadLabelButtonStyle(boolean z4, int i13, int i14, TextStyle unreadLabelButtonTextStyle) {
        AbstractC22676k.m65750j(unreadLabelButtonTextStyle, "unreadLabelButtonTextStyle");
        this.unreadLabelButtonEnabled = z4;
        this.unreadLabelButtonColor = i13;
        this.unreadLabelButtonRippleColor = i14;
        this.unreadLabelButtonTextStyle = unreadLabelButtonTextStyle;
    }

    public static /* synthetic */ UnreadLabelButtonStyle copy$default(UnreadLabelButtonStyle unreadLabelButtonStyle, boolean z4, int i13, int i14, TextStyle textStyle, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z4 = unreadLabelButtonStyle.unreadLabelButtonEnabled;
        }
        if ((i15 & 2) != 0) {
            i13 = unreadLabelButtonStyle.unreadLabelButtonColor;
        }
        if ((i15 & 4) != 0) {
            i14 = unreadLabelButtonStyle.unreadLabelButtonRippleColor;
        }
        if ((i15 & 8) != 0) {
            textStyle = unreadLabelButtonStyle.unreadLabelButtonTextStyle;
        }
        return unreadLabelButtonStyle.copy(z4, i13, i14, textStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getUnreadLabelButtonEnabled() {
        return this.unreadLabelButtonEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUnreadLabelButtonColor() {
        return this.unreadLabelButtonColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUnreadLabelButtonRippleColor() {
        return this.unreadLabelButtonRippleColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextStyle getUnreadLabelButtonTextStyle() {
        return this.unreadLabelButtonTextStyle;
    }

    public final UnreadLabelButtonStyle copy(boolean unreadLabelButtonEnabled, int unreadLabelButtonColor, int unreadLabelButtonRippleColor, TextStyle unreadLabelButtonTextStyle) {
        AbstractC22676k.m65750j(unreadLabelButtonTextStyle, "unreadLabelButtonTextStyle");
        return new UnreadLabelButtonStyle(unreadLabelButtonEnabled, unreadLabelButtonColor, unreadLabelButtonRippleColor, unreadLabelButtonTextStyle);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadLabelButtonStyle)) {
            return false;
        }
        UnreadLabelButtonStyle unreadLabelButtonStyle = (UnreadLabelButtonStyle) other;
        return this.unreadLabelButtonEnabled == unreadLabelButtonStyle.unreadLabelButtonEnabled && this.unreadLabelButtonColor == unreadLabelButtonStyle.unreadLabelButtonColor && this.unreadLabelButtonRippleColor == unreadLabelButtonStyle.unreadLabelButtonRippleColor && AbstractC22676k.m65745e(this.unreadLabelButtonTextStyle, unreadLabelButtonStyle.unreadLabelButtonTextStyle);
    }

    public final int getUnreadLabelButtonColor() {
        return this.unreadLabelButtonColor;
    }

    public final boolean getUnreadLabelButtonEnabled() {
        return this.unreadLabelButtonEnabled;
    }

    public final int getUnreadLabelButtonRippleColor() {
        return this.unreadLabelButtonRippleColor;
    }

    public final TextStyle getUnreadLabelButtonTextStyle() {
        return this.unreadLabelButtonTextStyle;
    }

    public final int hashCode() {
        return this.unreadLabelButtonTextStyle.hashCode() + AbstractC11266d.m30448b(this.unreadLabelButtonRippleColor, AbstractC11266d.m30448b(this.unreadLabelButtonColor, Boolean.hashCode(this.unreadLabelButtonEnabled) * 31, 31), 31);
    }

    public final String toString() {
        return "UnreadLabelButtonStyle(unreadLabelButtonEnabled=" + this.unreadLabelButtonEnabled + ", unreadLabelButtonColor=" + this.unreadLabelButtonColor + ", unreadLabelButtonRippleColor=" + this.unreadLabelButtonRippleColor + ", unreadLabelButtonTextStyle=" + this.unreadLabelButtonTextStyle + ")";
    }
}
