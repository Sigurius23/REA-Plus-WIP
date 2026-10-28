package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.whoop.android.R;
import mr.AbstractC25906l;
import mr.C25908n;
import p014aj.C0929d;
import p184h5.C16858b;
import p211i5.C18093f;

/* JADX INFO: renamed from: com.google.android.material.datepicker.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C5016j extends C16858b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f20912d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f20913e;

    public /* synthetic */ C5016j(Object obj, int i13) {
        this.f20912d = i13;
        this.f20913e = obj;
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: c */
    public void mo5303c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f20912d) {
            case 1:
                super.mo5303c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f20913e).f21004z);
                break;
            default:
                super.mo5303c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: d */
    public final void mo5304d(View view, C18093f c18093f) {
        int i13 = this.f20912d;
        Object obj = this.f20913e;
        View.AccessibilityDelegate accessibilityDelegate = this.f64777a;
        switch (i13) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c18093f.f70317a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                C5019m c5019m = (C5019m) obj;
                accessibilityNodeInfo.setHintText(c5019m.f20926L.getVisibility() == 0 ? c5019m.getString(R.string.mtrl_picker_toggle_to_year_selection) : c5019m.getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c18093f.f70317a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f21002E);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f21004z);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c18093f.f70317a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).f21008I);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo4 = c18093f.f70317a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                c18093f.m51947a(1048576);
                accessibilityNodeInfo4.setDismissable(true);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c18093f.f70317a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i14 = MaterialButtonToggleGroup.f20846K;
                int i15 = -1;
                if (view instanceof MaterialButton) {
                    int i16 = 0;
                    for (int i17 = 0; i17 < materialButtonToggleGroup.getChildCount(); i17++) {
                        if (materialButtonToggleGroup.getChildAt(i17) == view) {
                            i15 = i16;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i17) instanceof MaterialButton) && materialButtonToggleGroup.m15722c(i17)) {
                                i16++;
                            }
                        }
                    }
                }
                c18093f.m51955j(C0929d.m2336s(0, 1, i15, 1, ((MaterialButton) view).f20842O));
                break;
        }
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: g */
    public boolean mo5307g(View view, int i13, Bundle bundle) {
        switch (this.f20912d) {
            case 3:
                if (i13 != 1048576) {
                    return super.mo5307g(view, i13, bundle);
                }
                ((C25908n) ((AbstractC25906l) this.f20913e)).m76610a(3);
                return true;
            default:
                return super.mo5307g(view, i13, bundle);
        }
    }
}
