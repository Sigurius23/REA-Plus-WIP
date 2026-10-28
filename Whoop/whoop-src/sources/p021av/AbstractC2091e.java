package p021av;

import android.util.Log;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.MapboxStyleManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l83.C23470p;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p660yu.C39783a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: av.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2091e {

    /* JADX INFO: renamed from: a */
    public final String f8259a;

    /* JADX INFO: renamed from: b */
    public final C23470p f8260b;

    /* JADX INFO: renamed from: c */
    public final C23470p f8261c;

    /* JADX INFO: renamed from: d */
    public MapboxStyleManager f8262d;

    public AbstractC2091e(String sourceId) {
        AbstractC22676k.m65750j(sourceId, "sourceId");
        this.f8259a = sourceId;
        this.f8260b = AbstractC30060g.m92088H(new C2088b(this, 0));
        this.f8261c = AbstractC30060g.m92088H(C2090d.f8258w);
    }

    /* JADX INFO: renamed from: a */
    public Expected mo6601a(MapboxStyleManager style) {
        AbstractC22676k.m65750j(style, "style");
        return style.addStyleSource(this.f8259a, m6604c());
    }

    /* JADX INFO: renamed from: b */
    public void mo6603b(MapboxStyleManager delegate) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f8262d = delegate;
        String str = (String) mo6601a(delegate).getError();
        if (str != null) {
            Log.e("Mbgl-Source", m6604c().toString());
            throw new MapboxStyleException("Add source failed: ".concat(str));
        }
        Iterator it = m6606f().entrySet().iterator();
        while (it.hasNext()) {
            C39783a c39783a = (C39783a) ((Map.Entry) it.next()).getValue();
            MapboxStyleManager mapboxStyleManager = this.f8262d;
            if (mapboxStyleManager != null) {
                String str2 = c39783a.f171378a;
                Value value = c39783a.f171380c;
                String error = mapboxStyleManager.setStyleSourceProperty(this.f8259a, str2, value).getError();
                if (error != null) {
                    StringBuilder sb4 = new StringBuilder("Set source property \"");
                    AbstractC11266d.m30444B(sb4, c39783a.f171378a, "\" failed:\nError: ", error, "\nValue set: ");
                    sb4.append(value);
                    throw new MapboxStyleException(sb4.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final Value m6604c() {
        HashMap map = new HashMap();
        Collection<C39783a> collectionValues = m6605d().values();
        AbstractC22676k.m65749i(collectionValues, "sourceProperties.values");
        for (C39783a c39783a : collectionValues) {
            map.put(c39783a.f171378a, c39783a.f171380c);
        }
        return new Value((HashMap<String, Value>) map);
    }

    /* JADX INFO: renamed from: d */
    public final HashMap m6605d() {
        return (HashMap) this.f8260b.getValue();
    }

    /* JADX INFO: renamed from: e */
    public abstract String mo6602e();

    /* JADX INFO: renamed from: f */
    public final HashMap m6606f() {
        return (HashMap) this.f8261c.getValue();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("[sourceId = ");
        sb4.append(this.f8259a);
        sb4.append(", ");
        Collection collectionValues = m6605d().values();
        AbstractC22676k.m65749i(collectionValues, "sourceProperties.values");
        return AbstractC25012a.m73376i(AbstractC25265s.m74110N0(collectionValues, null, null, null, C2089c.f8257w, 31), "}]", sb4);
    }
}
