package p444r;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: r.t */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC30826t implements InterfaceC30806b0, InterfaceC30830x, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: w */
    public Rect f127120w;

    /* JADX INFO: renamed from: l */
    public static int m94833l(ListAdapter listAdapter, Context context, int i13) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i14 = 0;
        int i15 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i16 = 0; i16 < count; i16++) {
            int itemViewType = listAdapter.getItemViewType(i16);
            if (itemViewType != i15) {
                view = null;
                i15 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i16, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i13) {
                return i13;
            }
            if (measuredWidth > i14) {
                i14 = measuredWidth;
            }
        }
        return i14;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: b */
    public final boolean mo3335b(C30820n c30820n) {
        return false;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: e */
    public final boolean mo3337e(C30820n c30820n) {
        return false;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: f */
    public final void mo3338f(Context context, MenuC30818l menuC30818l) {
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo94788k(MenuC30818l menuC30818l);

    /* JADX INFO: renamed from: n */
    public abstract void mo94789n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo94790o(boolean z4);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j7) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C30815i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C30815i) listAdapter).f127048a.m94821r((MenuItem) listAdapter.getItem(i13), this, !(this instanceof ViewOnKeyListenerC30812f) ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo94791p(int i13);

    /* JADX INFO: renamed from: q */
    public abstract void mo94792q(int i13);

    /* JADX INFO: renamed from: r */
    public abstract void mo94793r(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: s */
    public abstract void mo94794s(boolean z4);

    /* JADX INFO: renamed from: t */
    public abstract void mo94795t(int i13);
}
