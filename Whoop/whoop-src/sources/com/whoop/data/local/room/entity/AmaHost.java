package com.whoop.data.local.room.entity;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b \u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b!\u0010\u001b¨\u0006\""}, m65681d2 = {"Lcom/whoop/data/local/room/entity/AmaHost;", "Landroid/os/Parcelable;", "", "userId", "", "firstName", "lastName", "name", "username", "avatarUrl", "hostCreatedAt", "hostUpdatedAt", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getUserId", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getFirstName", "()Ljava/lang/String;", "getLastName", "getName", "getUsername", "getAvatarUrl", "getHostCreatedAt", "getHostUpdatedAt", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AmaHost implements Parcelable {
    public static final Parcelable.Creator<AmaHost> CREATOR = new Creator();
    private final String avatarUrl;
    private final String firstName;
    private final String hostCreatedAt;
    private final String hostUpdatedAt;
    private final String lastName;
    private final String name;
    private final Integer userId;
    private final String username;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<AmaHost> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AmaHost createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new AmaHost(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AmaHost[] newArray(int i13) {
            return new AmaHost[i13];
        }
    }

    public AmaHost() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getHostCreatedAt() {
        return this.hostCreatedAt;
    }

    public final String getHostUpdatedAt() {
        return this.hostUpdatedAt;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        Integer num = this.userId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.name);
        dest.writeString(this.username);
        dest.writeString(this.avatarUrl);
        dest.writeString(this.hostCreatedAt);
        dest.writeString(this.hostUpdatedAt);
    }

    public AmaHost(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.userId = num;
        this.firstName = str;
        this.lastName = str2;
        this.name = str3;
        this.username = str4;
        this.avatarUrl = str5;
        this.hostCreatedAt = str6;
        this.hostUpdatedAt = str7;
    }

    public /* synthetic */ AmaHost(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : str6, (i13 & 128) != 0 ? null : str7);
    }
}
