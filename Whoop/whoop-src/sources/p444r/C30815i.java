package p444r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: renamed from: r.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C30815i extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final MenuC30818l f127048a;

    /* JADX INFO: renamed from: b */
    public int f127049b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f127050c;

    /* JADX INFO: renamed from: d */
    public final boolean f127051d;

    /* JADX INFO: renamed from: e */
    public final LayoutInflater f127052e;

    /* JADX INFO: renamed from: f */
    public final int f127053f;

    public C30815i(MenuC30818l menuC30818l, LayoutInflater layoutInflater, boolean z4, int i13) {
        this.f127051d = z4;
        this.f127052e = layoutInflater;
        this.f127048a = menuC30818l;
        this.f127053f = i13;
        m94810a();
    }

    /* JADX INFO: renamed from: a */
    public final void m94810a() {
        MenuC30818l menuC30818l = this.f127048a;
        C30820n c30820n = menuC30818l.f127076w;
        if (c30820n != null) {
            menuC30818l.m94818j();
            ArrayList arrayList = menuC30818l.f127064k;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (((C30820n) arrayList.get(i13)) == c30820n) {
                    this.f127049b = i13;
                    return;
                }
            }
        }
        this.f127049b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C30820n getItem(int i13) {
        ArrayList arrayListM94819m;
        boolean z4 = this.f127051d;
        MenuC30818l menuC30818l = this.f127048a;
        if (z4) {
            menuC30818l.m94818j();
            arrayListM94819m = menuC30818l.f127064k;
        } else {
            arrayListM94819m = menuC30818l.m94819m();
        }
        int i14 = this.f127049b;
        if (i14 >= 0 && i13 >= i14) {
            i13++;
        }
        return (C30820n) arrayListM94819m.get(i13);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM94819m;
        boolean z4 = this.f127051d;
        MenuC30818l menuC30818l = this.f127048a;
        if (z4) {
            menuC30818l.m94818j();
            arrayListM94819m = menuC30818l.f127064k;
        } else {
            arrayListM94819m = menuC30818l.m94819m();
        }
        return this.f127049b < 0 ? arrayListM94819m.size() : arrayListM94819m.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return i13;
    }

    @Override // android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        boolean z4 = false;
        if (view == null) {
            view = this.f127052e.inflate(this.f127053f, viewGroup, false);
        }
        int i14 = getItem(i13).f127087c;
        int i15 = i13 - 1;
        int i16 = i15 >= 0 ? getItem(i15).f127087c : i14;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f127048a.mo94801n() && i14 != i16) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        InterfaceC30831y interfaceC30831y = (InterfaceC30831y) view;
        if (this.f127050c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC30831y.mo3252c(getItem(i13));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m94810a();
        super.notifyDataSetChanged();
    }
}
