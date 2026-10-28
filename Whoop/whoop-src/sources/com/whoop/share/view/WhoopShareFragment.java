package com.whoop.share.view;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whoop.android.R;
import com.whoop.share.view.WhoopShareFragment;
import gy0.AbstractC16278g;
import id2.AbstractC18435t;
import id2.C18427l;
import id2.C18430o;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p390p1.C28635l;
import p390p1.C28655q;
import p404pq.AbstractC29455c;
import p404pq.C29464l;
import p404pq.DialogC29463k;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/share/view/WhoopShareFragment;", "Lpq/l;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "", "getTheme", "()I", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "F", "()Ljava/lang/String;", "path", "x", "G", "source", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WhoopShareFragment extends C29464l {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h path = AbstractC30060g.m92088H(new C18430o(this, 0));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h source = AbstractC30060g.m92088H(new C18430o(this, 1));

    /* JADX INFO: renamed from: com.whoop.share.view.WhoopShareFragment$a */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"com/whoop/share/view/WhoopShareFragment$a", "Lpq/c;", "Landroid/view/View;", "bottomSheet", "", "newState", "Ll83/a0;", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10165a extends AbstractC29455c {
        public C10165a() {
        }

        @Override // p404pq.AbstractC29455c
        /* JADX INFO: renamed from: b */
        public void mo5841b(View bottomSheet, float slideOffset) {
            AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        }

        @Override // p404pq.AbstractC29455c
        /* JADX INFO: renamed from: c */
        public void mo5842c(View bottomSheet, int newState) {
            AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
            if (newState == 5) {
                WhoopShareFragment.this.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    private final String m25818F() {
        return (String) this.path.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final String m25819G() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m25820H(WhoopShareFragment whoopShareFragment, DialogInterface dialogInterface) {
        AbstractC22676k.m65748h(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        FrameLayout frameLayout = (FrameLayout) ((DialogC29463k) dialogInterface).findViewById(R.id.design_bottom_sheet);
        if (frameLayout != null) {
            frameLayout.setBackground(new ColorDrawable(0));
            BottomSheetBehavior bottomSheetBehaviorM15688O = BottomSheetBehavior.m15688O(frameLayout);
            bottomSheetBehaviorM15688O.m15701W(3);
            bottomSheetBehaviorM15688O.f20782J = true;
            bottomSheetBehaviorM15688O.f20783K = true;
            bottomSheetBehaviorM15688O.m15690I(whoopShareFragment.new C10165a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m25821I(WhoopShareFragment whoopShareFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String strM25818F = whoopShareFragment.m25818F();
            String strM25819G = whoopShareFragment.m25819G();
            boolean zM87157i = c28655q.m87157i(whoopShareFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C18430o(whoopShareFragment, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC18435t.m53093R(strM25818F, strM25819G, (InterfaceC4339a) objM87133R, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m25822J(WhoopShareFragment whoopShareFragment) {
        whoopShareFragment.dismissAllowingStateLoss();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final String m25823K(WhoopShareFragment whoopShareFragment) {
        String string;
        Bundle arguments = whoopShareFragment.getArguments();
        return (arguments == null || (string = arguments.getString("path")) == null) ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final String m25824L(WhoopShareFragment whoopShareFragment) {
        Bundle arguments = whoopShareFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("source");
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public int getTheme() {
        return AbstractC16278g.f62406a;
    }

    @Override // p404pq.C29464l, p314m.C24835d0, androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DialogC29463k dialogC29463k = new DialogC29463k(requireContext(), getTheme());
        dialogC29463k.setOnShowListener(new DialogInterface.OnShowListener() { // from class: id2.p
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                WhoopShareFragment.m25820H(this.f71689a, dialogInterface);
            }
        });
        return dialogC29463k;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C18427l(this, 1), true, -559487017));
    }
}
