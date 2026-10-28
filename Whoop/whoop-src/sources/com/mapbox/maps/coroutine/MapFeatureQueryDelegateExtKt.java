package com.mapbox.maps.coroutine;

import bc3.C3033m;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.QueriedRenderedFeature;
import com.mapbox.maps.QueriedSourceFeature;
import com.mapbox.maps.QueryRenderedFeaturesCallback;
import com.mapbox.maps.QuerySourceFeaturesCallback;
import com.mapbox.maps.RenderedQueryGeometry;
import com.mapbox.maps.RenderedQueryOptions;
import com.mapbox.maps.SourceQueryOptions;
import com.mapbox.maps.UtilsKt$suspendMapboxCancellableCoroutine$2$1;
import ge3.AbstractC15751g;
import java.util.List;
import mv.InterfaceC25963b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m65681d2 = {"Lmv/b;", "Lcom/mapbox/maps/RenderedQueryGeometry;", "geometry", "Lcom/mapbox/maps/RenderedQueryOptions;", "options", "Lcom/mapbox/bindgen/Expected;", "", "", "Lcom/mapbox/maps/QueriedRenderedFeature;", "queryRenderedFeatures", "(Lmv/b;Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/maps/RenderedQueryOptions;Lq83/d;)Ljava/lang/Object;", "sourceId", "Lcom/mapbox/maps/SourceQueryOptions;", "Lcom/mapbox/maps/QueriedSourceFeature;", "querySourceFeatures", "(Lmv/b;Ljava/lang/String;Lcom/mapbox/maps/SourceQueryOptions;Lq83/d;)Ljava/lang/Object;", "maps-sdk_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapFeatureQueryDelegateExtKt {
    public static final Object queryRenderedFeatures(InterfaceC25963b interfaceC25963b, RenderedQueryGeometry renderedQueryGeometry, RenderedQueryOptions renderedQueryOptions, InterfaceC30057d interfaceC30057d) {
        final C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        c3033m.m8776u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(interfaceC25963b.queryRenderedFeatures(renderedQueryGeometry, renderedQueryOptions, new QueryRenderedFeaturesCallback() { // from class: com.mapbox.maps.coroutine.MapFeatureQueryDelegateExtKt$queryRenderedFeatures$2$1
            @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
            public final void run(Expected<String, List<QueriedRenderedFeature>> p13) {
                AbstractC22676k.m65750j(p13, "p0");
                c3033m.resumeWith(p13);
            }
        })));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    public static final Object querySourceFeatures(InterfaceC25963b interfaceC25963b, String str, SourceQueryOptions sourceQueryOptions, InterfaceC30057d interfaceC30057d) {
        final C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        c3033m.m8776u(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(interfaceC25963b.querySourceFeatures(str, sourceQueryOptions, new QuerySourceFeaturesCallback() { // from class: com.mapbox.maps.coroutine.MapFeatureQueryDelegateExtKt$querySourceFeatures$2$1
            @Override // com.mapbox.maps.QuerySourceFeaturesCallback
            public final void run(Expected<String, List<QueriedSourceFeature>> p13) {
                AbstractC22676k.m65750j(p13, "p0");
                c3033m.resumeWith(p13);
            }
        })));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }
}
