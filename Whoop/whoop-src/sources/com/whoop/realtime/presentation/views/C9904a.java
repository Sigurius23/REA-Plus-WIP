package com.whoop.realtime.presentation.views;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import in2.C18731c;

/* JADX INFO: renamed from: com.whoop.realtime.presentation.views.a */
/* JADX INFO: loaded from: classes10.dex */
public class C9904a extends LinearLayout {

    /* JADX INFO: renamed from: E */
    private final int f29210E;

    /* JADX INFO: renamed from: F */
    private int f29211F;

    /* JADX INFO: renamed from: G */
    private float f29212G;

    /* JADX INFO: renamed from: H */
    private b f29213H;

    /* JADX INFO: renamed from: I */
    private final a f29214I;

    /* JADX INFO: renamed from: w */
    private final int f29215w;

    /* JADX INFO: renamed from: x */
    private final Paint f29216x;

    /* JADX INFO: renamed from: y */
    private final int f29217y;

    /* JADX INFO: renamed from: z */
    private final Paint f29218z;

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.views.a$a */
    public static class a implements b {

        /* JADX INFO: renamed from: a */
        private int[] f29219a;

        public /* synthetic */ a(int i13) {
            this();
        }

        @Override // com.whoop.realtime.presentation.views.C9904a.b
        /* JADX INFO: renamed from: a */
        public final int mo24216a(int i13) {
            int[] iArr = this.f29219a;
            return iArr[i13 % iArr.length];
        }

        /* JADX INFO: renamed from: b */
        public void m24217b(int... iArr) {
            this.f29219a = iArr;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.views.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        int mo24216a(int i13);
    }

    public C9904a(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: b */
    private static int m24214b(int i13, byte b6) {
        return Color.argb((int) b6, Color.red(i13), Color.green(i13), Color.blue(i13));
    }

    /* JADX INFO: renamed from: a */
    public void m24215a(int i13, float f13) {
        this.f29211F = i13;
        this.f29212G = f13;
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        View childAt;
        int height = getHeight();
        int childCount = getChildCount();
        b bVar = this.f29213H;
        if (bVar == null) {
            bVar = this.f29214I;
        }
        if (childCount > 0 && (childAt = getChildAt(this.f29211F)) != null) {
            int left = childAt.getLeft();
            int right = childAt.getRight();
            int iMo24216a = bVar.mo24216a(this.f29211F);
            if (this.f29212G > 0.0f && this.f29211F < getChildCount() - 1) {
                int iMo24216a2 = bVar.mo24216a(this.f29211F + 1);
                if (iMo24216a != iMo24216a2) {
                    iMo24216a = C18731c.m54471a(iMo24216a, iMo24216a2, this.f29212G);
                }
                View childAt2 = getChildAt(this.f29211F + 1);
                float left2 = this.f29212G * childAt2.getLeft();
                float f13 = this.f29212G;
                left = (int) (((1.0f - f13) * left) + left2);
                right = (int) (((1.0f - this.f29212G) * right) + (f13 * childAt2.getRight()));
            }
            this.f29218z.setColor(iMo24216a);
            canvas.drawRect(left, height - this.f29217y, right, height, this.f29218z);
        }
        canvas.drawRect(0.0f, height - this.f29215w, getWidth(), height, this.f29216x);
    }

    public void setCustomTabColorizer(b bVar) {
        this.f29213H = bVar;
        invalidate();
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f29213H = null;
        this.f29214I.m24217b(iArr);
        invalidate();
    }

    public C9904a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        float f13 = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorForeground, typedValue, true);
        int iM24214b = m24214b(typedValue.data, (byte) 38);
        this.f29210E = iM24214b;
        a aVar = new a(0);
        this.f29214I = aVar;
        aVar.m24217b(-13388315);
        this.f29215w = (int) (0.0f * f13);
        Paint paint = new Paint();
        this.f29216x = paint;
        paint.setColor(iM24214b);
        this.f29217y = (int) (f13 * 3.0f);
        this.f29218z = new Paint();
    }
}
