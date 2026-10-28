package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.android.R;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p507tx.AbstractC34235f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import s32.C32112d;
import s40.C32192z0;
import y00.C38870j6;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lcom/stripe/android/view/SelectShippingMethodWidget;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "Ly00/j6;", "Ll83/a0;", "callback", "setShippingMethodSelectedCallback", "(Lkotlin/jvm/functions/Function1;)V", "", "shippingMethods", "setShippingMethods", "(Ljava/util/List;)V", "shippingMethod", "setSelectedShippingMethod", "(Ly00/j6;)V", "getSelectedShippingMethod", "()Ly00/j6;", "selectedShippingMethod", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class SelectShippingMethodWidget extends FrameLayout {

    /* JADX INFO: renamed from: w */
    public final C32192z0 f22559w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectShippingMethodWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
        C32192z0 c32192z0 = new C32192z0();
        c32192z0.f133315a = new C32112d(8);
        c32192z0.f133316b = C25271y.f99162w;
        c32192z0.setHasStableIds(true);
        this.f22559w = c32192z0;
        LayoutInflater.from(context).inflate(R.layout.stripe_shipping_method_widget, this);
        RecyclerView recyclerView = (RecyclerView) AbstractC34235f.m108203J(this, R.id.shipping_methods);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(R.id.shipping_methods)));
        }
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(c32192z0);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
    }

    public final C38870j6 getSelectedShippingMethod() {
        C32192z0 c32192z0 = this.f22559w;
        return (C38870j6) AbstractC25265s.m74102I0(c32192z0.f133317c, c32192z0.f133316b);
    }

    public final void setSelectedShippingMethod(C38870j6 shippingMethod) {
        AbstractC22676k.m65750j(shippingMethod, "shippingMethod");
        C32192z0 c32192z0 = this.f22559w;
        c32192z0.getClass();
        c32192z0.m100114a(c32192z0.f133316b.indexOf(shippingMethod));
    }

    public final void setShippingMethodSelectedCallback(Function1 callback) {
        AbstractC22676k.m65750j(callback, "callback");
        C32192z0 c32192z0 = this.f22559w;
        c32192z0.getClass();
        c32192z0.f133315a = callback;
    }

    public final void setShippingMethods(List<C38870j6> shippingMethods) {
        AbstractC22676k.m65750j(shippingMethods, "shippingMethods");
        C32192z0 c32192z0 = this.f22559w;
        c32192z0.getClass();
        c32192z0.m100114a(0);
        c32192z0.f133316b = shippingMethods;
        c32192z0.notifyDataSetChanged();
    }
}
