package io.getstream.chat.android.p226ui.feature.gallery.options;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p479s4.AbstractC32122c;
import p513u4.AbstractC34523k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 42\u00020\u0001:\u00014Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003Jw\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0003\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0013\u0010.\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0005HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016¨\u00065"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "optionTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "backgroundColor", "", "replyOptionEnabled", "", "replyOptionDrawable", "Landroid/graphics/drawable/Drawable;", "showInChatOptionEnabled", "showInChatOptionDrawable", "saveMediaOptionEnabled", "saveMediaOptionDrawable", "deleteOptionEnabled", "deleteOptionDrawable", "deleteOptionTextColor", "<init>", "(Lio/getstream/chat/android/ui/font/TextStyle;IZLandroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;I)V", "getOptionTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getBackgroundColor", "()I", "getReplyOptionEnabled", "()Z", "getReplyOptionDrawable", "()Landroid/graphics/drawable/Drawable;", "getShowInChatOptionEnabled", "getShowInChatOptionDrawable", "getSaveMediaOptionEnabled", "getSaveMediaOptionDrawable", "getDeleteOptionEnabled", "getDeleteOptionDrawable", "getDeleteOptionTextColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AttachmentGalleryOptionsViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final int backgroundColor;
    private final Drawable deleteOptionDrawable;
    private final boolean deleteOptionEnabled;
    private final int deleteOptionTextColor;
    private final TextStyle optionTextStyle;
    private final Drawable replyOptionDrawable;
    private final boolean replyOptionEnabled;
    private final Drawable saveMediaOptionDrawable;
    private final boolean saveMediaOptionEnabled;
    private final Drawable showInChatOptionDrawable;
    private final boolean showInChatOptionEnabled;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\u0002J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "it", "Landroid/content/res/TypedArray;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final AttachmentGalleryOptionsViewStyle invoke(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.AttachmentOptionsView, C19469R.attr.streamUiAttachmentGalleryOptionsStyle, C19469R.style.StreamUi_AttachmentGallery_Options);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            return AttachmentGalleryOptionsViewStyle.INSTANCE.invoke(context, typedArrayObtainStyledAttributes);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final AttachmentGalleryOptionsViewStyle invoke(Context context, TypedArray it) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(it, "it");
            TextStyle.Builder builder = new TextStyle.Builder(it);
            builder.size(C19469R.styleable.AttachmentOptionsView_streamUiAttachmentOptionTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_text_medium));
            builder.color(C19469R.styleable.AttachmentOptionsView_streamUiAttachmentOptionTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_text_color_primary));
            int i13 = C19469R.styleable.AttachmentOptionsView_streamUiAttachmentOptionTextFontAssets;
            int i14 = C19469R.styleable.AttachmentOptionsView_streamUiAttachmentOptionTextFont;
            Typeface typefaceM109098b = AbstractC34523k.m109098b(context, C19470R.font.stream_roboto_medium);
            if (typefaceM109098b == null) {
                typefaceM109098b = Typeface.DEFAULT;
            }
            AbstractC22676k.m65747g(typefaceM109098b);
            builder.font(i13, i14, typefaceM109098b);
            builder.style(C19469R.styleable.AttachmentOptionsView_streamUiAttachmentOptionTextStyle, 0);
            TextStyle textStyleBuild = builder.build();
            int color = it.getColor(C19469R.styleable.AttachmentOptionsView_streamUiAttachmentOptionsBackgroundColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_white_snow));
            boolean z4 = it.getBoolean(C19469R.styleable.AttachmentOptionsView_streamUiAttachmentReplyEnabled, true);
            Drawable drawable = it.getDrawable(C19469R.styleable.AttachmentOptionsView_streamUiReplyIcon);
            if (drawable == null) {
                drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_arrow_curve_left_grey);
                AbstractC22676k.m65747g(drawable);
            }
            Drawable drawable2 = drawable;
            boolean z13 = it.getBoolean(C19469R.styleable.AttachmentOptionsView_streamUiShowInChatEnabled, true);
            Drawable drawable3 = it.getDrawable(C19469R.styleable.AttachmentOptionsView_streamUiShowInChatIcon);
            if (drawable3 == null) {
                drawable3 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_show_in_chat);
                AbstractC22676k.m65747g(drawable3);
            }
            Drawable drawable4 = drawable3;
            boolean z14 = it.getBoolean(C19469R.styleable.AttachmentOptionsView_streamUiSaveMediaEnabled, true);
            Drawable drawable5 = it.getDrawable(C19469R.styleable.AttachmentOptionsView_streamUiSaveMediaIcon);
            if (drawable5 == null) {
                drawable5 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_download);
                AbstractC22676k.m65747g(drawable5);
            }
            Drawable drawable6 = drawable5;
            boolean z15 = it.getBoolean(C19469R.styleable.AttachmentOptionsView_streamUiDeleteEnabled, true);
            Drawable drawable7 = it.getDrawable(C19469R.styleable.AttachmentOptionsView_streamUiDeleteIcon);
            if (drawable7 == null) {
                drawable7 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_delete);
                AbstractC22676k.m65747g(drawable7);
            }
            return TransformStyle.getAttachmentGalleryOptionsStyleTransformer().transform(new AttachmentGalleryOptionsViewStyle(textStyleBuild, color, z4, drawable2, z13, drawable4, z14, drawable6, z15, drawable7, it.getColor(C19469R.styleable.AttachmentOptionsView_streamUiDeleteTextTint, AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_red))));
        }
    }

    public AttachmentGalleryOptionsViewStyle(TextStyle optionTextStyle, int i13, boolean z4, Drawable replyOptionDrawable, boolean z13, Drawable showInChatOptionDrawable, boolean z14, Drawable saveMediaOptionDrawable, boolean z15, Drawable deleteOptionDrawable, int i14) {
        AbstractC22676k.m65750j(optionTextStyle, "optionTextStyle");
        AbstractC22676k.m65750j(replyOptionDrawable, "replyOptionDrawable");
        AbstractC22676k.m65750j(showInChatOptionDrawable, "showInChatOptionDrawable");
        AbstractC22676k.m65750j(saveMediaOptionDrawable, "saveMediaOptionDrawable");
        AbstractC22676k.m65750j(deleteOptionDrawable, "deleteOptionDrawable");
        this.optionTextStyle = optionTextStyle;
        this.backgroundColor = i13;
        this.replyOptionEnabled = z4;
        this.replyOptionDrawable = replyOptionDrawable;
        this.showInChatOptionEnabled = z13;
        this.showInChatOptionDrawable = showInChatOptionDrawable;
        this.saveMediaOptionEnabled = z14;
        this.saveMediaOptionDrawable = saveMediaOptionDrawable;
        this.deleteOptionEnabled = z15;
        this.deleteOptionDrawable = deleteOptionDrawable;
        this.deleteOptionTextColor = i14;
    }

    public static /* synthetic */ AttachmentGalleryOptionsViewStyle copy$default(AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyle, TextStyle textStyle, int i13, boolean z4, Drawable drawable, boolean z13, Drawable drawable2, boolean z14, Drawable drawable3, boolean z15, Drawable drawable4, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            textStyle = attachmentGalleryOptionsViewStyle.optionTextStyle;
        }
        if ((i15 & 2) != 0) {
            i13 = attachmentGalleryOptionsViewStyle.backgroundColor;
        }
        if ((i15 & 4) != 0) {
            z4 = attachmentGalleryOptionsViewStyle.replyOptionEnabled;
        }
        if ((i15 & 8) != 0) {
            drawable = attachmentGalleryOptionsViewStyle.replyOptionDrawable;
        }
        if ((i15 & 16) != 0) {
            z13 = attachmentGalleryOptionsViewStyle.showInChatOptionEnabled;
        }
        if ((i15 & 32) != 0) {
            drawable2 = attachmentGalleryOptionsViewStyle.showInChatOptionDrawable;
        }
        if ((i15 & 64) != 0) {
            z14 = attachmentGalleryOptionsViewStyle.saveMediaOptionEnabled;
        }
        if ((i15 & 128) != 0) {
            drawable3 = attachmentGalleryOptionsViewStyle.saveMediaOptionDrawable;
        }
        if ((i15 & 256) != 0) {
            z15 = attachmentGalleryOptionsViewStyle.deleteOptionEnabled;
        }
        if ((i15 & 512) != 0) {
            drawable4 = attachmentGalleryOptionsViewStyle.deleteOptionDrawable;
        }
        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            i14 = attachmentGalleryOptionsViewStyle.deleteOptionTextColor;
        }
        Drawable drawable5 = drawable4;
        int i16 = i14;
        Drawable drawable6 = drawable3;
        boolean z16 = z15;
        Drawable drawable7 = drawable2;
        boolean z17 = z14;
        boolean z18 = z13;
        boolean z19 = z4;
        return attachmentGalleryOptionsViewStyle.copy(textStyle, i13, z19, drawable, z18, drawable7, z17, drawable6, z16, drawable5, i16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextStyle getOptionTextStyle() {
        return this.optionTextStyle;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Drawable getDeleteOptionDrawable() {
        return this.deleteOptionDrawable;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getDeleteOptionTextColor() {
        return this.deleteOptionTextColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getReplyOptionEnabled() {
        return this.replyOptionEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Drawable getReplyOptionDrawable() {
        return this.replyOptionDrawable;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowInChatOptionEnabled() {
        return this.showInChatOptionEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Drawable getShowInChatOptionDrawable() {
        return this.showInChatOptionDrawable;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getSaveMediaOptionEnabled() {
        return this.saveMediaOptionEnabled;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Drawable getSaveMediaOptionDrawable() {
        return this.saveMediaOptionDrawable;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getDeleteOptionEnabled() {
        return this.deleteOptionEnabled;
    }

    public final AttachmentGalleryOptionsViewStyle copy(TextStyle optionTextStyle, int backgroundColor, boolean replyOptionEnabled, Drawable replyOptionDrawable, boolean showInChatOptionEnabled, Drawable showInChatOptionDrawable, boolean saveMediaOptionEnabled, Drawable saveMediaOptionDrawable, boolean deleteOptionEnabled, Drawable deleteOptionDrawable, int deleteOptionTextColor) {
        AbstractC22676k.m65750j(optionTextStyle, "optionTextStyle");
        AbstractC22676k.m65750j(replyOptionDrawable, "replyOptionDrawable");
        AbstractC22676k.m65750j(showInChatOptionDrawable, "showInChatOptionDrawable");
        AbstractC22676k.m65750j(saveMediaOptionDrawable, "saveMediaOptionDrawable");
        AbstractC22676k.m65750j(deleteOptionDrawable, "deleteOptionDrawable");
        return new AttachmentGalleryOptionsViewStyle(optionTextStyle, backgroundColor, replyOptionEnabled, replyOptionDrawable, showInChatOptionEnabled, showInChatOptionDrawable, saveMediaOptionEnabled, saveMediaOptionDrawable, deleteOptionEnabled, deleteOptionDrawable, deleteOptionTextColor);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentGalleryOptionsViewStyle)) {
            return false;
        }
        AttachmentGalleryOptionsViewStyle attachmentGalleryOptionsViewStyle = (AttachmentGalleryOptionsViewStyle) other;
        return AbstractC22676k.m65745e(this.optionTextStyle, attachmentGalleryOptionsViewStyle.optionTextStyle) && this.backgroundColor == attachmentGalleryOptionsViewStyle.backgroundColor && this.replyOptionEnabled == attachmentGalleryOptionsViewStyle.replyOptionEnabled && AbstractC22676k.m65745e(this.replyOptionDrawable, attachmentGalleryOptionsViewStyle.replyOptionDrawable) && this.showInChatOptionEnabled == attachmentGalleryOptionsViewStyle.showInChatOptionEnabled && AbstractC22676k.m65745e(this.showInChatOptionDrawable, attachmentGalleryOptionsViewStyle.showInChatOptionDrawable) && this.saveMediaOptionEnabled == attachmentGalleryOptionsViewStyle.saveMediaOptionEnabled && AbstractC22676k.m65745e(this.saveMediaOptionDrawable, attachmentGalleryOptionsViewStyle.saveMediaOptionDrawable) && this.deleteOptionEnabled == attachmentGalleryOptionsViewStyle.deleteOptionEnabled && AbstractC22676k.m65745e(this.deleteOptionDrawable, attachmentGalleryOptionsViewStyle.deleteOptionDrawable) && this.deleteOptionTextColor == attachmentGalleryOptionsViewStyle.deleteOptionTextColor;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Drawable getDeleteOptionDrawable() {
        return this.deleteOptionDrawable;
    }

    public final boolean getDeleteOptionEnabled() {
        return this.deleteOptionEnabled;
    }

    public final int getDeleteOptionTextColor() {
        return this.deleteOptionTextColor;
    }

    public final TextStyle getOptionTextStyle() {
        return this.optionTextStyle;
    }

    public final Drawable getReplyOptionDrawable() {
        return this.replyOptionDrawable;
    }

    public final boolean getReplyOptionEnabled() {
        return this.replyOptionEnabled;
    }

    public final Drawable getSaveMediaOptionDrawable() {
        return this.saveMediaOptionDrawable;
    }

    public final boolean getSaveMediaOptionEnabled() {
        return this.saveMediaOptionEnabled;
    }

    public final Drawable getShowInChatOptionDrawable() {
        return this.showInChatOptionDrawable;
    }

    public final boolean getShowInChatOptionEnabled() {
        return this.showInChatOptionEnabled;
    }

    public final int hashCode() {
        return Integer.hashCode(this.deleteOptionTextColor) + AbstractC26725a.m79497a(this.deleteOptionDrawable, AbstractC2875y.m8289b(AbstractC26725a.m79497a(this.saveMediaOptionDrawable, AbstractC2875y.m8289b(AbstractC26725a.m79497a(this.showInChatOptionDrawable, AbstractC2875y.m8289b(AbstractC26725a.m79497a(this.replyOptionDrawable, AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.backgroundColor, this.optionTextStyle.hashCode() * 31, 31), 31, this.replyOptionEnabled), 31), 31, this.showInChatOptionEnabled), 31), 31, this.saveMediaOptionEnabled), 31), 31, this.deleteOptionEnabled), 31);
    }

    public final String toString() {
        TextStyle textStyle = this.optionTextStyle;
        int i13 = this.backgroundColor;
        boolean z4 = this.replyOptionEnabled;
        Drawable drawable = this.replyOptionDrawable;
        boolean z13 = this.showInChatOptionEnabled;
        Drawable drawable2 = this.showInChatOptionDrawable;
        boolean z14 = this.saveMediaOptionEnabled;
        Drawable drawable3 = this.saveMediaOptionDrawable;
        boolean z15 = this.deleteOptionEnabled;
        Drawable drawable4 = this.deleteOptionDrawable;
        int i14 = this.deleteOptionTextColor;
        StringBuilder sb4 = new StringBuilder("AttachmentGalleryOptionsViewStyle(optionTextStyle=");
        sb4.append(textStyle);
        sb4.append(", backgroundColor=");
        sb4.append(i13);
        sb4.append(", replyOptionEnabled=");
        sb4.append(z4);
        sb4.append(", replyOptionDrawable=");
        sb4.append(drawable);
        sb4.append(", showInChatOptionEnabled=");
        sb4.append(z13);
        sb4.append(", showInChatOptionDrawable=");
        sb4.append(drawable2);
        sb4.append(", saveMediaOptionEnabled=");
        sb4.append(z14);
        sb4.append(", saveMediaOptionDrawable=");
        sb4.append(drawable3);
        sb4.append(", deleteOptionEnabled=");
        sb4.append(z15);
        sb4.append(", deleteOptionDrawable=");
        sb4.append(drawable4);
        sb4.append(", deleteOptionTextColor=");
        return AbstractC18489d0.m53371l(sb4, i14, ")");
    }
}
