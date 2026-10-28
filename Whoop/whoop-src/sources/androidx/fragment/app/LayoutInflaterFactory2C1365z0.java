package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p088dc.AbstractC11895b;
import p297l6.AbstractC23373a;
import p321m6.AbstractC25106b;

/* JADX INFO: renamed from: androidx.fragment.app.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C1365z0 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: w */
    public final AbstractC1329o1 f5849w;

    public LayoutInflaterFactory2C1365z0(AbstractC1329o1 abstractC1329o1) {
        this.f5849w = abstractC1329o1;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C1366z1 c1366z1M4169g;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        AbstractC1329o1 abstractC1329o1 = this.f5849w;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, abstractC1329o1);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC23373a.f92654a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC1320m0.class.isAssignableFrom(AbstractC1356w0.m4242b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id4 = view != null ? view.getId() : 0;
                    if (id4 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4139D = resourceId != -1 ? abstractC1329o1.m4139D(resourceId) : null;
                    if (abstractComponentCallbacksC1320m0M4139D == null && string != null) {
                        abstractComponentCallbacksC1320m0M4139D = abstractC1329o1.m4140E(string);
                    }
                    if (abstractComponentCallbacksC1320m0M4139D == null && id4 != -1) {
                        abstractComponentCallbacksC1320m0M4139D = abstractC1329o1.m4139D(id4);
                    }
                    if (abstractComponentCallbacksC1320m0M4139D == null) {
                        abstractComponentCallbacksC1320m0M4139D = abstractC1329o1.m4143J().mo4083a(context.getClassLoader(), attributeValue);
                        abstractComponentCallbacksC1320m0M4139D.mFromLayout = true;
                        abstractComponentCallbacksC1320m0M4139D.mFragmentId = resourceId != 0 ? resourceId : id4;
                        abstractComponentCallbacksC1320m0M4139D.mContainerId = id4;
                        abstractComponentCallbacksC1320m0M4139D.mTag = string;
                        abstractComponentCallbacksC1320m0M4139D.mInLayout = true;
                        abstractComponentCallbacksC1320m0M4139D.mFragmentManager = abstractC1329o1;
                        AbstractC1359x0 abstractC1359x0 = abstractC1329o1.f5738x;
                        abstractComponentCallbacksC1320m0M4139D.mHost = abstractC1359x0;
                        abstractComponentCallbacksC1320m0M4139D.onInflate((Context) abstractC1359x0.f5827x, attributeSet, abstractComponentCallbacksC1320m0M4139D.mSavedFragmentState);
                        c1366z1M4169g = abstractC1329o1.m4157a(abstractComponentCallbacksC1320m0M4139D);
                        if (AbstractC1329o1.m4132M(2)) {
                            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC1320m0M4139D + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (abstractComponentCallbacksC1320m0M4139D.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id4) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC1320m0M4139D.mInLayout = true;
                        abstractComponentCallbacksC1320m0M4139D.mFragmentManager = abstractC1329o1;
                        AbstractC1359x0 abstractC1359x1 = abstractC1329o1.f5738x;
                        abstractComponentCallbacksC1320m0M4139D.mHost = abstractC1359x1;
                        abstractComponentCallbacksC1320m0M4139D.onInflate((Context) abstractC1359x1.f5827x, attributeSet, abstractComponentCallbacksC1320m0M4139D.mSavedFragmentState);
                        c1366z1M4169g = abstractC1329o1.m4169g(abstractComponentCallbacksC1320m0M4139D);
                        if (AbstractC1329o1.m4132M(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC1320m0M4139D + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    AbstractC25106b.m73601d(abstractComponentCallbacksC1320m0M4139D, viewGroup);
                    abstractComponentCallbacksC1320m0M4139D.mContainer = viewGroup;
                    c1366z1M4169g.m4256k();
                    c1366z1M4169g.m4255j();
                    View view2 = abstractComponentCallbacksC1320m0M4139D.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(AbstractC11895b.m31996o("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC1320m0M4139D.mView.getTag() == null) {
                        abstractComponentCallbacksC1320m0M4139D.mView.setTag(string);
                    }
                    abstractComponentCallbacksC1320m0M4139D.mView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1362y0(this, c1366z1M4169g));
                    return abstractComponentCallbacksC1320m0M4139D.mView;
                }
            }
        }
        return null;
    }
}
