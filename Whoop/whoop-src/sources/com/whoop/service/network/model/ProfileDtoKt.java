package com.whoop.service.network.model;

import com.whoop.domain.model.FitnessLevel;
import com.whoop.domain.model.Gender;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.UserProfile;
import or2.AbstractC28184n0;
import org.joda.time.LocalDate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m65681d2 = {"toUserProfile", "Lcom/whoop/domain/model/UserProfile;", "Lcom/whoop/service/network/model/ProfileDto;", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileDtoKt {
    public static final UserProfile toUserProfile(ProfileDto profileDto) {
        AbstractC22676k.m65750j(profileDto, "<this>");
        Gender.Companion companion = Gender.INSTANCE;
        String gender = profileDto.getGender();
        if (gender.length() == 0) {
            gender = Gender.FEMALE.getValue();
        }
        Gender genderFromName = companion.fromName(gender);
        float height = profileDto.getHeight();
        float weight = profileDto.getWeight();
        LocalDate localDateM85303a = AbstractC28184n0.m85303a(profileDto.getBirthday(), AbstractC28184n0.m85306d(profileDto.getTimezoneOffset()));
        AbstractC22676k.m65749i(localDateM85303a, "IsoDateTimeStringToLocalDate(...)");
        String timezoneOffset = profileDto.getTimezoneOffset();
        UnitSystem unitSystemFromName = UnitSystem.fromName(profileDto.getUnitSystem());
        AbstractC22676k.m65749i(unitSystemFromName, "fromName(...)");
        FitnessLevel fitnessLevelFromNameKey = FitnessLevel.fromNameKey(profileDto.getFitnessLevel());
        AbstractC22676k.m65749i(fitnessLevelFromNameKey, "fromNameKey(...)");
        return new UserProfile(genderFromName, height, weight, localDateM85303a, timezoneOffset, unitSystemFromName, fitnessLevelFromNameKey, profileDto.getMaxHeartRate(), profileDto.getMinHeartRate(), profileDto.getPhysiologicalBaseline(), profileDto.getCanUploadData());
    }
}
