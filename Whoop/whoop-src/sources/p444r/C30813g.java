package p444r;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.whoop.android.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: r.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C30813g extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public int f127040a = -1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30814h f127041b;

    public C30813g(C30814h c30814h) {
        this.f127041b = c30814h;
        m94806a();
    }

    /* JADX INFO: renamed from: a */
    public final void m94806a() {
        MenuC30818l menuC30818l = this.f127041b.f127046y;
        C30820n c30820n = menuC30818l.f127076w;
        if (c30820n != null) {
            menuC30818l.m94818j();
            ArrayList arrayList = menuC30818l.f127064k;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (((C30820n) arrayList.get(i13)) == c30820n) {
                    this.f127040a = i13;
                    return;
                }
            }
        }
        this.f127040a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C30820n getItem(int i13) {
        C30814h c30814h = this.f127041b;
        MenuC30818l menuC30818l = c30814h.f127046y;
        menuC30818l.m94818j();
        ArrayList arrayList = menuC30818l.f127064k;
        c30814h.getClass();
        int i14 = this.f127040a;
        if (i14 >= 0 && i13 >= i14) {
            i13++;
        }
        return (C30820n) arrayList.get(i13);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C30814h c30814h = this.f127041b;
        MenuC30818l menuC30818l = c30814h.f127046y;
        menuC30818l.m94818j();
        int size = menuC30818l.f127064k.size();
        c30814h.getClass();
        return this.f127040a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        return i13;
    }

    @Override // android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f127041b.f127045x.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC30831y) view).mo3252c(getItem(i13));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m94806a();
        super.notifyDataSetChanged();
    }
}
