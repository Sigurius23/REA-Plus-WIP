package p470rv;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxLocationComponentException;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.HashMap;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rv.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C31835o {

    /* JADX INFO: renamed from: a */
    public final String f131895a;

    /* JADX INFO: renamed from: b */
    public final HashMap f131896b = new HashMap();

    /* JADX INFO: renamed from: c */
    public MapboxStyleManager f131897c;

    public C31835o(String str) {
        this.f131895a = str;
    }

    /* JADX INFO: renamed from: b */
    public static Value m98904b() {
        HashMap map = new HashMap();
        map.put("delay", new Value(0L));
        map.put(AttachmentExtensionsKt.EXTRA_DURATION, new Value(0L));
        return new Value((HashMap<String, Value>) map);
    }

    /* JADX INFO: renamed from: c */
    public static Value m98905c() {
        HashMap map = new HashMap();
        map.put("delay", new Value(0L));
        map.put(AttachmentExtensionsKt.EXTRA_DURATION, new Value(0L));
        return new Value((HashMap<String, Value>) map);
    }

    /* JADX INFO: renamed from: a */
    public final void m98906a(MapboxStyleManager style, LayerPosition layerPosition) {
        AbstractC22676k.m65750j(style, "style");
        this.f131897c = style;
        String error = style.addPersistentStyleLayer(new Value((HashMap<String, Value>) this.f131896b), layerPosition).getError();
        if (error != null) {
            throw new MapboxLocationComponentException("Add layer failed: ".concat(error));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m98907d(String str, Value value) {
        String error;
        this.f131896b.put(str, value);
        MapboxStyleManager mapboxStyleManager = this.f131897c;
        if (mapboxStyleManager == null || (error = mapboxStyleManager.setStyleLayerProperty(this.f131895a, str, value).getError()) == null) {
            return;
        }
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Set layer property \"", str, "\" failed:\nError: ", error, "\nValue set: ");
        sbM32001t.append(value);
        MapboxLogger.logE("MapboxLocationLayerWrapper", sbM32001t.toString());
    }
}
