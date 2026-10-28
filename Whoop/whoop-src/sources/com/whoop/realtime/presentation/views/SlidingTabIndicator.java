package com.whoop.realtime.presentation.views;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import k52.AbstractC22212h;
import p144fc.AbstractC14345a;
import p144fc.InterfaceC14351g;

/* JADX INFO: loaded from: classes10.dex */
public class SlidingTabIndicator extends HorizontalScrollView {

    /* JADX INFO: renamed from: E */
    private ViewPager f29138E;

    /* JADX INFO: renamed from: F */
    private SparseArray<String> f29139F;

    /* JADX INFO: renamed from: G */
    private InterfaceC14351g f29140G;

    /* JADX INFO: renamed from: H */
    private C9904a f29141H;

    /* JADX INFO: renamed from: w */
    private int f29142w;

    /* JADX INFO: renamed from: x */
    private int f29143x;

    /* JADX INFO: renamed from: y */
    private int f29144y;

    /* JADX INFO: renamed from: z */
    private boolean f29145z;

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.views.SlidingTabIndicator$a */
    public class C9898a implements InterfaceC14351g {

        /* JADX INFO: renamed from: a */
        private int f29146a;

        public /* synthetic */ C9898a(SlidingTabIndicator slidingTabIndicator, int i13) {
            this();
        }

        @Override // p144fc.InterfaceC14351g
        /* JADX INFO: renamed from: a */
        public void mo24184a(int i13, float f13, int i14) {
            int childCount = SlidingTabIndicator.this.f29141H.getChildCount();
            if (childCount == 0 || i13 < 0 || i13 >= childCount) {
                return;
            }
            SlidingTabIndicator.this.f29141H.m24215a(i13, f13);
            View childAt = SlidingTabIndicator.this.f29141H.getChildAt(i13);
            SlidingTabIndicator.this.m24181i(i13, childAt != null ? (int) (childAt.getWidth() * f13) : 0);
            if (SlidingTabIndicator.this.f29140G != null) {
                SlidingTabIndicator.this.f29140G.mo24184a(i13, f13, i14);
            }
        }

        @Override // p144fc.InterfaceC14351g
        /* JADX INFO: renamed from: b */
        public void mo24185b(int i13) {
            this.f29146a = i13;
            if (SlidingTabIndicator.this.f29140G != null) {
                SlidingTabIndicator.this.f29140G.mo24185b(i13);
            }
        }

        @Override // p144fc.InterfaceC14351g
        /* JADX INFO: renamed from: c */
        public void mo19079c(int i13) {
            if (this.f29146a == 0) {
                SlidingTabIndicator.this.f29141H.m24215a(i13, 0.0f);
                SlidingTabIndicator.this.m24181i(i13, 0);
            }
            int i14 = 0;
            while (i14 < SlidingTabIndicator.this.f29141H.getChildCount()) {
                SlidingTabIndicator.this.f29141H.getChildAt(i14).setSelected(i13 == i14);
                i14++;
            }
            if (SlidingTabIndicator.this.f29140G != null) {
                SlidingTabIndicator.this.f29140G.mo19079c(i13);
            }
        }

        private C9898a() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.views.SlidingTabIndicator$b */
    public class ViewOnClickListenerC9899b implements View.OnClickListener {
        public /* synthetic */ ViewOnClickListenerC9899b(SlidingTabIndicator slidingTabIndicator, int i13) {
            this();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (int i13 = 0; i13 < SlidingTabIndicator.this.f29141H.getChildCount(); i13++) {
                if (view == SlidingTabIndicator.this.f29141H.getChildAt(i13)) {
                    SlidingTabIndicator.this.f29138E.setCurrentItem(i13);
                    return;
                }
            }
        }

        private ViewOnClickListenerC9899b() {
        }
    }

    public SlidingTabIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: f */
    private void m24178f() {
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        this.f29142w = (int) (getResources().getDisplayMetrics().density * 24.0f);
        C9904a c9904a = new C9904a(getContext());
        this.f29141H = c9904a;
        addView(c9904a, -1, -2);
    }

    /* JADX INFO: renamed from: g */
    private void m24179g() {
        View viewM24182e;
        TextView textView;
        AbstractC14345a adapter = this.f29138E.getAdapter();
        ViewOnClickListenerC9899b viewOnClickListenerC9899b = new ViewOnClickListenerC9899b(this, 0);
        this.f29141H.removeAllViews();
        for (int i13 = 0; i13 < adapter.mo28901d(); i13++) {
            if (this.f29143x != 0) {
                viewM24182e = LayoutInflater.from(getContext()).inflate(this.f29143x, (ViewGroup) this.f29141H, false);
                textView = (TextView) viewM24182e.findViewById(this.f29144y);
            } else {
                viewM24182e = null;
                textView = null;
            }
            if (viewM24182e == null) {
                viewM24182e = m24182e(getContext());
            }
            if (textView == null && TextView.class.isInstance(viewM24182e)) {
                textView = (TextView) viewM24182e;
            }
            if (this.f29145z) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewM24182e.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            }
            textView.setText(adapter.mo40966f(i13));
            viewM24182e.setOnClickListener(viewOnClickListenerC9899b);
            String str = this.f29139F.get(i13, null);
            if (str != null) {
                viewM24182e.setContentDescription(str);
            }
            this.f29141H.addView(viewM24182e);
            if (i13 == this.f29138E.getCurrentItem()) {
                viewM24182e.setSelected(true);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private void m24180h(TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(AbstractC22212h.f86558o, 0);
        int resourceId2 = typedArray.getResourceId(AbstractC22212h.f86559p, 0);
        if (resourceId != 0) {
            m24183j(resourceId, resourceId2);
        }
        int color = typedArray.getColor(AbstractC22212h.f86557n, Integer.MAX_VALUE);
        if (color != Integer.MAX_VALUE) {
            setSelectedIndicatorColors(color);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m24181i(int i13, int i14) {
        View childAt;
        int childCount = this.f29141H.getChildCount();
        if (childCount == 0 || i13 < 0 || i13 >= childCount || (childAt = this.f29141H.getChildAt(i13)) == null) {
            return;
        }
        int left = childAt.getLeft() + i14;
        if (i13 > 0 || i14 > 0) {
            left -= this.f29142w;
        }
        scrollTo(left, 0);
    }

    /* JADX INFO: renamed from: e */
    public TextView m24182e(Context context) {
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setTextSize(2, 12.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        textView.setBackgroundResource(typedValue.resourceId);
        textView.setAllCaps(true);
        int i13 = (int) (getResources().getDisplayMetrics().density * 16.0f);
        textView.setPadding(i13, i13, i13, i13);
        return textView;
    }

    /* JADX INFO: renamed from: j */
    public void m24183j(int i13, int i14) {
        this.f29143x = i13;
        this.f29144y = i14;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPager viewPager = this.f29138E;
        if (viewPager != null) {
            m24181i(viewPager.getCurrentItem(), 0);
        }
    }

    public void setCustomTabColorizer(C9904a.b bVar) {
        this.f29141H.setCustomTabColorizer(bVar);
    }

    public void setDistributeEvenly(boolean z4) {
        this.f29145z = z4;
    }

    public void setOnPageChangeListener(InterfaceC14351g interfaceC14351g) {
        this.f29140G = interfaceC14351g;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f29141H.setSelectedIndicatorColors(iArr);
    }

    public void setViewPager(ViewPager viewPager) {
        this.f29141H.removeAllViews();
        this.f29138E = viewPager;
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(new C9898a(this, 0));
            m24179g();
        }
    }

    public SlidingTabIndicator(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f29139F = new SparseArray<>();
        m24178f();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC22212h.f86556m, i13, 0);
        m24180h(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
