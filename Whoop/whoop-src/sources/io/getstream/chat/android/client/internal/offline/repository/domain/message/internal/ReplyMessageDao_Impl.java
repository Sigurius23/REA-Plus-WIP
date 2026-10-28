package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1794i;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import ge3.AbstractC15751g;
import h02.C16574h;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.DateConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ExtraDataConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ListConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.MapConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ModerationDetailsConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ReminderInfoConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.SyncStatusConverter;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.ReplyAttachmentEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.UploadStateEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.channelinfo.internal.ChannelInfoEntity;
import io.getstream.chat.android.models.SyncStatus;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.C25271y;
import p002a0.AbstractC0038m;
import p002a0.C0010c;
import p002a0.C0022g;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32411b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001>B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0096@¢\u0006\u0004\b\u0016\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001b\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0010H\u0096@¢\u0006\u0004\b\u001b\u0010\u0014J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000b0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010$R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00110;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;", "Landroidx/room/z0;", "__db", "<init>", "(Landroidx/room/z0;)V", "Ltb/a;", "_connection", "La0/g;", "", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;", "_map", "Ll83/a0;", "__fetchRelationshipreplyAttachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalReplyAttachmentEntity", "(Ltb/a;La0/g;)V", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;", "replyMessageEntities", "insertInnerEntity", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "attachmentEntities", "insertAttachments", "replyMessageInnerEntity", "delete", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;", "insert", "id", "selectById", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "deleteAll", "(Lq83/d;)Ljava/lang/Object;", "Landroidx/room/z0;", "Landroidx/room/k;", "__insertAdapterOfReplyMessageInnerEntity", "Landroidx/room/k;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;", "__syncStatusConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "__dateConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "__listConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;", "__mapConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;", "__extraDataConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;", "__moderationDetailsConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;", "__reminderInfoConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;", "__insertAdapterOfReplyAttachmentEntity", "Landroidx/room/i;", "__deleteAdapterOfReplyMessageInnerEntity", "Landroidx/room/i;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ReplyMessageDao_Impl implements ReplyMessageDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final DateConverter __dateConverter;
    private final AbstractC1848z0 __db;
    private final AbstractC1794i __deleteAdapterOfReplyMessageInnerEntity;
    private final ExtraDataConverter __extraDataConverter;
    private final AbstractC1802k __insertAdapterOfReplyAttachmentEntity;
    private final AbstractC1802k __insertAdapterOfReplyMessageInnerEntity;
    private final ListConverter __listConverter;
    private final MapConverter __mapConverter;
    private final ModerationDetailsConverter __moderationDetailsConverter;
    private final ReminderInfoConverter __reminderInfoConverter;
    private final SyncStatusConverter __syncStatusConverter;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao_Impl$3 */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"io/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl$3", "Landroidx/room/i;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;", "", "createQuery", "()Ljava/lang/String;", "Ltb/c;", "statement", "entity", "Ll83/a0;", "bind", "(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192103 extends AbstractC1794i {
        @Override // androidx.room.AbstractC1794i
        public final String createQuery() {
            return "DELETE FROM `stream_chat_reply_message` WHERE `id` = ?";
        }

        @Override // androidx.room.AbstractC1794i
        public final void bind(InterfaceC33689c statement, ReplyMessageInnerEntity entity) {
            AbstractC22676k.m65750j(statement, "statement");
            AbstractC22676k.m65750j(entity, "entity");
            statement.mo5354L(1, entity.getId());
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl$Companion;", "", "<init>", "()V", "", "Lj93/d;", "getRequiredConverters", "()Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final List<InterfaceC21461d> getRequiredConverters() {
            return C25271y.f99162w;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao_Impl$insert$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao_Impl$insert$2", m100430f = "ReplyMessageDao_Impl.kt", m100431l = {436}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C192112 extends AbstractC32275i implements Function1 {
        final /* synthetic */ List<ReplyMessageEntity> $replyMessageEntities;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192112(List<ReplyMessageEntity> list, InterfaceC30057d<? super C192112> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$replyMessageEntities = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return ReplyMessageDao_Impl.this.new C192112(this.$replyMessageEntities, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ReplyMessageDao_Impl replyMessageDao_Impl = ReplyMessageDao_Impl.this;
                List<ReplyMessageEntity> list = this.$replyMessageEntities;
                this.label = 1;
                if (ReplyMessageDao_Impl.m134219access$insert$s282016651(replyMessageDao_Impl, list, this) == enumC31071a) {
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
            return ((C192112) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public ReplyMessageDao_Impl(AbstractC1848z0 __db) {
        AbstractC22676k.m65750j(__db, "__db");
        this.__syncStatusConverter = new SyncStatusConverter();
        this.__dateConverter = new DateConverter();
        this.__listConverter = new ListConverter();
        this.__mapConverter = new MapConverter();
        this.__extraDataConverter = new ExtraDataConverter();
        this.__moderationDetailsConverter = new ModerationDetailsConverter();
        this.__reminderInfoConverter = new ReminderInfoConverter();
        this.__db = __db;
        this.__insertAdapterOfReplyMessageInnerEntity = new AbstractC1802k() { // from class: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao_Impl.1
            @Override // androidx.room.AbstractC1802k
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `stream_chat_reply_message` (`id`,`cid`,`userId`,`text`,`html`,`type`,`syncStatus`,`replyCount`,`deletedReplyCount`,`createdAt`,`createdLocallyAt`,`updatedAt`,`updatedLocallyAt`,`deletedAt`,`remoteMentionedUserIds`,`mentionedUsersId`,`parentId`,`command`,`shadowed`,`i18n`,`showInChannel`,`silent`,`extraData`,`pinned`,`pinnedAt`,`pinExpires`,`pinnedByUserId`,`threadParticipantsIds`,`moderationDetails`,`messageTextUpdatedAt`,`pollId`,`restrictedVisibility`,`reminder`,`channelRole`,`channel_infocid`,`channel_infoid`,`channel_infotype`,`channel_infomemberCount`,`channel_infoname`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC1802k
            public final void bind(InterfaceC33689c statement, ReplyMessageInnerEntity entity) {
                AbstractC22676k.m65750j(statement, "statement");
                AbstractC22676k.m65750j(entity, "entity");
                statement.mo5354L(1, entity.getId());
                statement.mo5354L(2, entity.getCid());
                statement.mo5354L(3, entity.getUserId());
                statement.mo5354L(4, entity.getText());
                statement.mo5354L(5, entity.getHtml());
                statement.mo5354L(6, entity.getType());
                statement.mo5356p(7, ReplyMessageDao_Impl.this.__syncStatusConverter.syncStatusToString(entity.getSyncStatus()));
                statement.mo5356p(8, entity.getReplyCount());
                statement.mo5356p(9, entity.getDeletedReplyCount());
                Long lDateToTimestamp = ReplyMessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getCreatedAt());
                if (lDateToTimestamp == null) {
                    statement.mo5359u(10);
                } else {
                    statement.mo5356p(10, lDateToTimestamp.longValue());
                }
                Long lDateToTimestamp2 = ReplyMessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getCreatedLocallyAt());
                if (lDateToTimestamp2 == null) {
                    statement.mo5359u(11);
                } else {
                    statement.mo5356p(11, lDateToTimestamp2.longValue());
                }
                Long lDateToTimestamp3 = ReplyMessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getUpdatedAt());
                if (lDateToTimestamp3 == null) {
                    statement.mo5359u(12);
                } else {
                    statement.mo5356p(12, lDateToTimestamp3.longValue());
                }
                Long lDateToTimestamp4 = ReplyMessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getUpdatedLocallyAt());
                if (lDateToTimestamp4 == null) {
                    statement.mo5359u(13);
                } else {
                    statement.mo5356p(13, lDateToTimestamp4.longValue());
                }
                Long lDateToTimestamp5 = ReplyMessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getDeletedAt());
                if (lDateToTimestamp5 == null) {
                    statement.mo5359u(14);
                } else {
                    statement.mo5356p(14, lDateToTimestamp5.longValue());
                }
                String strFromStringList = ReplyMessageDao_Impl.this.__listConverter.fromStringList(entity.getRemoteMentionedUserIds());
                if (strFromStringList == null) {
                    statement.mo5359u(15);
                } else {
                    statement.mo5354L(15, strFromStringList);
                }
                String strFromStringList2 = ReplyMessageDao_Impl.this.__listConverter.fromStringList(entity.getMentionedUsersId());
                if (strFromStringList2 == null) {
                    statement.mo5359u(16);
                } else {
                    statement.mo5354L(16, strFromStringList2);
                }
                String parentId = entity.getParentId();
                if (parentId == null) {
                    statement.mo5359u(17);
                } else {
                    statement.mo5354L(17, parentId);
                }
                String command = entity.getCommand();
                if (command == null) {
                    statement.mo5359u(18);
                } else {
                    statement.mo5354L(18, command);
                }
                statement.mo5356p(19, entity.getShadowed() ? 1L : 0L);
                String strStringMapToString = ReplyMessageDao_Impl.this.__mapConverter.stringMapToString(entity.getI18n());
                if (strStringMapToString == null) {
                    statement.mo5359u(20);
                } else {
                    statement.mo5354L(20, strStringMapToString);
                }
                statement.mo5356p(21, entity.getShowInChannel() ? 1L : 0L);
                statement.mo5356p(22, entity.getSilent() ? 1L : 0L);
                String strMapToString = ReplyMessageDao_Impl.this.__extraDataConverter.mapToString(entity.getExtraData());
                if (strMapToString == null) {
                    statement.mo5359u(23);
                } else {
                    statement.mo5354L(23, strMapToString);
                }
                statement.mo5356p(24, entity.getPinned() ? 1L : 0L);
                Long lDateToTimestamp6 = ReplyMessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getPinnedAt());
                if (lDateToTimestamp6 == null) {
                    statement.mo5359u(25);
                } else {
                    statement.mo5356p(25, lDateToTimestamp6.longValue());
                }
                Long lDateToTimestamp7 = ReplyMessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getPinExpires());
                if (lDateToTimestamp7 == null) {
                    statement.mo5359u(26);
                } else {
                    statement.mo5356p(26, lDateToTimestamp7.longValue());
                }
                String pinnedByUserId = entity.getPinnedByUserId();
                if (pinnedByUserId == null) {
                    statement.mo5359u(27);
                } else {
                    statement.mo5354L(27, pinnedByUserId);
                }
                String strFromStringList3 = ReplyMessageDao_Impl.this.__listConverter.fromStringList(entity.getThreadParticipantsIds());
                if (strFromStringList3 == null) {
                    statement.mo5359u(28);
                } else {
                    statement.mo5354L(28, strFromStringList3);
                }
                String strModerationDetailsToString = ReplyMessageDao_Impl.this.__moderationDetailsConverter.moderationDetailsToString(entity.getModerationDetails());
                if (strModerationDetailsToString == null) {
                    statement.mo5359u(29);
                } else {
                    statement.mo5354L(29, strModerationDetailsToString);
                }
                Long lDateToTimestamp8 = ReplyMessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getMessageTextUpdatedAt());
                if (lDateToTimestamp8 == null) {
                    statement.mo5359u(30);
                } else {
                    statement.mo5356p(30, lDateToTimestamp8.longValue());
                }
                String pollId = entity.getPollId();
                if (pollId == null) {
                    statement.mo5359u(31);
                } else {
                    statement.mo5354L(31, pollId);
                }
                String strFromStringList4 = ReplyMessageDao_Impl.this.__listConverter.fromStringList(entity.getRestrictedVisibility());
                if (strFromStringList4 == null) {
                    statement.mo5359u(32);
                } else {
                    statement.mo5354L(32, strFromStringList4);
                }
                String strReminderInfoToString = ReplyMessageDao_Impl.this.__reminderInfoConverter.reminderInfoToString(entity.getReminder());
                if (strReminderInfoToString == null) {
                    statement.mo5359u(33);
                } else {
                    statement.mo5354L(33, strReminderInfoToString);
                }
                String channelRole = entity.getChannelRole();
                if (channelRole == null) {
                    statement.mo5359u(34);
                } else {
                    statement.mo5354L(34, channelRole);
                }
                ChannelInfoEntity channelInfo = entity.getChannelInfo();
                if (channelInfo == null) {
                    statement.mo5359u(35);
                    statement.mo5359u(36);
                    statement.mo5359u(37);
                    statement.mo5359u(38);
                    statement.mo5359u(39);
                    return;
                }
                String cid = channelInfo.getCid();
                if (cid == null) {
                    statement.mo5359u(35);
                } else {
                    statement.mo5354L(35, cid);
                }
                String id4 = channelInfo.getId();
                if (id4 == null) {
                    statement.mo5359u(36);
                } else {
                    statement.mo5354L(36, id4);
                }
                String type = channelInfo.getType();
                if (type == null) {
                    statement.mo5359u(37);
                } else {
                    statement.mo5354L(37, type);
                }
                Integer memberCount = channelInfo.getMemberCount();
                if (memberCount == null) {
                    statement.mo5359u(38);
                } else {
                    statement.mo5356p(38, memberCount.intValue());
                }
                String name = channelInfo.getName();
                if (name == null) {
                    statement.mo5359u(39);
                } else {
                    statement.mo5354L(39, name);
                }
            }
        };
        this.__insertAdapterOfReplyAttachmentEntity = new AbstractC1802k() { // from class: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao_Impl.2
            @Override // androidx.room.AbstractC1802k
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `reply_attachment_inner_entity` (`id`,`messageId`,`authorName`,`titleLink`,`authorLink`,`thumbUrl`,`imageUrl`,`assetUrl`,`ogUrl`,`mimeType`,`fileSize`,`title`,`text`,`type`,`image`,`name`,`fallback`,`uploadFilePath`,`originalHeight`,`originalWidth`,`extraData`,`statusCode`,`errorMessage`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC1802k
            public final void bind(InterfaceC33689c statement, ReplyAttachmentEntity entity) {
                AbstractC22676k.m65750j(statement, "statement");
                AbstractC22676k.m65750j(entity, "entity");
                statement.mo5354L(1, entity.getId());
                statement.mo5354L(2, entity.getMessageId());
                String authorName = entity.getAuthorName();
                if (authorName == null) {
                    statement.mo5359u(3);
                } else {
                    statement.mo5354L(3, authorName);
                }
                String titleLink = entity.getTitleLink();
                if (titleLink == null) {
                    statement.mo5359u(4);
                } else {
                    statement.mo5354L(4, titleLink);
                }
                String authorLink = entity.getAuthorLink();
                if (authorLink == null) {
                    statement.mo5359u(5);
                } else {
                    statement.mo5354L(5, authorLink);
                }
                String thumbUrl = entity.getThumbUrl();
                if (thumbUrl == null) {
                    statement.mo5359u(6);
                } else {
                    statement.mo5354L(6, thumbUrl);
                }
                String imageUrl = entity.getImageUrl();
                if (imageUrl == null) {
                    statement.mo5359u(7);
                } else {
                    statement.mo5354L(7, imageUrl);
                }
                String assetUrl = entity.getAssetUrl();
                if (assetUrl == null) {
                    statement.mo5359u(8);
                } else {
                    statement.mo5354L(8, assetUrl);
                }
                String ogUrl = entity.getOgUrl();
                if (ogUrl == null) {
                    statement.mo5359u(9);
                } else {
                    statement.mo5354L(9, ogUrl);
                }
                String mimeType = entity.getMimeType();
                if (mimeType == null) {
                    statement.mo5359u(10);
                } else {
                    statement.mo5354L(10, mimeType);
                }
                statement.mo5356p(11, entity.getFileSize());
                String title = entity.getTitle();
                if (title == null) {
                    statement.mo5359u(12);
                } else {
                    statement.mo5354L(12, title);
                }
                String text = entity.getText();
                if (text == null) {
                    statement.mo5359u(13);
                } else {
                    statement.mo5354L(13, text);
                }
                String type = entity.getType();
                if (type == null) {
                    statement.mo5359u(14);
                } else {
                    statement.mo5354L(14, type);
                }
                String image = entity.getImage();
                if (image == null) {
                    statement.mo5359u(15);
                } else {
                    statement.mo5354L(15, image);
                }
                String name = entity.getName();
                if (name == null) {
                    statement.mo5359u(16);
                } else {
                    statement.mo5354L(16, name);
                }
                String fallback = entity.getFallback();
                if (fallback == null) {
                    statement.mo5359u(17);
                } else {
                    statement.mo5354L(17, fallback);
                }
                String uploadFilePath = entity.getUploadFilePath();
                if (uploadFilePath == null) {
                    statement.mo5359u(18);
                } else {
                    statement.mo5354L(18, uploadFilePath);
                }
                Integer originalHeight = entity.getOriginalHeight();
                if (originalHeight == null) {
                    statement.mo5359u(19);
                } else {
                    statement.mo5356p(19, originalHeight.intValue());
                }
                Integer originalWidth = entity.getOriginalWidth();
                if (originalWidth == null) {
                    statement.mo5359u(20);
                } else {
                    statement.mo5356p(20, originalWidth.intValue());
                }
                String strMapToString = ReplyMessageDao_Impl.this.__extraDataConverter.mapToString(entity.getExtraData());
                if (strMapToString == null) {
                    statement.mo5359u(21);
                } else {
                    statement.mo5354L(21, strMapToString);
                }
                UploadStateEntity uploadState = entity.getUploadState();
                if (uploadState == null) {
                    statement.mo5359u(22);
                    statement.mo5359u(23);
                    return;
                }
                statement.mo5356p(22, uploadState.getStatusCode());
                String errorMessage = uploadState.getErrorMessage();
                if (errorMessage == null) {
                    statement.mo5359u(23);
                } else {
                    statement.mo5354L(23, errorMessage);
                }
            }
        };
        this.__deleteAdapterOfReplyMessageInnerEntity = new C192103();
    }

    /* JADX INFO: renamed from: __fetchRelationshipreplyAttachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalReplyAttachmentEntity */
    private final void m54739x2d5431b(InterfaceC33687a _connection, C0022g _map) throws Exception {
        UploadStateEntity uploadStateEntity;
        C0010c c0010c = (C0010c) _map.keySet();
        C0022g c0022g = c0010c.f25w;
        if (c0022g.isEmpty()) {
            return;
        }
        if (_map.f50y > 999) {
            AbstractC32411b.m101080X(_map, new C16574h(28, this, _connection));
            return;
        }
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("SELECT `id`,`messageId`,`authorName`,`titleLink`,`authorLink`,`thumbUrl`,`imageUrl`,`assetUrl`,`ogUrl`,`mimeType`,`fileSize`,`title`,`text`,`type`,`image`,`name`,`fallback`,`uploadFilePath`,`originalHeight`,`originalWidth`,`extraData`,`statusCode`,`errorMessage` FROM `reply_attachment_inner_entity` WHERE `messageId` IN (");
        AbstractC29125c.m88533j(c0022g.f50y, sbM53374o);
        sbM53374o.append(")");
        String string = sbM53374o.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(string);
        Iterator it = c0010c.iterator();
        int i13 = 1;
        int i14 = 1;
        while (true) {
            AbstractC0038m abstractC0038m = (AbstractC0038m) it;
            if (!abstractC0038m.hasNext()) {
                try {
                    break;
                } catch (Throwable th3) {
                    interfaceC33689cMo68212g1.close();
                    throw th3;
                }
            }
            interfaceC33689cMo68212g1.mo5354L(i14, (String) abstractC0038m.next());
            i14++;
        }
        int iM60657M = AbstractC21598x.m60657M(interfaceC33689cMo68212g1, "messageId");
        if (iM60657M == -1) {
            interfaceC33689cMo68212g1.close();
            return;
        }
        while (interfaceC33689cMo68212g1.mo5355e1()) {
            List list = (List) _map.get(interfaceC33689cMo68212g1.mo5353J0(iM60657M));
            if (list != null) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(0);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i13);
                String strMo5353J2 = interfaceC33689cMo68212g1.isNull(2) ? null : interfaceC33689cMo68212g1.mo5353J0(2);
                String strMo5353J3 = interfaceC33689cMo68212g1.isNull(3) ? null : interfaceC33689cMo68212g1.mo5353J0(3);
                String strMo5353J4 = interfaceC33689cMo68212g1.isNull(4) ? null : interfaceC33689cMo68212g1.mo5353J0(4);
                String strMo5353J5 = interfaceC33689cMo68212g1.isNull(5) ? null : interfaceC33689cMo68212g1.mo5353J0(5);
                String strMo5353J6 = interfaceC33689cMo68212g1.isNull(6) ? null : interfaceC33689cMo68212g1.mo5353J0(6);
                String strMo5353J7 = interfaceC33689cMo68212g1.isNull(7) ? null : interfaceC33689cMo68212g1.mo5353J0(7);
                String strMo5353J8 = interfaceC33689cMo68212g1.isNull(8) ? null : interfaceC33689cMo68212g1.mo5353J0(8);
                String strMo5353J9 = interfaceC33689cMo68212g1.isNull(9) ? null : interfaceC33689cMo68212g1.mo5353J0(9);
                String str = strMo5353J3;
                int i15 = (int) interfaceC33689cMo68212g1.getLong(10);
                String strMo5353J10 = interfaceC33689cMo68212g1.isNull(11) ? null : interfaceC33689cMo68212g1.mo5353J0(11);
                String strMo5353J11 = interfaceC33689cMo68212g1.isNull(12) ? null : interfaceC33689cMo68212g1.mo5353J0(12);
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(13) ? null : interfaceC33689cMo68212g1.mo5353J0(13);
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(14) ? null : interfaceC33689cMo68212g1.mo5353J0(14);
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(15) ? null : interfaceC33689cMo68212g1.mo5353J0(15);
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(16) ? null : interfaceC33689cMo68212g1.mo5353J0(16);
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(17) ? null : interfaceC33689cMo68212g1.mo5353J0(17);
                Integer numValueOf = interfaceC33689cMo68212g1.isNull(18) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(18));
                Integer numValueOf2 = interfaceC33689cMo68212g1.isNull(19) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(19));
                Map<String, Object> mapStringToMap = this.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(20) ? null : interfaceC33689cMo68212g1.mo5353J0(20));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                if (interfaceC33689cMo68212g1.isNull(21) && interfaceC33689cMo68212g1.isNull(22)) {
                    uploadStateEntity = null;
                } else {
                    uploadStateEntity = new UploadStateEntity((int) interfaceC33689cMo68212g1.getLong(21), interfaceC33689cMo68212g1.isNull(22) ? null : interfaceC33689cMo68212g1.mo5353J0(22));
                }
                list.add(new ReplyAttachmentEntity(strMo5353J0, strMo5353J1, strMo5353J2, str, strMo5353J4, strMo5353J5, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, i15, strMo5353J10, strMo5353J11, strMo5353J12, strMo5353J13, strMo5353J14, strMo5353J15, strMo5353J16, numValueOf, numValueOf2, uploadStateEntity, mapStringToMap));
                i13 = 1;
            }
        }
        interfaceC33689cMo68212g1.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: __fetchRelationshipreplyAttachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalReplyAttachmentEntity$lambda$5 */
    public static final C23454a0 m54740xd0942a01(ReplyMessageDao_Impl replyMessageDao_Impl, InterfaceC33687a interfaceC33687a, C0022g _tmpMap) throws Exception {
        AbstractC22676k.m65750j(_tmpMap, "_tmpMap");
        replyMessageDao_Impl.m54739x2d5431b(interfaceC33687a, _tmpMap);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: access$insert$s-282016651, reason: not valid java name */
    public static final Object m134219access$insert$s282016651(ReplyMessageDao_Impl replyMessageDao_Impl, List list, InterfaceC30057d interfaceC30057d) {
        replyMessageDao_Impl.getClass();
        return ReplyMessageDao.insert$suspendImpl(replyMessageDao_Impl, list, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 delete$lambda$2(ReplyMessageDao_Impl replyMessageDao_Impl, ReplyMessageInnerEntity replyMessageInnerEntity, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        replyMessageDao_Impl.__deleteAdapterOfReplyMessageInnerEntity.handle(_connection, replyMessageInnerEntity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteAll$lambda$4(String str, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 insertAttachments$lambda$1(ReplyMessageDao_Impl replyMessageDao_Impl, List list, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        replyMessageDao_Impl.__insertAdapterOfReplyAttachmentEntity.insert(_connection, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 insertInnerEntity$lambda$0(ReplyMessageDao_Impl replyMessageDao_Impl, List list, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        replyMessageDao_Impl.__insertAdapterOfReplyMessageInnerEntity.insert(_connection, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:155:0x03db  */
    /* JADX WARN: Code duplicated, block: B:156:0x03de A[Catch: all -> 0x015b, TryCatch #0 {all -> 0x015b, blocks: (B:3:0x0012, B:4:0x013d, B:6:0x0143, B:8:0x014d, B:12:0x015e, B:14:0x016d, B:18:0x01aa, B:22:0x01c2, B:26:0x01da, B:30:0x01f2, B:34:0x020a, B:38:0x021e, B:42:0x022a, B:46:0x0236, B:48:0x023e, B:53:0x0252, B:58:0x0264, B:63:0x0273, B:67:0x027f, B:69:0x0287, B:74:0x0298, B:79:0x02a7, B:83:0x02b3, B:85:0x02bb, B:90:0x02cc, B:94:0x02dc, B:98:0x02f4, B:103:0x030e, B:107:0x031a, B:109:0x0322, B:113:0x0330, B:117:0x0348, B:122:0x0362, B:126:0x036e, B:128:0x0376, B:132:0x0384, B:137:0x039e, B:139:0x03a4, B:141:0x03ac, B:143:0x03b4, B:145:0x03bc, B:153:0x03d5, B:157:0x03e4, B:161:0x03f3, B:165:0x0402, B:169:0x0416, B:173:0x0424, B:174:0x042b, B:172:0x041f, B:168:0x040b, B:164:0x03fc, B:160:0x03ed, B:156:0x03de, B:136:0x0397, B:131:0x0380, B:175:0x044b, B:176:0x0450, B:125:0x036a, B:121:0x035b, B:116:0x0340, B:112:0x032c, B:177:0x0451, B:178:0x0456, B:106:0x0316, B:102:0x0307, B:97:0x02ec, B:93:0x02d4, B:179:0x0457, B:180:0x045e, B:82:0x02af, B:181:0x045f, B:182:0x0466, B:66:0x027b, B:57:0x025d, B:52:0x024b, B:183:0x0467, B:184:0x046c, B:45:0x0232, B:185:0x046d, B:186:0x0472, B:37:0x021a, B:33:0x0202, B:29:0x01ea, B:25:0x01d2, B:21:0x01ba, B:17:0x01a2), top: B:191:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:160:0x03ed A[Catch: all -> 0x015b, TryCatch #0 {all -> 0x015b, blocks: (B:3:0x0012, B:4:0x013d, B:6:0x0143, B:8:0x014d, B:12:0x015e, B:14:0x016d, B:18:0x01aa, B:22:0x01c2, B:26:0x01da, B:30:0x01f2, B:34:0x020a, B:38:0x021e, B:42:0x022a, B:46:0x0236, B:48:0x023e, B:53:0x0252, B:58:0x0264, B:63:0x0273, B:67:0x027f, B:69:0x0287, B:74:0x0298, B:79:0x02a7, B:83:0x02b3, B:85:0x02bb, B:90:0x02cc, B:94:0x02dc, B:98:0x02f4, B:103:0x030e, B:107:0x031a, B:109:0x0322, B:113:0x0330, B:117:0x0348, B:122:0x0362, B:126:0x036e, B:128:0x0376, B:132:0x0384, B:137:0x039e, B:139:0x03a4, B:141:0x03ac, B:143:0x03b4, B:145:0x03bc, B:153:0x03d5, B:157:0x03e4, B:161:0x03f3, B:165:0x0402, B:169:0x0416, B:173:0x0424, B:174:0x042b, B:172:0x041f, B:168:0x040b, B:164:0x03fc, B:160:0x03ed, B:156:0x03de, B:136:0x0397, B:131:0x0380, B:175:0x044b, B:176:0x0450, B:125:0x036a, B:121:0x035b, B:116:0x0340, B:112:0x032c, B:177:0x0451, B:178:0x0456, B:106:0x0316, B:102:0x0307, B:97:0x02ec, B:93:0x02d4, B:179:0x0457, B:180:0x045e, B:82:0x02af, B:181:0x045f, B:182:0x0466, B:66:0x027b, B:57:0x025d, B:52:0x024b, B:183:0x0467, B:184:0x046c, B:45:0x0232, B:185:0x046d, B:186:0x0472, B:37:0x021a, B:33:0x0202, B:29:0x01ea, B:25:0x01d2, B:21:0x01ba, B:17:0x01a2), top: B:191:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:164:0x03fc A[Catch: all -> 0x015b, TryCatch #0 {all -> 0x015b, blocks: (B:3:0x0012, B:4:0x013d, B:6:0x0143, B:8:0x014d, B:12:0x015e, B:14:0x016d, B:18:0x01aa, B:22:0x01c2, B:26:0x01da, B:30:0x01f2, B:34:0x020a, B:38:0x021e, B:42:0x022a, B:46:0x0236, B:48:0x023e, B:53:0x0252, B:58:0x0264, B:63:0x0273, B:67:0x027f, B:69:0x0287, B:74:0x0298, B:79:0x02a7, B:83:0x02b3, B:85:0x02bb, B:90:0x02cc, B:94:0x02dc, B:98:0x02f4, B:103:0x030e, B:107:0x031a, B:109:0x0322, B:113:0x0330, B:117:0x0348, B:122:0x0362, B:126:0x036e, B:128:0x0376, B:132:0x0384, B:137:0x039e, B:139:0x03a4, B:141:0x03ac, B:143:0x03b4, B:145:0x03bc, B:153:0x03d5, B:157:0x03e4, B:161:0x03f3, B:165:0x0402, B:169:0x0416, B:173:0x0424, B:174:0x042b, B:172:0x041f, B:168:0x040b, B:164:0x03fc, B:160:0x03ed, B:156:0x03de, B:136:0x0397, B:131:0x0380, B:175:0x044b, B:176:0x0450, B:125:0x036a, B:121:0x035b, B:116:0x0340, B:112:0x032c, B:177:0x0451, B:178:0x0456, B:106:0x0316, B:102:0x0307, B:97:0x02ec, B:93:0x02d4, B:179:0x0457, B:180:0x045e, B:82:0x02af, B:181:0x045f, B:182:0x0466, B:66:0x027b, B:57:0x025d, B:52:0x024b, B:183:0x0467, B:184:0x046c, B:45:0x0232, B:185:0x046d, B:186:0x0472, B:37:0x021a, B:33:0x0202, B:29:0x01ea, B:25:0x01d2, B:21:0x01ba, B:17:0x01a2), top: B:191:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0408  */
    /* JADX WARN: Code duplicated, block: B:168:0x040b A[Catch: all -> 0x015b, TryCatch #0 {all -> 0x015b, blocks: (B:3:0x0012, B:4:0x013d, B:6:0x0143, B:8:0x014d, B:12:0x015e, B:14:0x016d, B:18:0x01aa, B:22:0x01c2, B:26:0x01da, B:30:0x01f2, B:34:0x020a, B:38:0x021e, B:42:0x022a, B:46:0x0236, B:48:0x023e, B:53:0x0252, B:58:0x0264, B:63:0x0273, B:67:0x027f, B:69:0x0287, B:74:0x0298, B:79:0x02a7, B:83:0x02b3, B:85:0x02bb, B:90:0x02cc, B:94:0x02dc, B:98:0x02f4, B:103:0x030e, B:107:0x031a, B:109:0x0322, B:113:0x0330, B:117:0x0348, B:122:0x0362, B:126:0x036e, B:128:0x0376, B:132:0x0384, B:137:0x039e, B:139:0x03a4, B:141:0x03ac, B:143:0x03b4, B:145:0x03bc, B:153:0x03d5, B:157:0x03e4, B:161:0x03f3, B:165:0x0402, B:169:0x0416, B:173:0x0424, B:174:0x042b, B:172:0x041f, B:168:0x040b, B:164:0x03fc, B:160:0x03ed, B:156:0x03de, B:136:0x0397, B:131:0x0380, B:175:0x044b, B:176:0x0450, B:125:0x036a, B:121:0x035b, B:116:0x0340, B:112:0x032c, B:177:0x0451, B:178:0x0456, B:106:0x0316, B:102:0x0307, B:97:0x02ec, B:93:0x02d4, B:179:0x0457, B:180:0x045e, B:82:0x02af, B:181:0x045f, B:182:0x0466, B:66:0x027b, B:57:0x025d, B:52:0x024b, B:183:0x0467, B:184:0x046c, B:45:0x0232, B:185:0x046d, B:186:0x0472, B:37:0x021a, B:33:0x0202, B:29:0x01ea, B:25:0x01d2, B:21:0x01ba, B:17:0x01a2), top: B:191:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x041f A[Catch: all -> 0x015b, TryCatch #0 {all -> 0x015b, blocks: (B:3:0x0012, B:4:0x013d, B:6:0x0143, B:8:0x014d, B:12:0x015e, B:14:0x016d, B:18:0x01aa, B:22:0x01c2, B:26:0x01da, B:30:0x01f2, B:34:0x020a, B:38:0x021e, B:42:0x022a, B:46:0x0236, B:48:0x023e, B:53:0x0252, B:58:0x0264, B:63:0x0273, B:67:0x027f, B:69:0x0287, B:74:0x0298, B:79:0x02a7, B:83:0x02b3, B:85:0x02bb, B:90:0x02cc, B:94:0x02dc, B:98:0x02f4, B:103:0x030e, B:107:0x031a, B:109:0x0322, B:113:0x0330, B:117:0x0348, B:122:0x0362, B:126:0x036e, B:128:0x0376, B:132:0x0384, B:137:0x039e, B:139:0x03a4, B:141:0x03ac, B:143:0x03b4, B:145:0x03bc, B:153:0x03d5, B:157:0x03e4, B:161:0x03f3, B:165:0x0402, B:169:0x0416, B:173:0x0424, B:174:0x042b, B:172:0x041f, B:168:0x040b, B:164:0x03fc, B:160:0x03ed, B:156:0x03de, B:136:0x0397, B:131:0x0380, B:175:0x044b, B:176:0x0450, B:125:0x036a, B:121:0x035b, B:116:0x0340, B:112:0x032c, B:177:0x0451, B:178:0x0456, B:106:0x0316, B:102:0x0307, B:97:0x02ec, B:93:0x02d4, B:179:0x0457, B:180:0x045e, B:82:0x02af, B:181:0x045f, B:182:0x0466, B:66:0x027b, B:57:0x025d, B:52:0x024b, B:183:0x0467, B:184:0x046c, B:45:0x0232, B:185:0x046d, B:186:0x0472, B:37:0x021a, B:33:0x0202, B:29:0x01ea, B:25:0x01d2, B:21:0x01ba, B:17:0x01a2), top: B:191:0x0012 }] */
    public static final ReplyMessageEntity selectById$lambda$3(String str, String str2, ReplyMessageDao_Impl replyMessageDao_Impl, InterfaceC33687a _connection) throws Exception {
        int i13;
        int i14;
        int i15;
        int i16;
        ChannelInfoEntity channelInfoEntity;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        Integer numValueOf;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cid");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "userId");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "text");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "html");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "type");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "syncStatus");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyCount");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedReplyCount");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdLocallyAt");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedLocallyAt");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "remoteMentionedUserIds");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mentionedUsersId");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "shadowed");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "i18n");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinned");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedAt");
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinExpires");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedByUserId");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "threadParticipantsIds");
            int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderationDetails");
            int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageTextUpdatedAt");
            int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pollId");
            int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "restrictedVisibility");
            int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.CATEGORY_REMINDER);
            int iM60658N34 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelRole");
            int iM60658N35 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infocid");
            int iM60658N36 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoid");
            int iM60658N37 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infotype");
            int iM60658N38 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infomemberCount");
            int iM60658N39 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoname");
            C0022g c0022g = new C0022g(0);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g.containsKey(strMo5353J3)) {
                    c0022g.put(strMo5353J3, new ArrayList());
                    iM60658N11 = iM60658N11;
                }
            }
            int i17 = iM60658N11;
            interfaceC33689cMo68212g1.reset();
            replyMessageDao_Impl.m54739x2d5431b(_connection, c0022g);
            ReplyMessageEntity replyMessageEntity = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J7 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J8 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J9 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                SyncStatus syncStatusStringToSyncStatus = replyMessageDao_Impl.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N7));
                int i18 = (int) interfaceC33689cMo68212g1.getLong(iM60658N8);
                int i19 = (int) interfaceC33689cMo68212g1.getLong(iM60658N9);
                Date dateFromTimestamp = replyMessageDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N10)));
                Date dateFromTimestamp2 = replyMessageDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i17) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i17)));
                Date dateFromTimestamp3 = replyMessageDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N12) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N12)));
                Date dateFromTimestamp4 = replyMessageDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N13) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N13)));
                Date dateFromTimestamp5 = replyMessageDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N14) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N14)));
                List<String> stringList = replyMessageDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N15) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N15));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                List<String> stringList2 = replyMessageDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N16) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N16));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                String strMo5353J10 = interfaceC33689cMo68212g1.isNull(iM60658N17) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N17);
                String strMo5353J11 = interfaceC33689cMo68212g1.isNull(iM60658N18) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N18);
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N19)) != 0;
                Map<String, String> mapStringToStringMap = replyMessageDao_Impl.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(iM60658N20) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N20));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N21)) != 0;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N22)) != 0;
                Map<String, Object> mapStringToMap = replyMessageDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N23) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N23));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N24)) != 0;
                Date dateFromTimestamp6 = replyMessageDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N25) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N25)));
                Date dateFromTimestamp7 = replyMessageDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N26) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N26)));
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(iM60658N27) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N27);
                List<String> stringList3 = replyMessageDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N28) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N28));
                if (stringList3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                ModerationDetailsEntity moderationDetailsEntityStringToModerationDetails = replyMessageDao_Impl.__moderationDetailsConverter.stringToModerationDetails(interfaceC33689cMo68212g1.isNull(iM60658N29) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N29));
                Date dateFromTimestamp8 = replyMessageDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N30) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N30)));
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(iM60658N31) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N31);
                List<String> stringList4 = replyMessageDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N32) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N32));
                if (stringList4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                ReminderInfoEntity reminderInfoEntityStringToReminderInfo = replyMessageDao_Impl.__reminderInfoConverter.stringToReminderInfo(interfaceC33689cMo68212g1.isNull(iM60658N33) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N33));
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(iM60658N34) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N34);
                if (interfaceC33689cMo68212g1.isNull(iM60658N35)) {
                    i13 = iM60658N36;
                    if (interfaceC33689cMo68212g1.isNull(i13)) {
                        i14 = iM60658N37;
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            i15 = iM60658N38;
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                i16 = iM60658N39;
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    channelInfoEntity = null;
                                }
                                ReplyMessageInnerEntity replyMessageInnerEntity = new ReplyMessageInnerEntity(strMo5353J4, strMo5353J5, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, syncStatusStringToSyncStatus, i18, i19, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, strMo5353J10, strMo5353J11, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J12, stringList3, moderationDetailsEntityStringToModerationDetails, dateFromTimestamp8, strMo5353J13, stringList4, reminderInfoEntityStringToReminderInfo, strMo5353J14);
                                Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                                AbstractC22676k.m65749i(objM73986U, "getValue(...)");
                                replyMessageEntity = new ReplyMessageEntity(replyMessageInnerEntity, (List) objM73986U);
                            }
                            if (interfaceC33689cMo68212g1.isNull(iM60658N35)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N35);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i13)) {
                                strMo5353J1 = null;
                            } else {
                                strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i13);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i14)) {
                                strMo5353J2 = null;
                            } else {
                                strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i14);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i15));
                            }
                            channelInfoEntity = new ChannelInfoEntity(strMo5353J0, strMo5353J1, strMo5353J2, numValueOf, interfaceC33689cMo68212g1.isNull(i16) ? null : interfaceC33689cMo68212g1.mo5353J0(i16));
                            ReplyMessageInnerEntity replyMessageInnerEntity2 = new ReplyMessageInnerEntity(strMo5353J4, strMo5353J5, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, syncStatusStringToSyncStatus, i18, i19, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, strMo5353J10, strMo5353J11, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J12, stringList3, moderationDetailsEntityStringToModerationDetails, dateFromTimestamp8, strMo5353J13, stringList4, reminderInfoEntityStringToReminderInfo, strMo5353J14);
                            Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                            AbstractC22676k.m65749i(objM73986U2, "getValue(...)");
                            replyMessageEntity = new ReplyMessageEntity(replyMessageInnerEntity2, (List) objM73986U2);
                        }
                        i16 = iM60658N39;
                        if (interfaceC33689cMo68212g1.isNull(iM60658N35)) {
                            strMo5353J0 = null;
                        } else {
                            strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N35);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i13)) {
                            strMo5353J1 = null;
                        } else {
                            strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i13);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            strMo5353J2 = null;
                        } else {
                            strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i14);
                        }
                        if (interfaceC33689cMo68212g1.isNull(i15)) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i15));
                        }
                        channelInfoEntity = new ChannelInfoEntity(strMo5353J0, strMo5353J1, strMo5353J2, numValueOf, interfaceC33689cMo68212g1.isNull(i16) ? null : interfaceC33689cMo68212g1.mo5353J0(i16));
                        ReplyMessageInnerEntity replyMessageInnerEntity3 = new ReplyMessageInnerEntity(strMo5353J4, strMo5353J5, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, syncStatusStringToSyncStatus, i18, i19, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, strMo5353J10, strMo5353J11, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J12, stringList3, moderationDetailsEntityStringToModerationDetails, dateFromTimestamp8, strMo5353J13, stringList4, reminderInfoEntityStringToReminderInfo, strMo5353J14);
                        Object objM73986U3 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                        AbstractC22676k.m65749i(objM73986U3, "getValue(...)");
                        replyMessageEntity = new ReplyMessageEntity(replyMessageInnerEntity3, (List) objM73986U3);
                    }
                    i15 = iM60658N38;
                    i16 = iM60658N39;
                    if (interfaceC33689cMo68212g1.isNull(iM60658N35)) {
                        strMo5353J0 = null;
                    } else {
                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N35);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i13)) {
                        strMo5353J1 = null;
                    } else {
                        strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i13);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i14)) {
                        strMo5353J2 = null;
                    } else {
                        strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i14);
                    }
                    if (interfaceC33689cMo68212g1.isNull(i15)) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i15));
                    }
                    channelInfoEntity = new ChannelInfoEntity(strMo5353J0, strMo5353J1, strMo5353J2, numValueOf, interfaceC33689cMo68212g1.isNull(i16) ? null : interfaceC33689cMo68212g1.mo5353J0(i16));
                    ReplyMessageInnerEntity replyMessageInnerEntity4 = new ReplyMessageInnerEntity(strMo5353J4, strMo5353J5, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, syncStatusStringToSyncStatus, i18, i19, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, strMo5353J10, strMo5353J11, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J12, stringList3, moderationDetailsEntityStringToModerationDetails, dateFromTimestamp8, strMo5353J13, stringList4, reminderInfoEntityStringToReminderInfo, strMo5353J14);
                    Object objM73986U4 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                    AbstractC22676k.m65749i(objM73986U4, "getValue(...)");
                    replyMessageEntity = new ReplyMessageEntity(replyMessageInnerEntity4, (List) objM73986U4);
                } else {
                    i13 = iM60658N36;
                }
                i14 = iM60658N37;
                i15 = iM60658N38;
                i16 = iM60658N39;
                if (interfaceC33689cMo68212g1.isNull(iM60658N35)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N35);
                }
                if (interfaceC33689cMo68212g1.isNull(i13)) {
                    strMo5353J1 = null;
                } else {
                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i13);
                }
                if (interfaceC33689cMo68212g1.isNull(i14)) {
                    strMo5353J2 = null;
                } else {
                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i14);
                }
                if (interfaceC33689cMo68212g1.isNull(i15)) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i15));
                }
                channelInfoEntity = new ChannelInfoEntity(strMo5353J0, strMo5353J1, strMo5353J2, numValueOf, interfaceC33689cMo68212g1.isNull(i16) ? null : interfaceC33689cMo68212g1.mo5353J0(i16));
                ReplyMessageInnerEntity replyMessageInnerEntity5 = new ReplyMessageInnerEntity(strMo5353J4, strMo5353J5, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, syncStatusStringToSyncStatus, i18, i19, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, strMo5353J10, strMo5353J11, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J12, stringList3, moderationDetailsEntityStringToModerationDetails, dateFromTimestamp8, strMo5353J13, stringList4, reminderInfoEntityStringToReminderInfo, strMo5353J14);
                Object objM73986U5 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                AbstractC22676k.m65749i(objM73986U5, "getValue(...)");
                replyMessageEntity = new ReplyMessageEntity(replyMessageInnerEntity5, (List) objM73986U5);
            }
            interfaceC33689cMo68212g1.close();
            return replyMessageEntity;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao
    public final Object delete(ReplyMessageInnerEntity replyMessageInnerEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C16574h(29, this, replyMessageInnerEntity), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao
    public final Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19031a(12), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao
    public final Object insert(List<ReplyMessageEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44433M = AbstractC15751g.m44433M(this.__db, new C192112(list, null), interfaceC30057d);
        return objM44433M == EnumC31071a.f128113w ? objM44433M : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao
    public final Object insertAttachments(List<ReplyAttachmentEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19220i(this, list, 0), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao
    public final Object insertInnerEntity(List<ReplyMessageInnerEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19220i(this, list, 1), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao
    public final Object selectById(String str, InterfaceC30057d<? super ReplyMessageEntity> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, true, new C16574h(27, str, this), interfaceC30057d);
    }
}
