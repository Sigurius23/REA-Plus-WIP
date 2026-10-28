package g32;

import androidx.core.app.NotificationCompat;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g32.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lg32/b;", "", "Lg32/a;", "address", "", NotificationCompat.CATEGORY_EMAIL, "name", "phone", "<init>", "(Lg32/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lg32/a;", "()Lg32/a;", "b", "Ljava/lang/String;", "c", "d", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15302b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C15301a address;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String email;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String phone;

    public C15302b(C15301a c15301a, String str, String str2, String str3) {
        this.address = c15301a;
        this.email = str;
        this.name = str2;
        this.phone = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C15301a getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15302b)) {
            return false;
        }
        C15302b c15302b = (C15302b) other;
        return AbstractC22676k.m65745e(this.address, c15302b.address) && AbstractC22676k.m65745e(this.email, c15302b.email) && AbstractC22676k.m65745e(this.name, c15302b.name) && AbstractC22676k.m65745e(this.phone, c15302b.phone);
    }

    public int hashCode() {
        C15301a c15301a = this.address;
        int iHashCode = (c15301a == null ? 0 : c15301a.hashCode()) * 31;
        String str = this.email;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        C15301a c15301a = this.address;
        String str = this.email;
        String str2 = this.name;
        String str3 = this.phone;
        StringBuilder sb4 = new StringBuilder("BillingDetails(address=");
        sb4.append(c15301a);
        sb4.append(", email=");
        sb4.append(str);
        sb4.append(", name=");
        return AbstractC11266d.m30464r(sb4, str2, ", phone=", str3, ")");
    }
}
