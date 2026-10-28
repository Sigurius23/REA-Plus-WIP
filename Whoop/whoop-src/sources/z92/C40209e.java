package z92;

import c13.AbstractC3855a;
import com.whoop.domain.model.Gender;
import com.whoop.domain.model.User;
import com.whoop.domain.model.UserProfile;
import com.whoop.service.network.model.UserState;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z92.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lz92/e;", "", "Lcom/whoop/domain/model/User;", UserState.Sources.USER, "<init>", "(Lcom/whoop/domain/model/User;)V", "Lcom/whoop/domain/model/UserProfile;", "", "a", "(Lcom/whoop/domain/model/UserProfile;)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/whoop/domain/model/User;", "b", "()Lcom/whoop/domain/model/User;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40209e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final User user;

    public C40209e(User user) {
        this.user = user;
    }

    /* JADX INFO: renamed from: a */
    private final int m129096a(UserProfile userProfile) {
        if (userProfile == null) {
            return 0;
        }
        int minHeartRate = (userProfile.getMinHeartRate() + ((userProfile.getMaxHeartRate() + ((userProfile.getFitnessLevel().toNameKey().hashCode() + ((userProfile.getUnitSystem().toName().hashCode() + ((userProfile.getTimeZoneOffset().hashCode() + ((userProfile.getBirthday().hashCode() + ((Float.hashCode(userProfile.getWeight()) + ((Float.hashCode(userProfile.getHeight()) + (userProfile.getGender().getValue().hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String physiologicalBaseline = userProfile.getPhysiologicalBaseline();
        return Boolean.hashCode(userProfile.getCanUploadData()) + ((minHeartRate + (physiologicalBaseline != null ? physiologicalBaseline.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!C40209e.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(other, "null cannot be cast to non-null type com.whoop.service.store.user.cache.UserUpdate");
        User user = ((C40209e) other).user;
        if (user == null) {
            return this.user == null;
        }
        User user2 = this.user;
        if (user2 == null) {
            return false;
        }
        if (user2 == user) {
            return true;
        }
        return user2.getId() == user.getId() && AbstractC22676k.m65745e(user2.getCreatedAt(), user.getCreatedAt()) && AbstractC22676k.m65745e(user2.getFirstName(), user.getFirstName()) && AbstractC22676k.m65745e(user2.getLastName(), user.getLastName()) && AbstractC22676k.m65745e(user2.getFullName(), user.getFullName()) && AbstractC22676k.m65745e(user2.getEmailAddress(), user.getEmailAddress()) && AbstractC22676k.m65745e(user2.getUsername(), user.getUsername()) && AbstractC22676k.m65745e(user2.getAvatarUrl(), user.getAvatarUrl()) && AbstractC22676k.m65745e(user2.getCity(), user.getCity()) && AbstractC22676k.m65745e(user2.getAdminDivision(), user.getAdminDivision()) && AbstractC22676k.m65745e(user2.getCountry(), user.getCountry()) && AbstractC22676k.m65745e(user2.getProfile(), user.getProfile()) && AbstractC22676k.m65745e(user2.getConcealed(), user.getConcealed()) && user2.getAge() == user.getAge();
    }

    public int hashCode() {
        User user = this.user;
        if (user == null) {
            return 0;
        }
        int iHashCode = (user.getAvatarUrl().hashCode() + ((user.getUsername().hashCode() + ((user.getEmailAddress().hashCode() + ((user.getFullName().hashCode() + ((user.getLastName().hashCode() + ((user.getFirstName().hashCode() + ((user.getCreatedAt().hashCode() + (user.getId() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String city = user.getCity();
        int iHashCode2 = (iHashCode + (city != null ? city.hashCode() : 0)) * 31;
        String adminDivision = user.getAdminDivision();
        int iHashCode3 = (((user.getCountry().hashCode() + ((iHashCode2 + (adminDivision != null ? adminDivision.hashCode() : 0)) * 31)) * 31) + m129096a(user.getProfile())) * 31;
        Boolean concealed = user.getConcealed();
        return user.getAge() + ((iHashCode3 + (concealed != null ? Boolean.hashCode(concealed.booleanValue()) : 0)) * 31);
    }

    public String toString() {
        User user = this.user;
        if (user == null) {
            return "UserUpdate(user=null)";
        }
        int id4 = user.getId();
        String createdAt = user.getCreatedAt();
        String username = user.getUsername();
        String avatarUrl = user.getAvatarUrl();
        String country = user.getCountry();
        UserProfile profile = user.getProfile();
        Gender gender = profile != null ? profile.getGender() : null;
        UserProfile profile2 = user.getProfile();
        Boolean boolValueOf = profile2 != null ? Boolean.valueOf(profile2.getCanUploadData()) : null;
        Boolean concealed = user.getConcealed();
        int age = user.getAge();
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(id4, "UserUpdate(id=", ", createdAt='", createdAt, "', username='");
        AbstractC11266d.m30444B(sbM53373n, username, "', avatarUrl='", avatarUrl, "', country='");
        sbM53373n.append(country);
        sbM53373n.append("', gender=");
        sbM53373n.append(gender);
        sbM53373n.append(", canUploadData=");
        AbstractC3855a.m11839w(sbM53373n, boolValueOf, ", concealed=", concealed, ", age=");
        return AbstractC18489d0.m53371l(sbM53373n, age, ")");
    }
}
