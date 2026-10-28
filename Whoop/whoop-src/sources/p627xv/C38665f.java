package p627xv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whoop.service.network.model.UserSessionDto;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import l83.C23471q;
import lr.RunnableC24693e;
import m83.AbstractC25265s;
import p314m.HandlerC24838f;
import p470rv.AbstractC31834n;
import p661yv.C39797b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xv.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C38665f extends View implements InterfaceC38661b {

    /* JADX INFO: renamed from: E */
    public String f166413E;

    /* JADX INFO: renamed from: F */
    public float f166414F;

    /* JADX INFO: renamed from: G */
    public float f166415G;

    /* JADX INFO: renamed from: H */
    public boolean f166416H;

    /* JADX INFO: renamed from: I */
    public final HandlerC24838f f166417I;

    /* JADX INFO: renamed from: J */
    public final DecimalFormat f166418J;

    /* JADX INFO: renamed from: K */
    public boolean f166419K;

    /* JADX INFO: renamed from: L */
    public Canvas f166420L;

    /* JADX INFO: renamed from: M */
    public C39797b f166421M;

    /* JADX INFO: renamed from: N */
    public C38667h f166422N;

    /* JADX INFO: renamed from: O */
    public float f166423O;

    /* JADX INFO: renamed from: w */
    public List f166424w;

    /* JADX INFO: renamed from: x */
    public final Paint f166425x;

    /* JADX INFO: renamed from: y */
    public final Paint f166426y;

    /* JADX INFO: renamed from: z */
    public final Paint f166427z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38665f(Context context) {
        super(context);
        AbstractC22676k.m65750j(context, "context");
        this.f166424w = AbstractC38662c.f166406a;
        Paint paint = new Paint();
        this.f166425x = paint;
        Paint paint2 = new Paint();
        this.f166426y = paint2;
        Paint paint3 = new Paint();
        this.f166427z = paint3;
        this.f166413E = " m";
        this.f166415G = 1.0f;
        this.f166418J = new DecimalFormat("0.#");
        this.f166421M = AbstractC31834n.m98893b(C38664e.f166409x);
        paint.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint3.setAntiAlias(true);
        paint3.setTextAlign(align);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        paint2.setAntiAlias(true);
        HandlerC24838f handlerC24838f = new HandlerC24838f(Looper.getMainLooper());
        handlerC24838f.f97282b = new WeakReference(this);
        if (getUseContinuousRendering()) {
            handlerC24838f.sendEmptyMessage(1);
        }
        this.f166417I = handlerC24838f;
    }

    /* JADX INFO: renamed from: b */
    public static float m123997b(float f13) {
        return ((int) (f13 * 10)) / 10.0f;
    }

    /* JADX INFO: renamed from: a */
    public final C38667h m123998a(float f13, float f14, List scaleTable, Paint textPaint, float f15, String unit, int i13) {
        Object objPrevious;
        int i14;
        int i15;
        ArrayList arrayList;
        String string;
        float f16;
        textPaint = textPaint;
        AbstractC22676k.m65750j(scaleTable, "scaleTable");
        AbstractC22676k.m65750j(textPaint, "textPaint");
        AbstractC22676k.m65750j(unit, "unit");
        ListIterator listIterator = scaleTable.listIterator(scaleTable.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((Number) ((Pair) objPrevious).first).intValue() > f13);
        Pair pair = (Pair) objPrevious;
        int i16 = 0;
        if (pair == null) {
            pair = (Pair) scaleTable.get(0);
        }
        float fIntValue = ((Number) pair.first).intValue();
        Object obj = pair.second;
        AbstractC22676k.m65749i(obj, "pair.second");
        int iIntValue = ((Number) obj).intValue();
        float fM123997b = fIntValue / iIntValue;
        while (iIntValue * fM123997b > f13 && iIntValue > 0) {
            iIntValue--;
            fIntValue = iIntValue * fM123997b;
        }
        if (iIntValue == 0) {
            fM123997b = m123997b(f13);
            fIntValue = fM123997b;
            iIntValue = 1;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        float f17 = 0.0f;
        float fM123997b2 = 0.0f;
        int i17 = 1;
        while (i17 != 0) {
            fM123997b = fIntValue / iIntValue;
            fM123997b2 = m123997b(fM123997b / f14);
            arrayList2.clear();
            arrayList3.clear();
            if (iIntValue >= 0) {
                int i18 = i16;
                while (true) {
                    float f18 = i18;
                    float f19 = fM123997b * f18;
                    if (f19 == f17) {
                        string = UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE;
                        i15 = iIntValue;
                        arrayList2 = arrayList2;
                        f17 = f17;
                    } else {
                        boolean zEquals = " m".equals(unit);
                        f17 = f17;
                        DecimalFormat decimalFormat = this.f166418J;
                        if (!zEquals) {
                            i15 = iIntValue;
                            arrayList = arrayList2;
                            if (f19 < 5280.0f) {
                                string = decimalFormat.format(Float.valueOf(f19)) + unit;
                            } else {
                                string = decimalFormat.format((((double) f19) * 1.0d) / ((double) 5280)) + " mi";
                            }
                        } else if (f19 < 1000.0f) {
                            string = decimalFormat.format(Float.valueOf(f19)) + unit;
                            i15 = iIntValue;
                            arrayList2 = arrayList2;
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            i15 = iIntValue;
                            arrayList = arrayList2;
                            sb4.append(decimalFormat.format((((double) f19) * 1.0d) / ((double) 1000)));
                            sb4.append(" km");
                            string = sb4.toString();
                        }
                        arrayList2 = arrayList;
                    }
                    arrayList2.add(i18, string);
                    String str = (String) arrayList2.get(i18);
                    float f24 = f18 * fM123997b2;
                    Paint.Align align = i18 == 0 ? Paint.Align.LEFT : Paint.Align.CENTER;
                    float fMeasureText = textPaint.measureText(str);
                    float f25 = f15 / 2.0f;
                    float f26 = f24 + f25;
                    int[] iArr = AbstractC38663d.f166408a;
                    int i19 = iArr[align.ordinal()];
                    fIntValue = fIntValue;
                    if (i19 == 1) {
                        f16 = fMeasureText;
                    } else if (i19 == 2) {
                        f16 = fMeasureText / 2;
                    } else {
                        if (i19 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f16 = f17;
                    }
                    float f27 = f26 + f16;
                    float f28 = i13;
                    if (f27 > f28) {
                        f24 -= f27 - f28;
                    }
                    float f29 = f24 - f25;
                    int i24 = iArr[align.ordinal()];
                    if (i24 == 1) {
                        fMeasureText = f17;
                    } else if (i24 == 2) {
                        fMeasureText /= 2;
                    } else if (i24 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    float f34 = f29 - fMeasureText;
                    if (f34 < f17) {
                        float f35 = f15 / 2;
                        f34 += f35;
                        f24 += f35;
                        f27 += f35;
                    }
                    arrayList3.add(i18, new C23471q(Float.valueOf(m123997b(f34)), Float.valueOf(m123997b(f27)), Float.valueOf(m123997b(f24))));
                    iIntValue = i15;
                    if (i18 == iIntValue) {
                        break;
                    }
                    i18++;
                    f17 = f17;
                    textPaint = textPaint;
                    arrayList2 = arrayList2;
                    fIntValue = fIntValue;
                }
            } else {
                fIntValue = fIntValue;
                arrayList2 = arrayList2;
                f17 = f17;
            }
            int size = arrayList3.size() - 1;
            int i25 = 0;
            while (true) {
                if (i25 < size) {
                    float fFloatValue = ((Number) ((C23471q) arrayList3.get(i25)).f92948x).floatValue();
                    i25++;
                    if (fFloatValue >= ((Number) ((C23471q) arrayList3.get(i25)).f92947w).floatValue()) {
                        if (iIntValue != 1) {
                            iIntValue--;
                            i16 = 0;
                            i17 = 1;
                            break;
                        }
                        i14 = 0;
                        arrayList2.set(0, "");
                    }
                } else {
                    i14 = 0;
                }
                i17 = i14;
                i16 = i17;
                break;
            }
        }
        List listM74093D1 = AbstractC25265s.m74093D1(arrayList2);
        List listM74093D2 = AbstractC25265s.m74093D1(arrayList3);
        C38667h c38667h = new C38667h();
        c38667h.f166435a = fM123997b;
        c38667h.f166436b = fM123997b2;
        c38667h.f166437c = iIntValue;
        c38667h.f166438d = listM74093D1;
        c38667h.f166439e = listM74093D2;
        return c38667h;
    }

    public final Paint getBarPaint$plugin_scalebar_release() {
        return this.f166426y;
    }

    public float getDistancePerPixel() {
        return this.f166423O;
    }

    public boolean getEnable() {
        return this.f166419K;
    }

    public float getMapViewWidth() {
        return this.f166414F;
    }

    public float getPixelRatio() {
        return this.f166415G;
    }

    public final List<Pair<Integer, Integer>> getScaleTable$plugin_scalebar_release() {
        return this.f166424w;
    }

    public C39797b getSettings() {
        return this.f166421M;
    }

    public final Paint getStrokePaint$plugin_scalebar_release() {
        return this.f166427z;
    }

    public final Paint getTextPaint$plugin_scalebar_release() {
        return this.f166425x;
    }

    public final String getUnit$plugin_scalebar_release() {
        return this.f166413E;
    }

    public boolean getUseContinuousRendering() {
        return this.f166416H;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x00df  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:35:0x011e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0126  */
    /* JADX WARN: Code duplicated, block: B:40:0x013b A[LOOP:0: B:25:0x00e0->B:40:0x013b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0144  */
    /* JADX WARN: Code duplicated, block: B:45:0x013e A[EDGE_INSN: B:45:0x013e->B:41:0x013e BREAK  A[LOOP:0: B:25:0x00e0->B:40:0x013b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C39797b settings;
        int i13;
        float f13;
        int i14;
        float f14;
        float f15;
        float f16;
        float f17;
        Paint paint;
        Paint paint2;
        C38667h c38667hM123998a;
        float f18;
        int i15;
        Paint paint3;
        float f19;
        int i16;
        int i17;
        String str;
        float fFloatValue;
        AbstractC22676k.m65750j(canvas, "canvas");
        if (getUseContinuousRendering()) {
            if (!this.f166419K) {
                canvas.drawARGB(0, 0, 0, 0);
                return;
            }
            if (this.f166420L == null) {
                if (getDistancePerPixel() > 0.0f) {
                    settings = getSettings();
                    float distancePerPixel = getDistancePerPixel() * getMapViewWidth();
                    float f24 = settings.f171482R;
                    i13 = settings.f171472H;
                    f13 = settings.f171474J;
                    i14 = settings.f171473I;
                    f14 = settings.f171475K;
                    f15 = settings.f171476L;
                    f16 = settings.f171478N;
                    f17 = f24 * distancePerPixel;
                    if (f17 <= 0.1f) {
                        canvas.drawARGB(0, 0, 0, 0);
                        return;
                    }
                    float distancePerPixel2 = getDistancePerPixel();
                    List list = this.f166424w;
                    paint = this.f166427z;
                    float strokeWidth = paint.getStrokeWidth();
                    String str2 = this.f166413E;
                    int width = getWidth();
                    paint2 = this.f166425x;
                    c38667hM123998a = m123998a(f17, distancePerPixel2, list, paint2, strokeWidth, str2, width);
                    f18 = c38667hM123998a.f166436b;
                    i15 = c38667hM123998a.f166437c;
                    this.f166422N = c38667hM123998a;
                    Paint.Style style = Paint.Style.FILL_AND_STROKE;
                    paint3 = this.f166426y;
                    paint3.setStyle(style);
                    paint3.setColor(i14);
                    float f25 = f18 * i15;
                    f19 = 2;
                    canvas.drawRect(0.0f, (f15 + f16) - (f13 * f19), (f13 * f19) + f25, (f13 * f19) + f15 + f16 + f14, paint3);
                    paint3.setColor(i13);
                    float f26 = settings.f171474J;
                    canvas.drawRect(f26, (f15 + f16) - f26, f25 + f26, f15 + f16 + f14 + f26, paint3);
                    paint3.setStyle(Paint.Style.FILL);
                    if (i15 >= 0) {
                        i16 = 0;
                        while (true) {
                            if (i16 % 2 == 0) {
                                i17 = i13;
                            } else {
                                i17 = i14;
                            }
                            paint3.setColor(i17);
                            str = (String) c38667hM123998a.f166438d.get(i16);
                            if (i16 == 0) {
                                Paint.Align align = Paint.Align.LEFT;
                                paint2.setTextAlign(align);
                                paint.setTextAlign(align);
                            } else {
                                Paint.Align align2 = Paint.Align.CENTER;
                                paint2.setTextAlign(align2);
                                paint.setTextAlign(align2);
                            }
                            fFloatValue = ((Number) ((C23471q) c38667hM123998a.f166439e.get(i16)).f92949y).floatValue();
                            if (getSettings().f171481Q) {
                                canvas.drawText(str, fFloatValue, f16, paint);
                            }
                            canvas.drawText(str, fFloatValue, f16, paint2);
                            if (i16 != i15) {
                                canvas.drawRect((f13 * f19) + (i16 * f18), f15 + f16, (i16 + 1) * f18, f15 + f16 + f14, paint3);
                            }
                            if (i16 != i15) {
                                break;
                                break;
                            }
                            i16++;
                        }
                    }
                    if (getUseContinuousRendering()) {
                        this.f166420L = canvas;
                    }
                }
            }
        } else if (getDistancePerPixel() > 0.0f && getMapViewWidth() > 0.0f && getWidth() > 0) {
            settings = getSettings();
            float distancePerPixel3 = getDistancePerPixel() * getMapViewWidth();
            float f27 = settings.f171482R;
            i13 = settings.f171472H;
            f13 = settings.f171474J;
            i14 = settings.f171473I;
            f14 = settings.f171475K;
            f15 = settings.f171476L;
            f16 = settings.f171478N;
            f17 = f27 * distancePerPixel3;
            if (f17 <= 0.1f) {
                canvas.drawARGB(0, 0, 0, 0);
                return;
            }
            float distancePerPixel4 = getDistancePerPixel();
            List list2 = this.f166424w;
            paint = this.f166427z;
            float strokeWidth2 = paint.getStrokeWidth();
            String str3 = this.f166413E;
            int width2 = getWidth();
            paint2 = this.f166425x;
            c38667hM123998a = m123998a(f17, distancePerPixel4, list2, paint2, strokeWidth2, str3, width2);
            f18 = c38667hM123998a.f166436b;
            i15 = c38667hM123998a.f166437c;
            this.f166422N = c38667hM123998a;
            Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
            paint3 = this.f166426y;
            paint3.setStyle(style2);
            paint3.setColor(i14);
            float f28 = f18 * i15;
            f19 = 2;
            canvas.drawRect(0.0f, (f15 + f16) - (f13 * f19), (f13 * f19) + f28, (f13 * f19) + f15 + f16 + f14, paint3);
            paint3.setColor(i13);
            float f29 = settings.f171474J;
            canvas.drawRect(f29, (f15 + f16) - f29, f28 + f29, f15 + f16 + f14 + f29, paint3);
            paint3.setStyle(Paint.Style.FILL);
            if (i15 >= 0) {
                i16 = 0;
                while (true) {
                    if (i16 % 2 == 0) {
                        i17 = i13;
                    } else {
                        i17 = i14;
                    }
                    paint3.setColor(i17);
                    str = (String) c38667hM123998a.f166438d.get(i16);
                    if (i16 == 0) {
                        Paint.Align align3 = Paint.Align.LEFT;
                        paint2.setTextAlign(align3);
                        paint.setTextAlign(align3);
                    } else {
                        Paint.Align align4 = Paint.Align.CENTER;
                        paint2.setTextAlign(align4);
                        paint.setTextAlign(align4);
                    }
                    fFloatValue = ((Number) ((C23471q) c38667hM123998a.f166439e.get(i16)).f92949y).floatValue();
                    if (getSettings().f171481Q) {
                        canvas.drawText(str, fFloatValue, f16, paint);
                    }
                    canvas.drawText(str, fFloatValue, f16, paint2);
                    if (i16 != i15) {
                        canvas.drawRect((f13 * f19) + (i16 * f18), f15 + f16, (i16 + 1) * f18, f15 + f16 + f14, paint3);
                    }
                    if (i16 != i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            if (getUseContinuousRendering()) {
                this.f166420L = canvas;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        float pixelRatio = (getPixelRatio() * 10) + (getMapViewWidth() * getSettings().f171482R);
        C39797b settings = getSettings();
        Pair pair = new Pair(Float.valueOf(pixelRatio), Float.valueOf((settings.f171474J * 2) + settings.f171476L + settings.f171478N + settings.f171475K));
        setMeasuredDimension((int) ((Number) pair.first).floatValue(), (int) ((Number) pair.second).floatValue());
    }

    public void setDistancePerPixel(float f13) {
        if (!getSettings().f171479O) {
            f13 *= 3.2808f;
        }
        if (this.f166423O == f13) {
            return;
        }
        this.f166423O = f13;
        if (getUseContinuousRendering()) {
            this.f166420L = null;
            return;
        }
        if (m123998a(getDistancePerPixel() * getMapViewWidth() * getSettings().f171482R, this.f166423O, this.f166424w, this.f166425x, this.f166427z.getStrokeWidth(), this.f166413E, getWidth()).equals(this.f166422N)) {
            return;
        }
        HandlerC24838f handlerC24838f = this.f166417I;
        if (handlerC24838f.hasMessages(0)) {
            return;
        }
        handlerC24838f.sendEmptyMessageDelayed(0, getSettings().f171480P);
    }

    public void setEnable(boolean z4) {
        this.f166419K = z4;
        if (getUseContinuousRendering()) {
            return;
        }
        setVisibility(z4 ? 0 : 8);
    }

    public void setMapViewWidth(float f13) {
        this.f166414F = f13;
        post(new RunnableC24693e(this, 26));
    }

    public void setPixelRatio(float f13) {
        this.f166415G = f13;
    }

    public final void setScaleTable$plugin_scalebar_release(List<? extends Pair<Integer, Integer>> list) {
        AbstractC22676k.m65750j(list, "<set-?>");
        this.f166424w = list;
    }

    public void setSettings(C39797b value) {
        AbstractC22676k.m65750j(value, "value");
        int i13 = value.f171471G;
        Paint paint = this.f166425x;
        paint.setColor(i13);
        float f13 = value.f171478N;
        paint.setTextSize(f13);
        Paint paint2 = this.f166427z;
        paint2.setTextSize(f13);
        boolean z4 = value.f171479O;
        this.f166424w = z4 ? AbstractC38662c.f166406a : AbstractC38662c.f166407b;
        this.f166413E = z4 ? " m" : " ft";
        paint2.setStrokeWidth(value.f171481Q ? value.f171477M : 0.0f);
        setEnable(value.f171484w);
        setUseContinuousRendering(value.f171483S);
        if (getUseContinuousRendering()) {
            this.f166420L = null;
        } else {
            HandlerC24838f handlerC24838f = this.f166417I;
            if (!handlerC24838f.hasMessages(0)) {
                handlerC24838f.sendEmptyMessageDelayed(0, value.f171480P);
            }
        }
        this.f166421M = value;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = value.f171485x;
            layoutParams2.setMargins((int) value.f171486y, (int) value.f171487z, (int) value.f171469E, (int) value.f171470F);
        }
        setMapViewWidth(getMapViewWidth());
    }

    public final void setUnit$plugin_scalebar_release(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.f166413E = str;
    }

    public void setUseContinuousRendering(boolean z4) {
        HandlerC24838f handlerC24838f = this.f166417I;
        if (z4) {
            if (!this.f166419K) {
                setVisibility(0);
            }
            handlerC24838f.removeMessages(0);
            handlerC24838f.sendEmptyMessage(1);
        } else {
            if (!this.f166419K) {
                setVisibility(8);
            }
            handlerC24838f.removeMessages(1);
            this.f166420L = null;
        }
        this.f166416H = z4;
    }
}
