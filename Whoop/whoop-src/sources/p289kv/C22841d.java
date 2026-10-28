package p289kv;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b30.C2606q3;
import com.mapbox.geojson.Point;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.MapController;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.plugin.InvalidPluginConfigurationException;
import java.util.concurrent.CopyOnWriteArraySet;
import lv.C24756a;
import lv.C24757b;
import p087db.C11845e;
import p127ev.C13668i;
import p127ev.InterfaceC13661b;
import p127ev.InterfaceC13666g;
import p127ev.InterfaceC13678s;
import p157fv.InterfaceC14795a;
import p262jv.C21964a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: kv.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C22841d implements InterfaceC13678s, InterfaceC13666g, InterfaceC13661b {

    /* JADX INFO: renamed from: E */
    public double f90046E;

    /* JADX INFO: renamed from: F */
    public InterfaceC14795a f90047F;

    /* JADX INFO: renamed from: G */
    public boolean f90048G;

    /* JADX INFO: renamed from: H */
    public C24757b f90049H;

    /* JADX INFO: renamed from: I */
    public final CopyOnWriteArraySet f90050I;

    /* JADX INFO: renamed from: w */
    public final Function1 f90051w;

    /* JADX INFO: renamed from: x */
    public final ValueAnimator f90052x;

    /* JADX INFO: renamed from: y */
    public InterfaceC22838a f90053y;

    /* JADX INFO: renamed from: z */
    public MapboxMap f90054z;

    public C22841d() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        AbstractC22676k.m65749i(valueAnimatorOfFloat, "ofFloat(1f, 0f)");
        this.f90051w = C22840c.f90045w;
        this.f90052x = valueAnimatorOfFloat;
        this.f90049H = new C24757b(true, 8388661, 4.0f, 4.0f, 4.0f, 4.0f, 1.0f, 0.0f, true, true, true, null);
        this.f90050I = new CopyOnWriteArraySet();
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setStartDelay(500L);
        valueAnimatorOfFloat.addListener(new C2606q3(this, 2));
        valueAnimatorOfFloat.addUpdateListener(new C11845e(this, 4));
    }

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: a */
    public final void mo38544a() {
        this.f90050I.clear();
        this.f90052x.cancel();
        InterfaceC22838a interfaceC22838a = this.f90053y;
        if (interfaceC22838a != null) {
            ((C22839b) interfaceC22838a).setCompassEnabled(false);
        } else {
            AbstractC22676k.m65757q("compassView");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m66223b() {
        int iIntValue;
        C24757b c24757b = this.f90049H;
        boolean z4 = c24757b.f96817w;
        C24756a c24756aM72492b = c24757b.m72492b();
        c24756aM72492b.f96797a = z4;
        this.f90049H = c24756aM72492b.m72491a();
        InterfaceC22838a interfaceC22838a = this.f90053y;
        if (interfaceC22838a == null) {
            AbstractC22676k.m65757q("compassView");
            throw null;
        }
        ((C22839b) interfaceC22838a).setCompassEnabled(z4);
        m66225h(this.f90046E);
        if (!z4 || m66224e()) {
            InterfaceC22838a interfaceC22838a2 = this.f90053y;
            if (interfaceC22838a2 == null) {
                AbstractC22676k.m65757q("compassView");
                throw null;
            }
            ((C22839b) interfaceC22838a2).setCompassAlpha(0.0f);
            InterfaceC22838a interfaceC22838a3 = this.f90053y;
            if (interfaceC22838a3 == null) {
                AbstractC22676k.m65757q("compassView");
                throw null;
            }
            ((C22839b) interfaceC22838a3).setCompassVisible(false);
        } else {
            InterfaceC22838a interfaceC22838a4 = this.f90053y;
            if (interfaceC22838a4 == null) {
                AbstractC22676k.m65757q("compassView");
                throw null;
            }
            ((C22839b) interfaceC22838a4).setCompassAlpha(this.f90049H.f96811G);
            InterfaceC22838a interfaceC22838a5 = this.f90053y;
            if (interfaceC22838a5 == null) {
                AbstractC22676k.m65757q("compassView");
                throw null;
            }
            ((C22839b) interfaceC22838a5).setCompassVisible(true);
        }
        InterfaceC22838a interfaceC22838a6 = this.f90053y;
        if (interfaceC22838a6 == null) {
            AbstractC22676k.m65757q("compassView");
            throw null;
        }
        C22839b c22839b = (C22839b) interfaceC22838a6;
        c22839b.setCompassGravity(this.f90049H.f96818x);
        ImageHolder imageHolder = this.f90049H.f96816L;
        if (imageHolder != null) {
            Context context = c22839b.getContext();
            Bitmap bitmap = imageHolder.getBitmap();
            if (bitmap != null) {
                c22839b.setCompassImage(new BitmapDrawable(context.getResources(), bitmap));
            }
            Integer drawableId = imageHolder.getDrawableId();
            if (drawableId != null && (iIntValue = drawableId.intValue()) != -1) {
                Drawable drawableM92133x = AbstractC30060g.m92133x(context, iIntValue);
                AbstractC22676k.m65747g(drawableM92133x);
                c22839b.setCompassImage(drawableM92133x);
            }
        }
        c22839b.setCompassRotation(this.f90049H.f96812H);
        c22839b.setCompassEnabled(this.f90049H.f96817w);
        c22839b.setCompassAlpha(this.f90049H.f96811G);
        C24757b c24757b2 = this.f90049H;
        int i13 = (int) c24757b2.f96819y;
        int i14 = (int) c24757b2.f96820z;
        int i15 = (int) c24757b2.f96809E;
        int i16 = (int) c24757b2.f96810F;
        ViewGroup.LayoutParams layoutParams = c22839b.getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).setMargins(i13, i14, i15, i16);
        m66225h(this.f90046E);
        c22839b.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p127ev.InterfaceC13678s
    /* JADX INFO: renamed from: c */
    public final void mo38580c(View view) {
        AbstractC22676k.m65750j(view, "view");
        InterfaceC22838a interfaceC22838a = view instanceof InterfaceC22838a ? (InterfaceC22838a) view : null;
        if (interfaceC22838a == null) {
            throw new IllegalArgumentException("The provided view needs to implement CompassContract.CompassView");
        }
        this.f90053y = interfaceC22838a;
        m66226i(false);
    }

    @Override // p127ev.InterfaceC13666g
    /* JADX INFO: renamed from: d */
    public final void mo38528d(Point point, EdgeInsets edgeInsets, double d3, double d14, double d15) {
        m66225h(d15);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m66224e() {
        if (!this.f90049H.f96814J) {
            return false;
        }
        InterfaceC22838a interfaceC22838a = this.f90053y;
        if (interfaceC22838a == null) {
            AbstractC22676k.m65757q("compassView");
            throw null;
        }
        if (Math.abs(((C22839b) interfaceC22838a).getCompassRotation()) >= 359.0d) {
            return true;
        }
        InterfaceC22838a interfaceC22838a2 = this.f90053y;
        if (interfaceC22838a2 != null) {
            return ((double) Math.abs(((C22839b) interfaceC22838a2).getCompassRotation())) <= 1.0d;
        }
        AbstractC22676k.m65757q("compassView");
        throw null;
    }

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: f */
    public final void mo38545f(C13668i c13668i) throws InvalidPluginConfigurationException {
        MapboxMap mapboxMap = (MapboxMap) c13668i.f48455b;
        this.f90054z = mapboxMap;
        this.f90046E = mapboxMap.getCameraState().getBearing();
        InterfaceC14795a interfaceC14795a = (InterfaceC14795a) ((MapController) c13668i.f48462i).getPlugin("MAPBOX_CAMERA_PLUGIN_ID");
        if (interfaceC14795a == null) {
            throw new InvalidPluginConfigurationException("Can't look up an instance of plugin, is it available on the clazz path and loaded through the map?");
        }
        this.f90047F = interfaceC14795a;
    }

    @Override // p127ev.InterfaceC13678s
    /* JADX INFO: renamed from: g */
    public final View mo38581g(MapView mapView, AttributeSet attributeSet, float f13) {
        AbstractC22676k.m65750j(mapView, "mapView");
        Context context = mapView.getContext();
        AbstractC22676k.m65749i(context, "mapView.context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC22842e.f90055a, 0, 0);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            C21964a c21964a = new C21964a(typedArrayObtainStyledAttributes, f13, 1);
            C24756a c24756a = new C24756a();
            c21964a.invoke(c24756a);
            C24757b c24757bM72491a = c24756a.m72491a();
            typedArrayObtainStyledAttributes.recycle();
            this.f90049H = c24757bM72491a;
            Context context2 = mapView.getContext();
            AbstractC22676k.m65749i(context2, "mapView.context");
            Object objInvoke = this.f90051w.invoke(context2);
            C22839b c22839b = (C22839b) objInvoke;
            c22839b.getClass();
            c22839b.f90044w = this;
            return (View) objInvoke;
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m66225h(double d3) {
        this.f90046E = d3;
        InterfaceC22838a interfaceC22838a = this.f90053y;
        if (interfaceC22838a == null) {
            AbstractC22676k.m65757q("compassView");
            throw null;
        }
        ((C22839b) interfaceC22838a).setCompassRotation(-((float) d3));
        m66226i(true);
    }

    /* JADX INFO: renamed from: i */
    public final void m66226i(boolean z4) {
        InterfaceC22838a interfaceC22838a = this.f90053y;
        if (interfaceC22838a == null) {
            AbstractC22676k.m65757q("compassView");
            throw null;
        }
        if (((C22839b) interfaceC22838a).isEnabled()) {
            boolean zM66224e = m66224e();
            ValueAnimator valueAnimator = this.f90052x;
            if (!zM66224e) {
                this.f90048G = false;
                valueAnimator.cancel();
                InterfaceC22838a interfaceC22838a2 = this.f90053y;
                if (interfaceC22838a2 == null) {
                    AbstractC22676k.m65757q("compassView");
                    throw null;
                }
                ((C22839b) interfaceC22838a2).setCompassVisible(true);
                InterfaceC22838a interfaceC22838a3 = this.f90053y;
                if (interfaceC22838a3 == null) {
                    AbstractC22676k.m65757q("compassView");
                    throw null;
                }
                ((C22839b) interfaceC22838a3).setCompassAlpha(this.f90049H.f96811G);
                return;
            }
            if (this.f90048G) {
                return;
            }
            this.f90048G = true;
            if (z4) {
                valueAnimator.start();
                return;
            }
            InterfaceC22838a interfaceC22838a4 = this.f90053y;
            if (interfaceC22838a4 == null) {
                AbstractC22676k.m65757q("compassView");
                throw null;
            }
            ((C22839b) interfaceC22838a4).setCompassVisible(false);
            InterfaceC22838a interfaceC22838a5 = this.f90053y;
            if (interfaceC22838a5 != null) {
                ((C22839b) interfaceC22838a5).setCompassAlpha(0.0f);
            } else {
                AbstractC22676k.m65757q("compassView");
                throw null;
            }
        }
    }

    @Override // p127ev.InterfaceC13669j
    public void initialize() {
        m66223b();
    }

    @Override // p127ev.InterfaceC13661b
    public final void onStart() {
        m66225h(this.f90046E);
    }

    @Override // p127ev.InterfaceC13661b
    public final void onStop() {
        this.f90052x.cancel();
    }
}
