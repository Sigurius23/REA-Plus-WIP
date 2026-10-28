package p474s;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* JADX INFO: renamed from: s.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31953f0 implements ListAdapter, SpinnerAdapter {

    /* JADX INFO: renamed from: a */
    public SpinnerAdapter f132673a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f132674b;

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f132674b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.f132673a;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int i13, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.f132673a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i13, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i13) {
        SpinnerAdapter spinnerAdapter = this.f132673a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i13);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i13) {
        SpinnerAdapter spinnerAdapter = this.f132673a;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i13);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i13) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        return getDropDownView(i13, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.f132673a;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i13) {
        ListAdapter listAdapter = this.f132674b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i13);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f132673a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.f132673a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
