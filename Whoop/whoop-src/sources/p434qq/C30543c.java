package p434qq;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.whoop.android.R;
import ir.AbstractC20858a;
import java.util.WeakHashMap;
import kr.C22788g;
import kr.C22792k;
import kr.InterfaceC22803v;
import p184h5.AbstractC16901p0;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: qq.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C30543c {

    /* JADX INFO: renamed from: a */
    public final MaterialButton f125680a;

    /* JADX INFO: renamed from: b */
    public C22792k f125681b;

    /* JADX INFO: renamed from: c */
    public int f125682c;

    /* JADX INFO: renamed from: d */
    public int f125683d;

    /* JADX INFO: renamed from: e */
    public int f125684e;

    /* JADX INFO: renamed from: f */
    public int f125685f;

    /* JADX INFO: renamed from: g */
    public int f125686g;

    /* JADX INFO: renamed from: h */
    public int f125687h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f125688i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f125689j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f125690k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f125691l;

    /* JADX INFO: renamed from: m */
    public C22788g f125692m;

    /* JADX INFO: renamed from: q */
    public boolean f125696q;

    /* JADX INFO: renamed from: s */
    public RippleDrawable f125698s;

    /* JADX INFO: renamed from: t */
    public int f125699t;

    /* JADX INFO: renamed from: n */
    public boolean f125693n = false;

    /* JADX INFO: renamed from: o */
    public boolean f125694o = false;

    /* JADX INFO: renamed from: p */
    public boolean f125695p = false;

    /* JADX INFO: renamed from: r */
    public boolean f125697r = true;

    public C30543c(MaterialButton materialButton, C22792k c22792k) {
        this.f125680a = materialButton;
        this.f125681b = c22792k;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC22803v m93629a() {
        RippleDrawable rippleDrawable = this.f125698s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f125698s.getNumberOfLayers() > 2 ? (InterfaceC22803v) this.f125698s.getDrawable(2) : (InterfaceC22803v) this.f125698s.getDrawable(1);
    }

    /* JADX INFO: renamed from: b */
    public final C22788g m93630b(boolean z4) {
        RippleDrawable rippleDrawable = this.f125698s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C22788g) ((LayerDrawable) ((InsetDrawable) this.f125698s.getDrawable(0)).getDrawable()).getDrawable(!z4 ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m93631c(C22792k c22792k) {
        this.f125681b = c22792k;
        if (m93630b(false) != null) {
            m93630b(false).setShapeAppearanceModel(c22792k);
        }
        if (m93630b(true) != null) {
            m93630b(true).setShapeAppearanceModel(c22792k);
        }
        if (m93629a() != null) {
            m93629a().setShapeAppearanceModel(c22792k);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m93632d(int i13, int i14) {
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        MaterialButton materialButton = this.f125680a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i15 = this.f125684e;
        int i16 = this.f125685f;
        this.f125685f = i14;
        this.f125684e = i13;
        if (!this.f125694o) {
            m93633e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i13) - i15, paddingEnd, (paddingBottom + i14) - i16);
    }

    /* JADX INFO: renamed from: e */
    public final void m93633e() {
        C22788g c22788g = new C22788g(this.f125681b);
        MaterialButton materialButton = this.f125680a;
        c22788g.m66009k(materialButton.getContext());
        c22788g.setTintList(this.f125689j);
        PorterDuff.Mode mode = this.f125688i;
        if (mode != null) {
            c22788g.setTintMode(mode);
        }
        float f13 = this.f125687h;
        ColorStateList colorStateList = this.f125690k;
        c22788g.m66017s(f13);
        c22788g.m66015q(colorStateList);
        C22788g c22788g2 = new C22788g(this.f125681b);
        c22788g2.setTint(0);
        float f14 = this.f125687h;
        int iM96969u = this.f125693n ? AbstractC31484o.m96969u(materialButton, R.attr.colorSurface) : 0;
        c22788g2.m66017s(f14);
        c22788g2.m66015q(ColorStateList.valueOf(iM96969u));
        C22788g c22788g3 = new C22788g(this.f125681b);
        this.f125692m = c22788g3;
        c22788g3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC20858a.m57613b(this.f125691l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c22788g2, c22788g}), this.f125682c, this.f125684e, this.f125683d, this.f125685f), this.f125692m);
        this.f125698s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C22788g c22788gM93630b = m93630b(false);
        if (c22788gM93630b != null) {
            c22788gM93630b.m66010l(this.f125699t);
            c22788gM93630b.setState(materialButton.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m93634f() {
        C22788g c22788gM93630b = m93630b(false);
        C22788g c22788gM93630b2 = m93630b(true);
        if (c22788gM93630b != null) {
            float f13 = this.f125687h;
            ColorStateList colorStateList = this.f125690k;
            c22788gM93630b.m66017s(f13);
            c22788gM93630b.m66015q(colorStateList);
            if (c22788gM93630b2 != null) {
                float f14 = this.f125687h;
                int iM96969u = this.f125693n ? AbstractC31484o.m96969u(this.f125680a, R.attr.colorSurface) : 0;
                c22788gM93630b2.m66017s(f14);
                c22788gM93630b2.m66015q(ColorStateList.valueOf(iM96969u));
            }
        }
    }
}
