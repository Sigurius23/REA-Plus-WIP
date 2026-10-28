package br;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;
import kr.C22788g;

/* JADX INFO: renamed from: br.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C3553a extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final Rect f14289a = new Rect();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ShapeableImageView f14290b;

    public C3553a(ShapeableImageView shapeableImageView) {
        this.f14290b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f14290b;
        if (shapeableImageView.shapeAppearanceModel == null) {
            return;
        }
        if (shapeableImageView.shadowDrawable == null) {
            shapeableImageView.shadowDrawable = new C22788g(shapeableImageView.shapeAppearanceModel);
        }
        RectF rectF = shapeableImageView.destination;
        Rect rect = this.f14289a;
        rectF.round(rect);
        shapeableImageView.shadowDrawable.setBounds(rect);
        shapeableImageView.shadowDrawable.getOutline(outline);
    }
}
