package p542v3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import j93.AbstractC21478l0;
import l83.C23454a0;
import p181h2.C16619d;
import p181h2.C16620e;
import p208i2.AbstractC17897m;
import p208i2.C17891j;
import p208i2.C17902o0;
import p208i2.InterfaceC17910s0;
import p270k2.C22134h;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C35589b implements LeadingMarginSpan {

    /* JADX INFO: renamed from: w */
    public final float f151351w;

    /* JADX INFO: renamed from: x */
    public final float f151352x;

    /* JADX INFO: renamed from: y */
    public final int f151353y;

    /* JADX INFO: renamed from: z */
    public final int f151354z;

    public C35589b(float f13, float f14, float f15, InterfaceC39171c interfaceC39171c, float f16) {
        this.f151351w = f13;
        this.f151352x = f14;
        int iM36258X = AbstractC12889b.m36258X(f13 + f15);
        this.f151353y = iM36258X;
        this.f151354z = AbstractC12889b.m36258X(f16) - iM36258X;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int i13, final int i14, int i15, int i16, int i17, CharSequence charSequence, int i18, int i19, boolean z4, Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f13 = (i15 + i17) / 2.0f;
        int i24 = i13 - this.f151353y;
        if (i24 < 0) {
            i24 = 0;
        }
        final int i25 = i24;
        AbstractC22676k.m65748h(charSequence, "null cannot be cast to non-null type android.text.Spanned");
        if (((Spanned) charSequence).getSpanStart(this) != i18 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        Object obj = C22134h.f85857a;
        Integer numValueOf = null;
        if (!obj.equals(obj)) {
            throw new NoWhenBranchMatchedException();
        }
        paint.setStyle(Paint.Style.FILL);
        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f151352x)) & 4294967295L) | (Float.floatToRawIntBits(this.f151351w) << 32);
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: v3.a
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i26 = i14;
                EnumC39181m enumC39181m = EnumC39181m.f168423w;
                long j7 = jFloatToRawIntBits;
                float fM47212d = C16620e.m47212d(j7) / 2.0f;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fM47212d)) << 32) | (((long) Float.floatToRawIntBits(fM47212d)) & 4294967295L);
                C16619d c16619dM60425c = AbstractC21478l0.m60425c(AbstractC17269i.m48896j(0L, j7), jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2);
                new C17902o0(c16619dM60425c);
                float f14 = i25;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                float f15 = f13;
                if (AbstractC21478l0.m60409O(c16619dM60425c)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c16619dM60425c.f63947e >> 32));
                    canvas2.drawRoundRect(f14, f15 - (c16619dM60425c.m47207a() / 2.0f), (c16619dM60425c.m47208b() * i26) + f14, (c16619dM60425c.m47207a() / 2.0f) + f15, fIntBitsToFloat, fIntBitsToFloat, paint2);
                } else {
                    C17891j c17891jM51478a = AbstractC17897m.m51478a();
                    InterfaceC17910s0.m51496b(c17891jM51478a, c16619dM60425c);
                    canvas2.save();
                    canvas2.translate(f14, f15 - (c16619dM60425c.m47207a() / 2.0f));
                    canvas2.drawPath(c17891jM51478a.f69587a, paint2);
                    canvas2.restore();
                }
                return C23454a0.f92919a;
            }
        };
        if (!Float.isNaN(Float.NaN)) {
            numValueOf = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(Float.NaN));
        }
        interfaceC4339a.invoke();
        if (numValueOf != null) {
            paint.setAlpha(numValueOf.intValue());
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z4) {
        int i13 = this.f151354z;
        if (i13 >= 0) {
            return 0;
        }
        return Math.abs(i13);
    }
}
