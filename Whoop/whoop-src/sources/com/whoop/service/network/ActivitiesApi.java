package com.whoop.service.network;

import com.whoop.addactivity.network.CoreDetailsActivityResponse;
import com.whoop.addactivity.network.CreateActivityRequest;
import com.whoop.addactivity.network.CreateActivityRequestV1;
import com.whoop.addactivity.network.CreateActivityResponse;
import com.whoop.addactivity.network.model.Activity;
import com.whoop.addactivity.network.model.RecentActivity;
import com.whoop.data.remote.domain.request.UserCreatedWorkoutDto;
import com.whoop.data.remote.domain.request.UserStateRequestBody;
import com.whoop.service.network.model.UserState;
import com.whoop.service.network.model.cycles.PostSleepDtoV2;
import com.whoop.service.network.model.cycles.SleepActivityResponseV2;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import xg3.C38280g;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H§@¢\u0006\u0004\b\u001b\u0010\bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019H§@¢\u0006\u0004\b\u001d\u0010\bJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u001eH§@¢\u0006\u0004\b \u0010!J%\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00030\u00022\b\b\u0001\u0010#\u001a\u00020\"H'¢\u0006\u0004\b%\u0010&¨\u0006'À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/ActivitiesApi;", "", "Lxg3/g;", "Lpg3/v0;", "Lcom/whoop/service/network/model/UserState;", "getUserState", "()Lxg3/g;", "getUserStateSuspend", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/request/UserStateRequestBody;", "userState", "setUserStateWithRxJava", "(Lcom/whoop/data/remote/domain/request/UserStateRequestBody;)Lxg3/g;", "Ll83/a0;", "setUserState", "(Lcom/whoop/data/remote/domain/request/UserStateRequestBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/request/UserCreatedWorkoutDto;", "workout", "addWorkout", "(Lcom/whoop/data/remote/domain/request/UserCreatedWorkoutDto;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/addactivity/network/CreateActivityRequest;", "body", "Lcom/whoop/addactivity/network/CreateActivityResponse;", "postWorkoutV2", "(Lcom/whoop/addactivity/network/CreateActivityRequest;Lq83/d;)Ljava/lang/Object;", "", "Lcom/whoop/addactivity/network/model/Activity;", "getActivities", "Lcom/whoop/addactivity/network/model/RecentActivity;", "getRecentActivities", "Lcom/whoop/addactivity/network/CreateActivityRequestV1;", "Lcom/whoop/addactivity/network/CoreDetailsActivityResponse;", "createActivity", "(Lcom/whoop/addactivity/network/CreateActivityRequestV1;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/service/network/model/cycles/PostSleepDtoV2;", UserState.States.SLEEP, "Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;", "postSleepV2", "(Lcom/whoop/service/network/model/cycles/PostSleepDtoV2;)Lxg3/g;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ActivitiesApi {
    @InterfaceC37284o("activities-service/v1/user-state/workout")
    Object addWorkout(@InterfaceC37270a UserCreatedWorkoutDto userCreatedWorkoutDto, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("core-details-bff/v2/create-activity")
    Object createActivity(@InterfaceC37270a CreateActivityRequestV1 createActivityRequestV1, InterfaceC30057d<? super C29218v0<CoreDetailsActivityResponse>> interfaceC30057d);

    @InterfaceC37275f("activities-service/v2/activity-types")
    Object getActivities(InterfaceC30057d<? super List<Activity>> interfaceC30057d);

    @InterfaceC37275f("core-details-bff/v2/activity-type/user-created")
    Object getRecentActivities(InterfaceC30057d<? super List<RecentActivity>> interfaceC30057d);

    @InterfaceC37275f("activities-service/v1/user-state")
    C38280g<C29218v0<UserState>> getUserState();

    @InterfaceC37275f("activities-service/v1/user-state")
    Object getUserStateSuspend(InterfaceC30057d<? super C29218v0<UserState>> interfaceC30057d);

    @InterfaceC37284o("sleep-service/v1")
    C38280g<C29218v0<SleepActivityResponseV2>> postSleepV2(@InterfaceC37270a PostSleepDtoV2 sleep);

    @InterfaceC37284o("core-details-bff/v0/create-activity")
    Object postWorkoutV2(@InterfaceC37270a CreateActivityRequest createActivityRequest, InterfaceC30057d<? super C29218v0<CreateActivityResponse>> interfaceC30057d);

    @InterfaceC37284o("activities-service/v1/user-state")
    Object setUserState(@InterfaceC37270a UserStateRequestBody userStateRequestBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("activities-service/v1/user-state")
    C38280g<C29218v0<UserState>> setUserStateWithRxJava(@InterfaceC37270a UserStateRequestBody userState);
}
