package p474s;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p444r.C30815i;
import p444r.C30820n;
import p444r.MenuC30818l;

/* JADX INFO: renamed from: s.z1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C32033z1 extends C31974k1 {

    /* JADX INFO: renamed from: M */
    public final int f132897M;

    /* JADX INFO: renamed from: N */
    public final int f132898N;

    /* JADX INFO: renamed from: O */
    public InterfaceC32022w1 f132899O;

    /* JADX INFO: renamed from: P */
    public C30820n f132900P;

    public C32033z1(Context context, boolean z4) {
        super(context, z4);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f132897M = 21;
            this.f132898N = 22;
        } else {
            this.f132897M = 22;
            this.f132898N = 21;
        }
    }

    @Override // p474s.C31974k1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C30815i c30815i;
        int headersCount;
        int iPointToPosition;
        int i13;
        if (this.f132899O != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c30815i = (C30815i) headerViewListAdapter.getWrappedAdapter();
            } else {
                c30815i = (C30815i) adapter;
                headersCount = 0;
            }
            C30820n c30820nM94811b = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i13 = iPointToPosition - headersCount) < 0 || i13 >= c30815i.getCount()) ? null : c30815i.getItem(i13);
            C30820n c30820n = this.f132900P;
            if (c30820n != c30820nM94811b) {
                MenuC30818l menuC30818l = c30815i.f127048a;
                if (c30820n != null) {
                    this.f132899O.mo91535t(menuC30818l, c30820n);
                }
                this.f132900P = c30820nM94811b;
                if (c30820nM94811b != null) {
                    this.f132899O.mo91537x(menuC30818l, c30820nM94811b);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i13, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i13 == this.f132897M) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i13 != this.f132898N) {
            return super.onKeyDown(i13, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C30815i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C30815i) adapter).f127048a.m94815d(false);
        return true;
    }

    public void setHoverListener(InterfaceC32022w1 interfaceC32022w1) {
        this.f132899O = interfaceC32022w1;
    }

    @Override // p474s.C31974k1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
