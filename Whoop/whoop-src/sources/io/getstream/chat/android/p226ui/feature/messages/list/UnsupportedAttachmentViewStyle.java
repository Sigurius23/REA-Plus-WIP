package io.getstream.chat.android.p226ui.feature.messages.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "backgroundColor", "", "strokeColor", "strokeWidth", "cornerRadius", "titleTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "<init>", "(IIIILio/getstream/chat/android/ui/font/TextStyle;)V", "getBackgroundColor", "()I", "getStrokeColor", "getStrokeWidth", "getCornerRadius", "getTitleTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UnsupportedAttachmentViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final int backgroundColor;
    private final int cornerRadius;
    private final int strokeColor;
    private final int strokeWidth;
    private final TextStyle titleTextStyle;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\u0002¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final UnsupportedAttachmentViewStyle invoke(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.UnsupportedAttachmentView, C19469R.attr.streamUiMessageListUnsupportedAttachmentStyle, C19469R.style.StreamUi_MessageList_UnsupportedAttachment);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int color = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.f74432xb69867f3, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            int color2 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.f74434xda299c29, AbstractC32122c.getColor(context, C19469R.color.stream_ui_grey_whisper));
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74435xdb409a8c, IntKt.dpToPx(1));
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74433xcc6d4ae9, IntKt.dpToPx(12));
            TextStyle.Builder builder = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder.size(C19469R.styleable.f74439x93c609e4, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder.color(C19469R.styleable.f74437xe41c41e0, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder.font(C19469R.styleable.f74436xfc1a1648, C19469R.styleable.f74438x93c03632);
            builder.style(C19469R.styleable.f74440xe500302e, 0);
            return TransformStyle.getUnsupportedAttachmentStyleTransformer().transform(new UnsupportedAttachmentViewStyle(color, color2, dimensionPixelSize, dimensionPixelSize2, builder.build()));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public UnsupportedAttachmentViewStyle(int i13, int i14, int i15, int i16, TextStyle titleTextStyle) {
        AbstractC22676k.m65750j(titleTextStyle, "titleTextStyle");
        this.backgroundColor = i13;
        this.strokeColor = i14;
        this.strokeWidth = i15;
        this.cornerRadius = i16;
        this.titleTextStyle = titleTextStyle;
    }

    public static /* synthetic */ UnsupportedAttachmentViewStyle copy$default(UnsupportedAttachmentViewStyle unsupportedAttachmentViewStyle, int i13, int i14, int i15, int i16, TextStyle textStyle, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = unsupportedAttachmentViewStyle.backgroundColor;
        }
        if ((i17 & 2) != 0) {
            i14 = unsupportedAttachmentViewStyle.strokeColor;
        }
        if ((i17 & 4) != 0) {
            i15 = unsupportedAttachmentViewStyle.strokeWidth;
        }
        if ((i17 & 8) != 0) {
            i16 = unsupportedAttachmentViewStyle.cornerRadius;
        }
        if ((i17 & 16) != 0) {
            textStyle = unsupportedAttachmentViewStyle.titleTextStyle;
        }
        TextStyle textStyle2 = textStyle;
        int i18 = i15;
        return unsupportedAttachmentViewStyle.copy(i13, i14, i18, i16, textStyle2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStrokeColor() {
        return this.strokeColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStrokeWidth() {
        return this.strokeWidth;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextStyle getTitleTextStyle() {
        return this.titleTextStyle;
    }

    public final UnsupportedAttachmentViewStyle copy(int backgroundColor, int strokeColor, int strokeWidth, int cornerRadius, TextStyle titleTextStyle) {
        AbstractC22676k.m65750j(titleTextStyle, "titleTextStyle");
        return new UnsupportedAttachmentViewStyle(backgroundColor, strokeColor, strokeWidth, cornerRadius, titleTextStyle);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnsupportedAttachmentViewStyle)) {
            return false;
        }
        UnsupportedAttachmentViewStyle unsupportedAttachmentViewStyle = (UnsupportedAttachmentViewStyle) other;
        return this.backgroundColor == unsupportedAttachmentViewStyle.backgroundColor && this.strokeColor == unsupportedAttachmentViewStyle.strokeColor && this.strokeWidth == unsupportedAttachmentViewStyle.strokeWidth && this.cornerRadius == unsupportedAttachmentViewStyle.cornerRadius && AbstractC22676k.m65745e(this.titleTextStyle, unsupportedAttachmentViewStyle.titleTextStyle);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final int getStrokeWidth() {
        return this.strokeWidth;
    }

    public final TextStyle getTitleTextStyle() {
        return this.titleTextStyle;
    }

    public final int hashCode() {
        return this.titleTextStyle.hashCode() + AbstractC11266d.m30448b(this.cornerRadius, AbstractC11266d.m30448b(this.strokeWidth, AbstractC11266d.m30448b(this.strokeColor, Integer.hashCode(this.backgroundColor) * 31, 31), 31), 31);
    }

    public final String toString() {
        int i13 = this.backgroundColor;
        int i14 = this.strokeColor;
        int i15 = this.strokeWidth;
        int i16 = this.cornerRadius;
        TextStyle textStyle = this.titleTextStyle;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "UnsupportedAttachmentViewStyle(backgroundColor=", ", strokeColor=", ", strokeWidth=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", cornerRadius=", i16, ", titleTextStyle=");
        sbM30465s.append(textStyle);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }
}
