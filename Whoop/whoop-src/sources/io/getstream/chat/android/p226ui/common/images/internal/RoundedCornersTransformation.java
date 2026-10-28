package io.getstream.chat.android.p226ui.common.images.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import e93.AbstractC12889b;
import gi.C15870a;
import gi.C15878i;
import gi.EnumC15876g;
import gi.InterfaceC15872c;
import p000.AbstractC11266d;
import p221ii.AbstractC18532b;
import p474s.AbstractC32004s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nJ \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/images/internal/RoundedCornersTransformation;", "Lii/b;", "", "topLeft", "topRight", "bottomLeft", "bottomRight", "<init>", "(FFFF)V", "radius", "(F)V", "Landroid/graphics/Bitmap;", "input", "Lgi/i;", "size", "transform", "(Landroid/graphics/Bitmap;Lgi/i;Lq83/d;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "F", "", "cacheKey", "Ljava/lang/String;", "getCacheKey", "()Ljava/lang/String;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class RoundedCornersTransformation extends AbstractC18532b {
    public static final int $stable = 8;
    private final float bottomLeft;
    private final float bottomRight;
    private final String cacheKey;
    private final float topLeft;
    private final float topRight;

    public RoundedCornersTransformation() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    @Override // p221ii.AbstractC18532b
    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundedCornersTransformation)) {
            return false;
        }
        RoundedCornersTransformation roundedCornersTransformation = (RoundedCornersTransformation) other;
        return this.topLeft == roundedCornersTransformation.topLeft && this.topRight == roundedCornersTransformation.topRight && this.bottomLeft == roundedCornersTransformation.bottomLeft && this.bottomRight == roundedCornersTransformation.bottomRight;
    }

    @Override // p221ii.AbstractC18532b
    public final String getCacheKey() {
        return this.cacheKey;
    }

    @Override // p221ii.AbstractC18532b
    public final int hashCode() {
        return Float.hashCode(this.bottomRight) + AbstractC11266d.m30447a(this.bottomLeft, AbstractC11266d.m30447a(this.topRight, Float.hashCode(this.topLeft) * 31, 31), 31);
    }

    @Override // p221ii.AbstractC18532b
    public final Object transform(Bitmap bitmap, C15878i c15878i, InterfaceC30057d<? super Bitmap> interfaceC30057d) {
        Paint paint = new Paint(3);
        InterfaceC15872c interfaceC15872c = c15878i.f59993a;
        int width = interfaceC15872c instanceof C15870a ? ((C15870a) interfaceC15872c).f59978a : bitmap.getWidth();
        InterfaceC15872c interfaceC15872c2 = c15878i.f59994b;
        int height = interfaceC15872c2 instanceof C15870a ? ((C15870a) interfaceC15872c2).f59978a : bitmap.getHeight();
        double dM99538g = AbstractC32004s.m99538g(bitmap.getWidth(), bitmap.getHeight(), width, height, EnumC15876g.f59984w);
        int iM36257W = AbstractC12889b.m36257W(((double) width) / dM99538g);
        int iM36257W2 = AbstractC12889b.m36257W(((double) height) / dM99538g);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iM36257W, iM36257W2, RoundedCornersTransformationKt.getSafeConfig(bitmap));
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        matrix.setTranslate((iM36257W - bitmap.getWidth()) / 2.0f, (iM36257W2 - bitmap.getHeight()) / 2.0f);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f13 = this.topLeft;
        float f14 = this.topRight;
        float f15 = this.bottomRight;
        float f16 = this.bottomLeft;
        float[] fArr = {f13, f13, f14, f14, f15, f15, f16, f16};
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }

    public RoundedCornersTransformation(float f13, float f14, float f15, float f16) {
        this.topLeft = f13;
        this.topRight = f14;
        this.bottomLeft = f15;
        this.bottomRight = f16;
        if (f13 < 0.0f || f14 < 0.0f || f15 < 0.0f || f16 < 0.0f) {
            throw new IllegalArgumentException("All radii must be >= 0.");
        }
        this.cacheKey = RoundedCornersTransformation.class.getName() + "-" + f13 + "," + f14 + "," + f15 + "," + f16;
    }

    public /* synthetic */ RoundedCornersTransformation(float f13, float f14, float f15, float f16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0f : f13, (i13 & 2) != 0 ? 0.0f : f14, (i13 & 4) != 0 ? 0.0f : f15, (i13 & 8) != 0 ? 0.0f : f16);
    }

    public RoundedCornersTransformation(float f13) {
        this(f13, f13, f13, f13);
    }
}
