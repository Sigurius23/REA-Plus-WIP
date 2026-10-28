package com.whoop.data.local.room.entity.converter;

import com.whoop.domain.model.teams.CommunityMemberDto;
import or2.C28169i0;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\n"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/converter/CommunityMemberDtoConverter;", "", "<init>", "()V", "fromCommunityMemberDto", "Lcom/whoop/domain/model/teams/CommunityMemberDto;", "value", "", "communityMemberDtoToString", "dto", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CommunityMemberDtoConverter {
    public final String communityMemberDtoToString(CommunityMemberDto dto) {
        if (dto == null) {
            return null;
        }
        return C28169i0.m85278i(dto);
    }

    public final CommunityMemberDto fromCommunityMemberDto(String value) {
        if (value == null) {
            return null;
        }
        return (CommunityMemberDto) C28169i0.m85275e(value, CommunityMemberDto.class);
    }
}
