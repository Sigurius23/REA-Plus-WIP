package com.whoop.searcharchmini.api;

import com.whoop.searcharchmini.domain.model.SearchArchMiniResponse;
import io.getstream.chat.android.client.api.QueryParams;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37294y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/searcharchmini/api/SearchArchMiniApi;", "", "", QueryParams.URL, "Lcom/whoop/searcharchmini/domain/model/SearchArchMiniResponse;", "getSearchResponse", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface SearchArchMiniApi {
    @InterfaceC37275f
    Object getSearchResponse(@InterfaceC37294y String str, InterfaceC30057d<? super SearchArchMiniResponse> interfaceC30057d);
}
