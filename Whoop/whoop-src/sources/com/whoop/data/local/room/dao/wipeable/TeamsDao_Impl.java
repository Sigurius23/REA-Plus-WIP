package com.whoop.data.local.room.dao.wipeable;

import androidx.lifecycle.AbstractC1615p0;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import be1.C3169c;
import ck1.C4780c;
import com.whoop.data.local.room.dao.persistent.C6494e;
import com.whoop.data.local.room.entity.TeamsDto;
import com.whoop.data.local.room.entity.converter.AvatarUrlConverter;
import com.whoop.data.local.room.entity.converter.BannerUrlConverter;
import com.whoop.data.local.room.entity.converter.EnableTabConverter;
import com.whoop.data.local.room.entity.converter.PrivacyTypeConverter;
import com.whoop.data.local.room.entity.converter.TeamTypeConverter;
import com.whoop.domain.model.teams.ChatChannel;
import com.whoop.domain.model.teams.TeamPrivacyProfile;
import com.whoop.domain.model.teams.TeamType;
import com.whoop.p069ui.ScoreContext;
import com.whoop.service.network.model.DefaultImages;
import com.whoop.service.network.model.UserState;
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
public final class TeamsDao_Impl implements TeamsDao {
    private final AbstractC1848z0 __db;
    private final EnableTabConverter __enableTabConverter = new EnableTabConverter();
    private final TeamTypeConverter __teamTypeConverter = new TeamTypeConverter();
    private final PrivacyTypeConverter __privacyTypeConverter = new PrivacyTypeConverter();
    private final BannerUrlConverter __bannerUrlConverter = new BannerUrlConverter();
    private final AvatarUrlConverter __avatarUrlConverter = new AvatarUrlConverter();
    private final AbstractC1802k __insertAdapterOfTeamsDto = new AbstractC1802k() { // from class: com.whoop.data.local.room.dao.wipeable.TeamsDao_Impl.1
        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_teams` (`user_id`,`id`,`name`,`description`,`icon_url`,`banner_url`,`athlete_privacy_id`,`scores`,`admin_id`,`team_type`,`member_count`,`rank`,`chat_enable`,`unread_count`,`team_privacy_profile_id`,`team_privacy_profile_name`,`basic`,`stats`,`comps`,`overview`,`intensity`,`recovery`,`sleep`,`cid`,`channel_id`,`channel_type`,`channel_name`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.AbstractC1802k
        public void bind(InterfaceC33689c interfaceC33689c, TeamsDto teamsDto) {
            if (teamsDto.getUserId() == null) {
                interfaceC33689c.mo5359u(1);
            } else {
                interfaceC33689c.mo5356p(1, teamsDto.getUserId().intValue());
            }
            interfaceC33689c.mo5356p(2, teamsDto.getId());
            if (teamsDto.getName() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, teamsDto.getName());
            }
            if (teamsDto.getDescription() == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, teamsDto.getDescription());
            }
            if (teamsDto.getIconUrl() == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, teamsDto.getIconUrl());
            }
            if (teamsDto.getBannerUrl() == null) {
                interfaceC33689c.mo5359u(6);
            } else {
                interfaceC33689c.mo5354L(6, teamsDto.getBannerUrl());
            }
            interfaceC33689c.mo5356p(7, teamsDto.getAthletePrivacyId());
            String strLanguagesToStoredString = TeamsDao_Impl.this.__enableTabConverter.languagesToStoredString(teamsDto.getEnabledTabs());
            if (strLanguagesToStoredString == null) {
                interfaceC33689c.mo5359u(8);
            } else {
                interfaceC33689c.mo5354L(8, strLanguagesToStoredString);
            }
            interfaceC33689c.mo5356p(9, teamsDto.getAdminId());
            String strFromTeamType = TeamsDao_Impl.this.__teamTypeConverter.fromTeamType(teamsDto.getTeamType());
            if (strFromTeamType == null) {
                interfaceC33689c.mo5359u(10);
            } else {
                interfaceC33689c.mo5354L(10, strFromTeamType);
            }
            interfaceC33689c.mo5356p(11, teamsDto.getMemberCount());
            interfaceC33689c.mo5356p(12, teamsDto.getRank());
            interfaceC33689c.mo5356p(13, teamsDto.getChatEnabled() ? 1L : 0L);
            interfaceC33689c.mo5356p(14, teamsDto.getUnreadCount());
            TeamPrivacyProfile privacyProfile = teamsDto.getPrivacyProfile();
            if (privacyProfile.getId() == null) {
                interfaceC33689c.mo5359u(15);
            } else {
                interfaceC33689c.mo5356p(15, privacyProfile.getId().intValue());
            }
            if (privacyProfile.getName() == null) {
                interfaceC33689c.mo5359u(16);
            } else {
                interfaceC33689c.mo5354L(16, privacyProfile.getName());
            }
            Integer numValueOf = privacyProfile.getBasic() == null ? null : Integer.valueOf(privacyProfile.getBasic().booleanValue() ? 1 : 0);
            if (numValueOf == null) {
                interfaceC33689c.mo5359u(17);
            } else {
                interfaceC33689c.mo5356p(17, numValueOf.intValue());
            }
            interfaceC33689c.mo5356p(18, TeamsDao_Impl.this.__privacyTypeConverter.fromPrivacyType(privacyProfile.getStats()));
            interfaceC33689c.mo5356p(19, TeamsDao_Impl.this.__privacyTypeConverter.fromPrivacyType(privacyProfile.getComps()));
            interfaceC33689c.mo5356p(20, TeamsDao_Impl.this.__privacyTypeConverter.fromPrivacyType(privacyProfile.getOverview()));
            interfaceC33689c.mo5356p(21, TeamsDao_Impl.this.__privacyTypeConverter.fromPrivacyType(privacyProfile.getIntensity()));
            interfaceC33689c.mo5356p(22, TeamsDao_Impl.this.__privacyTypeConverter.fromPrivacyType(privacyProfile.getRecovery()));
            interfaceC33689c.mo5356p(23, TeamsDao_Impl.this.__privacyTypeConverter.fromPrivacyType(privacyProfile.getSleep()));
            ChatChannel chatChannel = teamsDto.getChatChannel();
            if (chatChannel == null) {
                interfaceC33689c.mo5359u(24);
                interfaceC33689c.mo5359u(25);
                interfaceC33689c.mo5359u(26);
                interfaceC33689c.mo5359u(27);
                return;
            }
            if (chatChannel.getCid() == null) {
                interfaceC33689c.mo5359u(24);
            } else {
                interfaceC33689c.mo5354L(24, chatChannel.getCid());
            }
            if (chatChannel.getId() == null) {
                interfaceC33689c.mo5359u(25);
            } else {
                interfaceC33689c.mo5354L(25, chatChannel.getId());
            }
            if (chatChannel.getType() == null) {
                interfaceC33689c.mo5359u(26);
            } else {
                interfaceC33689c.mo5354L(26, chatChannel.getType());
            }
            if (chatChannel.getName() == null) {
                interfaceC33689c.mo5359u(27);
            } else {
                interfaceC33689c.mo5354L(27, chatChannel.getName());
            }
        }
    };
    private final AbstractC1802k __insertAdapterOfDefaultImages = new AbstractC1802k() { // from class: com.whoop.data.local.room.dao.wipeable.TeamsDao_Impl.2
        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_default_images` (`id`,`banners`,`avatars`) VALUES (?,?,?)";
        }

        @Override // androidx.room.AbstractC1802k
        public void bind(InterfaceC33689c interfaceC33689c, DefaultImages defaultImages) {
            interfaceC33689c.mo5356p(1, defaultImages.getId());
            String strListToString = TeamsDao_Impl.this.__bannerUrlConverter.listToString(defaultImages.getBanners());
            if (strListToString == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, strListToString);
            }
            String strListToString2 = TeamsDao_Impl.this.__avatarUrlConverter.listToString(defaultImages.getAvatars());
            if (strListToString2 == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, strListToString2);
            }
        }
    };

    public TeamsDao_Impl(AbstractC1848z0 abstractC1848z0) {
        this.__db = abstractC1848z0;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
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
    public /* synthetic */ DefaultImages lambda$getDefaultImagesLiveData$4(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_default_images");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "banners");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "avatars");
            DefaultImages defaultImages = null;
            String strMo5353J0 = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                int i13 = (int) interfaceC33689cMo68212g1.getLong(iM60658N);
                List<String> listStringToList = this.__bannerUrlConverter.stringToList(interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2));
                if (!interfaceC33689cMo68212g1.isNull(iM60658N3)) {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                }
                defaultImages = new DefaultImages(i13, listStringToList, this.__avatarUrlConverter.stringToList(strMo5353J0));
            }
            return defaultImages;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:82:0x02af  */
    /* JADX WARN: Code duplicated, block: B:83:0x02b4 A[Catch: all -> 0x0295, TryCatch #1 {all -> 0x0295, blocks: (B:3:0x000e, B:4:0x00d4, B:6:0x00da, B:10:0x00f8, B:14:0x010c, B:18:0x011b, B:22:0x012a, B:26:0x013f, B:31:0x0154, B:36:0x016f, B:41:0x019c, B:46:0x01c2, B:51:0x01d4, B:63:0x0208, B:65:0x026c, B:67:0x0274, B:69:0x027c, B:80:0x02a9, B:84:0x02bc, B:88:0x02cf, B:92:0x02e2, B:95:0x02ef, B:91:0x02da, B:87:0x02c7, B:83:0x02b4, B:58:0x01f8, B:62:0x0201, B:54:0x01e1, B:50:0x01cd, B:45:0x01b2, B:35:0x016a, B:30:0x014f, B:25:0x0136, B:21:0x0124, B:17:0x0115, B:13:0x0106, B:9:0x00e9), top: B:108:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:86:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:87:0x02c7 A[Catch: all -> 0x0295, TryCatch #1 {all -> 0x0295, blocks: (B:3:0x000e, B:4:0x00d4, B:6:0x00da, B:10:0x00f8, B:14:0x010c, B:18:0x011b, B:22:0x012a, B:26:0x013f, B:31:0x0154, B:36:0x016f, B:41:0x019c, B:46:0x01c2, B:51:0x01d4, B:63:0x0208, B:65:0x026c, B:67:0x0274, B:69:0x027c, B:80:0x02a9, B:84:0x02bc, B:88:0x02cf, B:92:0x02e2, B:95:0x02ef, B:91:0x02da, B:87:0x02c7, B:83:0x02b4, B:58:0x01f8, B:62:0x0201, B:54:0x01e1, B:50:0x01cd, B:45:0x01b2, B:35:0x016a, B:30:0x014f, B:25:0x0136, B:21:0x0124, B:17:0x0115, B:13:0x0106, B:9:0x00e9), top: B:108:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:90:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:91:0x02da A[Catch: all -> 0x0295, TryCatch #1 {all -> 0x0295, blocks: (B:3:0x000e, B:4:0x00d4, B:6:0x00da, B:10:0x00f8, B:14:0x010c, B:18:0x011b, B:22:0x012a, B:26:0x013f, B:31:0x0154, B:36:0x016f, B:41:0x019c, B:46:0x01c2, B:51:0x01d4, B:63:0x0208, B:65:0x026c, B:67:0x0274, B:69:0x027c, B:80:0x02a9, B:84:0x02bc, B:88:0x02cf, B:92:0x02e2, B:95:0x02ef, B:91:0x02da, B:87:0x02c7, B:83:0x02b4, B:58:0x01f8, B:62:0x0201, B:54:0x01e1, B:50:0x01cd, B:45:0x01b2, B:35:0x016a, B:30:0x014f, B:25:0x0136, B:21:0x0124, B:17:0x0115, B:13:0x0106, B:9:0x00e9), top: B:108:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02ef A[Catch: all -> 0x0295, TRY_LEAVE, TryCatch #1 {all -> 0x0295, blocks: (B:3:0x000e, B:4:0x00d4, B:6:0x00da, B:10:0x00f8, B:14:0x010c, B:18:0x011b, B:22:0x012a, B:26:0x013f, B:31:0x0154, B:36:0x016f, B:41:0x019c, B:46:0x01c2, B:51:0x01d4, B:63:0x0208, B:65:0x026c, B:67:0x0274, B:69:0x027c, B:80:0x02a9, B:84:0x02bc, B:88:0x02cf, B:92:0x02e2, B:95:0x02ef, B:91:0x02da, B:87:0x02c7, B:83:0x02b4, B:58:0x01f8, B:62:0x0201, B:54:0x01e1, B:50:0x01cd, B:45:0x01b2, B:35:0x016a, B:30:0x014f, B:25:0x0136, B:21:0x0124, B:17:0x0115, B:13:0x0106, B:9:0x00e9), top: B:108:0x000e }] */
    public /* synthetic */ List lambda$getLiveTeamData$3(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689c;
        Boolean boolValueOf;
        int i14;
        int i15;
        int i16;
        ChatChannel chatChannel;
        int i17;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * from table_teams WHERE user_id == (?)");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "user_id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "description");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "icon_url");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "banner_url");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "athlete_privacy_id");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "scores");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "admin_id");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "team_type");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "member_count");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "rank");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "chat_enable");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "unread_count");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "team_privacy_profile_id");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "team_privacy_profile_name");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "basic");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "stats");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "comps");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "overview");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "intensity");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "recovery");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, UserState.States.SLEEP);
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cid");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_id");
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_type");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_name");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                Integer numValueOf = interfaceC33689cMo68212g1.isNull(iM60658N) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N));
                int i18 = (int) interfaceC33689cMo68212g1.getLong(iM60658N2);
                String strMo5353J3 = interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J4 = interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J5 = interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J6 = interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                int i19 = (int) interfaceC33689cMo68212g1.getLong(iM60658N7);
                List<ScoreContext> listStoredStringToEnum = this.__enableTabConverter.storedStringToEnum(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8));
                int i24 = (int) interfaceC33689cMo68212g1.getLong(iM60658N9);
                TeamType teamType = this.__teamTypeConverter.toTeamType(interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10));
                int i25 = (int) interfaceC33689cMo68212g1.getLong(iM60658N11);
                int i26 = iM60658N4;
                int i27 = iM60658N12;
                int i28 = iM60658N3;
                int i29 = (int) interfaceC33689cMo68212g1.getLong(i27);
                int i34 = iM60658N13;
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(i34)) != 0;
                int i35 = iM60658N14;
                int i36 = (int) interfaceC33689cMo68212g1.getLong(i35);
                int i37 = iM60658N15;
                Integer numValueOf2 = interfaceC33689cMo68212g1.isNull(i37) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i37));
                int i38 = iM60658N16;
                String strMo5353J7 = interfaceC33689cMo68212g1.isNull(i38) ? null : interfaceC33689cMo68212g1.mo5353J0(i38);
                int i39 = iM60658N17;
                Integer numValueOf3 = interfaceC33689cMo68212g1.isNull(i39) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i39));
                if (numValueOf3 == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf3.intValue() != 0);
                }
                int i44 = iM60658N18;
                int i45 = iM60658N19;
                int i46 = iM60658N20;
                iM60658N20 = i46;
                int i47 = iM60658N21;
                iM60658N21 = i47;
                int i48 = iM60658N22;
                int i49 = iM60658N23;
                TeamPrivacyProfile teamPrivacyProfile = new TeamPrivacyProfile(numValueOf2, strMo5353J7, boolValueOf, this.__privacyTypeConverter.toPrivacyType((int) interfaceC33689cMo68212g1.getLong(i44)), this.__privacyTypeConverter.toPrivacyType((int) interfaceC33689cMo68212g1.getLong(i45)), this.__privacyTypeConverter.toPrivacyType((int) interfaceC33689cMo68212g1.getLong(i46)), this.__privacyTypeConverter.toPrivacyType((int) interfaceC33689cMo68212g1.getLong(i47)), this.__privacyTypeConverter.toPrivacyType((int) interfaceC33689cMo68212g1.getLong(i48)), this.__privacyTypeConverter.toPrivacyType((int) interfaceC33689cMo68212g1.getLong(i49)));
                int i54 = iM60658N24;
                try {
                    if (interfaceC33689cMo68212g1.isNull(i54)) {
                        i14 = iM60658N25;
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            i15 = iM60658N26;
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                i48 = i48;
                                i16 = iM60658N27;
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    i15 = i15;
                                    interfaceC33689c = interfaceC33689cMo68212g1;
                                    i49 = i49;
                                    i54 = i54;
                                    chatChannel = null;
                                    i17 = i16;
                                } else {
                                    if (interfaceC33689cMo68212g1.isNull(i54)) {
                                        strMo5353J0 = null;
                                    } else {
                                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i54);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(i14)) {
                                        strMo5353J1 = null;
                                    } else {
                                        strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i14);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(i15)) {
                                        strMo5353J2 = null;
                                    } else {
                                        strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i15);
                                    }
                                    interfaceC33689c = interfaceC33689cMo68212g1;
                                    i17 = i16;
                                    chatChannel = new ChatChannel(strMo5353J0, strMo5353J1, strMo5353J2, interfaceC33689cMo68212g1.isNull(i16) ? null : interfaceC33689cMo68212g1.mo5353J0(i16));
                                }
                            } else {
                                i48 = i48;
                                i16 = iM60658N27;
                                if (interfaceC33689cMo68212g1.isNull(i54)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i54);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i14)) {
                                    strMo5353J1 = null;
                                } else {
                                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i14);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i15)) {
                                    strMo5353J2 = null;
                                } else {
                                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i15);
                                }
                                interfaceC33689c = interfaceC33689cMo68212g1;
                                i17 = i16;
                                chatChannel = new ChatChannel(strMo5353J0, strMo5353J1, strMo5353J2, interfaceC33689cMo68212g1.isNull(i16) ? null : interfaceC33689cMo68212g1.mo5353J0(i16));
                            }
                        }
                        arrayList.add(new TeamsDto(numValueOf, i18, strMo5353J3, strMo5353J4, strMo5353J5, strMo5353J6, i19, teamPrivacyProfile, listStoredStringToEnum, i24, teamType, i25, i29, chatChannel, z4, i36));
                        iM60658N = iM60658N;
                        iM60658N13 = i34;
                        interfaceC33689cMo68212g1 = interfaceC33689c;
                        iM60658N24 = i54;
                        iM60658N26 = i15;
                        iM60658N3 = i28;
                        iM60658N27 = i17;
                        iM60658N12 = i27;
                        iM60658N2 = iM60658N2;
                        iM60658N16 = i38;
                        iM60658N14 = i35;
                        iM60658N15 = i37;
                        iM60658N17 = i39;
                        iM60658N18 = i44;
                        iM60658N19 = i45;
                        iM60658N22 = i48;
                        iM60658N23 = i49;
                        iM60658N25 = i14;
                        iM60658N4 = i26;
                    } else {
                        i14 = iM60658N25;
                    }
                    chatChannel = new ChatChannel(strMo5353J0, strMo5353J1, strMo5353J2, interfaceC33689cMo68212g1.isNull(i16) ? null : interfaceC33689cMo68212g1.mo5353J0(i16));
                    arrayList.add(new TeamsDto(numValueOf, i18, strMo5353J3, strMo5353J4, strMo5353J5, strMo5353J6, i19, teamPrivacyProfile, listStoredStringToEnum, i24, teamType, i25, i29, chatChannel, z4, i36));
                    iM60658N = iM60658N;
                    iM60658N13 = i34;
                    interfaceC33689cMo68212g1 = interfaceC33689c;
                    iM60658N24 = i54;
                    iM60658N26 = i15;
                    iM60658N3 = i28;
                    iM60658N27 = i17;
                    iM60658N12 = i27;
                    iM60658N2 = iM60658N2;
                    iM60658N16 = i38;
                    iM60658N14 = i35;
                    iM60658N15 = i37;
                    iM60658N17 = i39;
                    iM60658N18 = i44;
                    iM60658N19 = i45;
                    iM60658N22 = i48;
                    iM60658N23 = i49;
                    iM60658N25 = i14;
                    iM60658N4 = i26;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC33689c.close();
                    throw th;
                }
                i15 = iM60658N26;
                i16 = iM60658N27;
                if (interfaceC33689cMo68212g1.isNull(i54)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(i54);
                }
                if (interfaceC33689cMo68212g1.isNull(i14)) {
                    strMo5353J1 = null;
                } else {
                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i14);
                }
                if (interfaceC33689cMo68212g1.isNull(i15)) {
                    strMo5353J2 = null;
                } else {
                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i15);
                }
                interfaceC33689c = interfaceC33689cMo68212g1;
                i17 = i16;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            interfaceC33689c = interfaceC33689cMo68212g1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$getTeamCount$5(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT COUNT(*) FROM table_teams WHERE user_id = (?)");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            Integer numValueOf = null;
            if (interfaceC33689cMo68212g1.mo5355e1() && !interfaceC33689cMo68212g1.isNull(0)) {
                numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(0));
            }
            return numValueOf;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$removeAllTeams$7(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_teams WHERE user_id = (?)");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5355e1();
            return null;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$removeTeam$6(int i13, String str, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_teams WHERE id = (?) and team_type=(?)");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            if (str == null) {
                interfaceC33689cMo68212g1.mo5359u(2);
            } else {
                interfaceC33689cMo68212g1.mo5354L(2, str);
            }
            interfaceC33689cMo68212g1.mo5355e1();
            return null;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$saveDefaultImages$1(DefaultImages defaultImages, InterfaceC33687a interfaceC33687a) {
        this.__insertAdapterOfDefaultImages.insert(interfaceC33687a, defaultImages);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$saveTeam$0(TeamsDto teamsDto, InterfaceC33687a interfaceC33687a) {
        this.__insertAdapterOfTeamsDto.insert(interfaceC33687a, teamsDto);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C23454a0 lambda$updateTeams$2(int i13, List list, InterfaceC33687a interfaceC33687a) {
        super.updateTeams(i13, list);
        return C23454a0.f92919a;
    }

    @Override // com.whoop.data.local.room.dao.wipeable.TeamsDao
    public AbstractC1615p0 getDefaultImagesLiveData() {
        return this.__db.getInvalidationTracker().m5455b(new String[]{"table_default_images"}, false, new C4780c(this, 5));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.TeamsDao
    public AbstractC1615p0 getLiveTeamData(int i13) {
        return this.__db.getInvalidationTracker().m5455b(new String[]{"table_teams"}, false, new C6516c(this, i13, 1));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.TeamsDao
    public Object getTeamCount(int i13, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C6518e(i13, 0), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.wipeable.TeamsDao
    public void removeAllTeams(int i13) {
        AbstractC15751g.m44432L(this.__db, false, true, new C6494e(i13, 3));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.TeamsDao
    public void removeTeam(int i13, String str) {
        AbstractC15751g.m44432L(this.__db, false, true, new C6516c(i13, str, 2));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.TeamsDao
    public void saveDefaultImages(DefaultImages defaultImages) {
        defaultImages.getClass();
        AbstractC15751g.m44432L(this.__db, false, true, new C3169c(27, this, defaultImages));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.TeamsDao
    public void saveTeam(TeamsDto teamsDto) {
        teamsDto.getClass();
        AbstractC15751g.m44432L(this.__db, false, true, new C3169c(26, this, teamsDto));
    }

    @Override // com.whoop.data.local.room.dao.wipeable.TeamsDao
    public void updateTeams(int i13, List<TeamsDto> list) {
        AbstractC15751g.m44432L(this.__db, false, true, new C6517d(this, i13, list, 1));
    }
}
