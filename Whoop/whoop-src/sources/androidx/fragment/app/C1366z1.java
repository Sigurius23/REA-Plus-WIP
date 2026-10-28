package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.InterfaceC1583f2;
import com.whoop.android.R;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.models.MessageType;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.AbstractC11266d;
import p108e4.AbstractC12682p;
import p184h5.AbstractC16871f0;
import p184h5.AbstractC16901p0;
import p319m4.AbstractC25012a;
import p321m6.AbstractC25106b;
import p581we.C37199o;

/* JADX INFO: renamed from: androidx.fragment.app.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1366z1 {

    /* JADX INFO: renamed from: a */
    public final C37199o f5850a;

    /* JADX INFO: renamed from: b */
    public final C1274a2 f5851b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC1320m0 f5852c;

    /* JADX INFO: renamed from: d */
    public boolean f5853d = false;

    /* JADX INFO: renamed from: e */
    public int f5854e = -1;

    public C1366z1(C37199o c37199o, C1274a2 c1274a2, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        this.f5850a = c37199o;
        this.f5851b = c1274a2;
        this.f5852c = abstractComponentCallbacksC1320m0;
    }

    /* JADX INFO: renamed from: a */
    public final void m4246a() {
        boolean zM4132M = AbstractC1329o1.m4132M(3);
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5852c;
        if (zM4132M) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC1320m0);
        }
        Bundle bundle = abstractComponentCallbacksC1320m0.mSavedFragmentState;
        abstractComponentCallbacksC1320m0.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f5850a.m119230n(abstractComponentCallbacksC1320m0, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m4247b() {
        View view;
        View view2;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5852c;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4130F = AbstractC1329o1.m4130F(abstractComponentCallbacksC1320m0.mContainer);
        AbstractComponentCallbacksC1320m0 parentFragment = abstractComponentCallbacksC1320m0.getParentFragment();
        if (abstractComponentCallbacksC1320m0M4130F != null && !abstractComponentCallbacksC1320m0M4130F.equals(parentFragment)) {
            AbstractC25106b.m73609l(abstractComponentCallbacksC1320m0, abstractComponentCallbacksC1320m0M4130F, abstractComponentCallbacksC1320m0.mContainerId);
        }
        ArrayList arrayList = this.f5851b.f5525a;
        ViewGroup viewGroup = abstractComponentCallbacksC1320m0.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC1320m0);
            for (int i13 = iIndexOf - 1; i13 >= 0; i13--) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = (AbstractComponentCallbacksC1320m0) arrayList.get(i13);
                if (abstractComponentCallbacksC1320m1.mContainer == viewGroup && (view2 = abstractComponentCallbacksC1320m1.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m2 = (AbstractComponentCallbacksC1320m0) arrayList.get(iIndexOf);
                if (abstractComponentCallbacksC1320m2.mContainer == viewGroup && (view = abstractComponentCallbacksC1320m2.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        abstractComponentCallbacksC1320m0.mContainer.addView(abstractComponentCallbacksC1320m0.mView, iIndexOfChild);
    }

    /* JADX INFO: renamed from: c */
    public final void m4248c() {
        boolean zM4132M = AbstractC1329o1.m4132M(3);
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5852c;
        if (zM4132M) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC1320m0);
        }
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = abstractComponentCallbacksC1320m0.mTarget;
        C1366z1 c1366z1 = null;
        C1274a2 c1274a2 = this.f5851b;
        if (abstractComponentCallbacksC1320m1 != null) {
            C1366z1 c1366z2 = (C1366z1) c1274a2.f5526b.get(abstractComponentCallbacksC1320m1.mWho);
            if (c1366z2 == null) {
                StringBuilder sb4 = new StringBuilder("Fragment ");
                sb4.append(abstractComponentCallbacksC1320m0);
                sb4.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC11266d.m30463q(sb4, abstractComponentCallbacksC1320m0.mTarget, " that does not belong to this FragmentManager!"));
            }
            abstractComponentCallbacksC1320m0.mTargetWho = abstractComponentCallbacksC1320m0.mTarget.mWho;
            abstractComponentCallbacksC1320m0.mTarget = null;
            c1366z1 = c1366z2;
        } else {
            String str = abstractComponentCallbacksC1320m0.mTargetWho;
            if (str != null && (c1366z1 = (C1366z1) c1274a2.f5526b.get(str)) == null) {
                StringBuilder sb5 = new StringBuilder("Fragment ");
                sb5.append(abstractComponentCallbacksC1320m0);
                sb5.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC25012a.m73376i(abstractComponentCallbacksC1320m0.mTargetWho, " that does not belong to this FragmentManager!", sb5));
            }
        }
        if (c1366z1 != null) {
            c1366z1.m4256k();
        }
        AbstractC1329o1 abstractC1329o1 = abstractComponentCallbacksC1320m0.mFragmentManager;
        abstractComponentCallbacksC1320m0.mHost = abstractC1329o1.f5738x;
        abstractComponentCallbacksC1320m0.mParentFragment = abstractC1329o1.f5740z;
        C37199o c37199o = this.f5850a;
        c37199o.m119236t(abstractComponentCallbacksC1320m0, false);
        abstractComponentCallbacksC1320m0.performAttach();
        c37199o.m119231o(abstractComponentCallbacksC1320m0, false);
    }

    /* JADX INFO: renamed from: d */
    public final int m4249d() {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5852c;
        if (abstractComponentCallbacksC1320m0.mFragmentManager == null) {
            return abstractComponentCallbacksC1320m0.mState;
        }
        int iMin = this.f5854e;
        int iOrdinal = abstractComponentCallbacksC1320m0.mMaxState.ordinal();
        int i13 = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC1320m0.mFromLayout) {
            if (abstractComponentCallbacksC1320m0.mInLayout) {
                iMin = Math.max(this.f5854e, 2);
                View view = abstractComponentCallbacksC1320m0.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f5854e < 4 ? Math.min(iMin, abstractComponentCallbacksC1320m0.mState) : Math.min(iMin, 1);
            }
        }
        if (abstractComponentCallbacksC1320m0.mInDynamicContainer && abstractComponentCallbacksC1320m0.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!abstractComponentCallbacksC1320m0.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC1320m0.mContainer;
        if (viewGroup != null) {
            C1343s c1343sM4213j = C1343s.m4213j(viewGroup, abstractComponentCallbacksC1320m0.getParentFragmentManager());
            C1334p2 c1334p2M4220g = c1343sM4213j.m4220g(abstractComponentCallbacksC1320m0);
            int i14 = c1334p2M4220g != null ? c1334p2M4220g.f5750b : 0;
            C1334p2 c1334p2M4221h = c1343sM4213j.m4221h(abstractComponentCallbacksC1320m0);
            i13 = c1334p2M4221h != null ? c1334p2M4221h.f5750b : 0;
            int i15 = i14 == 0 ? -1 : AbstractC1338q2.f5778a[AbstractC12682p.m35485e(i14)];
            if (i15 != -1 && i15 != 1) {
                i13 = i14;
            }
        }
        if (i13 == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i13 == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC1320m0.mRemoving) {
            iMin = abstractComponentCallbacksC1320m0.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC1320m0.mDeferStart && abstractComponentCallbacksC1320m0.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (abstractComponentCallbacksC1320m0.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC1320m0);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: e */
    public final void m4250e() {
        boolean zM4132M = AbstractC1329o1.m4132M(3);
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5852c;
        if (zM4132M) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC1320m0);
        }
        Bundle bundle = abstractComponentCallbacksC1320m0.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC1320m0.mIsCreated) {
            abstractComponentCallbacksC1320m0.mState = 1;
            abstractComponentCallbacksC1320m0.restoreChildFragmentState();
        } else {
            C37199o c37199o = this.f5850a;
            c37199o.m119237u(abstractComponentCallbacksC1320m0, false);
            abstractComponentCallbacksC1320m0.performCreate(bundle2);
            c37199o.m119232p(abstractComponentCallbacksC1320m0, bundle2, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4251f() {
        String resourceName;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5852c;
        if (abstractComponentCallbacksC1320m0.mFromLayout) {
            return;
        }
        if (AbstractC1329o1.m4132M(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC1320m0);
        }
        Bundle bundle = abstractComponentCallbacksC1320m0.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = abstractComponentCallbacksC1320m0.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC1320m0.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i13 = abstractComponentCallbacksC1320m0.mContainerId;
            if (i13 != 0) {
                if (i13 == -1) {
                    throw new IllegalArgumentException(AbstractC11266d.m30458l(abstractComponentCallbacksC1320m0, "Cannot create fragment ", " for a container view with no id"));
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC1320m0.mFragmentManager.f5739y.mo4070b(i13);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC1320m0.mRestored && !abstractComponentCallbacksC1320m0.mInDynamicContainer) {
                        try {
                            resourceName = abstractComponentCallbacksC1320m0.getResources().getResourceName(abstractComponentCallbacksC1320m0.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC1320m0.mContainerId) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC1320m0);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    AbstractC25106b.m73608k(abstractComponentCallbacksC1320m0, viewGroup);
                }
            }
        }
        abstractComponentCallbacksC1320m0.mContainer = viewGroup;
        abstractComponentCallbacksC1320m0.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (abstractComponentCallbacksC1320m0.mView != null) {
            if (AbstractC1329o1.m4132M(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC1320m0);
            }
            abstractComponentCallbacksC1320m0.mView.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC1320m0.mView.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC1320m0);
            if (viewGroup != null) {
                m4247b();
            }
            if (abstractComponentCallbacksC1320m0.mHidden) {
                abstractComponentCallbacksC1320m0.mView.setVisibility(8);
            }
            if (abstractComponentCallbacksC1320m0.mView.isAttachedToWindow()) {
                View view = abstractComponentCallbacksC1320m0.mView;
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                AbstractC16871f0.m47500c(view);
            } else {
                View view2 = abstractComponentCallbacksC1320m0.mView;
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1363y1(view2));
            }
            abstractComponentCallbacksC1320m0.performViewCreated();
            this.f5850a.m119242z(abstractComponentCallbacksC1320m0, abstractComponentCallbacksC1320m0.mView, bundle2, false);
            int visibility = abstractComponentCallbacksC1320m0.mView.getVisibility();
            abstractComponentCallbacksC1320m0.setPostOnViewCreatedAlpha(abstractComponentCallbacksC1320m0.mView.getAlpha());
            if (abstractComponentCallbacksC1320m0.mContainer != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC1320m0.mView.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC1320m0.setFocusedView(viewFindFocus);
                    if (AbstractC1329o1.m4132M(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC1320m0);
                    }
                }
                abstractComponentCallbacksC1320m0.mView.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC1320m0.mState = 2;
    }

    /* JADX INFO: renamed from: g */
    public final void m4252g() {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4055b;
        boolean zM4132M = AbstractC1329o1.m4132M(3);
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5852c;
        if (zM4132M) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC1320m0);
        }
        boolean zIsChangingConfigurations = true;
        boolean z4 = abstractComponentCallbacksC1320m0.mRemoving && !abstractComponentCallbacksC1320m0.isInBackStack();
        C1274a2 c1274a2 = this.f5851b;
        if (z4 && !abstractComponentCallbacksC1320m0.mBeingSaved) {
            c1274a2.m4062i(null, abstractComponentCallbacksC1320m0.mWho);
        }
        if (!z4) {
            C1348t1 c1348t1 = c1274a2.f5528d;
            if (!((c1348t1.f5810w.containsKey(abstractComponentCallbacksC1320m0.mWho) && c1348t1.f5813z) ? c1348t1.f5808E : true)) {
                String str = abstractComponentCallbacksC1320m0.mTargetWho;
                if (str != null && (abstractComponentCallbacksC1320m0M4055b = c1274a2.m4055b(str)) != null && abstractComponentCallbacksC1320m0M4055b.mRetainInstance) {
                    abstractComponentCallbacksC1320m0.mTarget = abstractComponentCallbacksC1320m0M4055b;
                }
                abstractComponentCallbacksC1320m0.mState = 0;
                return;
            }
        }
        AbstractC1359x0 abstractC1359x0 = abstractComponentCallbacksC1320m0.mHost;
        if (abstractC1359x0 instanceof InterfaceC1583f2) {
            zIsChangingConfigurations = c1274a2.f5528d.f5808E;
        } else {
            AbstractActivityC1340r0 abstractActivityC1340r0 = abstractC1359x0.f5827x;
            if (abstractActivityC1340r0 != null) {
                zIsChangingConfigurations = true ^ abstractActivityC1340r0.isChangingConfigurations();
            }
        }
        if ((z4 && !abstractComponentCallbacksC1320m0.mBeingSaved) || zIsChangingConfigurations) {
            c1274a2.f5528d.m4227j(abstractComponentCallbacksC1320m0, false);
        }
        abstractComponentCallbacksC1320m0.performDestroy();
        this.f5850a.m119233q(abstractComponentCallbacksC1320m0, false);
        for (C1366z1 c1366z1 : c1274a2.m4057d()) {
            if (c1366z1 != null) {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = c1366z1.f5852c;
                if (abstractComponentCallbacksC1320m0.mWho.equals(abstractComponentCallbacksC1320m1.mTargetWho)) {
                    abstractComponentCallbacksC1320m1.mTarget = abstractComponentCallbacksC1320m0;
                    abstractComponentCallbacksC1320m1.mTargetWho = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC1320m0.mTargetWho;
        if (str2 != null) {
            abstractComponentCallbacksC1320m0.mTarget = c1274a2.m4055b(str2);
        }
        c1274a2.m4061h(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m4253h() {
        View view;
        boolean zM4132M = AbstractC1329o1.m4132M(3);
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5852c;
        if (zM4132M) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC1320m0);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC1320m0.mContainer;
        if (viewGroup != null && (view = abstractComponentCallbacksC1320m0.mView) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC1320m0.performDestroyView();
        this.f5850a.m119198A(abstractComponentCallbacksC1320m0, false);
        abstractComponentCallbacksC1320m0.mContainer = null;
        abstractComponentCallbacksC1320m0.mView = null;
        abstractComponentCallbacksC1320m0.mViewLifecycleOwner = null;
        abstractComponentCallbacksC1320m0.mViewLifecycleOwnerLiveData.setValue(null);
        abstractComponentCallbacksC1320m0.mInLayout = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m4254i() {
        boolean zM4132M = AbstractC1329o1.m4132M(3);
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5852c;
        if (zM4132M) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC1320m0);
        }
        abstractComponentCallbacksC1320m0.performDetach();
        this.f5850a.m119234r(abstractComponentCallbacksC1320m0, false);
        abstractComponentCallbacksC1320m0.mState = -1;
        abstractComponentCallbacksC1320m0.mHost = null;
        abstractComponentCallbacksC1320m0.mParentFragment = null;
        abstractComponentCallbacksC1320m0.mFragmentManager = null;
        if (!abstractComponentCallbacksC1320m0.mRemoving || abstractComponentCallbacksC1320m0.isInBackStack()) {
            C1348t1 c1348t1 = this.f5851b.f5528d;
            if (!((c1348t1.f5810w.containsKey(abstractComponentCallbacksC1320m0.mWho) && c1348t1.f5813z) ? c1348t1.f5808E : true)) {
                return;
            }
        }
        if (AbstractC1329o1.m4132M(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC1320m0);
        }
        abstractComponentCallbacksC1320m0.initState();
    }

    /* JADX INFO: renamed from: j */
    public final void m4255j() {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5852c;
        if (abstractComponentCallbacksC1320m0.mFromLayout && abstractComponentCallbacksC1320m0.mInLayout && !abstractComponentCallbacksC1320m0.mPerformedCreateView) {
            if (AbstractC1329o1.m4132M(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC1320m0);
            }
            Bundle bundle = abstractComponentCallbacksC1320m0.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC1320m0.performCreateView(abstractComponentCallbacksC1320m0.performGetLayoutInflater(bundle2), null, bundle2);
            View view = abstractComponentCallbacksC1320m0.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC1320m0.mView.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC1320m0);
                if (abstractComponentCallbacksC1320m0.mHidden) {
                    abstractComponentCallbacksC1320m0.mView.setVisibility(8);
                }
                abstractComponentCallbacksC1320m0.performViewCreated();
                this.f5850a.m119242z(abstractComponentCallbacksC1320m0, abstractComponentCallbacksC1320m0.mView, bundle2, false);
                abstractComponentCallbacksC1320m0.mState = 2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4256k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z4 = this.f5853d;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5852c;
        if (z4) {
            if (AbstractC1329o1.m4132M(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC1320m0);
                return;
            }
            return;
        }
        try {
            this.f5853d = true;
            boolean z13 = false;
            while (true) {
                int iM4249d = m4249d();
                int i13 = abstractComponentCallbacksC1320m0.mState;
                int i14 = 3;
                C1274a2 c1274a2 = this.f5851b;
                if (iM4249d == i13) {
                    if (!z13 && i13 == -1 && abstractComponentCallbacksC1320m0.mRemoving && !abstractComponentCallbacksC1320m0.isInBackStack() && !abstractComponentCallbacksC1320m0.mBeingSaved) {
                        if (AbstractC1329o1.m4132M(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC1320m0);
                        }
                        c1274a2.f5528d.m4227j(abstractComponentCallbacksC1320m0, true);
                        c1274a2.m4061h(this);
                        if (AbstractC1329o1.m4132M(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC1320m0);
                        }
                        abstractComponentCallbacksC1320m0.initState();
                    }
                    if (abstractComponentCallbacksC1320m0.mHiddenChanged) {
                        if (abstractComponentCallbacksC1320m0.mView != null && (viewGroup = abstractComponentCallbacksC1320m0.mContainer) != null) {
                            C1343s c1343sM4213j = C1343s.m4213j(viewGroup, abstractComponentCallbacksC1320m0.getParentFragmentManager());
                            if (abstractComponentCallbacksC1320m0.mHidden) {
                                if (AbstractC1329o1.m4132M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC1320m0);
                                }
                                c1343sM4213j.m4218d(3, 1, this);
                            } else {
                                if (AbstractC1329o1.m4132M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC1320m0);
                                }
                                c1343sM4213j.m4218d(2, 1, this);
                            }
                        }
                        AbstractC1329o1 abstractC1329o1 = abstractComponentCallbacksC1320m0.mFragmentManager;
                        if (abstractC1329o1 != null && abstractComponentCallbacksC1320m0.mAdded && AbstractC1329o1.m4133N(abstractComponentCallbacksC1320m0)) {
                            abstractC1329o1.f5705I = true;
                        }
                        abstractComponentCallbacksC1320m0.mHiddenChanged = false;
                        abstractComponentCallbacksC1320m0.onHiddenChanged(abstractComponentCallbacksC1320m0.mHidden);
                        abstractComponentCallbacksC1320m0.mChildFragmentManager.m4184o();
                    }
                    this.f5853d = false;
                    return;
                }
                C37199o c37199o = this.f5850a;
                if (iM4249d <= i13) {
                    switch (i13 - 1) {
                        case -1:
                            m4254i();
                            break;
                        case 0:
                            if (abstractComponentCallbacksC1320m0.mBeingSaved) {
                                if (((Bundle) c1274a2.f5527c.get(abstractComponentCallbacksC1320m0.mWho)) == null) {
                                    c1274a2.m4062i(m4259n(), abstractComponentCallbacksC1320m0.mWho);
                                }
                            }
                            m4252g();
                            break;
                        case 1:
                            m4253h();
                            abstractComponentCallbacksC1320m0.mState = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC1320m0.mInLayout = false;
                            abstractComponentCallbacksC1320m0.mState = 2;
                            break;
                        case 3:
                            if (AbstractC1329o1.m4132M(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC1320m0);
                            }
                            if (abstractComponentCallbacksC1320m0.mBeingSaved) {
                                c1274a2.m4062i(m4259n(), abstractComponentCallbacksC1320m0.mWho);
                            } else if (abstractComponentCallbacksC1320m0.mView != null && abstractComponentCallbacksC1320m0.mSavedViewState == null) {
                                m4260o();
                            }
                            if (abstractComponentCallbacksC1320m0.mView != null && (viewGroup2 = abstractComponentCallbacksC1320m0.mContainer) != null) {
                                C1343s c1343sM4213j2 = C1343s.m4213j(viewGroup2, abstractComponentCallbacksC1320m0.getParentFragmentManager());
                                if (AbstractC1329o1.m4132M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC1320m0);
                                }
                                c1343sM4213j2.m4218d(1, 3, this);
                            }
                            abstractComponentCallbacksC1320m0.mState = 3;
                            break;
                        case 4:
                            if (AbstractC1329o1.m4132M(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC1320m0);
                            }
                            abstractComponentCallbacksC1320m0.performStop();
                            c37199o.m119241y(abstractComponentCallbacksC1320m0, false);
                            break;
                        case 5:
                            abstractComponentCallbacksC1320m0.mState = 5;
                            break;
                        case 6:
                            if (AbstractC1329o1.m4132M(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC1320m0);
                            }
                            abstractComponentCallbacksC1320m0.performPause();
                            c37199o.m119235s(abstractComponentCallbacksC1320m0, false);
                            break;
                    }
                } else {
                    switch (i13 + 1) {
                        case 0:
                            m4248c();
                            break;
                        case 1:
                            m4250e();
                            break;
                        case 2:
                            m4255j();
                            m4251f();
                            break;
                        case 3:
                            m4246a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC1320m0.mView != null && (viewGroup3 = abstractComponentCallbacksC1320m0.mContainer) != null) {
                                C1343s c1343sM4213j3 = C1343s.m4213j(viewGroup3, abstractComponentCallbacksC1320m0.getParentFragmentManager());
                                int visibility = abstractComponentCallbacksC1320m0.mView.getVisibility();
                                if (visibility == 0) {
                                    i14 = 2;
                                } else if (visibility == 4) {
                                    i14 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                AbstractC18489d0.m53382w(i14, "finalState");
                                if (AbstractC1329o1.m4132M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC1320m0);
                                }
                                c1343sM4213j3.m4218d(i14, 2, this);
                            }
                            abstractComponentCallbacksC1320m0.mState = 4;
                            break;
                        case 5:
                            if (AbstractC1329o1.m4132M(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC1320m0);
                            }
                            abstractComponentCallbacksC1320m0.performStart();
                            c37199o.m119240x(abstractComponentCallbacksC1320m0, false);
                            break;
                        case 6:
                            abstractComponentCallbacksC1320m0.mState = 6;
                            break;
                        case 7:
                            m4258m();
                            break;
                    }
                }
                z13 = true;
            }
        } catch (Throwable th3) {
            this.f5853d = false;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4257l(ClassLoader classLoader) {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5852c;
        Bundle bundle = abstractComponentCallbacksC1320m0.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC1320m0.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC1320m0.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            abstractComponentCallbacksC1320m0.mSavedViewState = abstractComponentCallbacksC1320m0.mSavedFragmentState.getSparseParcelableArray("viewState");
            abstractComponentCallbacksC1320m0.mSavedViewRegistryState = abstractComponentCallbacksC1320m0.mSavedFragmentState.getBundle("viewRegistryState");
            C1360x1 c1360x1 = (C1360x1) abstractComponentCallbacksC1320m0.mSavedFragmentState.getParcelable("state");
            if (c1360x1 != null) {
                abstractComponentCallbacksC1320m0.mTargetWho = c1360x1.f5838M;
                abstractComponentCallbacksC1320m0.mTargetRequestCode = c1360x1.f5839N;
                Boolean bool = abstractComponentCallbacksC1320m0.mSavedUserVisibleHint;
                if (bool != null) {
                    abstractComponentCallbacksC1320m0.mUserVisibleHint = bool.booleanValue();
                    abstractComponentCallbacksC1320m0.mSavedUserVisibleHint = null;
                } else {
                    abstractComponentCallbacksC1320m0.mUserVisibleHint = c1360x1.f5840O;
                }
            }
            if (abstractComponentCallbacksC1320m0.mUserVisibleHint) {
                return;
            }
            abstractComponentCallbacksC1320m0.mDeferStart = true;
        } catch (BadParcelableException e5) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + abstractComponentCallbacksC1320m0, e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX INFO: renamed from: m */
    public final void m4258m() {
        boolean zRequestFocus;
        String str;
        boolean zM4132M = AbstractC1329o1.m4132M(3);
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5852c;
        if (zM4132M) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC1320m0);
        }
        View focusedView = abstractComponentCallbacksC1320m0.getFocusedView();
        if (focusedView != null) {
            if (focusedView == abstractComponentCallbacksC1320m0.mView) {
                zRequestFocus = focusedView.requestFocus();
                if (AbstractC1329o1.m4132M(2)) {
                    StringBuilder sb4 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb4.append(focusedView);
                    sb4.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = MessageType.FAILED;
                    }
                    sb4.append(str);
                    sb4.append(" on Fragment ");
                    sb4.append(abstractComponentCallbacksC1320m0);
                    sb4.append(" resulting in focused view ");
                    sb4.append(abstractComponentCallbacksC1320m0.mView.findFocus());
                    Log.v("FragmentManager", sb4.toString());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == abstractComponentCallbacksC1320m0.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                zRequestFocus = focusedView.requestFocus();
                if (AbstractC1329o1.m4132M(2)) {
                    StringBuilder sb5 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb5.append(focusedView);
                    sb5.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = MessageType.FAILED;
                    }
                    sb5.append(str);
                    sb5.append(" on Fragment ");
                    sb5.append(abstractComponentCallbacksC1320m0);
                    sb5.append(" resulting in focused view ");
                    sb5.append(abstractComponentCallbacksC1320m0.mView.findFocus());
                    Log.v("FragmentManager", sb5.toString());
                }
            }
        }
        abstractComponentCallbacksC1320m0.setFocusedView(null);
        abstractComponentCallbacksC1320m0.performResume();
        this.f5850a.m119238v(abstractComponentCallbacksC1320m0, false);
        this.f5851b.m4062i(null, abstractComponentCallbacksC1320m0.mWho);
        abstractComponentCallbacksC1320m0.mSavedFragmentState = null;
        abstractComponentCallbacksC1320m0.mSavedViewState = null;
        abstractComponentCallbacksC1320m0.mSavedViewRegistryState = null;
    }

    /* JADX INFO: renamed from: n */
    public final Bundle m4259n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5852c;
        if (abstractComponentCallbacksC1320m0.mState == -1 && (bundle = abstractComponentCallbacksC1320m0.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new C1360x1(abstractComponentCallbacksC1320m0));
        if (abstractComponentCallbacksC1320m0.mState > -1) {
            Bundle bundle3 = new Bundle();
            abstractComponentCallbacksC1320m0.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f5850a.m119239w(abstractComponentCallbacksC1320m0, bundle3, false);
            Bundle bundle4 = new Bundle();
            abstractComponentCallbacksC1320m0.mSavedStateRegistryController.m88296b(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleM4160b0 = abstractComponentCallbacksC1320m0.mChildFragmentManager.m4160b0();
            if (!bundleM4160b0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleM4160b0);
            }
            if (abstractComponentCallbacksC1320m0.mView != null) {
                m4260o();
            }
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC1320m0.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = abstractComponentCallbacksC1320m0.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = abstractComponentCallbacksC1320m0.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: o */
    public final void m4260o() {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5852c;
        if (abstractComponentCallbacksC1320m0.mView == null) {
            return;
        }
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC1320m0 + " with view " + abstractComponentCallbacksC1320m0.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC1320m0.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC1320m0.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC1320m0.mViewLifecycleOwner.f5670F.m88296b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC1320m0.mSavedViewRegistryState = bundle;
    }

    public C1366z1(C37199o c37199o, C1274a2 c1274a2, ClassLoader classLoader, AbstractC1356w0 abstractC1356w0, Bundle bundle) {
        this.f5850a = c37199o;
        this.f5851b = c1274a2;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4244b = ((C1360x1) bundle.getParcelable("state")).m4244b(abstractC1356w0, classLoader);
        this.f5852c = abstractComponentCallbacksC1320m0M4244b;
        abstractComponentCallbacksC1320m0M4244b.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC1320m0M4244b.setArguments(bundle2);
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC1320m0M4244b);
        }
    }

    public C1366z1(C37199o c37199o, C1274a2 c1274a2, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, Bundle bundle) {
        this.f5850a = c37199o;
        this.f5851b = c1274a2;
        this.f5852c = abstractComponentCallbacksC1320m0;
        abstractComponentCallbacksC1320m0.mSavedViewState = null;
        abstractComponentCallbacksC1320m0.mSavedViewRegistryState = null;
        abstractComponentCallbacksC1320m0.mBackStackNesting = 0;
        abstractComponentCallbacksC1320m0.mInLayout = false;
        abstractComponentCallbacksC1320m0.mAdded = false;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = abstractComponentCallbacksC1320m0.mTarget;
        abstractComponentCallbacksC1320m0.mTargetWho = abstractComponentCallbacksC1320m1 != null ? abstractComponentCallbacksC1320m1.mWho : null;
        abstractComponentCallbacksC1320m0.mTarget = null;
        abstractComponentCallbacksC1320m0.mSavedFragmentState = bundle;
        abstractComponentCallbacksC1320m0.mArguments = bundle.getBundle("arguments");
    }
}
