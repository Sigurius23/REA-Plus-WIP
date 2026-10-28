package bq0;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.profile.domain.ProfileApiKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: bq0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0016R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0016¨\u0006,"}, m65681d2 = {"Lbq0/d;", "Landroid/os/Parcelable;", "", "userId", ProfileApiKt.COMMUNITY_ID_PARAM, "", "deleted", "online", "", "memberType", "notificationSetting", "<init>", "(IIZZLjava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "getUserId", "x", "getCommunityId", "y", "Z", "getDeleted", "()Z", "z", "getOnline", "E", "Ljava/lang/String;", "getMemberType", "F", "b", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3548d implements Parcelable {
    public static final Parcelable.Creator<C3548d> CREATOR = new a();

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final String memberType;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String notificationSetting;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int userId;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int communityId;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final boolean deleted;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final boolean online;

    /* JADX INFO: renamed from: bq0.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Parcelable.Creator<C3548d> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3548d createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z4 = true;
            }
            return new C3548d(i13, i14, z4, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3548d[] newArray(int i13) {
            return new C3548d[i13];
        }
    }

    public C3548d(int i13, int i14, boolean z4, boolean z13, String memberType, String notificationSetting) {
        AbstractC22676k.m65750j(memberType, "memberType");
        AbstractC22676k.m65750j(notificationSetting, "notificationSetting");
        this.userId = i13;
        this.communityId = i14;
        this.deleted = z4;
        this.online = z13;
        this.memberType = memberType;
        this.notificationSetting = notificationSetting;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNotificationSetting() {
        return this.notificationSetting;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3548d)) {
            return false;
        }
        C3548d c3548d = (C3548d) other;
        return this.userId == c3548d.userId && this.communityId == c3548d.communityId && this.deleted == c3548d.deleted && this.online == c3548d.online && AbstractC22676k.m65745e(this.memberType, c3548d.memberType) && AbstractC22676k.m65745e(this.notificationSetting, c3548d.notificationSetting);
    }

    public int hashCode() {
        return this.notificationSetting.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.communityId, Integer.hashCode(this.userId) * 31, 31), 31, this.deleted), 31, this.online), 31, this.memberType);
    }

    public String toString() {
        int i13 = this.userId;
        int i14 = this.communityId;
        boolean z4 = this.deleted;
        boolean z13 = this.online;
        String str = this.memberType;
        String str2 = this.notificationSetting;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "MemberNotificationSettings(userId=", ", communityId=", ", deleted=");
        AbstractC38963t7.m124392v(sbM30465s, z4, ", online=", z13, ", memberType=");
        return AbstractC11266d.m30464r(sbM30465s, str, ", notificationSetting=", str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.userId);
        dest.writeInt(this.communityId);
        dest.writeInt(this.deleted ? 1 : 0);
        dest.writeInt(this.online ? 1 : 0);
        dest.writeString(this.memberType);
        dest.writeString(this.notificationSetting);
    }
}
