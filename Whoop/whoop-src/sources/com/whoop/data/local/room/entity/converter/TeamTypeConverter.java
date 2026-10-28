package com.whoop.data.local.room.entity.converter;

import com.whoop.domain.model.teams.TeamType;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/converter/TeamTypeConverter;", "", "<init>", "()V", "fromTeamType", "", "teamType", "Lcom/whoop/domain/model/teams/TeamType;", "toTeamType", "value", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TeamTypeConverter {
    public final String fromTeamType(TeamType teamType) {
        String value;
        return (teamType == null || (value = teamType.getValue()) == null) ? TeamType.COMMUNITY.getValue() : value;
    }

    public final TeamType toTeamType(String value) {
        AbstractC22676k.m65750j(value, "value");
        Locale locale = Locale.US;
        String strM95641q = AbstractC31061c.m95641q(locale, "US", value, locale, "toLowerCase(...)");
        if (strM95641q.equals("all")) {
            return TeamType.ALL;
        }
        return strM95641q.equals("elite") ? TeamType.ELITE : TeamType.COMMUNITY;
    }
}
