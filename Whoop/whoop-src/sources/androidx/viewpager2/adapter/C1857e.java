package androidx.viewpager2.adapter;

import androidx.recyclerview.widget.AbstractC1700k1;
import c33.C3936c;

/* JADX INFO: renamed from: androidx.viewpager2.adapter.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C1857e extends AbstractC1700k1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7302b;

    public /* synthetic */ C1857e(Object obj, int i13) {
        this.f7301a = i13;
        this.f7302b = obj;
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onChanged() {
        switch (this.f7301a) {
            case 0:
                ((C1859g) this.f7302b).m5504b(true);
                break;
            default:
                ((C3936c) this.f7302b).m11989f();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onItemRangeChanged(int i13, int i14) {
        switch (this.f7301a) {
            case 0:
                onChanged();
                break;
            default:
                ((C3936c) this.f7302b).m11989f();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onItemRangeInserted(int i13, int i14) {
        switch (this.f7301a) {
            case 0:
                onChanged();
                break;
            default:
                ((C3936c) this.f7302b).m11989f();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onItemRangeMoved(int i13, int i14, int i15) {
        switch (this.f7301a) {
            case 0:
                onChanged();
                break;
            default:
                ((C3936c) this.f7302b).m11989f();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onItemRangeRemoved(int i13, int i14) {
        switch (this.f7301a) {
            case 0:
                onChanged();
                break;
            default:
                ((C3936c) this.f7302b).m11989f();
                break;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1700k1
    public final void onItemRangeChanged(int i13, int i14, Object obj) {
        switch (this.f7301a) {
            case 0:
                onChanged();
                break;
            default:
                ((C3936c) this.f7302b).m11989f();
                break;
        }
    }
}
