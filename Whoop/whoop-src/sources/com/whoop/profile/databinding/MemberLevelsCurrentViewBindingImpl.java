package com.whoop.profile.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.profile.C9690BR;
import com.whoop.profile.C9691R;

/* JADX INFO: loaded from: classes7.dex */
public class MemberLevelsCurrentViewBindingImpl extends MemberLevelsCurrentViewBinding {
    private static final C1191u sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    static {
        C1191u c1191u = new C1191u(9);
        sIncludes = c1191u;
        c1191u.m3737a(0, new int[]{1}, new int[]{C9691R.layout.view_onboarding_segment_bar}, new String[]{"view_onboarding_segment_bar"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C9691R.id.current_level_badge, 2);
        sparseIntArray.put(C9691R.id.current_tier, 3);
        sparseIntArray.put(C9691R.id.current_level, 4);
        sparseIntArray.put(C9691R.id.current_level_mini_badge, 5);
        sparseIntArray.put(C9691R.id.level_progress_bar, 6);
        sparseIntArray.put(C9691R.id.next_level_mini_badge, 7);
        sparseIntArray.put(C9691R.id.current_level_progress_text, 8);
    }

    public MemberLevelsCurrentViewBindingImpl(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 9, sIncludes, sViewsWithIds));
    }

    private boolean onChangeLevelOnboardingSegmentBar(ViewOnboardingSegmentBarBinding viewOnboardingSegmentBarBinding, int i13) {
        if (i13 != C9690BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
        AbstractC1168a0.executeBindingsOn(this.levelOnboardingSegmentBar);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.levelOnboardingSegmentBar.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        this.levelOnboardingSegmentBar.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 != 0) {
            return false;
        }
        return onChangeLevelOnboardingSegmentBar((ViewOnboardingSegmentBarBinding) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.levelOnboardingSegmentBar.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private MemberLevelsCurrentViewBindingImpl(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 1, (TextView) objArr[4], (ImageView) objArr[2], (ImageView) objArr[5], (TextView) objArr[8], (TextView) objArr[3], (ViewOnboardingSegmentBarBinding) objArr[1], (ProgressBar) objArr[6], (ImageView) objArr[7]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.levelOnboardingSegmentBar);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
