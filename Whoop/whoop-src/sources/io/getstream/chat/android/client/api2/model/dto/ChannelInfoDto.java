package io.getstream.chat.android.client.api2.model.dto;

import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/ChannelInfoDto;", "", "cid", "", "id", "member_count", "", "name", "type", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCid", "()Ljava/lang/String;", "getId", "getMember_count", "()I", "getName", "getType", "getImage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelInfoDto {
    private final String cid;
    private final String id;
    private final String image;
    private final int member_count;
    private final String name;
    private final String type;

    public ChannelInfoDto(String str, String str2, int i13, String str3, String str4, String str5) {
        this.cid = str;
        this.id = str2;
        this.member_count = i13;
        this.name = str3;
        this.type = str4;
        this.image = str5;
    }

    public static /* synthetic */ ChannelInfoDto copy$default(ChannelInfoDto channelInfoDto, String str, String str2, int i13, String str3, String str4, String str5, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = channelInfoDto.cid;
        }
        if ((i14 & 2) != 0) {
            str2 = channelInfoDto.id;
        }
        if ((i14 & 4) != 0) {
            i13 = channelInfoDto.member_count;
        }
        if ((i14 & 8) != 0) {
            str3 = channelInfoDto.name;
        }
        if ((i14 & 16) != 0) {
            str4 = channelInfoDto.type;
        }
        if ((i14 & 32) != 0) {
            str5 = channelInfoDto.image;
        }
        String str6 = str4;
        String str7 = str5;
        return channelInfoDto.copy(str, str2, i13, str3, str6, str7);
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
    public final int getMember_count() {
        return this.member_count;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final ChannelInfoDto copy(String cid, String id4, int member_count, String name, String type, String image) {
        return new ChannelInfoDto(cid, id4, member_count, name, type, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelInfoDto)) {
            return false;
        }
        ChannelInfoDto channelInfoDto = (ChannelInfoDto) other;
        return AbstractC22676k.m65745e(this.cid, channelInfoDto.cid) && AbstractC22676k.m65745e(this.id, channelInfoDto.id) && this.member_count == channelInfoDto.member_count && AbstractC22676k.m65745e(this.name, channelInfoDto.name) && AbstractC22676k.m65745e(this.type, channelInfoDto.type) && AbstractC22676k.m65745e(this.image, channelInfoDto.image);
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

    public final int getMember_count() {
        return this.member_count;
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
        int iM30448b = AbstractC11266d.m30448b(this.member_count, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.name;
        int iHashCode2 = (iM30448b + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.image;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.cid;
        String str2 = this.id;
        int i13 = this.member_count;
        String str3 = this.name;
        String str4 = this.type;
        String str5 = this.image;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChannelInfoDto(cid=", str, ", id=", str2, ", member_count=");
        AbstractC11895b.m31979B(i13, ", name=", str3, ", type=", sbM32001t);
        return AbstractC11266d.m30464r(sbM32001t, str4, ", image=", str5, ")");
    }

    public /* synthetic */ ChannelInfoDto(String str, String str2, int i13, String str3, String str4, String str5, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i14 & 4) != 0 ? 0 : i13, str3, str4, str5);
    }
}
