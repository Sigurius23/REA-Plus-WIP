package p470rv;

import android.util.Log;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxLocationComponentException;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.Style;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p099dv.C12380a;
import p127ev.C13663d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import vu.C36500a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: rv.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C31839s implements InterfaceC31836p {

    /* JADX INFO: renamed from: E */
    public final C31835o f131914E;

    /* JADX INFO: renamed from: F */
    public final C29938w0 f131915F;

    /* JADX INFO: renamed from: w */
    public final C13663d f131916w;

    /* JADX INFO: renamed from: x */
    public MapboxStyleManager f131917x;

    /* JADX INFO: renamed from: y */
    public Point f131918y;

    /* JADX INFO: renamed from: z */
    public double f131919z;

    public C31839s(C13663d locationModelLayerOptions) {
        Value value;
        Value value2;
        Value value3;
        Value value4;
        Value value5;
        Value value6;
        String str;
        Value valueM116999b;
        String str2;
        AbstractC22676k.m65750j(locationModelLayerOptions, "locationModelLayerOptions");
        this.f131916w = locationModelLayerOptions;
        List list = locationModelLayerOptions.f48445z;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it.next()).floatValue()));
        }
        List list2 = locationModelLayerOptions.f48425G;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Double.valueOf(((Number) it3.next()).floatValue()));
        }
        String str3 = locationModelLayerOptions.f48432N;
        if (str3 != null) {
            Expected<String, Value> expectedFromJson = Value.fromJson(str3);
            AbstractC22676k.m65749i(expectedFromJson, "fromJson(it)");
            String error = expectedFromJson.getError();
            if (error != null) {
                throw new MapboxLocationComponentException(error);
            }
            Value value7 = expectedFromJson.getValue();
            if (value7 == null) {
                throw new MapboxLocationComponentException("Error in parsing expression.");
            }
            value = value7;
        } else {
            value = null;
        }
        List list3 = locationModelLayerOptions.f48424F;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        Iterator it4 = list3.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Double.valueOf(((Number) it4.next()).floatValue()));
        }
        boolean z4 = locationModelLayerOptions.f48426H;
        boolean z13 = locationModelLayerOptions.f48427I;
        double d3 = locationModelLayerOptions.f48444y;
        String str4 = locationModelLayerOptions.f48431M;
        if (str4 != null) {
            Expected<String, Value> expectedFromJson2 = Value.fromJson(str4);
            AbstractC22676k.m65749i(expectedFromJson2, "fromJson(it)");
            String error2 = expectedFromJson2.getError();
            if (error2 != null) {
                throw new MapboxLocationComponentException(error2);
            }
            Value value8 = expectedFromJson2.getValue();
            if (value8 == null) {
                throw new MapboxLocationComponentException("Error in parsing expression.");
            }
            value2 = value8;
        } else {
            value2 = null;
        }
        int i13 = locationModelLayerOptions.f48428J;
        Value value9 = value;
        double d14 = locationModelLayerOptions.f48429K;
        String str5 = locationModelLayerOptions.f48430L;
        if (str5 != null) {
            Expected<String, Value> expectedFromJson3 = Value.fromJson(str5);
            AbstractC22676k.m65749i(expectedFromJson3, "fromJson(it)");
            String error3 = expectedFromJson3.getError();
            if (error3 != null) {
                throw new MapboxLocationComponentException(error3);
            }
            Value value10 = expectedFromJson3.getValue();
            if (value10 == null) {
                throw new MapboxLocationComponentException("Error in parsing expression.");
            }
            value3 = value10;
        } else {
            value3 = null;
        }
        int i14 = locationModelLayerOptions.f48433O;
        Value value11 = value2;
        String str6 = locationModelLayerOptions.f48434P;
        if (str6 != null) {
            Expected<String, Value> expectedFromJson4 = Value.fromJson(str6);
            AbstractC22676k.m65749i(expectedFromJson4, "fromJson(it)");
            String error4 = expectedFromJson4.getError();
            if (error4 != null) {
                throw new MapboxLocationComponentException(error4);
            }
            Value value12 = expectedFromJson4.getValue();
            if (value12 == null) {
                throw new MapboxLocationComponentException("Error in parsing expression.");
            }
            value4 = value12;
        } else {
            value4 = null;
        }
        double d15 = locationModelLayerOptions.f48435Q;
        String str7 = locationModelLayerOptions.f48436R;
        if (str7 != null) {
            Expected<String, Value> expectedFromJson5 = Value.fromJson(str7);
            AbstractC22676k.m65749i(expectedFromJson5, "fromJson(it)");
            String error5 = expectedFromJson5.getError();
            if (error5 != null) {
                throw new MapboxLocationComponentException(error5);
            }
            Value value13 = expectedFromJson5.getValue();
            if (value13 == null) {
                throw new MapboxLocationComponentException("Error in parsing expression.");
            }
            value5 = value13;
        } else {
            value5 = null;
        }
        int i15 = locationModelLayerOptions.f48439U;
        AbstractC18489d0.m53382w(i13, "modelScaleMode");
        AbstractC18489d0.m53382w(i15, "modelElevationReference");
        C31835o c31835o = new C31835o("mapbox-location-model-layer");
        Value value14 = value5;
        c31835o.f131896b.put("id", new Value("mapbox-location-model-layer"));
        c31835o.f131896b.put("type", new Value("model"));
        c31835o.f131896b.put("source", new Value("mapbox-location-model-source"));
        c31835o.f131896b.put("model-type", new Value("location-indicator"));
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList4.add(new Value(((Number) it5.next()).doubleValue()));
            i15 = i15;
            d15 = d15;
        }
        double d16 = d15;
        int i16 = i15;
        c31835o.f131896b.put("model-scale", new Value((List<Value>) arrayList4));
        if (value9 == null) {
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                arrayList5.add(new Value(((Number) it6.next()).doubleValue()));
            }
            value6 = new Value((List<Value>) arrayList5);
        } else {
            value6 = value9;
        }
        c31835o.f131896b.put("model-rotation", value6);
        ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
        Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            arrayList6.add(new Value(((Number) it7.next()).doubleValue()));
        }
        c31835o.f131896b.put("model-translation", new Value((List<Value>) arrayList6));
        c31835o.f131896b.put("model-cast-shadows", new Value(z4));
        c31835o.f131896b.put("model-receive-shadows", new Value(z13));
        c31835o.f131896b.put("model-opacity", value11 == null ? new Value(d3) : value11);
        if (i13 == 1) {
            str = "map";
        } else {
            if (i13 != 2) {
                throw null;
            }
            str = "viewport";
        }
        c31835o.f131896b.put("model-scale-mode", new Value(str));
        c31835o.f131896b.put("model-scale-transition", C31835o.m98905c());
        c31835o.f131896b.put("model-rotation-transition", C31835o.m98905c());
        c31835o.f131896b.put("model-emissive-strength", value3 == null ? new Value(d14) : value3);
        if (value4 == null) {
            C12380a c12380a = new C12380a(i14, ((double) ((i14 >> 24) & 255)) / 255.0d);
            C36500a c36500a = new C36500a("rgba");
            c12380a.invoke(c36500a);
            valueM116999b = c36500a.m116999b();
        } else {
            valueM116999b = value4;
        }
        c31835o.f131896b.put("model-color", valueM116999b);
        c31835o.f131896b.put("model-color-mix-intensity", value14 == null ? new Value(d16) : value14);
        if (i16 == 1) {
            str2 = "sea";
        } else {
            if (i16 != 2) {
                throw null;
            }
            str2 = "ground";
        }
        c31835o.f131896b.put("model-elevation-reference", new Value(str2));
        this.f131914E = c31835o;
        C13663d locationModelLayerOptions2 = this.f131916w;
        AbstractC22676k.m65750j(locationModelLayerOptions2, "locationModelLayerOptions");
        String url = locationModelLayerOptions2.f48442w;
        if (url.length() == 0) {
            throw new IllegalArgumentException("Model Url must not be empty!");
        }
        List list4 = locationModelLayerOptions2.f48443x;
        ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
        Iterator it8 = list4.iterator();
        while (it8.hasNext()) {
            arrayList7.add(Double.valueOf(((Number) it8.next()).floatValue()));
        }
        List materialOverrides = locationModelLayerOptions2.f48437S;
        List nodeOverrides = locationModelLayerOptions2.f48438T;
        Double dValueOf = Double.valueOf(0.0d);
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(materialOverrides, "materialOverrides");
        AbstractC22676k.m65750j(nodeOverrides, "nodeOverrides");
        C29938w0 c29938w0 = new C29938w0(7, (byte) 0);
        c29938w0.f122260x = url;
        c29938w0.f122261y = new HashMap();
        HashMap map = new HashMap();
        map.put("uri", new Value(url));
        ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(arrayList7, 10));
        Iterator it9 = arrayList7.iterator();
        while (it9.hasNext()) {
            arrayList8.add(new Value(((Number) it9.next()).doubleValue()));
        }
        map.put("position", new Value((List<Value>) arrayList8));
        List listM118959K = AbstractC37056f.m118959K(dValueOf, dValueOf, dValueOf);
        ArrayList arrayList9 = new ArrayList(AbstractC25267u.m74163i0(listM118959K, 10));
        Iterator it10 = listM118959K.iterator();
        while (it10.hasNext()) {
            arrayList9.add(new Value(((Number) it10.next()).doubleValue()));
        }
        map.put("orientation", new Value((List<Value>) arrayList9));
        List list5 = materialOverrides;
        ArrayList arrayList10 = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
        Iterator it11 = list5.iterator();
        while (it11.hasNext()) {
            arrayList10.add(new Value((String) it11.next()));
        }
        map.put("materialOverrides", new Value((List<Value>) arrayList10));
        List list6 = nodeOverrides;
        ArrayList arrayList11 = new ArrayList(AbstractC25267u.m74163i0(list6, 10));
        Iterator it12 = list6.iterator();
        while (it12.hasNext()) {
            arrayList11.add(new Value((String) it12.next()));
        }
        map.put("nodeOverrides", new Value((List<Value>) arrayList11));
        HashMap map2 = new HashMap();
        map2.put("defaultModel", new Value((HashMap<String, Value>) map));
        ((HashMap) c29938w0.f122261y).put("type", new Value("model"));
        ((HashMap) c29938w0.f122261y).put("models", new Value((HashMap<String, Value>) map2));
        this.f131915F = c29938w0;
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: C */
    public final void mo91078C(C29938w0 c29938w0) {
        c29938w0.m91558b(this.f131914E);
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: E */
    public final void mo91081E(int i13, int i14) {
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: K */
    public final void mo91089K(Value value) {
        C31835o c31835o = this.f131914E;
        c31835o.getClass();
        c31835o.m98907d("model-scale", value);
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: T */
    public final void mo91099T(Point latLng) {
        AbstractC22676k.m65750j(latLng, "latLng");
        this.f131918y = latLng;
        m98914a();
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: V */
    public final void mo91102V(String str) {
        C31835o c31835o = this.f131914E;
        c31835o.getClass();
        if (str == null) {
            str = "";
        }
        c31835o.m98907d("slot", new Value(str));
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: X */
    public final void mo91104X() {
        MapboxStyleManager mapboxStyleManager = this.f131917x;
        if (mapboxStyleManager != null) {
            mapboxStyleManager.removeStyleLayer(this.f131914E.f131895a);
        }
        MapboxStyleManager mapboxStyleManager2 = this.f131917x;
        if (mapboxStyleManager2 != null) {
            this.f131915F.getClass();
            mapboxStyleManager2.removeStyleSource("mapbox-location-model-source");
        }
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: Y */
    public final void mo91105Y(MapboxStyleManager style) {
        AbstractC22676k.m65750j(style, "style");
        this.f131917x = style;
        C29938w0 c29938w0 = this.f131915F;
        c29938w0.getClass();
        c29938w0.f122262z = style;
        HashMap map = (HashMap) c29938w0.f122261y;
        String error = style.addStyleSource("mapbox-location-model-source", new Value((HashMap<String, Value>) map)).getError();
        if (error == null) {
            return;
        }
        Log.e("Mbgl-ModelSourceWrapper", map.toString());
        throw new MapboxLocationComponentException("Add source failed: ".concat(error));
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: Z */
    public final void mo91106Z(Style style) {
        this.f131917x = style;
        C31835o c31835o = this.f131914E;
        c31835o.getClass();
        c31835o.f131897c = style;
        C29938w0 c29938w0 = this.f131915F;
        c29938w0.getClass();
        c29938w0.f122262z = style;
    }

    /* JADX INFO: renamed from: a */
    public final void m98914a() {
        String error;
        Double dValueOf = Double.valueOf(0.0d);
        Point point = this.f131918y;
        if (point != null) {
            List listM118959K = AbstractC37056f.m118959K(Double.valueOf(point.longitude()), Double.valueOf(point.latitude()));
            List listM118959K2 = AbstractC37056f.m118959K(dValueOf, dValueOf, Double.valueOf(this.f131919z));
            C29938w0 c29938w0 = this.f131915F;
            c29938w0.getClass();
            List list = listM118959K;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Value(((Number) it.next()).doubleValue()));
            }
            C23465k c23465k = new C23465k("position", new Value((List<Value>) arrayList));
            List list2 = listM118959K2;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new Value(((Number) it3.next()).doubleValue()));
            }
            Value value = new Value((HashMap<String, Value>) AbstractC25247g0.m73987V(new C23465k("defaultModel", new Value((HashMap<String, Value>) AbstractC25247g0.m73987V(c23465k, new C23465k("orientation", new Value((List<Value>) arrayList2)), new C23465k("uri", new Value((String) c29938w0.f122260x)))))));
            ((HashMap) c29938w0.f122261y).put("models", value);
            MapboxStyleManager mapboxStyleManager = (MapboxStyleManager) c29938w0.f122262z;
            if (mapboxStyleManager == null || (error = mapboxStyleManager.setStyleSourceProperty("mapbox-location-model-source", "models", value).getError()) == null) {
                return;
            }
            MapboxLogger.logE("Mbgl-ModelSourceWrapper", "Set source property \"models\" failed:\nError: " + error + "\nValue set: " + value);
        }
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: b0 */
    public final void mo91108b0() {
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: c */
    public final void mo91109c() {
        C31835o c31835o = this.f131914E;
        c31835o.getClass();
        c31835o.m98907d("visibility", new Value("visible"));
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: d0 */
    public final void mo91112d0(float f13) {
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: f */
    public final boolean mo91113f() {
        MapboxStyleManager mapboxStyleManager = this.f131917x;
        if (mapboxStyleManager != null ? mapboxStyleManager.styleLayerExists("mapbox-location-model-layer") : false) {
            MapboxStyleManager mapboxStyleManager2 = this.f131917x;
            if (mapboxStyleManager2 != null ? mapboxStyleManager2.styleSourceExists("mapbox-location-model-source") : false) {
                return true;
            }
        }
        return false;
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: f0 */
    public final void mo91114f0() {
        C31835o c31835o = this.f131914E;
        c31835o.getClass();
        c31835o.m98907d("visibility", new Value("none"));
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: l */
    public final void mo91122l(int i13, float f13, Float f14) {
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: n */
    public final void mo91124n(double d3) {
        this.f131919z = d3;
        m98914a();
    }
}
