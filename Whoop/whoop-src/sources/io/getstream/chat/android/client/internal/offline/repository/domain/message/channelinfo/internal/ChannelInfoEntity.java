package io.getstream.chat.android.client.internal.offline.repository.domain.message.channelinfo.internal;

import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;", "", "cid", "", "id", "type", "memberCount", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getCid", "()Ljava/lang/String;", "getId", "getType", "getMemberCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelInfoEntity {
    private final String cid;
    private final String id;
    private final Integer memberCount;
    private final String name;
    private final String type;

    public ChannelInfoEntity(String str, String str2, String str3, Integer num, String str4) {
        this.cid = str;
        this.id = str2;
        this.type = str3;
        this.memberCount = num;
        this.name = str4;
    }

    public static ChannelInfoEntity copy$default(ChannelInfoEntity channelInfoEntity, String str, String str2, String str3, Integer num, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = channelInfoEntity.cid;
        }
        if ((i13 & 2) != 0) {
            str2 = channelInfoEntity.id;
        }
        if ((i13 & 4) != 0) {
            str3 = channelInfoEntity.type;
        }
        if ((i13 & 8) != 0) {
            num = channelInfoEntity.memberCount;
        }
        if ((i13 & 16) != 0) {
            str4 = channelInfoEntity.name;
        }
        String str5 = str4;
        channelInfoEntity.getClass();
        String str6 = str3;
        return new ChannelInfoEntity(str, str2, str6, num, str5);
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
    public final Integer getMemberCount() {
        return this.memberCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final ChannelInfoEntity copy(String cid, String id4, String type, Integer memberCount, String name) {
        return new ChannelInfoEntity(cid, id4, type, memberCount, name);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelInfoEntity)) {
            return false;
        }
        ChannelInfoEntity channelInfoEntity = (ChannelInfoEntity) other;
        return AbstractC22676k.m65745e(this.cid, channelInfoEntity.cid) && AbstractC22676k.m65745e(this.id, channelInfoEntity.id) && AbstractC22676k.m65745e(this.type, channelInfoEntity.type) && AbstractC22676k.m65745e(this.memberCount, channelInfoEntity.memberCount) && AbstractC22676k.m65745e(this.name, channelInfoEntity.name);
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getMemberCount() {
        return this.memberCount;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.cid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.memberCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.name;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.cid;
        String str2 = this.id;
        String str3 = this.type;
        Integer num = this.memberCount;
        String str4 = this.name;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChannelInfoEntity(cid=", str, ", id=", str2, ", type=");
        AbstractC30007c.m91853w(num, str3, ", memberCount=", ", name=", sbM32001t);
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }
}
