package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p444r.C30820n;
import p444r.InterfaceC30817k;
import p444r.InterfaceC30832z;
import p444r.MenuC30818l;
import p474s.C31983m2;

/* JADX INFO: loaded from: classes5.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC30817k, InterfaceC30832z, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: x */
    public static final int[] f4230x = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: w */
    public MenuC30818l f4231w;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C31983m2 c31983m2M99479q = C31983m2.m99479q(context, attributeSet, f4230x, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c31983m2M99479q.f132769x;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c31983m2M99479q.m99486j(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c31983m2M99479q.m99486j(1));
        }
        c31983m2M99479q.m99491r();
    }

    @Override // p444r.InterfaceC30817k
    /* JADX INFO: renamed from: a */
    public final boolean mo3255a(C30820n c30820n) {
        return this.f4231w.m94821r(c30820n, null, 0);
    }

    @Override // p444r.InterfaceC30832z
    /* JADX INFO: renamed from: b */
    public final void mo3256b(MenuC30818l menuC30818l) {
        this.f4231w = menuC30818l;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i13, long j7) {
        mo3255a((C30820n) getAdapter().getItem(i13));
    }
}
