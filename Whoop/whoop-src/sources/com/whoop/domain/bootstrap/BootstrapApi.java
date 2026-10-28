package com.whoop.domain.bootstrap;

import com.whoop.domain.bootstrap.dto.UserBootstrapDto;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37278i;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/domain/bootstrap/BootstrapApi;", "", "", "accessToken", "Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;", "getBootstrapSignIn", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "getBootstrapForUserFetch", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface BootstrapApi {
    @InterfaceC37275f("users-service/v2/bootstrap")
    Object getBootstrapForUserFetch(@InterfaceC37278i(TokenAuthInterceptor.AUTH_HEADER) String str, InterfaceC30057d<? super UserBootstrapDto> interfaceC30057d);

    @InterfaceC37275f("users-service/v2/bootstrap")
    Object getBootstrapSignIn(@InterfaceC37278i(TokenAuthInterceptor.AUTH_HEADER) String str, InterfaceC30057d<? super UserBootstrapDto> interfaceC30057d);
}
