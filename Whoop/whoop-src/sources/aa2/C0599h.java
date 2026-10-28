package aa2;

import com.whoop.domain.model.User;
import com.whoop.domain.model.UserProfile;
import com.whoop.service.network.model.UserState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Laa2/h;", "", "<init>", "()V", "Laa2/i;", "userProfileEntity", "Lcom/whoop/domain/model/UserProfile;", "b", "(Laa2/i;)Lcom/whoop/domain/model/UserProfile;", "Lcom/whoop/domain/model/User;", UserState.Sources.USER, "Laa2/g;", "d", "(Lcom/whoop/domain/model/User;)Laa2/g;", "userProfile", "", "id", "c", "(Lcom/whoop/domain/model/UserProfile;I)Laa2/i;", "userEntity", "a", "(Laa2/g;Laa2/i;)Lcom/whoop/domain/model/User;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0599h {
    /* JADX INFO: renamed from: b */
    private final UserProfile m1598b(C0600i userProfileEntity) {
        if (userProfileEntity == null) {
            return null;
        }
        return new UserProfile(userProfileEntity.getGender(), userProfileEntity.getHeight(), userProfileEntity.getWeight(), userProfileEntity.getBirthday(), userProfileEntity.getTimeZoneOffset(), userProfileEntity.getUnitSystem(), userProfileEntity.getFitnessLevel(), userProfileEntity.getMaxHeartRate(), userProfileEntity.getMinHeartRate(), userProfileEntity.getPhysiologicalBaseline(), userProfileEntity.getCanUploadData());
    }

    /* JADX INFO: renamed from: a */
    public final User m1599a(C0598g userEntity, C0600i userProfileEntity) {
        AbstractC22676k.m65750j(userEntity, "userEntity");
        int id4 = userEntity.getId();
        String createdAt = userEntity.getCreatedAt();
        String firstName = userEntity.getFirstName();
        String lastName = userEntity.getLastName();
        String fullName = userEntity.getFullName();
        String emailAddress = userEntity.getEmailAddress();
        String password = userEntity.getPassword();
        String username = userEntity.getUsername();
        String avatarUrl = userEntity.getAvatarUrl();
        String city = userEntity.getCity();
        String adminDivision = userEntity.getAdminDivision();
        String country = userEntity.getCountry();
        boolean concealed = userEntity.getConcealed();
        return new User(id4, createdAt, firstName, lastName, fullName, emailAddress, password, username, avatarUrl, city, adminDivision, country, m1598b(userProfileEntity), Boolean.valueOf(concealed), userEntity.getCom.mapbox.common.HttpHeaders.AGE java.lang.String());
    }

    /* JADX INFO: renamed from: c */
    public final C0600i m1600c(UserProfile userProfile, int id4) {
        AbstractC22676k.m65750j(userProfile, "userProfile");
        return new C0600i(id4, userProfile.getGender(), userProfile.getHeight(), userProfile.getWeight(), userProfile.getBirthday(), userProfile.getTimeZoneOffset(), userProfile.getUnitSystem(), userProfile.getFitnessLevel(), userProfile.getMaxHeartRate(), userProfile.getMinHeartRate(), userProfile.getPhysiologicalBaseline(), userProfile.getCanUploadData());
    }

    /* JADX INFO: renamed from: d */
    public final C0598g m1601d(User user) {
        AbstractC22676k.m65750j(user, "user");
        int id4 = user.getId();
        String createdAt = user.getCreatedAt();
        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        String fullName = user.getFullName();
        String emailAddress = user.getEmailAddress();
        String password = user.getPassword();
        String username = user.getUsername();
        String avatarUrl = user.getAvatarUrl();
        String city = user.getCity();
        String adminDivision = user.getAdminDivision();
        String country = user.getCountry();
        Boolean concealed = user.getConcealed();
        return new C0598g(id4, createdAt, firstName, lastName, fullName, emailAddress, password, username, avatarUrl, city, adminDivision, country, concealed != null ? concealed.booleanValue() : false, user.getAge());
    }
}
