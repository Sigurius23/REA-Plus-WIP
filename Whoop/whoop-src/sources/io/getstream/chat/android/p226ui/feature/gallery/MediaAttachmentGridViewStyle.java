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
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 72\u00020\u0001:\u00017Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0082\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0007HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016¨\u00068"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "showUserAvatars", "", "playVideoButtonIcon", "Landroid/graphics/drawable/Drawable;", "playVideoIconTint", "", "playVideoIconBackgroundColor", "playVideoIconCornerRadius", "", "playVideoIconElevation", "playVideoIconPaddingTop", "playVideoIconPaddingBottom", "playVideoIconPaddingStart", "playVideoIconPaddingEnd", "imagePlaceholder", "<init>", "(ZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFFIIIILandroid/graphics/drawable/Drawable;)V", "getShowUserAvatars", "()Z", "getPlayVideoButtonIcon", "()Landroid/graphics/drawable/Drawable;", "getPlayVideoIconTint", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPlayVideoIconBackgroundColor", "()I", "getPlayVideoIconCornerRadius", "()F", "getPlayVideoIconElevation", "getPlayVideoIconPaddingTop", "getPlayVideoIconPaddingBottom", "getPlayVideoIconPaddingStart", "getPlayVideoIconPaddingEnd", "getImagePlaceholder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(ZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;IFFIIIILandroid/graphics/drawable/Drawable;)Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;", "equals", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MediaAttachmentGridViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final Drawable imagePlaceholder;
    private final Drawable playVideoButtonIcon;
    private final int playVideoIconBackgroundColor;
    private final float playVideoIconCornerRadius;
    private final float playVideoIconElevation;
    private final int playVideoIconPaddingBottom;
    private final int playVideoIconPaddingEnd;
    private final int playVideoIconPaddingStart;
    private final int playVideoIconPaddingTop;
    private final Integer playVideoIconTint;
    private final boolean showUserAvatars;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\u0002J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "it", "Landroid/content/res/TypedArray;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final MediaAttachmentGridViewStyle invoke(Context context, AttributeSet attrs) {
            AbstractC22676k.m65750j(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C19469R.styleable.MediaAttachmentGridView, C19469R.attr.streamUiMediaAttachmentGridViewStyle, C19469R.style.StreamUi_MediaAttachmentGridView);
            Companion companion = MediaAttachmentGridViewStyle.INSTANCE;
            AbstractC22676k.m65747g(typedArrayObtainStyledAttributes);
            MediaAttachmentGridViewStyle mediaAttachmentGridViewStyleInvoke = companion.invoke(context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
            return mediaAttachmentGridViewStyleInvoke;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final MediaAttachmentGridViewStyle invoke(Context context, TypedArray it) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(it, "it");
            boolean z4 = it.getBoolean(C19469R.styleable.f74169xa98d9101, true);
            Drawable drawable = it.getDrawable(C19469R.styleable.f74159xed9028a1);
            if (drawable == null) {
                drawable = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_ic_play);
            }
            Drawable drawable2 = drawable;
            Integer colorOrNull = TypedArrayKt.getColorOrNull(it, C19469R.styleable.f74168x530ad66a);
            int color = it.getColor(C19469R.styleable.f74160xeb0a4806, AbstractC32122c.getColor(context, C19469R.color.stream_ui_literal_white));
            float dimension = it.getDimension(C19469R.styleable.f74161xb0169bb6, 0.0f);
            float dimension2 = it.getDimension(C19469R.styleable.f74162x99ac784e, 0.0f);
            int dimensionPixelSize = it.getDimensionPixelSize(C19469R.styleable.f74167xa9593bb3, 0);
            int dimensionPixelSize2 = it.getDimensionPixelSize(C19469R.styleable.f74164x28769b0d, 0);
            int dimensionPixelSize3 = it.getDimensionPixelSize(C19469R.styleable.f74166xb7ed1f40, 0);
            int dimensionPixelSize4 = it.getDimensionPixelSize(C19469R.styleable.f74165xa9590339, 0);
            Float dimensionOrNull = TypedArrayKt.getDimensionOrNull(it, C19469R.styleable.f74163xd85b4e42);
            Integer numValueOf = dimensionOrNull != null ? Integer.valueOf((int) dimensionOrNull.floatValue()) : null;
            Drawable drawable3 = it.getDrawable(C19469R.styleable.f74158x81046ea9);
            if (drawable3 == null) {
                drawable3 = AbstractC32122c.getDrawable(context, C19469R.drawable.stream_ui_picture_placeholder);
            }
            Drawable drawable4 = drawable3;
            int iIntValue = dimensionPixelSize2;
            if (numValueOf != null) {
                dimensionPixelSize = numValueOf.intValue();
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
            if (numValueOf != null) {
                dimensionPixelSize3 = numValueOf.intValue();
            }
            int i13 = dimensionPixelSize3;
            if (numValueOf != null) {
                dimensionPixelSize4 = numValueOf.intValue();
            }
            return TransformStyle.getMediaAttachmentGridViewStyle().transform(new MediaAttachmentGridViewStyle(z4, drawable2, colorOrNull, color, dimension, dimension2, dimensionPixelSize, iIntValue, i13, dimensionPixelSize4, drawable4));
        }
    }

    public MediaAttachmentGridViewStyle(boolean z4, Drawable drawable, Integer num, int i13, float f13, float f14, int i14, int i15, int i16, int i17, Drawable drawable2) {
        this.showUserAvatars = z4;
        this.playVideoButtonIcon = drawable;
        this.playVideoIconTint = num;
        this.playVideoIconBackgroundColor = i13;
        this.playVideoIconCornerRadius = f13;
        this.playVideoIconElevation = f14;
        this.playVideoIconPaddingTop = i14;
        this.playVideoIconPaddingBottom = i15;
        this.playVideoIconPaddingStart = i16;
        this.playVideoIconPaddingEnd = i17;
        this.imagePlaceholder = drawable2;
    }

    public static MediaAttachmentGridViewStyle copy$default(MediaAttachmentGridViewStyle mediaAttachmentGridViewStyle, boolean z4, Drawable drawable, Integer num, int i13, float f13, float f14, int i14, int i15, int i16, int i17, Drawable drawable2, int i18, Object obj) {
        if ((i18 & 1) != 0) {
            z4 = mediaAttachmentGridViewStyle.showUserAvatars;
        }
        if ((i18 & 2) != 0) {
            drawable = mediaAttachmentGridViewStyle.playVideoButtonIcon;
        }
        if ((i18 & 4) != 0) {
            num = mediaAttachmentGridViewStyle.playVideoIconTint;
        }
        if ((i18 & 8) != 0) {
            i13 = mediaAttachmentGridViewStyle.playVideoIconBackgroundColor;
        }
        if ((i18 & 16) != 0) {
            f13 = mediaAttachmentGridViewStyle.playVideoIconCornerRadius;
        }
        if ((i18 & 32) != 0) {
            f14 = mediaAttachmentGridViewStyle.playVideoIconElevation;
        }
        if ((i18 & 64) != 0) {
            i14 = mediaAttachmentGridViewStyle.playVideoIconPaddingTop;
        }
        if ((i18 & 128) != 0) {
            i15 = mediaAttachmentGridViewStyle.playVideoIconPaddingBottom;
        }
        if ((i18 & 256) != 0) {
            i16 = mediaAttachmentGridViewStyle.playVideoIconPaddingStart;
        }
        if ((i18 & 512) != 0) {
            i17 = mediaAttachmentGridViewStyle.playVideoIconPaddingEnd;
        }
        if ((i18 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            drawable2 = mediaAttachmentGridViewStyle.imagePlaceholder;
        }
        Drawable drawable3 = drawable2;
        mediaAttachmentGridViewStyle.getClass();
        int i19 = i17;
        int i24 = i15;
        float f15 = f14;
        int i25 = i16;
        int i26 = i14;
        float f16 = f13;
        Integer num2 = num;
        return new MediaAttachmentGridViewStyle(z4, drawable, num2, i13, f16, f15, i26, i24, i25, i19, drawable3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowUserAvatars() {
        return this.showUserAvatars;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPlayVideoIconPaddingEnd() {
        return this.playVideoIconPaddingEnd;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Drawable getImagePlaceholder() {
        return this.imagePlaceholder;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Drawable getPlayVideoButtonIcon() {
        return this.playVideoButtonIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPlayVideoIconTint() {
        return this.playVideoIconTint;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPlayVideoIconBackgroundColor() {
        return this.playVideoIconBackgroundColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getPlayVideoIconCornerRadius() {
        return this.playVideoIconCornerRadius;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getPlayVideoIconElevation() {
        return this.playVideoIconElevation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getPlayVideoIconPaddingTop() {
        return this.playVideoIconPaddingTop;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getPlayVideoIconPaddingBottom() {
        return this.playVideoIconPaddingBottom;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getPlayVideoIconPaddingStart() {
        return this.playVideoIconPaddingStart;
    }

    public final MediaAttachmentGridViewStyle copy(boolean showUserAvatars, Drawable playVideoButtonIcon, Integer playVideoIconTint, int playVideoIconBackgroundColor, float playVideoIconCornerRadius, float playVideoIconElevation, int playVideoIconPaddingTop, int playVideoIconPaddingBottom, int playVideoIconPaddingStart, int playVideoIconPaddingEnd, Drawable imagePlaceholder) {
        return new MediaAttachmentGridViewStyle(showUserAvatars, playVideoButtonIcon, playVideoIconTint, playVideoIconBackgroundColor, playVideoIconCornerRadius, playVideoIconElevation, playVideoIconPaddingTop, playVideoIconPaddingBottom, playVideoIconPaddingStart, playVideoIconPaddingEnd, imagePlaceholder);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaAttachmentGridViewStyle)) {
            return false;
        }
        MediaAttachmentGridViewStyle mediaAttachmentGridViewStyle = (MediaAttachmentGridViewStyle) other;
        return this.showUserAvatars == mediaAttachmentGridViewStyle.showUserAvatars && AbstractC22676k.m65745e(this.playVideoButtonIcon, mediaAttachmentGridViewStyle.playVideoButtonIcon) && AbstractC22676k.m65745e(this.playVideoIconTint, mediaAttachmentGridViewStyle.playVideoIconTint) && this.playVideoIconBackgroundColor == mediaAttachmentGridViewStyle.playVideoIconBackgroundColor && Float.compare(this.playVideoIconCornerRadius, mediaAttachmentGridViewStyle.playVideoIconCornerRadius) == 0 && Float.compare(this.playVideoIconElevation, mediaAttachmentGridViewStyle.playVideoIconElevation) == 0 && this.playVideoIconPaddingTop == mediaAttachmentGridViewStyle.playVideoIconPaddingTop && this.playVideoIconPaddingBottom == mediaAttachmentGridViewStyle.playVideoIconPaddingBottom && this.playVideoIconPaddingStart == mediaAttachmentGridViewStyle.playVideoIconPaddingStart && this.playVideoIconPaddingEnd == mediaAttachmentGridViewStyle.playVideoIconPaddingEnd && AbstractC22676k.m65745e(this.imagePlaceholder, mediaAttachmentGridViewStyle.imagePlaceholder);
    }

    public final Drawable getImagePlaceholder() {
        return this.imagePlaceholder;
    }

    public final Drawable getPlayVideoButtonIcon() {
        return this.playVideoButtonIcon;
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

    public final boolean getShowUserAvatars() {
        return this.showUserAvatars;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.showUserAvatars) * 31;
        Drawable drawable = this.playVideoButtonIcon;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num = this.playVideoIconTint;
        int iM30448b = AbstractC11266d.m30448b(this.playVideoIconPaddingEnd, AbstractC11266d.m30448b(this.playVideoIconPaddingStart, AbstractC11266d.m30448b(this.playVideoIconPaddingBottom, AbstractC11266d.m30448b(this.playVideoIconPaddingTop, AbstractC11266d.m30447a(this.playVideoIconElevation, AbstractC11266d.m30447a(this.playVideoIconCornerRadius, AbstractC11266d.m30448b(this.playVideoIconBackgroundColor, (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31);
        Drawable drawable2 = this.imagePlaceholder;
        return iM30448b + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    public final String toString() {
        boolean z4 = this.showUserAvatars;
        Drawable drawable = this.playVideoButtonIcon;
        Integer num = this.playVideoIconTint;
        int i13 = this.playVideoIconBackgroundColor;
        float f13 = this.playVideoIconCornerRadius;
        float f14 = this.playVideoIconElevation;
        int i14 = this.playVideoIconPaddingTop;
        int i15 = this.playVideoIconPaddingBottom;
        int i16 = this.playVideoIconPaddingStart;
        int i17 = this.playVideoIconPaddingEnd;
        Drawable drawable2 = this.imagePlaceholder;
        StringBuilder sb4 = new StringBuilder("MediaAttachmentGridViewStyle(showUserAvatars=");
        sb4.append(z4);
        sb4.append(", playVideoButtonIcon=");
        sb4.append(drawable);
        sb4.append(", playVideoIconTint=");
        sb4.append(num);
        sb4.append(", playVideoIconBackgroundColor=");
        sb4.append(i13);
        sb4.append(", playVideoIconCornerRadius=");
        AbstractC30802r.m94772u(sb4, f13, ", playVideoIconElevation=", f14, ", playVideoIconPaddingTop=");
        AbstractC30802r.m94773v(sb4, i14, ", playVideoIconPaddingBottom=", i15, ", playVideoIconPaddingStart=");
        AbstractC30802r.m94773v(sb4, i16, ", playVideoIconPaddingEnd=", i17, ", imagePlaceholder=");
        sb4.append(drawable2);
        sb4.append(")");
        return sb4.toString();
    }
}
