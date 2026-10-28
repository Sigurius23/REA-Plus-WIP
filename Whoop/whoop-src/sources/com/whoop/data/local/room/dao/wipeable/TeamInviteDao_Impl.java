package com.whoop.data.local.room.dao.wipeable;

import am2.C1023i0;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1615p0;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import be1.C3169c;
import ck1.C4780c;
import com.whoop.data.local.room.dao.persistent.C6494e;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.data.local.room.entity.converter.CommunityDtoConverter;
import com.whoop.data.local.room.entity.converter.CommunityMemberDtoConverter;
import com.whoop.domain.model.teams.TeamInviteDto;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
public final class TeamInviteDao_Impl implements TeamInviteDao {
    private final AbstractC1848z0 __db;
    private final CommunityDtoConverter __communityDtoConverter = new CommunityDtoConverter();
    private final CommunityMemberDtoConverter __communityMemberDtoConverter = new CommunityMemberDtoConverter();
    private final AbstractC1802k __insertAdapterOfTeamInviteDto = new AbstractC1802k() { // from class: com.whoop.data.local.room.dao.wipeable.TeamInviteDao_Impl.1
        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR IGNORE INTO `table_team_invites` (`id`,`status`,`deleted`,`community_id`,`sender_id`,`recipient_id`,`community`,`sender`,`community_invite_code`,`showBadge`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.AbstractC1802k
        public void bind(InterfaceC33689c interfaceC33689c, TeamInviteDto teamInviteDto) {
            interfaceC33689c.mo5356p(1, teamInviteDto.getId());
            if (teamInviteDto.getStatus() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, teamInviteDto.getStatus());
            }
            interfaceC33689c.mo5356p(3, teamInviteDto.getDeleted() ? 1L : 0L);
            interfaceC33689c.mo5356p(4, teamInviteDto.getCommunityId());
            interfaceC33689c.mo5356p(5, teamInviteDto.getSenderId());
            interfaceC33689c.mo5356p(6, teamInviteDto.getRecipientId());
            String strCommunityDtoToString = TeamInviteDao_Impl.this.__communityDtoConverter.communityDtoToString(teamInviteDto.getCommunity());
            if (strCommunityDtoToString == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5354L(7, strCommunityDtoToString);
            }
            String strCommunityMemberDtoToString = TeamInviteDao_Impl.this.__communityMemberDtoConverter.communityMemberDtoToString(teamInviteDto.getSender());
            if (strCommunityMemberDtoToString == null) {
                interfaceC33689c.mo5359u(8);
            } else {
                interfaceC33689c.mo5354L(8, strCommunityMemberDtoToString);
            }
            if (teamInviteDto.getInviteCode() == null) {
                interfaceC33689c.mo5359u(9);
            } else {
                interfaceC33689c.mo5354L(9, teamInviteDto.getInviteCode());
            }
            interfaceC33689c.mo5356p(10, teamInviteDto.getShowBadge() ? 1L : 0L);
        }
    };

    public TeamInviteDao_Impl(AbstractC1848z0 abstractC1848z0) {
        this.__db = abstractC1848z0;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C23454a0 lambda$addInvites$1(int i13, List list, InterfaceC33687a interfaceC33687a) {
        super.addInvites(i13, list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getLiveTeamInviteData$3(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_team_invites");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.CATEGORY_STATUS);
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deleted");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "community_id");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sender_id");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "recipient_id");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "community");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sender");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "community_invite_code");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showBadge");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                int i13 = (int) interfaceC33689cMo68212g1.getLong(iM60658N);
                String strMo5353J0 = interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                boolean z4 = true;
                if (((int) interfaceC33689cMo68212g1.getLong(iM60658N3)) == 0) {
                    z4 = false;
                }
                int i14 = iM60658N2;
                int i15 = iM60658N3;
                int i16 = iM60658N;
                arrayList.add(new TeamInviteDto(i13, strMo5353J0, z4, (int) interfaceC33689cMo68212g1.getLong(iM60658N4), (int) interfaceC33689cMo68212g1.getLong(iM60658N5), (int) interfaceC33689cMo68212g1.getLong(iM60658N6), this.__communityDtoConverter.fromCommunityDto(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7)), this.__communityMemberDtoConverter.fromCommunityMemberDto(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8)), interfaceC33689cMo68212g1.isNull(iM60658N9) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N9), ((int) interfaceC33689cMo68212g1.getLong(iM60658N10)) != 0));
                iM60658N = i16;
                iM60658N2 = i14;
                iM60658N3 = i15;
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C23454a0 lambda$removeAllInvites$6(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_team_invites");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C23454a0 lambda$removeInvite$5(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_team_invites WHERE id = (?)");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$saveTeamInvite$0(TeamInviteDto teamInviteDto, InterfaceC33687a interfaceC33687a) {
        this.__insertAdapterOfTeamInviteDto.insert(interfaceC33687a, teamInviteDto);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$updateAllBadgeStatus$2(boolean z4, List list, InterfaceC30057d interfaceC30057d) {
        return super.updateAllBadgeStatus(z4, list, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C23454a0 lambda$updateBadgeStatus$4(boolean z4, int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("UPDATE table_team_invites SET showBadge = (?) WHERE id = (?)");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, z4 ? 1L : 0L);
            interfaceC33689cMo68212g1.mo5356p(2, i13);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    @Override // com.whoop.data.local.room.dao.wipeable.TeamInviteDao
    public void addInvites(int i13, List<TeamInviteDto> list) {
        AbstractC15751g.m44432L(this.__db, false, true, new C6517d(this, i13, list, 0));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.TeamInviteDao
    public AbstractC1615p0 getLiveTeamInviteData() {
        return this.__db.getInvalidationTracker().m5455b(new String[]{"table_team_invites"}, false, new C4780c(this, 4));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.TeamInviteDao
    public Object removeAllInvites(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C6498i(9), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.TeamInviteDao
    public Object removeInvite(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C6494e(i13, 2), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.TeamInviteDao
    public void saveTeamInvite(TeamInviteDto teamInviteDto) {
        teamInviteDto.getClass();
        AbstractC15751g.m44432L(this.__db, false, true, new C3169c(25, this, teamInviteDto));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.TeamInviteDao
    public Object updateAllBadgeStatus(boolean z4, List<TeamInviteDto> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44433M(this.__db, new C1023i0(this, z4, list, 4), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.TeamInviteDao
    public Object updateBadgeStatus(boolean z4, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C6514a(z4, i13, 2), interfaceC30057d);
    }
}
