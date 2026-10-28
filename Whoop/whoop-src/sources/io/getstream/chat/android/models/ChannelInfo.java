package io.getstream.chat.android.models;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/models/ChannelInfo;", "", "cid", "", "id", "type", "memberCount", "", "name", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCid", "()Ljava/lang/String;", "getId", "getType", "getMemberCount", "()I", "getName", "getImage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelInfo {
    private final String cid;
    private final String id;
    private final String image;
    private final int memberCount;
    private final String name;
    private final String type;

    public ChannelInfo() {
        this(null, null, null, 0, null, null, 63, null);
    }

    public static /* synthetic */ ChannelInfo copy$default(ChannelInfo channelInfo, String str, String str2, String str3, int i13, String str4, String str5, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = channelInfo.cid;
        }
        if ((i14 & 2) != 0) {
            str2 = channelInfo.id;
        }
        if ((i14 & 4) != 0) {
            str3 = channelInfo.type;
        }
        if ((i14 & 8) != 0) {
            i13 = channelInfo.memberCount;
        }
        if ((i14 & 16) != 0) {
            str4 = channelInfo.name;
        }
        if ((i14 & 32) != 0) {
            str5 = channelInfo.image;
        }
        String str6 = str4;
        String str7 = str5;
        return channelInfo.copy(str, str2, str3, i13, str6, str7);
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
    public final int getMemberCount() {
        return this.memberCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final ChannelInfo copy(String cid, String id4, String type, int memberCount, String name, String image) {
        return new ChannelInfo(cid, id4, type, memberCount, name, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelInfo)) {
            return false;
        }
        ChannelInfo channelInfo = (ChannelInfo) other;
        return AbstractC22676k.m65745e(this.cid, channelInfo.cid) && AbstractC22676k.m65745e(this.id, channelInfo.id) && AbstractC22676k.m65745e(this.type, channelInfo.type) && this.memberCount == channelInfo.memberCount && AbstractC22676k.m65745e(this.name, channelInfo.name) && AbstractC22676k.m65745e(this.image, channelInfo.image);
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.cid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iM30448b = AbstractC11266d.m30448b(this.memberCount, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.name;
        int iHashCode3 = (iM30448b + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.image;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.cid;
        String str2 = this.id;
        String str3 = this.type;
        int i13 = this.memberCount;
        String str4 = this.name;
        String str5 = this.image;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChannelInfo(cid=", str, ", id=", str2, ", type=");
        AbstractC11266d.m30470x(i13, str3, ", memberCount=", ", name=", sbM32001t);
        return AbstractC11266d.m30464r(sbM32001t, str4, ", image=", str5, ")");
    }

    public ChannelInfo(String str, String str2, String str3, int i13, String str4, String str5) {
        this.cid = str;
        this.id = str2;
        this.type = str3;
        this.memberCount = i13;
        this.name = str4;
        this.image = str5;
    }

    public /* synthetic */ ChannelInfo(String str, String str2, String str3, int i13, String str4, String str5, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? 0 : i13, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5);
    }
}
