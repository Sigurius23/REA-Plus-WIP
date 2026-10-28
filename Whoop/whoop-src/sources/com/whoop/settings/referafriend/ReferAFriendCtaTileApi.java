package com.whoop.settings.referafriend;

import com.whoop.settings.referafriend.model.ReferAFriendModel;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/settings/referafriend/ReferAFriendCtaTileApi;", "", "", "source", "Lcom/whoop/settings/referafriend/model/ReferAFriendModel;", "getRafData", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ReferAFriendCtaTileApi {
    @InterfaceC37275f("/membership-service/v1/referral-content")
    Object getRafData(@InterfaceC37289t("source") String str, InterfaceC30057d<? super ReferAFriendModel> interfaceC30057d);
}
