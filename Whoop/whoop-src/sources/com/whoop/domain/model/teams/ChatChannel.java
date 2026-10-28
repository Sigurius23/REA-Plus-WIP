package com.whoop.domain.model.teams;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u0013¨\u0006%"}, m65681d2 = {"Lcom/whoop/domain/model/teams/ChatChannel;", "Landroid/os/Parcelable;", "", "cid", "id", "type", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/domain/model/teams/ChatChannel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCid", "getId", "getType", "getName", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ChatChannel implements Parcelable {
    public static final Parcelable.Creator<ChatChannel> CREATOR = new Creator();
    private final String cid;
    private final String id;
    private final String name;
    private final String type;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<ChatChannel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatChannel createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new ChatChannel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatChannel[] newArray(int i13) {
            return new ChatChannel[i13];
        }
    }

    public ChatChannel(String cid, String id4, String type, String name) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(name, "name");
        this.cid = cid;
        this.id = id4;
        this.type = type;
        this.name = name;
    }

    public static /* synthetic */ ChatChannel copy$default(ChatChannel chatChannel, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = chatChannel.cid;
        }
        if ((i13 & 2) != 0) {
            str2 = chatChannel.id;
        }
        if ((i13 & 4) != 0) {
            str3 = chatChannel.type;
        }
        if ((i13 & 8) != 0) {
            str4 = chatChannel.name;
        }
        return chatChannel.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final ChatChannel copy(String cid, String id4, String type, String name) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(name, "name");
        return new ChatChannel(cid, id4, type, name);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatChannel)) {
            return false;
        }
        ChatChannel chatChannel = (ChatChannel) other;
        return AbstractC22676k.m65745e(this.cid, chatChannel.cid) && AbstractC22676k.m65745e(this.id, chatChannel.id) && AbstractC22676k.m65745e(this.type, chatChannel.type) && AbstractC22676k.m65745e(this.name, chatChannel.name);
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.name.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.cid.hashCode() * 31, 31, this.id), 31, this.type);
    }

    public String toString() {
        String str = this.cid;
        String str2 = this.id;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("ChatChannel(cid=", str, ", id=", str2, ", type="), this.type, ", name=", this.name, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.cid);
        dest.writeString(this.id);
        dest.writeString(this.type);
        dest.writeString(this.name);
    }
}
