package kr;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p657yq.C39707a;

/* JADX INFO: renamed from: kr.f */
/* JADX INFO: loaded from: classes6.dex */
public class C22787f extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public C22792k f89710a;

    /* JADX INFO: renamed from: b */
    public C39707a f89711b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f89712c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f89713d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f89714e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f89715f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f89716g;

    /* JADX INFO: renamed from: h */
    public Rect f89717h;

    /* JADX INFO: renamed from: i */
    public final float f89718i;

    /* JADX INFO: renamed from: j */
    public float f89719j;

    /* JADX INFO: renamed from: k */
    public float f89720k;

    /* JADX INFO: renamed from: l */
    public int f89721l;

    /* JADX INFO: renamed from: m */
    public float f89722m;

    /* JADX INFO: renamed from: n */
    public float f89723n;

    /* JADX INFO: renamed from: o */
    public int f89724o;

    /* JADX INFO: renamed from: p */
    public int f89725p;

    /* JADX INFO: renamed from: q */
    public final int f89726q;

    /* JADX INFO: renamed from: r */
    public Paint.Style f89727r;

    public C22787f(C22792k c22792k) {
        this.f89712c = null;
        this.f89713d = null;
        this.f89714e = null;
        this.f89715f = null;
        this.f89716g = PorterDuff.Mode.SRC_IN;
        this.f89717h = null;
        this.f89718i = 1.0f;
        this.f89719j = 1.0f;
        this.f89721l = 255;
        this.f89722m = 0.0f;
        this.f89723n = 0.0f;
        this.f89724o = 0;
        this.f89725p = 0;
        this.f89726q = 0;
        this.f89727r = Paint.Style.FILL_AND_STROKE;
        this.f89710a = c22792k;
        this.f89711b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C22788g c22788g = new C22788g(this);
        c22788g.f89729E = true;
        return c22788g;
    }

    public C22787f(C22787f c22787f) {
        this.f89712c = null;
        this.f89713d = null;
        this.f89714e = null;
        this.f89715f = null;
        this.f89716g = PorterDuff.Mode.SRC_IN;
        this.f89717h = null;
        this.f89718i = 1.0f;
        this.f89719j = 1.0f;
        this.f89721l = 255;
        this.f89722m = 0.0f;
        this.f89723n = 0.0f;
        this.f89724o = 0;
        this.f89725p = 0;
        this.f89726q = 0;
        this.f89727r = Paint.Style.FILL_AND_STROKE;
        this.f89710a = c22787f.f89710a;
        this.f89711b = c22787f.f89711b;
        this.f89720k = c22787f.f89720k;
        this.f89712c = c22787f.f89712c;
        this.f89713d = c22787f.f89713d;
        this.f89716g = c22787f.f89716g;
        this.f89715f = c22787f.f89715f;
        this.f89721l = c22787f.f89721l;
        this.f89718i = c22787f.f89718i;
        this.f89725p = c22787f.f89725p;
        this.f89719j = c22787f.f89719j;
        this.f89722m = c22787f.f89722m;
        this.f89723n = c22787f.f89723n;
        this.f89724o = c22787f.f89724o;
        this.f89726q = c22787f.f89726q;
        this.f89714e = c22787f.f89714e;
        this.f89727r = c22787f.f89727r;
        if (c22787f.f89717h != null) {
            this.f89717h = new Rect(c22787f.f89717h);
        }
    }
}
