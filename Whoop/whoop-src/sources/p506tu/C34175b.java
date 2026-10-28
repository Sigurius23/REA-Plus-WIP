package p506tu;

import com.google.gson.annotations.SerializedName;
import l83.InterfaceC23457c;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tu.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Ltu/b;", "", "Ltu/i;", "a", "Ltu/i;", "getReason", "()Ltu/i;", "reason", "", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final /* data */ class C34175b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("reason")
    private final EnumC34182i reason;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("message")
    private final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34175b)) {
            return false;
        }
        C34175b c34175b = (C34175b) obj;
        return this.reason == c34175b.reason && AbstractC22676k.m65745e(this.message, c34175b.message);
    }

    public final int hashCode() {
        return this.message.hashCode() + (this.reason.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Error(reason=");
        sb4.append(this.reason);
        sb4.append(", message=");
        return AbstractC25012a.m73377j(sb4, this.message, ')');
    }
}
