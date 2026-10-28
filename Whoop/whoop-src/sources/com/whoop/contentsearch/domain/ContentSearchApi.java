package com.whoop.contentsearch.domain;

import com.mapbox.maps.MapboxMap;
import com.whoop.contentsearch.domain.models.ContentSearchResponse;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J<\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/contentsearch/domain/ContentSearchApi;", "", "", "key", "nextToken", "", MapboxMap.QFE_LIMIT, "type", "Lcom/whoop/contentsearch/domain/models/ContentSearchResponse;", "getContentSearch", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ContentSearchApi {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Object m19647a(ContentSearchApi contentSearchApi, String str, String str2, int i13, String str3, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContentSearch");
        }
        if ((i14 & 1) != 0) {
            str = "";
        }
        if ((i14 & 2) != 0) {
            str2 = null;
        }
        if ((i14 & 4) != 0) {
            i13 = 20;
        }
        int i15 = i13;
        return contentSearchApi.getContentSearch(str, str2, i15, str3, interfaceC30057d);
    }

    @InterfaceC37275f("onboarding-service/v1/learn-more-carousel/bff/explore")
    Object getContentSearch(@InterfaceC37289t("key") String str, @InterfaceC37289t("next_token") String str2, @InterfaceC37289t(MapboxMap.QFE_LIMIT) int i13, @InterfaceC37289t("type") String str3, InterfaceC30057d<? super ContentSearchResponse> interfaceC30057d);
}
