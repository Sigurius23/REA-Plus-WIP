package p087db;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import com.whoop.android.R;
import com.whoop.p069ui.ViewOnClickListenerC10592j;
import jo.C21827p;
import jo.C21830s;

/* JADX INFO: renamed from: db.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C11865o extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38701a;

    /* JADX INFO: renamed from: b */
    public final String[] f38702b;

    /* JADX INFO: renamed from: c */
    public final float[] f38703c;

    /* JADX INFO: renamed from: d */
    public int f38704d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ FrameLayout f38705e;

    public /* synthetic */ C11865o(FrameLayout frameLayout, String[] strArr, float[] fArr, int i13) {
        this.f38701a = i13;
        this.f38705e = frameLayout;
        this.f38702b = strArr;
        this.f38703c = fArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final int getItemCount() {
        switch (this.f38701a) {
            case 0:
                break;
        }
        return this.f38702b.length;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(AbstractC1717o2 abstractC1717o2, int i13) {
        switch (this.f38701a) {
            case 0:
                C11873s c11873s = (C11873s) abstractC1717o2;
                String[] strArr = this.f38702b;
                if (i13 < strArr.length) {
                    c11873s.f38751a.setText(strArr[i13]);
                }
                if (i13 == this.f38704d) {
                    c11873s.itemView.setSelected(true);
                    c11873s.f38752b.setVisibility(0);
                } else {
                    c11873s.itemView.setSelected(false);
                    c11873s.f38752b.setVisibility(4);
                }
                c11873s.itemView.setOnClickListener(new ViewOnClickListenerC10592j(this, i13, 1));
                break;
            default:
                C21827p c21827p = (C21827p) abstractC1717o2;
                String[] strArr2 = this.f38702b;
                if (i13 < strArr2.length) {
                    c21827p.f84150a.setText(strArr2[i13]);
                }
                c21827p.f84151b.setVisibility(i13 == this.f38704d ? 0 : 4);
                c21827p.itemView.setOnClickListener(new ViewOnClickListenerC10592j(this, i13, 2));
                break;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final AbstractC1717o2 onCreateViewHolder(ViewGroup viewGroup, int i13) {
        switch (this.f38701a) {
            case 0:
                return new C11873s(LayoutInflater.from(((C11882x) this.f38705e).getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
            default:
                return new C21827p(LayoutInflater.from(((C21830s) this.f38705e).getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }
}
