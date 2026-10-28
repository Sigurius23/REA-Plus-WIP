package p474s;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import p314m.C24836e;
import p314m.C24844i;
import p314m.DialogInterfaceC24846j;

/* JADX INFO: renamed from: s.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class DialogInterfaceOnClickListenerC31949e0 implements InterfaceC31973k0, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: w */
    public DialogInterfaceC24846j f132656w;

    /* JADX INFO: renamed from: x */
    public C31953f0 f132657x;

    /* JADX INFO: renamed from: y */
    public CharSequence f132658y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C31977l0 f132659z;

    public DialogInterfaceOnClickListenerC31949e0(C31977l0 c31977l0) {
        this.f132659z = c31977l0;
    }

    @Override // p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: a */
    public final boolean mo99431a() {
        DialogInterfaceC24846j dialogInterfaceC24846j = this.f132656w;
        if (dialogInterfaceC24846j != null) {
            return dialogInterfaceC24846j.isShowing();
        }
        return false;
    }

    @Override // p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: b */
    public final int mo99432b() {
        return 0;
    }

    @Override // p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: d */
    public final void mo99433d(int i13) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p474s.InterfaceC31973k0
    public final void dismiss() {
        DialogInterfaceC24846j dialogInterfaceC24846j = this.f132656w;
        if (dialogInterfaceC24846j != null) {
            dialogInterfaceC24846j.dismiss();
            this.f132656w = null;
        }
    }

    @Override // p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: e */
    public final CharSequence mo99434e() {
        return this.f132658y;
    }

    @Override // p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: f */
    public final Drawable mo99435f() {
        return null;
    }

    @Override // p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: g */
    public final void mo99436g(CharSequence charSequence) {
        this.f132658y = charSequence;
    }

    @Override // p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: h */
    public final void mo99437h(int i13) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: i */
    public final void mo99438i(int i13) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: j */
    public final void mo99439j(int i13, int i14) {
        if (this.f132657x == null) {
            return;
        }
        C31977l0 c31977l0 = this.f132659z;
        C24844i c24844i = new C24844i(c31977l0.getPopupContext());
        CharSequence charSequence = this.f132658y;
        if (charSequence != null) {
            c24844i.setTitle(charSequence);
        }
        C31953f0 c31953f0 = this.f132657x;
        int selectedItemPosition = c31977l0.getSelectedItemPosition();
        C24836e c24836e = c24844i.f97324a;
        c24836e.f97272q = c31953f0;
        c24836e.f97273r = this;
        c24836e.f97276u = selectedItemPosition;
        c24836e.f97275t = true;
        DialogInterfaceC24846j dialogInterfaceC24846jCreate = c24844i.create();
        this.f132656w = dialogInterfaceC24846jCreate;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC24846jCreate.f97334F.f97302f;
        alertController$RecycleListView.setTextDirection(i13);
        alertController$RecycleListView.setTextAlignment(i14);
        this.f132656w.show();
    }

    @Override // p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: k */
    public final int mo99440k() {
        return 0;
    }

    @Override // p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: l */
    public final void mo99441l(ListAdapter listAdapter) {
        this.f132657x = (C31953f0) listAdapter;
    }

    @Override // p474s.InterfaceC31973k0
    /* JADX INFO: renamed from: n */
    public final void mo99442n(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        C31977l0 c31977l0 = this.f132659z;
        c31977l0.setSelection(i13);
        if (c31977l0.getOnItemClickListener() != null) {
            c31977l0.performItemClick(null, i13, this.f132657x.getItemId(i13));
        }
        dismiss();
    }
}
