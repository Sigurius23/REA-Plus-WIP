package com.whoop.service.network;

import com.whoop.domain.model.AuthMaterial;
import com.whoop.service.network.model.ForgotPasswordRequest;
import com.whoop.service.network.model.PasswordRequirementsResponse;
import com.whoop.service.network.model.ResetPasswordRequest;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37278i;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0011\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/AuthServiceApiV2;", "", "Lcom/whoop/service/network/model/ForgotPasswordRequest;", "request", "", "shouldCreatePassword", "Lpg3/v0;", "Ll83/a0;", "forgotPassword", "(Lcom/whoop/service/network/model/ForgotPasswordRequest;ZLq83/d;)Ljava/lang/Object;", "", "refreshToken", "Lcom/whoop/domain/model/AuthMaterial;", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/service/network/model/PasswordRequirementsResponse;", "getPasswordRequirements", "(Lq83/d;)Ljava/lang/Object;", "token", "Lcom/whoop/service/network/model/ResetPasswordRequest;", "resetPassword", "(Ljava/lang/String;Lcom/whoop/service/network/model/ResetPasswordRequest;Lq83/d;)Ljava/lang/Object;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface AuthServiceApiV2 {
    @InterfaceC37284o("auth-service/v2/whoop/forgot-password")
    Object forgotPassword(@InterfaceC37270a ForgotPasswordRequest forgotPasswordRequest, @InterfaceC37289t("v2") boolean z4, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("auth-service/v2/whoop/password/requirements")
    Object getPasswordRequirements(InterfaceC30057d<? super C29218v0<PasswordRequirementsResponse>> interfaceC30057d);

    @InterfaceC37284o("auth-service/v2/whoop/refresh")
    Object refreshToken(@InterfaceC37278i(TokenAuthInterceptor.AUTH_HEADER) String str, InterfaceC30057d<? super AuthMaterial> interfaceC30057d);

    @InterfaceC37285p("auth-service/v2/whoop/reset-password")
    Object resetPassword(@InterfaceC37278i(TokenAuthInterceptor.AUTH_HEADER) String str, @InterfaceC37270a ResetPasswordRequest resetPasswordRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
