package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.TypedArrayKt;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 D2\u00020\u0001:\u0001DB\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u000fHÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u000fHÆ\u0003Jª\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\u0006HÖ\u0001J\t\u0010B\u001a\u00020CHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&¨\u0006E"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "progressIcon", "Landroid/graphics/drawable/Drawable;", "placeholderIcon", "placeholderIconTint", "", "mediaPreviewBackgroundColor", "moreCountOverlayColor", "moreCountTextStyle", "Lio/getstream/chat/android/ui/font/TextStyle;", "playVideoIcon", "playVideoIconTint", "playVideoIconBackgroundColor", "playVideoIconElevation", "", "playVideoIconPaddingTop", "playVideoIconPaddingBottom", "playVideoIconPaddingStart", "playVideoIconPaddingEnd", "playVideoIconCornerRadius", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFIIIIF)V", "getProgressIcon", "()Landroid/graphics/drawable/Drawable;", "getPlaceholderIcon", "getPlaceholderIconTint", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMediaPreviewBackgroundColor", "()I", "getMoreCountOverlayColor", "getMoreCountTextStyle", "()Lio/getstream/chat/android/ui/font/TextStyle;", "getPlayVideoIcon", "getPlayVideoIconTint", "getPlayVideoIconBackgroundColor", "getPlayVideoIconElevation", "()F", "getPlayVideoIconPaddingTop", "getPlayVideoIconPaddingBottom", "getPlayVideoIconPaddingStart", "getPlayVideoIconPaddingEnd", "getPlayVideoIconCornerRadius", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFIIIIF)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MediaAttachmentViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final int mediaPreviewBackgroundColor;
    private final int moreCountOverlayColor;
    private final TextStyle moreCountTextStyle;
    private final Drawable placeholderIcon;
    private final Integer placeholderIconTint;
    private final Drawable playVideoIcon;
    private final int playVideoIconBackgroundColor;
    private final float playVideoIconCornerRadius;
    private final float playVideoIconElevation;
    private final int playVideoIconPaddingBottom;
    private final int playVideoIconPaddingEnd;
    private final int playVideoIconPaddingStart;
    private final int playVideoIconPaddingTop;
    private final Integer playVideoIconTint;
    private final Drawable progressIcon;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\u0002¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final MediaAttachmentViewStyle invoke(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.MediaAttachmentView, C19469R.attr.streamUiMessageListMediaAttachmentStyle, C19469R.style.StreamUi_MessageList_MediaAttachment);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.MediaAttachmentView_streamUiMediaAttachmentProgressIcon);
            if (drawable == null) {
                drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_rotating_indeterminate_progress_gradient);
                AbstractC22676k.m65747g(drawable);
            }
            Drawable drawable2 = drawable;
            int color = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.f74170x131ebb71, AbstractC32122c.getColor(context, C19469R.color.stream_ui_message_list_image_attachment_background));
            int color2 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.MediaAttachmentView_streamUiMediaAttachmentMoreCountOverlayColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_overlay));
            TextStyle.Builder builder = new TextStyle.Builder(typedArrayObtainStyledAttributes);
            builder.size(C19469R.styleable.MediaAttachmentView_streamUiMediaAttachmentMoreCountTextSize, ContextKt.getDimension(context, C19469R.dimen.stream_ui_message_image_attachment_more_count_text_size));
            builder.color(C19469R.styleable.MediaAttachmentView_streamUiMediaAttachmentMoreCountTextColor, AbstractC32122c.getColor(context, C19469R.color.stream_ui_literal_white));
            builder.font(C19469R.styleable.MediaAttachmentView_streamUiMediaAttachmentMoreCountFontAssets, C19469R.styleable.MediaAttachmentView_streamUiMediaAttachmentMoreCountTextFont);
            builder.style(C19469R.styleable.MediaAttachmentView_streamUiMediaAttachmentMoreCountTextStyle, 0);
            TextStyle textStyleBuild = builder.build();
            Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.MediaAttachmentView_streamUiMediaAttachmentPlaceHolderIcon);
            if (drawable3 == null) {
                drawable3 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_picture_placeholder);
                AbstractC22676k.m65747g(drawable3);
            }
            Integer colorOrNull = TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.MediaAttachmentView_streamUiMediaAttachmentPlaceHolderIconTint);
            Drawable drawable4 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.MediaAttachmentView_streamUiMediaAttachmentPlayVideoIcon);
            if (drawable4 == null) {
                drawable4 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_play);
            }
            Drawable drawable5 = drawable4;
            Integer colorOrNull2 = TypedArrayKt.getColorOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.MediaAttachmentView_streamUiMediaAttachmentPlayVideoIconTint);
            int color3 = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.f74171xce13c775, AbstractC32122c.getColor(context, C19469R.color.stream_ui_literal_white));
            float dimension = typedArrayObtainStyledAttributes.getDimension(C19469R.styleable.f74172x9a4feaa7, 0.0f);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(C19469R.styleable.f74173x63e9f6fd, 0.0f);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74177x26cb92e4, 0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74174x85672a3c, 0);
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74176xa2266e31, 0);
            int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C19469R.styleable.f74175x26cb5a6a, 0);
            Float dimensionOrNull = TypedArrayKt.getDimensionOrNull(typedArrayObtainStyledAttributes, C19469R.styleable.MediaAttachmentView_streamUiMediaAttachmentPlayVideoIconPadding);
            Integer numValueOf = dimensionOrNull != null ? Integer.valueOf((int) dimensionOrNull.floatValue()) : null;
            if (numValueOf != null) {
                dimensionPixelSize = numValueOf.intValue();
            }
            if (numValueOf != null) {
                dimensionPixelSize2 = numValueOf.intValue();
            }
            int i13 = dimensionPixelSize2;
            if (numValueOf != null) {
                dimensionPixelSize3 = numValueOf.intValue();
            }
            int i14 = dimensionPixelSize3;
            if (numValueOf != null) {
                dimensionPixelSize4 = numValueOf.intValue();
            }
            return TransformStyle.getMediaAttachmentStyleTransformer().transform(new MediaAttachmentViewStyle(drawable2, drawable3, colorOrNull, color, color2, textStyleBuild, drawable5, colorOrNull2, color3, dimension2, dimensionPixelSize, i13, i14, dimensionPixelSize4, dimension));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public MediaAttachmentViewStyle(Drawable progressIcon, Drawable placeholderIcon, Integer num, int i13, int i14, TextStyle moreCountTextStyle, Drawable drawable, Integer num2, int i15, float f13, int i16, int i17, int i18, int i19, float f14) {
        AbstractC22676k.m65750j(progressIcon, "progressIcon");
        AbstractC22676k.m65750j(placeholderIcon, "placeholderIcon");
        AbstractC22676k.m65750j(moreCountTextStyle, "moreCountTextStyle");
        this.progressIcon = progressIcon;
        this.placeholderIcon = placeholderIcon;
        this.placeholderIconTint = num;
        this.mediaPreviewBackgroundColor = i13;
        this.moreCountOverlayColor = i14;
        this.moreCountTextStyle = moreCountTextStyle;
        this.playVideoIcon = drawable;
        this.playVideoIconTint = num2;
        this.playVideoIconBackgroundColor = i15;
        this.playVideoIconElevation = f13;
        this.playVideoIconPaddingTop = i16;
        this.playVideoIconPaddingBottom = i17;
        this.playVideoIconPaddingStart = i18;
        this.playVideoIconPaddingEnd = i19;
        this.playVideoIconCornerRadius = f14;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Drawable getProgressIcon() {
        return this.progressIcon;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getPlayVideoIconElevation() {
        return this.playVideoIconElevation;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getPlayVideoIconPaddingTop() {
        return this.playVideoIconPaddingTop;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getPlayVideoIconPaddingBottom() {
        return this.playVideoIconPaddingBottom;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getPlayVideoIconPaddingStart() {
        return this.playVideoIconPaddingStart;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getPlayVideoIconPaddingEnd() {
        return this.playVideoIconPaddingEnd;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final float getPlayVideoIconCornerRadius() {
        return this.playVideoIconCornerRadius;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Drawable getPlaceholderIcon() {
        return this.placeholderIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPlaceholderIconTint() {
        return this.placeholderIconTint;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMediaPreviewBackgroundColor() {
        return this.mediaPreviewBackgroundColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMoreCountOverlayColor() {
        return this.moreCountOverlayColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TextStyle getMoreCountTextStyle() {
        return this.moreCountTextStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Drawable getPlayVideoIcon() {
        return this.playVideoIcon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getPlayVideoIconTint() {
        return this.playVideoIconTint;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getPlayVideoIconBackgroundColor() {
        return this.playVideoIconBackgroundColor;
    }

    public final MediaAttachmentViewStyle copy(Drawable progressIcon, Drawable placeholderIcon, Integer placeholderIconTint, int mediaPreviewBackgroundColor, int moreCountOverlayColor, TextStyle moreCountTextStyle, Drawable playVideoIcon, Integer playVideoIconTint, int playVideoIconBackgroundColor, float playVideoIconElevation, int playVideoIconPaddingTop, int playVideoIconPaddingBottom, int playVideoIconPaddingStart, int playVideoIconPaddingEnd, float playVideoIconCornerRadius) {
        AbstractC22676k.m65750j(progressIcon, "progressIcon");
        AbstractC22676k.m65750j(placeholderIcon, "placeholderIcon");
        AbstractC22676k.m65750j(moreCountTextStyle, "moreCountTextStyle");
        return new MediaAttachmentViewStyle(progressIcon, placeholderIcon, placeholderIconTint, mediaPreviewBackgroundColor, moreCountOverlayColor, moreCountTextStyle, playVideoIcon, playVideoIconTint, playVideoIconBackgroundColor, playVideoIconElevation, playVideoIconPaddingTop, playVideoIconPaddingBottom, playVideoIconPaddingStart, playVideoIconPaddingEnd, playVideoIconCornerRadius);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaAttachmentViewStyle)) {
            return false;
        }
        MediaAttachmentViewStyle mediaAttachmentViewStyle = (MediaAttachmentViewStyle) other;
        return AbstractC22676k.m65745e(this.progressIcon, mediaAttachmentViewStyle.progressIcon) && AbstractC22676k.m65745e(this.placeholderIcon, mediaAttachmentViewStyle.placeholderIcon) && AbstractC22676k.m65745e(this.placeholderIconTint, mediaAttachmentViewStyle.placeholderIconTint) && this.mediaPreviewBackgroundColor == mediaAttachmentViewStyle.mediaPreviewBackgroundColor && this.moreCountOverlayColor == mediaAttachmentViewStyle.moreCountOverlayColor && AbstractC22676k.m65745e(this.moreCountTextStyle, mediaAttachmentViewStyle.moreCountTextStyle) && AbstractC22676k.m65745e(this.playVideoIcon, mediaAttachmentViewStyle.playVideoIcon) && AbstractC22676k.m65745e(this.playVideoIconTint, mediaAttachmentViewStyle.playVideoIconTint) && this.playVideoIconBackgroundColor == mediaAttachmentViewStyle.playVideoIconBackgroundColor && Float.compare(this.playVideoIconElevation, mediaAttachmentViewStyle.playVideoIconElevation) == 0 && this.playVideoIconPaddingTop == mediaAttachmentViewStyle.playVideoIconPaddingTop && this.playVideoIconPaddingBottom == mediaAttachmentViewStyle.playVideoIconPaddingBottom && this.playVideoIconPaddingStart == mediaAttachmentViewStyle.playVideoIconPaddingStart && this.playVideoIconPaddingEnd == mediaAttachmentViewStyle.playVideoIconPaddingEnd && Float.compare(this.playVideoIconCornerRadius, mediaAttachmentViewStyle.playVideoIconCornerRadius) == 0;
    }

    public final int getMediaPreviewBackgroundColor() {
        return this.mediaPreviewBackgroundColor;
    }

    public final int getMoreCountOverlayColor() {
        return this.moreCountOverlayColor;
    }

    public final TextStyle getMoreCountTextStyle() {
        return this.moreCountTextStyle;
    }

    public final Drawable getPlaceholderIcon() {
        return this.placeholderIcon;
    }

    public final Integer getPlaceholderIconTint() {
        return this.placeholderIconTint;
    }

    public final Drawable getPlayVideoIcon() {
        return this.playVideoIcon;
    }

    public final int getPlayVideoIconBackgroundColor() {
        return this.playVideoIconBackgroundColor;
    }

    public final float getPlayVideoIconCornerRadius() {
        return this.playVideoIconCornerRadius;
    }

    public final float getPlayVideoIconElevation() {
        return this.playVideoIconElevation;
    }

    public final int getPlayVideoIconPaddingBottom() {
        return this.playVideoIconPaddingBottom;
    }

    public final int getPlayVideoIconPaddingEnd() {
        return this.playVideoIconPaddingEnd;
    }

    public final int getPlayVideoIconPaddingStart() {
        return this.playVideoIconPaddingStart;
    }

    public final int getPlayVideoIconPaddingTop() {
        return this.playVideoIconPaddingTop;
    }

    public final Integer getPlayVideoIconTint() {
        return this.playVideoIconTint;
    }

    public final Drawable getProgressIcon() {
        return this.progressIcon;
    }

    public final int hashCode() {
        int iM79497a = AbstractC26725a.m79497a(this.placeholderIcon, this.progressIcon.hashCode() * 31, 31);
        Integer num = this.placeholderIconTint;
        int iM79499c = AbstractC26725a.m79499c(this.moreCountTextStyle, AbstractC11266d.m30448b(this.moreCountOverlayColor, AbstractC11266d.m30448b(this.mediaPreviewBackgroundColor, (iM79497a + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31);
        Drawable drawable = this.playVideoIcon;
        int iHashCode = (iM79499c + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num2 = this.playVideoIconTint;
        return Float.hashCode(this.playVideoIconCornerRadius) + AbstractC11266d.m30448b(this.playVideoIconPaddingEnd, AbstractC11266d.m30448b(this.playVideoIconPaddingStart, AbstractC11266d.m30448b(this.playVideoIconPaddingBottom, AbstractC11266d.m30448b(this.playVideoIconPaddingTop, AbstractC11266d.m30447a(this.playVideoIconElevation, AbstractC11266d.m30448b(this.playVideoIconBackgroundColor, (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        Drawable drawable = this.progressIcon;
        Drawable drawable2 = this.placeholderIcon;
        Integer num = this.placeholderIconTint;
        int i13 = this.mediaPreviewBackgroundColor;
        int i14 = this.moreCountOverlayColor;
        TextStyle textStyle = this.moreCountTextStyle;
        Drawable drawable3 = this.playVideoIcon;
        Integer num2 = this.playVideoIconTint;
        int i15 = this.playVideoIconBackgroundColor;
        float f13 = this.playVideoIconElevation;
        int i16 = this.playVideoIconPaddingTop;
        int i17 = this.playVideoIconPaddingBottom;
        int i18 = this.playVideoIconPaddingStart;
        int i19 = this.playVideoIconPaddingEnd;
        float f14 = this.playVideoIconCornerRadius;
        StringBuilder sb4 = new StringBuilder("MediaAttachmentViewStyle(progressIcon=");
        sb4.append(drawable);
        sb4.append(", placeholderIcon=");
        sb4.append(drawable2);
        sb4.append(", placeholderIconTint=");
        sb4.append(num);
        sb4.append(", mediaPreviewBackgroundColor=");
        sb4.append(i13);
        sb4.append(", moreCountOverlayColor=");
        sb4.append(i14);
        sb4.append(", moreCountTextStyle=");
        sb4.append(textStyle);
        sb4.append(", playVideoIcon=");
        sb4.append(drawable3);
        sb4.append(", playVideoIconTint=");
        sb4.append(num2);
        sb4.append(", playVideoIconBackgroundColor=");
        sb4.append(i15);
        sb4.append(", playVideoIconElevation=");
        sb4.append(f13);
        sb4.append(", playVideoIconPaddingTop=");
        AbstractC30802r.m94773v(sb4, i16, ", playVideoIconPaddingBottom=", i17, ", playVideoIconPaddingStart=");
        AbstractC30802r.m94773v(sb4, i18, ", playVideoIconPaddingEnd=", i19, ", playVideoIconCornerRadius=");
        return AbstractC30007c.m91837g(f14, ")", sb4);
    }
}
