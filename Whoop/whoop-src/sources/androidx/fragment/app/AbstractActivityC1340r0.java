package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;
import androidx.lifecycle.C1593i0;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.EnumC1635w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p161g.AbstractActivityC14909l;
import p167g5.InterfaceC15482a;
import p205i.InterfaceC17822b;
import p360o8.AbstractC27650b;

/* JADX INFO: renamed from: androidx.fragment.app.r0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1340r0 extends AbstractActivityC14909l implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final C1353v0 mFragments = new C1353v0(new C1336q0(this));
    final C1593i0 mFragmentLifecycleRegistry = new C1593i0(this);
    boolean mStopped = true;

    public AbstractActivityC1340r0() {
        getSavedStateRegistry().m88293c(LIFECYCLE_TAG, new C1324n0(this, 0));
        final int i13 = 0;
        addOnConfigurationChangedListener(new InterfaceC15482a(this) { // from class: androidx.fragment.app.o0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractActivityC1340r0 f5696b;

            {
                this.f5696b = this;
            }

            @Override // p167g5.InterfaceC15482a
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        this.f5696b.mFragments.m4231a();
                        break;
                    default:
                        this.f5696b.mFragments.m4231a();
                        break;
                }
            }
        });
        final int i14 = 1;
        addOnNewIntentListener(new InterfaceC15482a(this) { // from class: androidx.fragment.app.o0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractActivityC1340r0 f5696b;

            {
                this.f5696b = this;
            }

            @Override // p167g5.InterfaceC15482a
            public final void accept(Object obj) {
                switch (i14) {
                    case 0:
                        this.f5696b.mFragments.m4231a();
                        break;
                    default:
                        this.f5696b.mFragments.m4231a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new InterfaceC17822b() { // from class: androidx.fragment.app.p0
            @Override // p205i.InterfaceC17822b
            /* JADX INFO: renamed from: a */
            public final void mo4199a(AbstractActivityC14909l abstractActivityC14909l) {
                C1336q0 c1336q0 = this.f5748a.mFragments.f5816a;
                c1336q0.f5829z.m4159b(c1336q0, c1336q0, null);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static boolean m4211m(AbstractC1329o1 abstractC1329o1) {
        EnumC1635w enumC1635w = EnumC1635w.f6327y;
        boolean zM4211m = false;
        for (AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 : abstractC1329o1.f5717c.m4059f()) {
            if (abstractComponentCallbacksC1320m0 != null) {
                if (abstractComponentCallbacksC1320m0.getHost() != null) {
                    zM4211m |= m4211m(abstractComponentCallbacksC1320m0.getChildFragmentManager());
                }
                C1318l2 c1318l2 = abstractComponentCallbacksC1320m0.mViewLifecycleOwner;
                if (c1318l2 != null) {
                    c1318l2.m4121b();
                    if (c1318l2.f5669E.f6250d.compareTo(EnumC1635w.f6328z) >= 0) {
                        abstractComponentCallbacksC1320m0.mViewLifecycleOwner.f5669E.m4993i(enumC1635w);
                        zM4211m = true;
                    }
                }
                if (abstractComponentCallbacksC1320m0.mLifecycleRegistry.f6250d.compareTo(EnumC1635w.f6328z) >= 0) {
                    abstractComponentCallbacksC1320m0.mLifecycleRegistry.m4993i(enumC1635w);
                    zM4211m = true;
                }
            }
        }
        return zM4211m;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f5816a.f5829z.f5720f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                AbstractC27650b.m83607a(this).m83613c(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.f5816a.f5829z.m4191v(str, fileDescriptor, printWriter, strArr);
        }
    }

    public AbstractC1329o1 getSupportFragmentManager() {
        return this.mFragments.f5816a.f5829z;
    }

    @Deprecated
    public AbstractC27650b getSupportLoaderManager() {
        return AbstractC27650b.m83607a(this);
    }

    public void markFragmentsCreated() {
        AbstractC1329o1 supportFragmentManager;
        do {
            supportFragmentManager = getSupportFragmentManager();
            EnumC1635w enumC1635w = EnumC1635w.f6325w;
        } while (m4211m(supportFragmentManager));
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity
    public void onActivityResult(int i13, int i14, Intent intent) {
        this.mFragments.m4231a();
        super.onActivityResult(i13, i14, intent);
    }

    @Deprecated
    public void onAttachFragment(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
    }

    @Override // p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m4991g(EnumC1632v.ON_CREATE);
        C1333p1 c1333p1 = this.mFragments.f5816a.f5829z;
        c1333p1.f5706J = false;
        c1333p1.f5707K = false;
        c1333p1.f5713Q.f5809F = false;
        c1333p1.m4190u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f5816a.f5829z.m4178l();
        this.mFragmentLifecycleRegistry.m4991g(EnumC1632v.ON_DESTROY);
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i13, MenuItem menuItem) {
        if (super.onMenuItemSelected(i13, menuItem)) {
            return true;
        }
        if (i13 == 6) {
            return this.mFragments.f5816a.f5829z.m4175j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f5816a.f5829z.m4190u(5);
        this.mFragmentLifecycleRegistry.m4991g(EnumC1632v.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i13, String[] strArr, int[] iArr) {
        this.mFragments.m4231a();
        super.onRequestPermissionsResult(i13, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m4231a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f5816a.f5829z.m4195z(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m4991g(EnumC1632v.ON_RESUME);
        C1333p1 c1333p1 = this.mFragments.f5816a.f5829z;
        c1333p1.f5706J = false;
        c1333p1.f5707K = false;
        c1333p1.f5713Q.f5809F = false;
        c1333p1.m4190u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m4231a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            C1333p1 c1333p1 = this.mFragments.f5816a.f5829z;
            c1333p1.f5706J = false;
            c1333p1.f5707K = false;
            c1333p1.f5713Q.f5809F = false;
            c1333p1.m4190u(4);
        }
        this.mFragments.f5816a.f5829z.m4195z(true);
        this.mFragmentLifecycleRegistry.m4991g(EnumC1632v.ON_START);
        C1333p1 c1333p2 = this.mFragments.f5816a.f5829z;
        c1333p2.f5706J = false;
        c1333p2.f5707K = false;
        c1333p2.f5713Q.f5809F = false;
        c1333p2.m4190u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m4231a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        C1333p1 c1333p1 = this.mFragments.f5816a.f5829z;
        c1333p1.f5707K = true;
        c1333p1.f5713Q.f5809F = true;
        c1333p1.m4190u(4);
        this.mFragmentLifecycleRegistry.m4991g(EnumC1632v.ON_STOP);
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ActivityCompat.setEnterSharedElementCallback(this, sharedElementCallback);
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ActivityCompat.setExitSharedElementCallback(this, sharedElementCallback);
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, Intent intent, int i13) {
        startActivityFromFragment(abstractComponentCallbacksC1320m0, intent, i13, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, IntentSender intentSender, int i13, Intent intent, int i14, int i15, int i16, Bundle bundle) throws IntentSender.SendIntentException {
        if (i13 == -1) {
            ActivityCompat.startIntentSenderForResult(this, intentSender, i13, intent, i14, i15, i16, bundle);
        } else {
            abstractComponentCallbacksC1320m0.startIntentSenderForResult(intentSender, i13, intent, i14, i15, i16, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        ActivityCompat.finishAfterTransition(this);
    }

    public void supportPostponeEnterTransition() {
        ActivityCompat.postponeEnterTransition(this);
    }

    public void supportStartPostponedEnterTransition() {
        ActivityCompat.startPostponedEnterTransition(this);
    }

    @Override // androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i13) {
    }

    public void startActivityFromFragment(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, Intent intent, int i13, Bundle bundle) {
        if (i13 == -1) {
            ActivityCompat.startActivityForResult(this, intent, -1, bundle);
        } else {
            abstractComponentCallbacksC1320m0.startActivityForResult(intent, i13, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }
}
