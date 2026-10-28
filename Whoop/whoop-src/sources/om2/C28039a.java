package om2;

import com.google.gson.annotations.SerializedName;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: om2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\r¨\u0006\""}, m65681d2 = {"Lom2/a;", "", "", "searchable", "", "userId", "deleted", "", "createdAt", "updatedAt", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "getSearchable", "()Ljava/lang/Boolean;", "b", "Ljava/lang/Integer;", "getUserId", "()Ljava/lang/Integer;", "c", "getDeleted", "d", "Ljava/lang/String;", "getCreatedAt", "e", "getUpdatedAt", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28039a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("searchable")
    private final Boolean searchable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("user_id")
    private final Integer userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("deleted")
    private final Boolean deleted;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("created_at")
    private final String createdAt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("updated_at")
    private final String updatedAt;

    public C28039a() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28039a)) {
            return false;
        }
        C28039a c28039a = (C28039a) other;
        return AbstractC22676k.m65745e(this.searchable, c28039a.searchable) && AbstractC22676k.m65745e(this.userId, c28039a.userId) && AbstractC22676k.m65745e(this.deleted, c28039a.deleted) && AbstractC22676k.m65745e(this.createdAt, c28039a.createdAt) && AbstractC22676k.m65745e(this.updatedAt, c28039a.updatedAt);
    }

    public int hashCode() {
        Boolean bool = this.searchable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.userId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.deleted;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.createdAt;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.updatedAt;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.searchable;
        Integer num = this.userId;
        Boolean bool2 = this.deleted;
        String str = this.createdAt;
        String str2 = this.updatedAt;
        StringBuilder sb4 = new StringBuilder("UserPrivacySettingsDto(searchable=");
        sb4.append(bool);
        sb4.append(", userId=");
        sb4.append(num);
        sb4.append(", deleted=");
        AbstractC13673n.m38576w(bool2, ", createdAt=", str, ", updatedAt=", sb4);
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public C28039a(Boolean bool, Integer num, Boolean bool2, String str, String str2) {
        this.searchable = bool;
        this.userId = num;
        this.deleted = bool2;
        this.createdAt = str;
        this.updatedAt = str2;
    }

    public /* synthetic */ C28039a(Boolean bool, Integer num, Boolean bool2, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : bool2, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : str2);
    }
}
