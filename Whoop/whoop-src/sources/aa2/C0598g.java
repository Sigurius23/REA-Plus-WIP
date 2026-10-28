package aa2;

import com.mapbox.common.HttpHeaders;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0016R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b*\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b+\u0010\u0016R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b$\u0010\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b(\u0010\u0016R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b&\u0010-R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b\u001f\u0010\u0018¨\u0006."}, m65681d2 = {"Laa2/g;", "", "", "id", "", "createdAt", "firstName", "lastName", "fullName", "emailAddress", "password", "username", "avatarUrl", "city", "adminDivision", "country", "", "concealed", HttpHeaders.AGE, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "k", "b", "Ljava/lang/String;", "g", "c", "i", "d", "l", "e", "j", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "m", "n", "Z", "()Z", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0598g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String createdAt;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String firstName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String lastName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String fullName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String emailAddress;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String password;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String username;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String avatarUrl;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String city;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String adminDivision;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String country;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean concealed;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int age;

    public C0598g(int i13, String createdAt, String firstName, String lastName, String fullName, String emailAddress, String password, String username, String avatarUrl, String str, String str2, String country, boolean z4, int i14) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(fullName, "fullName");
        AbstractC22676k.m65750j(emailAddress, "emailAddress");
        AbstractC22676k.m65750j(password, "password");
        AbstractC22676k.m65750j(username, "username");
        AbstractC22676k.m65750j(avatarUrl, "avatarUrl");
        AbstractC22676k.m65750j(country, "country");
        this.id = i13;
        this.createdAt = createdAt;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.username = username;
        this.avatarUrl = avatarUrl;
        this.city = str;
        this.adminDivision = str2;
        this.country = country;
        this.concealed = z4;
        this.age = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdminDivision() {
        return this.adminDivision;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getConcealed() {
        return this.concealed;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0598g)) {
            return false;
        }
        C0598g c0598g = (C0598g) other;
        return this.id == c0598g.id && AbstractC22676k.m65745e(this.createdAt, c0598g.createdAt) && AbstractC22676k.m65745e(this.firstName, c0598g.firstName) && AbstractC22676k.m65745e(this.lastName, c0598g.lastName) && AbstractC22676k.m65745e(this.fullName, c0598g.fullName) && AbstractC22676k.m65745e(this.emailAddress, c0598g.emailAddress) && AbstractC22676k.m65745e(this.password, c0598g.password) && AbstractC22676k.m65745e(this.username, c0598g.username) && AbstractC22676k.m65745e(this.avatarUrl, c0598g.avatarUrl) && AbstractC22676k.m65745e(this.city, c0598g.city) && AbstractC22676k.m65745e(this.adminDivision, c0598g.adminDivision) && AbstractC22676k.m65745e(this.country, c0598g.country) && this.concealed == c0598g.concealed && this.age == c0598g.age;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.createdAt), 31, this.firstName), 31, this.lastName), 31, this.fullName), 31, this.emailAddress), 31, this.password), 31, this.username), 31, this.avatarUrl);
        String str = this.city;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.adminDivision;
        return Integer.hashCode(this.age) + AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.country), 31, this.concealed);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public String toString() {
        int i13 = this.id;
        String str = this.createdAt;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.fullName;
        String str5 = this.emailAddress;
        String str6 = this.password;
        String str7 = this.username;
        String str8 = this.avatarUrl;
        String str9 = this.city;
        String str10 = this.adminDivision;
        String str11 = this.country;
        boolean z4 = this.concealed;
        int i14 = this.age;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "UserEntity(id=", ", createdAt=", str, ", firstName=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", lastName=", str3, ", fullName=");
        AbstractC11266d.m30444B(sbM53373n, str4, ", emailAddress=", str5, ", password=");
        AbstractC11266d.m30444B(sbM53373n, str6, ", username=", str7, ", avatarUrl=");
        AbstractC11266d.m30444B(sbM53373n, str8, ", city=", str9, ", adminDivision=");
        AbstractC11266d.m30444B(sbM53373n, str10, ", country=", str11, ", concealed=");
        sbM53373n.append(z4);
        sbM53373n.append(", age=");
        sbM53373n.append(i14);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }
}
