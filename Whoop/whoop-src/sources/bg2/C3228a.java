package bg2;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: bg2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lbg2/a;", "", "", "phoneNumber", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3228a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String phoneNumber;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String label;

    public C3228a(String phoneNumber, String label) {
        AbstractC22676k.m65750j(phoneNumber, "phoneNumber");
        AbstractC22676k.m65750j(label, "label");
        this.phoneNumber = phoneNumber;
        this.label = label;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3228a)) {
            return false;
        }
        C3228a c3228a = (C3228a) other;
        return AbstractC22676k.m65745e(this.phoneNumber, c3228a.phoneNumber) && AbstractC22676k.m65745e(this.label, c3228a.label);
    }

    public int hashCode() {
        return this.label.hashCode() + (this.phoneNumber.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("SmsContactPhoneNumber(phoneNumber=", this.phoneNumber, ", label=", this.label, ")");
    }

    public /* synthetic */ C3228a(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? "" : str2);
    }
}
