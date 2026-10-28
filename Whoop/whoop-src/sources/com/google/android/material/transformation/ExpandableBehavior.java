package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;
import p413q4.AbstractC29957b;
import p468rr.ViewTreeObserverOnPreDrawListenerC31759a;
import p689zq.InterfaceC40954a;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class ExpandableBehavior extends AbstractC29957b {

    /* JADX INFO: renamed from: a */
    public int f21367a = 0;

    public ExpandableBehavior() {
    }

    /* JADX INFO: renamed from: I */
    public abstract void mo15918I(View view, View view2, boolean z4, boolean z13);

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: i */
    public abstract boolean mo15674i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: l */
    public final boolean mo15675l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (InterfaceC40954a) view2;
        boolean z4 = ((FloatingActionButton) obj).f20993O.f36245b;
        if (z4) {
            int i13 = this.f21367a;
            if (i13 != 0 && i13 != 2) {
                return false;
            }
        } else if (this.f21367a != 1) {
            return false;
        }
        this.f21367a = z4 ? 1 : 2;
        mo15918I((View) obj, view, z4, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: p */
    public final boolean mo15668p(CoordinatorLayout coordinatorLayout, View view, int i13) {
        InterfaceC40954a interfaceC40954a;
        int i14;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        if (!view.isLaidOut()) {
            ArrayList arrayListM3662k = coordinatorLayout.m3662k(view);
            int size = arrayListM3662k.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    interfaceC40954a = null;
                    break;
                }
                View view2 = (View) arrayListM3662k.get(i15);
                if (mo15674i(coordinatorLayout, view, view2)) {
                    interfaceC40954a = (InterfaceC40954a) view2;
                    break;
                }
                i15++;
            }
            if (interfaceC40954a != null) {
                boolean z4 = ((FloatingActionButton) interfaceC40954a).f20993O.f36245b;
                if (!z4 ? this.f21367a == 1 : !((i14 = this.f21367a) != 0 && i14 != 2)) {
                    int i16 = z4 ? 1 : 2;
                    this.f21367a = i16;
                    view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC31759a(this, view, i16, interfaceC40954a));
                }
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
