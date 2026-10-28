package io.getstream.chat.android.models;

import c13.AbstractC3855a;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003Jc\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017¨\u0006&"}, m65681d2 = {"Lio/getstream/chat/android/models/UnreadCounts;", "", "messagesCount", "", "threadsCount", "messagesCountByTeam", "", "", "channels", "", "Lio/getstream/chat/android/models/UnreadChannel;", "threads", "Lio/getstream/chat/android/models/UnreadThread;", "channelsByType", "Lio/getstream/chat/android/models/UnreadChannelByType;", "<init>", "(IILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getMessagesCount", "()I", "getThreadsCount", "getMessagesCountByTeam", "()Ljava/util/Map;", "getChannels", "()Ljava/util/List;", "getThreads", "getChannelsByType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UnreadCounts {
    private final List<UnreadChannel> channels;
    private final List<UnreadChannelByType> channelsByType;
    private final int messagesCount;
    private final Map<String, Integer> messagesCountByTeam;
    private final List<UnreadThread> threads;
    private final int threadsCount;

    public UnreadCounts() {
        this(0, 0, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnreadCounts copy$default(UnreadCounts unreadCounts, int i13, int i14, Map map, List list, List list2, List list3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = unreadCounts.messagesCount;
        }
        if ((i15 & 2) != 0) {
            i14 = unreadCounts.threadsCount;
        }
        if ((i15 & 4) != 0) {
            map = unreadCounts.messagesCountByTeam;
        }
        if ((i15 & 8) != 0) {
            list = unreadCounts.channels;
        }
        if ((i15 & 16) != 0) {
            list2 = unreadCounts.threads;
        }
        if ((i15 & 32) != 0) {
            list3 = unreadCounts.channelsByType;
        }
        List list4 = list2;
        List list5 = list3;
        return unreadCounts.copy(i13, i14, map, list, list4, list5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMessagesCount() {
        return this.messagesCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getThreadsCount() {
        return this.threadsCount;
    }

    public final Map<String, Integer> component3() {
        return this.messagesCountByTeam;
    }

    public final List<UnreadChannel> component4() {
        return this.channels;
    }

    public final List<UnreadThread> component5() {
        return this.threads;
    }

    public final List<UnreadChannelByType> component6() {
        return this.channelsByType;
    }

    public final UnreadCounts copy(int messagesCount, int threadsCount, Map<String, Integer> messagesCountByTeam, List<UnreadChannel> channels, List<UnreadThread> threads, List<UnreadChannelByType> channelsByType) {
        AbstractC22676k.m65750j(messagesCountByTeam, "messagesCountByTeam");
        AbstractC22676k.m65750j(channels, "channels");
        AbstractC22676k.m65750j(threads, "threads");
        AbstractC22676k.m65750j(channelsByType, "channelsByType");
        return new UnreadCounts(messagesCount, threadsCount, messagesCountByTeam, channels, threads, channelsByType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadCounts)) {
            return false;
        }
        UnreadCounts unreadCounts = (UnreadCounts) other;
        return this.messagesCount == unreadCounts.messagesCount && this.threadsCount == unreadCounts.threadsCount && AbstractC22676k.m65745e(this.messagesCountByTeam, unreadCounts.messagesCountByTeam) && AbstractC22676k.m65745e(this.channels, unreadCounts.channels) && AbstractC22676k.m65745e(this.threads, unreadCounts.threads) && AbstractC22676k.m65745e(this.channelsByType, unreadCounts.channelsByType);
    }

    public final List<UnreadChannel> getChannels() {
        return this.channels;
    }

    public final List<UnreadChannelByType> getChannelsByType() {
        return this.channelsByType;
    }

    public final int getMessagesCount() {
        return this.messagesCount;
    }

    public final Map<String, Integer> getMessagesCountByTeam() {
        return this.messagesCountByTeam;
    }

    public final List<UnreadThread> getThreads() {
        return this.threads;
    }

    public final int getThreadsCount() {
        return this.threadsCount;
    }

    public int hashCode() {
        return this.channelsByType.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC3855a.m11821e(this.messagesCountByTeam, AbstractC11266d.m30448b(this.threadsCount, Integer.hashCode(this.messagesCount) * 31, 31), 31), 31, this.channels), 31, this.threads);
    }

    public String toString() {
        int i13 = this.messagesCount;
        int i14 = this.threadsCount;
        Map<String, Integer> map = this.messagesCountByTeam;
        List<UnreadChannel> list = this.channels;
        List<UnreadThread> list2 = this.threads;
        List<UnreadChannelByType> list3 = this.channelsByType;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "UnreadCounts(messagesCount=", ", threadsCount=", ", messagesCountByTeam=");
        sbM30465s.append(map);
        sbM30465s.append(", channels=");
        sbM30465s.append(list);
        sbM30465s.append(", threads=");
        return AbstractC30007c.m91843m(sbM30465s, list2, ", channelsByType=", list3, ")");
    }

    public UnreadCounts(int i13, int i14, Map<String, Integer> messagesCountByTeam, List<UnreadChannel> channels, List<UnreadThread> threads, List<UnreadChannelByType> channelsByType) {
        AbstractC22676k.m65750j(messagesCountByTeam, "messagesCountByTeam");
        AbstractC22676k.m65750j(channels, "channels");
        AbstractC22676k.m65750j(threads, "threads");
        AbstractC22676k.m65750j(channelsByType, "channelsByType");
        this.messagesCount = i13;
        this.threadsCount = i14;
        this.messagesCountByTeam = messagesCountByTeam;
        this.channels = channels;
        this.threads = threads;
        this.channelsByType = channelsByType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UnreadCounts(int i13, int i14, Map map, List list, List list2, List list3, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        i13 = (i15 & 1) != 0 ? 0 : i13;
        i14 = (i15 & 2) != 0 ? 0 : i14;
        map = (i15 & 4) != 0 ? C25272z.f99163w : map;
        int i16 = i15 & 8;
        C25271y c25271y = C25271y.f99162w;
        this(i13, i14, map, i16 != 0 ? c25271y : list, (i15 & 16) != 0 ? c25271y : list2, (i15 & 32) != 0 ? c25271y : list3);
    }
}
