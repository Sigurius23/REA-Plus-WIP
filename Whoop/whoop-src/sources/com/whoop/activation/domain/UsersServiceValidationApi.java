package com.whoop.activation.domain;

import com.whoop.data.remote.domain.request.onboarding.CheckEmailRequestBody;
import com.whoop.data.remote.domain.request.onboarding.CheckUsernameRequestBody;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/activation/domain/UsersServiceValidationApi;", "", "Lcom/whoop/data/remote/domain/request/onboarding/CheckEmailRequestBody;", "body", "Lpg3/v0;", "", "checkIfEmailIsTaken", "(Lcom/whoop/data/remote/domain/request/onboarding/CheckEmailRequestBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/request/onboarding/CheckUsernameRequestBody;", "checkIfUsernameIsTaken", "(Lcom/whoop/data/remote/domain/request/onboarding/CheckUsernameRequestBody;Lq83/d;)Ljava/lang/Object;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface UsersServiceValidationApi {
    @InterfaceC37284o("users-service/v1/users/check/email")
    Object checkIfEmailIsTaken(@InterfaceC37270a CheckEmailRequestBody checkEmailRequestBody, InterfaceC30057d<? super C29218v0<Boolean>> interfaceC30057d);

    @InterfaceC37284o("users-service/v1/users/check/username")
    Object checkIfUsernameIsTaken(@InterfaceC37270a CheckUsernameRequestBody checkUsernameRequestBody, InterfaceC30057d<? super C29218v0<Boolean>> interfaceC30057d);
}
