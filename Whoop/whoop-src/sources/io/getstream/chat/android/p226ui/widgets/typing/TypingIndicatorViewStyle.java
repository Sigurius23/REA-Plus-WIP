package io.getstream.chat.android.p226ui.widgets.typing;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "typingIndicatorAnimationView", "", "typingIndicatorUsersTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "<init>", "(ILio/getstream/chat/android/ui/font/TextStyle;)V", "getTypingIndicatorAnimationView", "()I", "getTypingIndicatorUsersTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class TypingIndicatorViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final int typingIndicatorAnimationView;
    private final TextStyle typingIndicatorUsersTextStyle;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\u0002¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final TypingIndicatorViewStyle invoke(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.TypingIndicatorView, C19469R.attr.streamUiTypingIndicatorView, C19469R.style.StreamUi_TypingIndicatorView);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(C19469R.styleable.TypingIndicatorView_streamUiTypingIndicatorAnimationView, C19469R.layout.stream_ui_typing_indicator_animation_view);
            TextStyle.Builder builder = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder.size(C19469R.styleable.TypingIndicatorView_streamUiTypingIndicatorUsersTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_small));
            builder.color(C19469R.styleable.TypingIndicatorView_streamUiTypingIndicatorUsersTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_secondary));
            builder.font(C19469R.styleable.TypingIndicatorView_streamUiTypingIndicatorUsersTextFontAssets, C19469R.styleable.TypingIndicatorView_streamUiTypingIndicatorUsersTextFont);
            builder.style(C19469R.styleable.TypingIndicatorView_streamUiTypingIndicatorUsersTextStyle, 0);
            return TransformStyle.getTypingIndicatorViewStyleTransformer().transform(new TypingIndicatorViewStyle(resourceId, builder.build()));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public TypingIndicatorViewStyle(int i13, TextStyle typingIndicatorUsersTextStyle) {
        AbstractC22676k.m65750j(typingIndicatorUsersTextStyle, "typingIndicatorUsersTextStyle");
        this.typingIndicatorAnimationView = i13;
        this.typingIndicatorUsersTextStyle = typingIndicatorUsersTextStyle;
    }

    public static /* synthetic */ TypingIndicatorViewStyle copy$default(TypingIndicatorViewStyle typingIndicatorViewStyle, int i13, TextStyle textStyle, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = typingIndicatorViewStyle.typingIndicatorAnimationView;
        }
        if ((i14 & 2) != 0) {
            textStyle = typingIndicatorViewStyle.typingIndicatorUsersTextStyle;
        }
        return typingIndicatorViewStyle.copy(i13, textStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTypingIndicatorAnimationView() {
        return this.typingIndicatorAnimationView;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextStyle getTypingIndicatorUsersTextStyle() {
        return this.typingIndicatorUsersTextStyle;
    }

    public final TypingIndicatorViewStyle copy(int typingIndicatorAnimationView, TextStyle typingIndicatorUsersTextStyle) {
        AbstractC22676k.m65750j(typingIndicatorUsersTextStyle, "typingIndicatorUsersTextStyle");
        return new TypingIndicatorViewStyle(typingIndicatorAnimationView, typingIndicatorUsersTextStyle);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypingIndicatorViewStyle)) {
            return false;
        }
        TypingIndicatorViewStyle typingIndicatorViewStyle = (TypingIndicatorViewStyle) other;
        return this.typingIndicatorAnimationView == typingIndicatorViewStyle.typingIndicatorAnimationView && AbstractC22676k.m65745e(this.typingIndicatorUsersTextStyle, typingIndicatorViewStyle.typingIndicatorUsersTextStyle);
    }

    public final int getTypingIndicatorAnimationView() {
        return this.typingIndicatorAnimationView;
    }

    public final TextStyle getTypingIndicatorUsersTextStyle() {
        return this.typingIndicatorUsersTextStyle;
    }

    public final int hashCode() {
        return this.typingIndicatorUsersTextStyle.hashCode() + (Integer.hashCode(this.typingIndicatorAnimationView) * 31);
    }

    public final String toString() {
        return "TypingIndicatorViewStyle(typingIndicatorAnimationView=" + this.typingIndicatorAnimationView + ", typingIndicatorUsersTextStyle=" + this.typingIndicatorUsersTextStyle + ")";
    }
}
