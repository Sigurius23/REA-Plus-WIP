package io.getstream.chat.android.client.internal.state.plugin.state.global.internal;

import c93.InterfaceC4339a;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import ej1.C13256s;
import io.getstream.chat.android.client.api.state.GlobalState;
import io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlowKt;
import io.getstream.chat.android.models.ChannelMute;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.Location;
import io.getstream.chat.android.models.Mute;
import io.getstream.chat.android.models.TypingEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import xa0.C38136a;
import xb3.AbstractC38176k;
import xb3.C38171f;
import xb3.InterfaceC38174i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0010J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019¢\u0006\u0004\b\u001f\u0010\u001dJ\u001b\u0010\"\u001a\u00020\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0019¢\u0006\u0004\b\"\u0010\u001dJ\u0015\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\n2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b'\u0010&J\u001d\u0010+\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001b\u00102\u001a\u00020\n2\f\u00101\u001a\b\u0012\u0004\u0012\u00020-0\u0019¢\u0006\u0004\b2\u0010\u001dJ\r\u00103\u001a\u00020\n¢\u0006\u0004\b3\u0010\fJ\u001f\u00104\u001a\b\u0012\u0004\u0012\u00020-0\u0019*\b\u0012\u0004\u0012\u00020-0\u0019H\u0002¢\u0006\u0004\b4\u00105J\u001b\u00107\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001506H\u0002¢\u0006\u0004\b7\u00108R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00109R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010:R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010=R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010=R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010=R$\u0010A\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0019\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010=R$\u0010B\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010=R$\u0010C\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0019\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010=R*\u0010E\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020)0D\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010=R*\u0010F\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020#0D\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010=R*\u0010G\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020#0D\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010=R\"\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00190;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010=R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bK\u0010LR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bM\u0010LR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\bN\u0010LR&\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00190I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010J\u001a\u0004\bP\u0010LR&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010J\u001a\u0004\bQ\u0010LR&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00190I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010J\u001a\u0004\bR\u0010LR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bS\u0010LR,\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020)0D0I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010J\u001a\u0004\bU\u0010LR,\u0010V\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020#0D0I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010J\u001a\u0004\bW\u0010LR,\u0010X\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020#0D0I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010J\u001a\u0004\bY\u0010LR&\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00190I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010J\u001a\u0004\b[\u0010LR&\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00190I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010J\u001a\u0004\b]\u0010L¨\u0006^"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "Lio/getstream/chat/android/client/api/state/GlobalState;", "", "Lio/getstream/chat/android/models/UserId;", "userId", "Lkotlin/Function0;", "", "now", "<init>", "(Ljava/lang/String;Lc93/a;)V", "Ll83/a0;", "destroy", "()V", "", "totalUnreadCount", "setTotalUnreadCount", "(I)V", "channelUnreadCount", "setChannelUnreadCount", "unreadThreadsCount", "setUnreadThreadsCount", "", "banned", "setBanned", "(Z)V", "", "Lio/getstream/chat/android/models/ChannelMute;", "channelMutes", "setChannelMutes", "(Ljava/util/List;)V", "blockedUserIds", "setBlockedUserIds", "Lio/getstream/chat/android/models/Mute;", "mutedUsers", "setMutedUsers", "Lio/getstream/chat/android/models/DraftMessage;", "draftMessage", "updateDraftMessage", "(Lio/getstream/chat/android/models/DraftMessage;)V", "removeDraftMessage", "cid", "Lio/getstream/chat/android/models/TypingEvent;", "typingEvent", "tryEmitTypingEvent", "(Ljava/lang/String;Lio/getstream/chat/android/models/TypingEvent;)V", "Lio/getstream/chat/android/models/Location;", "location", "addLiveLocation", "(Lio/getstream/chat/android/models/Location;)V", "locations", "addLiveLocations", "removeExpiredLiveLocations", "removeExpired", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/Function1;", "nonExpiredPredicate", "()Lkotlin/jvm/functions/Function1;", "Ljava/lang/String;", "Lc93/a;", "Lec3/p1;", "_totalUnreadCount", "Lec3/p1;", "_channelUnreadCount", "_unreadThreadsCount", "_banned", "_mutedUsers", "_channelMutes", "_blockedUsersIds", "", "_typingChannels", "_channelDraftMessages", "_threadDraftMessages", "_activeLiveLocations", "Lec3/f2;", "Lec3/f2;", "getTotalUnreadCount", "()Lec3/f2;", "getChannelUnreadCount", "getUnreadThreadsCount", "muted", "getMuted", "getChannelMutes", "getBlockedUserIds", "getBanned", "typingChannels", "getTypingChannels", "channelDraftMessages", "getChannelDraftMessages", "threadDraftMessages", "getThreadDraftMessages", "activeLiveLocations", "getActiveLiveLocations", "currentUserActiveLiveLocations", "getCurrentUserActiveLiveLocations", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MutableGlobalState implements GlobalState {
    private InterfaceC13075p1 _activeLiveLocations;
    private InterfaceC13075p1 _banned;
    private InterfaceC13075p1 _blockedUsersIds;
    private InterfaceC13075p1 _channelDraftMessages;
    private InterfaceC13075p1 _channelMutes;
    private InterfaceC13075p1 _channelUnreadCount;
    private InterfaceC13075p1 _mutedUsers;
    private InterfaceC13075p1 _threadDraftMessages;
    private InterfaceC13075p1 _totalUnreadCount;
    private InterfaceC13075p1 _typingChannels;
    private InterfaceC13075p1 _unreadThreadsCount;
    private final InterfaceC13037f2 activeLiveLocations;
    private final InterfaceC13037f2 banned;
    private final InterfaceC13037f2 blockedUserIds;
    private final InterfaceC13037f2 channelDraftMessages;
    private final InterfaceC13037f2 channelMutes;
    private final InterfaceC13037f2 channelUnreadCount;
    private final InterfaceC13037f2 currentUserActiveLiveLocations;
    private final InterfaceC13037f2 muted;
    private final InterfaceC4339a now;
    private final InterfaceC13037f2 threadDraftMessages;
    private final InterfaceC13037f2 totalUnreadCount;
    private final InterfaceC13037f2 typingChannels;
    private final InterfaceC13037f2 unreadThreadsCount;
    private final String userId;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C193421 extends C22672i implements InterfaceC4339a {
        public static final C193421 INSTANCE = new C193421();

        public C193421() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // c93.InterfaceC4339a
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public MutableGlobalState(String userId, InterfaceC4339a now) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(now, "now");
        this.userId = userId;
        this.now = now;
        this._totalUnreadCount = AbstractC13091v.m36593c(0);
        this._channelUnreadCount = AbstractC13091v.m36593c(0);
        this._unreadThreadsCount = AbstractC13091v.m36593c(0);
        this._banned = AbstractC13091v.m36593c(Boolean.FALSE);
        C25271y c25271y = C25271y.f99162w;
        this._mutedUsers = AbstractC13091v.m36593c(c25271y);
        this._channelMutes = AbstractC13091v.m36593c(c25271y);
        this._blockedUsersIds = AbstractC13091v.m36593c(c25271y);
        C25272z c25272z = C25272z.f99163w;
        this._typingChannels = AbstractC13091v.m36593c(c25272z);
        this._channelDraftMessages = AbstractC13091v.m36593c(c25272z);
        this._threadDraftMessages = AbstractC13091v.m36593c(c25272z);
        this._activeLiveLocations = AbstractC13091v.m36593c(c25271y);
        InterfaceC13075p1 interfaceC13075p1 = this._totalUnreadCount;
        AbstractC22676k.m65747g(interfaceC13075p1);
        this.totalUnreadCount = interfaceC13075p1;
        InterfaceC13075p1 interfaceC13075p2 = this._channelUnreadCount;
        AbstractC22676k.m65747g(interfaceC13075p2);
        this.channelUnreadCount = interfaceC13075p2;
        InterfaceC13075p1 interfaceC13075p3 = this._unreadThreadsCount;
        AbstractC22676k.m65747g(interfaceC13075p3);
        this.unreadThreadsCount = interfaceC13075p3;
        InterfaceC13075p1 interfaceC13075p4 = this._mutedUsers;
        AbstractC22676k.m65747g(interfaceC13075p4);
        this.muted = interfaceC13075p4;
        InterfaceC13075p1 interfaceC13075p5 = this._channelMutes;
        AbstractC22676k.m65747g(interfaceC13075p5);
        this.channelMutes = interfaceC13075p5;
        InterfaceC13075p1 interfaceC13075p6 = this._blockedUsersIds;
        AbstractC22676k.m65747g(interfaceC13075p6);
        this.blockedUserIds = interfaceC13075p6;
        InterfaceC13075p1 interfaceC13075p7 = this._banned;
        AbstractC22676k.m65747g(interfaceC13075p7);
        this.banned = interfaceC13075p7;
        InterfaceC13075p1 interfaceC13075p8 = this._typingChannels;
        AbstractC22676k.m65747g(interfaceC13075p8);
        this.typingChannels = interfaceC13075p8;
        InterfaceC13075p1 interfaceC13075p9 = this._channelDraftMessages;
        AbstractC22676k.m65747g(interfaceC13075p9);
        this.channelDraftMessages = interfaceC13075p9;
        InterfaceC13075p1 interfaceC13075p10 = this._threadDraftMessages;
        AbstractC22676k.m65747g(interfaceC13075p10);
        this.threadDraftMessages = interfaceC13075p10;
        InterfaceC13075p1 interfaceC13075p11 = this._activeLiveLocations;
        this.activeLiveLocations = interfaceC13075p11;
        this.currentUserActiveLiveLocations = DerivedStateFlowKt.mapState(interfaceC13075p11, new C19344a(this, 0));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ArrayList m54861a(MutableGlobalState mutableGlobalState, List list) {
        return (ArrayList) currentUserActiveLiveLocations$lambda$1(mutableGlobalState, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addLiveLocations$lambda$14$lambda$13(List list, Location location) {
        AbstractC22676k.m65750j(location, "location");
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (AbstractC22676k.m65745e(((Location) it.next()).getMessageId(), location.getMessageId())) {
                return true;
            }
        }
        return false;
    }

    private static final List currentUserActiveLiveLocations$lambda$1(MutableGlobalState mutableGlobalState, List it) {
        AbstractC22676k.m65750j(it, "it");
        ArrayList arrayList = new ArrayList();
        for (Object obj : it) {
            if (AbstractC22676k.m65745e(((Location) obj).getUserId(), mutableGlobalState.userId)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final Function1 nonExpiredPredicate() {
        return new C19344a(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nonExpiredPredicate$lambda$16(MutableGlobalState mutableGlobalState, Location location) {
        AbstractC22676k.m65750j(location, "location");
        Date endAt = location.getEndAt();
        if (endAt != null) {
            return endAt.after(new Date(((Number) mutableGlobalState.now.invoke()).longValue()));
        }
        return false;
    }

    private final List<Location> removeExpired(List<Location> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (nonExpiredPredicate$lambda$16(this, (Location) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void addLiveLocation(Location location) {
        AbstractC22676k.m65750j(location, "location");
        addLiveLocations(AbstractC37056f.m118958J(location));
    }

    public final void addLiveLocations(List<Location> locations) {
        C13045h2 c13045h2;
        Object value;
        AbstractC22676k.m65750j(locations, "locations");
        InterfaceC13075p1 interfaceC13075p1 = this._activeLiveLocations;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, AbstractC38176k.m122276E(AbstractC38176k.m122274C(AbstractC38176k.m122282r(AbstractC38176k.m122286v(AbstractC25260n.m74050X(new InterfaceC38174i[]{new C38171f(AbstractC25265s.m74145r0((List) value), false, new C13256s(locations, 2)), AbstractC25265s.m74145r0(locations)}), new C38136a(3)), new C19344a(this, 1)), new C19343x74254923()))));
    }

    public final void destroy() {
        this._totalUnreadCount = null;
        this._channelUnreadCount = null;
        this._unreadThreadsCount = null;
        this._mutedUsers = null;
        this._channelMutes = null;
        this._blockedUsersIds = null;
        this._banned = null;
        this._typingChannels = null;
        this._channelDraftMessages = null;
        this._threadDraftMessages = null;
        C13045h2 c13045h2 = (C13045h2) this._activeLiveLocations;
        c13045h2.getClass();
        c13045h2.m36571k(null, C25271y.f99162w);
    }

    @Override // io.getstream.chat.android.client.api.state.GlobalState
    public final InterfaceC13037f2 getActiveLiveLocations() {
        return this.activeLiveLocations;
    }

    @Override // io.getstream.chat.android.client.api.state.GlobalState
    public final InterfaceC13037f2 getBanned() {
        return this.banned;
    }

    @Override // io.getstream.chat.android.client.api.state.GlobalState
    public final InterfaceC13037f2 getBlockedUserIds() {
        return this.blockedUserIds;
    }

    @Override // io.getstream.chat.android.client.api.state.GlobalState
    public final InterfaceC13037f2 getChannelDraftMessages() {
        return this.channelDraftMessages;
    }

    @Override // io.getstream.chat.android.client.api.state.GlobalState
    public final InterfaceC13037f2 getChannelMutes() {
        return this.channelMutes;
    }

    @Override // io.getstream.chat.android.client.api.state.GlobalState
    public final InterfaceC13037f2 getChannelUnreadCount() {
        return this.channelUnreadCount;
    }

    @Override // io.getstream.chat.android.client.api.state.GlobalState
    public final InterfaceC13037f2 getCurrentUserActiveLiveLocations() {
        return this.currentUserActiveLiveLocations;
    }

    @Override // io.getstream.chat.android.client.api.state.GlobalState
    public final InterfaceC13037f2 getMuted() {
        return this.muted;
    }

    @Override // io.getstream.chat.android.client.api.state.GlobalState
    public final InterfaceC13037f2 getThreadDraftMessages() {
        return this.threadDraftMessages;
    }

    @Override // io.getstream.chat.android.client.api.state.GlobalState
    public final InterfaceC13037f2 getTotalUnreadCount() {
        return this.totalUnreadCount;
    }

    @Override // io.getstream.chat.android.client.api.state.GlobalState
    public final InterfaceC13037f2 getTypingChannels() {
        return this.typingChannels;
    }

    @Override // io.getstream.chat.android.client.api.state.GlobalState
    public final InterfaceC13037f2 getUnreadThreadsCount() {
        return this.unreadThreadsCount;
    }

    public final void removeDraftMessage(DraftMessage draftMessage) {
        InterfaceC13075p1 interfaceC13075p1;
        AbstractC22676k.m65750j(draftMessage, "draftMessage");
        String parentId = draftMessage.getParentId();
        if (parentId != null && (interfaceC13075p1 = this._threadDraftMessages) != null) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.m36571k(null, AbstractC25247g0.m73991Z(parentId, (Map) c13045h2.getValue()));
        }
        InterfaceC13075p1 interfaceC13075p2 = this._channelDraftMessages;
        if (interfaceC13075p2 != null) {
            if (draftMessage.getParentId() != null) {
                interfaceC13075p2 = null;
            }
            if (interfaceC13075p2 != null) {
                C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
                c13045h3.m36571k(null, AbstractC25247g0.m73991Z(draftMessage.getCid(), (Map) c13045h3.getValue()));
            }
        }
    }

    public final void removeExpiredLiveLocations() {
        C13045h2 c13045h2;
        Object value;
        InterfaceC13075p1 interfaceC13075p1 = this._activeLiveLocations;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, removeExpired((List) value)));
    }

    public final void setBanned(boolean banned) {
        InterfaceC13075p1 interfaceC13075p1 = this._banned;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(banned));
        }
    }

    public final void setBlockedUserIds(List<String> blockedUserIds) {
        AbstractC22676k.m65750j(blockedUserIds, "blockedUserIds");
        InterfaceC13075p1 interfaceC13075p1 = this._blockedUsersIds;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, blockedUserIds);
        }
    }

    public final void setChannelMutes(List<ChannelMute> channelMutes) {
        AbstractC22676k.m65750j(channelMutes, "channelMutes");
        InterfaceC13075p1 interfaceC13075p1 = this._channelMutes;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, channelMutes);
        }
    }

    public final void setChannelUnreadCount(int channelUnreadCount) {
        InterfaceC13075p1 interfaceC13075p1 = this._channelUnreadCount;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Integer.valueOf(channelUnreadCount));
        }
    }

    public final void setMutedUsers(List<Mute> mutedUsers) {
        AbstractC22676k.m65750j(mutedUsers, "mutedUsers");
        InterfaceC13075p1 interfaceC13075p1 = this._mutedUsers;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, mutedUsers);
        }
    }

    public final void setTotalUnreadCount(int totalUnreadCount) {
        InterfaceC13075p1 interfaceC13075p1 = this._totalUnreadCount;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Integer.valueOf(totalUnreadCount));
        }
    }

    public final void setUnreadThreadsCount(int unreadThreadsCount) {
        InterfaceC13075p1 interfaceC13075p1 = this._unreadThreadsCount;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Integer.valueOf(unreadThreadsCount));
        }
    }

    public final void tryEmitTypingEvent(String cid, TypingEvent typingEvent) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(typingEvent, "typingEvent");
        InterfaceC13075p1 interfaceC13075p1 = this._typingChannels;
        if (interfaceC13075p1 != null) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0((Map) c13045h2.getValue());
            if (typingEvent.getUsers().isEmpty()) {
                linkedHashMapM74003l0.remove(cid);
            } else {
                linkedHashMapM74003l0.put(cid, typingEvent);
            }
            c13045h2.m36571k(null, linkedHashMapM74003l0);
        }
    }

    public final void updateDraftMessage(DraftMessage draftMessage) {
        InterfaceC13075p1 interfaceC13075p1;
        AbstractC22676k.m65750j(draftMessage, "draftMessage");
        String parentId = draftMessage.getParentId();
        if (parentId != null && (interfaceC13075p1 = this._threadDraftMessages) != null) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.m36571k(null, AbstractC25247g0.m73996e0((Map) c13045h2.getValue(), new C23465k(parentId, draftMessage)));
        }
        InterfaceC13075p1 interfaceC13075p2 = this._channelDraftMessages;
        if (interfaceC13075p2 != null) {
            if (draftMessage.getParentId() != null) {
                interfaceC13075p2 = null;
            }
            if (interfaceC13075p2 != null) {
                C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
                c13045h3.m36571k(null, AbstractC25247g0.m73996e0((Map) c13045h3.getValue(), new C23465k(draftMessage.getCid(), draftMessage)));
            }
        }
    }

    public /* synthetic */ MutableGlobalState(String str, InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C193421.INSTANCE : interfaceC4339a);
    }
}
