package mv;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.QueryRenderedFeaturesCallback;
import com.mapbox.maps.QuerySourceFeaturesCallback;
import com.mapbox.maps.RenderedQueryGeometry;
import com.mapbox.maps.RenderedQueryOptions;
import com.mapbox.maps.SourceQueryOptions;

/* JADX INFO: renamed from: mv.b */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25963b {
    Cancelable queryRenderedFeatures(RenderedQueryGeometry renderedQueryGeometry, RenderedQueryOptions renderedQueryOptions, QueryRenderedFeaturesCallback queryRenderedFeaturesCallback);

    Cancelable querySourceFeatures(String str, SourceQueryOptions sourceQueryOptions, QuerySourceFeaturesCallback querySourceFeaturesCallback);
}
