package io.getstream.chat.android.client.api2.model.dto;

import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003Je\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UnreadDto;", "", "total_unread_count", "", "total_unread_threads_count", "total_unread_count_by_team", "", "", "channels", "", "Lio/getstream/chat/android/client/api2/model/dto/UnreadChannelDto;", "threads", "Lio/getstream/chat/android/client/api2/model/dto/UnreadThreadDto;", "channel_type", "Lio/getstream/chat/android/client/api2/model/dto/UnreadChannelByTypeDto;", "<init>", "(IILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTotal_unread_count", "()I", "getTotal_unread_threads_count", "getTotal_unread_count_by_team", "()Ljava/util/Map;", "getChannels", "()Ljava/util/List;", "getThreads", "getChannel_type", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UnreadDto {
    private final List<UnreadChannelByTypeDto> channel_type;
    private final List<UnreadChannelDto> channels;
    private final List<UnreadThreadDto> threads;
    private final int total_unread_count;
    private final Map<String, Integer> total_unread_count_by_team;
    private final int total_unread_threads_count;

    public UnreadDto() {
        this(0, 0, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnreadDto copy$default(UnreadDto unreadDto, int i13, int i14, Map map, List list, List list2, List list3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = unreadDto.total_unread_count;
        }
        if ((i15 & 2) != 0) {
            i14 = unreadDto.total_unread_threads_count;
        }
        if ((i15 & 4) != 0) {
            map = unreadDto.total_unread_count_by_team;
        }
        if ((i15 & 8) != 0) {
            list = unreadDto.channels;
        }
        if ((i15 & 16) != 0) {
            list2 = unreadDto.threads;
        }
        if ((i15 & 32) != 0) {
            list3 = unreadDto.channel_type;
        }
        List list4 = list2;
        List list5 = list3;
        return unreadDto.copy(i13, i14, map, list, list4, list5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotal_unread_count() {
        return this.total_unread_count;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotal_unread_threads_count() {
        return this.total_unread_threads_count;
    }

    public final Map<String, Integer> component3() {
        return this.total_unread_count_by_team;
    }

    public final List<UnreadChannelDto> component4() {
        return this.channels;
    }

    public final List<UnreadThreadDto> component5() {
        return this.threads;
    }

    public final List<UnreadChannelByTypeDto> component6() {
        return this.channel_type;
    }

    public final UnreadDto copy(int total_unread_count, int total_unread_threads_count, Map<String, Integer> total_unread_count_by_team, List<UnreadChannelDto> channels, List<UnreadThreadDto> threads, List<UnreadChannelByTypeDto> channel_type) {
        AbstractC22676k.m65750j(channels, "channels");
        AbstractC22676k.m65750j(threads, "threads");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        return new UnreadDto(total_unread_count, total_unread_threads_count, total_unread_count_by_team, channels, threads, channel_type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadDto)) {
            return false;
        }
        UnreadDto unreadDto = (UnreadDto) other;
        return this.total_unread_count == unreadDto.total_unread_count && this.total_unread_threads_count == unreadDto.total_unread_threads_count && AbstractC22676k.m65745e(this.total_unread_count_by_team, unreadDto.total_unread_count_by_team) && AbstractC22676k.m65745e(this.channels, unreadDto.channels) && AbstractC22676k.m65745e(this.threads, unreadDto.threads) && AbstractC22676k.m65745e(this.channel_type, unreadDto.channel_type);
    }

    public final List<UnreadChannelByTypeDto> getChannel_type() {
        return this.channel_type;
    }

    public final List<UnreadChannelDto> getChannels() {
        return this.channels;
    }

    public final List<UnreadThreadDto> getThreads() {
        return this.threads;
    }

    public final int getTotal_unread_count() {
        return this.total_unread_count;
    }

    public final Map<String, Integer> getTotal_unread_count_by_team() {
        return this.total_unread_count_by_team;
    }

    public final int getTotal_unread_threads_count() {
        return this.total_unread_threads_count;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.total_unread_threads_count, Integer.hashCode(this.total_unread_count) * 31, 31);
        Map<String, Integer> map = this.total_unread_count_by_team;
        return this.channel_type.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b((iM30448b + (map == null ? 0 : map.hashCode())) * 31, 31, this.channels), 31, this.threads);
    }

    public String toString() {
        int i13 = this.total_unread_count;
        int i14 = this.total_unread_threads_count;
        Map<String, Integer> map = this.total_unread_count_by_team;
        List<UnreadChannelDto> list = this.channels;
        List<UnreadThreadDto> list2 = this.threads;
        List<UnreadChannelByTypeDto> list3 = this.channel_type;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "UnreadDto(total_unread_count=", ", total_unread_threads_count=", ", total_unread_count_by_team=");
        sbM30465s.append(map);
        sbM30465s.append(", channels=");
        sbM30465s.append(list);
        sbM30465s.append(", threads=");
        return AbstractC30007c.m91843m(sbM30465s, list2, ", channel_type=", list3, ")");
    }

    public UnreadDto(int i13, int i14, Map<String, Integer> map, List<UnreadChannelDto> channels, List<UnreadThreadDto> threads, List<UnreadChannelByTypeDto> channel_type) {
        AbstractC22676k.m65750j(channels, "channels");
        AbstractC22676k.m65750j(threads, "threads");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        this.total_unread_count = i13;
        this.total_unread_threads_count = i14;
        this.total_unread_count_by_team = map;
        this.channels = channels;
        this.threads = threads;
        this.channel_type = channel_type;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UnreadDto(int i13, int i14, Map map, List list, List list2, List list3, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        i13 = (i15 & 1) != 0 ? 0 : i13;
        i14 = (i15 & 2) != 0 ? 0 : i14;
        map = (i15 & 4) != 0 ? C25272z.f99163w : map;
        int i16 = i15 & 8;
        C25271y c25271y = C25271y.f99162w;
        this(i13, i14, map, i16 != 0 ? c25271y : list, (i15 & 16) != 0 ? c25271y : list2, (i15 & 32) != 0 ? c25271y : list3);
    }
}
