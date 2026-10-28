package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import ar.C1916d;
import com.whoop.android.R;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;
import p211i5.C18093f;
import p287kq.AbstractC22766a;
import p558vp.AbstractC36259c;

/* JADX INFO: renamed from: com.google.android.material.textfield.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C5053l extends AbstractC5059r {

    /* JADX INFO: renamed from: e */
    public final int f21219e;

    /* JADX INFO: renamed from: f */
    public final int f21220f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f21221g;

    /* JADX INFO: renamed from: h */
    public AutoCompleteTextView f21222h;

    /* JADX INFO: renamed from: i */
    public final ViewOnClickListenerC5034a f21223i;

    /* JADX INFO: renamed from: j */
    public final ViewOnFocusChangeListenerC5036b f21224j;

    /* JADX INFO: renamed from: k */
    public final C5052k f21225k;

    /* JADX INFO: renamed from: l */
    public boolean f21226l;

    /* JADX INFO: renamed from: m */
    public boolean f21227m;

    /* JADX INFO: renamed from: n */
    public boolean f21228n;

    /* JADX INFO: renamed from: o */
    public long f21229o;

    /* JADX INFO: renamed from: p */
    public AccessibilityManager f21230p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f21231q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f21232r;

    public C5053l(C5058q c5058q) {
        super(c5058q);
        int i13 = 1;
        this.f21223i = new ViewOnClickListenerC5034a(this, i13);
        this.f21224j = new ViewOnFocusChangeListenerC5036b(this, i13);
        this.f21225k = new C5052k(this);
        this.f21229o = Long.MAX_VALUE;
        this.f21220f = AbstractC36259c.m115697k0(c5058q.getContext(), R.attr.motionDurationShort3, 67);
        this.f21219e = AbstractC36259c.m115697k0(c5058q.getContext(), R.attr.motionDurationShort3, 50);
        this.f21221g = AbstractC36259c.m115699l0(c5058q.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC22766a.f89672a);
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: a */
    public final void mo15836a() {
        if (this.f21230p.isTouchExplorationEnabled() && this.f21222h.getInputType() != 0 && !this.f21266d.hasFocus()) {
            this.f21222h.dismissDropDown();
        }
        this.f21222h.post(new RunnableC5035a0(this, 2));
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: c */
    public final int mo15837c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: d */
    public final int mo15838d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo15839e() {
        return this.f21224j;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo15840f() {
        return this.f21223i;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: h */
    public final C5052k mo15850h() {
        return this.f21225k;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: i */
    public final boolean mo15851i(int i13) {
        return i13 != 0;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: k */
    public final boolean mo15852k() {
        return this.f21228n;
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: l */
    public final void mo15842l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f21222h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C5053l c5053l = this.f21216w;
                    long j7 = jCurrentTimeMillis - c5053l.f21229o;
                    if (j7 < 0 || j7 > 300) {
                        c5053l.f21227m = false;
                    }
                    c5053l.m15856t();
                    c5053l.f21227m = true;
                    c5053l.f21229o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f21222h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C5053l c5053l = this.f21217a;
                c5053l.f21227m = true;
                c5053l.f21229o = System.currentTimeMillis();
                c5053l.m15855s(false);
            }
        });
        this.f21222h.setThreshold(0);
        TextInputLayout textInputLayout = this.f21263a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f21230p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            this.f21266d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: m */
    public final void mo15853m(C18093f c18093f) {
        AccessibilityNodeInfo accessibilityNodeInfo = c18093f.f70317a;
        if (this.f21222h.getInputType() == 0) {
            c18093f.m51953h(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: n */
    public final void mo15854n(AccessibilityEvent accessibilityEvent) {
        if (this.f21230p.isEnabled() && this.f21222h.getInputType() == 0) {
            boolean z4 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f21228n && !this.f21222h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z4) {
                m15856t();
                this.f21227m = true;
                this.f21229o = System.currentTimeMillis();
            }
        }
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: q */
    public final void mo15844q() {
        int i13 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f21221g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f21220f);
        valueAnimatorOfFloat.addUpdateListener(new C5038c(this, i13));
        this.f21232r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f21219e);
        valueAnimatorOfFloat2.addUpdateListener(new C5038c(this, i13));
        this.f21231q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C1916d(this, 3));
        this.f21230p = (AccessibilityManager) this.f21265c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.AbstractC5059r
    /* JADX INFO: renamed from: r */
    public final void mo15845r() {
        AutoCompleteTextView autoCompleteTextView = this.f21222h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f21222h.setOnDismissListener(null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m15855s(boolean z4) {
        if (this.f21228n != z4) {
            this.f21228n = z4;
            this.f21232r.cancel();
            this.f21231q.start();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m15856t() {
        if (this.f21222h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f21229o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f21227m = false;
        }
        if (this.f21227m) {
            this.f21227m = false;
            return;
        }
        m15855s(!this.f21228n);
        if (!this.f21228n) {
            this.f21222h.dismissDropDown();
        } else {
            this.f21222h.requestFocus();
            this.f21222h.showDropDown();
        }
    }
}
