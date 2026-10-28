package com.whoop.tombstone;

import com.mapbox.maps.MapboxMap;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\u0004H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/tombstone/TombstoneApi;", "", "", "releaseName", "", "versionCode", "Lcom/whoop/tombstone/ReleaseTombstoneResponse;", "isVersionValid", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lcom/whoop/tombstone/PaginatedReleaseTombstoneResponse;", "getVersions", "(IILq83/d;)Ljava/lang/Object;", "tombstone_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface TombstoneApi {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Object m26500a(TombstoneApi tombstoneApi, int i13, int i14, InterfaceC30057d interfaceC30057d, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVersions");
        }
        if ((i15 & 2) != 0) {
            i14 = 50;
        }
        return tombstoneApi.getVersions(i13, i14, interfaceC30057d);
    }

    @InterfaceC37275f("tombstone-service/v1/mobile/release")
    Object getVersions(@InterfaceC37289t(MapboxMap.QFE_OFFSET) int i13, @InterfaceC37289t(MapboxMap.QFE_LIMIT) int i14, InterfaceC30057d<? super PaginatedReleaseTombstoneResponse> interfaceC30057d);

    @InterfaceC37275f("tombstone-service/v1/mobile/release/{releaseName}/version/{versionCode}")
    Object isVersionValid(@InterfaceC37288s(encoded = false, value = "releaseName") String str, @InterfaceC37288s("versionCode") int i13, InterfaceC30057d<? super ReleaseTombstoneResponse> interfaceC30057d);
}
