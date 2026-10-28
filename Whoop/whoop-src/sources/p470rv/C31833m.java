package p470rv;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import bc3.AbstractC3006f0;
import bc3.AbstractC3069w1;
import bc3.InterfaceC3027k1;
import com.mapbox.common.location.LocationError;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.whoop.android.R;
import e93.AbstractC12889b;
import ec3.C13045h2;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import live.hms.video.utils.HMSConstantsKt;
import m63.C25126d;
import m83.AbstractC25260n;
import m83.C25271y;
import o52.C27573q;
import p023ay.C2147u;
import p108e4.AbstractC12682p;
import p127ev.AbstractC13664e;
import p127ev.C13662c;
import p127ev.C13663d;
import p127ev.C13668i;
import p127ev.EnumC13677r;
import p127ev.InterfaceC13660a;
import p127ev.InterfaceC13661b;
import p127ev.InterfaceC13669j;
import p127ev.InterfaceC13672m;
import p408q.C29662f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import q83.InterfaceC30057d;
import sv.C33026b;
import sv.C33029e;
import sv.C33030f;
import sv.C33031g;
import tv.C34198a;
import tv.C34199b;
import tv.C34200c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: rv.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C31833m implements InterfaceC13669j, InterfaceC13672m, InterfaceC13661b, InterfaceC13660a {

    /* JADX INFO: renamed from: E */
    public boolean f131881E;

    /* JADX INFO: renamed from: F */
    public Point f131882F;

    /* JADX INFO: renamed from: G */
    public final CopyOnWriteArraySet f131883G = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: H */
    public final CopyOnWriteArraySet f131884H = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: I */
    public final CopyOnWriteArraySet f131885I = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: J */
    public final C27573q f131886J = new C27573q(this, 1);

    /* JADX INFO: renamed from: K */
    public final C31831k f131887K = new C31831k(this);

    /* JADX INFO: renamed from: L */
    public final C31832l f131888L = new C31832l(this);

    /* JADX INFO: renamed from: M */
    public C34200c f131889M;

    /* JADX INFO: renamed from: w */
    public C13668i f131890w;

    /* JADX INFO: renamed from: x */
    public WeakReference f131891x;

    /* JADX INFO: renamed from: y */
    public C31838r f131892y;

    /* JADX INFO: renamed from: z */
    public C25126d f131893z;

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: a */
    public final void mo38544a() {
    }

    @Override // p127ev.InterfaceC13672m
    /* JADX INFO: renamed from: b */
    public final void mo38548b(Style style) {
        C31838r c31838r = this.f131892y;
        if (c31838r != null) {
            c31838r.f131913n.mo91106Z(style);
            c31838r.f131903d.f122261y = style;
        }
    }

    @Override // p127ev.InterfaceC13660a
    /* JADX INFO: renamed from: e */
    public final void mo38527e(Context context, AttributeSet attributeSet, float f13) {
        ImageHolder imageHolderFrom;
        ImageHolder imageHolderFrom2;
        ImageHolder imageHolderFrom3;
        AbstractC13664e c13662c;
        C25271y c25271y;
        List listM74049W0;
        List listM74049W1;
        AbstractC22676k.m65750j(context, "context");
        this.f131891x = new WeakReference(context);
        C25271y c25271y2 = C25271y.f99162w;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC31841u.f131920a, 0, 0);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            boolean z4 = typedArrayObtainStyledAttributes.getBoolean(91, false);
            int i13 = typedArrayObtainStyledAttributes.getInt(54, -1);
            if (i13 == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(59, -1);
                Integer numValueOf = Integer.valueOf(resourceId);
                if (resourceId == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    imageHolderFrom = ImageHolder.INSTANCE.from(numValueOf.intValue());
                } else {
                    imageHolderFrom = null;
                }
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(55, -1);
                Integer numValueOf2 = Integer.valueOf(resourceId2);
                if (resourceId2 == -1) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    imageHolderFrom2 = ImageHolder.INSTANCE.from(numValueOf2.intValue());
                } else {
                    imageHolderFrom2 = null;
                }
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(58, -1);
                Integer numValueOf3 = Integer.valueOf(resourceId3);
                if (resourceId3 == -1) {
                    numValueOf3 = null;
                }
                if (numValueOf3 != null) {
                    imageHolderFrom3 = ImageHolder.INSTANCE.from(numValueOf3.intValue());
                } else {
                    imageHolderFrom3 = null;
                }
                c13662c = new C13662c(imageHolderFrom, imageHolderFrom2, imageHolderFrom3, typedArrayObtainStyledAttributes.getString(57), typedArrayObtainStyledAttributes.getFloat(56, 1.0f));
            } else if (i13 != 1) {
                ImageHolder.Companion companion = ImageHolder.INSTANCE;
                c13662c = new C13662c(companion.from(R.drawable.mapbox_user_icon), z4 ? companion.from(R.drawable.mapbox_user_bearing_icon) : companion.from(R.drawable.mapbox_user_stroke_icon), z4 ? companion.from(R.drawable.mapbox_user_stroke_icon) : companion.from(R.drawable.mapbox_user_icon_shadow), (String) null, 24);
            } else {
                String string = typedArrayObtainStyledAttributes.getString(86);
                if (string == null) {
                    throw new IllegalArgumentException("model-uri must be specified in order to use 3d location puck.");
                }
                List listM118959K = AbstractC37056f.m118959K(Float.valueOf(typedArrayObtainStyledAttributes.getFloat(89, 0.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(88, 0.0f)));
                float f14 = typedArrayObtainStyledAttributes.getFloat(71, 1.0f);
                List listM118959K2 = AbstractC37056f.m118959K(Float.valueOf(typedArrayObtainStyledAttributes.getFloat(80, 1.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(81, 1.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(82, 1.0f)));
                String string2 = typedArrayObtainStyledAttributes.getString(78);
                List listM118959K3 = AbstractC37056f.m118959K(Float.valueOf(typedArrayObtainStyledAttributes.getFloat(84, 0.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(83, 0.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(85, 0.0f)));
                List listM118959K4 = AbstractC37056f.m118959K(Float.valueOf(typedArrayObtainStyledAttributes.getFloat(75, 0.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(76, 0.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(77, 90.0f)));
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(61, true);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(73, true);
                int i14 = AbstractC12682p.m35486f(2)[typedArrayObtainStyledAttributes.getInt(79, 1)];
                float f15 = typedArrayObtainStyledAttributes.getFloat(69, 1.0f);
                String string3 = typedArrayObtainStyledAttributes.getString(70);
                String string4 = typedArrayObtainStyledAttributes.getString(72);
                String string5 = typedArrayObtainStyledAttributes.getString(74);
                int color = typedArrayObtainStyledAttributes.getColor(62, Color.parseColor("#ffffff"));
                String string6 = typedArrayObtainStyledAttributes.getString(63);
                float f16 = typedArrayObtainStyledAttributes.getFloat(64, 0.0f);
                String string7 = typedArrayObtainStyledAttributes.getString(65);
                try {
                    c25271y = c25271y2;
                    try {
                        String[] stringArray = typedArrayObtainStyledAttributes.getResources().getStringArray(typedArrayObtainStyledAttributes.getResourceId(60, 0));
                        AbstractC22676k.m65749i(stringArray, "typedArray.resources.get…k3DMaterialOverrides, 0))");
                        listM74049W0 = AbstractC25260n.m74049W0(stringArray);
                    } catch (Exception unused) {
                        listM74049W0 = c25271y;
                    }
                } catch (Exception unused2) {
                    c25271y = c25271y2;
                }
                try {
                    String[] stringArray2 = typedArrayObtainStyledAttributes.getResources().getStringArray(typedArrayObtainStyledAttributes.getResourceId(87, 0));
                    AbstractC22676k.m65749i(stringArray2, "typedArray.resources.get…nPuck3DNodeOverrides, 0))");
                    listM74049W1 = AbstractC25260n.m74049W0(stringArray2);
                } catch (Exception unused3) {
                    listM74049W1 = c25271y;
                }
                int i15 = AbstractC12682p.m35486f(2)[typedArrayObtainStyledAttributes.getInt(68, 1)];
                String string8 = typedArrayObtainStyledAttributes.getString(66);
                if (string8 == null) {
                    string8 = HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY;
                }
                c13662c = new C13663d(string, listM118959K, f14, listM118959K2, string2, listM118959K3, listM118959K4, z13, z14, i14, f15, string3, string4, string5, color, string6, f16, string7, listM74049W0, listM74049W1, i15, string8, typedArrayObtainStyledAttributes.getString(67));
            }
            C34198a c34198a = new C34198a(typedArrayObtainStyledAttributes, f13, z4);
            C34199b c34199b = new C34199b(c13662c);
            c34198a.invoke(c34199b);
            C34200c c34200cM108102a = c34199b.m108102a();
            typedArrayObtainStyledAttributes.recycle();
            this.f131889M = c34200cM108102a;
            if (m98890i().f143472w && this.f131893z == null) {
                Context applicationContext = context.getApplicationContext();
                AbstractC22676k.m65749i(applicationContext, "context.applicationContext");
                C25126d c25126d = new C25126d(applicationContext);
                C34200c c34200cM98890i = m98890i();
                ((C13045h2) c25126d.f98479E).m36570j(c34200cM98890i.f143468J ? c34200cM98890i.f143469K : null);
                this.f131893z = c25126d;
            }
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: f */
    public final void mo38545f(C13668i c13668i) {
        this.f131890w = c13668i;
    }

    /* JADX INFO: renamed from: h */
    public final void m98889h() {
        if (m98890i().f143472w) {
            C13668i c13668i = this.f131890w;
            InterfaceC30057d interfaceC30057d = null;
            if (c13668i == null) {
                AbstractC22676k.m65757q("delegateProvider");
                throw null;
            }
            MapboxMap style = (MapboxMap) c13668i.f48459f;
            C31838r c31838r = this.f131892y;
            if (c31838r != null && c31838r.f131913n.mo91113f() && this.f131881E) {
                return;
            }
            if (this.f131892y == null) {
                C34200c c34200cM98890i = m98890i();
                WeakReference weakReference = this.f131891x;
                if (weakReference == null) {
                    AbstractC22676k.m65757q("weakContext");
                    throw null;
                }
                C13668i c13668i2 = this.f131890w;
                if (c13668i2 == null) {
                    AbstractC22676k.m65757q("delegateProvider");
                    throw null;
                }
                String str = m98890i().f143466H;
                String str2 = m98890i().f143467I;
                AbstractC22676k.m65750j(style, "style");
                C29938w0 c29938w0 = new C29938w0(6, (byte) 0);
                c29938w0.f122261y = style;
                c29938w0.f122260x = str;
                c29938w0.f122262z = str2;
                float pixelRatio = style.getPixelRatio();
                C27573q indicatorPositionChangedListener = this.f131886J;
                AbstractC22676k.m65750j(indicatorPositionChangedListener, "indicatorPositionChangedListener");
                C31831k indicatorBearingChangedListener = this.f131887K;
                AbstractC22676k.m65750j(indicatorBearingChangedListener, "indicatorBearingChangedListener");
                C31832l indicatorAccuracyRadiusChangedListener = this.f131888L;
                AbstractC22676k.m65750j(indicatorAccuracyRadiusChangedListener, "indicatorAccuracyRadiusChangedListener");
                C29662f c29662f = new C29662f(10, false);
                c29662f.f121230x = new C33029e(indicatorBearingChangedListener);
                c29662f.f121231y = new C33030f(indicatorPositionChangedListener);
                c29662f.f121232z = new C33026b(indicatorAccuracyRadiusChangedListener);
                c29662f.f121228E = new C33031g(pixelRatio);
                this.f131892y = new C31838r(c34200cM98890i, weakReference, c13668i2, c29938w0, c29662f);
            }
            C31838r c31838r2 = this.f131892y;
            if (c31838r2 != null) {
                c31838r2.m98911c(style);
            }
            C31838r c31838r3 = this.f131892y;
            if (c31838r3 != null) {
                C33031g c33031g = (C33031g) c31838r3.f131904e.f121228E;
                if (c33031g.f137570z) {
                    c33031g.m104298d();
                }
            }
            C25126d c25126d = this.f131893z;
            if (c25126d != null) {
                LocationError locationError = (LocationError) c25126d.f98486z;
                if (locationError == null) {
                    InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) ((ConcurrentHashMap) c25126d.f98482H).put(this, AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8709c(), (AbstractC3069w1) c25126d.f98485y)), null, null, new C2147u(c25126d, this, interfaceC30057d, 21), 3));
                    if (interfaceC3027k1 != null) {
                        interfaceC3027k1.cancel((CancellationException) null);
                    }
                } else if (this.f131892y != null) {
                    MapboxLogger.logW("LocationPuckManager", "Location error: " + locationError);
                }
            }
            this.f131881E = true;
        }
    }

    /* JADX INFO: renamed from: i */
    public final C34200c m98890i() {
        C34200c c34200c = this.f131889M;
        if (c34200c != null) {
            return c34200c;
        }
        AbstractC22676k.m65757q("internalSettings");
        throw null;
    }

    @Override // p127ev.InterfaceC13669j
    public final void initialize() {
    }

    /* JADX INFO: renamed from: j */
    public final void m98891j(Function1 function1) {
        InterfaceC3027k1 interfaceC3027k1;
        C34200c c34200cM98890i = m98890i();
        AbstractC13664e abstractC13664e = c34200cM98890i.f143471M;
        C34199b c34199b = new C34199b(abstractC13664e);
        c34199b.f143451b = c34200cM98890i.f143472w;
        c34199b.f143452c = c34200cM98890i.f143473x;
        c34199b.f143453d = c34200cM98890i.f143474y;
        c34199b.f143454e = c34200cM98890i.f143475z;
        c34199b.f143455f = c34200cM98890i.f143463E;
        c34199b.f143456g = c34200cM98890i.f143464F;
        c34199b.f143457h = c34200cM98890i.f143465G;
        c34199b.f143458i = c34200cM98890i.f143466H;
        c34199b.f143459j = c34200cM98890i.f143467I;
        c34199b.f143460k = c34200cM98890i.f143468J;
        EnumC13677r puckBearing = c34200cM98890i.f143469K;
        AbstractC22676k.m65750j(puckBearing, "puckBearing");
        c34199b.f143461l = puckBearing;
        c34199b.f143462m = c34200cM98890i.f143470L;
        c34199b.f143450a = abstractC13664e;
        function1.invoke(c34199b);
        this.f131889M = c34199b.m108102a();
        if (m98890i().f143472w && !this.f131881E) {
            WeakReference weakReference = this.f131891x;
            if (weakReference == null) {
                AbstractC22676k.m65757q("weakContext");
                throw null;
            }
            Context context = (Context) weakReference.get();
            if (context != null) {
                if (this.f131893z == null) {
                    this.f131893z = new C25126d(context);
                }
                m98889h();
            }
        }
        if (!m98890i().f143472w) {
            C31838r c31838r = this.f131892y;
            if (c31838r != null) {
                c31838r.f131905f = true;
                c31838r.f131913n.mo91114f0();
                C29662f c29662f = c31838r.f131904e;
                ((C33029e) c29662f.f121230x).m104297b();
                ((C33030f) c29662f.f121231y).m104297b();
                ((C33031g) c29662f.f121228E).m104297b();
                ((C33026b) c29662f.f121232z).m104297b();
                c31838r.f131913n.mo91108b0();
                c31838r.f131913n.mo91104X();
            }
            this.f131892y = null;
            C25126d c25126d = this.f131893z;
            if (c25126d != null && (interfaceC3027k1 = (InterfaceC3027k1) ((ConcurrentHashMap) c25126d.f98482H).remove(this)) != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
            this.f131881E = false;
            return;
        }
        C31838r c31838r2 = this.f131892y;
        if (c31838r2 != null) {
            C34200c c34200cM98890i2 = m98890i();
            c31838r2.f131900a = c34200cM98890i2;
            C29938w0 c29938w0 = c31838r2.f131903d;
            c29938w0.f122260x = c34200cM98890i2.f143466H;
            c29938w0.f122262z = c34200cM98890i2.f143467I;
            c31838r2.f131913n.mo91108b0();
            c31838r2.f131913n.mo91104X();
            InterfaceC31836p interfaceC31836pM98910b = c31838r2.m98910b(c34200cM98890i2);
            c31838r2.f131913n = interfaceC31836pM98910b;
            interfaceC31836pM98910b.mo91102V(c34200cM98890i2.f143470L);
            c31838r2.m98911c((MapboxMap) c31838r2.f131902c.f48459f);
        }
        C25126d c25126d2 = this.f131893z;
        if (c25126d2 == null) {
            c25126d2 = null;
        }
        if (c25126d2 != null) {
            C34200c c34200cM98890i3 = m98890i();
            ((C13045h2) c25126d2.f98479E).m36570j(c34200cM98890i3.f143468J ? c34200cM98890i3.f143469K : null);
        }
    }

    @Override // p127ev.InterfaceC13661b
    public final void onStart() {
        m98889h();
    }

    @Override // p127ev.InterfaceC13661b
    public final void onStop() {
        InterfaceC3027k1 interfaceC3027k1;
        this.f131881E = false;
        C31838r c31838r = this.f131892y;
        if (c31838r != null) {
            C29662f c29662f = c31838r.f131904e;
            ((C33029e) c29662f.f121230x).m104297b();
            ((C33030f) c29662f.f121231y).m104297b();
            ((C33031g) c29662f.f121228E).m104297b();
            ((C33026b) c29662f.f121232z).m104297b();
        }
        C25126d c25126d = this.f131893z;
        if (c25126d == null || (interfaceC3027k1 = (InterfaceC3027k1) ((ConcurrentHashMap) c25126d.f98482H).remove(this)) == null) {
            return;
        }
        interfaceC3027k1.cancel((CancellationException) null);
    }
}
