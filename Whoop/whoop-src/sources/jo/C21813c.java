package jo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p108e4.AbstractC12667a;
import p309lo.AbstractC24567y;
import p621xn.C38464a;
import p621xn.C38465b;

/* JADX INFO: renamed from: jo.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C21813c extends View implements InterfaceC21837z {

    /* JADX INFO: renamed from: E */
    public float f84072E;

    /* JADX INFO: renamed from: w */
    public final ArrayList f84073w;

    /* JADX INFO: renamed from: x */
    public List f84074x;

    /* JADX INFO: renamed from: y */
    public float f84075y;

    /* JADX INFO: renamed from: z */
    public C21815d f84076z;

    public C21813c(Context context, int i13) {
        super(context, null);
        this.f84073w = new ArrayList();
        this.f84074x = Collections.EMPTY_LIST;
        this.f84075y = 0.0533f;
        this.f84076z = C21815d.f84083g;
        this.f84072E = 0.08f;
    }

    @Override // jo.InterfaceC21837z
    /* JADX INFO: renamed from: a */
    public final void mo61742a(List list, C21815d c21815d, float f13, float f14) {
        this.f84074x = list;
        this.f84076z = c21815d;
        this.f84075y = f13;
        this.f84072E = f14;
        while (true) {
            ArrayList arrayList = this.f84073w;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new C21836y(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:187:0x0464  */
    /* JADX WARN: Code duplicated, block: B:189:0x0467  */
    /* JADX WARN: Code duplicated, block: B:191:0x046a  */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f13;
        int i13;
        int i14;
        boolean z4;
        int iRound;
        float f14;
        int i15;
        float f15;
        int i16;
        int iMax;
        int iMin;
        int iRound2;
        int i17;
        C21813c c21813c = this;
        List list = c21813c.f84074x;
        if (list.isEmpty()) {
            return;
        }
        int height = c21813c.getHeight();
        int paddingLeft = c21813c.getPaddingLeft();
        int paddingTop = c21813c.getPaddingTop();
        int width = c21813c.getWidth() - c21813c.getPaddingRight();
        int paddingBottom = height - c21813c.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i18 = paddingBottom - paddingTop;
        float fM35445Q = AbstractC12667a.m35445Q(c21813c.f84075y, 0, height, i18);
        float f16 = 0.0f;
        if (fM35445Q <= 0.0f) {
            return;
        }
        int size = list.size();
        int i19 = 0;
        while (i19 < size) {
            C38465b c38465bM123258a = (C38465b) list.get(i19);
            float f17 = f16;
            if (c38465bM123258a.f164736P != Integer.MIN_VALUE) {
                C38464a c38464aM123259a = c38465bM123258a.m123259a();
                float f18 = c38465bM123258a.f164725E;
                c38464aM123259a.f164713h = -3.4028235E38f;
                c38464aM123259a.f164714i = Integer.MIN_VALUE;
                c38464aM123259a.f164708c = null;
                if (c38465bM123258a.f164726F == 0) {
                    c38464aM123259a.f164710e = 1.0f - f18;
                    i17 = 0;
                    c38464aM123259a.f164711f = 0;
                } else {
                    i17 = 0;
                    c38464aM123259a.f164710e = (-f18) - 1.0f;
                    c38464aM123259a.f164711f = 1;
                }
                int i24 = c38465bM123258a.f164727G;
                if (i24 == 0) {
                    c38464aM123259a.f164712g = 2;
                } else if (i24 == 2) {
                    c38464aM123259a.f164712g = i17;
                }
                c38465bM123258a = c38464aM123259a.m123258a();
            }
            float fM35445Q2 = AbstractC12667a.m35445Q(c38465bM123258a.f164735O, c38465bM123258a.f164734N, height, i18);
            C21836y c21836y = (C21836y) c21813c.f84073w.get(i19);
            C21815d c21815d = c21813c.f84076z;
            float f19 = c21813c.f84072E;
            TextPaint textPaint = c21836y.f84255f;
            int i25 = height;
            Bitmap bitmap = c38465bM123258a.f164741z;
            int i26 = i18;
            float f24 = c38465bM123258a.f164731K;
            int i27 = size;
            float f25 = c38465bM123258a.f164730J;
            int i28 = i19;
            int i29 = c38465bM123258a.f164729I;
            float f26 = c38465bM123258a.f164728H;
            int i34 = c38465bM123258a.f164727G;
            float f27 = fM35445Q;
            int i35 = c38465bM123258a.f164726F;
            float f28 = c38465bM123258a.f164725E;
            Layout.Alignment alignment = c38465bM123258a.f164739x;
            CharSequence charSequence = c38465bM123258a.f164738w;
            boolean z13 = bitmap == null;
            if (z13) {
                if (TextUtils.isEmpty(charSequence)) {
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                    z4 = false;
                } else {
                    f13 = f26;
                    i13 = c38465bM123258a.f164732L ? c38465bM123258a.f164733M : c21815d.f84086c;
                }
                i19 = i28 + 1;
                c21813c = this;
                f16 = f17;
                list = list;
                height = i25;
                i18 = i26;
                size = i27;
                fM35445Q = f27;
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
            } else {
                f13 = f26;
                i13 = -16777216;
            }
            CharSequence charSequence2 = c21836y.f84258i;
            if ((charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) && AbstractC24567y.m71670a(c21836y.f84259j, alignment) && c21836y.f84260k == bitmap && c21836y.f84261l == f28 && c21836y.f84262m == i35) {
                i14 = i34;
                if (Integer.valueOf(c21836y.f84263n).equals(Integer.valueOf(i14)) && c21836y.f84264o == f13 && Integer.valueOf(c21836y.f84265p).equals(Integer.valueOf(i29)) && c21836y.f84266q == f25 && c21836y.f84267r == f24 && c21836y.f84268s == c21815d.f84084a && c21836y.f84269t == c21815d.f84085b && c21836y.f84270u == i13 && c21836y.f84272w == c21815d.f84087d && c21836y.f84271v == c21815d.f84088e && AbstractC24567y.m71670a(textPaint.getTypeface(), c21815d.f84089f) && c21836y.f84273x == f27 && c21836y.f84274y == fM35445Q2 && c21836y.f84275z == f19 && c21836y.f84240A == paddingLeft && c21836y.f84241B == paddingTop && c21836y.f84242C == width && c21836y.f84243D == paddingBottom) {
                    c21836y.m61778a(canvas, z13);
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                    z4 = false;
                }
                i19 = i28 + 1;
                c21813c = this;
                f16 = f17;
                list = list;
                height = i25;
                i18 = i26;
                size = i27;
                fM35445Q = f27;
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
            } else {
                i14 = i34;
            }
            c21836y.f84258i = charSequence;
            c21836y.f84259j = alignment;
            c21836y.f84260k = bitmap;
            c21836y.f84261l = f28;
            c21836y.f84262m = i35;
            c21836y.f84263n = i14;
            c21836y.f84264o = f13;
            c21836y.f84265p = i29;
            c21836y.f84266q = f25;
            c21836y.f84267r = f24;
            c21836y.f84268s = c21815d.f84084a;
            c21836y.f84269t = c21815d.f84085b;
            c21836y.f84270u = i13;
            c21836y.f84272w = c21815d.f84087d;
            c21836y.f84271v = c21815d.f84088e;
            textPaint.setTypeface(c21815d.f84089f);
            c21836y.f84273x = f27;
            c21836y.f84274y = fM35445Q2;
            c21836y.f84275z = f19;
            c21836y.f84240A = paddingLeft;
            c21836y.f84241B = paddingTop;
            c21836y.f84242C = width;
            c21836y.f84243D = paddingBottom;
            if (z13) {
                c21836y.f84258i.getClass();
                CharSequence charSequence3 = c21836y.f84258i;
                SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(c21836y.f84258i);
                int i36 = c21836y.f84242C - c21836y.f84240A;
                int i37 = c21836y.f84243D - c21836y.f84241B;
                textPaint.setTextSize(c21836y.f84273x);
                int i38 = (int) ((c21836y.f84273x * 0.125f) + 0.5f);
                int i39 = i38 * 2;
                int i44 = i36 - i39;
                float f29 = c21836y.f84266q;
                if (f29 != -3.4028235E38f) {
                    i44 = (int) (i44 * f29);
                }
                int i45 = i44;
                if (i45 <= 0) {
                    Log.w("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    f27 = f27;
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                } else {
                    if (c21836y.f84274y > f17) {
                        f27 = f27;
                        i16 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) c21836y.f84274y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        f27 = f27;
                        i16 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (c21836y.f84272w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i16, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i46 = 0;
                        for (int length = foregroundColorSpanArr.length; i46 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i46]);
                            i46++;
                        }
                    }
                    if (Color.alpha(c21836y.f84269t) > 0) {
                        int i47 = c21836y.f84272w;
                        if (i47 == 0 || i47 == 2) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(c21836y.f84269t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(c21836y.f84269t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment2 = c21836y.f84259j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, r2, i45, alignment3, c21836y.f84253d, c21836y.f84254e, true);
                    c21836y.f84244E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = c21836y.f84244E.getLineCount();
                    int i48 = 0;
                    int iMax2 = 0;
                    while (i48 < lineCount) {
                        iMax2 = Math.max((int) Math.ceil(c21836y.f84244E.getLineWidth(i48)), iMax2);
                        i48++;
                        height2 = height2;
                        lineCount = lineCount;
                        spannableStringBuilder2 = spannableStringBuilder2;
                    }
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    int i49 = height2;
                    int i54 = ((c21836y.f84266q == -3.4028235E38f || iMax2 >= i45) ? iMax2 : i45) + i39;
                    float f34 = c21836y.f84264o;
                    if (f34 != -3.4028235E38f) {
                        int iRound3 = Math.round(i36 * f34);
                        int i55 = c21836y.f84240A;
                        int i56 = iRound3 + i55;
                        int i57 = c21836y.f84265p;
                        if (i57 == 1) {
                            i56 = ((i56 * 2) - i54) / 2;
                        } else if (i57 == 2) {
                            i56 -= i54;
                        }
                        iMax = Math.max(i56, i55);
                        iMin = Math.min(iMax + i54, c21836y.f84242C);
                    } else {
                        iMax = c21836y.f84240A + ((i36 - i54) / 2);
                        iMin = iMax + i54;
                    }
                    int i58 = iMin - iMax;
                    if (i58 <= 0) {
                        Log.w("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                    } else {
                        float f35 = c21836y.f84261l;
                        if (f35 != -3.4028235E38f) {
                            if (c21836y.f84262m == 0) {
                                iRound2 = Math.round(i37 * f35) + c21836y.f84241B;
                                int i59 = c21836y.f84263n;
                                if (i59 == 2) {
                                    iRound2 -= i49;
                                } else if (i59 == 1) {
                                    iRound2 = ((iRound2 * 2) - i49) / 2;
                                }
                                z4 = false;
                            } else {
                                z4 = false;
                                int lineBottom = c21836y.f84244E.getLineBottom(0) - c21836y.f84244E.getLineTop(0);
                                float f36 = c21836y.f84261l;
                                iRound2 = f36 >= f17 ? Math.round(f36 * lineBottom) + c21836y.f84241B : (Math.round((f36 + 1.0f) * lineBottom) + c21836y.f84243D) - i49;
                            }
                            int i64 = iRound2 + i49;
                            int i65 = c21836y.f84243D;
                            if (i64 > i65) {
                                iRound2 = i65 - i49;
                            } else {
                                int i66 = c21836y.f84241B;
                                if (iRound2 < i66) {
                                    iRound2 = i66;
                                }
                            }
                        } else {
                            z4 = false;
                            iRound2 = (c21836y.f84243D - i49) - ((int) (i37 * c21836y.f84275z));
                        }
                        c21836y.f84244E = new StaticLayout(spannableStringBuilder3, r2, i58, alignment3, c21836y.f84253d, c21836y.f84254e, true);
                        c21836y.f84245F = new StaticLayout(spannableStringBuilder4, textPaint, i58, alignment3, c21836y.f84253d, c21836y.f84254e, true);
                        c21836y.f84246G = iMax;
                        c21836y.f84247H = iRound2;
                        c21836y.f84248I = i38;
                    }
                }
                z4 = false;
            } else {
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
                z4 = false;
                c21836y.f84260k.getClass();
                Bitmap bitmap2 = c21836y.f84260k;
                int i67 = c21836y.f84242C;
                int i68 = c21836y.f84240A;
                int i69 = c21836y.f84243D;
                int i74 = c21836y.f84241B;
                float f37 = i67 - i68;
                float f38 = (c21836y.f84264o * f37) + i68;
                float f39 = i69 - i74;
                float f43 = (c21836y.f84261l * f39) + i74;
                int iRound4 = Math.round(f37 * c21836y.f84266q);
                float f44 = c21836y.f84267r;
                if (f44 != -3.4028235E38f) {
                    f27 = f27;
                    iRound = Math.round(f39 * f44);
                } else {
                    f27 = f27;
                    iRound = Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound4);
                }
                int i75 = c21836y.f84265p;
                if (i75 == 2) {
                    f14 = iRound4;
                } else {
                    if (i75 == 1) {
                        f14 = iRound4 / 2;
                    }
                    int iRound5 = Math.round(f38);
                    i15 = c21836y.f84263n;
                    if (i15 == 2) {
                        f15 = iRound;
                    } else {
                        if (i15 == 1) {
                            f15 = iRound / 2;
                        }
                        int iRound6 = Math.round(f43);
                        c21836y.f84249J = new Rect(iRound5, iRound6, iRound4 + iRound5, iRound + iRound6);
                    }
                    f43 -= f15;
                    int iRound7 = Math.round(f43);
                    c21836y.f84249J = new Rect(iRound5, iRound7, iRound4 + iRound5, iRound + iRound7);
                }
                f38 -= f14;
                int iRound8 = Math.round(f38);
                i15 = c21836y.f84263n;
                if (i15 == 2) {
                    f15 = iRound;
                } else {
                    if (i15 == 1) {
                        f15 = iRound / 2;
                    }
                    int iRound9 = Math.round(f43);
                    c21836y.f84249J = new Rect(iRound8, iRound9, iRound4 + iRound8, iRound + iRound9);
                }
                f43 -= f15;
                int iRound10 = Math.round(f43);
                c21836y.f84249J = new Rect(iRound8, iRound10, iRound4 + iRound8, iRound + iRound10);
            }
            c21836y.m61778a(canvas, z13);
            i19 = i28 + 1;
            c21813c = this;
            f16 = f17;
            list = list;
            height = i25;
            i18 = i26;
            size = i27;
            fM35445Q = f27;
            paddingLeft = paddingLeft;
            paddingTop = paddingTop;
        }
    }
}
