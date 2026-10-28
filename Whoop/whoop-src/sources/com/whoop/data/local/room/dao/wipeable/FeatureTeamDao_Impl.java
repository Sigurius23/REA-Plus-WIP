package com.whoop.data.local.room.dao.wipeable;

import am2.C1023i0;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import be1.C3169c;
import com.whoop.data.local.room.dao.persistent.C6498i;
import com.whoop.data.local.room.entity.converter.TeamTypeConverter;
import com.whoop.domain.model.teams.FeatureTeam;
import com.whoop.profile.domain.ProfileApiKt;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureTeamDao_Impl implements FeatureTeamDao {
    private final AbstractC1848z0 __db;
    private final TeamTypeConverter __teamTypeConverter = new TeamTypeConverter();
    private final AbstractC1802k __insertAdapterOfFeatureTeam = new AbstractC1802k() { // from class: com.whoop.data.local.room.dao.wipeable.FeatureTeamDao_Impl.1
        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_feature_teams` (`name`,`description`,`iconUrl`,`bannerUrl`,`athletePrivacyId`,`memberCount`,`inviteCode`,`teamType`,`communityId`,`showBadge`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,nullif(?, 0))";
        }

        @Override // androidx.room.AbstractC1802k
        public void bind(InterfaceC33689c interfaceC33689c, FeatureTeam featureTeam) {
            if (featureTeam.getName() == null) {
                interfaceC33689c.mo5359u(1);
            } else {
                interfaceC33689c.mo5354L(1, featureTeam.getName());
            }
            if (featureTeam.getDescription() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, featureTeam.getDescription());
            }
            if (featureTeam.getIconUrl() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, featureTeam.getIconUrl());
            }
            if (featureTeam.getBannerUrl() == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, featureTeam.getBannerUrl());
            }
            interfaceC33689c.mo5356p(5, featureTeam.getAthletePrivacyId());
            interfaceC33689c.mo5356p(6, featureTeam.getMemberCount());
            if (featureTeam.getInviteCode() == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5354L(7, featureTeam.getInviteCode());
            }
            String strFromTeamType = FeatureTeamDao_Impl.this.__teamTypeConverter.fromTeamType(featureTeam.getTeamType());
            if (strFromTeamType == null) {
                interfaceC33689c.mo5359u(8);
            } else {
                interfaceC33689c.mo5354L(8, strFromTeamType);
            }
            interfaceC33689c.mo5356p(9, featureTeam.getCommunityId());
            interfaceC33689c.mo5356p(10, featureTeam.getShowBadge() ? 1L : 0L);
            interfaceC33689c.mo5356p(11, featureTeam.getId());
        }
    };

    public FeatureTeamDao_Impl(AbstractC1848z0 abstractC1848z0) {
        this.__db = abstractC1848z0;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$addFeatureTeams$2(List list, InterfaceC30057d interfaceC30057d) {
        return super.addFeatureTeams(list, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C23454a0 lambda$deleteAllFeatureTeams$7(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_feature_teams");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public /* synthetic */ FeatureTeam lambda$getFeatureTeamByCommunityId$5(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * from table_feature_teams WHERE communityId= (?)");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "description");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "iconUrl");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "bannerUrl");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "athletePrivacyId");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "memberCount");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "inviteCode");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "teamType");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, ProfileApiKt.COMMUNITY_ID_PARAM);
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showBadge");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            FeatureTeam featureTeam = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                try {
                    FeatureTeam featureTeam2 = new FeatureTeam(interfaceC33689cMo68212g1.isNull(iM60658N) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N), interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2), interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3), interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4), (int) interfaceC33689cMo68212g1.getLong(iM60658N5), (int) interfaceC33689cMo68212g1.getLong(iM60658N6), interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7), this.__teamTypeConverter.toTeamType(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8)), (int) interfaceC33689cMo68212g1.getLong(iM60658N9), ((int) interfaceC33689cMo68212g1.getLong(iM60658N10)) != 0);
                    featureTeam2.setId(interfaceC33689cMo68212g1.getLong(iM60658N11));
                    featureTeam = featureTeam2;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC33689cMo68212g1.close();
                    throw th;
                }
            }
            interfaceC33689cMo68212g1.close();
            return featureTeam;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getFeatureTeamData$3(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_feature_teams");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "description");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "iconUrl");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "bannerUrl");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "athletePrivacyId");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "memberCount");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "inviteCode");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "teamType");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, ProfileApiKt.COMMUNITY_ID_PARAM);
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showBadge");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.isNull(iM60658N) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                int i13 = iM60658N;
                int i14 = iM60658N2;
                int i15 = iM60658N3;
                FeatureTeam featureTeam = new FeatureTeam(strMo5353J0, interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2), interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3), interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4), (int) interfaceC33689cMo68212g1.getLong(iM60658N5), (int) interfaceC33689cMo68212g1.getLong(iM60658N6), interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7), this.__teamTypeConverter.toTeamType(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8)), (int) interfaceC33689cMo68212g1.getLong(iM60658N9), ((int) interfaceC33689cMo68212g1.getLong(iM60658N10)) != 0);
                featureTeam.setId(interfaceC33689cMo68212g1.getLong(iM60658N11));
                arrayList.add(featureTeam);
                iM60658N2 = i14;
                iM60658N3 = i15;
                iM60658N = i13;
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$getFlowFeatureTeamData$4(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_feature_teams");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "description");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "iconUrl");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "bannerUrl");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "athletePrivacyId");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "memberCount");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "inviteCode");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "teamType");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, ProfileApiKt.COMMUNITY_ID_PARAM);
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showBadge");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.isNull(iM60658N) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                int i13 = iM60658N;
                int i14 = iM60658N2;
                int i15 = iM60658N3;
                FeatureTeam featureTeam = new FeatureTeam(strMo5353J0, interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2), interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3), interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4), (int) interfaceC33689cMo68212g1.getLong(iM60658N5), (int) interfaceC33689cMo68212g1.getLong(iM60658N6), interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7), this.__teamTypeConverter.toTeamType(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8)), (int) interfaceC33689cMo68212g1.getLong(iM60658N9), ((int) interfaceC33689cMo68212g1.getLong(iM60658N10)) != 0);
                featureTeam.setId(interfaceC33689cMo68212g1.getLong(iM60658N11));
                arrayList.add(featureTeam);
                iM60658N2 = i14;
                iM60658N3 = i15;
                iM60658N = i13;
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C23454a0 lambda$saveFeatureTeam$0(FeatureTeam featureTeam, InterfaceC33687a interfaceC33687a) {
        this.__insertAdapterOfFeatureTeam.insert(interfaceC33687a, featureTeam);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$updateAllBadgeStatus$1(boolean z4, List list, InterfaceC30057d interfaceC30057d) {
        return super.updateAllBadgeStatus(z4, list, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C23454a0 lambda$updateBannerStatus$6(boolean z4, int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("UPDATE table_feature_teams SET showBadge = (?) WHERE communityId = (?)");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, z4 ? 1L : 0L);
            interfaceC33689cMo68212g1.mo5356p(2, i13);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    @Override // com.whoop.data.local.room.dao.wipeable.FeatureTeamDao
    public Object addFeatureTeams(List<FeatureTeam> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44433M(this.__db, new C3169c(19, this, list), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.FeatureTeamDao
    public Object deleteAllFeatureTeams(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C6498i(1), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.FeatureTeamDao
    public FeatureTeam getFeatureTeamByCommunityId(int i13) {
        return (FeatureTeam) AbstractC15751g.m44432L(this.__db, true, false, new C6516c(this, i13, 0));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.FeatureTeamDao
    public Object getFeatureTeamData(InterfaceC30057d<? super List<FeatureTeam>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C6515b(this, 0), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.FeatureTeamDao
    public InterfaceC13058l getFlowFeatureTeamData() {
        return AbstractC12350b.m34591l(this.__db, new String[]{"table_feature_teams"}, new C6515b(this, 1));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.FeatureTeamDao
    public Object saveFeatureTeam(FeatureTeam featureTeam, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        featureTeam.getClass();
        return AbstractC15751g.m44434N(this.__db, false, true, new C3169c(18, this, featureTeam), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.FeatureTeamDao
    public Object updateAllBadgeStatus(boolean z4, List<FeatureTeam> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44433M(this.__db, new C1023i0(this, z4, list, 2), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.FeatureTeamDao
    public Object updateBannerStatus(boolean z4, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C6514a(z4, i13, 0), interfaceC30057d);
    }
}
