package com.whoop.service.network;

import com.whoop.data.local.room.entity.UpdateUserTimeZone;
import com.whoop.service.network.model.UserPreferenceDto;
import com.whoop.service.network.model.UserPreferences;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37283n;
import wg3.InterfaceC37284o;
import xg3.C38280g;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/UsersPreferenceApi;", "", "Lcom/whoop/data/local/room/entity/UpdateUserTimeZone;", "body", "Ll83/a0;", "updateTimeZone", "(Lcom/whoop/data/local/room/entity/UpdateUserTimeZone;Lq83/d;)Ljava/lang/Object;", "Lxg3/g;", "Lpg3/v0;", "Lcom/whoop/service/network/model/UserPreferences;", "getUserPreferences", "()Lxg3/g;", "Lcom/whoop/service/network/model/UserPreferenceDto;", "preferences", "setUserPreferences", "(Lcom/whoop/service/network/model/UserPreferenceDto;)Lxg3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface UsersPreferenceApi {
    @InterfaceC37275f("users-service/v0/users/preference")
    C38280g<C29218v0<UserPreferences>> getUserPreferences();

    @InterfaceC37283n("users-service/v0/users/preference")
    C38280g<C29218v0<UserPreferences>> setUserPreferences(@InterfaceC37270a UserPreferenceDto preferences);

    @InterfaceC37284o("users-service/v1/users/preferences/time")
    Object updateTimeZone(@InterfaceC37270a UpdateUserTimeZone updateUserTimeZone, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
