package p231iv;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.mapbox.maps.MapView;
import com.mapbox.maps.attribution.AttributionParser;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.whoop.android.R;
import io.sentry.config.AbstractC20301a;
import java.util.Arrays;
import java.util.List;
import l83.C23470p;
import m83.AbstractC25265s;
import m83.C25271y;
import p127ev.C13665f;
import p127ev.C13668i;
import p127ev.InterfaceC13661b;
import p127ev.InterfaceC13678s;
import p262jv.C21964a;
import p262jv.C21966c;
import p314m.C24836e;
import p314m.C24844i;
import p314m.DialogInterfaceC24846j;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: iv.g */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnClickListenerC20946g implements View.OnClickListener, InterfaceC13678s, InterfaceC13661b {

    /* JADX INFO: renamed from: x */
    public InterfaceC20947h f79141x;

    /* JADX INFO: renamed from: y */
    public C13665f f79142y;

    /* JADX INFO: renamed from: z */
    public DialogInterfaceOnClickListenerC20944e f79143z;

    /* JADX INFO: renamed from: w */
    public final Function1 f79140w = C20945f.f79136x;

    /* JADX INFO: renamed from: E */
    public C21966c f79139E = AbstractC20301a.m56330b(C20945f.f79137y);

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: a */
    public final void mo38544a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p127ev.InterfaceC13678s
    /* JADX INFO: renamed from: c */
    public final void mo38580c(View view) {
        AbstractC22676k.m65750j(view, "view");
        InterfaceC20947h interfaceC20947h = view instanceof InterfaceC20947h ? (InterfaceC20947h) view : null;
        if (interfaceC20947h == null) {
            throw new IllegalArgumentException("The provided view needs to implement AttributionView");
        }
        this.f79141x = interfaceC20947h;
        ((C20948i) interfaceC20947h).setViewOnClickListener(this);
    }

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: f */
    public final void mo38545f(C13668i c13668i) {
        this.f79142y = (C13665f) ((C23470p) c13668i.f48461h).getValue();
    }

    @Override // p127ev.InterfaceC13678s
    /* JADX INFO: renamed from: g */
    public final View mo38581g(MapView mapView, AttributeSet attributeSet, float f13) {
        AbstractC22676k.m65750j(mapView, "mapView");
        Context context = mapView.getContext();
        AbstractC22676k.m65749i(context, "mapView.context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC20949j.f79145b, 0, 0);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            C21966c c21966cM56330b = AbstractC20301a.m56330b(new C21964a(typedArrayObtainStyledAttributes, f13, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f79139E = c21966cM56330b;
            Context context2 = mapView.getContext();
            AbstractC22676k.m65749i(context2, "mapView.context");
            this.f79143z = new DialogInterfaceOnClickListenerC20944e(context2);
            Context context3 = mapView.getContext();
            AbstractC22676k.m65749i(context3, "mapView.context");
            return (View) this.f79140w.invoke(context3);
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    @Override // p127ev.InterfaceC13669j
    public final void initialize() {
        InterfaceC20947h interfaceC20947h = this.f79141x;
        if (interfaceC20947h == null) {
            AbstractC22676k.m65757q("attributionView");
            throw null;
        }
        ((C20948i) interfaceC20947h).setGravity(this.f79139E.f85024y);
        InterfaceC20947h interfaceC20947h2 = this.f79141x;
        if (interfaceC20947h2 == null) {
            AbstractC22676k.m65757q("attributionView");
            throw null;
        }
        ((C20948i) interfaceC20947h2).setEnable(this.f79139E.f85022w);
        InterfaceC20947h interfaceC20947h3 = this.f79141x;
        if (interfaceC20947h3 == null) {
            AbstractC22676k.m65757q("attributionView");
            throw null;
        }
        ((C20948i) interfaceC20947h3).setIconColor(this.f79139E.f85023x);
        InterfaceC20947h interfaceC20947h4 = this.f79141x;
        if (interfaceC20947h4 == null) {
            AbstractC22676k.m65757q("attributionView");
            throw null;
        }
        C21966c c21966c = this.f79139E;
        int i13 = (int) c21966c.f85025z;
        int i14 = (int) c21966c.f85018E;
        int i15 = (int) c21966c.f85019F;
        int i16 = (int) c21966c.f85020G;
        ViewGroup.LayoutParams layoutParams = ((C20948i) interfaceC20947h4).getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(i13, i14, i15, i16);
        layoutParams2.setMarginStart(i13);
        layoutParams2.setMarginEnd(i15);
        InterfaceC20947h interfaceC20947h5 = this.f79141x;
        if (interfaceC20947h5 != null) {
            interfaceC20947h5.requestLayout();
        } else {
            AbstractC22676k.m65757q("attributionView");
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f79139E.f85021H) {
            DialogInterfaceOnClickListenerC20944e dialogInterfaceOnClickListenerC20944e = this.f79143z;
            if (dialogInterfaceOnClickListenerC20944e == null) {
                AbstractC22676k.m65757q("dialogManager");
                throw null;
            }
            C13665f c13665f = this.f79142y;
            if (c13665f == null) {
                AbstractC22676k.m65757q("mapAttributionDelegate");
                throw null;
            }
            Context context = dialogInterfaceOnClickListenerC20944e.f79132w;
            dialogInterfaceOnClickListenerC20944e.f79129F = c13665f;
            dialogInterfaceOnClickListenerC20944e.f79130G = c13665f.f48447b;
            MapGeofencingConsent mapGeofencingConsent = c13665f.f48448c;
            dialogInterfaceOnClickListenerC20944e.f79131H = mapGeofencingConsent;
            boolean zShouldShowConsent = mapGeofencingConsent.shouldShowConsent();
            Object[] array = c13665f.f48446a.getAttributions().toArray(new String[0]);
            AbstractC22676k.m65748h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            dialogInterfaceOnClickListenerC20944e.f79133x = AbstractC25265s.m74093D1(new AttributionParser.Options(context).withCopyrightSign(true).withImproveMap(true).withTelemetryAttribution(true).withMapboxAttribution(true).withMapboxPrivacyPolicy(true).withMapboxGeofencingConsent(zShouldShowConsent).withAttributionData((String[]) Arrays.copyOf(strArr, strArr.length)).withExtraAttributions(C25271y.f99162w).build().getAttributions());
            if (context instanceof Activity ? ((Activity) context).isFinishing() : false) {
                return;
            }
            List list = dialogInterfaceOnClickListenerC20944e.f79133x;
            if (list == null) {
                AbstractC22676k.m65757q("attributionList");
                throw null;
            }
            C24844i c24844iM58199a = dialogInterfaceOnClickListenerC20944e.m58199a();
            c24844iM58199a.m72849b(R.string.mapbox_attributionsDialogTitle);
            C20943d c20943d = new C20943d(context, list);
            C24836e c24836e = c24844iM58199a.f97324a;
            c24836e.f97272q = c20943d;
            c24836e.f97273r = dialogInterfaceOnClickListenerC20944e;
            dialogInterfaceOnClickListenerC20944e.f79134y = c24844iM58199a.m72850c();
        }
    }

    @Override // p127ev.InterfaceC13661b
    public final void onStart() {
    }

    @Override // p127ev.InterfaceC13661b
    public final void onStop() {
        DialogInterfaceOnClickListenerC20944e dialogInterfaceOnClickListenerC20944e = this.f79143z;
        if (dialogInterfaceOnClickListenerC20944e == null) {
            AbstractC22676k.m65757q("dialogManager");
            throw null;
        }
        DialogInterfaceC24846j dialogInterfaceC24846j = dialogInterfaceOnClickListenerC20944e.f79134y;
        if (dialogInterfaceC24846j != null) {
            if (!dialogInterfaceC24846j.isShowing()) {
                dialogInterfaceC24846j = null;
            }
            if (dialogInterfaceC24846j != null) {
                dialogInterfaceC24846j.dismiss();
            }
        }
        DialogInterfaceC24846j dialogInterfaceC24846j2 = dialogInterfaceOnClickListenerC20944e.f79135z;
        if (dialogInterfaceC24846j2 != null) {
            if (!dialogInterfaceC24846j2.isShowing()) {
                dialogInterfaceC24846j2 = null;
            }
            if (dialogInterfaceC24846j2 != null) {
                dialogInterfaceC24846j2.dismiss();
            }
        }
        DialogInterfaceC24846j dialogInterfaceC24846j3 = dialogInterfaceOnClickListenerC20944e.f79128E;
        if (dialogInterfaceC24846j3 != null) {
            DialogInterfaceC24846j dialogInterfaceC24846j4 = dialogInterfaceC24846j3.isShowing() ? dialogInterfaceC24846j3 : null;
            if (dialogInterfaceC24846j4 != null) {
                dialogInterfaceC24846j4.dismiss();
            }
        }
    }
}
