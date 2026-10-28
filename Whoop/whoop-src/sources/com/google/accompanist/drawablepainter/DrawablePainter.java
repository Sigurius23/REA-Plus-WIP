package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import e93.AbstractC12889b;
import l83.C23470p;
import p005a3.C0222l0;
import p181h2.C16620e;
import p208i2.AbstractC17876d;
import p208i2.AbstractC17921y;
import p208i2.InterfaceC17915v;
import p249jc.AbstractC21598x;
import p270k2.InterfaceC22131e;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.InterfaceC28691z1;
import p636y3.EnumC39181m;
import p685zl.AbstractC40868c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m65681d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Ln2/a;", "Lp1/z1;", "drawablepainter_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class DrawablePainter extends AbstractC26165a implements InterfaceC28691z1 {

    /* JADX INFO: renamed from: E */
    public final Drawable f20359E;

    /* JADX INFO: renamed from: F */
    public final C28633k1 f20360F;

    /* JADX INFO: renamed from: G */
    public final C28633k1 f20361G;

    /* JADX INFO: renamed from: H */
    public final C23470p f20362H;

    public DrawablePainter(Drawable drawable) {
        AbstractC22676k.m65750j(drawable, "drawable");
        this.f20359E = drawable;
        this.f20360F = AbstractC28683x.m87272z(0);
        Object obj = AbstractC40868c.f176113a;
        this.f20361G = AbstractC28683x.m87272z(new C16620e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : AbstractC21598x.m60672b(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.f20362H = AbstractC30060g.m92088H(new C0222l0(this, 26));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: a */
    public final void mo15502a() {
        Drawable.Callback callback = (Drawable.Callback) this.f20362H.getValue();
        Drawable drawable = this.f20359E;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: b */
    public final void mo3489b(float f13) {
        this.f20359E.setAlpha(AbstractC12889b.m36284n(AbstractC12889b.m36258X(f13 * 255), 0, 255));
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: c */
    public final void mo15503c() {
        mo15504d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: d */
    public final void mo15504d() {
        Drawable drawable = this.f20359E;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: e */
    public final void mo3490e(AbstractC17921y abstractC17921y) {
        this.f20359E.setColorFilter(abstractC17921y != null ? abstractC17921y.f69663a : null);
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: f */
    public final void mo15560f(EnumC39181m layoutDirection) {
        int i13;
        AbstractC22676k.m65750j(layoutDirection, "layoutDirection");
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i13 = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i13 = 0;
        }
        this.f20359E.setLayoutDirection(i13);
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: h */
    public final long getF4822H() {
        return ((C16620e) this.f20361G.getValue()).f63951a;
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: i */
    public final void mo3492i(InterfaceC22131e interfaceC22131e) {
        AbstractC22676k.m65750j(interfaceC22131e, "<this>");
        InterfaceC17915v interfaceC17915vM716w = interfaceC22131e.mo744t0().m716w();
        ((Number) this.f20360F.getValue()).intValue();
        int iM36258X = AbstractC12889b.m36258X(C16620e.m47213e(interfaceC22131e.mo731d()));
        int iM36258X2 = AbstractC12889b.m36258X(C16620e.m47211c(interfaceC22131e.mo731d()));
        Drawable drawable = this.f20359E;
        drawable.setBounds(0, 0, iM36258X, iM36258X2);
        try {
            interfaceC17915vM716w.mo51426q();
            drawable.draw(AbstractC17876d.m51433a(interfaceC17915vM716w));
        } finally {
            interfaceC17915vM716w.mo51417g();
        }
    }
}
