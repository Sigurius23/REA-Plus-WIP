package p467rq;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import com.whoop.android.R;
import java.util.WeakHashMap;
import kr.C22785d;
import kr.C22788g;
import kr.C22790i;
import kr.C22791j;
import kr.C22792k;
import p087db.C11845e;
import p184h5.AbstractC16901p0;
import p257jq.AbstractC21885a;
import p287kq.AbstractC22766a;
import p412q3.C29875i;
import p558vp.AbstractC36259c;
import p666z.AbstractC39918b;
import p666z.C39917a;
import se.AbstractC32410a;

/* JADX INFO: renamed from: rq.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C31647c {

    /* JADX INFO: renamed from: y */
    public static final double f130785y = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: z */
    public static final ColorDrawable f130786z;

    /* JADX INFO: renamed from: a */
    public final MaterialCardView f130787a;

    /* JADX INFO: renamed from: c */
    public final C22788g f130789c;

    /* JADX INFO: renamed from: d */
    public final C22788g f130790d;

    /* JADX INFO: renamed from: e */
    public int f130791e;

    /* JADX INFO: renamed from: f */
    public int f130792f;

    /* JADX INFO: renamed from: g */
    public int f130793g;

    /* JADX INFO: renamed from: h */
    public int f130794h;

    /* JADX INFO: renamed from: i */
    public Drawable f130795i;

    /* JADX INFO: renamed from: j */
    public Drawable f130796j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f130797k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f130798l;

    /* JADX INFO: renamed from: m */
    public C22792k f130799m;

    /* JADX INFO: renamed from: n */
    public ColorStateList f130800n;

    /* JADX INFO: renamed from: o */
    public RippleDrawable f130801o;

    /* JADX INFO: renamed from: p */
    public LayerDrawable f130802p;

    /* JADX INFO: renamed from: q */
    public C22788g f130803q;

    /* JADX INFO: renamed from: s */
    public boolean f130805s;

    /* JADX INFO: renamed from: t */
    public ValueAnimator f130806t;

    /* JADX INFO: renamed from: u */
    public final TimeInterpolator f130807u;

    /* JADX INFO: renamed from: v */
    public final int f130808v;

    /* JADX INFO: renamed from: w */
    public final int f130809w;

    /* JADX INFO: renamed from: b */
    public final Rect f130788b = new Rect();

    /* JADX INFO: renamed from: r */
    public boolean f130804r = false;

    /* JADX INFO: renamed from: x */
    public float f130810x = 0.0f;

    static {
        f130786z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C31647c(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f130787a = materialCardView;
        C22788g c22788g = new C22788g(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f130789c = c22788g;
        c22788g.m66009k(materialCardView.getContext());
        c22788g.m66014p();
        C22791j c22791jM66029e = c22788g.f89748w.f89710a.m66029e();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, AbstractC21885a.f84546f, R.attr.materialCardViewStyle, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            c22791jM66029e.m66022b(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f130790d = new C22788g();
        m97811h(c22791jM66029e.m66021a());
        this.f130807u = AbstractC36259c.m115699l0(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC22766a.f89672a);
        this.f130808v = AbstractC36259c.m115697k0(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f130809w = AbstractC36259c.m115697k0(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public static float m97804b(AbstractC32410a abstractC32410a, float f13) {
        if (abstractC32410a instanceof C22790i) {
            return (float) ((1.0d - f130785y) * ((double) f13));
        }
        if (abstractC32410a instanceof C22785d) {
            return f13 / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final float m97805a() {
        AbstractC32410a abstractC32410a = this.f130799m.f89766a;
        C22788g c22788g = this.f130789c;
        return Math.max(Math.max(m97804b(abstractC32410a, c22788g.m66007i()), m97804b(this.f130799m.f89767b, c22788g.f89748w.f89710a.f89771f.mo65993a(c22788g.m66006h()))), Math.max(m97804b(this.f130799m.f89768c, c22788g.f89748w.f89710a.f89772g.mo65993a(c22788g.m66006h())), m97804b(this.f130799m.f89769d, c22788g.f89748w.f89710a.f89773h.mo65993a(c22788g.m66006h()))));
    }

    /* JADX INFO: renamed from: c */
    public final LayerDrawable m97806c() {
        if (this.f130801o == null) {
            this.f130803q = new C22788g(this.f130799m);
            this.f130801o = new RippleDrawable(this.f130797k, null, this.f130803q);
        }
        if (this.f130802p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f130801o, this.f130790d, this.f130796j});
            this.f130802p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f130802p;
    }

    /* JADX INFO: renamed from: d */
    public final C31646b m97807d(Drawable drawable) {
        int iCeil;
        int i13;
        MaterialCardView materialCardView = this.f130787a;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (m97812i() ? m97805a() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (m97812i() ? m97805a() : 0.0f));
            i13 = iCeil2;
        } else {
            iCeil = 0;
            i13 = 0;
        }
        return new C31646b(drawable, iCeil, i13, iCeil, i13);
    }

    /* JADX INFO: renamed from: e */
    public final void m97808e(int i13, int i14) {
        int iCeil;
        int iCeil2;
        int i15;
        int i16;
        if (this.f130802p != null) {
            MaterialCardView materialCardView = this.f130787a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (m97812i() ? m97805a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (m97812i() ? m97805a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i17 = this.f130793g;
            int i18 = (i17 & 8388613) == 8388613 ? ((i13 - this.f130791e) - this.f130792f) - iCeil2 : this.f130791e;
            int i19 = (i17 & 80) == 80 ? this.f130791e : ((i14 - this.f130791e) - this.f130792f) - iCeil;
            int i24 = (i17 & 8388613) == 8388613 ? this.f130791e : ((i13 - this.f130791e) - this.f130792f) - iCeil2;
            int i25 = (i17 & 80) == 80 ? ((i14 - this.f130791e) - this.f130792f) - iCeil : this.f130791e;
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            if (materialCardView.getLayoutDirection() == 1) {
                i16 = i24;
                i15 = i18;
            } else {
                i15 = i24;
                i16 = i18;
            }
            this.f130802p.setLayerInset(2, i16, i25, i15, i19);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m97809f(boolean z4, boolean z13) {
        Drawable drawable = this.f130796j;
        if (drawable != null) {
            if (!z13) {
                drawable.setAlpha(z4 ? 255 : 0);
                this.f130810x = z4 ? 1.0f : 0.0f;
                return;
            }
            float f13 = z4 ? 1.0f : 0.0f;
            float f14 = z4 ? 1.0f - this.f130810x : this.f130810x;
            ValueAnimator valueAnimator = this.f130806t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f130806t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f130810x, f13);
            this.f130806t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new C11845e(this, 9));
            this.f130806t.setInterpolator(this.f130807u);
            this.f130806t.setDuration((long) ((z4 ? this.f130808v : this.f130809w) * f14));
            this.f130806t.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m97810g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f130796j = drawableMutate;
            drawableMutate.setTintList(this.f130798l);
            m97809f(this.f130787a.f20862J, false);
        } else {
            this.f130796j = f130786z;
        }
        LayerDrawable layerDrawable = this.f130802p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f130796j);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m97811h(C22792k c22792k) {
        this.f130799m = c22792k;
        C22788g c22788g = this.f130789c;
        c22788g.setShapeAppearanceModel(c22792k);
        c22788g.f89747W = !c22788g.f89748w.f89710a.m66028d(c22788g.m66006h());
        C22788g c22788g2 = this.f130790d;
        if (c22788g2 != null) {
            c22788g2.setShapeAppearanceModel(c22792k);
        }
        C22788g c22788g3 = this.f130803q;
        if (c22788g3 != null) {
            c22788g3.setShapeAppearanceModel(c22792k);
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m97812i() {
        MaterialCardView materialCardView = this.f130787a;
        if (!materialCardView.getPreventCornerOverlap()) {
            return false;
        }
        C22788g c22788g = this.f130789c;
        return c22788g.f89748w.f89710a.m66028d(c22788g.m66006h()) && materialCardView.getUseCompatPadding();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m97813j() {
        View view = this.f130787a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    /* JADX INFO: renamed from: k */
    public final void m97814k() {
        Drawable drawable = this.f130795i;
        Drawable drawableM97806c = m97813j() ? m97806c() : this.f130790d;
        this.f130795i = drawableM97806c;
        if (drawable != drawableM97806c) {
            MaterialCardView materialCardView = this.f130787a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableM97806c);
            } else {
                materialCardView.setForeground(m97807d(drawableM97806c));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX INFO: renamed from: l */
    public final void m97815l() {
        float fM97805a;
        MaterialCardView materialCardView = this.f130787a;
        float cardViewRadius = 0.0f;
        if (materialCardView.getPreventCornerOverlap()) {
            C22788g c22788g = this.f130789c;
            if (!c22788g.f89748w.f89710a.m66028d(c22788g.m66006h())) {
                fM97805a = m97805a();
            } else if (m97812i()) {
                fM97805a = m97805a();
            } else {
                fM97805a = 0.0f;
            }
        } else if (m97812i()) {
            fM97805a = m97805a();
        } else {
            fM97805a = 0.0f;
        }
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f130785y) * ((double) materialCardView.getCardViewRadius()));
        }
        int i13 = (int) (fM97805a - cardViewRadius);
        Rect rect = this.f130788b;
        materialCardView.f4458y.set(rect.left + i13, rect.top + i13, rect.right + i13, rect.bottom + i13);
        C29875i c29875i = materialCardView.f4455E;
        CardView cardView = (CardView) c29875i.f122096x;
        if (!cardView.getUseCompatPadding()) {
            c29875i.m91500i(0, 0, 0, 0);
            return;
        }
        C39917a c39917a = (C39917a) ((Drawable) c29875i.f122095w);
        float f13 = c39917a.f172329e;
        float f14 = c39917a.f172325a;
        int iCeil = (int) Math.ceil(AbstractC39918b.m128082a(f13, f14, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC39918b.m128083b(f13, f14, cardView.getPreventCornerOverlap()));
        c29875i.m91500i(iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX INFO: renamed from: m */
    public final void m97816m() {
        boolean z4 = this.f130804r;
        MaterialCardView materialCardView = this.f130787a;
        if (!z4) {
            materialCardView.setBackgroundInternal(m97807d(this.f130789c));
        }
        materialCardView.setForeground(m97807d(this.f130795i));
    }
}
