package p542v3;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import p208i2.C17893k;
import p208i2.InterfaceC17912t0;
import p270k2.AbstractC22132f;
import p270k2.C22134h;
import p270k2.C22135i;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C35590c extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: w */
    public final AbstractC22132f f151355w;

    public C35590c(AbstractC22132f abstractC22132f) {
        this.f151355w = abstractC22132f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            C22134h c22134h = C22134h.f85857a;
            AbstractC22132f abstractC22132f = this.f151355w;
            if (AbstractC22676k.m65745e(abstractC22132f, c22134h)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(abstractC22132f instanceof C22135i)) {
                throw new NoWhenBranchMatchedException();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            C22135i c22135i = (C22135i) abstractC22132f;
            textPaint.setStrokeWidth(c22135i.f85858a);
            textPaint.setStrokeMiter(c22135i.f85859b);
            int i13 = c22135i.f85861d;
            if (i13 == 0) {
                join = Paint.Join.MITER;
            } else if (i13 == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i13 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i14 = c22135i.f85860c;
            if (i14 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i14 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i14 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            InterfaceC17912t0 interfaceC17912t0 = c22135i.f85862e;
            textPaint.setPathEffect(interfaceC17912t0 != null ? ((C17893k) interfaceC17912t0).f69591a : null);
        }
    }
}
