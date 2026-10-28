package s40;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import b13.ViewOnClickListenerC2292a;
import java.util.List;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38870j6;

/* JADX INFO: renamed from: s40.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32192z0 extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a */
    public Function1 f133315a;

    /* JADX INFO: renamed from: b */
    public List f133316b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f133317c;

    /* JADX INFO: renamed from: a */
    public final void m100114a(int i13) {
        int i14 = this.f133317c;
        if (i14 != i13) {
            notifyItemChanged(i14);
            notifyItemChanged(i13);
            this.f133317c = i13;
            this.f133315a.invoke(this.f133316b.get(i13));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public final int getPageCount() {
        return this.f133316b.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final long getItemId(int i13) {
        return ((C38870j6) this.f133316b.get(i13)).hashCode();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(AbstractC1717o2 abstractC1717o2, int i13) {
        C32190y0 holder = (C32190y0) abstractC1717o2;
        AbstractC22676k.m65750j(holder, "holder");
        C38870j6 shippingMethod = (C38870j6) this.f133316b.get(i13);
        AbstractC22676k.m65750j(shippingMethod, "shippingMethod");
        C32134a1 c32134a1 = holder.f133312a;
        c32134a1.setShippingMethod(shippingMethod);
        c32134a1.setSelected(i13 == this.f133317c);
        c32134a1.setOnClickListener(new ViewOnClickListenerC2292a(12, this, holder));
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final AbstractC1717o2 onCreateViewHolder(ViewGroup viewGroup, int i13) {
        AbstractC22676k.m65750j(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        return new C32190y0(new C32134a1(context));
    }
}
