package io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal;

import android.util.LruCache;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.C19383k;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.extensions.ChannelExtensionKt;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.client.internal.offline.extensions.CoroutineScopeExtensionsKt;
import io.getstream.chat.android.client.persistance.repository.ChannelRepository;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.core.utils.date.DateUtils;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012$\u0010\r\u001a \b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012$\u0010\u000f\u001a \b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001e\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0007H\u0096@¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\fH\u0096@¢\u0006\u0004\b$\u0010%J\"\u0010'\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\u00072\u0006\u0010&\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\fH\u0096@¢\u0006\u0004\b)\u0010%J\u001a\u0010*\u001a\u0004\u0018\u00010\u00172\u0006\u0010 \u001a\u00020\u0007H\u0096@¢\u0006\u0004\b*\u0010\"J$\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00170+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070+H\u0096@¢\u0006\u0004\b-\u0010.J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070+H\u0096@¢\u0006\u0004\b/\u00100J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020\u00070+2\u0006\u00101\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b2\u00103J\u001e\u00104\u001a\b\u0012\u0004\u0012\u00020\u00170+2\u0006\u00101\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b4\u00103J \u00107\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00072\u0006\u00106\u001a\u000205H\u0096@¢\u0006\u0004\b7\u00108J(\u0010<\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00072\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u000205H\u0096@¢\u0006\u0004\b<\u0010=J \u0010<\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00072\u0006\u0010:\u001a\u000209H\u0096@¢\u0006\u0004\b<\u0010>J\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00020?0+2\u0006\u0010 \u001a\u00020\u0007H\u0096@¢\u0006\u0004\b@\u0010\"J&\u0010B\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00020?0+H\u0096@¢\u0006\u0004\bB\u0010CJ \u0010E\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00072\u0006\u0010D\u001a\u00020\fH\u0096@¢\u0006\u0004\bE\u0010FJ\u0018\u0010G\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0007H\u0096@¢\u0006\u0004\bG\u0010\"J\u0010\u0010H\u001a\u00020\u0019H\u0096@¢\u0006\u0004\bH\u00100J#\u0010J\u001a\u00020\u00192\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170I\"\u00020\u0017H\u0002¢\u0006\u0004\bJ\u0010KJ\u001d\u0010J\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cH\u0002¢\u0006\u0004\bJ\u0010LJ\u0017\u0010M\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010'\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010OJ\u001b\u0010Q\u001a\u00020\u0017*\u00020\u00172\u0006\u0010P\u001a\u00020\u0017H\u0002¢\u0006\u0004\bQ\u0010RJ\u001d\u0010T\u001a\u000209*\u00020\f2\b\u0010S\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\bV\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010WR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010XR0\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010YR2\u0010\r\u001a \b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010YR2\u0010\u000f\u001a \b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010YR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010ZR\u001b\u0010`\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R \u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006g"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;", "channelDao", "Lkotlin/Function2;", "", "Lq83/d;", "Lio/getstream/chat/android/models/User;", "", "getUser", "Lio/getstream/chat/android/models/Message;", "getMessage", "Lio/getstream/chat/android/models/DraftMessage;", "getDraftMessage", "Lkotlin/Function0;", "", "now", "", "cacheSize", "<init>", "(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;Lc93/m;Lc93/m;Lc93/m;Lc93/a;I)V", "Lio/getstream/chat/android/models/Channel;", "channel", "Ll83/a0;", "insertChannel", "(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;", "", "channels", "insertChannels", "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;", "cid", "deleteChannel", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "message", "deleteChannelMessage", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "userId", "deleteAllChannelUserMessages", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "updateChannelMessage", "selectChannel", "", "channelCIDs", "selectChannels", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "selectAllCids", "(Lq83/d;)Ljava/lang/Object;", MapboxMap.QFE_LIMIT, "selectChannelCidsBySyncNeeded", "(ILq83/d;)Ljava/lang/Object;", "selectChannelsSyncNeeded", "Ljava/util/Date;", "deletedAt", "setChannelDeletedAt", "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "", "hidden", "hideMessagesBefore", "setHiddenForChannel", "(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Member;", "selectMembersForChannel", QueryChannelRequest.KEY_MEMBERS, "updateMembersForChannel", "(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "lastMessage", "updateLastMessageForChannel", "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "evictChannel", "clear", "", "cacheChannel", "([Lio/getstream/chat/android/models/Channel;)V", "(Ljava/util/Collection;)V", "deleteAllUserMessages", "(Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "cachedChannel", "combine", "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;", HttpHeaders.DATE, "after", "(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Z", "removeFromCache", "Lbc3/c0;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;", "Lc93/m;", "Lc93/a;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Landroid/util/LruCache;", "channelCache", "Landroid/util/LruCache;", "Lmc3/a;", "dbMutex", "Lmc3/a;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DatabaseChannelRepository implements ChannelRepository {
    private final LruCache<String, Channel> channelCache;
    private final ChannelDao channelDao;
    private final InterfaceC25435a dbMutex;
    private final InterfaceC4351m getDraftMessage;
    private final InterfaceC4351m getMessage;
    private final InterfaceC4351m getUser;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC4339a now;
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$clear$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository", m100430f = "DatabaseChannelRepository.kt", m100431l = {309, 300}, m100432m = "clear")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191321 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C191321(InterfaceC30057d<? super C191321> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseChannelRepository.this.clear(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$deleteChannel$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$deleteChannel$3", m100430f = "DatabaseChannelRepository.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C191333 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $cid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191333(String str, InterfaceC30057d<? super C191333> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$cid = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return DatabaseChannelRepository.this.new C191333(this.$cid, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ChannelDao channelDao = DatabaseChannelRepository.this.channelDao;
                String str = this.$cid;
                this.label = 1;
                if (channelDao.delete(str, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C191333) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$insertChannels$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$insertChannels$2", m100430f = "DatabaseChannelRepository.kt", m100431l = {80}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C191342 extends AbstractC32275i implements Function1 {
        final /* synthetic */ List<ChannelEntity> $channelToInsert;
        final /* synthetic */ List<Channel> $updatedChannels;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191342(List<ChannelEntity> list, List<Channel> list2, InterfaceC30057d<? super C191342> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$channelToInsert = list;
            this.$updatedChannels = list2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return DatabaseChannelRepository.this.new C191342(this.$channelToInsert, this.$updatedChannels, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k logger = DatabaseChannelRepository.this.getLogger();
                List<ChannelEntity> list = this.$channelToInsert;
                List<Channel> list2 = this.$updatedChannels;
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC25012a.m73372e(list.size(), list2.size(), "[insertChannels] inserting ", " entities on DB, updated ", " on cache"), null);
                }
                List<ChannelEntity> list3 = this.$channelToInsert;
                if (list3.isEmpty()) {
                    list3 = null;
                }
                if (list3 != null) {
                    ChannelDao channelDao = DatabaseChannelRepository.this.channelDao;
                    this.L$0 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    if (channelDao.insertMany(list3, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C191342) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$selectChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository", m100430f = "DatabaseChannelRepository.kt", m100431l = {165, 165}, m100432m = "selectChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191351 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C191351(InterfaceC30057d<? super C191351> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseChannelRepository.this.selectChannel(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$selectChannels$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository", m100430f = "DatabaseChannelRepository.kt", m100431l = {177, 178}, m100432m = "selectChannels")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191361 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C191361(InterfaceC30057d<? super C191361> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseChannelRepository.this.selectChannels(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$selectChannelsSyncNeeded$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository", m100430f = "DatabaseChannelRepository.kt", m100431l = {200, 200}, m100432m = "selectChannelsSyncNeeded")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191371 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C191371(InterfaceC30057d<? super C191371> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseChannelRepository.this.selectChannelsSyncNeeded(0, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$selectMembersForChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository", m100430f = "DatabaseChannelRepository.kt", m100431l = {243}, m100432m = "selectMembersForChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191381 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C191381(InterfaceC30057d<? super C191381> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseChannelRepository.this.selectMembersForChannel(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$setChannelDeletedAt$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$setChannelDeletedAt$2", m100430f = "DatabaseChannelRepository.kt", m100431l = {211}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C191392 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $cid;
        final /* synthetic */ Date $deletedAt;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191392(String str, Date date, InterfaceC30057d<? super C191392> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$cid = str;
            this.$deletedAt = date;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return DatabaseChannelRepository.this.new C191392(this.$cid, this.$deletedAt, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ChannelDao channelDao = DatabaseChannelRepository.this.channelDao;
                String str = this.$cid;
                Date date = this.$deletedAt;
                this.label = 1;
                if (channelDao.setDeletedAt(str, date, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C191392) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$setHiddenForChannel$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$setHiddenForChannel$2", m100430f = "DatabaseChannelRepository.kt", m100431l = {223}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C191402 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $cid;
        final /* synthetic */ boolean $hidden;
        final /* synthetic */ Date $hideMessagesBefore;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191402(String str, boolean z4, Date date, InterfaceC30057d<? super C191402> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$cid = str;
            this.$hidden = z4;
            this.$hideMessagesBefore = date;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return DatabaseChannelRepository.this.new C191402(this.$cid, this.$hidden, this.$hideMessagesBefore, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ChannelDao channelDao = DatabaseChannelRepository.this.channelDao;
                String str = this.$cid;
                boolean z4 = this.$hidden;
                Date date = this.$hideMessagesBefore;
                this.label = 1;
                if (channelDao.setHidden(str, z4, date, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C191402) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$setHiddenForChannel$4 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$setHiddenForChannel$4", m100430f = "DatabaseChannelRepository.kt", m100431l = {234}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C191414 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $cid;
        final /* synthetic */ boolean $hidden;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191414(String str, boolean z4, InterfaceC30057d<? super C191414> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$cid = str;
            this.$hidden = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return DatabaseChannelRepository.this.new C191414(this.$cid, this.$hidden, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ChannelDao channelDao = DatabaseChannelRepository.this.channelDao;
                String str = this.$cid;
                boolean z4 = this.$hidden;
                this.label = 1;
                if (channelDao.setHidden(str, z4, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C191414) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$updateLastMessageForChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository", m100430f = "DatabaseChannelRepository.kt", m100431l = {264, 265}, m100432m = "updateLastMessageForChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191421 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C191421(InterfaceC30057d<? super C191421> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseChannelRepository.this.updateLastMessageForChannel(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$updateMembersForChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository", m100430f = "DatabaseChannelRepository.kt", m100431l = {252, 253}, m100432m = "updateMembersForChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191431 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C191431(InterfaceC30057d<? super C191431> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseChannelRepository.this.updateMembersForChannel(null, null, this);
        }
    }

    public DatabaseChannelRepository(InterfaceC2994c0 scope, ChannelDao channelDao, InterfaceC4351m getUser, InterfaceC4351m getMessage, InterfaceC4351m getDraftMessage, InterfaceC4339a now, int i13) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(channelDao, "channelDao");
        AbstractC22676k.m65750j(getUser, "getUser");
        AbstractC22676k.m65750j(getMessage, "getMessage");
        AbstractC22676k.m65750j(getDraftMessage, "getDraftMessage");
        AbstractC22676k.m65750j(now, "now");
        this.scope = scope;
        this.channelDao = channelDao;
        this.getUser = getUser;
        this.getMessage = getMessage;
        this.getDraftMessage = getDraftMessage;
        this.now = now;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:ChannelRepository");
        this.channelCache = new LruCache<>(i13);
        this.dbMutex = AbstractC25438d.m74669a();
    }

    private final boolean after(Message message, Date date) {
        if (date != null) {
            return MessageExtensionsKt.getCreatedAtOrDefault(message, MessageKt.getNEVER()).after(date);
        }
        return true;
    }

    private final void cacheChannel(Collection<Channel> channels) {
        for (Channel channel : channels) {
            this.channelCache.put(channel.getCid(), channel);
        }
    }

    private final Channel combine(Channel channel, Channel channel2) {
        Date dateMinOf = DateUtils.minOf(channel.getHiddenMessagesBefore(), channel2.getHiddenMessagesBefore());
        List<Message> messages = channel.getMessages();
        ArrayList arrayList = new ArrayList();
        for (Object obj : messages) {
            if (after((Message) obj, dateMinOf)) {
                arrayList.add(obj);
            }
        }
        List<Message> messages2 = channel2.getMessages();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : messages2) {
            if (after((Message) obj2, dateMinOf)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(arrayList, arrayList2);
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayListM74129g1) {
            if (hashSet.add(((Message) obj3).getId())) {
                arrayList3.add(obj3);
            }
        }
        List listM74152u1 = AbstractC25265s.m74152u1(arrayList3, new DatabaseChannelRepository$combine$$inlined$sortedBy$1());
        ArrayList arrayListM74129g2 = AbstractC25265s.m74129g1(channel.getRead(), channel2.getRead());
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayListM74129g2) {
            if (hashSet2.add(((ChannelUserRead) obj4).getUserId())) {
                arrayList4.add(obj4);
            }
        }
        return ChannelExtensionKt.syncUnreadCountWithReads$default(Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, listM74152u1, channel.getMembers(), null, arrayList4, null, null, 0, null, null, dateMinOf, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -1071105, 7, null), null, 1, null);
    }

    private final void deleteAllUserMessages(String userId) {
        Collection<Channel> collectionValues = this.channelCache.snapshot().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            List<Message> messages = ((Channel) obj).getMessages();
            if (!(messages instanceof Collection) || !messages.isEmpty()) {
                Iterator<T> it = messages.iterator();
                while (it.hasNext()) {
                    if (AbstractC22676k.m65745e(((Message) it.next()).getUser().getId(), userId)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((Channel) it3.next()).getCid());
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            deleteAllChannelUserMessages((String) it4.next(), userId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void removeFromCache(String cid) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[removeFromCache] cid: ", cid), null);
        }
        this.channelCache.remove(cid);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C191321 c191321;
        InterfaceC25435a interfaceC25435a;
        int i13;
        InterfaceC25435a interfaceC25435a2;
        Throwable th3;
        if (interfaceC30057d instanceof C191321) {
            c191321 = (C191321) interfaceC30057d;
            int i14 = c191321.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c191321.label = i14 - Integer.MIN_VALUE;
            } else {
                c191321 = new C191321(interfaceC30057d);
            }
        } else {
            c191321 = new C191321(interfaceC30057d);
        }
        Object obj = c191321.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c191321.label;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = this.dbMutex;
                c191321.L$0 = interfaceC25435a;
                c191321.I$0 = 0;
                c191321.label = 1;
                if (interfaceC25435a.mo68211b(c191321) != enumC31071a) {
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) c191321.L$0;
                try {
                    AbstractC34132o.m107864I(obj);
                    interfaceC25435a2.mo68214i(null);
                    return C23454a0.f92919a;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            i13 = c191321.I$0;
            InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) c191321.L$0;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a3;
            ChannelDao channelDao = this.channelDao;
            c191321.L$0 = interfaceC25435a;
            c191321.I$0 = i13;
            c191321.I$1 = 0;
            c191321.label = 2;
            if (channelDao.deleteAll(c191321) != enumC31071a) {
                interfaceC25435a2 = interfaceC25435a;
                interfaceC25435a2.mo68214i(null);
                return C23454a0.f92919a;
            }
            return enumC31071a;
        } catch (Throwable th5) {
            interfaceC25435a2 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object deleteAllChannelUserMessages(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (str != null) {
            deleteAllChannelUserMessages(str, str2);
        } else {
            deleteAllUserMessages(str2);
        }
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object deleteChannel(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str2 = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            logger.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[deleteChannel] cid: ", str), null);
        }
        removeFromCache(str);
        Object objLaunchWithMutex = CoroutineScopeExtensionsKt.launchWithMutex(this.scope, this.dbMutex, new C191333(str, null), interfaceC30057d);
        return objLaunchWithMutex == EnumC31071a.f128113w ? objLaunchWithMutex : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object deleteChannelMessage(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC31061c.m95640p("[deleteChannelMessage] message.id: ", message.getId(), ", message.text: ", message.getText()), null);
        }
        Channel channel = this.channelCache.get(message.getCid());
        if (channel != null) {
            List<Message> messages = channel.getMessages();
            ArrayList arrayList = new ArrayList();
            for (Object obj : messages) {
                if (!AbstractC22676k.m65745e(((Message) obj).getId(), message.getId())) {
                    arrayList.add(obj);
                }
            }
            List<Message> pinnedMessages = channel.getPinnedMessages();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : pinnedMessages) {
                if (!AbstractC22676k.m65745e(((Message) obj2).getId(), message.getId())) {
                    arrayList2.add(obj2);
                }
            }
            cacheChannel(Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, arrayList, null, null, null, null, null, 0, null, null, null, 0, null, arrayList2, null, null, null, false, null, null, null, null, null, null, null, -8390657, 7, null));
        }
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object evictChannel(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str2 = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            logger.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[evictChannel] cid: ", str), null);
        }
        removeFromCache(str);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object insertChannel(Channel channel, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objInsertChannels = insertChannels(AbstractC37056f.m118958J(channel), interfaceC30057d);
        return objInsertChannels == EnumC31071a.f128113w ? objInsertChannels : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object insertChannels(Collection<Channel> collection, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Channel channelCombine;
        boolean zIsEmpty = collection.isEmpty();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zIsEmpty) {
            return c23454a0;
        }
        Collection<Channel> collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collection2, 10));
        for (Channel channel : collection2) {
            Channel channel2 = this.channelCache.get(channel.getCid());
            if (channel2 != null && (channelCombine = combine(channel, channel2)) != null) {
                channel = channelCombine;
            }
            arrayList.add(channel);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Channel channel3 = (Channel) obj;
            if (!AbstractC22676k.m65745e(this.channelCache.get(channel3.getCid()), channel3)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(ChannelMapperKt.toEntity((Channel) it.next()));
        }
        cacheChannel(arrayList);
        Object objLaunchWithMutex = CoroutineScopeExtensionsKt.launchWithMutex(this.scope, this.dbMutex, new C191342(arrayList3, arrayList, null), interfaceC30057d);
        return objLaunchWithMutex == EnumC31071a.f128113w ? objLaunchWithMutex : c23454a0;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object selectAllCids(InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return this.channelDao.selectAllCids(interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r8 == r1) goto L25;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object selectChannel(java.lang.String r7, q83.InterfaceC30057d<? super io.getstream.chat.android.models.Channel> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository.C191351
            if (r0 == 0) goto L13
            r0 = r8
            io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$selectChannel$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository.C191351) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$selectChannel$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$selectChannel$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L6e
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L59
        L3f:
            p505ts.AbstractC34132o.m107864I(r8)
            android.util.LruCache<java.lang.String, io.getstream.chat.android.models.Channel> r8 = r6.channelCache
            java.lang.Object r8 = r8.get(r7)
            io.getstream.chat.android.models.Channel r8 = (io.getstream.chat.android.models.Channel) r8
            if (r8 != 0) goto L7b
            io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao r8 = r6.channelDao
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r8 = r8.select(r7, r0)
            if (r8 != r1) goto L59
            goto L6d
        L59:
            io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelEntity r8 = (io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelEntity) r8
            if (r8 == 0) goto L7a
            c93.m r7 = r6.getUser
            c93.m r2 = r6.getMessage
            c93.m r4 = r6.getDraftMessage
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r8 = io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelMapperKt.toModel(r8, r7, r2, r4, r0)
            if (r8 != r1) goto L6e
        L6d:
            return r1
        L6e:
            io.getstream.chat.android.models.Channel r8 = (io.getstream.chat.android.models.Channel) r8
            if (r8 == 0) goto L7a
            io.getstream.chat.android.models.Channel[] r7 = new io.getstream.chat.android.models.Channel[]{r8}
            r6.cacheChannel(r7)
            return r8
        L7a:
            return r5
        L7b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository.selectChannel(java.lang.String, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object selectChannelCidsBySyncNeeded(int i13, InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return ChannelDao.selectCidsBySyncNeeded$default(this.channelDao, null, i13, interfaceC30057d, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:36:0x012b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x012b -> B:37:0x012c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final java.lang.Object selectChannels(java.util.List<java.lang.String> r14, q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.models.Channel>> r15) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository.selectChannels(java.util.List, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b7 -> B:28:0x00b8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final java.lang.Object selectChannelsSyncNeeded(int r13, q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.models.Channel>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository.C191371
            if (r0 == 0) goto L14
            r0 = r14
            io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$selectChannelsSyncNeeded$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository.C191371) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$selectChannelsSyncNeeded$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository$selectChannelsSyncNeeded$1
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r4.result
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r4.label
            r7 = 2
            r2 = 1
            r8 = 0
            if (r1 == 0) goto L5a
            if (r1 == r2) goto L54
            if (r1 != r7) goto L4c
            int r13 = r4.I$2
            int r1 = r4.I$1
            int r2 = r4.I$0
            java.lang.Object r3 = r4.L$6
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r5 = r4.L$5
            io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelEntity r5 = (io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelEntity) r5
            java.lang.Object r5 = r4.L$3
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r4.L$2
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r9 = r4.L$1
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r9 = r4.L$0
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            p505ts.AbstractC34132o.m107864I(r14)
            goto Lb8
        L4c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L54:
            int r13 = r4.I$0
            p505ts.AbstractC34132o.m107864I(r14)
            goto L6f
        L5a:
            p505ts.AbstractC34132o.m107864I(r14)
            io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao r1 = r12.channelDao
            r4.I$0 = r13
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r3 = r13
            java.lang.Object r14 = io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao.selectSyncNeeded$default(r1, r2, r3, r4, r5, r6)
            if (r14 != r0) goto L6e
            goto Lb6
        L6e:
            r13 = r3
        L6f:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = m83.AbstractC25267u.m74163i0(r14, r2)
            r1.<init>(r2)
            java.util.Iterator r14 = r14.iterator()
            r2 = r13
            r5 = r14
            r3 = r1
            r13 = r8
            r1 = r13
        L85:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto Lbf
            java.lang.Object r14 = r5.next()
            io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelEntity r14 = (io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelEntity) r14
            c93.m r6 = r12.getUser
            c93.m r9 = r12.getMessage
            c93.m r10 = r12.getDraftMessage
            r11 = 0
            r4.L$0 = r11
            r4.L$1 = r11
            r4.L$2 = r3
            r4.L$3 = r5
            r4.L$4 = r11
            r4.L$5 = r11
            r4.L$6 = r3
            r4.I$0 = r2
            r4.I$1 = r1
            r4.I$2 = r13
            r4.I$3 = r8
            r4.label = r7
            java.lang.Object r14 = io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelMapperKt.toModel(r14, r6, r9, r10, r4)
            if (r14 != r0) goto Lb7
        Lb6:
            return r0
        Lb7:
            r6 = r3
        Lb8:
            io.getstream.chat.android.models.Channel r14 = (io.getstream.chat.android.models.Channel) r14
            r3.add(r14)
            r3 = r6
            goto L85
        Lbf:
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository.selectChannelsSyncNeeded(int, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object selectMembersForChannel(String str, InterfaceC30057d<? super List<Member>> interfaceC30057d) {
        C191381 c191381;
        List<Member> members;
        if (interfaceC30057d instanceof C191381) {
            c191381 = (C191381) interfaceC30057d;
            int i13 = c191381.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191381.label = i13 - Integer.MIN_VALUE;
            } else {
                c191381 = new C191381(interfaceC30057d);
            }
        } else {
            c191381 = new C191381(interfaceC30057d);
        }
        Object objSelectChannel = c191381.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c191381.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectChannel);
            c191381.L$0 = null;
            c191381.label = 1;
            objSelectChannel = selectChannel(str, c191381);
            if (objSelectChannel == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objSelectChannel);
        }
        Channel channel = (Channel) objSelectChannel;
        return (channel == null || (members = channel.getMembers()) == null) ? C25271y.f99162w : members;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object setChannelDeletedAt(String str, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        removeFromCache(str);
        Object objLaunchWithMutex = CoroutineScopeExtensionsKt.launchWithMutex(this.scope, this.dbMutex, new C191392(str, date, null), interfaceC30057d);
        return objLaunchWithMutex == EnumC31071a.f128113w ? objLaunchWithMutex : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object setHiddenForChannel(String str, boolean z4, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        removeFromCache(str);
        Object objLaunchWithMutex = CoroutineScopeExtensionsKt.launchWithMutex(this.scope, this.dbMutex, new C191402(str, z4, date, null), interfaceC30057d);
        return objLaunchWithMutex == EnumC31071a.f128113w ? objLaunchWithMutex : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object updateChannelMessage(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Date pinExpires;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC31061c.m95640p("[updateChannelMessage] message.id: ", message.getId(), ", message.text: ", message.getText()), null);
        }
        Channel channel = this.channelCache.get(message.getCid());
        if (channel != null) {
            List<Message> messages = channel.getMessages();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(messages, 10));
            for (Message message2 : messages) {
                if (AbstractC22676k.m65745e(message2.getId(), message.getId())) {
                    message2 = message;
                }
                arrayList.add(message2);
            }
            List<Message> pinnedMessages = channel.getPinnedMessages();
            ArrayList arrayList2 = new ArrayList();
            for (Message message3 : pinnedMessages) {
                if (AbstractC22676k.m65745e(message3.getId(), message.getId())) {
                    message3 = (!message.getPinned() || MessageUtils.isDeleted(message) || ((pinExpires = message.getPinExpires()) != null && pinExpires.getTime() < ((Number) this.now.invoke()).longValue())) ? null : message;
                }
                if (message3 != null) {
                    arrayList2.add(message3);
                }
            }
            cacheChannel(Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, arrayList, null, null, null, null, null, 0, null, null, null, 0, null, arrayList2, null, null, null, false, null, null, null, null, null, null, null, -8390657, 7, null));
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c8, code lost:
    
        if (insertChannel(r1, r2) == r3) goto L23;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateLastMessageForChannel(java.lang.String r49, io.getstream.chat.android.models.Message r50, q83.InterfaceC30057d<? super l83.C23454a0> r51) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository.updateLastMessageForChannel(java.lang.String, io.getstream.chat.android.models.Message, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fc, code lost:
    
        if (insertChannel(r1, r2) == r3) goto L29;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateMembersForChannel(java.lang.String r49, java.util.List<io.getstream.chat.android.models.Member> r50, q83.InterfaceC30057d<? super l83.C23454a0> r51) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository.updateMembersForChannel(java.lang.String, java.util.List, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object setHiddenForChannel(String str, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        removeFromCache(str);
        Object objLaunchWithMutex = CoroutineScopeExtensionsKt.launchWithMutex(this.scope, this.dbMutex, new C191414(str, z4, null), interfaceC30057d);
        return objLaunchWithMutex == EnumC31071a.f128113w ? objLaunchWithMutex : C23454a0.f92919a;
    }

    private final void cacheChannel(Channel... channels) {
        for (Channel channel : channels) {
            this.channelCache.put(channel.getCid(), channel);
        }
    }

    private final void deleteAllChannelUserMessages(String cid, String userId) {
        Channel channel = this.channelCache.get(cid);
        if (channel != null) {
            List<Message> messages = channel.getMessages();
            ArrayList arrayList = new ArrayList();
            for (Object obj : messages) {
                if (!AbstractC22676k.m65745e(((Message) obj).getUser().getId(), userId)) {
                    arrayList.add(obj);
                }
            }
            List<Message> pinnedMessages = channel.getPinnedMessages();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : pinnedMessages) {
                if (!AbstractC22676k.m65745e(((Message) obj2).getUser().getId(), userId)) {
                    arrayList2.add(obj2);
                }
            }
            cacheChannel(Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, arrayList, null, null, null, null, null, 0, null, null, null, 0, null, arrayList2, null, null, null, false, null, null, null, null, null, null, null, -8390657, 7, null));
        }
    }

    public /* synthetic */ DatabaseChannelRepository(InterfaceC2994c0 interfaceC2994c0, ChannelDao channelDao, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, InterfaceC4339a interfaceC4339a, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2994c0, channelDao, interfaceC4351m, interfaceC4351m2, interfaceC4351m3, (i14 & 32) != 0 ? new C19383k(1) : interfaceC4339a, (i14 & 64) != 0 ? 1000 : i13);
    }
}
