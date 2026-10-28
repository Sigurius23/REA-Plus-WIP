package androidx.fragment.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.InterfaceC1633v0;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p161g.DialogC14910m;
import p505ts.AbstractC34132o;

/* JADX INFO: renamed from: androidx.fragment.app.y */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC1361y extends AbstractComponentCallbacksC1320m0 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDismissed;
    private Handler mHandler;
    private boolean mShownByMe;
    private boolean mViewDestroyed;
    private Runnable mDismissRunnable = new RunnableC1346t(this, 0);
    private DialogInterface.OnCancelListener mOnCancelListener = new DialogInterfaceOnCancelListenerC1349u(this);
    private DialogInterface.OnDismissListener mOnDismissListener = new DialogInterfaceOnDismissListenerC1352v(this);
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mCancelable = true;
    private boolean mShowsDialog = true;
    private int mBackStackId = -1;
    private InterfaceC1633v0 mObserver = new C1355w(this);
    private boolean mDialogCreated = false;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public AbstractC1350u0 createFragmentContainer() {
        return new C1358x(this, super.createFragmentContainer());
    }

    public void dismiss() {
        m4245y(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        m4245y(true, false, false);
    }

    public void dismissNow() {
        m4245y(false, false, true);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (AbstractC1329o1.m4132M(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC14910m(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (AbstractC1329o1.m4132M(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m4245y(true, true, false);
    }

    public View onFindViewById(int i13) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i13);
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z4 = this.mShowsDialog;
        if (z4 && !this.mCreatingDialog) {
            if (z4 && !this.mDialogCreated) {
                try {
                    this.mCreatingDialog = true;
                    Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                    this.mDialog = dialogOnCreateDialog;
                    if (this.mShowsDialog) {
                        setupDialog(dialogOnCreateDialog, this.mStyle);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.mDialog.setOwnerActivity((Activity) context);
                        }
                        this.mDialog.setCancelable(this.mCancelable);
                        this.mDialog.setOnCancelListener(this.mOnCancelListener);
                        this.mDialog.setOnDismissListener(this.mOnDismissListener);
                        this.mDialogCreated = true;
                    } else {
                        this.mDialog = null;
                    }
                    this.mCreatingDialog = false;
                } catch (Throwable th3) {
                    this.mCreatingDialog = false;
                    throw th3;
                }
            }
            if (AbstractC1329o1.m4132M(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (AbstractC1329o1.m4132M(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.mShowsDialog) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterOnGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i13 = this.mStyle;
        if (i13 != 0) {
            bundle.putInt(SAVED_STYLE, i13);
        }
        int i14 = this.mTheme;
        if (i14 != 0) {
            bundle.putInt(SAVED_THEME, i14);
        }
        boolean z4 = this.mCancelable;
        if (!z4) {
            bundle.putBoolean(SAVED_CANCELABLE, z4);
        }
        boolean z13 = this.mShowsDialog;
        if (!z13) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z13);
        }
        int i15 = this.mBackStackId;
        if (i15 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i15);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            AbstractC1613o1.m5024n(decorView, this);
            AbstractC1613o1.m5025o(decorView, this);
            AbstractC34132o.m107862G(decorView, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final DialogC14910m requireComponentDialog() {
        Dialog dialogRequireDialog = requireDialog();
        if (dialogRequireDialog instanceof DialogC14910m) {
            return (DialogC14910m) dialogRequireDialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + dialogRequireDialog);
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z4) {
        this.mCancelable = z4;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z4);
        }
    }

    public void setShowsDialog(boolean z4) {
        this.mShowsDialog = z4;
    }

    public void setStyle(int i13, int i14) {
        if (AbstractC1329o1.m4132M(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i13 + ", " + i14);
        }
        this.mStyle = i13;
        if (i13 == 2 || i13 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i14 != 0) {
            this.mTheme = i14;
        }
    }

    public void setupDialog(Dialog dialog, int i13) {
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(AbstractC1329o1 abstractC1329o1, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C1271a c1271aM94758g = AbstractC30802r.m94758g(abstractC1329o1, abstractC1329o1);
        c1271aM94758g.f5578r = true;
        c1271aM94758g.mo4042d(0, this, str, 1);
        c1271aM94758g.m4046j();
    }

    public void showNow(AbstractC1329o1 abstractC1329o1, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        C1271a c1271aM94758g = AbstractC30802r.m94758g(abstractC1329o1, abstractC1329o1);
        c1271aM94758g.f5578r = true;
        c1271aM94758g.mo4042d(0, this, str, 1);
        c1271aM94758g.m4048l();
    }

    /* JADX INFO: renamed from: y */
    public final void m4245y(boolean z4, boolean z13, boolean z14) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z13) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId < 0) {
            AbstractC1329o1 parentFragmentManager = getParentFragmentManager();
            C1271a c1271aM94758g = AbstractC30802r.m94758g(parentFragmentManager, parentFragmentManager);
            c1271aM94758g.f5578r = true;
            c1271aM94758g.m4050n(this);
            if (z14) {
                c1271aM94758g.m4048l();
                return;
            } else if (z4) {
                c1271aM94758g.m4047k(true, true);
                return;
            } else {
                c1271aM94758g.m4046j();
                return;
            }
        }
        if (z14) {
            AbstractC1329o1 parentFragmentManager2 = getParentFragmentManager();
            int i13 = this.mBackStackId;
            if (i13 < 0) {
                parentFragmentManager2.getClass();
                throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Bad id: "));
            }
            parentFragmentManager2.m4151U(i13, 1);
        } else {
            AbstractC1329o1 parentFragmentManager3 = getParentFragmentManager();
            int i14 = this.mBackStackId;
            parentFragmentManager3.getClass();
            if (i14 < 0) {
                throw new IllegalArgumentException(AbstractC2875y.m8295h(i14, "Bad id: "));
            }
            parentFragmentManager3.m4193x(new C1317l1(parentFragmentManager3, null, i14, 1), z4);
        }
        this.mBackStackId = -1;
    }

    public int show(AbstractC1282c2 abstractC1282c2, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC1282c2.mo4042d(0, this, str, 1);
        this.mViewDestroyed = false;
        int iM4047k = ((C1271a) abstractC1282c2).m4047k(false, true);
        this.mBackStackId = iM4047k;
        return iM4047k;
    }
}
