package p444r;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.android.R;
import p314m.C24836e;
import p314m.C24844i;
import p314m.DialogInterfaceC24846j;

/* JADX INFO: renamed from: r.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C30814h implements InterfaceC30830x, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: E */
    public InterfaceC30829w f127042E;

    /* JADX INFO: renamed from: F */
    public C30813g f127043F;

    /* JADX INFO: renamed from: w */
    public Context f127044w;

    /* JADX INFO: renamed from: x */
    public LayoutInflater f127045x;

    /* JADX INFO: renamed from: y */
    public MenuC30818l f127046y;

    /* JADX INFO: renamed from: z */
    public ExpandedMenuView f127047z;

    public C30814h(Context context) {
        this.f127044w = context;
        this.f127045x = LayoutInflater.from(context);
    }

    /* JADX INFO: renamed from: a */
    public final C30813g m94808a() {
        if (this.f127043F == null) {
            this.f127043F = new C30813g(this);
        }
        return this.f127043F;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: b */
    public final boolean mo3335b(C30820n c30820n) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC30832z m94809c(ViewGroup viewGroup) {
        if (this.f127047z == null) {
            this.f127047z = (ExpandedMenuView) this.f127045x.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f127043F == null) {
                this.f127043F = new C30813g(this);
            }
            this.f127047z.setAdapter((ListAdapter) this.f127043F);
            this.f127047z.setOnItemClickListener(this);
        }
        return this.f127047z;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: d */
    public final void mo3336d() {
        C30813g c30813g = this.f127043F;
        if (c30813g != null) {
            c30813g.notifyDataSetChanged();
        }
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: e */
    public final boolean mo3337e(C30820n c30820n) {
        return false;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: f */
    public final void mo3338f(Context context, MenuC30818l menuC30818l) {
        if (this.f127044w != null) {
            this.f127044w = context;
            if (this.f127045x == null) {
                this.f127045x = LayoutInflater.from(context);
            }
        }
        this.f127046y = menuC30818l;
        C30813g c30813g = this.f127043F;
        if (c30813g != null) {
            c30813g.notifyDataSetChanged();
        }
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: g */
    public final void mo3339g(MenuC30818l menuC30818l, boolean z4) {
        InterfaceC30829w interfaceC30829w = this.f127042E;
        if (interfaceC30829w != null) {
            interfaceC30829w.mo16445g(menuC30818l, z4);
        }
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: h */
    public final void mo94787h(InterfaceC30829w interfaceC30829w) {
        this.f127042E = interfaceC30829w;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: i */
    public final boolean mo3340i() {
        return false;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: j */
    public final boolean mo3341j(SubMenuC30810d0 subMenuC30810d0) {
        if (!subMenuC30810d0.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC30819m dialogInterfaceOnKeyListenerC30819m = new DialogInterfaceOnKeyListenerC30819m();
        dialogInterfaceOnKeyListenerC30819m.f127079w = subMenuC30810d0;
        C24844i c24844i = new C24844i(subMenuC30810d0.f127055b);
        C30814h c30814h = new C30814h(c24844i.getContext());
        dialogInterfaceOnKeyListenerC30819m.f127081y = c30814h;
        c30814h.f127042E = dialogInterfaceOnKeyListenerC30819m;
        subMenuC30810d0.m94813b(c30814h);
        C30813g c30813gM94808a = dialogInterfaceOnKeyListenerC30819m.f127081y.m94808a();
        C24836e c24836e = c24844i.f97324a;
        c24836e.f97272q = c30813gM94808a;
        c24836e.f97273r = dialogInterfaceOnKeyListenerC30819m;
        View view = subMenuC30810d0.f127069p;
        if (view != null) {
            c24836e.f97260e = view;
        } else {
            c24836e.f97258c = subMenuC30810d0.f127068o;
            c24844i.setTitle(subMenuC30810d0.f127067n);
        }
        c24836e.f97271p = dialogInterfaceOnKeyListenerC30819m;
        DialogInterfaceC24846j dialogInterfaceC24846jCreate = c24844i.create();
        dialogInterfaceOnKeyListenerC30819m.f127080x = dialogInterfaceC24846jCreate;
        dialogInterfaceC24846jCreate.setOnDismissListener(dialogInterfaceOnKeyListenerC30819m);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC30819m.f127080x.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
        dialogInterfaceOnKeyListenerC30819m.f127080x.show();
        InterfaceC30829w interfaceC30829w = this.f127042E;
        if (interfaceC30829w == null) {
            return true;
        }
        interfaceC30829w.mo16448s(subMenuC30810d0);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j7) {
        this.f127046y.m94821r(this.f127043F.getItem(i13), this, 0);
    }
}
