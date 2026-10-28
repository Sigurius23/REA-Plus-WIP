package hj0;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y;
import com.whoop.p069ui.C10594l;
import e50.C12723b;
import xg3.InterfaceC38293t;
import z82.C40191e;
import z82.InterfaceC40188b;

/* JADX INFO: renamed from: hj0.g */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public abstract class AbstractC17348g extends DialogInterfaceOnCancelListenerC1361y {

    /* JADX INFO: renamed from: z */
    private boolean f67239z;

    /* JADX INFO: renamed from: w */
    private C10594l f67236w = new C10594l();

    /* JADX INFO: renamed from: x */
    private C10594l f67237x = new C10594l();

    /* JADX INFO: renamed from: y */
    private C40191e f67238y = C12723b.m35566a().m35567b().getDispatcher();

    /* JADX INFO: renamed from: E */
    public InterfaceC40188b f67235E = C12723b.m35566a().m35567b();

    public AbstractC17348g() {
        setArguments(new Bundle());
    }

    /* JADX INFO: renamed from: C */
    private void m49106C() {
        String strMo26762A = mo26762A();
        if (TextUtils.isEmpty(strMo26762A)) {
            return;
        }
        C12723b.m35566a().m35567b().mo41425g(strMo26762A);
    }

    /* JADX INFO: renamed from: A */
    public String mo26762A() {
        return null;
    }

    /* JADX INFO: renamed from: B */
    public AbstractActivityC1340r0 m49107B() {
        return requireActivity();
    }

    /* JADX INFO: renamed from: D */
    public void m49108D() {
        this.f67237x.m27331b();
    }

    public C40191e getEventDispatcher() {
        return this.f67238y;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public Dialog onCreateDialog(Bundle bundle) {
        this.f67239z = true;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.requestWindowFeature(1);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroy() {
        super.onDestroy();
        this.f67236w.m27331b();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        super.onDestroyView();
        m49108D();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        if (getUserVisibleHint()) {
            m49106C();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void setUserVisibleHint(boolean z4) {
        super.setUserVisibleHint(z4);
        if (z4) {
            m49106C();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m49109z(InterfaceC38293t interfaceC38293t) {
        this.f67237x.m27330a(interfaceC38293t);
    }
}
