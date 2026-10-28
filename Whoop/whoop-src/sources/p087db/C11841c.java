package p087db;

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
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p550vd.AbstractC35902e;
import p576w8.C36931a;
import p576w8.C36932b;
import p607x8.AbstractC38046a;

/* JADX INFO: renamed from: db.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C11841c extends View implements InterfaceC11868p0 {

    /* JADX INFO: renamed from: E */
    public float f38584E;

    /* JADX INFO: renamed from: w */
    public final ArrayList f38585w;

    /* JADX INFO: renamed from: x */
    public List f38586x;

    /* JADX INFO: renamed from: y */
    public float f38587y;

    /* JADX INFO: renamed from: z */
    public C11843d f38588z;

    public C11841c(Context context, int i13) {
        super(context, null);
        this.f38585w = new ArrayList();
        this.f38586x = Collections.EMPTY_LIST;
        this.f38587y = 0.0533f;
        this.f38588z = C11843d.f38619g;
        this.f38584E = 0.08f;
    }

    @Override // p087db.InterfaceC11868p0
    /* JADX INFO: renamed from: a */
    public final void mo31783a(List list, C11843d c11843d, float f13, float f14) {
        this.f38586x = list;
        this.f38588z = c11843d;
        this.f38587y = f13;
        this.f38584E = f14;
        while (true) {
            ArrayList arrayList = this.f38585w;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new C11866o0(getContext()));
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
        C11841c c11841c = this;
        List list = c11841c.f38586x;
        if (list.isEmpty()) {
            return;
        }
        int height = c11841c.getHeight();
        int paddingLeft = c11841c.getPaddingLeft();
        int paddingTop = c11841c.getPaddingTop();
        int width = c11841c.getWidth() - c11841c.getPaddingRight();
        int paddingBottom = height - c11841c.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i18 = paddingBottom - paddingTop;
        float fM113949T = AbstractC35902e.m113949T(c11841c.f38587y, 0, height, i18);
        float f16 = 0.0f;
        if (fM113949T <= 0.0f) {
            return;
        }
        int size = list.size();
        int i19 = 0;
        while (i19 < size) {
            C36932b c36932bM118550a = (C36932b) list.get(i19);
            float f17 = f16;
            if (c36932bM118550a.f158060p != Integer.MIN_VALUE) {
                C36931a c36931aM118551a = c36932bM118550a.m118551a();
                float f18 = c36932bM118550a.f158049e;
                c36931aM118551a.f158016h = -3.4028235E38f;
                c36931aM118551a.f158017i = Integer.MIN_VALUE;
                c36931aM118551a.f158011c = null;
                if (c36932bM118550a.f158050f == 0) {
                    c36931aM118551a.f158013e = 1.0f - f18;
                    i17 = 0;
                    c36931aM118551a.f158014f = 0;
                } else {
                    i17 = 0;
                    c36931aM118551a.f158013e = (-f18) - 1.0f;
                    c36931aM118551a.f158014f = 1;
                }
                int i24 = c36932bM118550a.f158051g;
                if (i24 == 0) {
                    c36931aM118551a.f158015g = 2;
                } else if (i24 == 2) {
                    c36931aM118551a.f158015g = i17;
                }
                c36932bM118550a = c36931aM118551a.m118550a();
            }
            float fM113949T2 = AbstractC35902e.m113949T(c36932bM118550a.f158059o, c36932bM118550a.f158058n, height, i18);
            C11866o0 c11866o0 = (C11866o0) c11841c.f38585w.get(i19);
            C11843d c11843d = c11841c.f38588z;
            float f19 = c11841c.f38584E;
            TextPaint textPaint = c11866o0.f38721f;
            int i25 = height;
            Bitmap bitmap = c36932bM118550a.f158048d;
            int i26 = i18;
            float f24 = c36932bM118550a.f158055k;
            int i27 = size;
            float f25 = c36932bM118550a.f158054j;
            int i28 = i19;
            int i29 = c36932bM118550a.f158053i;
            float f26 = c36932bM118550a.f158052h;
            int i34 = c36932bM118550a.f158051g;
            float f27 = fM113949T;
            int i35 = c36932bM118550a.f158050f;
            float f28 = c36932bM118550a.f158049e;
            Layout.Alignment alignment = c36932bM118550a.f158046b;
            CharSequence charSequence = c36932bM118550a.f158045a;
            boolean z13 = bitmap == null;
            if (z13) {
                if (TextUtils.isEmpty(charSequence)) {
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                    z4 = false;
                } else {
                    f13 = f26;
                    i13 = c36932bM118550a.f158056l ? c36932bM118550a.f158057m : c11843d.f38622c;
                }
                i19 = i28 + 1;
                c11841c = this;
                f16 = f17;
                list = list;
                height = i25;
                i18 = i26;
                size = i27;
                fM113949T = f27;
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
            } else {
                f13 = f26;
                i13 = -16777216;
            }
            CharSequence charSequence2 = c11866o0.f38724i;
            if ((charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) && Objects.equals(c11866o0.f38725j, alignment) && c11866o0.f38726k == bitmap && c11866o0.f38727l == f28 && c11866o0.f38728m == i35) {
                i14 = i34;
                if (Integer.valueOf(c11866o0.f38729n).equals(Integer.valueOf(i14)) && c11866o0.f38730o == f13 && Integer.valueOf(c11866o0.f38731p).equals(Integer.valueOf(i29)) && c11866o0.f38732q == f25 && c11866o0.f38733r == f24 && c11866o0.f38734s == c11843d.f38620a && c11866o0.f38735t == c11843d.f38621b && c11866o0.f38736u == i13 && c11866o0.f38738w == c11843d.f38623d && c11866o0.f38737v == c11843d.f38624e && Objects.equals(textPaint.getTypeface(), c11843d.f38625f) && c11866o0.f38739x == f27 && c11866o0.f38740y == fM113949T2 && c11866o0.f38741z == f19 && c11866o0.f38706A == paddingLeft && c11866o0.f38707B == paddingTop && c11866o0.f38708C == width && c11866o0.f38709D == paddingBottom) {
                    c11866o0.m31840a(canvas, z13);
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                    z4 = false;
                }
                i19 = i28 + 1;
                c11841c = this;
                f16 = f17;
                list = list;
                height = i25;
                i18 = i26;
                size = i27;
                fM113949T = f27;
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
            } else {
                i14 = i34;
            }
            c11866o0.f38724i = charSequence;
            c11866o0.f38725j = alignment;
            c11866o0.f38726k = bitmap;
            c11866o0.f38727l = f28;
            c11866o0.f38728m = i35;
            c11866o0.f38729n = i14;
            c11866o0.f38730o = f13;
            c11866o0.f38731p = i29;
            c11866o0.f38732q = f25;
            c11866o0.f38733r = f24;
            c11866o0.f38734s = c11843d.f38620a;
            c11866o0.f38735t = c11843d.f38621b;
            c11866o0.f38736u = i13;
            c11866o0.f38738w = c11843d.f38623d;
            c11866o0.f38737v = c11843d.f38624e;
            textPaint.setTypeface(c11843d.f38625f);
            c11866o0.f38739x = f27;
            c11866o0.f38740y = fM113949T2;
            c11866o0.f38741z = f19;
            c11866o0.f38706A = paddingLeft;
            c11866o0.f38707B = paddingTop;
            c11866o0.f38708C = width;
            c11866o0.f38709D = paddingBottom;
            if (z13) {
                c11866o0.f38724i.getClass();
                CharSequence charSequence3 = c11866o0.f38724i;
                SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(c11866o0.f38724i);
                int i36 = c11866o0.f38708C - c11866o0.f38706A;
                int i37 = c11866o0.f38709D - c11866o0.f38707B;
                textPaint.setTextSize(c11866o0.f38739x);
                int i38 = (int) ((c11866o0.f38739x * 0.125f) + 0.5f);
                int i39 = i38 * 2;
                int i44 = i36 - i39;
                float f29 = c11866o0.f38732q;
                if (f29 != -3.4028235E38f) {
                    i44 = (int) (i44 * f29);
                }
                int i45 = i44;
                if (i45 <= 0) {
                    AbstractC38046a.m121826u("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    f27 = f27;
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                } else {
                    if (c11866o0.f38740y > f17) {
                        f27 = f27;
                        i16 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) c11866o0.f38740y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        f27 = f27;
                        i16 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (c11866o0.f38738w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i16, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i46 = 0;
                        for (int length = foregroundColorSpanArr.length; i46 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i46]);
                            i46++;
                        }
                    }
                    if (Color.alpha(c11866o0.f38735t) > 0) {
                        int i47 = c11866o0.f38738w;
                        if (i47 == 0 || i47 == 2) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(c11866o0.f38735t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(c11866o0.f38735t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment2 = c11866o0.f38725j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, r2, i45, alignment3, c11866o0.f38719d, c11866o0.f38720e, true);
                    c11866o0.f38710E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = c11866o0.f38710E.getLineCount();
                    int i48 = 0;
                    int iMax2 = 0;
                    while (i48 < lineCount) {
                        iMax2 = Math.max((int) Math.ceil(c11866o0.f38710E.getLineWidth(i48)), iMax2);
                        i48++;
                        height2 = height2;
                        lineCount = lineCount;
                        spannableStringBuilder2 = spannableStringBuilder2;
                    }
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    int i49 = height2;
                    int i54 = ((c11866o0.f38732q == -3.4028235E38f || iMax2 >= i45) ? iMax2 : i45) + i39;
                    float f34 = c11866o0.f38730o;
                    if (f34 != -3.4028235E38f) {
                        int iRound3 = Math.round(i36 * f34);
                        int i55 = c11866o0.f38706A;
                        int i56 = iRound3 + i55;
                        int i57 = c11866o0.f38731p;
                        if (i57 == 1) {
                            i56 = ((i56 * 2) - i54) / 2;
                        } else if (i57 == 2) {
                            i56 -= i54;
                        }
                        iMax = Math.max(i56, i55);
                        iMin = Math.min(iMax + i54, c11866o0.f38708C);
                    } else {
                        iMax = c11866o0.f38706A + ((i36 - i54) / 2);
                        iMin = iMax + i54;
                    }
                    int i58 = iMin - iMax;
                    if (i58 <= 0) {
                        AbstractC38046a.m121826u("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                    } else {
                        float f35 = c11866o0.f38727l;
                        if (f35 != -3.4028235E38f) {
                            if (c11866o0.f38728m == 0) {
                                iRound2 = Math.round(i37 * f35) + c11866o0.f38707B;
                                int i59 = c11866o0.f38729n;
                                if (i59 == 2) {
                                    iRound2 -= i49;
                                } else if (i59 == 1) {
                                    iRound2 = ((iRound2 * 2) - i49) / 2;
                                }
                                z4 = false;
                            } else {
                                z4 = false;
                                int lineBottom = c11866o0.f38710E.getLineBottom(0) - c11866o0.f38710E.getLineTop(0);
                                float f36 = c11866o0.f38727l;
                                iRound2 = f36 >= f17 ? Math.round(f36 * lineBottom) + c11866o0.f38707B : (Math.round((f36 + 1.0f) * lineBottom) + c11866o0.f38709D) - i49;
                            }
                            int i64 = iRound2 + i49;
                            int i65 = c11866o0.f38709D;
                            if (i64 > i65) {
                                iRound2 = i65 - i49;
                            } else {
                                int i66 = c11866o0.f38707B;
                                if (iRound2 < i66) {
                                    iRound2 = i66;
                                }
                            }
                        } else {
                            z4 = false;
                            iRound2 = (c11866o0.f38709D - i49) - ((int) (i37 * c11866o0.f38741z));
                        }
                        c11866o0.f38710E = new StaticLayout(spannableStringBuilder3, r2, i58, alignment3, c11866o0.f38719d, c11866o0.f38720e, true);
                        c11866o0.f38711F = new StaticLayout(spannableStringBuilder4, textPaint, i58, alignment3, c11866o0.f38719d, c11866o0.f38720e, true);
                        c11866o0.f38712G = iMax;
                        c11866o0.f38713H = iRound2;
                        c11866o0.f38714I = i38;
                    }
                }
                z4 = false;
            } else {
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
                z4 = false;
                c11866o0.f38726k.getClass();
                Bitmap bitmap2 = c11866o0.f38726k;
                int i67 = c11866o0.f38708C;
                int i68 = c11866o0.f38706A;
                int i69 = c11866o0.f38709D;
                int i74 = c11866o0.f38707B;
                float f37 = i67 - i68;
                float f38 = (c11866o0.f38730o * f37) + i68;
                float f39 = i69 - i74;
                float f43 = (c11866o0.f38727l * f39) + i74;
                int iRound4 = Math.round(f37 * c11866o0.f38732q);
                float f44 = c11866o0.f38733r;
                if (f44 != -3.4028235E38f) {
                    f27 = f27;
                    iRound = Math.round(f39 * f44);
                } else {
                    f27 = f27;
                    iRound = Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound4);
                }
                int i75 = c11866o0.f38731p;
                if (i75 == 2) {
                    f14 = iRound4;
                } else {
                    if (i75 == 1) {
                        f14 = iRound4 / 2;
                    }
                    int iRound5 = Math.round(f38);
                    i15 = c11866o0.f38729n;
                    if (i15 == 2) {
                        f15 = iRound;
                    } else {
                        if (i15 == 1) {
                            f15 = iRound / 2;
                        }
                        int iRound6 = Math.round(f43);
                        c11866o0.f38715J = new Rect(iRound5, iRound6, iRound4 + iRound5, iRound + iRound6);
                    }
                    f43 -= f15;
                    int iRound7 = Math.round(f43);
                    c11866o0.f38715J = new Rect(iRound5, iRound7, iRound4 + iRound5, iRound + iRound7);
                }
                f38 -= f14;
                int iRound8 = Math.round(f38);
                i15 = c11866o0.f38729n;
                if (i15 == 2) {
                    f15 = iRound;
                } else {
                    if (i15 == 1) {
                        f15 = iRound / 2;
                    }
                    int iRound9 = Math.round(f43);
                    c11866o0.f38715J = new Rect(iRound8, iRound9, iRound4 + iRound8, iRound + iRound9);
                }
                f43 -= f15;
                int iRound10 = Math.round(f43);
                c11866o0.f38715J = new Rect(iRound8, iRound10, iRound4 + iRound8, iRound + iRound10);
            }
            c11866o0.m31840a(canvas, z13);
            i19 = i28 + 1;
            c11841c = this;
            f16 = f17;
            list = list;
            height = i25;
            i18 = i26;
            size = i27;
            fM113949T = f27;
            paddingLeft = paddingLeft;
            paddingTop = paddingTop;
        }
    }
}
