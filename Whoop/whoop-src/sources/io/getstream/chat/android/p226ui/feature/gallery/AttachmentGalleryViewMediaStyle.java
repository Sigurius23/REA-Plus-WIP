package io.getstream.chat.android.p226ui.feature.gallery;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.TypedArrayKt;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00019Bq\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008c\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\u0005HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014¨\u0006:"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "viewMediaPlayVideoButtonIcon", "Landroid/graphics/drawable/Drawable;", "viewMediaPlayVideoIconTint", "", "viewMediaPlayVideoIconBackgroundColor", "viewMediaPlayVideoIconCornerRadius", "", "viewMediaPlayVideoIconElevation", "viewMediaPlayVideoIconPaddingTop", "viewMediaPlayVideoIconPaddingBottom", "viewMediaPlayVideoIconPaddingStart", "viewMediaPlayVideoIconPaddingEnd", "viewMediaPlayVideoIconWidth", "viewMediaPlayVideoIconHeight", "imagePlaceholder", "<init>", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFFIIIIIILandroid/graphics/drawable/Drawable;)V", "getViewMediaPlayVideoButtonIcon", "()Landroid/graphics/drawable/Drawable;", "getViewMediaPlayVideoIconTint", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getViewMediaPlayVideoIconBackgroundColor", "()I", "getViewMediaPlayVideoIconCornerRadius", "()F", "getViewMediaPlayVideoIconElevation", "getViewMediaPlayVideoIconPaddingTop", "getViewMediaPlayVideoIconPaddingBottom", "getViewMediaPlayVideoIconPaddingStart", "getViewMediaPlayVideoIconPaddingEnd", "getViewMediaPlayVideoIconWidth", "getViewMediaPlayVideoIconHeight", "getImagePlaceholder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFFIIIIIILandroid/graphics/drawable/Drawable;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AttachmentGalleryViewMediaStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final Drawable imagePlaceholder;
    private final Drawable viewMediaPlayVideoButtonIcon;
    private final int viewMediaPlayVideoIconBackgroundColor;
    private final float viewMediaPlayVideoIconCornerRadius;
    private final float viewMediaPlayVideoIconElevation;
    private final int viewMediaPlayVideoIconHeight;
    private final int viewMediaPlayVideoIconPaddingBottom;
    private final int viewMediaPlayVideoIconPaddingEnd;
    private final int viewMediaPlayVideoIconPaddingStart;
    private final int viewMediaPlayVideoIconPaddingTop;
    private final Integer viewMediaPlayVideoIconTint;
    private final int viewMediaPlayVideoIconWidth;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\u0002J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "it", "Landroid/content/res/TypedArray;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final AttachmentGalleryViewMediaStyle invoke(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.AttachmentGalleryVideoAttachments, C19469R.attr.streamUiAttachmentGalleryVideoAttachmentsStyle, C19469R.style.StreamUi_AttachmentGallery_VideoAttachments);
            Companion companion = AttachmentGalleryViewMediaStyle.INSTANCE;
            AbstractC22676k.m65747g(typedArrayObtainStyledAttributes);
            AttachmentGalleryViewMediaStyle attachmentGalleryViewMediaStyleInvoke = companion.invoke(context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
            return attachmentGalleryViewMediaStyleInvoke;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final AttachmentGalleryViewMediaStyle invoke(Context context, TypedArray it) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(it, "it");
            Drawable drawable = it.getDrawable(C19469R.styleable.f74094x9bc6bc73);
            if (drawable == null) {
                drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_play);
            }
            Drawable drawable2 = drawable;
            Integer colorOrNull = TypedArrayKt.getColorOrNull(it, C19469R.styleable.f74103xcf1836bc);
            int color = it.getColor(C19469R.styleable.f74095x69c7e074, AbstractC32122c.getColor(context, C19469R.color.stream_ui_literal_white));
            float dimension = it.getDimension(C19469R.styleable.f74096xf6af8a08, 0.0f);
            float dimension2 = it.getDimension(C19469R.styleable.f74097xfae87b3c, 0.0f);
            int dimensionPixelSize = it.getDimensionPixelSize(C19469R.styleable.f74102x6f9d9685, 0);
            int dimensionPixelSize2 = it.getDimensionPixelSize(C19469R.styleable.f74099xb4fb76fb, 0);
            int dimensionPixelSize3 = it.getDimensionPixelSize(C19469R.styleable.f74101xfe860d92, 0);
            int dimensionPixelSize4 = it.getDimensionPixelSize(C19469R.styleable.f74100x6f9d5e0b, 0);
            Float dimensionOrNull = TypedArrayKt.getDimensionOrNull(it, C19469R.styleable.f74098xf0f734b0);
            Integer numValueOf = dimensionOrNull != null ? Integer.valueOf((int) dimensionOrNull.floatValue()) : null;
            int layoutDimension = it.getLayoutDimension(C19469R.styleable.f74093x324f3d5a, -2);
            int layoutDimension2 = it.getLayoutDimension(C19469R.styleable.f74092xfdc97413, -2);
            Drawable drawable3 = it.getDrawable(C19469R.styleable.f74091x7480bc17);
            if (drawable3 == null) {
                drawable3 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_picture_placeholder);
            }
            Drawable drawable4 = drawable3;
            int iIntValue = dimensionPixelSize4;
            if (numValueOf != null) {
                dimensionPixelSize = numValueOf.intValue();
            }
            if (numValueOf != null) {
                dimensionPixelSize2 = numValueOf.intValue();
            }
            if (numValueOf != null) {
                dimensionPixelSize3 = numValueOf.intValue();
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
            return TransformStyle.getAttachmentGalleryViewMediaStyle().transform(new AttachmentGalleryViewMediaStyle(drawable2, colorOrNull, color, dimension, dimension2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, iIntValue, layoutDimension, layoutDimension2, drawable4));
        }
    }

    public AttachmentGalleryViewMediaStyle(Drawable drawable, Integer num, int i13, float f13, float f14, int i14, int i15, int i16, int i17, int i18, int i19, Drawable drawable2) {
        this.viewMediaPlayVideoButtonIcon = drawable;
        this.viewMediaPlayVideoIconTint = num;
        this.viewMediaPlayVideoIconBackgroundColor = i13;
        this.viewMediaPlayVideoIconCornerRadius = f13;
        this.viewMediaPlayVideoIconElevation = f14;
        this.viewMediaPlayVideoIconPaddingTop = i14;
        this.viewMediaPlayVideoIconPaddingBottom = i15;
        this.viewMediaPlayVideoIconPaddingStart = i16;
        this.viewMediaPlayVideoIconPaddingEnd = i17;
        this.viewMediaPlayVideoIconWidth = i18;
        this.viewMediaPlayVideoIconHeight = i19;
        this.imagePlaceholder = drawable2;
    }

    public static AttachmentGalleryViewMediaStyle copy$default(AttachmentGalleryViewMediaStyle attachmentGalleryViewMediaStyle, Drawable drawable, Integer num, int i13, float f13, float f14, int i14, int i15, int i16, int i17, int i18, int i19, Drawable drawable2, int i24, Object obj) {
        if ((i24 & 1) != 0) {
            drawable = attachmentGalleryViewMediaStyle.viewMediaPlayVideoButtonIcon;
        }
        if ((i24 & 2) != 0) {
            num = attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconTint;
        }
        if ((i24 & 4) != 0) {
            i13 = attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconBackgroundColor;
        }
        if ((i24 & 8) != 0) {
            f13 = attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconCornerRadius;
        }
        if ((i24 & 16) != 0) {
            f14 = attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconElevation;
        }
        if ((i24 & 32) != 0) {
            i14 = attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconPaddingTop;
        }
        if ((i24 & 64) != 0) {
            i15 = attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconPaddingBottom;
        }
        if ((i24 & 128) != 0) {
            i16 = attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconPaddingStart;
        }
        if ((i24 & 256) != 0) {
            i17 = attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconPaddingEnd;
        }
        if ((i24 & 512) != 0) {
            i18 = attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconWidth;
        }
        if ((i24 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            i19 = attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconHeight;
        }
        if ((i24 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            drawable2 = attachmentGalleryViewMediaStyle.imagePlaceholder;
        }
        Drawable drawable3 = drawable2;
        attachmentGalleryViewMediaStyle.getClass();
        int i25 = i18;
        int i26 = i16;
        int i27 = i14;
        int i28 = i19;
        int i29 = i17;
        int i34 = i15;
        float f15 = f14;
        int i35 = i13;
        return new AttachmentGalleryViewMediaStyle(drawable, num, i35, f13, f15, i27, i34, i26, i29, i25, i28, drawable3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Drawable getViewMediaPlayVideoButtonIcon() {
        return this.viewMediaPlayVideoButtonIcon;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getViewMediaPlayVideoIconWidth() {
        return this.viewMediaPlayVideoIconWidth;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getViewMediaPlayVideoIconHeight() {
        return this.viewMediaPlayVideoIconHeight;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Drawable getImagePlaceholder() {
        return this.imagePlaceholder;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getViewMediaPlayVideoIconTint() {
        return this.viewMediaPlayVideoIconTint;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getViewMediaPlayVideoIconBackgroundColor() {
        return this.viewMediaPlayVideoIconBackgroundColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getViewMediaPlayVideoIconCornerRadius() {
        return this.viewMediaPlayVideoIconCornerRadius;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getViewMediaPlayVideoIconElevation() {
        return this.viewMediaPlayVideoIconElevation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getViewMediaPlayVideoIconPaddingTop() {
        return this.viewMediaPlayVideoIconPaddingTop;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getViewMediaPlayVideoIconPaddingBottom() {
        return this.viewMediaPlayVideoIconPaddingBottom;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getViewMediaPlayVideoIconPaddingStart() {
        return this.viewMediaPlayVideoIconPaddingStart;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getViewMediaPlayVideoIconPaddingEnd() {
        return this.viewMediaPlayVideoIconPaddingEnd;
    }

    public final AttachmentGalleryViewMediaStyle copy(Drawable viewMediaPlayVideoButtonIcon, Integer viewMediaPlayVideoIconTint, int viewMediaPlayVideoIconBackgroundColor, float viewMediaPlayVideoIconCornerRadius, float viewMediaPlayVideoIconElevation, int viewMediaPlayVideoIconPaddingTop, int viewMediaPlayVideoIconPaddingBottom, int viewMediaPlayVideoIconPaddingStart, int viewMediaPlayVideoIconPaddingEnd, int viewMediaPlayVideoIconWidth, int viewMediaPlayVideoIconHeight, Drawable imagePlaceholder) {
        return new AttachmentGalleryViewMediaStyle(viewMediaPlayVideoButtonIcon, viewMediaPlayVideoIconTint, viewMediaPlayVideoIconBackgroundColor, viewMediaPlayVideoIconCornerRadius, viewMediaPlayVideoIconElevation, viewMediaPlayVideoIconPaddingTop, viewMediaPlayVideoIconPaddingBottom, viewMediaPlayVideoIconPaddingStart, viewMediaPlayVideoIconPaddingEnd, viewMediaPlayVideoIconWidth, viewMediaPlayVideoIconHeight, imagePlaceholder);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentGalleryViewMediaStyle)) {
            return false;
        }
        AttachmentGalleryViewMediaStyle attachmentGalleryViewMediaStyle = (AttachmentGalleryViewMediaStyle) other;
        return AbstractC22676k.m65745e(this.viewMediaPlayVideoButtonIcon, attachmentGalleryViewMediaStyle.viewMediaPlayVideoButtonIcon) && AbstractC22676k.m65745e(this.viewMediaPlayVideoIconTint, attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconTint) && this.viewMediaPlayVideoIconBackgroundColor == attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconBackgroundColor && Float.compare(this.viewMediaPlayVideoIconCornerRadius, attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconCornerRadius) == 0 && Float.compare(this.viewMediaPlayVideoIconElevation, attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconElevation) == 0 && this.viewMediaPlayVideoIconPaddingTop == attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconPaddingTop && this.viewMediaPlayVideoIconPaddingBottom == attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconPaddingBottom && this.viewMediaPlayVideoIconPaddingStart == attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconPaddingStart && this.viewMediaPlayVideoIconPaddingEnd == attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconPaddingEnd && this.viewMediaPlayVideoIconWidth == attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconWidth && this.viewMediaPlayVideoIconHeight == attachmentGalleryViewMediaStyle.viewMediaPlayVideoIconHeight && AbstractC22676k.m65745e(this.imagePlaceholder, attachmentGalleryViewMediaStyle.imagePlaceholder);
    }

    public final Drawable getImagePlaceholder() {
        return this.imagePlaceholder;
    }

    public final Drawable getViewMediaPlayVideoButtonIcon() {
        return this.viewMediaPlayVideoButtonIcon;
    }

    public final int getViewMediaPlayVideoIconBackgroundColor() {
        return this.viewMediaPlayVideoIconBackgroundColor;
    }

    public final float getViewMediaPlayVideoIconCornerRadius() {
        return this.viewMediaPlayVideoIconCornerRadius;
    }

    public final float getViewMediaPlayVideoIconElevation() {
        return this.viewMediaPlayVideoIconElevation;
    }

    public final int getViewMediaPlayVideoIconHeight() {
        return this.viewMediaPlayVideoIconHeight;
    }

    public final int getViewMediaPlayVideoIconPaddingBottom() {
        return this.viewMediaPlayVideoIconPaddingBottom;
    }

    public final int getViewMediaPlayVideoIconPaddingEnd() {
        return this.viewMediaPlayVideoIconPaddingEnd;
    }

    public final int getViewMediaPlayVideoIconPaddingStart() {
        return this.viewMediaPlayVideoIconPaddingStart;
    }

    public final int getViewMediaPlayVideoIconPaddingTop() {
        return this.viewMediaPlayVideoIconPaddingTop;
    }

    public final Integer getViewMediaPlayVideoIconTint() {
        return this.viewMediaPlayVideoIconTint;
    }

    public final int getViewMediaPlayVideoIconWidth() {
        return this.viewMediaPlayVideoIconWidth;
    }

    public final int hashCode() {
        Drawable drawable = this.viewMediaPlayVideoButtonIcon;
        int iHashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
        Integer num = this.viewMediaPlayVideoIconTint;
        int iM30448b = AbstractC11266d.m30448b(this.viewMediaPlayVideoIconHeight, AbstractC11266d.m30448b(this.viewMediaPlayVideoIconWidth, AbstractC11266d.m30448b(this.viewMediaPlayVideoIconPaddingEnd, AbstractC11266d.m30448b(this.viewMediaPlayVideoIconPaddingStart, AbstractC11266d.m30448b(this.viewMediaPlayVideoIconPaddingBottom, AbstractC11266d.m30448b(this.viewMediaPlayVideoIconPaddingTop, AbstractC11266d.m30447a(this.viewMediaPlayVideoIconElevation, AbstractC11266d.m30447a(this.viewMediaPlayVideoIconCornerRadius, AbstractC11266d.m30448b(this.viewMediaPlayVideoIconBackgroundColor, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        Drawable drawable2 = this.imagePlaceholder;
        return iM30448b + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    public final String toString() {
        Drawable drawable = this.viewMediaPlayVideoButtonIcon;
        Integer num = this.viewMediaPlayVideoIconTint;
        int i13 = this.viewMediaPlayVideoIconBackgroundColor;
        float f13 = this.viewMediaPlayVideoIconCornerRadius;
        float f14 = this.viewMediaPlayVideoIconElevation;
        int i14 = this.viewMediaPlayVideoIconPaddingTop;
        int i15 = this.viewMediaPlayVideoIconPaddingBottom;
        int i16 = this.viewMediaPlayVideoIconPaddingStart;
        int i17 = this.viewMediaPlayVideoIconPaddingEnd;
        int i18 = this.viewMediaPlayVideoIconWidth;
        int i19 = this.viewMediaPlayVideoIconHeight;
        Drawable drawable2 = this.imagePlaceholder;
        StringBuilder sb4 = new StringBuilder("AttachmentGalleryViewMediaStyle(viewMediaPlayVideoButtonIcon=");
        sb4.append(drawable);
        sb4.append(", viewMediaPlayVideoIconTint=");
        sb4.append(num);
        sb4.append(", viewMediaPlayVideoIconBackgroundColor=");
        sb4.append(i13);
        sb4.append(", viewMediaPlayVideoIconCornerRadius=");
        sb4.append(f13);
        sb4.append(", viewMediaPlayVideoIconElevation=");
        sb4.append(f14);
        sb4.append(", viewMediaPlayVideoIconPaddingTop=");
        sb4.append(i14);
        sb4.append(", viewMediaPlayVideoIconPaddingBottom=");
        AbstractC30802r.m94773v(sb4, i15, ", viewMediaPlayVideoIconPaddingStart=", i16, ", viewMediaPlayVideoIconPaddingEnd=");
        AbstractC30802r.m94773v(sb4, i17, ", viewMediaPlayVideoIconWidth=", i18, ", viewMediaPlayVideoIconHeight=");
        sb4.append(i19);
        sb4.append(", imagePlaceholder=");
        sb4.append(drawable2);
        sb4.append(")");
        return sb4.toString();
    }
}
