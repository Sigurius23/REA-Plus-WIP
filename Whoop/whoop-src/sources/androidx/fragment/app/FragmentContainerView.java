package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.squareup.wire.AbstractC5583n;
import com.whoop.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import p088dc.AbstractC11895b;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p297l6.AbstractC23373a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0013J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Ll83/a0;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/m0;", "F", "getFragment", "()Landroidx/fragment/app/m0;", "com/squareup/wire/n", "fragment_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: w */
    public final ArrayList f5514w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f5515x;

    /* JADX INFO: renamed from: y */
    public View.OnApplyWindowInsetsListener f5516y;

    /* JADX INFO: renamed from: z */
    public boolean f5517z;

    public FragmentContainerView(Context context) {
        super(context);
        this.f5514w = new ArrayList();
        this.f5515x = new ArrayList();
        this.f5517z = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m4029a(View view) {
        if (this.f5515x.contains(view)) {
            this.f5514w.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i13, ViewGroup.LayoutParams layoutParams) {
        AbstractC22676k.m65750j(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC1320m0 ? (AbstractComponentCallbacksC1320m0) tag : null) != null) {
            super.addView(child, i13, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        AbstractC22676k.m65750j(insets, "insets");
        C16905q1 c16905q1M47596h = C16905q1.m47596h(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f5516y;
        C16905q1 c16905q1M47596h2 = onApplyWindowInsetsListener != null ? C16905q1.m47596h(null, AbstractC5583n.m16760T(onApplyWindowInsetsListener, this, insets)) : AbstractC16901p0.m47578i(this, c16905q1M47596h);
        AbstractC22676k.m65749i(c16905q1M47596h2, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!c16905q1M47596h2.f64864a.mo47545o()) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                AbstractC16901p0.m47571b(getChildAt(i13), c16905q1M47596h2);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        if (this.f5517z) {
            Iterator it = this.f5514w.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j7) {
        AbstractC22676k.m65750j(canvas, "canvas");
        AbstractC22676k.m65750j(child, "child");
        if (this.f5517z) {
            ArrayList arrayList = this.f5514w;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j7);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC22676k.m65750j(view, "view");
        this.f5515x.remove(view);
        if (this.f5514w.remove(view)) {
            this.f5517z = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC1320m0> F getFragment() {
        AbstractActivityC1340r0 abstractActivityC1340r0;
        AbstractC1329o1 supportFragmentManager;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4130F = AbstractC1329o1.m4130F(this);
        if (abstractComponentCallbacksC1320m0M4130F == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    abstractActivityC1340r0 = null;
                    break;
                }
                if (context instanceof AbstractActivityC1340r0) {
                    abstractActivityC1340r0 = (AbstractActivityC1340r0) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC1340r0 == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = abstractActivityC1340r0.getSupportFragmentManager();
        } else {
            if (!abstractComponentCallbacksC1320m0M4130F.isAdded()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC1320m0M4130F + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = abstractComponentCallbacksC1320m0M4130F.getChildFragmentManager();
        }
        return (F) supportFragmentManager.m4139D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        AbstractC22676k.m65750j(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                AbstractC22676k.m65749i(view, "view");
                m4029a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC22676k.m65750j(view, "view");
        m4029a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i13) {
        View view = getChildAt(i13);
        AbstractC22676k.m65749i(view, "view");
        m4029a(view);
        super.removeViewAt(i13);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC22676k.m65750j(view, "view");
        m4029a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i13, int i14) {
        int i15 = i13 + i14;
        for (int i16 = i13; i16 < i15; i16++) {
            View view = getChildAt(i16);
            AbstractC22676k.m65749i(view, "view");
            m4029a(view);
        }
        super.removeViews(i13, i14);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i13, int i14) {
        int i15 = i13 + i14;
        for (int i16 = i13; i16 < i15; i16++) {
            View view = getChildAt(i16);
            AbstractC22676k.m65749i(view, "view");
            m4029a(view);
        }
        super.removeViewsInLayout(i13, i14);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f5517z = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        this.f5516y = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC22676k.m65750j(view, "view");
        if (view.getParent() == this) {
            this.f5515x.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
        this.f5514w = new ArrayList();
        this.f5515x = new ArrayList();
        this.f5517z = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC23373a.f92655b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, AbstractC1329o1 abstractC1329o1) {
        View view;
        super(context, attrs);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(attrs, "attrs");
        this.f5514w = new ArrayList();
        this.f5515x = new ArrayList();
        this.f5517z = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, AbstractC23373a.f92655b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id4 = getId();
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4139D = abstractC1329o1.m4139D(id4);
        if (classAttribute != null && abstractComponentCallbacksC1320m0M4139D == null) {
            if (id4 == -1) {
                throw new IllegalStateException(AbstractC11895b.m31996o("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0Mo4083a = abstractC1329o1.m4143J().mo4083a(context.getClassLoader(), classAttribute);
            AbstractC22676k.m65749i(abstractComponentCallbacksC1320m0Mo4083a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            abstractComponentCallbacksC1320m0Mo4083a.mFragmentId = id4;
            abstractComponentCallbacksC1320m0Mo4083a.mContainerId = id4;
            abstractComponentCallbacksC1320m0Mo4083a.mTag = string;
            abstractComponentCallbacksC1320m0Mo4083a.mFragmentManager = abstractC1329o1;
            abstractComponentCallbacksC1320m0Mo4083a.mHost = abstractC1329o1.f5738x;
            abstractComponentCallbacksC1320m0Mo4083a.onInflate(context, attrs, (Bundle) null);
            C1271a c1271a = new C1271a(abstractC1329o1);
            c1271a.f5578r = true;
            abstractComponentCallbacksC1320m0Mo4083a.mContainer = this;
            abstractComponentCallbacksC1320m0Mo4083a.mInDynamicContainer = true;
            c1271a.mo4042d(getId(), abstractComponentCallbacksC1320m0Mo4083a, string, 1);
            if (!c1271a.f5569i) {
                c1271a.f5570j = false;
                c1271a.f5518t.m4136A(c1271a, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        for (C1366z1 c1366z1 : abstractC1329o1.f5717c.m4057d()) {
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1366z1.f5852c;
            if (abstractComponentCallbacksC1320m0.mContainerId == getId() && (view = abstractComponentCallbacksC1320m0.mView) != null && view.getParent() == null) {
                abstractComponentCallbacksC1320m0.mContainer = this;
                c1366z1.m4247b();
                c1366z1.m4256k();
            }
        }
    }
}
