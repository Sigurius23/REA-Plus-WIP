package com.whoop.data.local.room.dao.wipeable;

import androidx.lifecycle.AbstractC1615p0;
import com.whoop.data.local.room.entity.TeamsDto;
import com.whoop.service.network.model.DefaultImages;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\tH'¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0017H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;", "", "Lcom/whoop/data/local/room/entity/TeamsDto;", "teamsDto", "Ll83/a0;", "saveTeam", "(Lcom/whoop/data/local/room/entity/TeamsDto;)V", "", "userId", "Landroidx/lifecycle/p0;", "", "getLiveTeamData", "(I)Landroidx/lifecycle/p0;", "teams", "updateTeams", "(ILjava/util/List;)V", "teamId", "", "teamType", "removeTeam", "(ILjava/lang/String;)V", "removeAllTeams", "(I)V", "Lcom/whoop/service/network/model/DefaultImages;", "getDefaultImagesLiveData", "()Landroidx/lifecycle/p0;", "defaultImages", "saveDefaultImages", "(Lcom/whoop/service/network/model/DefaultImages;)V", "getTeamCount", "(ILq83/d;)Ljava/lang/Object;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface TeamsDao {

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void updateTeams(TeamsDao teamsDao, int i13, List<TeamsDto> teams) {
            AbstractC22676k.m65750j(teams, "teams");
            TeamsDao.super.updateTeams(i13, teams);
        }
    }

    AbstractC1615p0 getDefaultImagesLiveData();

    AbstractC1615p0 getLiveTeamData(int userId);

    Object getTeamCount(int i13, InterfaceC30057d<? super Integer> interfaceC30057d);

    void removeAllTeams(int userId);

    void removeTeam(int teamId, String teamType);

    void saveDefaultImages(DefaultImages defaultImages);

    void saveTeam(TeamsDto teamsDto);

    default void updateTeams(int userId, List<TeamsDto> teams) {
        AbstractC22676k.m65750j(teams, "teams");
        removeAllTeams(userId);
        for (TeamsDto teamsDto : teams) {
            teamsDto.setUserId(Integer.valueOf(userId));
            saveTeam(teamsDto);
        }
    }
}
