package p535uv;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.mapbox.maps.MapView;
import p127ev.C13668i;
import p127ev.InterfaceC13678s;
import p262jv.C21964a;
import p562vv.C36526a;
import p562vv.C36527b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import rs.AbstractC31780b;

/* JADX INFO: renamed from: uv.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C35279d implements InterfaceC13678s {

    /* JADX INFO: renamed from: w */
    public final Function1 f150157w = C35278c.f150156w;

    /* JADX INFO: renamed from: x */
    public InterfaceC35276a f150158x;

    /* JADX INFO: renamed from: y */
    public C36527b f150159y;

    public C35279d() {
        C36526a c36526a = new C36526a();
        c36526a.f156307a = true;
        c36526a.f156308b = 8388691;
        c36526a.f156309c = 4.0f;
        c36526a.f156310d = 4.0f;
        c36526a.f156311e = 4.0f;
        c36526a.f156312f = 4.0f;
        boolean z4 = c36526a.f156307a;
        this.f150159y = new C36527b(c36526a.f156309c, c36526a.f156310d, c36526a.f156311e, c36526a.f156312f, c36526a.f156308b, z4);
    }

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: a */
    public final void mo38544a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p127ev.InterfaceC13678s
    /* JADX INFO: renamed from: c */
    public final void mo38580c(View view) {
        AbstractC22676k.m65750j(view, "view");
        InterfaceC35276a interfaceC35276a = view instanceof InterfaceC35276a ? (InterfaceC35276a) view : null;
        if (interfaceC35276a == null) {
            throw new IllegalArgumentException("The provided view needs to implement LogoContract.LogoView");
        }
        this.f150158x = interfaceC35276a;
    }

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: f */
    public final void mo38545f(C13668i c13668i) {
    }

    @Override // p127ev.InterfaceC13678s
    /* JADX INFO: renamed from: g */
    public final View mo38581g(MapView mapView, AttributeSet attributeSet, float f13) {
        AbstractC22676k.m65750j(mapView, "mapView");
        Context context = mapView.getContext();
        AbstractC22676k.m65749i(context, "mapView.context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC35280e.f150160a, 0, 0);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            C36527b c36527bM98682c = AbstractC31780b.m98682c(new C21964a(typedArrayObtainStyledAttributes, f13, 2));
            typedArrayObtainStyledAttributes.recycle();
            this.f150159y = c36527bM98682c;
            Context context2 = mapView.getContext();
            AbstractC22676k.m65749i(context2, "mapView.context");
            Object objInvoke = this.f150157w.invoke(context2);
            ((C35277b) objInvoke).getClass();
            return (View) objInvoke;
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    @Override // p127ev.InterfaceC13669j
    public final void initialize() {
        InterfaceC35276a interfaceC35276a = this.f150158x;
        if (interfaceC35276a == null) {
            AbstractC22676k.m65757q("logoView");
            throw null;
        }
        C36527b c36527b = this.f150159y;
        int i13 = (int) c36527b.f156317y;
        int i14 = (int) c36527b.f156318z;
        int i15 = (int) c36527b.f156313E;
        int i16 = (int) c36527b.f156314F;
        ViewGroup.LayoutParams layoutParams = ((C35277b) interfaceC35276a).getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(i13, i14, i15, i16);
        layoutParams2.setMarginStart(i13);
        layoutParams2.setMarginEnd(i15);
        InterfaceC35276a interfaceC35276a2 = this.f150158x;
        if (interfaceC35276a2 == null) {
            AbstractC22676k.m65757q("logoView");
            throw null;
        }
        ((C35277b) interfaceC35276a2).setLogoGravity(this.f150159y.f156316x);
        InterfaceC35276a interfaceC35276a3 = this.f150158x;
        if (interfaceC35276a3 == null) {
            AbstractC22676k.m65757q("logoView");
            throw null;
        }
        ((C35277b) interfaceC35276a3).setLogoEnabled(this.f150159y.f156315w);
        InterfaceC35276a interfaceC35276a4 = this.f150158x;
        if (interfaceC35276a4 != null) {
            interfaceC35276a4.requestLayout();
        } else {
            AbstractC22676k.m65757q("logoView");
            throw null;
        }
    }
}
