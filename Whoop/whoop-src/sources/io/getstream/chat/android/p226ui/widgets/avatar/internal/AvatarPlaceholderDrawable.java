package io.getstream.chat.android.p226ui.widgets.avatar.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.utils.ColorUtilKt;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\rJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/ui/widgets/avatar/internal/AvatarPlaceholderDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "", "initials", "Lio/getstream/chat/android/ui/font/TextStyle;", "initialsTextStyle", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;)V", "Landroid/graphics/Canvas;", "Ll83/a0;", "drawGradient", "(Landroid/graphics/Canvas;Ljava/lang/String;)V", "drawInitials", "", "width", "height", "Landroid/graphics/Shader;", "initialsGradient", "(Ljava/lang/String;II)Landroid/graphics/Shader;", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/content/Context;", "Ljava/lang/String;", "Lio/getstream/chat/android/ui/font/TextStyle;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AvatarPlaceholderDrawable extends Drawable {
    private static final float GRADIENT_DARKER_COLOR_FACTOR = 1.3f;
    private static final float GRADIENT_LIGHTER_COLOR_FACTOR = 0.7f;
    private final Context context;
    private final String initials;
    private final TextStyle initialsTextStyle;

    public AvatarPlaceholderDrawable(Context context, String initials, TextStyle initialsTextStyle) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(initials, "initials");
        AbstractC22676k.m65750j(initialsTextStyle, "initialsTextStyle");
        this.context = context;
        this.initials = initials;
        this.initialsTextStyle = initialsTextStyle;
    }

    private final void drawGradient(Canvas canvas, String str) {
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(initialsGradient(str, canvas.getWidth(), canvas.getHeight()));
        canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint);
    }

    private final void drawInitials(Canvas canvas, String str) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        Typeface font = this.initialsTextStyle.getFont();
        if (font == null) {
            font = Typeface.DEFAULT_BOLD;
        }
        paint.setTypeface(font);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(this.initialsTextStyle.getColor());
        paint.setTextSize(this.initialsTextStyle.getSize());
        canvas.drawText(str, canvas.getWidth() / 2.0f, (canvas.getHeight() / 2.0f) - ((paint.descent() + paint.ascent()) / 2.0f), paint);
    }

    private final Shader initialsGradient(String initials, int width, int height) {
        int[] intArray = ContextKt.getIntArray(this.context, C19469R.array.stream_ui_avatar_gradient_colors);
        int i13 = intArray[Math.abs(initials.hashCode()) % intArray.length];
        return new LinearGradient(0.0f, 0.0f, width, height, ColorUtilKt.adjustColorBrightness(i13, GRADIENT_DARKER_COLOR_FACTOR), ColorUtilKt.adjustColorBrightness(i13, GRADIENT_LIGHTER_COLOR_FACTOR), Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        drawGradient(canvas, this.initials);
        drawInitials(canvas, this.initials);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
