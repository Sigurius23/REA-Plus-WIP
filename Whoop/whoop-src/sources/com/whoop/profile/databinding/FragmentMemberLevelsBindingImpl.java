package com.whoop.profile.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.whoop.p069ui.WhoopNewToolbar;
import com.whoop.profile.C9690BR;
import com.whoop.profile.C9691R;

/* JADX INFO: loaded from: classes7.dex */
public class FragmentMemberLevelsBindingImpl extends FragmentMemberLevelsBinding {
    private static final C1191u sIncludes;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final CoordinatorLayout mboundView0;

    static {
        C1191u c1191u = new C1191u(6);
        sIncludes = c1191u;
        c1191u.m3737a(1, new int[]{2}, new int[]{C9691R.layout.member_levels_current_view}, new String[]{"member_levels_current_view"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C9691R.id.member_levels_toolbar, 3);
        sparseIntArray.put(C9691R.id.pinned_level_title, 4);
        sparseIntArray.put(C9691R.id.progress_level_recyclerview, 5);
    }

    public FragmentMemberLevelsBindingImpl(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 6, sIncludes, sViewsWithIds));
    }

    private boolean onChangeCurrentLevelViewContainer(MemberLevelsCurrentViewBinding memberLevelsCurrentViewBinding, int i13) {
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
        AbstractC1168a0.executeBindingsOn(this.currentLevelViewContainer);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.currentLevelViewContainer.hasPendingBindings();
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
        this.currentLevelViewContainer.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 != 0) {
            return false;
        }
        return onChangeCurrentLevelViewContainer((MemberLevelsCurrentViewBinding) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.currentLevelViewContainer.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private FragmentMemberLevelsBindingImpl(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 1, (CollapsingToolbarLayout) objArr[1], (MemberLevelsCurrentViewBinding) objArr[2], (WhoopNewToolbar) objArr[3], (TextView) objArr[4], (RecyclerView) objArr[5]);
        this.mDirtyFlags = -1L;
        this.collapsingToolbarLayout.setTag(null);
        setContainedBinding(this.currentLevelViewContainer);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.mboundView0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
