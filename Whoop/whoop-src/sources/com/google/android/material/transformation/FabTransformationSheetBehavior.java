package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whoop.android.R;
import g73.C15553a;
import java.util.HashMap;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;
import p287kq.C22770e;
import p413q4.C29960e;
import pg3.C29205p;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: i */
    public HashMap f21377i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* JADX INFO: renamed from: I */
    public final void mo15918I(View view, View view2, boolean z4, boolean z13) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                this.f21377i = new HashMap(childCount);
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = coordinatorLayout.getChildAt(i13);
                boolean z14 = (childAt.getLayoutParams() instanceof C29960e) && (((C29960e) childAt.getLayoutParams()).f122364a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z14) {
                    if (z4) {
                        this.f21377i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                        childAt.setImportantForAccessibility(4);
                    } else {
                        HashMap map = this.f21377i;
                        if (map != null && map.containsKey(childAt)) {
                            int iIntValue = ((Integer) this.f21377i.get(childAt)).intValue();
                            WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                            childAt.setImportantForAccessibility(iIntValue);
                        }
                    }
                }
            }
            if (!z4) {
                this.f21377i = null;
            }
        }
        super.mo15918I(view, view2, z4, z13);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* JADX INFO: renamed from: P */
    public final C29205p mo15925P(Context context, boolean z4) {
        int i13 = z4 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        C29205p c29205p = new C29205p(4, false);
        c29205p.f118204x = C22770e.m65973b(context, i13);
        c29205p.f118205y = new C15553a(18);
        return c29205p;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
