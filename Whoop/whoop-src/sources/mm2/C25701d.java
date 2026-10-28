package mm2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import hi0.AbstractC17305c;
import hi0.AbstractC17308f;
import in2.AbstractC18738j;
import or2.AbstractC28146a2;
import p312lx.AbstractC24780a;

/* JADX INFO: renamed from: mm2.d */
/* JADX INFO: loaded from: classes10.dex */
public class C25701d extends AbstractC24780a {

    /* JADX INFO: renamed from: mm2.d$a */
    public static class a extends AbstractC28146a2 {

        /* JADX INFO: renamed from: a */
        TextView f101206a;

        public a(View view) {
            super(view);
            this.f101206a = (TextView) view;
        }
    }

    @Override // mx.AbstractC25990c
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void mo27138L(a aVar, C25700c c25700c, int i13) {
        int i14;
        int i15 = c25700c.level;
        if (i15 == 2) {
            i14 = AbstractC17305c.f66520a;
        } else if (i15 == 4) {
            i14 = AbstractC17305c.f66522c;
        } else if (i15 != 8) {
            i14 = i15 != 16 ? AbstractC17305c.f66523d : AbstractC17305c.f66521b;
        } else {
            i14 = AbstractC17305c.f66524e;
        }
        TextView textView = aVar.f101206a;
        textView.setTextColor(AbstractC18738j.m54485c(textView.getContext(), i14));
        aVar.f101206a.setText(c25700c.log, TextView.BufferType.SPANNABLE);
    }

    @Override // mx.AbstractC25990c
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public a mo27139M(ViewGroup viewGroup, int i13) {
        return new a(m77127z(viewGroup, AbstractC17308f.f66894p));
    }
}
