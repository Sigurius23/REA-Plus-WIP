package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.utils.GiphyInfoType;
import io.getstream.chat.android.p226ui.common.utils.GiphySizingMode;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0014\u0018\u0000 $2\u00020\u0001:\u0001$BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;", "", "progressIcon", "Landroid/graphics/drawable/Drawable;", "giphyIcon", "placeholderIcon", "imageBackgroundColor", "", "giphyType", "Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;", "scaleType", "Landroid/widget/ImageView$ScaleType;", "sizingMode", "Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;", "width", "height", "dimensionRatio", "", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ILio/getstream/chat/android/ui/common/utils/GiphyInfoType;Landroid/widget/ImageView$ScaleType;Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;IIF)V", "getProgressIcon", "()Landroid/graphics/drawable/Drawable;", "getGiphyIcon", "getPlaceholderIcon", "getImageBackgroundColor", "()I", "getGiphyType", "()Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "getSizingMode", "()Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;", "getWidth", "getHeight", "getDimensionRatio", "()F", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class GiphyMediaAttachmentViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final float NO_GIVEN_DIMENSION_RATIO = -1.0f;
    public static final int NO_GIVEN_HEIGHT = -1;
    public static final float SQUARE_DIMENSION_RATIO = 1.0f;
    private final float dimensionRatio;
    private final Drawable giphyIcon;
    private final GiphyInfoType giphyType;
    private final int height;
    private final int imageBackgroundColor;
    private final Drawable placeholderIcon;
    private final Drawable progressIcon;
    private final ImageView.ScaleType scaleType;
    private final GiphySizingMode sizingMode;
    private final int width;

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0080\u0002¢\u0006\u0002\b\nR\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "invoke$stream_chat_android_ui_components_release", "NO_GIVEN_DIMENSION_RATIO", "", "NO_GIVEN_HEIGHT", "", "SQUARE_DIMENSION_RATIO", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final GiphyMediaAttachmentViewStyle invoke$stream_chat_android_ui_components_release(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.GiphyMediaAttachmentView, C19469R.attr.streamUiMessageListGiphyAttachmentStyle, C19469R.style.StreamUi_MessageList_GiphyMediaAttachment);
            AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.f74157x74dbb7d4);
            if (drawable == null) {
                drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_rotating_indeterminate_progress_gradient);
                AbstractC22676k.m65747g(drawable);
            }
            Drawable drawable2 = drawable;
            Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.GiphyMediaAttachmentView_streamUiGiphyMediaAttachmentGiphyIcon);
            if (drawable3 == null) {
                drawable3 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_giphy_label);
                AbstractC22676k.m65747g(drawable3);
            }
            Drawable drawable4 = drawable3;
            int color = typedArrayObtainStyledAttributes.getColor(C19469R.styleable.f74155x2aa07988, AbstractC32122c.getColor(context, C19469R.color.stream_ui_grey));
            Drawable drawable5 = typedArrayObtainStyledAttributes.getDrawable(C19469R.styleable.f74156xab55aa5e);
            if (drawable5 == null) {
                drawable5 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_picture_placeholder);
                AbstractC22676k.m65747g(drawable5);
            }
            Drawable drawable6 = drawable5;
            int i13 = C19469R.styleable.GiphyMediaAttachmentView_streamUiGiphyMediaAttachmentGiphyType;
            GiphyInfoType giphyInfoType = GiphyInfoType.FIXED_HEIGHT;
            int i14 = typedArrayObtainStyledAttributes.getInt(i13, -1);
            if (i14 >= 0) {
                giphyInfoType = GiphyInfoType.values()[i14];
            }
            GiphyInfoType giphyInfoType2 = giphyInfoType;
            int i15 = C19469R.styleable.GiphyMediaAttachmentView_streamUiGiphyMediaAttachmentScaleType;
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            int i16 = typedArrayObtainStyledAttributes.getInt(i15, -1);
            if (i16 >= 0) {
                scaleType = ImageView.ScaleType.values()[i16];
            }
            ImageView.ScaleType scaleType2 = scaleType;
            int i17 = C19469R.styleable.GiphyMediaAttachmentView_streamUiGiphyMediaAttachmentSizingMode;
            GiphySizingMode giphySizingMode = GiphySizingMode.ADAPTIVE;
            int i18 = typedArrayObtainStyledAttributes.getInt(i17, -1);
            if (i18 >= 0) {
                giphySizingMode = GiphySizingMode.values()[i18];
            }
            int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(C19469R.styleable.GiphyMediaAttachmentView_streamUiGiphyMediaAttachmentWidth, -1);
            int layoutDimension2 = typedArrayObtainStyledAttributes.getLayoutDimension(C19469R.styleable.GiphyMediaAttachmentView_streamUiGiphyMediaAttachmentHeight, -1);
            float f13 = typedArrayObtainStyledAttributes.getFloat(C19469R.styleable.f74154x2100da53, 1.0f);
            AbstractC22676k.m65747g(scaleType2);
            return new GiphyMediaAttachmentViewStyle(drawable2, drawable4, drawable6, color, giphyInfoType2, scaleType2, giphySizingMode, layoutDimension, layoutDimension2, f13);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public GiphyMediaAttachmentViewStyle(Drawable progressIcon, Drawable giphyIcon, Drawable placeholderIcon, int i13, GiphyInfoType giphyType, ImageView.ScaleType scaleType, GiphySizingMode sizingMode, int i14, int i15, float f13) {
        AbstractC22676k.m65750j(progressIcon, "progressIcon");
        AbstractC22676k.m65750j(giphyIcon, "giphyIcon");
        AbstractC22676k.m65750j(placeholderIcon, "placeholderIcon");
        AbstractC22676k.m65750j(giphyType, "giphyType");
        AbstractC22676k.m65750j(scaleType, "scaleType");
        AbstractC22676k.m65750j(sizingMode, "sizingMode");
        this.progressIcon = progressIcon;
        this.giphyIcon = giphyIcon;
        this.placeholderIcon = placeholderIcon;
        this.imageBackgroundColor = i13;
        this.giphyType = giphyType;
        this.scaleType = scaleType;
        this.sizingMode = sizingMode;
        this.width = i14;
        this.height = i15;
        this.dimensionRatio = f13;
    }

    public final float getDimensionRatio() {
        return this.dimensionRatio;
    }

    public final Drawable getGiphyIcon() {
        return this.giphyIcon;
    }

    public final GiphyInfoType getGiphyType() {
        return this.giphyType;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getImageBackgroundColor() {
        return this.imageBackgroundColor;
    }

    public final Drawable getPlaceholderIcon() {
        return this.placeholderIcon;
    }

    public final Drawable getProgressIcon() {
        return this.progressIcon;
    }

    public final ImageView.ScaleType getScaleType() {
        return this.scaleType;
    }

    public final GiphySizingMode getSizingMode() {
        return this.sizingMode;
    }

    public final int getWidth() {
        return this.width;
    }
}
