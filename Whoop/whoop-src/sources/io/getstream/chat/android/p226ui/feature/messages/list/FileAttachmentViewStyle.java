package io.getstream.chat.android.p226ui.feature.messages.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0001-BW\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003Jc\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "backgroundColor", "", "strokeColor", "strokeWidth", "cornerRadius", "progressBarDrawable", "Landroid/graphics/drawable/Drawable;", "actionButtonIcon", "failedAttachmentIcon", "titleTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "fileSizeTextStyle", "<init>", "(IIIILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;)V", "getBackgroundColor", "()I", "getStrokeColor", "getStrokeWidth", "getCornerRadius", "getProgressBarDrawable", "()Landroid/graphics/drawable/Drawable;", "getActionButtonIcon", "getFailedAttachmentIcon", "getTitleTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getFileSizeTextStyle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class FileAttachmentViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final Drawable actionButtonIcon;
    private final int backgroundColor;
    private final int cornerRadius;
    private final Drawable failedAttachmentIcon;
    private final TextStyle fileSizeTextStyle;
    private final Drawable progressBarDrawable;
    private final int strokeColor;
    private final int strokeWidth;
    private final TextStyle titleTextStyle;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\u0002¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final FileAttachmentViewStyle invoke(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.FileAttachmentView, C19469R.attr.streamUiMessageListFileAttachmentStyle, C19469R.style.StreamUi_MessageList_FileAttachment);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.FileAttachmentView_streamUiFileAttachmentProgressBarDrawable);
            if (drawable == null) {
                drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_rotating_indeterminate_progress_gradient);
                AbstractC22676k.m65747g(drawable);
            }
            Drawable drawable2 = drawable;
            int color = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.FileAttachmentView_streamUiFileAttachmentBackgroundColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white));
            Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.FileAttachmentView_streamUiFileAttachmentActionButton);
            if (drawable3 == null) {
                drawable3 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_icon_download);
                AbstractC22676k.m65747g(drawable3);
            }
            Drawable drawable4 = drawable3;
            TextStyle.Builder builder = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder.size(C19469R.styleable.FileAttachmentView_streamUiFileAttachmentTitleTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder.color(C19469R.styleable.FileAttachmentView_streamUiFileAttachmentTitleTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder.font(C19469R.styleable.FileAttachmentView_streamUiFileAttachmentTitleFontAssets, C19469R.styleable.FileAttachmentView_streamUiFileAttachmentTitleTextFont);
            builder.style(C19469R.styleable.FileAttachmentView_streamUiFileAttachmentTitleTextStyle, 0);
            TextStyle textStyleBuild = builder.build();
            TextStyle.Builder builder2 = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder2.size(C19469R.styleable.FileAttachmentView_streamUiFileAttachmentFileSizeTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_small));
            builder2.color(C19469R.styleable.FileAttachmentView_streamUiFileAttachmentFileSizeTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            builder2.font(C19469R.styleable.FileAttachmentView_streamUiFileAttachmentFileSizeFontAssets, C19469R.styleable.FileAttachmentView_streamUiFileAttachmentFileSizeTextFont);
            builder2.style(C19469R.styleable.FileAttachmentView_streamUiFileAttachmentFileSizeTextStyle, 0);
            TextStyle textStyleBuild2 = builder2.build();
            Drawable drawable5 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.FileAttachmentView_streamUiFileAttachmentFailedAttachmentIcon);
            if (drawable5 == null) {
                drawable5 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_warning);
                AbstractC22676k.m65747g(drawable5);
            }
            return TransformStyle.getFileAttachmentStyleTransformer().transform(new FileAttachmentViewStyle(color, typedArrayObtainStyledAttributes.getColor(C19469R.styleable.FileAttachmentView_streamUiFileAttachmentStrokeColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_grey_whisper)), typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.FileAttachmentView_streamUiFileAttachmentStrokeWidth, IntKt.dpToPx(1)), typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.FileAttachmentView_streamUiFileAttachmentCornerRadius, IntKt.dpToPx(12)), drawable2, drawable4, drawable5, textStyleBuild, textStyleBuild2));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public FileAttachmentViewStyle(int i13, int i14, int i15, int i16, Drawable progressBarDrawable, Drawable actionButtonIcon, Drawable failedAttachmentIcon, TextStyle titleTextStyle, TextStyle fileSizeTextStyle) {
        AbstractC22676k.m65750j(progressBarDrawable, "progressBarDrawable");
        AbstractC22676k.m65750j(actionButtonIcon, "actionButtonIcon");
        AbstractC22676k.m65750j(failedAttachmentIcon, "failedAttachmentIcon");
        AbstractC22676k.m65750j(titleTextStyle, "titleTextStyle");
        AbstractC22676k.m65750j(fileSizeTextStyle, "fileSizeTextStyle");
        this.backgroundColor = i13;
        this.strokeColor = i14;
        this.strokeWidth = i15;
        this.cornerRadius = i16;
        this.progressBarDrawable = progressBarDrawable;
        this.actionButtonIcon = actionButtonIcon;
        this.failedAttachmentIcon = failedAttachmentIcon;
        this.titleTextStyle = titleTextStyle;
        this.fileSizeTextStyle = fileSizeTextStyle;
    }

    public static /* synthetic */ FileAttachmentViewStyle copy$default(FileAttachmentViewStyle fileAttachmentViewStyle, int i13, int i14, int i15, int i16, Drawable drawable, Drawable drawable2, Drawable drawable3, TextStyle textStyle, TextStyle textStyle2, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = fileAttachmentViewStyle.backgroundColor;
        }
        if ((i17 & 2) != 0) {
            i14 = fileAttachmentViewStyle.strokeColor;
        }
        if ((i17 & 4) != 0) {
            i15 = fileAttachmentViewStyle.strokeWidth;
        }
        if ((i17 & 8) != 0) {
            i16 = fileAttachmentViewStyle.cornerRadius;
        }
        if ((i17 & 16) != 0) {
            drawable = fileAttachmentViewStyle.progressBarDrawable;
        }
        if ((i17 & 32) != 0) {
            drawable2 = fileAttachmentViewStyle.actionButtonIcon;
        }
        if ((i17 & 64) != 0) {
            drawable3 = fileAttachmentViewStyle.failedAttachmentIcon;
        }
        if ((i17 & 128) != 0) {
            textStyle = fileAttachmentViewStyle.titleTextStyle;
        }
        if ((i17 & 256) != 0) {
            textStyle2 = fileAttachmentViewStyle.fileSizeTextStyle;
        }
        TextStyle textStyle3 = textStyle;
        TextStyle textStyle4 = textStyle2;
        Drawable drawable4 = drawable2;
        Drawable drawable5 = drawable3;
        Drawable drawable6 = drawable;
        int i18 = i15;
        return fileAttachmentViewStyle.copy(i13, i14, i18, i16, drawable6, drawable4, drawable5, textStyle3, textStyle4);
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
    public final Drawable getProgressBarDrawable() {
        return this.progressBarDrawable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Drawable getActionButtonIcon() {
        return this.actionButtonIcon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Drawable getFailedAttachmentIcon() {
        return this.failedAttachmentIcon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TextStyle getTitleTextStyle() {
        return this.titleTextStyle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TextStyle getFileSizeTextStyle() {
        return this.fileSizeTextStyle;
    }

    public final FileAttachmentViewStyle copy(int backgroundColor, int strokeColor, int strokeWidth, int cornerRadius, Drawable progressBarDrawable, Drawable actionButtonIcon, Drawable failedAttachmentIcon, TextStyle titleTextStyle, TextStyle fileSizeTextStyle) {
        AbstractC22676k.m65750j(progressBarDrawable, "progressBarDrawable");
        AbstractC22676k.m65750j(actionButtonIcon, "actionButtonIcon");
        AbstractC22676k.m65750j(failedAttachmentIcon, "failedAttachmentIcon");
        AbstractC22676k.m65750j(titleTextStyle, "titleTextStyle");
        AbstractC22676k.m65750j(fileSizeTextStyle, "fileSizeTextStyle");
        return new FileAttachmentViewStyle(backgroundColor, strokeColor, strokeWidth, cornerRadius, progressBarDrawable, actionButtonIcon, failedAttachmentIcon, titleTextStyle, fileSizeTextStyle);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileAttachmentViewStyle)) {
            return false;
        }
        FileAttachmentViewStyle fileAttachmentViewStyle = (FileAttachmentViewStyle) other;
        return this.backgroundColor == fileAttachmentViewStyle.backgroundColor && this.strokeColor == fileAttachmentViewStyle.strokeColor && this.strokeWidth == fileAttachmentViewStyle.strokeWidth && this.cornerRadius == fileAttachmentViewStyle.cornerRadius && AbstractC22676k.m65745e(this.progressBarDrawable, fileAttachmentViewStyle.progressBarDrawable) && AbstractC22676k.m65745e(this.actionButtonIcon, fileAttachmentViewStyle.actionButtonIcon) && AbstractC22676k.m65745e(this.failedAttachmentIcon, fileAttachmentViewStyle.failedAttachmentIcon) && AbstractC22676k.m65745e(this.titleTextStyle, fileAttachmentViewStyle.titleTextStyle) && AbstractC22676k.m65745e(this.fileSizeTextStyle, fileAttachmentViewStyle.fileSizeTextStyle);
    }

    public final Drawable getActionButtonIcon() {
        return this.actionButtonIcon;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final Drawable getFailedAttachmentIcon() {
        return this.failedAttachmentIcon;
    }

    public final TextStyle getFileSizeTextStyle() {
        return this.fileSizeTextStyle;
    }

    public final Drawable getProgressBarDrawable() {
        return this.progressBarDrawable;
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
        return this.fileSizeTextStyle.hashCode() + AbstractC26725a.m79499c(this.titleTextStyle, AbstractC26725a.m79497a(this.failedAttachmentIcon, AbstractC26725a.m79497a(this.actionButtonIcon, AbstractC26725a.m79497a(this.progressBarDrawable, AbstractC11266d.m30448b(this.cornerRadius, AbstractC11266d.m30448b(this.strokeWidth, AbstractC11266d.m30448b(this.strokeColor, Integer.hashCode(this.backgroundColor) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        int i13 = this.backgroundColor;
        int i14 = this.strokeColor;
        int i15 = this.strokeWidth;
        int i16 = this.cornerRadius;
        Drawable drawable = this.progressBarDrawable;
        Drawable drawable2 = this.actionButtonIcon;
        Drawable drawable3 = this.failedAttachmentIcon;
        TextStyle textStyle = this.titleTextStyle;
        TextStyle textStyle2 = this.fileSizeTextStyle;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "FileAttachmentViewStyle(backgroundColor=", ", strokeColor=", ", strokeWidth=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", cornerRadius=", i16, ", progressBarDrawable=");
        sbM30465s.append(drawable);
        sbM30465s.append(", actionButtonIcon=");
        sbM30465s.append(drawable2);
        sbM30465s.append(", failedAttachmentIcon=");
        sbM30465s.append(drawable3);
        sbM30465s.append(", titleTextStyle=");
        sbM30465s.append(textStyle);
        sbM30465s.append(", fileSizeTextStyle=");
        sbM30465s.append(textStyle2);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }
}
