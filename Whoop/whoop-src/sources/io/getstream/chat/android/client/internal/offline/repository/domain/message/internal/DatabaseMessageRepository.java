package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.api.models.Pagination;
import io.getstream.chat.android.client.internal.offline.extensions.CoroutineScopeExtensionsKt;
import io.getstream.chat.android.client.persistance.repository.MessageRepository;
import io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.joda.time.DateTimeConstants;
import p002a0.C0005a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 j2\u00020\u0001:\u0001jBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b \u0010!J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\"\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b#\u0010$J&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b%\u0010&J$\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aH\u0096@¢\u0006\u0004\b(\u0010)J\u001a\u0010*\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b*\u0010$J\u001e\u0010-\u001a\u00020,2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@¢\u0006\u0004\b-\u0010)J\u0018\u0010/\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b/\u00100J\u0018\u00102\u001a\u00020,2\u0006\u0010.\u001a\u000201H\u0096@¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020,2\u0006\u0010.\u001a\u000201H\u0096@¢\u0006\u0004\b4\u00103J\u0016\u00105\u001a\b\u0012\u0004\u0012\u0002010\u001aH\u0096@¢\u0006\u0004\b5\u00106J\u001a\u00107\u001a\u0004\u0018\u0001012\u0006\u0010\u0017\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b7\u0010$J\u001a\u00109\u001a\u0004\u0018\u0001012\u0006\u00108\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b9\u0010$J \u0010<\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020:H\u0096@¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b>\u0010$J\u0018\u0010?\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b?\u00100J\u001e\u0010@\u001a\u00020,2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@¢\u0006\u0004\b@\u0010)J\u001e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2\u0006\u0010B\u001a\u00020AH\u0096@¢\u0006\u0004\bC\u0010DJ\u001e\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010B\u001a\u00020AH\u0096@¢\u0006\u0004\bE\u0010DJ\u001e\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010F\u001a\u00020\u000bH\u0096@¢\u0006\u0004\bG\u0010$J\u0018\u0010H\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020\u000bH\u0096@¢\u0006\u0004\bH\u0010$J\u0010\u0010I\u001a\u00020,H\u0096@¢\u0006\u0004\bI\u00106J\u0018\u0010J\u001a\u00020,2\u0006\u0010F\u001a\u00020\u000bH\u0096@¢\u0006\u0004\bJ\u0010$J\u0010\u0010K\u001a\u00020,H\u0096@¢\u0006\u0004\bK\u00106J\u001e\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u000bH\u0096@¢\u0006\u0004\bL\u0010$J\u001a\u0010M\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0082@¢\u0006\u0004\bM\u0010$J(\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u001a2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0004\bO\u0010\u001dJ$\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aH\u0082@¢\u0006\u0004\bP\u0010)J\u001a\u0010Q\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0082@¢\u0006\u0004\bQ\u0010$J\u0017\u0010R\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001bH\u0002¢\u0006\u0004\bR\u0010SJ\u0014\u0010T\u001a\u00020\u001b*\u00020NH\u0082@¢\u0006\u0004\bT\u0010UJ\u001a\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010F\u001a\u00020\u000bH\u0082@¢\u0006\u0004\bW\u0010$J\u0013\u0010X\u001a\u00020\u001b*\u00020\u001bH\u0002¢\u0006\u0004\bX\u0010YR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ZR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010[R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\\R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010]R0\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010^R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010_R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010`R \u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR \u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010cR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u000b0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010`R\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i¨\u0006k"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;", "messageDao", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;", "replyMessageDao", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;", "pollDao", "Lkotlin/Function2;", "", "Lq83/d;", "Lio/getstream/chat/android/models/User;", "", "getUser", "currentUser", "", "ignoredChannelTypes", "", "cacheSize", "<init>", "(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;Lc93/m;Lio/getstream/chat/android/models/User;Ljava/util/Set;I)V", "cid", "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;", "pagination", "", "Lio/getstream/chat/android/models/Message;", "selectMessagesForChannel", "(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;", "messageId", MapboxMap.QFE_LIMIT, "selectMessagesForThread", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "userId", "selectAllUserMessages", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "selectAllChannelUserMessages", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "messageIds", "selectMessages", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "selectMessage", "messages", "Ll83/a0;", "insertMessages", "message", "insertMessage", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/DraftMessage;", "insertDraftMessage", "(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;", "deleteDraftMessage", "selectDraftMessages", "(Lq83/d;)Ljava/lang/Object;", "selectDraftMessagesByCid", "parentId", "selectDraftMessageByParentId", "Ljava/util/Date;", "hideMessagesBefore", "deleteChannelMessagesBefore", "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "deleteChannelMessages", "deleteChannelMessage", "deleteMessages", "Lio/getstream/chat/android/models/SyncStatus;", "syncStatus", "selectMessageIdsBySyncState", "(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;", "selectMessageBySyncState", "pollId", "selectMessagesWithPoll", "evictMessage", "evictMessages", "deletePoll", "clear", "selectLocalOnlyMessagesForChannel", "selectRepliedMessage", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;", "selectMessagesEntitiesForChannel", "fetchMessagesFromDB", "fetchMessageFromDB", "updateCache", "(Lio/getstream/chat/android/models/Message;)V", "toMessage", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Poll;", "getPoll", "filterReactions", "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;", "Lbc3/c0;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;", "Lc93/m;", "Lio/getstream/chat/android/models/User;", "Ljava/util/Set;", "La0/a0;", "messageCache", "La0/a0;", "replyMessageCache", "", "deletedMessageIds", "Lmc3/a;", "dbMutex", "Lmc3/a;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DatabaseMessageRepository implements MessageRepository {
    private static final Companion Companion = new Companion();
    private static final int DEFAULT_MESSAGE_LIMIT = 100;
    private final User currentUser;
    private final InterfaceC25435a dbMutex;
    private final Set<String> deletedMessageIds;
    private final InterfaceC4351m getUser;
    private final Set<String> ignoredChannelTypes;
    private final C0005a0 messageCache;
    private final MessageDao messageDao;
    private final PollDao pollDao;
    private final C0005a0 replyMessageCache;
    private final ReplyMessageDao replyMessageDao;
    private final InterfaceC2994c0 scope;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$Companion;", "", "<init>", "()V", "DEFAULT_MESSAGE_LIMIT", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Pagination.values().length];
            try {
                iArr[Pagination.GREATER_THAN_OR_EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pagination.GREATER_THAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Pagination.LESS_THAN_OR_EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Pagination.LESS_THAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Pagination.AROUND_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$clear$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {358, 262, 263, 264}, m100432m = "clear")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191551 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C191551(InterfaceC30057d<? super C191551> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.clear(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$deleteChannelMessage$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$deleteChannelMessage$2", m100430f = "DatabaseMessageRepository.kt", m100431l = {210}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C191562 extends AbstractC32275i implements Function1 {
        final /* synthetic */ Message $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191562(Message message, InterfaceC30057d<? super C191562> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$message = message;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return DatabaseMessageRepository.this.new C191562(this.$message, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MessageDao messageDao = DatabaseMessageRepository.this.messageDao;
                String cid = this.$message.getCid();
                String id4 = this.$message.getId();
                this.label = 1;
                if (messageDao.deleteMessage(cid, id4, this) == enumC31071a) {
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
            return ((C191562) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$deleteChannelMessages$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$deleteChannelMessages$2", m100430f = "DatabaseMessageRepository.kt", m100431l = {199}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C191572 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $cid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191572(String str, InterfaceC30057d<? super C191572> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$cid = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return DatabaseMessageRepository.this.new C191572(this.$cid, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MessageDao messageDao = DatabaseMessageRepository.this.messageDao;
                String str = this.$cid;
                this.label = 1;
                if (messageDao.deleteMessages(str, this) == enumC31071a) {
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
            return ((C191572) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$deleteChannelMessagesBefore$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$deleteChannelMessagesBefore$2", m100430f = "DatabaseMessageRepository.kt", m100431l = {193}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C191582 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $cid;
        final /* synthetic */ Date $hideMessagesBefore;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191582(String str, Date date, InterfaceC30057d<? super C191582> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$cid = str;
            this.$hideMessagesBefore = date;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return DatabaseMessageRepository.this.new C191582(this.$cid, this.$hideMessagesBefore, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MessageDao messageDao = DatabaseMessageRepository.this.messageDao;
                String str = this.$cid;
                Date date = this.$hideMessagesBefore;
                this.label = 1;
                if (messageDao.deleteChannelMessagesBefore(str, date, this) == enumC31071a) {
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
            return ((C191582) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$deleteMessages$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$deleteMessages$3", m100430f = "DatabaseMessageRepository.kt", m100431l = {220}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C191593 extends AbstractC32275i implements Function1 {
        final /* synthetic */ List<String> $ids;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191593(List<String> list, InterfaceC30057d<? super C191593> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$ids = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return DatabaseMessageRepository.this.new C191593(this.$ids, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MessageDao messageDao = DatabaseMessageRepository.this.messageDao;
                List<String> list = this.$ids;
                this.label = 1;
                if (messageDao.deleteMessages(list, this) == enumC31071a) {
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
            return ((C191593) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$fetchMessageFromDB$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {321, 322}, m100432m = "fetchMessageFromDB")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191601 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C191601(InterfaceC30057d<? super C191601> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.fetchMessageFromDB(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$fetchMessagesFromDB$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {313, 315}, m100432m = "fetchMessagesFromDB")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191611 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C191611(InterfaceC30057d<? super C191611> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.fetchMessagesFromDB(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$getPoll$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {335, 335}, m100432m = "getPoll")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191621 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C191621(InterfaceC30057d<? super C191621> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.getPoll(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$insertDraftMessage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {167, DateTimeConstants.HOURS_PER_WEEK}, m100432m = "insertDraftMessage")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191631 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C191631(InterfaceC30057d<? super C191631> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.insertDraftMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$insertMessages$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {145, 149}, m100432m = "insertMessages")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191641 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C191641(InterfaceC30057d<? super C191641> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.insertMessages(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$insertMessages$9 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$insertMessages$9", m100430f = "DatabaseMessageRepository.kt", m100431l = {151, 153}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C191659 extends AbstractC32275i implements Function1 {
        final /* synthetic */ List<MessageEntity> $messagesToInsert;
        final /* synthetic */ List<ReplyMessageEntity> $replyMessagesToInsert;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ DatabaseMessageRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191659(List<ReplyMessageEntity> list, List<MessageEntity> list2, DatabaseMessageRepository databaseMessageRepository, InterfaceC30057d<? super C191659> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$replyMessagesToInsert = list;
            this.$messagesToInsert = list2;
            this.this$0 = databaseMessageRepository;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new C191659(this.$replyMessagesToInsert, this.$messagesToInsert, this.this$0, interfaceC30057d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        
            if (r1.insert(r7, r6) == r0) goto L25;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.label
                r2 = 0
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L26
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L16
                java.lang.Object r0 = r6.L$0
                java.util.List r0 = (java.util.List) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L67
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.L$0
                java.util.List r1 = (java.util.List) r1
                p505ts.AbstractC34132o.m107864I(r7)
                goto L48
            L26:
                p505ts.AbstractC34132o.m107864I(r7)
                java.util.List<io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageEntity> r7 = r6.$replyMessagesToInsert
                boolean r1 = r7.isEmpty()
                if (r1 != 0) goto L32
                goto L33
            L32:
                r7 = r5
            L33:
                if (r7 == 0) goto L48
                io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository r1 = r6.this$0
                io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao r1 = io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.access$getReplyMessageDao$p(r1)
                r6.L$0 = r5
                r6.I$0 = r2
                r6.label = r4
                java.lang.Object r7 = r1.insert(r7, r6)
                if (r7 != r0) goto L48
                goto L66
            L48:
                java.util.List<io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity> r7 = r6.$messagesToInsert
                boolean r1 = r7.isEmpty()
                if (r1 != 0) goto L51
                goto L52
            L51:
                r7 = r5
            L52:
                if (r7 == 0) goto L67
                io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository r1 = r6.this$0
                io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao r1 = io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.access$getMessageDao$p(r1)
                r6.L$0 = r5
                r6.I$0 = r2
                r6.label = r3
                java.lang.Object r7 = r1.insert(r7, r6)
                if (r7 != r0) goto L67
            L66:
                return r0
            L67:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191659.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C191659) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectAllChannelUserMessages$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {84, 85}, m100432m = "selectAllChannelUserMessages")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191661 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public C191661(InterfaceC30057d<? super C191661> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.selectAllChannelUserMessages(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectAllUserMessages$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {80, 81}, m100432m = "selectAllUserMessages")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191671 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C191671(InterfaceC30057d<? super C191671> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.selectAllUserMessages(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessageByParentId$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {182, 182}, m100432m = "selectDraftMessageByParentId")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191681 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C191681(InterfaceC30057d<? super C191681> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.selectDraftMessageByParentId(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessageByParentId$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C191692 extends C22672i implements InterfaceC4351m {
        public C191692(Object obj) {
            super(2, 0, DatabaseMessageRepository.class, obj, "selectMessage", "selectMessage(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super Message> interfaceC30057d) {
            return ((DatabaseMessageRepository) this.receiver).selectMessage(str, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessages$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {175, 176}, m100432m = "selectDraftMessages")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191701 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C191701(InterfaceC30057d<? super C191701> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.selectDraftMessages(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessagesByCid$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {178, 179}, m100432m = "selectDraftMessagesByCid")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191711 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C191711(InterfaceC30057d<? super C191711> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.selectDraftMessagesByCid(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessagesByCid$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C191722 extends C22672i implements InterfaceC4351m {
        public C191722(Object obj) {
            super(2, 0, DatabaseMessageRepository.class, obj, "selectMessage", "selectMessage(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super Message> interfaceC30057d) {
            return ((DatabaseMessageRepository) this.receiver).selectMessage(str, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {269, 273}, m100432m = "selectLocalOnlyMessagesForChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191731 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C191731(InterfaceC30057d<? super C191731> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.selectLocalOnlyMessagesForChannel(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessageBySyncState$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {238, 238}, m100432m = "selectMessageBySyncState")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191741 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C191741(InterfaceC30057d<? super C191741> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.selectMessageBySyncState(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessages$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {105}, m100432m = "selectMessages")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191751 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C191751(InterfaceC30057d<? super C191751> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.selectMessages(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessagesEntitiesForChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {282, 289, 293, 297, 301, 307}, m100432m = "selectMessagesEntitiesForChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191761 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C191761(InterfaceC30057d<? super C191761> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.selectMessagesEntitiesForChannel(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessagesForChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {66, 67}, m100432m = "selectMessagesForChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191771 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public C191771(InterfaceC30057d<? super C191771> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.selectMessagesForChannel(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessagesForThread$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {76, 77}, m100432m = "selectMessagesForThread")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191781 extends AbstractC32269c {
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
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C191781(InterfaceC30057d<? super C191781> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.selectMessagesForThread(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessagesWithPoll$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {242, 242}, m100432m = "selectMessagesWithPoll")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191791 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C191791(InterfaceC30057d<? super C191791> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.selectMessagesWithPoll(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectRepliedMessage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {88, 88}, m100432m = "selectRepliedMessage")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191801 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C191801(InterfaceC30057d<? super C191801> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.selectRepliedMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectRepliedMessage$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C191812 extends C22672i implements InterfaceC4351m {
        public C191812(Object obj) {
            super(2, 0, DatabaseMessageRepository.class, obj, "getPoll", "getPoll(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super Poll> interfaceC30057d) {
            return ((DatabaseMessageRepository) this.receiver).getPoll(str, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$toMessage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository", m100430f = "DatabaseMessageRepository.kt", m100431l = {332}, m100432m = "toMessage")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191821 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C191821(InterfaceC30057d<? super C191821> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseMessageRepository.this.toMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$toMessage$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C191832 extends C22672i implements InterfaceC4351m {
        public C191832(Object obj) {
            super(2, 0, DatabaseMessageRepository.class, obj, "selectRepliedMessage", "selectRepliedMessage(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super Message> interfaceC30057d) {
            return ((DatabaseMessageRepository) this.receiver).selectRepliedMessage(str, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$toMessage$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C191843 extends C22672i implements InterfaceC4351m {
        public C191843(Object obj) {
            super(2, 0, DatabaseMessageRepository.class, obj, "getPoll", "getPoll(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super Poll> interfaceC30057d) {
            return ((DatabaseMessageRepository) this.receiver).getPoll(str, interfaceC30057d);
        }
    }

    public DatabaseMessageRepository(InterfaceC2994c0 scope, MessageDao messageDao, ReplyMessageDao replyMessageDao, PollDao pollDao, InterfaceC4351m getUser, User currentUser, Set<String> ignoredChannelTypes, int i13) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(messageDao, "messageDao");
        AbstractC22676k.m65750j(replyMessageDao, "replyMessageDao");
        AbstractC22676k.m65750j(pollDao, "pollDao");
        AbstractC22676k.m65750j(getUser, "getUser");
        AbstractC22676k.m65750j(currentUser, "currentUser");
        AbstractC22676k.m65750j(ignoredChannelTypes, "ignoredChannelTypes");
        this.scope = scope;
        this.messageDao = messageDao;
        this.replyMessageDao = replyMessageDao;
        this.pollDao = pollDao;
        this.getUser = getUser;
        this.currentUser = currentUser;
        this.ignoredChannelTypes = ignoredChannelTypes;
        this.messageCache = new C0005a0(i13);
        this.replyMessageCache = new C0005a0(i13);
        this.deletedMessageIds = new LinkedHashSet();
        this.dbMutex = AbstractC25438d.m74669a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r8 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchMessageFromDB(java.lang.String r7, q83.InterfaceC30057d<? super io.getstream.chat.android.models.Message> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191601
            if (r0 == 0) goto L13
            r0 = r8
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$fetchMessageFromDB$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191601) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$fetchMessageFromDB$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$fetchMessageFromDB$1
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
            goto L5e
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L4f
        L3f:
            p505ts.AbstractC34132o.m107864I(r8)
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao r8 = r6.messageDao
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r8 = r8.select(r7, r0)
            if (r8 != r1) goto L4f
            goto L5d
        L4f:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity r8 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity) r8
            if (r8 == 0) goto L66
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r8 = r6.toMessage(r8, r0)
            if (r8 != r1) goto L5e
        L5d:
            return r1
        L5e:
            io.getstream.chat.android.models.Message r8 = (io.getstream.chat.android.models.Message) r8
            if (r8 == 0) goto L66
            r6.updateCache(r8)
            return r8
        L66:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.fetchMessageFromDB(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ac -> B:26:0x00ad). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object fetchMessagesFromDB(java.util.List<java.lang.String> r11, q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.models.Message>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191611
            if (r0 == 0) goto L13
            r0 = r12
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$fetchMessagesFromDB$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191611) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$fetchMessagesFromDB$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$fetchMessagesFromDB$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L5c
            if (r2 == r4) goto L54
            if (r2 != r3) goto L4c
            int r11 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$7
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r7 = r0.L$6
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity r7 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity) r7
            java.lang.Object r7 = r0.L$4
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$3
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r9 = r0.L$2
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r9 = r0.L$1
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r9 = r0.L$0
            java.util.List r9 = (java.util.List) r9
            p505ts.AbstractC34132o.m107864I(r12)
            goto Lad
        L4c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L54:
            java.lang.Object r11 = r0.L$0
            java.util.List r11 = (java.util.List) r11
            p505ts.AbstractC34132o.m107864I(r12)
            goto L6c
        L5c:
            p505ts.AbstractC34132o.m107864I(r12)
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao r12 = r10.messageDao
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r12 = r12.select(r11, r0)
            if (r12 != r1) goto L6c
            goto Lab
        L6c:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r11 = new java.util.ArrayList
            r2 = 10
            int r2 = m83.AbstractC25267u.m74163i0(r12, r2)
            r11.<init>(r2)
            java.util.Iterator r12 = r12.iterator()
            r4 = r11
            r7 = r12
            r11 = r5
            r2 = r11
        L81:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto Lb7
            java.lang.Object r12 = r7.next()
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity r12 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity) r12
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.L$3 = r4
            r0.L$4 = r7
            r0.L$5 = r6
            r0.L$6 = r6
            r0.L$7 = r4
            r0.I$0 = r2
            r0.I$1 = r11
            r0.I$2 = r5
            r0.label = r3
            java.lang.Object r12 = r10.toMessage(r12, r0)
            if (r12 != r1) goto Lac
        Lab:
            return r1
        Lac:
            r8 = r4
        Lad:
            io.getstream.chat.android.models.Message r12 = (io.getstream.chat.android.models.Message) r12
            r10.updateCache(r12)
            r4.add(r12)
            r4 = r8
            goto L81
        Lb7:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.fetchMessagesFromDB(java.util.List, q83.d):java.lang.Object");
    }

    private final Message filterReactions(Message message) {
        List<Reaction> ownReactions = message.getOwnReactions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : ownReactions) {
            if (((Reaction) obj).getDeletedAt() == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            Reaction reaction = (Reaction) obj2;
            if (this.currentUser == null || AbstractC22676k.m65745e(reaction.getUserId(), this.currentUser.getId())) {
                arrayList2.add(obj2);
            }
        }
        List<Reaction> latestReactions = message.getLatestReactions();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : latestReactions) {
            if (((Reaction) obj3).getDeletedAt() == null) {
                arrayList3.add(obj3);
            }
        }
        return message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : arrayList3, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : arrayList2, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r8 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getPoll(java.lang.String r7, q83.InterfaceC30057d<? super io.getstream.chat.android.models.Poll> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191621
            if (r0 == 0) goto L13
            r0 = r8
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$getPoll$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191621) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$getPoll$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$getPoll$1
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
            goto L60
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L4f
        L3f:
            p505ts.AbstractC34132o.m107864I(r8)
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollDao r8 = r6.pollDao
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r8 = r8.getPoll(r7, r0)
            if (r8 != r1) goto L4f
            goto L5f
        L4f:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollEntity r8 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollEntity) r8
            if (r8 == 0) goto L63
            c93.m r7 = r6.getUser
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r8 = io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollsMapperKt.toModel(r8, r7, r0)
            if (r8 != r1) goto L60
        L5f:
            return r1
        L60:
            io.getstream.chat.android.models.Poll r8 = (io.getstream.chat.android.models.Poll) r8
            return r8
        L63:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.getPoll(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:61:0x0104 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0105  */
    /* JADX WARN: Code duplicated, block: B:65:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object selectMessagesEntitiesForChannel(String str, AnyChannelPaginationRequest anyChannelPaginationRequest, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        C191761 c191761;
        String str2;
        Pagination pagination;
        MessageEntity messageEntity;
        Date createdAt;
        C25271y c25271y;
        int messageLimit;
        Date createdAt2;
        int i13;
        Object objMessagesForChannelEqualOrNewerThan;
        Object objMessagesForChannelNewerThan;
        Object objMessagesForChannelEqualOrOlderThan;
        Object objMessagesForChannelOlderThan;
        MessageInnerEntity messageInnerEntity;
        if (interfaceC30057d instanceof C191761) {
            c191761 = (C191761) interfaceC30057d;
            int i14 = c191761.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c191761.label = i14 - Integer.MIN_VALUE;
            } else {
                c191761 = new C191761(interfaceC30057d);
            }
        } else {
            c191761 = new C191761(interfaceC30057d);
        }
        Object obj = c191761.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        switch (c191761.label) {
            case 0:
                AbstractC34132o.m107864I(obj);
                Pagination messageFilterDirection = anyChannelPaginationRequest != null ? anyChannelPaginationRequest.getMessageFilterDirection() : null;
                if (messageFilterDirection != null) {
                    MessageDao messageDao = this.messageDao;
                    String messageFilterValue = anyChannelPaginationRequest.getMessageFilterValue();
                    c191761.L$0 = str;
                    c191761.L$1 = anyChannelPaginationRequest;
                    c191761.L$2 = messageFilterDirection;
                    c191761.label = 1;
                    Object objSelect = messageDao.select(messageFilterValue, c191761);
                    if (objSelect != enumC31071a) {
                        str2 = str;
                        pagination = messageFilterDirection;
                        obj = objSelect;
                        messageEntity = (MessageEntity) obj;
                        if (messageEntity != null || (messageInnerEntity = messageEntity.getMessageInnerEntity()) == null) {
                            createdAt = null;
                        } else {
                            createdAt = messageInnerEntity.getCreatedAt();
                        }
                        c25271y = C25271y.f99162w;
                        if (createdAt == null) {
                            return c25271y;
                        }
                        messageLimit = anyChannelPaginationRequest.getMessageLimit();
                        createdAt2 = messageEntity.getMessageInnerEntity().getCreatedAt();
                        if (pagination == null) {
                            i13 = -1;
                        } else {
                            i13 = WhenMappings.$EnumSwitchMapping$0[pagination.ordinal()];
                        }
                        if (i13 != 1) {
                            MessageDao messageDao2 = this.messageDao;
                            c191761.L$0 = null;
                            c191761.L$1 = null;
                            c191761.L$2 = null;
                            c191761.L$3 = null;
                            c191761.L$4 = null;
                            c191761.I$0 = messageLimit;
                            c191761.label = 2;
                            objMessagesForChannelEqualOrNewerThan = messageDao2.messagesForChannelEqualOrNewerThan(str2, messageLimit, createdAt2, c191761);
                            if (objMessagesForChannelEqualOrNewerThan == enumC31071a) {
                                return objMessagesForChannelEqualOrNewerThan;
                            }
                        } else if (i13 != 2) {
                            MessageDao messageDao3 = this.messageDao;
                            c191761.L$0 = null;
                            c191761.L$1 = null;
                            c191761.L$2 = null;
                            c191761.L$3 = null;
                            c191761.L$4 = null;
                            c191761.I$0 = messageLimit;
                            c191761.label = 3;
                            objMessagesForChannelNewerThan = messageDao3.messagesForChannelNewerThan(str2, messageLimit, createdAt2, c191761);
                            if (objMessagesForChannelNewerThan == enumC31071a) {
                                return objMessagesForChannelNewerThan;
                            }
                        } else if (i13 != 3) {
                            MessageDao messageDao4 = this.messageDao;
                            c191761.L$0 = null;
                            c191761.L$1 = null;
                            c191761.L$2 = null;
                            c191761.L$3 = null;
                            c191761.L$4 = null;
                            c191761.I$0 = messageLimit;
                            c191761.label = 4;
                            objMessagesForChannelEqualOrOlderThan = messageDao4.messagesForChannelEqualOrOlderThan(str2, messageLimit, createdAt2, c191761);
                            if (objMessagesForChannelEqualOrOlderThan == enumC31071a) {
                                return objMessagesForChannelEqualOrOlderThan;
                            }
                        } else {
                            if (i13 != 4) {
                                if (i13 == 5) {
                                    return c25271y;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            MessageDao messageDao5 = this.messageDao;
                            c191761.L$0 = null;
                            c191761.L$1 = null;
                            c191761.L$2 = null;
                            c191761.L$3 = null;
                            c191761.L$4 = null;
                            c191761.I$0 = messageLimit;
                            c191761.label = 5;
                            objMessagesForChannelOlderThan = messageDao5.messagesForChannelOlderThan(str2, messageLimit, createdAt2, c191761);
                            if (objMessagesForChannelOlderThan == enumC31071a) {
                                return objMessagesForChannelOlderThan;
                            }
                        }
                    }
                } else {
                    MessageDao messageDao6 = this.messageDao;
                    int messageLimit2 = anyChannelPaginationRequest != null ? anyChannelPaginationRequest.getMessageLimit() : 100;
                    c191761.L$0 = null;
                    c191761.L$1 = null;
                    c191761.L$2 = null;
                    c191761.label = 6;
                    Object objMessagesForChannel = messageDao6.messagesForChannel(str, messageLimit2, c191761);
                    if (objMessagesForChannel != enumC31071a) {
                        return objMessagesForChannel;
                    }
                }
                return enumC31071a;
            case 1:
                pagination = (Pagination) c191761.L$2;
                anyChannelPaginationRequest = (AnyChannelPaginationRequest) c191761.L$1;
                str2 = (String) c191761.L$0;
                AbstractC34132o.m107864I(obj);
                messageEntity = (MessageEntity) obj;
                if (messageEntity != null) {
                    createdAt = null;
                } else {
                    createdAt = null;
                }
                c25271y = C25271y.f99162w;
                if (createdAt == null) {
                    return c25271y;
                }
                messageLimit = anyChannelPaginationRequest.getMessageLimit();
                createdAt2 = messageEntity.getMessageInnerEntity().getCreatedAt();
                if (pagination == null) {
                    i13 = -1;
                } else {
                    i13 = WhenMappings.$EnumSwitchMapping$0[pagination.ordinal()];
                }
                if (i13 != 1) {
                    MessageDao messageDao7 = this.messageDao;
                    c191761.L$0 = null;
                    c191761.L$1 = null;
                    c191761.L$2 = null;
                    c191761.L$3 = null;
                    c191761.L$4 = null;
                    c191761.I$0 = messageLimit;
                    c191761.label = 2;
                    objMessagesForChannelEqualOrNewerThan = messageDao7.messagesForChannelEqualOrNewerThan(str2, messageLimit, createdAt2, c191761);
                    if (objMessagesForChannelEqualOrNewerThan == enumC31071a) {
                        return objMessagesForChannelEqualOrNewerThan;
                    }
                } else if (i13 != 2) {
                    MessageDao messageDao8 = this.messageDao;
                    c191761.L$0 = null;
                    c191761.L$1 = null;
                    c191761.L$2 = null;
                    c191761.L$3 = null;
                    c191761.L$4 = null;
                    c191761.I$0 = messageLimit;
                    c191761.label = 3;
                    objMessagesForChannelNewerThan = messageDao8.messagesForChannelNewerThan(str2, messageLimit, createdAt2, c191761);
                    if (objMessagesForChannelNewerThan == enumC31071a) {
                        return objMessagesForChannelNewerThan;
                    }
                } else if (i13 != 3) {
                    MessageDao messageDao9 = this.messageDao;
                    c191761.L$0 = null;
                    c191761.L$1 = null;
                    c191761.L$2 = null;
                    c191761.L$3 = null;
                    c191761.L$4 = null;
                    c191761.I$0 = messageLimit;
                    c191761.label = 4;
                    objMessagesForChannelEqualOrOlderThan = messageDao9.messagesForChannelEqualOrOlderThan(str2, messageLimit, createdAt2, c191761);
                    if (objMessagesForChannelEqualOrOlderThan == enumC31071a) {
                        return objMessagesForChannelEqualOrOlderThan;
                    }
                } else {
                    if (i13 != 4) {
                        if (i13 == 5) {
                            return c25271y;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    MessageDao messageDao10 = this.messageDao;
                    c191761.L$0 = null;
                    c191761.L$1 = null;
                    c191761.L$2 = null;
                    c191761.L$3 = null;
                    c191761.L$4 = null;
                    c191761.I$0 = messageLimit;
                    c191761.label = 5;
                    objMessagesForChannelOlderThan = messageDao10.messagesForChannelOlderThan(str2, messageLimit, createdAt2, c191761);
                    if (objMessagesForChannelOlderThan == enumC31071a) {
                        return objMessagesForChannelOlderThan;
                    }
                }
                return enumC31071a;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AbstractC34132o.m107864I(obj);
                return obj;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r8 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object selectRepliedMessage(java.lang.String r7, q83.InterfaceC30057d<? super io.getstream.chat.android.models.Message> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191801
            if (r0 == 0) goto L13
            r0 = r8
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectRepliedMessage$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191801) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectRepliedMessage$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectRepliedMessage$1
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
            goto L6f
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
            a0.a0 r8 = r6.replyMessageCache
            java.lang.Object r8 = r8.m2c(r7)
            io.getstream.chat.android.models.Message r8 = (io.getstream.chat.android.models.Message) r8
            if (r8 != 0) goto L73
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao r8 = r6.replyMessageDao
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r8 = r8.selectById(r7, r0)
            if (r8 != r1) goto L59
            goto L6e
        L59:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageEntity r8 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageEntity) r8
            if (r8 == 0) goto L72
            c93.m r7 = r6.getUser
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectRepliedMessage$2 r2 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectRepliedMessage$2
            r2.<init>(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r8 = io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageMapperKt.toModel(r8, r7, r2, r0)
            if (r8 != r1) goto L6f
        L6e:
            return r1
        L6f:
            io.getstream.chat.android.models.Message r8 = (io.getstream.chat.android.models.Message) r8
            return r8
        L72:
            return r5
        L73:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.selectRepliedMessage(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object toMessage(MessageEntity messageEntity, InterfaceC30057d<? super Message> interfaceC30057d) {
        C191821 c191821;
        DatabaseMessageRepository databaseMessageRepository;
        if (interfaceC30057d instanceof C191821) {
            c191821 = (C191821) interfaceC30057d;
            int i13 = c191821.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191821.label = i13 - Integer.MIN_VALUE;
            } else {
                c191821 = new C191821(interfaceC30057d);
            }
        } else {
            c191821 = new C191821(interfaceC30057d);
        }
        Object model = c191821.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c191821.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(model);
            InterfaceC4351m interfaceC4351m = this.getUser;
            C191832 c191832 = new C191832(this);
            C191843 c191843 = new C191843(this);
            c191821.L$0 = null;
            c191821.L$1 = this;
            c191821.label = 1;
            model = MessageMapperKt.toModel(messageEntity, interfaceC4351m, c191832, c191843, c191821);
            if (model == enumC31071a) {
                return enumC31071a;
            }
            databaseMessageRepository = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            databaseMessageRepository = (DatabaseMessageRepository) c191821.L$1;
            AbstractC34132o.m107864I(model);
        }
        return databaseMessageRepository.filterReactions((Message) model);
    }

    private final void updateCache(Message message) {
        this.messageCache.m3d(message.getId(), message);
        if (!MessageUtils.isDeleted(message)) {
            message = null;
        }
        if (message != null) {
            this.deletedMessageIds.add(message.getId());
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6 A[Catch: all -> 0x00ce, PHI: r2 r3 r11
      0x00b6: PHI (r2v7 int) = (r2v6 int), (r2v11 int) binds: [B:41:0x00b3, B:23:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r3v3 int) = (r3v2 int), (r3v6 int) binds: [B:41:0x00b3, B:23:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x00b6: PHI (r11v9 mc3.a) = (r11v6 mc3.a), (r11v17 mc3.a) binds: [B:41:0x00b3, B:23:0x004d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x00ce, blocks: (B:43:0x00b6, B:40:0x00a5, B:36:0x0091), top: B:59:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C191551 c191551;
        InterfaceC25435a interfaceC25435a;
        int i13;
        int i14;
        int i15;
        MessageDao messageDao;
        InterfaceC25435a interfaceC25435a2;
        Throwable th3;
        ReplyMessageDao replyMessageDao;
        if (interfaceC30057d instanceof C191551) {
            c191551 = (C191551) interfaceC30057d;
            int i16 = c191551.label;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                c191551.label = i16 - Integer.MIN_VALUE;
            } else {
                c191551 = new C191551(interfaceC30057d);
            }
        } else {
            c191551 = new C191551(interfaceC30057d);
        }
        Object obj = c191551.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i17 = c191551.label;
        try {
            if (i17 == 0) {
                AbstractC34132o.m107864I(obj);
                this.messageCache.m8i(-1);
                this.replyMessageCache.m8i(-1);
                interfaceC25435a = this.dbMutex;
                c191551.L$0 = interfaceC25435a;
                c191551.I$0 = 0;
                c191551.label = 1;
                if (interfaceC25435a.mo68211b(c191551) != enumC31071a) {
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i17 != 1) {
                if (i17 == 2) {
                    int i18 = c191551.I$1;
                    int i19 = c191551.I$0;
                    InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) c191551.L$0;
                    try {
                        AbstractC34132o.m107864I(obj);
                        i14 = i19;
                        i15 = i18;
                        interfaceC25435a = interfaceC25435a3;
                        messageDao = this.messageDao;
                        c191551.L$0 = interfaceC25435a;
                        c191551.I$0 = i14;
                        c191551.I$1 = i15;
                        c191551.label = 3;
                        if (messageDao.deleteAllDrafts(c191551) == enumC31071a) {
                            replyMessageDao = this.replyMessageDao;
                            c191551.L$0 = interfaceC25435a;
                            c191551.I$0 = i14;
                            c191551.I$1 = i15;
                            c191551.label = 4;
                            if (replyMessageDao.deleteAll(c191551) != enumC31071a) {
                                interfaceC25435a2 = interfaceC25435a;
                            }
                        }
                        return enumC31071a;
                    } catch (Throwable th4) {
                        th3 = th4;
                        interfaceC25435a2 = interfaceC25435a3;
                    }
                } else if (i17 == 3) {
                    i15 = c191551.I$1;
                    i14 = c191551.I$0;
                    InterfaceC25435a interfaceC25435a4 = (InterfaceC25435a) c191551.L$0;
                    try {
                        AbstractC34132o.m107864I(obj);
                        interfaceC25435a = interfaceC25435a4;
                        replyMessageDao = this.replyMessageDao;
                        c191551.L$0 = interfaceC25435a;
                        c191551.I$0 = i14;
                        c191551.I$1 = i15;
                        c191551.label = 4;
                        if (replyMessageDao.deleteAll(c191551) != enumC31071a) {
                            interfaceC25435a2 = interfaceC25435a;
                        }
                        return enumC31071a;
                    } catch (Throwable th5) {
                        th3 = th5;
                        interfaceC25435a2 = interfaceC25435a4;
                    }
                } else {
                    if (i17 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC25435a2 = (InterfaceC25435a) c191551.L$0;
                    try {
                        AbstractC34132o.m107864I(obj);
                    } catch (Throwable th6) {
                        th3 = th6;
                    }
                }
                interfaceC25435a2.mo68214i(null);
                throw th3;
            }
            i13 = c191551.I$0;
            InterfaceC25435a interfaceC25435a5 = (InterfaceC25435a) c191551.L$0;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a5;
            interfaceC25435a2.mo68214i(null);
            return C23454a0.f92919a;
            MessageDao messageDao2 = this.messageDao;
            c191551.L$0 = interfaceC25435a;
            c191551.I$0 = i13;
            c191551.I$1 = 0;
            c191551.label = 2;
            if (messageDao2.deleteAll(c191551) != enumC31071a) {
                i14 = i13;
                i15 = 0;
                messageDao = this.messageDao;
                c191551.L$0 = interfaceC25435a;
                c191551.I$0 = i14;
                c191551.I$1 = i15;
                c191551.label = 3;
                if (messageDao.deleteAllDrafts(c191551) == enumC31071a) {
                    replyMessageDao = this.replyMessageDao;
                    c191551.L$0 = interfaceC25435a;
                    c191551.I$0 = i14;
                    c191551.I$1 = i15;
                    c191551.label = 4;
                    if (replyMessageDao.deleteAll(c191551) != enumC31071a) {
                        interfaceC25435a2 = interfaceC25435a;
                        interfaceC25435a2.mo68214i(null);
                        return C23454a0.f92919a;
                    }
                }
            }
            return enumC31071a;
        } catch (Throwable th7) {
            interfaceC25435a2 = interfaceC25435a;
            th3 = th7;
        }
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deleteChannelMessage(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.deletedMessageIds.add(message.getId());
        this.messageCache.m4e(message.getId());
        Object objLaunchWithMutex = CoroutineScopeExtensionsKt.launchWithMutex(this.scope, this.dbMutex, new C191562(message, null), interfaceC30057d);
        return objLaunchWithMutex == EnumC31071a.f128113w ? objLaunchWithMutex : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deleteChannelMessages(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.messageCache.m8i(-1);
        this.replyMessageCache.m8i(-1);
        Object objLaunchWithMutex = CoroutineScopeExtensionsKt.launchWithMutex(this.scope, this.dbMutex, new C191572(str, null), interfaceC30057d);
        return objLaunchWithMutex == EnumC31071a.f128113w ? objLaunchWithMutex : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deleteChannelMessagesBefore(String str, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.messageCache.m8i(-1);
        this.replyMessageCache.m8i(-1);
        Object objLaunchWithMutex = CoroutineScopeExtensionsKt.launchWithMutex(this.scope, this.dbMutex, new C191582(str, date, null), interfaceC30057d);
        return objLaunchWithMutex == EnumC31071a.f128113w ? objLaunchWithMutex : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deleteDraftMessage(DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objDeleteDraftMessage = this.messageDao.deleteDraftMessage(draftMessage.getId(), interfaceC30057d);
        return objDeleteDraftMessage == EnumC31071a.f128113w ? objDeleteDraftMessage : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deleteMessages(List<Message> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        List<Message> list2 = list;
        ArrayList<String> arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Message) it.next()).getId());
        }
        for (String str : arrayList) {
            this.deletedMessageIds.add(str);
            this.messageCache.m4e(str);
            this.replyMessageCache.m4e(str);
        }
        Object objLaunchWithMutex = CoroutineScopeExtensionsKt.launchWithMutex(this.scope, this.dbMutex, new C191593(arrayList, null), interfaceC30057d);
        return objLaunchWithMutex == EnumC31071a.f128113w ? objLaunchWithMutex : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deletePoll(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objDeletePoll = this.pollDao.deletePoll(str, interfaceC30057d);
        return objDeletePoll == EnumC31071a.f128113w ? objDeletePoll : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object evictMessage(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.messageCache.m4e(str);
        this.replyMessageCache.m4e(str);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object evictMessages(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.messageCache.m8i(-1);
        this.replyMessageCache.m8i(-1);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r8.insertDraftMessages(r7, r0) == r1) goto L23;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object insertDraftMessage(io.getstream.chat.android.models.DraftMessage r7, q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191631
            if (r0 == 0) goto L13
            r0 = r8
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$insertDraftMessage$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191631) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$insertDraftMessage$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$insertDraftMessage$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.L$0
            io.getstream.chat.android.models.DraftMessage r7 = (io.getstream.chat.android.models.DraftMessage) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L6f
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.L$1
            io.getstream.chat.android.models.Message r7 = (io.getstream.chat.android.models.Message) r7
            java.lang.Object r7 = r0.L$0
            io.getstream.chat.android.models.DraftMessage r7 = (io.getstream.chat.android.models.DraftMessage) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L5c
        L43:
            p505ts.AbstractC34132o.m107864I(r8)
            io.getstream.chat.android.models.Message r8 = r7.getReplyMessage()
            if (r8 == 0) goto L5c
            r0.L$0 = r7
            r0.L$1 = r5
            r2 = 0
            r0.I$0 = r2
            r0.label = r4
            java.lang.Object r8 = r6.insertMessage(r8, r0)
            if (r8 != r1) goto L5c
            goto L6e
        L5c:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao r8 = r6.messageDao
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DraftMessageEntity r7 = io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageMapperKt.toEntity(r7)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r7 = r8.insertDraftMessages(r7, r0)
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.insertDraftMessage(io.getstream.chat.android.models.DraftMessage, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object insertMessage(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objInsertMessages = insertMessages(AbstractC37056f.m118958J(message), interfaceC30057d);
        return objInsertMessages == EnumC31071a.f128113w ? objInsertMessages : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0270 A[LOOP:1: B:99:0x026a->B:101:0x0270, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:97:0x0254 A[LOOP:0: B:95:0x024e->B:97:0x0254, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object insertMessages(List<Message> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C191641 c191641;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        ?? r10;
        ?? r14;
        if (interfaceC30057d instanceof C191641) {
            c191641 = (C191641) interfaceC30057d;
            int i13 = c191641.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191641.label = i13 - Integer.MIN_VALUE;
            } else {
                c191641 = new C191641(interfaceC30057d);
            }
        } else {
            c191641 = new C191641(interfaceC30057d);
        }
        Object obj = c191641.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c191641.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!list.isEmpty()) {
                List<Message> list2 = list;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : list2) {
                    if (((Message) obj2).getCid().length() > 0) {
                        arrayList5.add(obj2);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : arrayList5) {
                    if (!this.ignoredChannelTypes.contains(AbstractC39414r.m125863I0(((Message) obj3).getCid(), ":"))) {
                        arrayList6.add(obj3);
                    }
                }
                arrayList = new ArrayList();
                for (Object obj4 : arrayList6) {
                    if (!this.deletedMessageIds.contains(((Message) obj4).getId())) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : arrayList) {
                    Message message = (Message) obj5;
                    if (!AbstractC22676k.m65745e(this.messageCache.m2c(message.getId()), message)) {
                        arrayList7.add(obj5);
                    }
                }
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList7, 10));
                Iterator it = arrayList7.iterator();
                while (it.hasNext()) {
                    arrayList2.add(MessageMapperKt.toEntity((Message) it.next()));
                }
                arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Message replyTo = ((Message) it3.next()).getReplyTo();
                    if (replyTo != null) {
                        arrayList3.add(replyTo);
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj6 : arrayList3) {
                    Message message2 = (Message) obj6;
                    if (!AbstractC22676k.m65745e(this.replyMessageCache.m2c(message2.getId()), message2)) {
                        arrayList8.add(obj6);
                    }
                }
                arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList8, 10));
                Iterator it4 = arrayList8.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(MessageMapperKt.toReplyEntity((Message) it4.next()));
                }
                ArrayList arrayList9 = new ArrayList();
                for (Object obj7 : arrayList) {
                    if (MessageUtils.isDeleted((Message) obj7)) {
                        arrayList9.add(obj7);
                    }
                }
                Set<String> set = this.deletedMessageIds;
                ArrayList arrayList10 = new ArrayList(AbstractC25267u.m74163i0(arrayList9, 10));
                Iterator it5 = arrayList9.iterator();
                while (it5.hasNext()) {
                    arrayList10.add(((Message) it5.next()).getId());
                }
                set.addAll(arrayList10);
                ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(arrayList3, list2);
                ArrayList arrayList11 = new ArrayList();
                Iterator it6 = arrayListM74129g1.iterator();
                while (it6.hasNext()) {
                    Poll poll = ((Message) it6.next()).getPoll();
                    PollEntity entity = poll != null ? PollsMapperKt.toEntity(poll) : null;
                    if (entity != null) {
                        arrayList11.add(entity);
                    }
                }
                if (arrayList11.isEmpty()) {
                    arrayList11 = null;
                }
                if (arrayList11 != null) {
                    PollDao pollDao = this.pollDao;
                    c191641.L$0 = null;
                    c191641.L$1 = arrayList;
                    c191641.L$2 = arrayList2;
                    c191641.L$3 = arrayList3;
                    c191641.L$4 = arrayList4;
                    c191641.L$5 = null;
                    c191641.I$0 = 0;
                    c191641.label = 1;
                    if (pollDao.insertPolls(arrayList11, c191641) != enumC31071a) {
                        r10 = arrayList3;
                        r14 = arrayList4;
                        arrayList2 = arrayList2;
                        arrayList = arrayList;
                    }
                } else {
                    for (Message message3 : (Iterable) arrayList3) {
                        this.replyMessageCache.m3d(message3.getId(), message3);
                    }
                    for (Message message4 : (Iterable) arrayList) {
                        this.messageCache.m3d(message4.getId(), message4);
                    }
                    InterfaceC2994c0 interfaceC2994c0 = this.scope;
                    InterfaceC25435a interfaceC25435a = this.dbMutex;
                    C191659 c191659 = new C191659(arrayList4, arrayList2, this, null);
                    c191641.L$0 = null;
                    c191641.L$1 = null;
                    c191641.L$2 = null;
                    c191641.L$3 = null;
                    c191641.L$4 = null;
                    c191641.L$5 = null;
                    c191641.label = 2;
                    if (CoroutineScopeExtensionsKt.launchWithMutex(interfaceC2994c0, interfaceC25435a, c191659, c191641) == enumC31071a) {
                    }
                }
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        List list3 = (List) c191641.L$4;
        List list4 = (List) c191641.L$3;
        List list5 = (List) c191641.L$2;
        List list6 = (List) c191641.L$1;
        AbstractC34132o.m107864I(obj);
        r14 = list3;
        r10 = list4;
        arrayList2 = list5;
        arrayList = list6;
        ?? r16 = r10;
        arrayList4 = r14;
        arrayList3 = r16;
        while (r1.hasNext()) {
            this.replyMessageCache.m3d(message3.getId(), message3);
        }
        while (r1.hasNext()) {
            this.messageCache.m3d(message4.getId(), message4);
        }
        InterfaceC2994c0 interfaceC2994c1 = this.scope;
        InterfaceC25435a interfaceC25435a2 = this.dbMutex;
        C191659 c1916510 = new C191659(arrayList4, arrayList2, this, null);
        c191641.L$0 = null;
        c191641.L$1 = null;
        c191641.L$2 = null;
        c191641.L$3 = null;
        c191641.L$4 = null;
        c191641.L$5 = null;
        c191641.label = 2;
        return CoroutineScopeExtensionsKt.launchWithMutex(interfaceC2994c1, interfaceC25435a2, c1916510, c191641) == enumC31071a ? enumC31071a : c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b8 -> B:26:0x00b9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final java.lang.Object selectAllChannelUserMessages(java.lang.String r10, java.lang.String r11, q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.models.Message>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191661
            if (r0 == 0) goto L13
            r0 = r12
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectAllChannelUserMessages$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191661) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectAllChannelUserMessages$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectAllChannelUserMessages$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L64
            if (r2 == r4) goto L58
            if (r2 != r3) goto L50
            int r10 = r0.I$1
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$8
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r4 = r0.L$7
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity r4 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity) r4
            java.lang.Object r4 = r0.L$5
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r7 = r0.L$4
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Object r8 = r0.L$3
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r8 = r0.L$2
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            p505ts.AbstractC34132o.m107864I(r12)
            goto Lb9
        L50:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L58:
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.L$0
            java.lang.String r10 = (java.lang.String) r10
            p505ts.AbstractC34132o.m107864I(r12)
            goto L76
        L64:
            p505ts.AbstractC34132o.m107864I(r12)
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao r12 = r9.messageDao
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r12 = r12.selectByCidAndUserId(r10, r11, r0)
            if (r12 != r1) goto L76
            goto Lb7
        L76:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = m83.AbstractC25267u.m74163i0(r12, r11)
            r10.<init>(r11)
            java.util.Iterator r11 = r12.iterator()
            r2 = r10
            r4 = r11
            r10 = r5
            r11 = r10
        L8b:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto Lc0
            java.lang.Object r12 = r4.next()
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity r12 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity) r12
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.L$3 = r6
            r0.L$4 = r2
            r0.L$5 = r4
            r0.L$6 = r6
            r0.L$7 = r6
            r0.L$8 = r2
            r0.I$0 = r11
            r0.I$1 = r10
            r0.I$2 = r5
            r0.label = r3
            java.lang.Object r12 = r9.toMessage(r12, r0)
            if (r12 != r1) goto Lb8
        Lb7:
            return r1
        Lb8:
            r7 = r2
        Lb9:
            io.getstream.chat.android.models.Message r12 = (io.getstream.chat.android.models.Message) r12
            r2.add(r12)
            r2 = r7
            goto L8b
        Lc0:
            java.util.List r2 = (java.util.List) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.selectAllChannelUserMessages(java.lang.String, java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ac -> B:26:0x00ad). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final java.lang.Object selectAllUserMessages(java.lang.String r11, q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.models.Message>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191671
            if (r0 == 0) goto L13
            r0 = r12
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectAllUserMessages$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191671) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectAllUserMessages$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectAllUserMessages$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L5c
            if (r2 == r4) goto L54
            if (r2 != r3) goto L4c
            int r11 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$7
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r7 = r0.L$6
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity r7 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity) r7
            java.lang.Object r7 = r0.L$4
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$3
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r9 = r0.L$2
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r9 = r0.L$1
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            p505ts.AbstractC34132o.m107864I(r12)
            goto Lad
        L4c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L54:
            java.lang.Object r11 = r0.L$0
            java.lang.String r11 = (java.lang.String) r11
            p505ts.AbstractC34132o.m107864I(r12)
            goto L6c
        L5c:
            p505ts.AbstractC34132o.m107864I(r12)
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao r12 = r10.messageDao
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r12 = r12.selectByUserId(r11, r0)
            if (r12 != r1) goto L6c
            goto Lab
        L6c:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r11 = new java.util.ArrayList
            r2 = 10
            int r2 = m83.AbstractC25267u.m74163i0(r12, r2)
            r11.<init>(r2)
            java.util.Iterator r12 = r12.iterator()
            r4 = r11
            r7 = r12
            r11 = r5
            r2 = r11
        L81:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto Lb4
            java.lang.Object r12 = r7.next()
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity r12 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity) r12
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.L$3 = r4
            r0.L$4 = r7
            r0.L$5 = r6
            r0.L$6 = r6
            r0.L$7 = r4
            r0.I$0 = r2
            r0.I$1 = r11
            r0.I$2 = r5
            r0.label = r3
            java.lang.Object r12 = r10.toMessage(r12, r0)
            if (r12 != r1) goto Lac
        Lab:
            return r1
        Lac:
            r8 = r4
        Lad:
            io.getstream.chat.android.models.Message r12 = (io.getstream.chat.android.models.Message) r12
            r4.add(r12)
            r4 = r8
            goto L81
        Lb4:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.selectAllUserMessages(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r8 == r1) goto L23;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object selectDraftMessageByParentId(java.lang.String r7, q83.InterfaceC30057d<? super io.getstream.chat.android.models.DraftMessage> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191681
            if (r0 == 0) goto L13
            r0 = r8
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessageByParentId$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191681) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessageByParentId$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessageByParentId$1
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
            goto L63
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L4f
        L3f:
            p505ts.AbstractC34132o.m107864I(r8)
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao r8 = r6.messageDao
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r8 = r8.selectDraftMessageByParentId(r7, r0)
            if (r8 != r1) goto L4f
            goto L62
        L4f:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DraftMessageEntity r8 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DraftMessageEntity) r8
            if (r8 == 0) goto L66
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessageByParentId$2 r7 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessageByParentId$2
            r7.<init>(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r8 = io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageMapperKt.toModel(r8, r7, r0)
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            io.getstream.chat.android.models.DraftMessage r8 = (io.getstream.chat.android.models.DraftMessage) r8
            return r8
        L66:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.selectDraftMessageByParentId(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a5 -> B:26:0x00a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final java.lang.Object selectDraftMessages(q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.models.DraftMessage>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191701
            if (r0 == 0) goto L13
            r0 = r11
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessages$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191701) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessages$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessages$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L53
            if (r2 == r4) goto L4f
            if (r2 != r3) goto L47
            int r2 = r0.I$1
            int r4 = r0.I$0
            java.lang.Object r6 = r0.L$6
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r0.L$5
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DraftMessageEntity r7 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DraftMessageEntity) r7
            java.lang.Object r7 = r0.L$3
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$2
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r9 = r0.L$1
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r9 = r0.L$0
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            p505ts.AbstractC34132o.m107864I(r11)
            goto La6
        L47:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L4f:
            p505ts.AbstractC34132o.m107864I(r11)
            goto L61
        L53:
            p505ts.AbstractC34132o.m107864I(r11)
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao r11 = r10.messageDao
            r0.label = r4
            java.lang.Object r11 = r11.selectDraftMessages(r0)
            if (r11 != r1) goto L61
            goto La4
        L61:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = m83.AbstractC25267u.m74163i0(r11, r4)
            r2.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
            r7 = r11
            r6 = r2
            r2 = r5
            r4 = r2
        L76:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Lad
            java.lang.Object r11 = r7.next()
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DraftMessageEntity r11 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DraftMessageEntity) r11
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessages$2$1 r8 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessages$2$1
            r8.<init>(r10)
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.L$2 = r6
            r0.L$3 = r7
            r0.L$4 = r9
            r0.L$5 = r9
            r0.L$6 = r6
            r0.I$0 = r4
            r0.I$1 = r2
            r0.I$2 = r5
            r0.label = r3
            java.lang.Object r11 = io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageMapperKt.toModel(r11, r8, r0)
            if (r11 != r1) goto La5
        La4:
            return r1
        La5:
            r8 = r6
        La6:
            io.getstream.chat.android.models.DraftMessage r11 = (io.getstream.chat.android.models.DraftMessage) r11
            r6.add(r11)
            r6 = r8
            goto L76
        Lad:
            java.util.List r6 = (java.util.List) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.selectDraftMessages(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r8 == r1) goto L23;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object selectDraftMessagesByCid(java.lang.String r7, q83.InterfaceC30057d<? super io.getstream.chat.android.models.DraftMessage> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191711
            if (r0 == 0) goto L13
            r0 = r8
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessagesByCid$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191711) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessagesByCid$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessagesByCid$1
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
            goto L63
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L4f
        L3f:
            p505ts.AbstractC34132o.m107864I(r8)
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao r8 = r6.messageDao
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r8 = r8.selectDraftMessageByCid(r7, r0)
            if (r8 != r1) goto L4f
            goto L62
        L4f:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DraftMessageEntity r8 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DraftMessageEntity) r8
            if (r8 == 0) goto L66
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessagesByCid$2 r7 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectDraftMessagesByCid$2
            r7.<init>(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r8 = io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageMapperKt.toModel(r8, r7, r0)
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            io.getstream.chat.android.models.DraftMessage r8 = (io.getstream.chat.android.models.DraftMessage) r8
            return r8
        L66:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.selectDraftMessagesByCid(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00be  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00e3 -> B:30:0x00e4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final java.lang.Object selectLocalOnlyMessagesForChannel(java.lang.String r12, q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.models.Message>> r13) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.selectLocalOnlyMessagesForChannel(java.lang.String, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessage(String str, InterfaceC30057d<? super Message> interfaceC30057d) {
        Message message = (Message) this.messageCache.m2c(str);
        return message == null ? fetchMessageFromDB(str, interfaceC30057d) : message;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b2 -> B:27:0x00b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final java.lang.Object selectMessageBySyncState(io.getstream.chat.android.models.SyncStatus r11, q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.models.Message>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191741
            if (r0 == 0) goto L14
            r0 = r12
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessageBySyncState$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191741) r0
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
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessageBySyncState$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessageBySyncState$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r4.result
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r4.label
            r7 = 2
            r2 = 1
            r8 = 0
            r9 = 0
            if (r1 == 0) goto L5e
            if (r1 == r2) goto L56
            if (r1 != r7) goto L4e
            int r11 = r4.I$1
            int r1 = r4.I$0
            java.lang.Object r2 = r4.L$7
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r3 = r4.L$6
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity r3 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity) r3
            java.lang.Object r3 = r4.L$4
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r5 = r4.L$3
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r4.L$2
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r6 = r4.L$1
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r6 = r4.L$0
            io.getstream.chat.android.models.SyncStatus r6 = (io.getstream.chat.android.models.SyncStatus) r6
            p505ts.AbstractC34132o.m107864I(r12)
            goto Lb3
        L4e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L56:
            java.lang.Object r11 = r4.L$0
            io.getstream.chat.android.models.SyncStatus r11 = (io.getstream.chat.android.models.SyncStatus) r11
            p505ts.AbstractC34132o.m107864I(r12)
            goto L72
        L5e:
            p505ts.AbstractC34132o.m107864I(r12)
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao r1 = r10.messageDao
            r4.L$0 = r9
            r4.label = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r2 = r11
            java.lang.Object r12 = io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao.selectBySyncStatus$default(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L72
            goto Lb1
        L72:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r11 = new java.util.ArrayList
            r1 = 10
            int r1 = m83.AbstractC25267u.m74163i0(r12, r1)
            r11.<init>(r1)
            java.util.Iterator r12 = r12.iterator()
            r2 = r11
            r3 = r12
            r11 = r8
            r1 = r11
        L87:
            boolean r12 = r3.hasNext()
            if (r12 == 0) goto Lba
            java.lang.Object r12 = r3.next()
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity r12 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity) r12
            r4.L$0 = r9
            r4.L$1 = r9
            r4.L$2 = r9
            r4.L$3 = r2
            r4.L$4 = r3
            r4.L$5 = r9
            r4.L$6 = r9
            r4.L$7 = r2
            r4.I$0 = r1
            r4.I$1 = r11
            r4.I$2 = r8
            r4.label = r7
            java.lang.Object r12 = r10.toMessage(r12, r4)
            if (r12 != r0) goto Lb2
        Lb1:
            return r0
        Lb2:
            r5 = r2
        Lb3:
            io.getstream.chat.android.models.Message r12 = (io.getstream.chat.android.models.Message) r12
            r2.add(r12)
            r2 = r5
            goto L87
        Lba:
            java.util.List r2 = (java.util.List) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.selectMessageBySyncState(io.getstream.chat.android.models.SyncStatus, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessageIdsBySyncState(SyncStatus syncStatus, InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return MessageDao.selectIdsBySyncStatus$default(this.messageDao, syncStatus, 0, interfaceC30057d, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r8v0, types: [io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessages(List<String> list, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        C191751 c191751;
        ?? arrayList;
        ?? r10;
        List list2;
        ?? r14;
        if (interfaceC30057d instanceof C191751) {
            c191751 = (C191751) interfaceC30057d;
            int i13 = c191751.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191751.label = i13 - Integer.MIN_VALUE;
            } else {
                c191751 = new C191751(interfaceC30057d);
            }
        } else {
            c191751 = new C191751(interfaceC30057d);
        }
        Object obj = c191751.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c191751.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            List<String> list3 = list;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
            for (String str : list3) {
                arrayList2.add(new C23465k(str, this.messageCache.m2c(str)));
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((C23465k) obj2).f92938x != null) {
                    arrayList3.add(obj2);
                } else {
                    arrayList4.add(obj2);
                }
            }
            arrayList = new ArrayList();
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                Message message = (Message) ((C23465k) it.next()).f92938x;
                if (message != null) {
                    arrayList.add(message);
                }
            }
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add((String) ((C23465k) it3.next()).f92937w);
            }
            if (arrayList5.isEmpty()) {
                arrayList5 = null;
            }
            if (arrayList5 != null) {
                c191751.L$0 = null;
                c191751.L$1 = null;
                c191751.L$2 = null;
                c191751.L$3 = null;
                c191751.L$4 = arrayList;
                c191751.I$0 = 0;
                c191751.I$1 = 0;
                c191751.label = 1;
                Object objFetchMessagesFromDB = fetchMessagesFromDB(arrayList5, c191751);
                if (objFetchMessagesFromDB == enumC31071a) {
                    return enumC31071a;
                }
                obj = objFetchMessagesFromDB;
                r10 = arrayList;
            } else {
                ?? r15 = arrayList;
                list2 = C25271y.f99162w;
                r14 = r15;
            }
            return AbstractC25265s.m74129g1(r14, list2);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Collection collection = (Collection) c191751.L$4;
        AbstractC34132o.m107864I(obj);
        r10 = collection;
        List list4 = (List) obj;
        if (list4 != null) {
            list2 = list4;
            r14 = r10;
        } else {
            arrayList = r10;
            ?? r16 = arrayList;
            list2 = C25271y.f99162w;
            r14 = r16;
        }
        return AbstractC25265s.m74129g1(r14, list2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008f  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b6 -> B:26:0x00b7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final java.lang.Object selectMessagesForChannel(java.lang.String r10, io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest r11, q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.models.Message>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191771
            if (r0 == 0) goto L13
            r0 = r12
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessagesForChannel$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191771) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessagesForChannel$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessagesForChannel$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L64
            if (r2 == r4) goto L58
            if (r2 != r3) goto L50
            int r10 = r0.I$1
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$8
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r4 = r0.L$7
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity r4 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity) r4
            java.lang.Object r4 = r0.L$5
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r7 = r0.L$4
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Object r8 = r0.L$3
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r8 = r0.L$2
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r8 = r0.L$1
            io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest r8 = (io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest) r8
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            p505ts.AbstractC34132o.m107864I(r12)
            goto Lb7
        L50:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L58:
            java.lang.Object r10 = r0.L$1
            io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest r10 = (io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest) r10
            java.lang.Object r10 = r0.L$0
            java.lang.String r10 = (java.lang.String) r10
            p505ts.AbstractC34132o.m107864I(r12)
            goto L74
        L64:
            p505ts.AbstractC34132o.m107864I(r12)
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r12 = r9.selectMessagesEntitiesForChannel(r10, r11, r0)
            if (r12 != r1) goto L74
            goto Lb5
        L74:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = m83.AbstractC25267u.m74163i0(r12, r11)
            r10.<init>(r11)
            java.util.Iterator r11 = r12.iterator()
            r2 = r10
            r4 = r11
            r10 = r5
            r11 = r10
        L89:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto Lbe
            java.lang.Object r12 = r4.next()
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity r12 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity) r12
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.L$3 = r6
            r0.L$4 = r2
            r0.L$5 = r4
            r0.L$6 = r6
            r0.L$7 = r6
            r0.L$8 = r2
            r0.I$0 = r11
            r0.I$1 = r10
            r0.I$2 = r5
            r0.label = r3
            java.lang.Object r12 = r9.toMessage(r12, r0)
            if (r12 != r1) goto Lb6
        Lb5:
            return r1
        Lb6:
            r7 = r2
        Lb7:
            io.getstream.chat.android.models.Message r12 = (io.getstream.chat.android.models.Message) r12
            r2.add(r12)
            r2 = r7
            goto L89
        Lbe:
            java.util.List r2 = (java.util.List) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.selectMessagesForChannel(java.lang.String, io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b5 -> B:26:0x00b6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final java.lang.Object selectMessagesForThread(java.lang.String r11, int r12, q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.models.Message>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191781
            if (r0 == 0) goto L13
            r0 = r13
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessagesForThread$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191781) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessagesForThread$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessagesForThread$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L60
            if (r2 == r4) goto L56
            if (r2 != r3) goto L4e
            int r11 = r0.I$2
            int r12 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$7
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r7 = r0.L$6
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity r7 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity) r7
            java.lang.Object r7 = r0.L$4
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$3
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r9 = r0.L$2
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r9 = r0.L$1
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            p505ts.AbstractC34132o.m107864I(r13)
            goto Lb6
        L4e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L56:
            int r12 = r0.I$0
            java.lang.Object r11 = r0.L$0
            java.lang.String r11 = (java.lang.String) r11
            p505ts.AbstractC34132o.m107864I(r13)
            goto L72
        L60:
            p505ts.AbstractC34132o.m107864I(r13)
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao r13 = r10.messageDao
            r0.L$0 = r6
            r0.I$0 = r12
            r0.label = r4
            java.lang.Object r13 = r13.messagesForThread(r11, r12, r0)
            if (r13 != r1) goto L72
            goto Lb4
        L72:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r11 = new java.util.ArrayList
            r2 = 10
            int r2 = m83.AbstractC25267u.m74163i0(r13, r2)
            r11.<init>(r2)
            java.util.Iterator r13 = r13.iterator()
            r4 = r11
            r2 = r12
            r7 = r13
            r11 = r5
            r12 = r11
        L88:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto Lbd
            java.lang.Object r13 = r7.next()
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity r13 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity) r13
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.L$3 = r4
            r0.L$4 = r7
            r0.L$5 = r6
            r0.L$6 = r6
            r0.L$7 = r4
            r0.I$0 = r2
            r0.I$1 = r12
            r0.I$2 = r11
            r0.I$3 = r5
            r0.label = r3
            java.lang.Object r13 = r10.toMessage(r13, r0)
            if (r13 != r1) goto Lb5
        Lb4:
            return r1
        Lb5:
            r8 = r4
        Lb6:
            io.getstream.chat.android.models.Message r13 = (io.getstream.chat.android.models.Message) r13
            r4.add(r13)
            r4 = r8
            goto L88
        Lbd:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.selectMessagesForThread(java.lang.String, int, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ac -> B:26:0x00ad). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final java.lang.Object selectMessagesWithPoll(java.lang.String r11, q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.models.Message>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191791
            if (r0 == 0) goto L13
            r0 = r12
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessagesWithPoll$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.C191791) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessagesWithPoll$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository$selectMessagesWithPoll$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L5c
            if (r2 == r4) goto L54
            if (r2 != r3) goto L4c
            int r11 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$7
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r7 = r0.L$6
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity r7 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity) r7
            java.lang.Object r7 = r0.L$4
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$3
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r9 = r0.L$2
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r9 = r0.L$1
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            p505ts.AbstractC34132o.m107864I(r12)
            goto Lad
        L4c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L54:
            java.lang.Object r11 = r0.L$0
            java.lang.String r11 = (java.lang.String) r11
            p505ts.AbstractC34132o.m107864I(r12)
            goto L6c
        L5c:
            p505ts.AbstractC34132o.m107864I(r12)
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao r12 = r10.messageDao
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r12 = r12.selectMessagesWithPoll(r11, r0)
            if (r12 != r1) goto L6c
            goto Lab
        L6c:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r11 = new java.util.ArrayList
            r2 = 10
            int r2 = m83.AbstractC25267u.m74163i0(r12, r2)
            r11.<init>(r2)
            java.util.Iterator r12 = r12.iterator()
            r4 = r11
            r7 = r12
            r11 = r5
            r2 = r11
        L81:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto Lb4
            java.lang.Object r12 = r7.next()
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity r12 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity) r12
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.L$3 = r4
            r0.L$4 = r7
            r0.L$5 = r6
            r0.L$6 = r6
            r0.L$7 = r4
            r0.I$0 = r2
            r0.I$1 = r11
            r0.I$2 = r5
            r0.label = r3
            java.lang.Object r12 = r10.toMessage(r12, r0)
            if (r12 != r1) goto Lac
        Lab:
            return r1
        Lac:
            r8 = r4
        Lad:
            io.getstream.chat.android.models.Message r12 = (io.getstream.chat.android.models.Message) r12
            r4.add(r12)
            r4 = r8
            goto L81
        Lb4:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository.selectMessagesWithPoll(java.lang.String, q83.d):java.lang.Object");
    }

    public /* synthetic */ DatabaseMessageRepository(InterfaceC2994c0 interfaceC2994c0, MessageDao messageDao, ReplyMessageDao replyMessageDao, PollDao pollDao, InterfaceC4351m interfaceC4351m, User user, Set set, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2994c0, messageDao, replyMessageDao, pollDao, interfaceC4351m, user, set, (i14 & 128) != 0 ? 1000 : i13);
    }
}
