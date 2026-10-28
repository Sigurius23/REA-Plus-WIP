package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import androidx.room.AbstractC1848z0;
import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.AttachmentEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity;
import io.getstream.chat.android.models.SyncStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0011\ba\u0018\u0000 T2\u00020\u0001:\u0001TJ\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0097@¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H'¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H\u0097@¢\u0006\u0004\b\u0006\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0097@¢\u0006\u0004\b\u0018\u0010\u0013J\u001e\u0010\u0019\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H\u0097@¢\u0006\u0004\b\u0019\u0010\u0007J\u001e\u0010\u001c\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0002H§@¢\u0006\u0004\b\u001c\u0010\u0007J\u001e\u0010\u001f\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002H§@¢\u0006\u0004\b\u001f\u0010\u0007J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H§@¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u0002H§@¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u0004\u0018\u00010 2\u0006\u0010&\u001a\u00020\bH§@¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u0004\u0018\u00010 2\u0006\u0010)\u001a\u00020\bH§@¢\u0006\u0004\b*\u0010(J\u0018\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\bH§@¢\u0006\u0004\b,\u0010(J0\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010&\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H§@¢\u0006\u0004\b1\u00102J0\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010&\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H§@¢\u0006\u0004\b3\u00102J0\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010&\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H§@¢\u0006\u0004\b4\u00102J0\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010&\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H§@¢\u0006\u0004\b5\u00102J(\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010&\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020-H§@¢\u0006\u0004\b6\u00107J(\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010+\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020-H§@¢\u0006\u0004\b8\u00107J \u0010:\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\b2\u0006\u00109\u001a\u00020/H§@¢\u0006\u0004\b:\u0010;J \u0010<\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH§@¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\bH§@¢\u0006\u0004\b>\u0010(J\u001e\u0010>\u001a\u00020\u00052\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b>\u0010\u0007J$\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0097@¢\u0006\u0004\b@\u0010\u0007J$\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\bA\u0010\u0007J\u001a\u0010@\u001a\u0004\u0018\u00010\u00032\u0006\u0010B\u001a\u00020\bH§@¢\u0006\u0004\b@\u0010(J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0097@¢\u0006\u0004\bC\u0010%J(\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010E\u001a\u00020D2\b\b\u0002\u0010.\u001a\u00020-H§@¢\u0006\u0004\bF\u0010GJ\u001e\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010H\u001a\u00020\bH§@¢\u0006\u0004\bI\u0010(J&\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010&\u001a\u00020\b2\u0006\u0010H\u001a\u00020\bH§@¢\u0006\u0004\bJ\u0010=J(\u0010K\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010E\u001a\u00020D2\b\b\u0002\u0010.\u001a\u00020-H§@¢\u0006\u0004\bK\u0010GJ\u001e\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010L\u001a\u00020\bH§@¢\u0006\u0004\bM\u0010(J\u0010\u0010N\u001a\u00020\u0005H§@¢\u0006\u0004\bN\u0010%J:\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010&\u001a\u00020\b2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020-0\u00022\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020\u0005H§@¢\u0006\u0004\bS\u0010%ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006UÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;", "", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;", "messageEntities", "Ll83/a0;", "insert", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "messageIds", "deleteAttachments", "(Ljava/util/List;)V", "deleteAttachmentsChunked", "messageEntity", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;", "messageInnerEntity", "", "insertMessageInnerEntity", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Lq83/d;)Ljava/lang/Object;", "messageInnerEntities", "insertMessageInnerEntities", "updateMessageInnerEntity", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;)V", "upsertMessageInnerEntity", "upsertMessageInnerEntities", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;", "attachmentEntities", "insertAttachments", "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;", "reactions", "insertReactions", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;", "draftMessage", "insertDraftMessages", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Lq83/d;)Ljava/lang/Object;", "selectDraftMessages", "(Lq83/d;)Ljava/lang/Object;", "cid", "selectDraftMessageByCid", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "parentId", "selectDraftMessageByParentId", "messageId", "deleteDraftMessage", "", MapboxMap.QFE_LIMIT, "Ljava/util/Date;", "dateFilter", "messagesForChannelNewerThan", "(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;", "messagesForChannelEqualOrNewerThan", "messagesForChannelOlderThan", "messagesForChannelEqualOrOlderThan", "messagesForChannel", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "messagesForThread", "deleteMessagesBefore", "deleteChannelMessagesBefore", "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "deleteMessage", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "deleteMessages", "ids", "select", "selectChunked", "id", "selectWaitForAttachments", "Lio/getstream/chat/android/models/SyncStatus;", "syncStatus", "selectBySyncStatus", "(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;", "userId", "selectByUserId", "selectByCidAndUserId", "selectIdsBySyncStatus", "pollId", "selectMessagesWithPoll", "deleteAll", "syncStatuses", "types", "selectBySyncStatusOrTypeForChannel", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "deleteAllDrafts", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface MessageDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao$Companion;", "", "<init>", "()V", "SQLITE_MAX_VARIABLE_NUMBER", "", "NO_LIMIT", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int NO_LIMIT = -1;
        private static final int SQLITE_MAX_VARIABLE_NUMBER = 999;

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao$insert$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao", m100430f = "MessageDao.kt", m100431l = {36, 38, 39}, m100432m = "insert$suspendImpl")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191851 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C191851(InterfaceC30057d<? super C191851> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageDao.insert$suspendImpl(MessageDao.this, (List<MessageEntity>) null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao$select$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao", m100430f = "MessageDao.kt", m100431l = {211}, m100432m = "select$suspendImpl")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191861 extends AbstractC32269c {
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

        public C191861(InterfaceC30057d<? super C191861> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageDao.select$suspendImpl(MessageDao.this, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao$upsertMessageInnerEntities$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao", m100430f = "MessageDao.kt", m100431l = {72}, m100432m = "upsertMessageInnerEntities$suspendImpl")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191871 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C191871(InterfaceC30057d<? super C191871> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageDao.upsertMessageInnerEntities$suspendImpl(MessageDao.this, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao$upsertMessageInnerEntity$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao", m100430f = "MessageDao.kt", m100431l = {64}, m100432m = "upsertMessageInnerEntity$suspendImpl")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191881 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C191881(InterfaceC30057d<? super C191881> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageDao.upsertMessageInnerEntity$suspendImpl(MessageDao.this, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00fa A[LOOP:0: B:38:0x00f4->B:40:0x00fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011f, code lost:
    
        if (r10.insertReactions(r11, r0) == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object insert$suspendImpl(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao r9, java.util.List<io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity> r10, q83.InterfaceC30057d<? super l83.C23454a0> r11) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao.insert$suspendImpl(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao, java.util.List, q83.d):java.lang.Object");
    }

    static /* synthetic */ Object messagesForChannel$default(MessageDao messageDao, String str, int i13, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: messagesForChannel");
        }
        if ((i14 & 2) != 0) {
            i13 = 100;
        }
        return messageDao.messagesForChannel(str, i13, interfaceC30057d);
    }

    static /* synthetic */ Object messagesForChannelEqualOrNewerThan$default(MessageDao messageDao, String str, int i13, Date date, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: messagesForChannelEqualOrNewerThan");
        }
        if ((i14 & 2) != 0) {
            i13 = 100;
        }
        return messageDao.messagesForChannelEqualOrNewerThan(str, i13, date, interfaceC30057d);
    }

    static /* synthetic */ Object messagesForChannelEqualOrOlderThan$default(MessageDao messageDao, String str, int i13, Date date, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: messagesForChannelEqualOrOlderThan");
        }
        if ((i14 & 2) != 0) {
            i13 = 100;
        }
        return messageDao.messagesForChannelEqualOrOlderThan(str, i13, date, interfaceC30057d);
    }

    static /* synthetic */ Object messagesForChannelNewerThan$default(MessageDao messageDao, String str, int i13, Date date, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: messagesForChannelNewerThan");
        }
        if ((i14 & 2) != 0) {
            i13 = 100;
        }
        return messageDao.messagesForChannelNewerThan(str, i13, date, interfaceC30057d);
    }

    static /* synthetic */ Object messagesForChannelOlderThan$default(MessageDao messageDao, String str, int i13, Date date, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: messagesForChannelOlderThan");
        }
        if ((i14 & 2) != 0) {
            i13 = 100;
        }
        return messageDao.messagesForChannelOlderThan(str, i13, date, interfaceC30057d);
    }

    static /* synthetic */ Object messagesForThread$default(MessageDao messageDao, String str, int i13, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: messagesForThread");
        }
        if ((i14 & 2) != 0) {
            i13 = 100;
        }
        return messageDao.messagesForThread(str, i13, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX WARN: Code duplicated, block: B:19:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009b -> B:21:0x00a1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    static java.lang.Object select$suspendImpl(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao r9, java.util.List<java.lang.String> r10, q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntity>> r11) {
        /*
            boolean r0 = r11 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao.C191861
            if (r0 == 0) goto L13
            r0 = r11
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao$select$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao.C191861) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao$select$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao$select$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L57
            if (r2 != r3) goto L4f
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$7
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r0.L$5
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.L$4
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.L$3
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r6 = r0.L$2
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r6 = r0.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r0.L$0
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao r6 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao) r6
            p505ts.AbstractC34132o.m107864I(r11)
            r8 = r10
            r10 = r9
            r9 = r6
            r6 = r5
            r5 = r2
            r2 = r0
            r0 = r8
            goto La1
        L4f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L57:
            p505ts.AbstractC34132o.m107864I(r11)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            r11 = 999(0x3e7, float:1.4E-42)
            java.util.ArrayList r10 = m83.AbstractC25265s.m74153v0(r10, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
            r2 = r10
            r5 = r11
            r10 = r4
            r11 = r10
        L6f:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto Lab
            java.lang.Object r6 = r2.next()
            java.util.List r6 = (java.util.List) r6
            r0.L$0 = r9
            r7 = 0
            r0.L$1 = r7
            r0.L$2 = r7
            r0.L$3 = r7
            r0.L$4 = r5
            r0.L$5 = r2
            r0.L$6 = r7
            r0.L$7 = r7
            r0.I$0 = r11
            r0.I$1 = r10
            r0.I$2 = r4
            r0.label = r3
            java.lang.Object r6 = r9.selectChunked(r6, r0)
            if (r6 != r1) goto L9b
            return r1
        L9b:
            r8 = r0
            r0 = r11
            r11 = r6
            r6 = r5
            r5 = r2
            r2 = r8
        La1:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            m83.AbstractC25265s.m74141p0(r6, r11)
            r11 = r0
            r0 = r2
            r2 = r5
            r5 = r6
            goto L6f
        Lab:
            java.util.List r5 = (java.util.List) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao.select$suspendImpl(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao, java.util.List, q83.d):java.lang.Object");
    }

    static /* synthetic */ Object selectBySyncStatus$default(MessageDao messageDao, SyncStatus syncStatus, int i13, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectBySyncStatus");
        }
        if ((i14 & 2) != 0) {
            i13 = -1;
        }
        return messageDao.selectBySyncStatus(syncStatus, i13, interfaceC30057d);
    }

    static /* synthetic */ Object selectIdsBySyncStatus$default(MessageDao messageDao, SyncStatus syncStatus, int i13, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectIdsBySyncStatus");
        }
        if ((i14 & 2) != 0) {
            i13 = -1;
        }
        return messageDao.selectIdsBySyncStatus(syncStatus, i13, interfaceC30057d);
    }

    static /* synthetic */ Object selectWaitForAttachments$suspendImpl(MessageDao messageDao, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        return selectBySyncStatus$default(messageDao, SyncStatus.AWAITING_ATTACHMENTS, 0, interfaceC30057d, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static Object upsertMessageInnerEntities$suspendImpl(MessageDao messageDao, List<MessageInnerEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C191871 c191871;
        if (interfaceC30057d instanceof C191871) {
            c191871 = (C191871) interfaceC30057d;
            int i13 = c191871.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191871.label = i13 - Integer.MIN_VALUE;
            } else {
                c191871 = messageDao.new C191871(interfaceC30057d);
            }
        } else {
            c191871 = messageDao.new C191871(interfaceC30057d);
        }
        Object objInsertMessageInnerEntities = c191871.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c191871.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objInsertMessageInnerEntities);
            c191871.L$0 = messageDao;
            c191871.L$1 = list;
            c191871.label = 1;
            objInsertMessageInnerEntities = messageDao.insertMessageInnerEntities(list, c191871);
            if (objInsertMessageInnerEntities == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c191871.L$1;
            messageDao = (MessageDao) c191871.L$0;
            AbstractC34132o.m107864I(objInsertMessageInnerEntities);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        for (Object obj : (List) objInsertMessageInnerEntities) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            MessageInnerEntity messageInnerEntity = ((Number) obj).longValue() == -1 ? list.get(i15) : null;
            if (messageInnerEntity != null) {
                arrayList.add(messageInnerEntity);
            }
            i15 = i16;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            messageDao.updateMessageInnerEntity((MessageInnerEntity) it.next());
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static Object upsertMessageInnerEntity$suspendImpl(MessageDao messageDao, MessageInnerEntity messageInnerEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C191881 c191881;
        if (interfaceC30057d instanceof C191881) {
            c191881 = (C191881) interfaceC30057d;
            int i13 = c191881.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191881.label = i13 - Integer.MIN_VALUE;
            } else {
                c191881 = messageDao.new C191881(interfaceC30057d);
            }
        } else {
            c191881 = messageDao.new C191881(interfaceC30057d);
        }
        Object objInsertMessageInnerEntity = c191881.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c191881.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objInsertMessageInnerEntity);
            c191881.L$0 = messageDao;
            c191881.L$1 = messageInnerEntity;
            c191881.label = 1;
            objInsertMessageInnerEntity = messageDao.insertMessageInnerEntity(messageInnerEntity, c191881);
            if (objInsertMessageInnerEntity == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            messageInnerEntity = (MessageInnerEntity) c191881.L$1;
            messageDao = (MessageDao) c191881.L$0;
            AbstractC34132o.m107864I(objInsertMessageInnerEntity);
        }
        if (((Number) objInsertMessageInnerEntity).longValue() == -1) {
            messageDao.updateMessageInnerEntity(messageInnerEntity);
        }
        return C23454a0.f92919a;
    }

    Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteAllDrafts(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    default void deleteAttachments(List<String> messageIds) {
        AbstractC22676k.m65750j(messageIds, "messageIds");
        Iterator it = AbstractC25265s.m74153v0(messageIds, AbstractC1848z0.MAX_BIND_PARAMETER_CNT).iterator();
        while (it.hasNext()) {
            deleteAttachmentsChunked((List) it.next());
        }
    }

    void deleteAttachmentsChunked(List<String> messageIds);

    Object deleteChannelMessagesBefore(String str, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteDraftMessage(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteMessage(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteMessages(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteMessages(List<String> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    default Object insert(MessageEntity messageEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return insert$suspendImpl(this, messageEntity, interfaceC30057d);
    }

    Object insertAttachments(List<AttachmentEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertDraftMessages(DraftMessageEntity draftMessageEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertMessageInnerEntities(List<MessageInnerEntity> list, InterfaceC30057d<? super List<Long>> interfaceC30057d);

    Object insertMessageInnerEntity(MessageInnerEntity messageInnerEntity, InterfaceC30057d<? super Long> interfaceC30057d);

    Object insertReactions(List<ReactionEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object messagesForChannel(String str, int i13, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d);

    Object messagesForChannelEqualOrNewerThan(String str, int i13, Date date, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d);

    Object messagesForChannelEqualOrOlderThan(String str, int i13, Date date, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d);

    Object messagesForChannelNewerThan(String str, int i13, Date date, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d);

    Object messagesForChannelOlderThan(String str, int i13, Date date, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d);

    Object messagesForThread(String str, int i13, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d);

    Object select(String str, InterfaceC30057d<? super MessageEntity> interfaceC30057d);

    default Object select(List<String> list, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        return select$suspendImpl(this, list, interfaceC30057d);
    }

    Object selectByCidAndUserId(String str, String str2, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d);

    Object selectBySyncStatus(SyncStatus syncStatus, int i13, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d);

    Object selectBySyncStatusOrTypeForChannel(String str, List<Integer> list, List<String> list2, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d);

    Object selectByUserId(String str, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d);

    Object selectChunked(List<String> list, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d);

    Object selectDraftMessageByCid(String str, InterfaceC30057d<? super DraftMessageEntity> interfaceC30057d);

    Object selectDraftMessageByParentId(String str, InterfaceC30057d<? super DraftMessageEntity> interfaceC30057d);

    Object selectDraftMessages(InterfaceC30057d<? super List<DraftMessageEntity>> interfaceC30057d);

    Object selectIdsBySyncStatus(SyncStatus syncStatus, int i13, InterfaceC30057d<? super List<String>> interfaceC30057d);

    Object selectMessagesWithPoll(String str, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d);

    default Object selectWaitForAttachments(InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        return selectWaitForAttachments$suspendImpl(this, interfaceC30057d);
    }

    void updateMessageInnerEntity(MessageInnerEntity messageInnerEntity);

    default Object upsertMessageInnerEntities(List<MessageInnerEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return upsertMessageInnerEntities$suspendImpl(this, list, interfaceC30057d);
    }

    default Object upsertMessageInnerEntity(MessageInnerEntity messageInnerEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return upsertMessageInnerEntity$suspendImpl(this, messageInnerEntity, interfaceC30057d);
    }

    default Object insert(List<MessageEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return insert$suspendImpl(this, list, interfaceC30057d);
    }

    static Object insert$suspendImpl(MessageDao messageDao, MessageEntity messageEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objInsert = messageDao.insert(AbstractC37056f.m118958J(messageEntity), interfaceC30057d);
        return objInsert == EnumC31071a.f128113w ? objInsert : C23454a0.f92919a;
    }
}
