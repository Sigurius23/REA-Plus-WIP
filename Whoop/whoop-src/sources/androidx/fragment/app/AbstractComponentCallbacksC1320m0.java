package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.C1593i0;
import androidx.lifecycle.C1625s1;
import androidx.lifecycle.C1630u0;
import androidx.lifecycle.C1646z1;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1563a2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1620r;
import com.google.android.material.textfield.C5057p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import m83.C25262p;
import p000.AbstractC11266d;
import p002a0.C0024g1;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p236j.AbstractC21065d;
import p236j.AbstractC21071j;
import p236j.C21073l;
import p236j.InterfaceC21063b;
import p236j.InterfaceC21064c;
import p267k.AbstractC22081b;
import p298l8.AbstractC23420c;
import p298l8.C23422e;
import p321m6.AbstractC25106b;
import p360o8.AbstractC27650b;
import p360o8.C27651c;
import p399pb.C29047d;
import p399pb.C29048e;
import p399pb.InterfaceC29049f;
import p456rb.C31183a;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p538v.InterfaceC35450a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.m0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC1320m0 implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1585g0, InterfaceC1583f2, InterfaceC1620r, InterfaceC29049f, InterfaceC21064c {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    C1304i0 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    AbstractC1329o1 mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    InterfaceC1563a2 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    AbstractC1329o1 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC1359x0 mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C1593i0 mLifecycleRegistry;
    EnumC1635w mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<AbstractC1308j0> mOnPreAttachedListeners;
    AbstractComponentCallbacksC1320m0 mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final AbstractC1308j0 mSavedStateAttachListener;
    C29048e mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    AbstractComponentCallbacksC1320m0 mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    C1318l2 mViewLifecycleOwner;
    C1630u0 mViewLifecycleOwnerLiveData;
    String mWho;

    public AbstractComponentCallbacksC1320m0() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C1333p1();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC1276b0(this, 0);
        this.mMaxState = EnumC1635w.f6323E;
        this.mViewLifecycleOwnerLiveData = new C1630u0();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new C1280c0(this);
        m4126v();
    }

    @Deprecated
    public static AbstractComponentCallbacksC1320m0 instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public void callStartTransitionListener(boolean z4) {
        ViewGroup viewGroup;
        AbstractC1329o1 abstractC1329o1;
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 != null) {
            c1304i0.f5648u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (abstractC1329o1 = this.mFragmentManager) == null) {
            return;
        }
        C1343s c1343sM4213j = C1343s.m4213j(viewGroup, abstractC1329o1);
        c1343sM4213j.m4223l();
        if (z4) {
            this.mHost.f5828y.post(new RunnableC1346t(c1343sM4213j, 2));
        } else {
            c1343sM4213j.m4219e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public AbstractC1350u0 createFragmentContainer() {
        return new C1284d0(this);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4125u = m4125u(false);
        if (abstractComponentCallbacksC1320m0M4125u != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(abstractComponentCallbacksC1320m0M4125u);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC27650b.m83607a(this).m83613c(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m4191v(AbstractC2875y.m8299l(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public AbstractComponentCallbacksC1320m0 findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f5717c.m4056c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final AbstractActivityC1340r0 getActivity() {
        AbstractC1359x0 abstractC1359x0 = this.mHost;
        if (abstractC1359x0 == null) {
            return null;
        }
        return abstractC1359x0.f5826w;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null || (bool = c1304i0.f5643p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null || (bool = c1304i0.f5642o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return null;
        }
        c1304i0.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final AbstractC1329o1 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(AbstractC11266d.m30458l(this, "Fragment ", " has not been attached yet."));
    }

    public Context getContext() {
        AbstractC1359x0 abstractC1359x0 = this.mHost;
        if (abstractC1359x0 == null) {
            return null;
        }
        return abstractC1359x0.f5827x;
    }

    @Override // androidx.lifecycle.InterfaceC1620r
    public AbstractC23420c getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && AbstractC1329o1.m4132M(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C23422e c23422e = new C23422e(0);
        LinkedHashMap linkedHashMap = c23422e.f92772a;
        if (application != null) {
            linkedHashMap.put(C1646z1.f6353d, application);
        }
        linkedHashMap.put(AbstractC1613o1.f6291a, this);
        linkedHashMap.put(AbstractC1613o1.f6292b, this);
        if (getArguments() != null) {
            linkedHashMap.put(AbstractC1613o1.f6293c, getArguments());
        }
        return c23422e;
    }

    @Override // androidx.lifecycle.InterfaceC1620r
    public InterfaceC1563a2 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && AbstractC1329o1.m4132M(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new C1625s1(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return 0;
        }
        return c1304i0.f5629b;
    }

    public Object getEnterTransition() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return null;
        }
        return c1304i0.f5636i;
    }

    public SharedElementCallback getEnterTransitionCallback() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return null;
        }
        return c1304i0.f5644q;
    }

    public int getExitAnim() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return 0;
        }
        return c1304i0.f5630c;
    }

    public Object getExitTransition() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return null;
        }
        return c1304i0.f5638k;
    }

    public SharedElementCallback getExitTransitionCallback() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return null;
        }
        return c1304i0.f5645r;
    }

    public View getFocusedView() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return null;
        }
        return c1304i0.f5647t;
    }

    @Deprecated
    public final AbstractC1329o1 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC1359x0 abstractC1359x0 = this.mHost;
        if (abstractC1359x0 == null) {
            return null;
        }
        return ((C1336q0) abstractC1359x0).f5776E;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.InterfaceC1585g0
    public AbstractC1638x getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public AbstractC27650b getLoaderManager() {
        return AbstractC27650b.m83607a(this);
    }

    public int getNextTransition() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return 0;
        }
        return c1304i0.f5633f;
    }

    public final AbstractComponentCallbacksC1320m0 getParentFragment() {
        return this.mParentFragment;
    }

    public final AbstractC1329o1 getParentFragmentManager() {
        AbstractC1329o1 abstractC1329o1 = this.mFragmentManager;
        if (abstractC1329o1 != null) {
            return abstractC1329o1;
        }
        throw new IllegalStateException(AbstractC11266d.m30458l(this, "Fragment ", " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return false;
        }
        return c1304i0.f5628a;
    }

    public int getPopEnterAnim() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return 0;
        }
        return c1304i0.f5631d;
    }

    public int getPopExitAnim() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return 0;
        }
        return c1304i0.f5632e;
    }

    public float getPostOnViewCreatedAlpha() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return 1.0f;
        }
        return c1304i0.f5646s;
    }

    public Object getReenterTransition() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return null;
        }
        Object obj = c1304i0.f5639l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        AbstractC25106b.m73602e(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return null;
        }
        Object obj = c1304i0.f5637j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // p399pb.InterfaceC29049f
    public final C29047d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f117551b;
    }

    public Object getSharedElementEnterTransition() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return null;
        }
        return c1304i0.f5640m;
    }

    public Object getSharedElementReturnTransition() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return null;
        }
        Object obj = c1304i0.f5641n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C1304i0 c1304i0 = this.mAnimationInfo;
        return (c1304i0 == null || (arrayList = c1304i0.f5634g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C1304i0 c1304i0 = this.mAnimationInfo;
        return (c1304i0 == null || (arrayList = c1304i0.f5635h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i13) {
        return getResources().getString(i13);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final AbstractComponentCallbacksC1320m0 getTargetFragment() {
        return m4125u(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        AbstractC25106b.m73603f(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i13) {
        return getResources().getText(i13);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC1585g0 getViewLifecycleOwner() {
        C1318l2 c1318l2 = this.mViewLifecycleOwner;
        if (c1318l2 != null) {
            return c1318l2;
        }
        throw new IllegalStateException(AbstractC11266d.m30458l(this, "Can't access the Fragment View's LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public AbstractC1615p0 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.InterfaceC1583f2
    public C1579e2 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        int iM4124t = m4124t();
        EnumC1635w enumC1635w = EnumC1635w.f6325w;
        if (iM4124t == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.mFragmentManager.f5713Q.f5812y;
        C1579e2 c1579e2 = (C1579e2) map.get(this.mWho);
        if (c1579e2 != null) {
            return c1579e2;
        }
        C1579e2 c1579e3 = new C1579e2();
        map.put(this.mWho, c1579e3);
        return c1579e3;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        m4126v();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C1333p1();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        AbstractC1329o1 abstractC1329o1 = this.mFragmentManager;
        if (abstractC1329o1 != null) {
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.mParentFragment;
            abstractC1329o1.getClass();
            if (abstractComponentCallbacksC1320m0 == null ? false : abstractComponentCallbacksC1320m0.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.mParentFragment;
            if (!(abstractComponentCallbacksC1320m0 == null ? true : abstractComponentCallbacksC1320m0.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        C1304i0 c1304i0 = this.mAnimationInfo;
        if (c1304i0 == null) {
            return false;
        }
        return c1304i0.f5648u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        AbstractC1329o1 abstractC1329o1 = this.mFragmentManager;
        if (abstractC1329o1 == null) {
            return false;
        }
        return abstractC1329o1.m4147Q();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public Activity m4122k() {
        return getActivity();
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m4149S();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i13, int i14, Intent intent) {
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i13 + " resultCode: " + i14 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC1359x0 abstractC1359x0 = this.mHost;
        AbstractActivityC1340r0 abstractActivityC1340r0 = abstractC1359x0 == null ? null : abstractC1359x0.f5826w;
        if (abstractActivityC1340r0 != null) {
            this.mCalled = false;
            onAttach((Activity) abstractActivityC1340r0);
        }
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        AbstractC1329o1 abstractC1329o1 = this.mChildFragmentManager;
        if (abstractC1329o1.f5737w >= 1) {
            return;
        }
        abstractC1329o1.f5706J = false;
        abstractC1329o1.f5707K = false;
        abstractC1329o1.f5713Q.f5809F = false;
        abstractC1329o1.m4190u(1);
    }

    public Animation onCreateAnimation(int i13, boolean z4, int i14) {
        return null;
    }

    public Animator onCreateAnimator(int i13, boolean z4, int i14) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i13 = this.mContentLayoutId;
        if (i13 != 0) {
            return layoutInflater.inflate(i13, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z4) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC1359x0 abstractC1359x0 = this.mHost;
        AbstractActivityC1340r0 abstractActivityC1340r0 = abstractC1359x0 == null ? null : abstractC1359x0.f5826w;
        if (abstractActivityC1340r0 != null) {
            this.mCalled = false;
            onInflate((Activity) abstractActivityC1340r0, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z4) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z4) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z4) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i13, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m4149S();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new C1342r2(AbstractC11266d.m30458l(this, "Fragment ", " did not call through to super.onActivityCreated()"));
        }
        if (AbstractC1329o1.m4132M(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle2 = this.mSavedFragmentState;
            restoreViewState(bundle2 != null ? bundle2.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
        AbstractC1329o1 abstractC1329o1 = this.mChildFragmentManager;
        abstractC1329o1.f5706J = false;
        abstractC1329o1.f5707K = false;
        abstractC1329o1.f5713Q.f5809F = false;
        abstractC1329o1.m4190u(4);
    }

    public void performAttach() {
        Iterator<AbstractC1308j0> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo4065a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m4159b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f5827x);
        if (!this.mCalled) {
            throw new C1342r2(AbstractC11266d.m30458l(this, "Fragment ", " did not call through to super.onAttach()"));
        }
        AbstractC1329o1 abstractC1329o1 = this.mFragmentManager;
        Iterator it3 = abstractC1329o1.f5731q.iterator();
        while (it3.hasNext()) {
            ((InterfaceC1351u1) it3.next()).mo4085a(abstractC1329o1, this);
        }
        AbstractC1329o1 abstractC1329o2 = this.mChildFragmentManager;
        abstractC1329o2.f5706J = false;
        abstractC1329o2.f5707K = false;
        abstractC1329o2.f5713Q.f5809F = false;
        abstractC1329o2.m4190u(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m4175j(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m4149S();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo4986a(new C1288e0(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new C1342r2(AbstractC11266d.m30458l(this, "Fragment ", " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.m4991g(EnumC1632v.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z4 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z4 = true;
        }
        return this.mChildFragmentManager.m4177k(menu, menuInflater) | z4;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m4149S();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C1318l2(this, getViewModelStore(), new RunnableC1364z(this));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f5669E != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.m4121b();
        if (AbstractC1329o1.m4132M(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        AbstractC1613o1.m5024n(this.mView, this.mViewLifecycleOwner);
        AbstractC1613o1.m5025o(this.mView, this.mViewLifecycleOwner);
        AbstractC34132o.m107862G(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.m4178l();
        this.mLifecycleRegistry.m4991g(EnumC1632v.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new C1342r2(AbstractC11266d.m30458l(this, "Fragment ", " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m4190u(1);
        if (this.mView != null) {
            C1318l2 c1318l2 = this.mViewLifecycleOwner;
            c1318l2.m4121b();
            if (c1318l2.f5669E.f6250d.compareTo(EnumC1635w.f6327y) >= 0) {
                this.mViewLifecycleOwner.m4120a(EnumC1632v.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new C1342r2(AbstractC11266d.m30458l(this, "Fragment ", " did not call through to super.onDestroyView()"));
        }
        C0024g1 c0024g1 = AbstractC27650b.m83607a(this).f111268b.f111265w;
        int iM58g = c0024g1.m58g();
        for (int i13 = 0; i13 < iM58g; i13++) {
            ((C27651c) c0024g1.m59h(i13)).m83611d();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new C1342r2(AbstractC11266d.m30458l(this, "Fragment ", " did not call through to super.onDetach()"));
        }
        AbstractC1329o1 abstractC1329o1 = this.mChildFragmentManager;
        if (abstractC1329o1.f5708L) {
            return;
        }
        abstractC1329o1.m4178l();
        this.mChildFragmentManager = new C1333p1();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z4) {
        onMultiWindowModeChanged(z4);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m4185p(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m4186q(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.m4190u(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4120a(EnumC1632v.ON_PAUSE);
        }
        this.mLifecycleRegistry.m4991g(EnumC1632v.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new C1342r2(AbstractC11266d.m30458l(this, "Fragment ", " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z4) {
        onPictureInPictureModeChanged(z4);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z4 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z4 = true;
        }
        return this.mChildFragmentManager.m4189t(menu) | z4;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zM4134P = AbstractC1329o1.m4134P(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM4134P) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM4134P);
            onPrimaryNavigationFragmentChanged(zM4134P);
            AbstractC1329o1 abstractC1329o1 = this.mChildFragmentManager;
            abstractC1329o1.m4183n0();
            abstractC1329o1.m4187r(abstractC1329o1.f5697A);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.m4149S();
        this.mChildFragmentManager.m4195z(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new C1342r2(AbstractC11266d.m30458l(this, "Fragment ", " did not call through to super.onResume()"));
        }
        C1593i0 c1593i0 = this.mLifecycleRegistry;
        EnumC1632v enumC1632v = EnumC1632v.ON_RESUME;
        c1593i0.m4991g(enumC1632v);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f5669E.m4991g(enumC1632v);
        }
        AbstractC1329o1 abstractC1329o1 = this.mChildFragmentManager;
        abstractC1329o1.f5706J = false;
        abstractC1329o1.f5707K = false;
        abstractC1329o1.f5713Q.f5809F = false;
        abstractC1329o1.m4190u(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.m4149S();
        this.mChildFragmentManager.m4195z(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new C1342r2(AbstractC11266d.m30458l(this, "Fragment ", " did not call through to super.onStart()"));
        }
        C1593i0 c1593i0 = this.mLifecycleRegistry;
        EnumC1632v enumC1632v = EnumC1632v.ON_START;
        c1593i0.m4991g(enumC1632v);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f5669E.m4991g(enumC1632v);
        }
        AbstractC1329o1 abstractC1329o1 = this.mChildFragmentManager;
        abstractC1329o1.f5706J = false;
        abstractC1329o1.f5707K = false;
        abstractC1329o1.f5713Q.f5809F = false;
        abstractC1329o1.m4190u(5);
    }

    public void performStop() {
        AbstractC1329o1 abstractC1329o1 = this.mChildFragmentManager;
        abstractC1329o1.f5707K = true;
        abstractC1329o1.f5713Q.f5809F = true;
        abstractC1329o1.m4190u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4120a(EnumC1632v.ON_STOP);
        }
        this.mLifecycleRegistry.m4991g(EnumC1632v.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new C1342r2(AbstractC11266d.m30458l(this, "Fragment ", " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.m4190u(2);
    }

    public void postponeEnterTransition() {
        m4123s().f5648u = true;
    }

    @Override // p236j.InterfaceC21064c
    public final <I, O> AbstractC21065d registerForActivityResult(AbstractC22081b abstractC22081b, InterfaceC21063b interfaceC21063b) {
        return m4127x(abstractC22081b, new C1292f0(this), interfaceC21063b);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] permissions, int i13) {
        if (this.mHost == null) {
            throw new IllegalStateException(AbstractC11266d.m30458l(this, "Fragment ", " not attached to Activity"));
        }
        AbstractC1329o1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f5703G == null) {
            parentFragmentManager.f5738x.getClass();
            AbstractC22676k.m65750j(permissions, "permissions");
        } else {
            parentFragmentManager.f5704H.addLast(new C1305i1(this.mWho, i13));
            parentFragmentManager.f5703G.mo4052a(permissions, null);
        }
    }

    public final AbstractActivityC1340r0 requireActivity() {
        AbstractActivityC1340r0 activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(AbstractC11266d.m30458l(this, "Fragment ", " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(AbstractC11266d.m30458l(this, "Fragment ", " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(AbstractC11266d.m30458l(this, "Fragment ", " not attached to a context."));
    }

    @Deprecated
    public final AbstractC1329o1 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(AbstractC11266d.m30458l(this, "Fragment ", " not attached to a host."));
    }

    public final AbstractComponentCallbacksC1320m0 requireParentFragment() {
        AbstractComponentCallbacksC1320m0 parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(AbstractC11266d.m30458l(this, "Fragment ", " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(AbstractC11266d.m30458l(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.m4158a0(bundle);
        AbstractC1329o1 abstractC1329o1 = this.mChildFragmentManager;
        abstractC1329o1.f5706J = false;
        abstractC1329o1.f5707K = false;
        abstractC1329o1.f5713Q.f5809F = false;
        abstractC1329o1.m4190u(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new C1342r2(AbstractC11266d.m30458l(this, "Fragment ", " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4120a(EnumC1632v.ON_CREATE);
        }
    }

    /* JADX INFO: renamed from: s */
    public final C1304i0 m4123s() {
        if (this.mAnimationInfo == null) {
            C1304i0 c1304i0 = new C1304i0();
            c1304i0.f5636i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            c1304i0.f5637j = obj;
            c1304i0.f5638k = null;
            c1304i0.f5639l = obj;
            c1304i0.f5640m = null;
            c1304i0.f5641n = obj;
            c1304i0.f5644q = null;
            c1304i0.f5645r = null;
            c1304i0.f5646s = 1.0f;
            c1304i0.f5647t = null;
            this.mAnimationInfo = c1304i0;
        }
        return this.mAnimationInfo;
    }

    public void setAllowEnterTransitionOverlap(boolean z4) {
        m4123s().f5643p = Boolean.valueOf(z4);
    }

    public void setAllowReturnTransitionOverlap(boolean z4) {
        m4123s().f5642o = Boolean.valueOf(z4);
    }

    public void setAnimations(int i13, int i14, int i15, int i16) {
        if (this.mAnimationInfo == null && i13 == 0 && i14 == 0 && i15 == 0 && i16 == 0) {
            return;
        }
        m4123s().f5629b = i13;
        m4123s().f5630c = i14;
        m4123s().f5631d = i15;
        m4123s().f5632e = i16;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        m4123s().f5644q = sharedElementCallback;
    }

    public void setEnterTransition(Object obj) {
        m4123s().f5636i = obj;
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        m4123s().f5645r = sharedElementCallback;
    }

    public void setExitTransition(Object obj) {
        m4123s().f5638k = obj;
    }

    public void setFocusedView(View view) {
        m4123s().f5647t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z4) {
        if (this.mHasMenu != z4) {
            this.mHasMenu = z4;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((C1336q0) this.mHost).f5776E.invalidateMenu();
        }
    }

    public void setInitialSavedState(C1316l0 c1316l0) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (c1316l0 == null || (bundle = c1316l0.f5664w) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z4) {
        if (this.mMenuVisible != z4) {
            this.mMenuVisible = z4;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((C1336q0) this.mHost).f5776E.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i13) {
        if (this.mAnimationInfo == null && i13 == 0) {
            return;
        }
        m4123s();
        this.mAnimationInfo.f5633f = i13;
    }

    public void setPopDirection(boolean z4) {
        if (this.mAnimationInfo == null) {
            return;
        }
        m4123s().f5628a = z4;
    }

    public void setPostOnViewCreatedAlpha(float f13) {
        m4123s().f5646s = f13;
    }

    public void setReenterTransition(Object obj) {
        m4123s().f5639l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z4) {
        AbstractC25106b.m73605h(this);
        this.mRetainInstance = z4;
        AbstractC1329o1 abstractC1329o1 = this.mFragmentManager;
        if (abstractC1329o1 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z4) {
            abstractC1329o1.f5713Q.m4226g(this);
        } else {
            abstractC1329o1.f5713Q.m4230o(this);
        }
    }

    public void setReturnTransition(Object obj) {
        m4123s().f5637j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        m4123s().f5640m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m4123s();
        C1304i0 c1304i0 = this.mAnimationInfo;
        c1304i0.f5634g = arrayList;
        c1304i0.f5635h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        m4123s().f5641n = obj;
    }

    @Deprecated
    public void setTargetFragment(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, int i13) {
        if (abstractComponentCallbacksC1320m0 != null) {
            AbstractC25106b.m73606i(this, abstractComponentCallbacksC1320m0, i13);
        }
        AbstractC1329o1 abstractC1329o1 = this.mFragmentManager;
        AbstractC1329o1 abstractC1329o2 = abstractComponentCallbacksC1320m0 != null ? abstractComponentCallbacksC1320m0.mFragmentManager : null;
        if (abstractC1329o1 != null && abstractC1329o2 != null && abstractC1329o1 != abstractC1329o2) {
            throw new IllegalArgumentException(AbstractC11266d.m30458l(abstractComponentCallbacksC1320m0, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
        }
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4125u = abstractComponentCallbacksC1320m0; abstractComponentCallbacksC1320m0M4125u != null; abstractComponentCallbacksC1320m0M4125u = abstractComponentCallbacksC1320m0M4125u.m4125u(false)) {
            if (abstractComponentCallbacksC1320m0M4125u.equals(this)) {
                throw new IllegalArgumentException("Setting " + abstractComponentCallbacksC1320m0 + " as the target of " + this + " would create a target cycle");
            }
        }
        if (abstractComponentCallbacksC1320m0 == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || abstractComponentCallbacksC1320m0.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = abstractComponentCallbacksC1320m0;
        } else {
            this.mTargetWho = abstractComponentCallbacksC1320m0.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i13;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z4) {
        AbstractC25106b.m73607j(this, z4);
        boolean z13 = false;
        if (!this.mUserVisibleHint && z4 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            AbstractC1329o1 abstractC1329o1 = this.mFragmentManager;
            C1366z1 c1366z1M4169g = abstractC1329o1.m4169g(this);
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1366z1M4169g.f5852c;
            if (abstractComponentCallbacksC1320m0.mDeferStart) {
                if (abstractC1329o1.f5716b) {
                    abstractC1329o1.f5709M = true;
                } else {
                    abstractComponentCallbacksC1320m0.mDeferStart = false;
                    c1366z1M4169g.m4256k();
                }
            }
        }
        this.mUserVisibleHint = z4;
        if (this.mState < 5 && !z4) {
            z13 = true;
        }
        this.mDeferStart = z13;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z4);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC1359x0 abstractC1359x0 = this.mHost;
        if (abstractC1359x0 != null) {
            return ActivityCompat.shouldShowRequestPermissionRationale(((C1336q0) abstractC1359x0).f5776E, str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i13) {
        startActivityForResult(intent, i13, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intent, int i13, Intent intent2, int i14, int i15, int i16, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException(AbstractC11266d.m30458l(this, "Fragment ", " not attached to Activity"));
        }
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i13 + " IntentSender: " + intent + " fillInIntent: " + intent2 + " options: " + bundle);
        }
        AbstractC1329o1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f5702F == null) {
            AbstractC1359x0 abstractC1359x0 = parentFragmentManager.f5738x;
            abstractC1359x0.getClass();
            AbstractC22676k.m65750j(intent, "intent");
            if (i13 != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            AbstractActivityC1340r0 abstractActivityC1340r0 = abstractC1359x0.f5826w;
            if (abstractActivityC1340r0 == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            ActivityCompat.startIntentSenderForResult(abstractActivityC1340r0, intent, i13, intent2, i14, i15, i16, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (AbstractC1329o1.m4132M(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        C5057p c5057p = new C5057p(intent);
        c5057p.m15870m(intent2);
        c5057p.m15871n(i15, i14);
        C21073l c21073lM15858a = c5057p.m15858a();
        parentFragmentManager.f5704H.addLast(new C1305i1(this.mWho, i13));
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.f5702F.mo4052a(c21073lM15858a, null);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !m4123s().f5648u) {
            return;
        }
        if (this.mHost == null) {
            m4123s().f5648u = false;
        } else if (Looper.myLooper() != this.mHost.f5828y.getLooper()) {
            this.mHost.f5828y.postAtFrontOfQueue(new RunnableC1346t(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m4124t() {
        EnumC1635w enumC1635w = this.mMaxState;
        return (enumC1635w == EnumC1635w.f6326x || this.mParentFragment == null) ? enumC1635w.ordinal() : Math.min(enumC1635w.ordinal(), this.mParentFragment.m4124t());
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder(128);
        sb4.append(getClass().getSimpleName());
        sb4.append("{");
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        sb4.append("} (");
        sb4.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb4.append(" id=0x");
            sb4.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb4.append(" tag=");
            sb4.append(this.mTag);
        }
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: u */
    public final AbstractComponentCallbacksC1320m0 m4125u(boolean z4) {
        String str;
        if (z4) {
            AbstractC25106b.m73604g(this);
        }
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.mTarget;
        if (abstractComponentCallbacksC1320m0 != null) {
            return abstractComponentCallbacksC1320m0;
        }
        AbstractC1329o1 abstractC1329o1 = this.mFragmentManager;
        if (abstractC1329o1 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return abstractC1329o1.f5717c.m4055b(str);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    /* JADX INFO: renamed from: v */
    public final void m4126v() {
        this.mLifecycleRegistry = new C1593i0(this);
        this.mSavedStateRegistryController = new C29048e(new C31183a(this, new C25262p(this, 10)));
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        AbstractC1308j0 abstractC1308j0 = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            abstractC1308j0.mo4065a();
        } else {
            this.mOnPreAttachedListeners.add(abstractC1308j0);
        }
    }

    /* JADX INFO: renamed from: x */
    public final C1272a0 m4127x(AbstractC22081b abstractC22081b, InterfaceC35450a interfaceC35450a, InterfaceC21063b interfaceC21063b) {
        if (this.mState > 1) {
            throw new IllegalStateException(AbstractC11266d.m30458l(this, "Fragment ", " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        C1300h0 c1300h0 = new C1300h0(this, interfaceC35450a, atomicReference, abstractC22081b, interfaceC21063b);
        if (this.mState >= 0) {
            c1300h0.mo4065a();
        } else {
            this.mOnPreAttachedListeners.add(c1300h0);
        }
        return new C1272a0(atomicReference);
    }

    @Deprecated
    public static AbstractComponentCallbacksC1320m0 instantiate(Context context, String str, Bundle bundle) {
        try {
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) AbstractC1356w0.m4243c(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return abstractComponentCallbacksC1320m0;
            }
            bundle.setClassLoader(abstractComponentCallbacksC1320m0.getClass().getClassLoader());
            abstractComponentCallbacksC1320m0.setArguments(bundle);
            return abstractComponentCallbacksC1320m0;
        } catch (IllegalAccessException e5) {
            throw new Fragment$InstantiationException(e5, AbstractC11895b.m31996o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"));
        } catch (InstantiationException e13) {
            throw new Fragment$InstantiationException(e13, AbstractC11895b.m31996o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"));
        } catch (NoSuchMethodException e14) {
            throw new Fragment$InstantiationException(e14, AbstractC11895b.m31996o("Unable to instantiate fragment ", str, ": could not find Fragment constructor"));
        } catch (InvocationTargetException e15) {
            throw new Fragment$InstantiationException(e15, AbstractC11895b.m31996o("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"));
        }
    }

    public final String getString(int i13, Object... objArr) {
        return getResources().getString(i13, objArr);
    }

    public final void postponeEnterTransition(long j7, TimeUnit timeUnit) {
        m4123s().f5648u = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        AbstractC1329o1 abstractC1329o1 = this.mFragmentManager;
        if (abstractC1329o1 != null) {
            this.mPostponedHandler = abstractC1329o1.f5738x.f5828y;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j7));
    }

    public final <I, O> AbstractC21065d registerForActivityResult(AbstractC22081b abstractC22081b, AbstractC21071j abstractC21071j, InterfaceC21063b interfaceC21063b) {
        return m4127x(abstractC22081b, new C1296g0(abstractC21071j), interfaceC21063b);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        AbstractC1359x0 abstractC1359x0 = this.mHost;
        if (abstractC1359x0 == null) {
            throw new IllegalStateException(AbstractC11266d.m30458l(this, "Fragment ", " not attached to Activity"));
        }
        AbstractC22676k.m65750j(intent, "intent");
        AbstractC32122c.startActivity(abstractC1359x0.f5827x, intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i13, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(AbstractC11266d.m30458l(this, "Fragment ", " not attached to Activity"));
        }
        AbstractC1329o1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f5701E != null) {
            parentFragmentManager.f5704H.addLast(new C1305i1(this.mWho, i13));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f5701E.mo4052a(intent, null);
            return;
        }
        AbstractC1359x0 abstractC1359x0 = parentFragmentManager.f5738x;
        abstractC1359x0.getClass();
        AbstractC22676k.m65750j(intent, "intent");
        if (i13 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        AbstractC32122c.startActivity(abstractC1359x0.f5827x, intent, bundle);
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC1359x0 abstractC1359x0 = this.mHost;
        if (abstractC1359x0 != null) {
            AbstractActivityC1340r0 abstractActivityC1340r0 = ((C1336q0) abstractC1359x0).f5776E;
            LayoutInflater layoutInflaterCloneInContext = abstractActivityC1340r0.getLayoutInflater().cloneInContext(abstractActivityC1340r0);
            layoutInflaterCloneInContext.setFactory2(this.mChildFragmentManager.f5720f);
            return layoutInflaterCloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public AbstractComponentCallbacksC1320m0(int i13) {
        this();
        this.mContentLayoutId = i13;
    }
}
