package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1149l;
import androidx.constraintlayout.widget.C1153p;
import com.whoop.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p171g9.C15585b;
import p184h5.AbstractC16901p0;
import p257jq.AbstractC21885a;
import p479s4.AbstractC32122c;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: loaded from: classes6.dex */
class ClockFaceView extends AbstractC5072e implements InterfaceC5071d {

    /* JADX INFO: renamed from: E */
    public final Rect f21328E;

    /* JADX INFO: renamed from: F */
    public final RectF f21329F;

    /* JADX INFO: renamed from: G */
    public final Rect f21330G;

    /* JADX INFO: renamed from: H */
    public final SparseArray f21331H;

    /* JADX INFO: renamed from: I */
    public final C5070c f21332I;

    /* JADX INFO: renamed from: J */
    public final int[] f21333J;

    /* JADX INFO: renamed from: K */
    public final float[] f21334K;

    /* JADX INFO: renamed from: L */
    public final int f21335L;

    /* JADX INFO: renamed from: M */
    public final int f21336M;

    /* JADX INFO: renamed from: N */
    public final int f21337N;

    /* JADX INFO: renamed from: O */
    public final int f21338O;

    /* JADX INFO: renamed from: P */
    public final String[] f21339P;

    /* JADX INFO: renamed from: Q */
    public float f21340Q;

    /* JADX INFO: renamed from: R */
    public final ColorStateList f21341R;

    /* JADX INFO: renamed from: z */
    public final ClockHandView f21342z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21328E = new Rect();
        this.f21329F = new RectF();
        this.f21330G = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f21331H = sparseArray;
        this.f21334K = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC21885a.f84550j, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListM65695C = AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context, 1);
        this.f21341R = colorStateListM65695C;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f21342z = clockHandView;
        this.f21335L = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM65695C.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM65695C.getDefaultColor());
        this.f21333J = new int[]{colorForState, colorForState, colorStateListM65695C.getDefaultColor()};
        clockHandView.f21354y.add(this);
        int defaultColor = AbstractC32122c.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM65695C2 = AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context, 0);
        setBackgroundColor(colorStateListM65695C2 != null ? colorStateListM65695C2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC5069b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f21332I = new C5070c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f21339P = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z4 = false;
        for (int i13 = 0; i13 < Math.max(this.f21339P.length, size); i13++) {
            TextView textView = (TextView) sparseArray.get(i13);
            if (i13 >= this.f21339P.length) {
                removeView(textView);
                sparseArray.remove(i13);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i13, textView);
                    addView(textView);
                }
                textView.setText(this.f21339P[i13]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i13));
                int i14 = (i13 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i14));
                z4 = i14 > 1 ? true : z4;
                AbstractC16901p0.m47583n(textView, this.f21332I);
                textView.setTextColor(this.f21341R);
            }
        }
        ClockHandView clockHandView2 = this.f21342z;
        if (clockHandView2.f21353x && !z4) {
            clockHandView2.f21351M = 1;
        }
        clockHandView2.f21353x = z4;
        clockHandView2.invalidate();
        this.f21336M = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f21337N = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f21338O = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.AbstractC5072e
    /* JADX INFO: renamed from: f */
    public final void mo15913f() {
        C1153p c1153p = new C1153p();
        c1153p.m3648e(this);
        HashMap map = new HashMap();
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i14 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i14 == null) {
                    i14 = 1;
                }
                if (!map.containsKey(i14)) {
                    map.put(i14, new ArrayList());
                }
                ((List) map.get(i14)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f21362x * 0.66f) : this.f21362x;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                C1149l c1149l = c1153p.m3651j(((View) it.next()).getId()).f5118d;
                c1149l.f5188z = R.id.circle_center;
                c1149l.f5122A = iRound;
                c1149l.f5123B = size;
                size += 360.0f / list.size();
            }
        }
        c1153p.m3644a(this);
        int i15 = 0;
        while (true) {
            SparseArray sparseArray = this.f21331H;
            if (i15 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i15)).setVisibility(0);
            i15++;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m15914j() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f21342z.f21345G;
        float f13 = Float.MAX_VALUE;
        TextView textView = null;
        int i13 = 0;
        while (true) {
            sparseArray = this.f21331H;
            int size = sparseArray.size();
            rect = this.f21328E;
            rectF = this.f21329F;
            if (i13 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i13);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f13) {
                    textView = textView2;
                    f13 = fHeight;
                }
            }
            i13++;
        }
        for (int i14 = 0; i14 < sparseArray.size(); i14++) {
            TextView textView3 = (TextView) sparseArray.get(i14);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.f21330G;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f21333J, this.f21334K, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C15585b.m43881c(1, this.f21339P.length, 1, false).f58535a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        m15914j();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f21338O / Math.max(Math.max(this.f21336M / displayMetrics.heightPixels, this.f21337N / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
