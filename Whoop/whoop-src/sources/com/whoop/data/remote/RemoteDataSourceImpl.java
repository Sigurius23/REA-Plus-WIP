package com.whoop.data.remote;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3061u;
import c93.InterfaceC4351m;
import com.whoop.community.data.network.CommunityServiceApi;
import com.whoop.consolePackets.data.api.ConsolePacketsApi;
import com.whoop.data.local.room.entity.TeamsDto;
import com.whoop.data.remote.commons.ApiResponse;
import com.whoop.data.remote.domain.dto.InvitationDto;
import com.whoop.data.remote.domain.dto.gamification.MemberLevelDto;
import com.whoop.data.remote.domain.dto.growth.MembershipInfoDto;
import com.whoop.data.remote.domain.request.RecordUserStrapRequestBody;
import com.whoop.domain.exception.InviteCodeException;
import com.whoop.domain.model.Invitation;
import com.whoop.domain.model.RecordsDto;
import com.whoop.domain.model.teams.CommunityDto;
import com.whoop.domain.model.teams.FeatureCommunityDto;
import com.whoop.domain.model.teams.FeatureTeam;
import com.whoop.domain.model.teams.MemberStoryDto;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamInviteDto;
import com.whoop.network.exception.DomainException;
import com.whoop.service.network.CommunityApi;
import com.whoop.service.network.LegacyTeamServiceApi;
import com.whoop.service.network.MembershipApi;
import com.whoop.service.network.MembershipV2Api;
import com.whoop.service.network.ProfileApiService;
import com.whoop.service.network.model.ClaimInviteDto;
import com.whoop.service.network.model.ClaimInviteResponse;
import com.whoop.service.network.model.DefaultImages;
import i92.AbstractC18274s;
import in2.InterfaceC18732d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import lh3.AbstractC24088k;
import m83.C25271y;
import or2.InterfaceC28172j0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import retrofit2.HttpException;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.AbstractC34846v0;
import ud3.C34850x0;
import w02.AbstractC36685b;
import xg3.C38280g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b#\u0010$J)\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(0'2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b+\u0010,JM\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010)0(0'2\u0006\u0010&\u001a\u00020%2\u0006\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001b2\b\u0010/\u001a\u0004\u0018\u00010\u001b2\b\u00100\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b2\u00103J\u001b\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040(0'H\u0016¢\u0006\u0004\b5\u00106J\u0016\u00108\u001a\b\u0012\u0004\u0012\u0002070)H\u0096@¢\u0006\u0004\b8\u00109J2\u0010?\u001a\b\u0012\u0004\u0012\u00020>0!2\u0006\u0010;\u001a\u00020:2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0<H\u0096@¢\u0006\u0004\b?\u0010@J\u0018\u0010C\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010AH\u0096@¢\u0006\u0004\bC\u00109J\u001e\u0010F\u001a\b\u0012\u0004\u0012\u00020E0A2\u0006\u0010D\u001a\u00020%H\u0096@¢\u0006\u0004\bF\u0010GJ\u0010\u0010I\u001a\u00020HH\u0096@¢\u0006\u0004\bI\u00109J\u001e\u0010L\u001a\b\u0012\u0004\u0012\u00020>0!2\u0006\u0010K\u001a\u00020JH\u0096@¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010NR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010OR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010PR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010QR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010RR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010SR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010TR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010UR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010VR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010WR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010_\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006`"}, m65681d2 = {"Lcom/whoop/data/remote/RemoteDataSourceImpl;", "Lbc3/c0;", "Lcom/whoop/data/remote/RemoteDataSource;", "Lcom/whoop/service/network/CommunityApi;", "communityApi", "Lcom/whoop/community/data/network/CommunityServiceApi;", "communityServiceApi", "Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;", "consolePacketsApi", "Lcom/whoop/service/network/LegacyTeamServiceApi;", "legacyTeamServiceApi", "Lcom/whoop/service/network/ProfileApiService;", "profileApiService", "Lcom/whoop/service/network/MembershipApi;", "membershipApi", "Lcom/whoop/service/network/MembershipV2Api;", "membershipV2Api", "Lin2/d;", "dispatcherFactory", "Ltr2/n;", "logger", "Lrr2/c;", "crashReporter", "Lor2/j0;", "idleIndicator", "<init>", "(Lcom/whoop/service/network/CommunityApi;Lcom/whoop/community/data/network/CommunityServiceApi;Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;Lcom/whoop/service/network/LegacyTeamServiceApi;Lcom/whoop/service/network/ProfileApiService;Lcom/whoop/service/network/MembershipApi;Lcom/whoop/service/network/MembershipV2Api;Lin2/d;Ltr2/n;Lrr2/c;Lor2/j0;)V", "", "inviteCode", "Lcom/whoop/domain/model/Invitation;", "validateInviteCode", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lxg3/g;", "Lpg3/v0;", "Lcom/whoop/service/network/model/ClaimInviteResponse;", "joinTeam", "(Ljava/lang/String;)Lxg3/g;", "", "userId", "Landroidx/lifecycle/p0;", "Lcom/whoop/data/remote/commons/ApiResponse;", "", "Lcom/whoop/domain/model/teams/TeamInviteDto;", "getTeamInviteLiveData", "(I)Landroidx/lifecycle/p0;", "leaderboardType", "startDate", "endDate", "period", "Lcom/whoop/data/local/room/entity/TeamsDto;", "getTeamsWithRankLiveData", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/p0;", "Lcom/whoop/service/network/model/DefaultImages;", "getDefaultImagesLiveData", "()Landroidx/lifecycle/p0;", "Lcom/whoop/domain/model/teams/FeatureTeam;", "getFeatureTeams", "(Lq83/d;)Ljava/lang/Object;", "Lud3/v0;", "body", "", "headers", "Ll83/a0;", "uploadConsoleEventPackets", "(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/domain/model/RecordsDto;", "Lcom/whoop/domain/model/teams/MemberStoryDto;", "getMemberStories", "level", "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;", "getAllProgressLevels", "(ILq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto;", "getMembershipInfo", "Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;", "strap", "recordUserStrap", "(Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/service/network/CommunityApi;", "Lcom/whoop/community/data/network/CommunityServiceApi;", "Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;", "Lcom/whoop/service/network/LegacyTeamServiceApi;", "Lcom/whoop/service/network/ProfileApiService;", "Lcom/whoop/service/network/MembershipApi;", "Lcom/whoop/service/network/MembershipV2Api;", "Lin2/d;", "Ltr2/n;", "Lrr2/c;", "Lor2/j0;", "Lbc3/u;", "job", "Lbc3/u;", "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "coroutineContext", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class RemoteDataSourceImpl implements InterfaceC2994c0, RemoteDataSource {
    public static final int $stable = 8;
    private final CommunityApi communityApi;
    private final CommunityServiceApi communityServiceApi;
    private final ConsolePacketsApi consolePacketsApi;
    private final InterfaceC31766c crashReporter;
    private final InterfaceC18732d dispatcherFactory;
    private final InterfaceC28172j0 idleIndicator;
    private final InterfaceC3061u job;
    private final LegacyTeamServiceApi legacyTeamServiceApi;
    private final InterfaceC34116n logger;
    private final MembershipApi membershipApi;
    private final MembershipV2Api membershipV2Api;
    private final ProfileApiService profileApiService;

    /* JADX INFO: renamed from: com.whoop.data.remote.RemoteDataSourceImpl$getAllProgressLevels$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.remote.RemoteDataSourceImpl$getAllProgressLevels$2", m100430f = "RemoteDataSourceImpl.kt", m100431l = {233}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/domain/model/RecordsDto;", "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/domain/model/RecordsDto;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65332 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ int $level;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65332(int i13, InterfaceC30057d<? super C65332> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$level = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return RemoteDataSourceImpl.this.new C65332(this.$level, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super RecordsDto<MemberLevelDto>> interfaceC30057d) {
            return ((C65332) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ProfileApiService profileApiService = RemoteDataSourceImpl.this.profileApiService;
            int i14 = this.$level;
            this.label = 1;
            Object allProgressLevels = profileApiService.getAllProgressLevels(i14, this);
            return allProgressLevels == enumC31071a ? enumC31071a : allProgressLevels;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.remote.RemoteDataSourceImpl$getDefaultImagesLiveData$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.remote.RemoteDataSourceImpl$getDefaultImagesLiveData$1", m100430f = "RemoteDataSourceImpl.kt", m100431l = {184}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65341 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ C1630u0 $liveData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65341(C1630u0 c1630u0, InterfaceC30057d<? super C65341> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$liveData = c1630u0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return RemoteDataSourceImpl.this.new C65341(this.$liveData, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C65341) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC30063j interfaceC30063jMo54465b = RemoteDataSourceImpl.this.dispatcherFactory.mo54465b();
                    RemoteDataSourceImpl$getDefaultImagesLiveData$1$defaultImages$1 remoteDataSourceImpl$getDefaultImagesLiveData$1$defaultImages$1 = new RemoteDataSourceImpl$getDefaultImagesLiveData$1$defaultImages$1(RemoteDataSourceImpl.this, null);
                    this.label = 1;
                    obj = AbstractC3006f0.m8705K(interfaceC30063jMo54465b, remoteDataSourceImpl$getDefaultImagesLiveData$1$defaultImages$1, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.$liveData.postValue(ApiResponse.INSTANCE.create((DefaultImages) obj));
            } catch (Exception e5) {
                RemoteDataSourceImpl.this.logger.mo85222m(AbstractC11266d.m30461o("Unable to get default images: ", e5.getMessage()), new AbstractC30556a.a[0]);
                this.$liveData.postValue(ApiResponse.INSTANCE.create((Throwable) e5));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.remote.RemoteDataSourceImpl$getFeatureTeams$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.remote.RemoteDataSourceImpl", m100430f = "RemoteDataSourceImpl.kt", m100431l = {199}, m100432m = "getFeatureTeams", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65351 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C65351(InterfaceC30057d<? super C65351> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteDataSourceImpl.this.getFeatureTeams(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.remote.RemoteDataSourceImpl$getMemberStories$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.remote.RemoteDataSourceImpl", m100430f = "RemoteDataSourceImpl.kt", m100431l = {223}, m100432m = "getMemberStories", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65361 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C65361(InterfaceC30057d<? super C65361> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteDataSourceImpl.this.getMemberStories(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.remote.RemoteDataSourceImpl$getMemberStories$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.remote.RemoteDataSourceImpl$getMemberStories$2", m100430f = "RemoteDataSourceImpl.kt", m100431l = {224}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/domain/model/RecordsDto;", "Lcom/whoop/domain/model/teams/MemberStoryDto;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/domain/model/RecordsDto;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65372 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C65372(InterfaceC30057d<? super C65372> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return RemoteDataSourceImpl.this.new C65372(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super RecordsDto<MemberStoryDto>> interfaceC30057d) {
            return ((C65372) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CommunityServiceApi communityServiceApi = RemoteDataSourceImpl.this.communityServiceApi;
            this.label = 1;
            Object memberStories = communityServiceApi.getMemberStories(this);
            return memberStories == enumC31071a ? enumC31071a : memberStories;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.remote.RemoteDataSourceImpl$getMembershipInfo$2 */
    @InterfaceC32271e(m100429c = "com.whoop.data.remote.RemoteDataSourceImpl$getMembershipInfo$2", m100430f = "RemoteDataSourceImpl.kt", m100431l = {237}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65382 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C65382(InterfaceC30057d<? super C65382> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return RemoteDataSourceImpl.this.new C65382(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super MembershipInfoDto> interfaceC30057d) {
            return ((C65382) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipApi membershipApi = RemoteDataSourceImpl.this.membershipApi;
            this.label = 1;
            Object membershipInfo = membershipApi.getMembershipInfo(this);
            return membershipInfo == enumC31071a ? enumC31071a : membershipInfo;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.remote.RemoteDataSourceImpl$getTeamInviteLiveData$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.remote.RemoteDataSourceImpl$getTeamInviteLiveData$1", m100430f = "RemoteDataSourceImpl.kt", m100431l = {107}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65391 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ C1630u0 $liveData;
        final /* synthetic */ int $userId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65391(int i13, C1630u0 c1630u0, InterfaceC30057d<? super C65391> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$userId = i13;
            this.$liveData = c1630u0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return RemoteDataSourceImpl.this.new C65391(this.$userId, this.$liveData, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C65391) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ArrayList arrayList2 = new ArrayList();
                    CommunityApi communityApi = RemoteDataSourceImpl.this.communityApi;
                    int i14 = this.$userId;
                    this.L$0 = arrayList2;
                    this.label = 1;
                    Object invitesForUser = communityApi.getInvitesForUser(i14, this);
                    if (invitesForUser == enumC31071a) {
                        return enumC31071a;
                    }
                    arrayList = arrayList2;
                    obj = invitesForUser;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = (ArrayList) this.L$0;
                    AbstractC34132o.m107864I(obj);
                }
                for (TeamInviteDto teamInviteDto : ((RecordsDto) obj).getRecords()) {
                    teamInviteDto.setShowBadge(true);
                    arrayList.add(teamInviteDto);
                }
                this.$liveData.postValue(ApiResponse.INSTANCE.create(arrayList));
            } catch (IOException e5) {
                RemoteDataSourceImpl.this.logger.mo85222m(AbstractC11266d.m30461o("Server communication error: ", e5.getMessage()), new AbstractC30556a.a[0]);
            } catch (HttpException e13) {
                RemoteDataSourceImpl.this.logger.mo85222m(AbstractC2875y.m8295h(e13.f128920w, "HTTP Exception: #"), new AbstractC30556a.a[0]);
            } catch (Exception e14) {
                RemoteDataSourceImpl.this.logger.mo85230v("Exception - printing stack trace:", e14, new AbstractC30556a.a[0]);
                this.$liveData.postValue(ApiResponse.INSTANCE.create((Throwable) e14));
            }
            RemoteDataSourceImpl.this.idleIndicator.mo85209b();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.remote.RemoteDataSourceImpl$getTeamsWithRankLiveData$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.remote.RemoteDataSourceImpl$getTeamsWithRankLiveData$1", m100430f = "RemoteDataSourceImpl.kt", m100431l = {134}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65401 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $endDate;
        final /* synthetic */ String $leaderboardType;
        final /* synthetic */ C1630u0 $liveData;
        final /* synthetic */ String $period;
        final /* synthetic */ String $startDate;
        final /* synthetic */ int $userId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65401(int i13, String str, String str2, String str3, String str4, C1630u0 c1630u0, InterfaceC30057d<? super C65401> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$userId = i13;
            this.$leaderboardType = str;
            this.$startDate = str2;
            this.$endDate = str3;
            this.$period = str4;
            this.$liveData = c1630u0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return RemoteDataSourceImpl.this.new C65401(this.$userId, this.$leaderboardType, this.$startDate, this.$endDate, this.$period, this.$liveData, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C65401) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object teamsWithRankForUser;
            List records;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    arrayList = new ArrayList();
                    CommunityApi communityApi = RemoteDataSourceImpl.this.communityApi;
                    int i14 = this.$userId;
                    String str = this.$leaderboardType;
                    String str2 = this.$startDate;
                    String str3 = this.$endDate;
                    String str4 = this.$period;
                    this.L$0 = arrayList;
                    this.label = 1;
                    teamsWithRankForUser = communityApi.getTeamsWithRankForUser(i14, true, true, str, str2, str3, str4, 0, 50, this);
                    if (teamsWithRankForUser == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ArrayList arrayList2 = (ArrayList) this.L$0;
                    AbstractC34132o.m107864I(obj);
                    arrayList = arrayList2;
                    teamsWithRankForUser = obj;
                }
                RecordsDto recordsDto = (RecordsDto) ((C29218v0) teamsWithRankForUser).f118270b;
                if (recordsDto != null && (records = recordsDto.getRecords()) != null) {
                    int i15 = this.$userId;
                    Iterator it = records.iterator();
                    while (it.hasNext()) {
                        Team team = ((CommunityDto) it.next()).toTeam();
                        if (team != null) {
                            arrayList.add(new TeamsDto(new Integer(i15), team.getId(), team.getName(), team.getDescription(), team.getIconUrl(), team.getBannerUrl(), team.getAthletePrivacyId(), team.getPrivacyProfile(), team.getEnabledTabs(), team.getAdminId(), team.getTeamType(), team.getMemberCount(), team.getRank(), team.getChatChannel(), team.getChatEnabled(), team.getUnreadCount()));
                        }
                    }
                }
                this.$liveData.postValue(ApiResponse.INSTANCE.create(arrayList));
            } catch (Exception e5) {
                RemoteDataSourceImpl.this.logger.mo85222m(AbstractC11266d.m30461o("Unable to get teams data: ", e5.getMessage()), new AbstractC30556a.a[0]);
                this.$liveData.postValue(ApiResponse.INSTANCE.create((Throwable) e5));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.remote.RemoteDataSourceImpl$recordUserStrap$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.remote.RemoteDataSourceImpl$recordUserStrap$2", m100430f = "RemoteDataSourceImpl.kt", m100431l = {241}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lpg3/v0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65412 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ RecordUserStrapRequestBody $strap;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65412(RecordUserStrapRequestBody recordUserStrapRequestBody, InterfaceC30057d<? super C65412> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$strap = recordUserStrapRequestBody;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return RemoteDataSourceImpl.this.new C65412(this.$strap, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((C65412) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipV2Api membershipV2Api = RemoteDataSourceImpl.this.membershipV2Api;
            RecordUserStrapRequestBody recordUserStrapRequestBody = this.$strap;
            this.label = 1;
            Object objRecordUserStrap = membershipV2Api.recordUserStrap(recordUserStrapRequestBody, this);
            return objRecordUserStrap == enumC31071a ? enumC31071a : objRecordUserStrap;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.remote.RemoteDataSourceImpl$uploadConsoleEventPackets$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.remote.RemoteDataSourceImpl$uploadConsoleEventPackets$2", m100430f = "RemoteDataSourceImpl.kt", m100431l = {218}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lpg3/v0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C65422 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ AbstractC34846v0 $body;
        final /* synthetic */ Map<String, String> $headers;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65422(AbstractC34846v0 abstractC34846v0, Map<String, String> map, InterfaceC30057d<? super C65422> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$body = abstractC34846v0;
            this.$headers = map;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return RemoteDataSourceImpl.this.new C65422(this.$body, this.$headers, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((C65422) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ConsolePacketsApi consolePacketsApi = RemoteDataSourceImpl.this.consolePacketsApi;
            AbstractC34846v0 abstractC34846v0 = this.$body;
            Map<String, String> map = this.$headers;
            this.label = 1;
            Object objUploadConsoleEventPackets = consolePacketsApi.uploadConsoleEventPackets(abstractC34846v0, map, this);
            return objUploadConsoleEventPackets == enumC31071a ? enumC31071a : objUploadConsoleEventPackets;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.remote.RemoteDataSourceImpl$validateInviteCode$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.remote.RemoteDataSourceImpl", m100430f = "RemoteDataSourceImpl.kt", m100431l = {72}, m100432m = "validateInviteCode", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65431 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C65431(InterfaceC30057d<? super C65431> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteDataSourceImpl.this.validateInviteCode(null, this);
        }
    }

    public RemoteDataSourceImpl(CommunityApi communityApi, CommunityServiceApi communityServiceApi, ConsolePacketsApi consolePacketsApi, LegacyTeamServiceApi legacyTeamServiceApi, ProfileApiService profileApiService, MembershipApi membershipApi, MembershipV2Api membershipV2Api, InterfaceC18732d dispatcherFactory, InterfaceC34116n logger, InterfaceC31766c crashReporter, InterfaceC28172j0 idleIndicator) {
        AbstractC22676k.m65750j(communityApi, "communityApi");
        AbstractC22676k.m65750j(communityServiceApi, "communityServiceApi");
        AbstractC22676k.m65750j(consolePacketsApi, "consolePacketsApi");
        AbstractC22676k.m65750j(legacyTeamServiceApi, "legacyTeamServiceApi");
        AbstractC22676k.m65750j(profileApiService, "profileApiService");
        AbstractC22676k.m65750j(membershipApi, "membershipApi");
        AbstractC22676k.m65750j(membershipV2Api, "membershipV2Api");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(idleIndicator, "idleIndicator");
        this.communityApi = communityApi;
        this.communityServiceApi = communityServiceApi;
        this.consolePacketsApi = consolePacketsApi;
        this.legacyTeamServiceApi = legacyTeamServiceApi;
        this.profileApiService = profileApiService;
        this.membershipApi = membershipApi;
        this.membershipV2Api = membershipV2Api;
        this.dispatcherFactory = dispatcherFactory;
        this.logger = logger;
        this.crashReporter = crashReporter;
        this.idleIndicator = idleIndicator;
        this.job = AbstractC3006f0.m8710d();
    }

    @Override // com.whoop.data.remote.RemoteDataSource
    public Object getAllProgressLevels(int i13, InterfaceC30057d<? super RecordsDto<MemberLevelDto>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new C65332(i13, null), interfaceC30057d);
    }

    @Override // bc3.InterfaceC2994c0
    public InterfaceC30063j getCoroutineContext() {
        return this.dispatcherFactory.getDefault().plus(this.job);
    }

    @Override // com.whoop.data.remote.RemoteDataSource
    public AbstractC1615p0 getDefaultImagesLiveData() {
        C1630u0 c1630u0 = new C1630u0();
        AbstractC3006f0.m8732z(this, null, null, new C65341(c1630u0, null), 3);
        return c1630u0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.data.remote.RemoteDataSource
    public Object getFeatureTeams(InterfaceC30057d<? super List<FeatureTeam>> interfaceC30057d) throws Throwable {
        C65351 c65351;
        List list;
        if (interfaceC30057d instanceof C65351) {
            c65351 = (C65351) interfaceC30057d;
            int i13 = c65351.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65351.label = i13 - Integer.MIN_VALUE;
            } else {
                c65351 = new C65351(interfaceC30057d);
            }
        } else {
            c65351 = new C65351(interfaceC30057d);
        }
        Object obj = c65351.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65351.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                ArrayList arrayList = new ArrayList();
                InterfaceC30063j interfaceC30063jMo54465b = this.dispatcherFactory.mo54465b();
                RemoteDataSourceImpl$getFeatureTeams$data$1 remoteDataSourceImpl$getFeatureTeams$data$1 = new RemoteDataSourceImpl$getFeatureTeams$data$1(this, null);
                c65351.L$0 = arrayList;
                c65351.label = 1;
                Object objM8705K = AbstractC3006f0.m8705K(interfaceC30063jMo54465b, remoteDataSourceImpl$getFeatureTeams$data$1, c65351);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
                list = arrayList;
                obj = objM8705K;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) c65351.L$0;
                AbstractC34132o.m107864I(obj);
            }
            Iterator it = ((RecordsDto) obj).getRecords().iterator();
            while (it.hasNext()) {
                FeatureTeam featureTeam = ((FeatureCommunityDto) it.next()).toFeatureTeam();
                featureTeam.setShowBadge(true);
                list.add(featureTeam);
            }
            return list;
        } catch (IOException e5) {
            this.logger.mo85222m(AbstractC11266d.m30461o("Server communication error: ", e5.getMessage()), new AbstractC30556a.a[0]);
            return C25271y.f99162w;
        } catch (HttpException e13) {
            this.logger.mo85222m(AbstractC2875y.m8295h(e13.f128920w, "HTTP Exception: #"), new AbstractC30556a.a[0]);
            return C25271y.f99162w;
        } catch (Exception e14) {
            this.logger.mo85230v("Exception - printing stack trace:", e14, new AbstractC30556a.a[0]);
            return C25271y.f99162w;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.data.remote.RemoteDataSource
    public Object getMemberStories(InterfaceC30057d<? super RecordsDto<MemberStoryDto>> interfaceC30057d) throws Throwable {
        C65361 c65361;
        if (interfaceC30057d instanceof C65361) {
            c65361 = (C65361) interfaceC30057d;
            int i13 = c65361.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65361.label = i13 - Integer.MIN_VALUE;
            } else {
                c65361 = new C65361(interfaceC30057d);
            }
        } else {
            c65361 = new C65361(interfaceC30057d);
        }
        Object obj = c65361.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65361.label;
        try {
            if (i14 != 0) {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC30063j interfaceC30063jMo54465b = this.dispatcherFactory.mo54465b();
            C65372 c65372 = new C65372(null);
            c65361.label = 1;
            Object objM8705K = AbstractC3006f0.m8705K(interfaceC30063jMo54465b, c65372, c65361);
            return objM8705K == enumC31071a ? enumC31071a : objM8705K;
        } catch (Exception e5) {
            AbstractC36685b.m117759a(e5, "Unable to fetch member stories", this.logger, this.crashReporter);
            return null;
        }
    }

    @Override // com.whoop.data.remote.RemoteDataSource
    public Object getMembershipInfo(InterfaceC30057d<? super MembershipInfoDto> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new C65382(null), interfaceC30057d);
    }

    @Override // com.whoop.data.remote.RemoteDataSource
    public AbstractC1615p0 getTeamInviteLiveData(int userId) {
        C1630u0 c1630u0 = new C1630u0();
        this.idleIndicator.mo85208a();
        AbstractC3006f0.m8732z(this, null, null, new C65391(userId, c1630u0, null), 3);
        return c1630u0;
    }

    @Override // com.whoop.data.remote.RemoteDataSource
    public AbstractC1615p0 getTeamsWithRankLiveData(int userId, String leaderboardType, String startDate, String endDate, String period) {
        AbstractC22676k.m65750j(leaderboardType, "leaderboardType");
        AbstractC22676k.m65750j(startDate, "startDate");
        C1630u0 c1630u0 = new C1630u0();
        AbstractC3006f0.m8732z(this, null, null, new C65401(userId, leaderboardType, startDate, endDate, period, c1630u0, null), 3);
        return c1630u0;
    }

    @Override // com.whoop.data.remote.RemoteDataSource
    public C38280g<C29218v0<ClaimInviteResponse>> joinTeam(String inviteCode) {
        AbstractC22676k.m65750j(inviteCode, "inviteCode");
        AbstractC24088k abstractC24088kM52648m = AbstractC18274s.m52648m(this.legacyTeamServiceApi.claimInvite(new ClaimInviteDto(inviteCode)));
        AbstractC22676k.m65749i(abstractC24088kM52648m, "wrap(...)");
        return abstractC24088kM52648m;
    }

    @Override // com.whoop.data.remote.RemoteDataSource
    public Object recordUserStrap(RecordUserStrapRequestBody recordUserStrapRequestBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new C65412(recordUserStrapRequestBody, null), interfaceC30057d);
    }

    @Override // com.whoop.data.remote.RemoteDataSource
    public Object uploadConsoleEventPackets(AbstractC34846v0 abstractC34846v0, Map<String, String> map, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new C65422(abstractC34846v0, map, null), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.data.remote.RemoteDataSource
    public Object validateInviteCode(String str, InterfaceC30057d<? super Invitation> interfaceC30057d) throws Throwable {
        C65431 c65431;
        DomainException.InterfaceC9606b interfaceC9606b;
        if (interfaceC30057d instanceof C65431) {
            c65431 = (C65431) interfaceC30057d;
            int i13 = c65431.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65431.label = i13 - Integer.MIN_VALUE;
            } else {
                c65431 = new C65431(interfaceC30057d);
            }
        } else {
            c65431 = new C65431(interfaceC30057d);
        }
        Object objM8705K = c65431.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65431.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8705K);
                InterfaceC30063j interfaceC30063jMo54465b = this.dispatcherFactory.mo54465b();
                RemoteDataSourceImpl$validateInviteCode$response$1 remoteDataSourceImpl$validateInviteCode$response$1 = new RemoteDataSourceImpl$validateInviteCode$response$1(this, str, null);
                c65431.L$0 = str;
                c65431.label = 1;
                objM8705K = AbstractC3006f0.m8705K(interfaceC30063jMo54465b, remoteDataSourceImpl$validateInviteCode$response$1, c65431);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) c65431.L$0;
                AbstractC34132o.m107864I(objM8705K);
            }
            C29218v0 c29218v0 = (C29218v0) objM8705K;
            C34850x0 c34850x0 = c29218v0.f118269a;
            if (c34850x0.f146788Q) {
                InvitationDto invitationDto = (InvitationDto) c29218v0.f118270b;
                if (invitationDto != null) {
                    return invitationDto.toInvitation(str);
                }
                throw new DomainException(InviteCodeException.EnumC8700a.EMPTY_BODY, null, 2, null);
            }
            int i15 = c34850x0.f146792z;
            if (i15 != 403) {
                interfaceC9606b = i15 != 422 ? DomainException.EnumC9607c.NETWORK_ERROR : InviteCodeException.EnumC8700a.CODE_TYPE_MISMATCH;
            } else {
                interfaceC9606b = InviteCodeException.EnumC8700a.CODE_NOT_VALID;
            }
            throw new DomainException(interfaceC9606b, null, 2, null);
        } catch (HttpException unused) {
            throw new DomainException(DomainException.EnumC9607c.HTTP_ERROR, null, 2, null);
        } catch (Exception unused2) {
            throw new DomainException(DomainException.EnumC9607c.HTTP_ERROR, null, 2, null);
        }
    }
}
