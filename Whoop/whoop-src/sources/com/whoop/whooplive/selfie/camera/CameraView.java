package com.whoop.whooplive.selfie.camera;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bh3.InterfaceC3255b;
import mh3.C25566c;
import o52.C27566m0;
import pz2.AbstractC29652e;
import pz2.AbstractC29654g;
import uz2.EnumC35444a;
import vz2.AbstractC36615a;
import vz2.C36619e;
import vz2.C36620f;
import vz2.EnumC36621g;
import xg3.C38280g;

/* JADX INFO: loaded from: classes11.dex */
public class CameraView extends FrameLayout {

    /* JADX INFO: renamed from: E */
    private boolean f33589E;

    /* JADX INFO: renamed from: F */
    private C25566c f33590F;

    /* JADX INFO: renamed from: G */
    private InterfaceC3255b f33591G;

    /* JADX INFO: renamed from: w */
    private C36619e f33592w;

    /* JADX INFO: renamed from: x */
    private TextureViewPreview f33593x;

    /* JADX INFO: renamed from: y */
    private TextView f33594y;

    /* JADX INFO: renamed from: z */
    private boolean f33595z;

    /* JADX INFO: renamed from: com.whoop.whooplive.selfie.camera.CameraView$a */
    public class C10884a implements InterfaceC3255b {
        public C10884a() {
        }

        @Override // bh3.InterfaceC3255b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo9472b(Throwable th3) {
            CameraView.this.f33593x.setVisibility(8);
            CameraView.this.f33594y.setVisibility(0);
            if (th3 instanceof CameraAccessException) {
                CameraView.this.f33594y.setText(AbstractC29654g.f121197m);
            } else {
                CameraView.this.f33594y.setText(AbstractC29654g.f121194j);
            }
        }
    }

    public CameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m28905e(Boolean bool) {
        if (!this.f33595z || this.f33592w.m117670D()) {
            return;
        }
        this.f33595z = false;
        requestLayout();
    }

    /* JADX INFO: renamed from: d */
    public boolean m28906d() {
        return this.f33592w.m117671E();
    }

    /* JADX INFO: renamed from: f */
    public C38280g<C36620f> m28907f() {
        return this.f33592w.m117674N();
    }

    /* JADX INFO: renamed from: g */
    public C38280g<EnumC36621g> m28908g() {
        return this.f33592w.m117675O();
    }

    public int getCameraToUse() {
        return this.f33592w.m117669B();
    }

    public TextureView getPreview() {
        return this.f33593x;
    }

    /* JADX INFO: renamed from: h */
    public C38280g<byte[]> m28909h() {
        return this.f33592w.m117676P();
    }

    /* JADX INFO: renamed from: i */
    public void m28910i() {
        this.f33592w.m117682b0();
    }

    /* JADX INFO: renamed from: j */
    public void m28911j() {
        this.f33592w.m117678U();
        this.f33592w.m117680X();
        this.f33592w.m117684u();
        if (this.f33589E) {
            this.f33589E = false;
            this.f33592w.m117672L();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m28912k() {
        this.f33592w.m117681a0();
    }

    /* JADX INFO: renamed from: l */
    public void m28913l() {
        this.f33592w.m117683c0();
    }

    /* JADX INFO: renamed from: m */
    public void m28914m(C38280g<EnumC35444a> c38280g, C38280g<Integer> c38280g2) {
        C36619e c36619e = new C36619e(this.f33593x, getContext(), c38280g, c38280g2);
        this.f33592w = c36619e;
        this.f33590F.m75179c(c36619e.m117673M().m122662L(new C27566m0(this, 28), this.f33591G));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33592w.m117677R();
        this.f33590F.m75180d();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (isInEditMode()) {
            return;
        }
        this.f33593x = (TextureViewPreview) findViewById(AbstractC29652e.f121109G);
        this.f33594y = (TextView) findViewById(AbstractC29652e.f121145i);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i13, int i14) {
        if (isInEditMode()) {
            super.onMeasure(i13, i14);
            return;
        }
        if (!this.f33592w.m117670D()) {
            this.f33595z = true;
            super.onMeasure(i13, i14);
            return;
        }
        super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(AbstractC36615a.m117626a(View.MeasureSpec.getSize(i13)), 1073741824));
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iM117626a = AbstractC36615a.m117626a(measuredWidth);
        if (measuredHeight < iM117626a) {
            this.f33593x.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(iM117626a, 1073741824));
        } else {
            this.f33593x.measure(View.MeasureSpec.makeMeasureSpec(AbstractC36615a.m117627b(measuredHeight), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    public void setFlashMode(EnumC36621g enumC36621g) {
        this.f33592w.m117679W(enumC36621g);
    }

    public void setRecreateRenderer(boolean z4) {
        this.f33589E = z4;
    }

    public CameraView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f33590F = new C25566c();
        this.f33591G = new C10884a();
    }
}
