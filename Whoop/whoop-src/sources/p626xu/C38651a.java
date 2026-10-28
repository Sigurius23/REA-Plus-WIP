package p626xu;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.MapboxStyleManager;
import java.util.Collection;
import java.util.HashMap;
import l83.C23470p;
import m83.AbstractC25265s;
import p319m4.AbstractC25012a;
import p320m5.C25067k;
import p594wu.C37637a;
import p660yu.C39783a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: xu.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C38651a {

    /* JADX INFO: renamed from: a */
    public String f166295a;

    /* JADX INFO: renamed from: b */
    public MapboxStyleManager f166296b;

    /* JADX INFO: renamed from: c */
    public final C23470p f166297c;

    /* JADX INFO: renamed from: d */
    public final String f166298d;

    public C38651a(String layerId, String sourceId) {
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(sourceId, "sourceId");
        this.f166297c = AbstractC30060g.m92088H(new C25067k(this, 13));
        this.f166298d = layerId;
        this.f166295a = sourceId;
    }

    /* JADX INFO: renamed from: a */
    public final void m123903a(MapboxStyleManager delegate, LayerPosition layerPosition) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f166296b = delegate;
        HashMap map = new HashMap();
        Collection<C39783a> collectionValues = ((HashMap) this.f166297c.getValue()).values();
        AbstractC22676k.m65749i(collectionValues, "layerProperties.values");
        for (C39783a c39783a : collectionValues) {
            map.put(c39783a.f171378a, c39783a.f171380c);
        }
        String error = delegate.addStyleLayer(new Value((HashMap<String, Value>) map), layerPosition).getError();
        if (error != null) {
            throw new MapboxStyleException("Add layer failed: ".concat(error));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m123904b(C39783a c39783a) {
        HashMap map = (HashMap) this.f166297c.getValue();
        String str = c39783a.f171378a;
        map.put(str, c39783a);
        MapboxStyleManager mapboxStyleManager = this.f166296b;
        if (mapboxStyleManager != null) {
            Value value = c39783a.f171380c;
            String error = mapboxStyleManager.setStyleLayerProperty(this.f166298d, str, value).getError();
            if (error == null) {
                return;
            }
            throw new MapboxStyleException("Set layer property \"" + str + "\" failed:\n" + error + '\n' + value);
        }
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("[");
        Collection collectionValues = ((HashMap) this.f166297c.getValue()).values();
        AbstractC22676k.m65749i(collectionValues, "layerProperties.values");
        return AbstractC25012a.m73376i(AbstractC25265s.m74110N0(collectionValues, null, null, null, C37637a.f161168w, 31), "}]", sb4);
    }
}
