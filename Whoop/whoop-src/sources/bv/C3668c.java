package bv;

import a00.C0072g;
import android.os.Handler;
import android.os.HandlerThread;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.GeoJson;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.GeoJSONSourceData;
import com.mapbox.maps.MapboxStyleManager;
import java.util.HashMap;
import java.util.List;
import l83.C23470p;
import p021av.AbstractC2091e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: bv.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C3668c extends AbstractC2091e {

    /* JADX INFO: renamed from: i */
    public static final HandlerThread f14922i;

    /* JADX INFO: renamed from: e */
    public GeoJson f14923e;

    /* JADX INFO: renamed from: f */
    public String f14924f;

    /* JADX INFO: renamed from: g */
    public final C23470p f14925g;

    /* JADX INFO: renamed from: h */
    public final C23470p f14926h;

    static {
        HandlerThread handlerThread = new HandlerThread("GEOJSON_PARSER", 0);
        handlerThread.start();
        f14922i = handlerThread;
    }

    public C3668c(C0072g c0072g) {
        super((String) c0072g.f223x);
        m6605d().putAll((HashMap) c0072g.f224y);
        m6606f().putAll((HashMap) c0072g.f225z);
        this.f14923e = null;
        this.f14924f = (String) c0072g.f221E;
        this.f14925g = AbstractC30060g.m92088H(C3667b.f14920y);
        this.f14926h = AbstractC30060g.m92088H(C3667b.f14919x);
    }

    @Override // p021av.AbstractC2091e
    /* JADX INFO: renamed from: b */
    public final void mo6603b(MapboxStyleManager delegate) {
        AbstractC22676k.m65750j(delegate, "delegate");
        super.mo6603b(delegate);
        GeoJson geoJson = this.f14923e;
        if (geoJson != null) {
            m11336g(geoJson, this.f14924f);
        }
    }

    @Override // p021av.AbstractC2091e
    /* JADX INFO: renamed from: e */
    public final String mo6602e() {
        return "geojson";
    }

    /* JADX INFO: renamed from: g */
    public final void m11336g(GeoJson geoJson, String str) {
        GeoJSONSourceData geoJSONSourceDataValueOf;
        C3668c c3668c;
        String str2;
        AbstractC22676k.m65750j(geoJson, "geoJson");
        if (geoJson instanceof Feature) {
            geoJSONSourceDataValueOf = GeoJSONSourceData.valueOf((Feature) geoJson);
            AbstractC22676k.m65749i(geoJSONSourceDataValueOf, "valueOf(geoJson)");
        } else if (geoJson instanceof Geometry) {
            geoJSONSourceDataValueOf = GeoJSONSourceData.valueOf((Geometry) geoJson);
            AbstractC22676k.m65749i(geoJSONSourceDataValueOf, "valueOf(geoJson)");
        } else {
            if (!(geoJson instanceof FeatureCollection)) {
                throw new RuntimeException("Incorrect GeoJson data format");
            }
            List<Feature> listFeatures = ((FeatureCollection) geoJson).features();
            AbstractC22676k.m65747g(listFeatures);
            geoJSONSourceDataValueOf = GeoJSONSourceData.valueOf(listFeatures);
            AbstractC22676k.m65749i(geoJSONSourceDataValueOf, "valueOf(geoJson.features()!!)");
        }
        GeoJSONSourceData geoJSONSourceData = geoJSONSourceDataValueOf;
        MapboxStyleManager mapboxStyleManager = this.f8262d;
        if (mapboxStyleManager != null) {
            C23470p c23470p = this.f14925g;
            ((Handler) c23470p.getValue()).removeCallbacksAndMessages(null);
            c3668c = this;
            str2 = str;
            ((Handler) c23470p.getValue()).post(new RunnableC3666a(mapboxStyleManager, c3668c, str2, geoJSONSourceData, 0));
        } else {
            c3668c = this;
            str2 = str;
        }
        c3668c.f14923e = geoJson;
        c3668c.f14924f = str2;
    }
}
