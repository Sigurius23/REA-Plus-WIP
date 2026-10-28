package com.whoop.data.local.room.dao.wipeable;

import androidx.lifecycle.AbstractC1615p0;
import com.whoop.domain.model.teams.TeamInviteDto;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0097@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bH§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/data/local/room/dao/wipeable/TeamInviteDao;", "", "Landroidx/lifecycle/p0;", "", "Lcom/whoop/domain/model/teams/TeamInviteDto;", "getLiveTeamInviteData", "()Landroidx/lifecycle/p0;", "teamInviteDto", "Ll83/a0;", "saveTeamInvite", "(Lcom/whoop/domain/model/teams/TeamInviteDto;)V", "", "userId", "invites", "addInvites", "(ILjava/util/List;)V", "", "showBadge", "teamId", "updateBadgeStatus", "(ZILq83/d;)Ljava/lang/Object;", "teams", "updateAllBadgeStatus", "(ZLjava/util/List;Lq83/d;)Ljava/lang/Object;", "inviteId", "removeInvite", "(ILq83/d;)Ljava/lang/Object;", "removeAllInvites", "(Lq83/d;)Ljava/lang/Object;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface TeamInviteDao {

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void addInvites(TeamInviteDao teamInviteDao, int i13, List<TeamInviteDto> invites) {
            AbstractC22676k.m65750j(invites, "invites");
            TeamInviteDao.super.addInvites(i13, invites);
        }

        @Deprecated
        public static Object updateAllBadgeStatus(TeamInviteDao teamInviteDao, boolean z4, List<TeamInviteDto> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return TeamInviteDao.super.updateAllBadgeStatus(z4, list, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.local.room.dao.wipeable.TeamInviteDao$updateAllBadgeStatus$1 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.local.room.dao.wipeable.TeamInviteDao", m100430f = "TeamInviteDao.kt", m100431l = {33}, m100432m = "updateAllBadgeStatus$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65101 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C65101(InterfaceC30057d<? super C65101> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TeamInviteDao.updateAllBadgeStatus$suspendImpl(TeamInviteDao.this, false, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static Object updateAllBadgeStatus$suspendImpl(TeamInviteDao teamInviteDao, boolean z4, List<TeamInviteDto> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C65101 c65101;
        Iterator it;
        boolean z13;
        int i13;
        if (interfaceC30057d instanceof C65101) {
            c65101 = (C65101) interfaceC30057d;
            int i14 = c65101.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c65101.label = i14 - Integer.MIN_VALUE;
            } else {
                c65101 = teamInviteDao.new C65101(interfaceC30057d);
            }
        } else {
            c65101 = teamInviteDao.new C65101(interfaceC30057d);
        }
        Object obj = c65101.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c65101.label;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            it = list.iterator();
            z13 = z4;
            i13 = 0;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i16 = c65101.I$0;
            boolean z14 = c65101.Z$0;
            Iterator it3 = (Iterator) c65101.L$3;
            TeamInviteDao teamInviteDao2 = (TeamInviteDao) c65101.L$0;
            AbstractC34132o.m107864I(obj);
            it = it3;
            z13 = z14;
            i13 = i16;
            teamInviteDao = teamInviteDao2;
        }
        while (it.hasNext()) {
            int id4 = ((TeamInviteDto) it.next()).getId();
            c65101.L$0 = teamInviteDao;
            c65101.L$1 = null;
            c65101.L$2 = null;
            c65101.L$3 = it;
            c65101.L$4 = null;
            c65101.L$5 = null;
            c65101.Z$0 = z13;
            c65101.I$0 = i13;
            c65101.I$1 = 0;
            c65101.label = 1;
            if (teamInviteDao.updateBadgeStatus(z13, id4, c65101) == enumC31071a) {
                return enumC31071a;
            }
        }
        return C23454a0.f92919a;
    }

    default void addInvites(int userId, List<TeamInviteDto> invites) {
        AbstractC22676k.m65750j(invites, "invites");
        Iterator<T> it = invites.iterator();
        while (it.hasNext()) {
            saveTeamInvite((TeamInviteDto) it.next());
        }
    }

    AbstractC1615p0 getLiveTeamInviteData();

    Object removeAllInvites(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object removeInvite(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    void saveTeamInvite(TeamInviteDto teamInviteDto);

    default Object updateAllBadgeStatus(boolean z4, List<TeamInviteDto> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return updateAllBadgeStatus$suspendImpl(this, z4, list, interfaceC30057d);
    }

    Object updateBadgeStatus(boolean z4, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
