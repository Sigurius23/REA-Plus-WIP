package p161g;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.app.ComponentActivity;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.OnUserLeaveHintProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.fragment.app.C1289e1;
import androidx.lifecycle.AbstractC1590h1;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.C1593i0;
import androidx.lifecycle.C1646z1;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.FragmentC1598j1;
import androidx.lifecycle.InterfaceC1563a2;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1620r;
import androidx.room.AbstractC1772c1;
import bi.AbstractC3269g;
import com.whoop.android.R;
import eu.C13620k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import m83.C25262p;
import p027b3.C2472z1;
import p167g5.InterfaceC15482a;
import p184h5.C16888l;
import p184h5.C16891m;
import p184h5.C16894n;
import p184h5.InterfaceC16885k;
import p184h5.InterfaceC16897o;
import p205i.C17821a;
import p205i.InterfaceC17822b;
import p236j.AbstractC21065d;
import p236j.AbstractC21071j;
import p236j.InterfaceC21063b;
import p236j.InterfaceC21064c;
import p236j.InterfaceC21072k;
import p267k.AbstractC22081b;
import p298l8.AbstractC23420c;
import p298l8.C23422e;
import p399pb.C29044a;
import p399pb.C29047d;
import p399pb.C29048e;
import p399pb.InterfaceC29049f;
import p456rb.C31183a;
import p479s4.InterfaceC32129j;
import p479s4.InterfaceC32130k;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: g.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC14909l extends ComponentActivity implements InterfaceC1583f2, InterfaceC1620r, InterfaceC29049f, InterfaceC14897b0, InterfaceC21072k, InterfaceC21064c, InterfaceC32129j, InterfaceC32130k, OnNewIntentProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, OnUserLeaveHintProvider, InterfaceC16885k {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final C14903f Companion = new C14903f();
    private C1579e2 _viewModelStore;
    private final AbstractC21071j activityResultRegistry;
    private int contentLayoutId;
    private final C17821a contextAwareHelper;
    private final InterfaceC23462h defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final InterfaceC23462h fullyDrawnReporter$delegate;
    private final C16894n menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final InterfaceC23462h onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<InterfaceC15482a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC15482a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC15482a> onNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC15482a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC15482a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final InterfaceExecutorC14905h reportFullyDrawnExecutor;
    private final C29048e savedStateRegistryController;

    public AbstractActivityC14909l() {
        this.contextAwareHelper = new C17821a();
        this.menuHostHelper = new C16894n(new RunnableC14898c(this, 0));
        C31183a c31183a = new C31183a(this, new C25262p(this, 10));
        this.savedStateRegistryController = new C29048e(c31183a);
        this.reportFullyDrawnExecutor = new ViewTreeObserverOnDrawListenerC14906i(this);
        this.fullyDrawnReporter$delegate = AbstractC30060g.m92088H(new C14908k(this, 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new C14907j(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i13 = 0;
        getLifecycle().mo4986a(new InterfaceC1577e0(this) { // from class: g.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AbstractActivityC14909l f55574x;

            {
                this.f55574x = this;
            }

            @Override // androidx.lifecycle.InterfaceC1577e0
            /* JADX INFO: renamed from: h */
            public final void mo4080h(InterfaceC1585g0 interfaceC1585g0, EnumC1632v event) {
                Window window;
                View viewPeekDecorView;
                switch (i13) {
                    case 0:
                        AbstractC22676k.m65750j(interfaceC1585g0, "<anonymous parameter 0>");
                        AbstractC22676k.m65750j(event, "event");
                        if (event == EnumC1632v.ON_STOP && (window = this.f55574x.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC14909l.m42999k(this.f55574x, interfaceC1585g0, event);
                        break;
                }
            }
        });
        final int i14 = 1;
        getLifecycle().mo4986a(new InterfaceC1577e0(this) { // from class: g.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AbstractActivityC14909l f55574x;

            {
                this.f55574x = this;
            }

            @Override // androidx.lifecycle.InterfaceC1577e0
            /* JADX INFO: renamed from: h */
            public final void mo4080h(InterfaceC1585g0 interfaceC1585g0, EnumC1632v event) {
                Window window;
                View viewPeekDecorView;
                switch (i14) {
                    case 0:
                        AbstractC22676k.m65750j(interfaceC1585g0, "<anonymous parameter 0>");
                        AbstractC22676k.m65750j(event, "event");
                        if (event == EnumC1632v.ON_STOP && (window = this.f55574x.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC14909l.m42999k(this.f55574x, interfaceC1585g0, event);
                        break;
                }
            }
        });
        getLifecycle().mo4986a(new C29044a(this, i14));
        c31183a.m95914a();
        AbstractC1613o1.m5016f(this);
        getSavedStateRegistry().m88293c(ACTIVITY_RESULT_TAG, new C2472z1(this, 1));
        addOnContextAvailableListener(new InterfaceC17822b() { // from class: g.e
            @Override // p205i.InterfaceC17822b
            /* JADX INFO: renamed from: a */
            public final void mo4199a(AbstractActivityC14909l abstractActivityC14909l) {
                AbstractActivityC14909l.m42998j(this.f55579a, abstractActivityC14909l);
            }
        });
        this.defaultViewModelProviderFactory$delegate = AbstractC30060g.m92088H(new C14908k(this, 0));
        this.onBackPressedDispatcher$delegate = AbstractC30060g.m92088H(new C14908k(this, 2));
    }

    public static final void access$ensureViewModelStore(AbstractActivityC14909l abstractActivityC14909l) {
        if (abstractActivityC14909l._viewModelStore == null) {
            C14904g c14904g = (C14904g) abstractActivityC14909l.getLastNonConfigurationInstance();
            if (c14904g != null) {
                abstractActivityC14909l._viewModelStore = c14904g.f55581b;
            }
            if (abstractActivityC14909l._viewModelStore == null) {
                abstractActivityC14909l._viewModelStore = new C1579e2();
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    /* JADX INFO: renamed from: j */
    public static void m42998j(AbstractActivityC14909l abstractActivityC14909l, Context it) {
        AbstractC22676k.m65750j(it, "it");
        Bundle bundleM88291a = abstractActivityC14909l.getSavedStateRegistry().m88291a(ACTIVITY_RESULT_TAG);
        if (bundleM88291a != null) {
            AbstractC21071j abstractC21071j = abstractActivityC14909l.activityResultRegistry;
            LinkedHashMap linkedHashMap = abstractC21071j.f79931b;
            LinkedHashMap linkedHashMap2 = abstractC21071j.f79930a;
            Bundle bundle = abstractC21071j.f79936g;
            ArrayList<Integer> integerArrayList = bundleM88291a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleM88291a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleM88291a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                abstractC21071j.f79933d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleM88291a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                String str = stringArrayList.get(i13);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        AbstractC22681m0.m65772c(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i13);
                AbstractC22676k.m65749i(num2, "rcs[i]");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i13);
                AbstractC22676k.m65749i(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                abstractC21071j.f79931b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m42999k(AbstractActivityC14909l abstractActivityC14909l, InterfaceC1585g0 interfaceC1585g0, EnumC1632v event) {
        AbstractC22676k.m65750j(interfaceC1585g0, "<anonymous parameter 0>");
        AbstractC22676k.m65750j(event, "event");
        if (event == EnumC1632v.ON_DESTROY) {
            abstractActivityC14909l.contextAwareHelper.f69308b = null;
            if (!abstractActivityC14909l.isChangingConfigurations()) {
                abstractActivityC14909l.getViewModelStore().m4975a();
            }
            ViewTreeObserverOnDrawListenerC14906i viewTreeObserverOnDrawListenerC14906i = (ViewTreeObserverOnDrawListenerC14906i) abstractActivityC14909l.reportFullyDrawnExecutor;
            AbstractActivityC14909l abstractActivityC14909l2 = viewTreeObserverOnDrawListenerC14906i.f55585z;
            abstractActivityC14909l2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC14906i);
            abstractActivityC14909l2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC14906i);
        }
    }

    /* JADX INFO: renamed from: l */
    public static Bundle m43000l(AbstractActivityC14909l abstractActivityC14909l) {
        Bundle bundle = new Bundle();
        AbstractC21071j abstractC21071j = abstractActivityC14909l.activityResultRegistry;
        abstractC21071j.getClass();
        LinkedHashMap linkedHashMap = abstractC21071j.f79931b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC21071j.f79933d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(abstractC21071j.f79936g));
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC14905h interfaceExecutorC14905h = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC22676k.m65749i(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC14906i) interfaceExecutorC14905h).m42996a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // p184h5.InterfaceC16885k
    public void addMenuProvider(InterfaceC16897o provider) {
        AbstractC22676k.m65750j(provider, "provider");
        C16894n c16894n = this.menuHostHelper;
        c16894n.f64846b.add(provider);
        c16894n.f64845a.run();
    }

    @Override // p479s4.InterfaceC32129j
    public final void addOnConfigurationChangedListener(InterfaceC15482a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(InterfaceC17822b listener) {
        AbstractC22676k.m65750j(listener, "listener");
        C17821a c17821a = this.contextAwareHelper;
        c17821a.getClass();
        AbstractActivityC14909l abstractActivityC14909l = c17821a.f69308b;
        if (abstractActivityC14909l != null) {
            listener.mo4199a(abstractActivityC14909l);
        }
        c17821a.f69307a.add(listener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(InterfaceC15482a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(InterfaceC15482a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(InterfaceC15482a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // p479s4.InterfaceC32130k
    public final void addOnTrimMemoryListener(InterfaceC15482a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void addOnUserLeaveHintListener(Runnable listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // p236j.InterfaceC21072k
    public final AbstractC21071j getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC1620r
    public AbstractC23420c getDefaultViewModelCreationExtras() {
        C23422e c23422e = new C23422e(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c23422e.f92772a;
        if (application != null) {
            Application application2 = getApplication();
            AbstractC22676k.m65749i(application2, "application");
            linkedHashMap.put(C1646z1.f6353d, application2);
        }
        linkedHashMap.put(AbstractC1613o1.f6291a, this);
        linkedHashMap.put(AbstractC1613o1.f6292b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(AbstractC1613o1.f6293c, extras);
        }
        return c23422e;
    }

    @Override // androidx.lifecycle.InterfaceC1620r
    public InterfaceC1563a2 getDefaultViewModelProviderFactory() {
        return (InterfaceC1563a2) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public C14916s getFullyDrawnReporter() {
        return (C14916s) this.fullyDrawnReporter$delegate.getValue();
    }

    @InterfaceC23457c
    public Object getLastCustomNonConfigurationInstance() {
        C14904g c14904g = (C14904g) getLastNonConfigurationInstance();
        if (c14904g != null) {
            return c14904g.f55580a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.InterfaceC1585g0
    public AbstractC1638x getLifecycle() {
        return super.getLifecycle();
    }

    @Override // p161g.InterfaceC14897b0
    public final C14923z getOnBackPressedDispatcher() {
        return (C14923z) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // p399pb.InterfaceC29049f
    public final C29047d getSavedStateRegistry() {
        return this.savedStateRegistryController.f117551b;
    }

    @Override // androidx.lifecycle.InterfaceC1583f2
    public C1579e2 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            C14904g c14904g = (C14904g) getLastNonConfigurationInstance();
            if (c14904g != null) {
                this._viewModelStore = c14904g.f55581b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new C1579e2();
            }
        }
        C1579e2 c1579e2 = this._viewModelStore;
        AbstractC22676k.m65747g(c1579e2);
        return c1579e2;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        AbstractC22676k.m65749i(decorView, "window.decorView");
        AbstractC1613o1.m5024n(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC22676k.m65749i(decorView2, "window.decorView");
        AbstractC1613o1.m5025o(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC22676k.m65749i(decorView3, "window.decorView");
        AbstractC34132o.m107862G(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC22676k.m65749i(decorView4, "window.decorView");
        AbstractC1772c1.m5376M(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC22676k.m65749i(decorView5, "window.decorView");
        AbstractC3269g.m9492W(decorView5, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i13, int i14, Intent intent) {
        if (this.activityResultRegistry.m58912a(i13, i14, intent)) {
            return;
        }
        super.onActivityResult(i13, i14, intent);
    }

    @Override // android.app.Activity
    @InterfaceC23457c
    public void onBackPressed() {
        getOnBackPressedDispatcher().m43018d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC22676k.m65750j(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<InterfaceC15482a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.m88295a(bundle);
        C17821a c17821a = this.contextAwareHelper;
        c17821a.getClass();
        c17821a.f69308b = this;
        Iterator it = c17821a.f69307a.iterator();
        while (it.hasNext()) {
            ((InterfaceC17822b) it.next()).mo4199a(this);
        }
        super.onCreate(bundle);
        int i13 = FragmentC1598j1.f6263x;
        AbstractC1590h1.m4981b(this);
        int i14 = this.contentLayoutId;
        if (i14 != 0) {
            setContentView(i14);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i13, Menu menu) {
        AbstractC22676k.m65750j(menu, "menu");
        if (i13 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i13, menu);
        C16894n c16894n = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = c16894n.f64846b.iterator();
        while (it.hasNext()) {
            ((C1289e1) ((InterfaceC16897o) it.next())).f5593a.m4177k(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i13, MenuItem item) {
        AbstractC22676k.m65750j(item, "item");
        if (super.onMenuItemSelected(i13, item)) {
            return true;
        }
        if (i13 == 0) {
            return this.menuHostHelper.m47563a(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @InterfaceC23457c
    public void onMultiWindowModeChanged(boolean z4) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC15482a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new MultiWindowModeChangedInfo(z4));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC22676k.m65750j(intent, "intent");
        super.onNewIntent(intent);
        Iterator<InterfaceC15482a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i13, Menu menu) {
        AbstractC22676k.m65750j(menu, "menu");
        Iterator it = this.menuHostHelper.f64846b.iterator();
        while (it.hasNext()) {
            ((C1289e1) ((InterfaceC16897o) it.next())).f5593a.m4186q(menu);
        }
        super.onPanelClosed(i13, menu);
    }

    @Override // android.app.Activity
    @InterfaceC23457c
    public void onPictureInPictureModeChanged(boolean z4) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC15482a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new PictureInPictureModeChangedInfo(z4));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i13, View view, Menu menu) {
        AbstractC22676k.m65750j(menu, "menu");
        if (i13 != 0) {
            return true;
        }
        super.onPreparePanel(i13, view, menu);
        Iterator it = this.menuHostHelper.f64846b.iterator();
        while (it.hasNext()) {
            ((C1289e1) ((InterfaceC16897o) it.next())).f5593a.m4189t(menu);
        }
        return true;
    }

    @Override // android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i13, String[] permissions, int[] grantResults) {
        AbstractC22676k.m65750j(permissions, "permissions");
        AbstractC22676k.m65750j(grantResults, "grantResults");
        if (this.activityResultRegistry.m58912a(i13, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i13, permissions, grantResults);
    }

    @InterfaceC23457c
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C14904g c14904g;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C1579e2 c1579e2 = this._viewModelStore;
        if (c1579e2 == null && (c14904g = (C14904g) getLastNonConfigurationInstance()) != null) {
            c1579e2 = c14904g.f55581b;
        }
        if (c1579e2 == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C14904g c14904g2 = new C14904g();
        c14904g2.f55580a = objOnRetainCustomNonConfigurationInstance;
        c14904g2.f55581b = c1579e2;
        return c14904g2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC22676k.m65750j(outState, "outState");
        if (getLifecycle() instanceof C1593i0) {
            AbstractC1638x lifecycle = getLifecycle();
            AbstractC22676k.m65748h(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C1593i0) lifecycle).m4993i(EnumC1635w.f6327y);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.m88296b(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i13) {
        super.onTrimMemory(i13);
        Iterator<InterfaceC15482a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i13));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f69308b;
    }

    public final <I, O> AbstractC21065d registerForActivityResult(AbstractC22081b contract, AbstractC21071j registry, InterfaceC21063b callback) {
        AbstractC22676k.m65750j(contract, "contract");
        AbstractC22676k.m65750j(registry, "registry");
        AbstractC22676k.m65750j(callback, "callback");
        return registry.m58913c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // p184h5.InterfaceC16885k
    public void removeMenuProvider(InterfaceC16897o provider) {
        AbstractC22676k.m65750j(provider, "provider");
        this.menuHostHelper.m47564b(provider);
    }

    @Override // p479s4.InterfaceC32129j
    public final void removeOnConfigurationChangedListener(InterfaceC15482a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(InterfaceC17822b listener) {
        AbstractC22676k.m65750j(listener, "listener");
        C17821a c17821a = this.contextAwareHelper;
        c17821a.getClass();
        c17821a.f69307a.remove(listener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(InterfaceC15482a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(InterfaceC15482a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC15482a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // p479s4.InterfaceC32130k
    public final void removeOnTrimMemoryListener(InterfaceC15482a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    @Override // androidx.core.app.OnUserLeaveHintProvider
    public final void removeOnUserLeaveHintListener(Runnable listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC29125c.m88496E()) {
                Trace.beginSection(AbstractC29125c.m88517Z("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().m43006a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i13) {
        initializeViewTreeOwners();
        InterfaceExecutorC14905h interfaceExecutorC14905h = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC22676k.m65749i(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC14906i) interfaceExecutorC14905h).m42996a(decorView);
        super.setContentView(i13);
    }

    @Override // android.app.Activity
    @InterfaceC23457c
    public void startActivityForResult(Intent intent, int i13) {
        AbstractC22676k.m65750j(intent, "intent");
        super.startActivityForResult(intent, i13);
    }

    @Override // android.app.Activity
    @InterfaceC23457c
    public void startIntentSenderForResult(IntentSender intent, int i13, Intent intent2, int i14, int i15, int i16) throws IntentSender.SendIntentException {
        AbstractC22676k.m65750j(intent, "intent");
        super.startIntentSenderForResult(intent, i13, intent2, i14, i15, i16);
    }

    @Override // android.app.Activity
    @InterfaceC23457c
    public void startActivityForResult(Intent intent, int i13, Bundle bundle) {
        AbstractC22676k.m65750j(intent, "intent");
        super.startActivityForResult(intent, i13, bundle);
    }

    @Override // android.app.Activity
    @InterfaceC23457c
    public void startIntentSenderForResult(IntentSender intent, int i13, Intent intent2, int i14, int i15, int i16, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC22676k.m65750j(intent, "intent");
        super.startIntentSenderForResult(intent, i13, intent2, i14, i15, i16, bundle);
    }

    @Override // p236j.InterfaceC21064c
    public final <I, O> AbstractC21065d registerForActivityResult(AbstractC22081b contract, InterfaceC21063b callback) {
        AbstractC22676k.m65750j(contract, "contract");
        AbstractC22676k.m65750j(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z4, Configuration newConfig) {
        AbstractC22676k.m65750j(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z4, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC15482a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new MultiWindowModeChangedInfo(z4, newConfig));
            }
        } catch (Throwable th3) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th3;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z4, Configuration newConfig) {
        AbstractC22676k.m65750j(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z4, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC15482a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new PictureInPictureModeChangedInfo(z4, newConfig));
            }
        } catch (Throwable th3) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th3;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        InterfaceExecutorC14905h interfaceExecutorC14905h = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC22676k.m65749i(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC14906i) interfaceExecutorC14905h).m42996a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(InterfaceC16897o provider, InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(provider, "provider");
        AbstractC22676k.m65750j(owner, "owner");
        C16894n c16894n = this.menuHostHelper;
        c16894n.f64846b.add(provider);
        c16894n.f64845a.run();
        AbstractC1638x lifecycle = owner.getLifecycle();
        HashMap map = c16894n.f64847c;
        C16891m c16891m = (C16891m) map.remove(provider);
        if (c16891m != null) {
            c16891m.m47560a();
        }
        map.put(provider, new C16891m(lifecycle, new C13620k(1, c16894n, provider)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC14905h interfaceExecutorC14905h = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC22676k.m65749i(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC14906i) interfaceExecutorC14905h).m42996a(decorView);
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(InterfaceC16897o provider, InterfaceC1585g0 owner, EnumC1635w state) {
        AbstractC22676k.m65750j(provider, "provider");
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC22676k.m65750j(state, "state");
        C16894n c16894n = this.menuHostHelper;
        c16894n.getClass();
        AbstractC1638x lifecycle = owner.getLifecycle();
        HashMap map = c16894n.f64847c;
        C16891m c16891m = (C16891m) map.remove(provider);
        if (c16891m != null) {
            c16891m.m47560a();
        }
        map.put(provider, new C16891m(lifecycle, new C16888l(c16894n, state, provider, 0)));
    }

    public AbstractActivityC14909l(int i13) {
        this();
        this.contentLayoutId = R.layout.stripe_activity_lite;
    }
}
