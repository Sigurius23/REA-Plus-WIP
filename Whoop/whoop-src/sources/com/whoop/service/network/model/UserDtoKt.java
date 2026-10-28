package com.whoop.service.network.model;

import com.whoop.domain.model.User;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m65681d2 = {"toUser", "Lcom/whoop/domain/model/User;", "Lcom/whoop/service/network/model/UserDto;", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UserDtoKt {
    public static final User toUser(UserDto userDto) {
        AbstractC22676k.m65750j(userDto, "<this>");
        int id4 = userDto.getId();
        String createdAt = userDto.getCreatedAt();
        String firstName = userDto.getFirstName();
        String lastName = userDto.getLastName();
        String city = userDto.getCity();
        String country = userDto.getCountry();
        String adminDivision = userDto.getAdminDivision();
        String fullName = userDto.getFullName();
        String email = userDto.getEmail();
        String username = userDto.getUsername();
        String avatarUrl = userDto.getAvatarUrl();
        if (avatarUrl == null) {
            avatarUrl = "";
        }
        String str = avatarUrl;
        Boolean concealed = userDto.getConcealed();
        ProfileDto profile = userDto.getProfile();
        return new User(id4, createdAt, firstName, lastName, fullName, email, null, username, str, city, adminDivision, country, profile != null ? ProfileDtoKt.toUserProfile(profile) : null, concealed, 0, 16448, null);
    }
}
