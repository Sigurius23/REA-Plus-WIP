package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import a23.C0175b;
import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1794i;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import com.mapbox.maps.MapboxMap;
import ge3.AbstractC15751g;
import h02.C16574h;
import ht2.C17632d;
import ig0.C18468h;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.DateConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ExtraDataConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ListConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.LocationConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.MapConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ModerationConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ModerationDetailsConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ReactionGroupConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ReminderInfoConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.SyncStatusConverter;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.AttachmentEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.UploadStateEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.channelinfo.internal.ChannelInfoEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity;
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
import p708hb2.C17095c;
import p710im1.C18709z0;
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
@Metadata(m65680d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u0088\u00012\u00020\u0001:\u0002\u0088\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0096@¢\u0006\u0004\b\u0012\u0010\u000eJ\u001e\u0010\u0015\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bH\u0096@¢\u0006\u0004\b\u0015\u0010\u000eJ\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001e\u001a\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000bH\u0096@¢\u0006\u0004\b\u001e\u0010\u000eJ\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010 J\u001d\u0010#\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000bH\u0016¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b%\u0010\nJ\u001e\u0010&\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@¢\u0006\u0004\b&\u0010\u000eJ$\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020!0\u000bH\u0096@¢\u0006\u0004\b(\u0010\u000eJ\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000bH\u0096@¢\u0006\u0004\b)\u0010*J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0096@¢\u0006\u0004\b+\u0010*J\u001a\u0010-\u001a\u0004\u0018\u00010\u00162\u0006\u0010,\u001a\u00020!H\u0096@¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u0004\u0018\u00010\u00162\u0006\u0010/\u001a\u00020!H\u0096@¢\u0006\u0004\b0\u0010.J.\u00105\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010,\u001a\u00020!2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0096@¢\u0006\u0004\b5\u00106J.\u00107\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010,\u001a\u00020!2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0096@¢\u0006\u0004\b7\u00106J.\u00108\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010,\u001a\u00020!2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0096@¢\u0006\u0004\b8\u00106J.\u00109\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010,\u001a\u00020!2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0096@¢\u0006\u0004\b9\u00106J&\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010,\u001a\u00020!2\u0006\u00102\u001a\u000201H\u0096@¢\u0006\u0004\b:\u0010;J&\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010<\u001a\u00020!2\u0006\u00102\u001a\u000201H\u0096@¢\u0006\u0004\b=\u0010;J\u001a\u0010(\u001a\u0004\u0018\u00010\u001c2\u0006\u0010>\u001a\u00020!H\u0096@¢\u0006\u0004\b(\u0010.J$\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020!0\u000bH\u0096@¢\u0006\u0004\b?\u0010\u000eJ&\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010A\u001a\u00020@2\u0006\u00102\u001a\u000201H\u0096@¢\u0006\u0004\bB\u0010CJ\u001e\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010D\u001a\u00020!H\u0096@¢\u0006\u0004\bE\u0010.J&\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010,\u001a\u00020!2\u0006\u0010D\u001a\u00020!H\u0096@¢\u0006\u0004\bF\u0010GJ&\u0010H\u001a\b\u0012\u0004\u0012\u00020!0\u000b2\u0006\u0010A\u001a\u00020@2\u0006\u00102\u001a\u000201H\u0096@¢\u0006\u0004\bH\u0010CJ\u001e\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010I\u001a\u00020!H\u0096@¢\u0006\u0004\bJ\u0010.J:\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b2\u0006\u0010,\u001a\u00020!2\f\u0010K\u001a\b\u0012\u0004\u0012\u0002010\u000b2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020!0\u000bH\u0096@¢\u0006\u0004\bM\u0010NJ\u001d\u0010O\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000bH\u0016¢\u0006\u0004\bO\u0010$J\u0018\u0010P\u001a\u00020\u00112\u0006\u0010<\u001a\u00020!H\u0096@¢\u0006\u0004\bP\u0010.J \u0010R\u001a\u00020\u00112\u0006\u0010,\u001a\u00020!2\u0006\u0010Q\u001a\u000203H\u0096@¢\u0006\u0004\bR\u0010SJ \u0010T\u001a\u00020\u00112\u0006\u0010,\u001a\u00020!2\u0006\u0010<\u001a\u00020!H\u0096@¢\u0006\u0004\bT\u0010GJ\u0018\u0010U\u001a\u00020\u00112\u0006\u0010,\u001a\u00020!H\u0096@¢\u0006\u0004\bU\u0010.J\u001e\u0010U\u001a\u00020\u00112\f\u0010'\u001a\b\u0012\u0004\u0012\u00020!0\u000bH\u0096@¢\u0006\u0004\bU\u0010\u000eJ\u0010\u0010V\u001a\u00020\u0011H\u0096@¢\u0006\u0004\bV\u0010*J\u0010\u0010W\u001a\u00020\u0011H\u0096@¢\u0006\u0004\bW\u0010*J1\u0010]\u001a\u00020\u00112\u0006\u0010Y\u001a\u00020X2\u0018\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0[0ZH\u0002¢\u0006\u0004\b]\u0010^J1\u0010_\u001a\u00020\u00112\u0006\u0010Y\u001a\u00020X2\u0018\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130[0ZH\u0002¢\u0006\u0004\b_\u0010^R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010`R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00060a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u000f0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010cR\u001c\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010cR\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010cR\u001e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u0089\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;", "Landroidx/room/z0;", "__db", "<init>", "(Landroidx/room/z0;)V", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;", "messageInnerEntity", "", "insertMessageInnerEntity", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Lq83/d;)Ljava/lang/Object;", "", "messageInnerEntities", "insertMessageInnerEntities", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;", "attachmentEntities", "Ll83/a0;", "insertAttachments", "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;", "reactions", "insertReactions", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;", "draftMessage", "insertDraftMessages", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Lq83/d;)Ljava/lang/Object;", "updateMessageInnerEntity", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;)V", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;", "messageEntities", "insert", "messageEntity", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;", "", "messageIds", "deleteAttachments", "(Ljava/util/List;)V", "upsertMessageInnerEntity", "upsertMessageInnerEntities", "ids", "select", "selectWaitForAttachments", "(Lq83/d;)Ljava/lang/Object;", "selectDraftMessages", "cid", "selectDraftMessageByCid", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "parentId", "selectDraftMessageByParentId", "", MapboxMap.QFE_LIMIT, "Ljava/util/Date;", "dateFilter", "messagesForChannelNewerThan", "(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;", "messagesForChannelEqualOrNewerThan", "messagesForChannelOlderThan", "messagesForChannelEqualOrOlderThan", "messagesForChannel", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "messageId", "messagesForThread", "id", "selectChunked", "Lio/getstream/chat/android/models/SyncStatus;", "syncStatus", "selectBySyncStatus", "(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;", "userId", "selectByUserId", "selectByCidAndUserId", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "selectIdsBySyncStatus", "pollId", "selectMessagesWithPoll", "syncStatuses", "types", "selectBySyncStatusOrTypeForChannel", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "deleteAttachmentsChunked", "deleteDraftMessage", "deleteMessagesBefore", "deleteChannelMessagesBefore", "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "deleteMessage", "deleteMessages", "deleteAll", "deleteAllDrafts", "Ltb/a;", "_connection", "La0/g;", "", "_map", "__fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity", "(Ltb/a;La0/g;)V", "__fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity", "Landroidx/room/z0;", "Landroidx/room/k;", "__insertAdapterOfMessageInnerEntity", "Landroidx/room/k;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;", "__syncStatusConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/SyncStatusConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "__dateConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "__listConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ListConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;", "__mapConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;", "__extraDataConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;", "__moderationDetailsConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationDetailsConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;", "__moderationConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ModerationConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;", "__reminderInfoConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReminderInfoConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;", "__locationConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/LocationConverter;", "__insertAdapterOfAttachmentEntity", "__insertAdapterOfReactionEntity", "__insertAdapterOfDraftMessageEntity", "Landroidx/room/i;", "__updateAdapterOfMessageInnerEntity", "Landroidx/room/i;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;", "__reactionGroupConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ReactionGroupConverter;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageDao_Impl implements MessageDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final DateConverter __dateConverter;
    private final AbstractC1848z0 __db;
    private final ExtraDataConverter __extraDataConverter;
    private final AbstractC1802k __insertAdapterOfAttachmentEntity;
    private final AbstractC1802k __insertAdapterOfDraftMessageEntity;
    private final AbstractC1802k __insertAdapterOfMessageInnerEntity;
    private final AbstractC1802k __insertAdapterOfReactionEntity;
    private final ListConverter __listConverter;
    private final LocationConverter __locationConverter;
    private final MapConverter __mapConverter;
    private final ModerationConverter __moderationConverter;
    private final ModerationDetailsConverter __moderationDetailsConverter;
    private final ReactionGroupConverter __reactionGroupConverter;
    private final ReminderInfoConverter __reminderInfoConverter;
    private final SyncStatusConverter __syncStatusConverter;
    private final AbstractC1794i __updateAdapterOfMessageInnerEntity;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$Companion;", "", "<init>", "()V", "", "Lj93/d;", "getRequiredConverters", "()Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final List<InterfaceC21461d> getRequiredConverters() {
            return C25271y.f99162w;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl$insert$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl$insert$2", m100430f = "MessageDao_Impl.kt", m100431l = {858}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C191942 extends AbstractC32275i implements Function1 {
        final /* synthetic */ List<MessageEntity> $messageEntities;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191942(List<MessageEntity> list, InterfaceC30057d<? super C191942> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$messageEntities = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return MessageDao_Impl.this.new C191942(this.$messageEntities, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MessageDao_Impl messageDao_Impl = MessageDao_Impl.this;
                List<MessageEntity> list = this.$messageEntities;
                this.label = 1;
                if (MessageDao_Impl.access$insert$s302716459(messageDao_Impl, list, this) == enumC31071a) {
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
            return ((C191942) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl$insert$4 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl$insert$4", m100430f = "MessageDao_Impl.kt", m100431l = {863}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C191954 extends AbstractC32275i implements Function1 {
        final /* synthetic */ MessageEntity $messageEntity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191954(MessageEntity messageEntity, InterfaceC30057d<? super C191954> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$messageEntity = messageEntity;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return MessageDao_Impl.this.new C191954(this.$messageEntity, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MessageDao_Impl messageDao_Impl = MessageDao_Impl.this;
                MessageEntity messageEntity = this.$messageEntity;
                this.label = 1;
                if (MessageDao_Impl.access$insert$s302716459(messageDao_Impl, messageEntity, this) == enumC31071a) {
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
            return ((C191954) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl$select$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl$select$2", m100430f = "MessageDao_Impl.kt", m100431l = {884}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191962 extends AbstractC32275i implements Function1 {
        final /* synthetic */ List<String> $ids;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191962(List<String> list, InterfaceC30057d<? super C191962> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$ids = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return MessageDao_Impl.this.new C191962(this.$ids, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MessageDao_Impl messageDao_Impl = MessageDao_Impl.this;
            List<String> list = this.$ids;
            this.label = 1;
            Object objAccess$select$s302716459 = MessageDao_Impl.access$select$s302716459(messageDao_Impl, list, this);
            return objAccess$select$s302716459 == enumC31071a ? enumC31071a : objAccess$select$s302716459;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
            return ((C191962) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl$selectWaitForAttachments$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl$selectWaitForAttachments$2", m100430f = "MessageDao_Impl.kt", m100431l = {889}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191972 extends AbstractC32275i implements Function1 {
        int label;

        public C191972(InterfaceC30057d<? super C191972> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return MessageDao_Impl.this.new C191972(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MessageDao_Impl messageDao_Impl = MessageDao_Impl.this;
            this.label = 1;
            Object objAccess$selectWaitForAttachments$s302716459 = MessageDao_Impl.access$selectWaitForAttachments$s302716459(messageDao_Impl, this);
            return objAccess$selectWaitForAttachments$s302716459 == enumC31071a ? enumC31071a : objAccess$selectWaitForAttachments$s302716459;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
            return ((C191972) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl$upsertMessageInnerEntities$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl$upsertMessageInnerEntities$2", m100430f = "MessageDao_Impl.kt", m100431l = {879}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C191982 extends AbstractC32275i implements Function1 {
        final /* synthetic */ List<MessageInnerEntity> $messageInnerEntities;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191982(List<MessageInnerEntity> list, InterfaceC30057d<? super C191982> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$messageInnerEntities = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return MessageDao_Impl.this.new C191982(this.$messageInnerEntities, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MessageDao_Impl messageDao_Impl = MessageDao_Impl.this;
                List<MessageInnerEntity> list = this.$messageInnerEntities;
                this.label = 1;
                if (MessageDao_Impl.access$upsertMessageInnerEntities$s302716459(messageDao_Impl, list, this) == enumC31071a) {
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
            return ((C191982) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl$upsertMessageInnerEntity$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl$upsertMessageInnerEntity$2", m100430f = "MessageDao_Impl.kt", m100431l = {873}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C191992 extends AbstractC32275i implements Function1 {
        final /* synthetic */ MessageInnerEntity $messageInnerEntity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191992(MessageInnerEntity messageInnerEntity, InterfaceC30057d<? super C191992> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$messageInnerEntity = messageInnerEntity;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return MessageDao_Impl.this.new C191992(this.$messageInnerEntity, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MessageDao_Impl messageDao_Impl = MessageDao_Impl.this;
                MessageInnerEntity messageInnerEntity = this.$messageInnerEntity;
                this.label = 1;
                if (MessageDao_Impl.access$upsertMessageInnerEntity$s302716459(messageDao_Impl, messageInnerEntity, this) == enumC31071a) {
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
            return ((C191992) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public MessageDao_Impl(AbstractC1848z0 __db) {
        AbstractC22676k.m65750j(__db, "__db");
        this.__syncStatusConverter = new SyncStatusConverter();
        this.__dateConverter = new DateConverter();
        this.__listConverter = new ListConverter();
        this.__mapConverter = new MapConverter();
        this.__extraDataConverter = new ExtraDataConverter();
        this.__moderationDetailsConverter = new ModerationDetailsConverter();
        this.__moderationConverter = new ModerationConverter();
        this.__reminderInfoConverter = new ReminderInfoConverter();
        this.__locationConverter = new LocationConverter();
        this.__reactionGroupConverter = new ReactionGroupConverter();
        this.__db = __db;
        this.__insertAdapterOfMessageInnerEntity = new AbstractC1802k() { // from class: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl.1
            @Override // androidx.room.AbstractC1802k
            public final String createQuery() {
                return "INSERT OR IGNORE INTO `stream_chat_message` (`id`,`cid`,`userId`,`text`,`html`,`type`,`syncStatus`,`replyCount`,`deletedReplyCount`,`createdAt`,`createdLocallyAt`,`updatedAt`,`updatedLocallyAt`,`deletedAt`,`remoteMentionedUserIds`,`mentionedUsersId`,`reactionCounts`,`reactionScores`,`reactionGroups`,`parentId`,`command`,`shadowed`,`i18n`,`showInChannel`,`silent`,`extraData`,`replyToId`,`pinned`,`pinnedAt`,`pinExpires`,`pinnedByUserId`,`threadParticipantsIds`,`skipPushNotification`,`skipEnrichUrl`,`moderationDetails`,`moderation`,`messageTextUpdatedAt`,`pollId`,`restrictedVisibility`,`reminder`,`sharedLocation`,`channelRole`,`deletedForMe`,`channel_infocid`,`channel_infoid`,`channel_infotype`,`channel_infomemberCount`,`channel_infoname`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC1802k
            public final void bind(InterfaceC33689c statement, MessageInnerEntity entity) {
                AbstractC22676k.m65750j(statement, "statement");
                AbstractC22676k.m65750j(entity, "entity");
                statement.mo5354L(1, entity.getId());
                statement.mo5354L(2, entity.getCid());
                statement.mo5354L(3, entity.getUserId());
                statement.mo5354L(4, entity.getText());
                statement.mo5354L(5, entity.getHtml());
                statement.mo5354L(6, entity.getType());
                statement.mo5356p(7, MessageDao_Impl.this.__syncStatusConverter.syncStatusToString(entity.getSyncStatus()));
                statement.mo5356p(8, entity.getReplyCount());
                statement.mo5356p(9, entity.getDeletedReplyCount());
                Long lDateToTimestamp = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getCreatedAt());
                if (lDateToTimestamp == null) {
                    statement.mo5359u(10);
                } else {
                    statement.mo5356p(10, lDateToTimestamp.longValue());
                }
                Long lDateToTimestamp2 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getCreatedLocallyAt());
                if (lDateToTimestamp2 == null) {
                    statement.mo5359u(11);
                } else {
                    statement.mo5356p(11, lDateToTimestamp2.longValue());
                }
                Long lDateToTimestamp3 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getUpdatedAt());
                if (lDateToTimestamp3 == null) {
                    statement.mo5359u(12);
                } else {
                    statement.mo5356p(12, lDateToTimestamp3.longValue());
                }
                Long lDateToTimestamp4 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getUpdatedLocallyAt());
                if (lDateToTimestamp4 == null) {
                    statement.mo5359u(13);
                } else {
                    statement.mo5356p(13, lDateToTimestamp4.longValue());
                }
                Long lDateToTimestamp5 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getDeletedAt());
                if (lDateToTimestamp5 == null) {
                    statement.mo5359u(14);
                } else {
                    statement.mo5356p(14, lDateToTimestamp5.longValue());
                }
                String strFromStringList = MessageDao_Impl.this.__listConverter.fromStringList(entity.getRemoteMentionedUserIds());
                if (strFromStringList == null) {
                    statement.mo5359u(15);
                } else {
                    statement.mo5354L(15, strFromStringList);
                }
                String strFromStringList2 = MessageDao_Impl.this.__listConverter.fromStringList(entity.getMentionedUsersId());
                if (strFromStringList2 == null) {
                    statement.mo5359u(16);
                } else {
                    statement.mo5354L(16, strFromStringList2);
                }
                String strMapToString = MessageDao_Impl.this.__mapConverter.mapToString(entity.getReactionCounts());
                if (strMapToString == null) {
                    statement.mo5359u(17);
                } else {
                    statement.mo5354L(17, strMapToString);
                }
                String strMapToString2 = MessageDao_Impl.this.__mapConverter.mapToString(entity.getReactionScores());
                if (strMapToString2 == null) {
                    statement.mo5359u(18);
                } else {
                    statement.mo5354L(18, strMapToString2);
                }
                String strMapToString3 = MessageDao_Impl.this.__extraDataConverter.mapToString(entity.getReactionGroups());
                if (strMapToString3 == null) {
                    statement.mo5359u(19);
                } else {
                    statement.mo5354L(19, strMapToString3);
                }
                String parentId = entity.getParentId();
                if (parentId == null) {
                    statement.mo5359u(20);
                } else {
                    statement.mo5354L(20, parentId);
                }
                String command = entity.getCommand();
                if (command == null) {
                    statement.mo5359u(21);
                } else {
                    statement.mo5354L(21, command);
                }
                statement.mo5356p(22, entity.getShadowed() ? 1L : 0L);
                String strStringMapToString = MessageDao_Impl.this.__mapConverter.stringMapToString(entity.getI18n());
                if (strStringMapToString == null) {
                    statement.mo5359u(23);
                } else {
                    statement.mo5354L(23, strStringMapToString);
                }
                statement.mo5356p(24, entity.getShowInChannel() ? 1L : 0L);
                statement.mo5356p(25, entity.getSilent() ? 1L : 0L);
                String strMapToString4 = MessageDao_Impl.this.__extraDataConverter.mapToString(entity.getExtraData());
                if (strMapToString4 == null) {
                    statement.mo5359u(26);
                } else {
                    statement.mo5354L(26, strMapToString4);
                }
                String replyToId = entity.getReplyToId();
                if (replyToId == null) {
                    statement.mo5359u(27);
                } else {
                    statement.mo5354L(27, replyToId);
                }
                statement.mo5356p(28, entity.getPinned() ? 1L : 0L);
                Long lDateToTimestamp6 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getPinnedAt());
                if (lDateToTimestamp6 == null) {
                    statement.mo5359u(29);
                } else {
                    statement.mo5356p(29, lDateToTimestamp6.longValue());
                }
                Long lDateToTimestamp7 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getPinExpires());
                if (lDateToTimestamp7 == null) {
                    statement.mo5359u(30);
                } else {
                    statement.mo5356p(30, lDateToTimestamp7.longValue());
                }
                String pinnedByUserId = entity.getPinnedByUserId();
                if (pinnedByUserId == null) {
                    statement.mo5359u(31);
                } else {
                    statement.mo5354L(31, pinnedByUserId);
                }
                String strFromStringList3 = MessageDao_Impl.this.__listConverter.fromStringList(entity.getThreadParticipantsIds());
                if (strFromStringList3 == null) {
                    statement.mo5359u(32);
                } else {
                    statement.mo5354L(32, strFromStringList3);
                }
                statement.mo5356p(33, entity.getSkipPushNotification() ? 1L : 0L);
                statement.mo5356p(34, entity.getSkipEnrichUrl() ? 1L : 0L);
                String strModerationDetailsToString = MessageDao_Impl.this.__moderationDetailsConverter.moderationDetailsToString(entity.getModerationDetails());
                if (strModerationDetailsToString == null) {
                    statement.mo5359u(35);
                } else {
                    statement.mo5354L(35, strModerationDetailsToString);
                }
                String strModerationToString = MessageDao_Impl.this.__moderationConverter.moderationToString(entity.getModeration());
                if (strModerationToString == null) {
                    statement.mo5359u(36);
                } else {
                    statement.mo5354L(36, strModerationToString);
                }
                Long lDateToTimestamp8 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getMessageTextUpdatedAt());
                if (lDateToTimestamp8 == null) {
                    statement.mo5359u(37);
                } else {
                    statement.mo5356p(37, lDateToTimestamp8.longValue());
                }
                String pollId = entity.getPollId();
                if (pollId == null) {
                    statement.mo5359u(38);
                } else {
                    statement.mo5354L(38, pollId);
                }
                String strFromStringList4 = MessageDao_Impl.this.__listConverter.fromStringList(entity.getRestrictedVisibility());
                if (strFromStringList4 == null) {
                    statement.mo5359u(39);
                } else {
                    statement.mo5354L(39, strFromStringList4);
                }
                String strReminderInfoToString = MessageDao_Impl.this.__reminderInfoConverter.reminderInfoToString(entity.getReminder());
                if (strReminderInfoToString == null) {
                    statement.mo5359u(40);
                } else {
                    statement.mo5354L(40, strReminderInfoToString);
                }
                String strLocationToString = MessageDao_Impl.this.__locationConverter.locationToString(entity.getSharedLocation());
                if (strLocationToString == null) {
                    statement.mo5359u(41);
                } else {
                    statement.mo5354L(41, strLocationToString);
                }
                String channelRole = entity.getChannelRole();
                if (channelRole == null) {
                    statement.mo5359u(42);
                } else {
                    statement.mo5354L(42, channelRole);
                }
                statement.mo5356p(43, entity.getDeletedForMe() ? 1L : 0L);
                ChannelInfoEntity channelInfo = entity.getChannelInfo();
                if (channelInfo == null) {
                    statement.mo5359u(44);
                    statement.mo5359u(45);
                    statement.mo5359u(46);
                    statement.mo5359u(47);
                    statement.mo5359u(48);
                    return;
                }
                String cid = channelInfo.getCid();
                if (cid == null) {
                    statement.mo5359u(44);
                } else {
                    statement.mo5354L(44, cid);
                }
                String id4 = channelInfo.getId();
                if (id4 == null) {
                    statement.mo5359u(45);
                } else {
                    statement.mo5354L(45, id4);
                }
                String type = channelInfo.getType();
                if (type == null) {
                    statement.mo5359u(46);
                } else {
                    statement.mo5354L(46, type);
                }
                Integer memberCount = channelInfo.getMemberCount();
                if (memberCount == null) {
                    statement.mo5359u(47);
                } else {
                    statement.mo5356p(47, memberCount.intValue());
                }
                String name = channelInfo.getName();
                if (name == null) {
                    statement.mo5359u(48);
                } else {
                    statement.mo5354L(48, name);
                }
            }
        };
        this.__insertAdapterOfAttachmentEntity = new AbstractC1802k() { // from class: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl.2
            @Override // androidx.room.AbstractC1802k
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `attachment_inner_entity` (`id`,`messageId`,`authorName`,`titleLink`,`authorLink`,`thumbUrl`,`imageUrl`,`assetUrl`,`ogUrl`,`mimeType`,`fileSize`,`title`,`text`,`type`,`image`,`name`,`fallback`,`uploadFilePath`,`originalHeight`,`originalWidth`,`extraData`,`statusCode`,`errorMessage`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC1802k
            public final void bind(InterfaceC33689c statement, AttachmentEntity entity) {
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
                String strMapToString = MessageDao_Impl.this.__extraDataConverter.mapToString(entity.getExtraData());
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
        this.__insertAdapterOfReactionEntity = new AbstractC1802k() { // from class: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl.3
            @Override // androidx.room.AbstractC1802k
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `stream_chat_reaction` (`messageId`,`userId`,`type`,`score`,`createdAt`,`createdLocallyAt`,`updatedAt`,`deletedAt`,`enforceUnique`,`skipPush`,`emojiCode`,`extraData`,`syncStatus`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC1802k
            public final void bind(InterfaceC33689c statement, ReactionEntity entity) {
                AbstractC22676k.m65750j(statement, "statement");
                AbstractC22676k.m65750j(entity, "entity");
                statement.mo5354L(1, entity.getMessageId());
                statement.mo5354L(2, entity.getUserId());
                statement.mo5354L(3, entity.getType());
                statement.mo5356p(4, entity.getScore());
                Long lDateToTimestamp = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getCreatedAt());
                if (lDateToTimestamp == null) {
                    statement.mo5359u(5);
                } else {
                    statement.mo5356p(5, lDateToTimestamp.longValue());
                }
                Long lDateToTimestamp2 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getCreatedLocallyAt());
                if (lDateToTimestamp2 == null) {
                    statement.mo5359u(6);
                } else {
                    statement.mo5356p(6, lDateToTimestamp2.longValue());
                }
                Long lDateToTimestamp3 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getUpdatedAt());
                if (lDateToTimestamp3 == null) {
                    statement.mo5359u(7);
                } else {
                    statement.mo5356p(7, lDateToTimestamp3.longValue());
                }
                Long lDateToTimestamp4 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getDeletedAt());
                if (lDateToTimestamp4 == null) {
                    statement.mo5359u(8);
                } else {
                    statement.mo5356p(8, lDateToTimestamp4.longValue());
                }
                statement.mo5356p(9, entity.getEnforceUnique() ? 1L : 0L);
                statement.mo5356p(10, entity.getSkipPush() ? 1L : 0L);
                String emojiCode = entity.getEmojiCode();
                if (emojiCode == null) {
                    statement.mo5359u(11);
                } else {
                    statement.mo5354L(11, emojiCode);
                }
                String strMapToString = MessageDao_Impl.this.__extraDataConverter.mapToString(entity.getExtraData());
                if (strMapToString == null) {
                    statement.mo5359u(12);
                } else {
                    statement.mo5354L(12, strMapToString);
                }
                statement.mo5356p(13, MessageDao_Impl.this.__syncStatusConverter.syncStatusToString(entity.getSyncStatus()));
                statement.mo5356p(14, entity.getId());
            }
        };
        this.__insertAdapterOfDraftMessageEntity = new AbstractC1802k() { // from class: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl.4
            @Override // androidx.room.AbstractC1802k
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `stream_chat_draft_message_entity` (`id`,`cid`,`text`,`parentId`,`mentionedUsersIds`,`silent`,`showInChannel`,`replyMessageId`,`command`,`args`,`extraData`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC1802k
            public final void bind(InterfaceC33689c statement, DraftMessageEntity entity) {
                AbstractC22676k.m65750j(statement, "statement");
                AbstractC22676k.m65750j(entity, "entity");
                statement.mo5354L(1, entity.getId());
                statement.mo5354L(2, entity.getCid());
                statement.mo5354L(3, entity.getText());
                String parentId = entity.getParentId();
                if (parentId == null) {
                    statement.mo5359u(4);
                } else {
                    statement.mo5354L(4, parentId);
                }
                String strFromStringList = MessageDao_Impl.this.__listConverter.fromStringList(entity.getMentionedUsersIds());
                if (strFromStringList == null) {
                    statement.mo5359u(5);
                } else {
                    statement.mo5354L(5, strFromStringList);
                }
                statement.mo5356p(6, entity.getSilent() ? 1L : 0L);
                statement.mo5356p(7, entity.getShowInChannel() ? 1L : 0L);
                String replyMessageId = entity.getReplyMessageId();
                if (replyMessageId == null) {
                    statement.mo5359u(8);
                } else {
                    statement.mo5354L(8, replyMessageId);
                }
                String command = entity.getCommand();
                if (command == null) {
                    statement.mo5359u(9);
                } else {
                    statement.mo5354L(9, command);
                }
                String args = entity.getArgs();
                if (args == null) {
                    statement.mo5359u(10);
                } else {
                    statement.mo5354L(10, args);
                }
                String strMapToString = MessageDao_Impl.this.__extraDataConverter.mapToString(entity.getExtraData());
                if (strMapToString == null) {
                    statement.mo5359u(11);
                } else {
                    statement.mo5354L(11, strMapToString);
                }
            }
        };
        this.__updateAdapterOfMessageInnerEntity = new AbstractC1794i() { // from class: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl.5
            @Override // androidx.room.AbstractC1794i
            public final String createQuery() {
                return "UPDATE OR REPLACE `stream_chat_message` SET `id` = ?,`cid` = ?,`userId` = ?,`text` = ?,`html` = ?,`type` = ?,`syncStatus` = ?,`replyCount` = ?,`deletedReplyCount` = ?,`createdAt` = ?,`createdLocallyAt` = ?,`updatedAt` = ?,`updatedLocallyAt` = ?,`deletedAt` = ?,`remoteMentionedUserIds` = ?,`mentionedUsersId` = ?,`reactionCounts` = ?,`reactionScores` = ?,`reactionGroups` = ?,`parentId` = ?,`command` = ?,`shadowed` = ?,`i18n` = ?,`showInChannel` = ?,`silent` = ?,`extraData` = ?,`replyToId` = ?,`pinned` = ?,`pinnedAt` = ?,`pinExpires` = ?,`pinnedByUserId` = ?,`threadParticipantsIds` = ?,`skipPushNotification` = ?,`skipEnrichUrl` = ?,`moderationDetails` = ?,`moderation` = ?,`messageTextUpdatedAt` = ?,`pollId` = ?,`restrictedVisibility` = ?,`reminder` = ?,`sharedLocation` = ?,`channelRole` = ?,`deletedForMe` = ?,`channel_infocid` = ?,`channel_infoid` = ?,`channel_infotype` = ?,`channel_infomemberCount` = ?,`channel_infoname` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.AbstractC1794i
            public final void bind(InterfaceC33689c statement, MessageInnerEntity entity) {
                AbstractC22676k.m65750j(statement, "statement");
                AbstractC22676k.m65750j(entity, "entity");
                statement.mo5354L(1, entity.getId());
                statement.mo5354L(2, entity.getCid());
                statement.mo5354L(3, entity.getUserId());
                statement.mo5354L(4, entity.getText());
                statement.mo5354L(5, entity.getHtml());
                statement.mo5354L(6, entity.getType());
                statement.mo5356p(7, MessageDao_Impl.this.__syncStatusConverter.syncStatusToString(entity.getSyncStatus()));
                statement.mo5356p(8, entity.getReplyCount());
                statement.mo5356p(9, entity.getDeletedReplyCount());
                Long lDateToTimestamp = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getCreatedAt());
                if (lDateToTimestamp == null) {
                    statement.mo5359u(10);
                } else {
                    statement.mo5356p(10, lDateToTimestamp.longValue());
                }
                Long lDateToTimestamp2 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getCreatedLocallyAt());
                if (lDateToTimestamp2 == null) {
                    statement.mo5359u(11);
                } else {
                    statement.mo5356p(11, lDateToTimestamp2.longValue());
                }
                Long lDateToTimestamp3 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getUpdatedAt());
                if (lDateToTimestamp3 == null) {
                    statement.mo5359u(12);
                } else {
                    statement.mo5356p(12, lDateToTimestamp3.longValue());
                }
                Long lDateToTimestamp4 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getUpdatedLocallyAt());
                if (lDateToTimestamp4 == null) {
                    statement.mo5359u(13);
                } else {
                    statement.mo5356p(13, lDateToTimestamp4.longValue());
                }
                Long lDateToTimestamp5 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getDeletedAt());
                if (lDateToTimestamp5 == null) {
                    statement.mo5359u(14);
                } else {
                    statement.mo5356p(14, lDateToTimestamp5.longValue());
                }
                String strFromStringList = MessageDao_Impl.this.__listConverter.fromStringList(entity.getRemoteMentionedUserIds());
                if (strFromStringList == null) {
                    statement.mo5359u(15);
                } else {
                    statement.mo5354L(15, strFromStringList);
                }
                String strFromStringList2 = MessageDao_Impl.this.__listConverter.fromStringList(entity.getMentionedUsersId());
                if (strFromStringList2 == null) {
                    statement.mo5359u(16);
                } else {
                    statement.mo5354L(16, strFromStringList2);
                }
                String strMapToString = MessageDao_Impl.this.__mapConverter.mapToString(entity.getReactionCounts());
                if (strMapToString == null) {
                    statement.mo5359u(17);
                } else {
                    statement.mo5354L(17, strMapToString);
                }
                String strMapToString2 = MessageDao_Impl.this.__mapConverter.mapToString(entity.getReactionScores());
                if (strMapToString2 == null) {
                    statement.mo5359u(18);
                } else {
                    statement.mo5354L(18, strMapToString2);
                }
                String strMapToString3 = MessageDao_Impl.this.__extraDataConverter.mapToString(entity.getReactionGroups());
                if (strMapToString3 == null) {
                    statement.mo5359u(19);
                } else {
                    statement.mo5354L(19, strMapToString3);
                }
                String parentId = entity.getParentId();
                if (parentId == null) {
                    statement.mo5359u(20);
                } else {
                    statement.mo5354L(20, parentId);
                }
                String command = entity.getCommand();
                if (command == null) {
                    statement.mo5359u(21);
                } else {
                    statement.mo5354L(21, command);
                }
                statement.mo5356p(22, entity.getShadowed() ? 1L : 0L);
                String strStringMapToString = MessageDao_Impl.this.__mapConverter.stringMapToString(entity.getI18n());
                if (strStringMapToString == null) {
                    statement.mo5359u(23);
                } else {
                    statement.mo5354L(23, strStringMapToString);
                }
                statement.mo5356p(24, entity.getShowInChannel() ? 1L : 0L);
                statement.mo5356p(25, entity.getSilent() ? 1L : 0L);
                String strMapToString4 = MessageDao_Impl.this.__extraDataConverter.mapToString(entity.getExtraData());
                if (strMapToString4 == null) {
                    statement.mo5359u(26);
                } else {
                    statement.mo5354L(26, strMapToString4);
                }
                String replyToId = entity.getReplyToId();
                if (replyToId == null) {
                    statement.mo5359u(27);
                } else {
                    statement.mo5354L(27, replyToId);
                }
                statement.mo5356p(28, entity.getPinned() ? 1L : 0L);
                Long lDateToTimestamp6 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getPinnedAt());
                if (lDateToTimestamp6 == null) {
                    statement.mo5359u(29);
                } else {
                    statement.mo5356p(29, lDateToTimestamp6.longValue());
                }
                Long lDateToTimestamp7 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getPinExpires());
                if (lDateToTimestamp7 == null) {
                    statement.mo5359u(30);
                } else {
                    statement.mo5356p(30, lDateToTimestamp7.longValue());
                }
                String pinnedByUserId = entity.getPinnedByUserId();
                if (pinnedByUserId == null) {
                    statement.mo5359u(31);
                } else {
                    statement.mo5354L(31, pinnedByUserId);
                }
                String strFromStringList3 = MessageDao_Impl.this.__listConverter.fromStringList(entity.getThreadParticipantsIds());
                if (strFromStringList3 == null) {
                    statement.mo5359u(32);
                } else {
                    statement.mo5354L(32, strFromStringList3);
                }
                statement.mo5356p(33, entity.getSkipPushNotification() ? 1L : 0L);
                statement.mo5356p(34, entity.getSkipEnrichUrl() ? 1L : 0L);
                String strModerationDetailsToString = MessageDao_Impl.this.__moderationDetailsConverter.moderationDetailsToString(entity.getModerationDetails());
                if (strModerationDetailsToString == null) {
                    statement.mo5359u(35);
                } else {
                    statement.mo5354L(35, strModerationDetailsToString);
                }
                String strModerationToString = MessageDao_Impl.this.__moderationConverter.moderationToString(entity.getModeration());
                if (strModerationToString == null) {
                    statement.mo5359u(36);
                } else {
                    statement.mo5354L(36, strModerationToString);
                }
                Long lDateToTimestamp8 = MessageDao_Impl.this.__dateConverter.dateToTimestamp(entity.getMessageTextUpdatedAt());
                if (lDateToTimestamp8 == null) {
                    statement.mo5359u(37);
                } else {
                    statement.mo5356p(37, lDateToTimestamp8.longValue());
                }
                String pollId = entity.getPollId();
                if (pollId == null) {
                    statement.mo5359u(38);
                } else {
                    statement.mo5354L(38, pollId);
                }
                String strFromStringList4 = MessageDao_Impl.this.__listConverter.fromStringList(entity.getRestrictedVisibility());
                if (strFromStringList4 == null) {
                    statement.mo5359u(39);
                } else {
                    statement.mo5354L(39, strFromStringList4);
                }
                String strReminderInfoToString = MessageDao_Impl.this.__reminderInfoConverter.reminderInfoToString(entity.getReminder());
                if (strReminderInfoToString == null) {
                    statement.mo5359u(40);
                } else {
                    statement.mo5354L(40, strReminderInfoToString);
                }
                String strLocationToString = MessageDao_Impl.this.__locationConverter.locationToString(entity.getSharedLocation());
                if (strLocationToString == null) {
                    statement.mo5359u(41);
                } else {
                    statement.mo5354L(41, strLocationToString);
                }
                String channelRole = entity.getChannelRole();
                if (channelRole == null) {
                    statement.mo5359u(42);
                } else {
                    statement.mo5354L(42, channelRole);
                }
                statement.mo5356p(43, entity.getDeletedForMe() ? 1L : 0L);
                ChannelInfoEntity channelInfo = entity.getChannelInfo();
                if (channelInfo != null) {
                    String cid = channelInfo.getCid();
                    if (cid == null) {
                        statement.mo5359u(44);
                    } else {
                        statement.mo5354L(44, cid);
                    }
                    String id4 = channelInfo.getId();
                    if (id4 == null) {
                        statement.mo5359u(45);
                    } else {
                        statement.mo5354L(45, id4);
                    }
                    String type = channelInfo.getType();
                    if (type == null) {
                        statement.mo5359u(46);
                    } else {
                        statement.mo5354L(46, type);
                    }
                    Integer memberCount = channelInfo.getMemberCount();
                    if (memberCount == null) {
                        statement.mo5359u(47);
                    } else {
                        statement.mo5356p(47, memberCount.intValue());
                    }
                    String name = channelInfo.getName();
                    if (name == null) {
                        statement.mo5359u(48);
                    } else {
                        statement.mo5354L(48, name);
                    }
                } else {
                    statement.mo5359u(44);
                    statement.mo5359u(45);
                    statement.mo5359u(46);
                    statement.mo5359u(47);
                    statement.mo5359u(48);
                }
                statement.mo5354L(49, entity.getId());
            }
        };
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ ArrayList m54699B(String str, MessageDao_Impl messageDao_Impl, Date date, int i13, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) messagesForChannelNewerThan$lambda$10("SELECT * from stream_chat_message WHERE cid = ? AND (createdAt > ? OR createdLocallyAt > ?) ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END ASC LIMIT ?", str, messageDao_Impl, date, i13, interfaceC33687a);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ ArrayList m54701D(MessageDao_Impl messageDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectDraftMessages$lambda$7("SELECT * FROM stream_chat_draft_message_entity", messageDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ ArrayList m54704G(String str, List list, MessageDao_Impl messageDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectChunked$lambda$17(str, list, messageDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: renamed from: __fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity */
    private final void m54706xafdba081(InterfaceC33687a _connection, C0022g _map) throws Exception {
        UploadStateEntity uploadStateEntity;
        C0010c c0010c = (C0010c) _map.keySet();
        C0022g c0022g = c0010c.f25w;
        if (c0022g.isEmpty()) {
            return;
        }
        if (_map.f50y > 999) {
            AbstractC32411b.m101080X(_map, new C19219h(this, _connection, 1));
            return;
        }
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("SELECT `id`,`messageId`,`authorName`,`titleLink`,`authorLink`,`thumbUrl`,`imageUrl`,`assetUrl`,`ogUrl`,`mimeType`,`fileSize`,`title`,`text`,`type`,`image`,`name`,`fallback`,`uploadFilePath`,`originalHeight`,`originalWidth`,`extraData`,`statusCode`,`errorMessage` FROM `attachment_inner_entity` WHERE `messageId` IN (");
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
                list.add(new AttachmentEntity(strMo5353J0, strMo5353J1, strMo5353J2, str, strMo5353J4, strMo5353J5, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, i15, strMo5353J10, strMo5353J11, strMo5353J12, strMo5353J13, strMo5353J14, strMo5353J15, strMo5353J16, numValueOf, numValueOf2, uploadStateEntity, mapStringToMap));
                i13 = 1;
            }
        }
        interfaceC33689cMo68212g1.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: __fetchRelationshipattachmentInnerEntityAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainMessageAttachmentInternalAttachmentEntity$lambda$32 */
    public static final C23454a0 m54707x47866bf9(MessageDao_Impl messageDao_Impl, InterfaceC33687a interfaceC33687a, C0022g _tmpMap) throws Exception {
        AbstractC22676k.m65750j(_tmpMap, "_tmpMap");
        messageDao_Impl.m54706xafdba081(interfaceC33687a, _tmpMap);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: __fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity */
    private final void m54708xab41a0ef(InterfaceC33687a _connection, C0022g _map) throws Exception {
        _map = _map;
        C0010c c0010c = (C0010c) _map.keySet();
        C0022g c0022g = c0010c.f25w;
        if (c0022g.isEmpty()) {
            return;
        }
        if (_map.f50y > 999) {
            AbstractC32411b.m101080X(_map, new C19219h(this, _connection, 0));
            return;
        }
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("SELECT `messageId`,`userId`,`type`,`score`,`createdAt`,`createdLocallyAt`,`updatedAt`,`deletedAt`,`enforceUnique`,`skipPush`,`emojiCode`,`extraData`,`syncStatus`,`id` FROM `stream_chat_reaction` WHERE `messageId` IN (");
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
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(2);
                int i15 = (int) interfaceC33689cMo68212g1.getLong(3);
                String strMo5353J3 = null;
                Date dateFromTimestamp = this.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(4) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(4)));
                Date dateFromTimestamp2 = this.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(5) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(5)));
                Date dateFromTimestamp3 = this.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(6) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(6)));
                Date dateFromTimestamp4 = this.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(7) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(7)));
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(8)) != 0;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(9)) != 0;
                String strMo5353J4 = interfaceC33689cMo68212g1.isNull(10) ? null : interfaceC33689cMo68212g1.mo5353J0(10);
                if (!interfaceC33689cMo68212g1.isNull(11)) {
                    strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(11);
                }
                Map<String, Object> mapStringToMap = this.__extraDataConverter.stringToMap(strMo5353J3);
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                ReactionEntity reactionEntity = new ReactionEntity(strMo5353J0, strMo5353J1, strMo5353J2, i15, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, z4, z13, strMo5353J4, mapStringToMap, this.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(12)));
                reactionEntity.setId((int) interfaceC33689cMo68212g1.getLong(13));
                list.add(reactionEntity);
                i13 = 1;
            }
        }
        interfaceC33689cMo68212g1.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: __fetchRelationshipstreamChatReactionAsioGetstreamChatAndroidClientInternalOfflineRepositoryDomainReactionInternalReactionEntity$lambda$33 */
    public static final C23454a0 m54709xb5b13ae8(MessageDao_Impl messageDao_Impl, InterfaceC33687a interfaceC33687a, C0022g _tmpMap) throws Exception {
        AbstractC22676k.m65750j(_tmpMap, "_tmpMap");
        messageDao_Impl.m54708xab41a0ef(interfaceC33687a, _tmpMap);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ArrayList m54710a(String str, String str2, List list, int i13, List list2, MessageDao_Impl messageDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectBySyncStatusOrTypeForChannel$lambda$23(str, str2, list, i13, list2, messageDao_Impl, interfaceC33687a);
    }

    public static final Object access$insert$s302716459(MessageDao_Impl messageDao_Impl, MessageEntity messageEntity, InterfaceC30057d interfaceC30057d) {
        messageDao_Impl.getClass();
        return MessageDao.insert$suspendImpl(messageDao_Impl, messageEntity, (InterfaceC30057d<? super C23454a0>) interfaceC30057d);
    }

    public static final Object access$select$s302716459(MessageDao_Impl messageDao_Impl, List list, InterfaceC30057d interfaceC30057d) {
        messageDao_Impl.getClass();
        return MessageDao.select$suspendImpl(messageDao_Impl, list, interfaceC30057d);
    }

    public static final Object access$selectWaitForAttachments$s302716459(MessageDao_Impl messageDao_Impl, InterfaceC30057d interfaceC30057d) {
        messageDao_Impl.getClass();
        return MessageDao.selectWaitForAttachments$suspendImpl(messageDao_Impl, interfaceC30057d);
    }

    public static final Object access$upsertMessageInnerEntities$s302716459(MessageDao_Impl messageDao_Impl, List list, InterfaceC30057d interfaceC30057d) {
        messageDao_Impl.getClass();
        return MessageDao.upsertMessageInnerEntities$suspendImpl(messageDao_Impl, list, interfaceC30057d);
    }

    public static final Object access$upsertMessageInnerEntity$s302716459(MessageDao_Impl messageDao_Impl, MessageInnerEntity messageInnerEntity, InterfaceC30057d interfaceC30057d) {
        messageDao_Impl.getClass();
        return MessageDao.upsertMessageInnerEntity$suspendImpl(messageDao_Impl, messageInnerEntity, interfaceC30057d);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ArrayList m54712c(String str, String str2, MessageDao_Impl messageDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectByCidAndUserId$lambda$20("SELECT * FROM stream_chat_message WHERE cid = ? AND userId = ?", str, str2, messageDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ArrayList m54713d(String str, MessageDao_Impl messageDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectByUserId$lambda$19("SELECT * FROM stream_chat_message WHERE userId = ?", str, messageDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteAll$lambda$30(String str, InterfaceC33687a _connection) throws Exception {
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
    public static final C23454a0 deleteAllDrafts$lambda$31(String str, InterfaceC33687a _connection) throws Exception {
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
    public static final C23454a0 deleteAttachments$lambda$6(MessageDao_Impl messageDao_Impl, List list, InterfaceC33687a interfaceC33687a) {
        AbstractC22676k.m65750j(interfaceC33687a, "<unused var>");
        super.deleteAttachments(list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteAttachmentsChunked$lambda$24(String str, List list, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            Iterator it = list.iterator();
            int i13 = 1;
            while (it.hasNext()) {
                interfaceC33689cMo68212g1.mo5354L(i13, (String) it.next());
                i13++;
            }
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteChannelMessagesBefore$lambda$26(String str, String str2, MessageDao_Impl messageDao_Impl, Date date, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            Long lDateToTimestamp = messageDao_Impl.__dateConverter.dateToTimestamp(date);
            if (lDateToTimestamp == null) {
                interfaceC33689cMo68212g1.mo5359u(2);
            } else {
                interfaceC33689cMo68212g1.mo5356p(2, lDateToTimestamp.longValue());
            }
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteDraftMessage$lambda$25(String str, String str2, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteMessage$lambda$27(String str, String str2, String str3, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            interfaceC33689cMo68212g1.mo5354L(2, str3);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteMessages$lambda$28(String str, String str2, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteMessages$lambda$29(String str, List list, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            Iterator it = list.iterator();
            int i13 = 1;
            while (it.hasNext()) {
                interfaceC33689cMo68212g1.mo5354L(i13, (String) it.next());
                i13++;
            }
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ ArrayList m54715f(String str, MessageDao_Impl messageDao_Impl, Date date, int i13, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) messagesForChannelEqualOrNewerThan$lambda$11("SELECT * from stream_chat_message WHERE cid = ? AND (createdAt >= ? OR createdLocallyAt >= ?) ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END ASC LIMIT ?", str, messageDao_Impl, date, i13, interfaceC33687a);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ ArrayList m54717h(String str, MessageDao_Impl messageDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectMessagesWithPoll$lambda$22("SELECT * FROM stream_chat_message WHERE pollId = ?", str, messageDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 insertAttachments$lambda$2(MessageDao_Impl messageDao_Impl, List list, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        messageDao_Impl.__insertAdapterOfAttachmentEntity.insert(_connection, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 insertDraftMessages$lambda$4(MessageDao_Impl messageDao_Impl, DraftMessageEntity draftMessageEntity, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        messageDao_Impl.__insertAdapterOfDraftMessageEntity.insert(_connection, draftMessageEntity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List insertMessageInnerEntities$lambda$1(MessageDao_Impl messageDao_Impl, List list, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        return messageDao_Impl.__insertAdapterOfMessageInnerEntity.insertAndReturnIdsList(_connection, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long insertMessageInnerEntity$lambda$0(MessageDao_Impl messageDao_Impl, MessageInnerEntity messageInnerEntity, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        return messageDao_Impl.__insertAdapterOfMessageInnerEntity.insertAndReturnId(_connection, messageInnerEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 insertReactions$lambda$3(MessageDao_Impl messageDao_Impl, List list, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        messageDao_Impl.__insertAdapterOfReactionEntity.insert(_connection, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:233:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:234:0x05bf A[Catch: all -> 0x01b9, TryCatch #0 {all -> 0x01b9, blocks: (B:3:0x0014, B:4:0x019e, B:6:0x01a4, B:8:0x01ae, B:12:0x01be, B:14:0x01c8, B:15:0x01d0, B:17:0x01da, B:19:0x01e6, B:20:0x01f9, B:22:0x01ff, B:27:0x0252, B:32:0x026e, B:37:0x028a, B:42:0x02a6, B:47:0x02c2, B:52:0x02da, B:56:0x02e6, B:61:0x02fc, B:63:0x0304, B:68:0x0316, B:72:0x0322, B:77:0x0338, B:79:0x0340, B:83:0x034f, B:85:0x0357, B:90:0x036b, B:95:0x0383, B:100:0x0392, B:105:0x03a2, B:107:0x03aa, B:112:0x03bf, B:117:0x03ce, B:122:0x03de, B:124:0x03e6, B:129:0x03fe, B:134:0x040d, B:139:0x0421, B:144:0x043d, B:149:0x0457, B:154:0x046d, B:156:0x0475, B:161:0x048a, B:166:0x0499, B:171:0x04a9, B:176:0x04c1, B:181:0x04dd, B:186:0x04f7, B:191:0x050d, B:193:0x0515, B:197:0x0524, B:202:0x053c, B:207:0x055a, B:212:0x0569, B:214:0x056f, B:216:0x0577, B:218:0x057f, B:220:0x0589, B:231:0x05b6, B:235:0x05c5, B:239:0x05d4, B:243:0x05e3, B:247:0x05ff, B:251:0x060d, B:252:0x0614, B:250:0x0608, B:246:0x05f0, B:242:0x05dd, B:238:0x05ce, B:234:0x05bf, B:206:0x0553, B:201:0x0537, B:196:0x0520, B:253:0x066f, B:254:0x0674, B:190:0x0504, B:185:0x04f0, B:180:0x04d4, B:175:0x04bc, B:170:0x04a4, B:255:0x0675, B:256:0x067a, B:153:0x0464, B:148:0x0450, B:143:0x0434, B:138:0x0418, B:128:0x03f7, B:257:0x067b, B:258:0x0682, B:121:0x03d9, B:259:0x0683, B:260:0x068a, B:104:0x039d, B:94:0x037c, B:89:0x0364, B:261:0x068b, B:262:0x0692, B:82:0x034b, B:263:0x0693, B:264:0x0698, B:76:0x032f, B:265:0x0699, B:266:0x069e, B:67:0x0311, B:267:0x069f, B:268:0x06a4, B:60:0x02f3, B:269:0x06a5, B:270:0x06aa, B:51:0x02d5, B:46:0x02b9, B:41:0x029d, B:36:0x0281, B:31:0x0265, B:26:0x0245), top: B:275:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:238:0x05ce A[Catch: all -> 0x01b9, TryCatch #0 {all -> 0x01b9, blocks: (B:3:0x0014, B:4:0x019e, B:6:0x01a4, B:8:0x01ae, B:12:0x01be, B:14:0x01c8, B:15:0x01d0, B:17:0x01da, B:19:0x01e6, B:20:0x01f9, B:22:0x01ff, B:27:0x0252, B:32:0x026e, B:37:0x028a, B:42:0x02a6, B:47:0x02c2, B:52:0x02da, B:56:0x02e6, B:61:0x02fc, B:63:0x0304, B:68:0x0316, B:72:0x0322, B:77:0x0338, B:79:0x0340, B:83:0x034f, B:85:0x0357, B:90:0x036b, B:95:0x0383, B:100:0x0392, B:105:0x03a2, B:107:0x03aa, B:112:0x03bf, B:117:0x03ce, B:122:0x03de, B:124:0x03e6, B:129:0x03fe, B:134:0x040d, B:139:0x0421, B:144:0x043d, B:149:0x0457, B:154:0x046d, B:156:0x0475, B:161:0x048a, B:166:0x0499, B:171:0x04a9, B:176:0x04c1, B:181:0x04dd, B:186:0x04f7, B:191:0x050d, B:193:0x0515, B:197:0x0524, B:202:0x053c, B:207:0x055a, B:212:0x0569, B:214:0x056f, B:216:0x0577, B:218:0x057f, B:220:0x0589, B:231:0x05b6, B:235:0x05c5, B:239:0x05d4, B:243:0x05e3, B:247:0x05ff, B:251:0x060d, B:252:0x0614, B:250:0x0608, B:246:0x05f0, B:242:0x05dd, B:238:0x05ce, B:234:0x05bf, B:206:0x0553, B:201:0x0537, B:196:0x0520, B:253:0x066f, B:254:0x0674, B:190:0x0504, B:185:0x04f0, B:180:0x04d4, B:175:0x04bc, B:170:0x04a4, B:255:0x0675, B:256:0x067a, B:153:0x0464, B:148:0x0450, B:143:0x0434, B:138:0x0418, B:128:0x03f7, B:257:0x067b, B:258:0x0682, B:121:0x03d9, B:259:0x0683, B:260:0x068a, B:104:0x039d, B:94:0x037c, B:89:0x0364, B:261:0x068b, B:262:0x0692, B:82:0x034b, B:263:0x0693, B:264:0x0698, B:76:0x032f, B:265:0x0699, B:266:0x069e, B:67:0x0311, B:267:0x069f, B:268:0x06a4, B:60:0x02f3, B:269:0x06a5, B:270:0x06aa, B:51:0x02d5, B:46:0x02b9, B:41:0x029d, B:36:0x0281, B:31:0x0265, B:26:0x0245), top: B:275:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:241:0x05da  */
    /* JADX WARN: Code duplicated, block: B:242:0x05dd A[Catch: all -> 0x01b9, TryCatch #0 {all -> 0x01b9, blocks: (B:3:0x0014, B:4:0x019e, B:6:0x01a4, B:8:0x01ae, B:12:0x01be, B:14:0x01c8, B:15:0x01d0, B:17:0x01da, B:19:0x01e6, B:20:0x01f9, B:22:0x01ff, B:27:0x0252, B:32:0x026e, B:37:0x028a, B:42:0x02a6, B:47:0x02c2, B:52:0x02da, B:56:0x02e6, B:61:0x02fc, B:63:0x0304, B:68:0x0316, B:72:0x0322, B:77:0x0338, B:79:0x0340, B:83:0x034f, B:85:0x0357, B:90:0x036b, B:95:0x0383, B:100:0x0392, B:105:0x03a2, B:107:0x03aa, B:112:0x03bf, B:117:0x03ce, B:122:0x03de, B:124:0x03e6, B:129:0x03fe, B:134:0x040d, B:139:0x0421, B:144:0x043d, B:149:0x0457, B:154:0x046d, B:156:0x0475, B:161:0x048a, B:166:0x0499, B:171:0x04a9, B:176:0x04c1, B:181:0x04dd, B:186:0x04f7, B:191:0x050d, B:193:0x0515, B:197:0x0524, B:202:0x053c, B:207:0x055a, B:212:0x0569, B:214:0x056f, B:216:0x0577, B:218:0x057f, B:220:0x0589, B:231:0x05b6, B:235:0x05c5, B:239:0x05d4, B:243:0x05e3, B:247:0x05ff, B:251:0x060d, B:252:0x0614, B:250:0x0608, B:246:0x05f0, B:242:0x05dd, B:238:0x05ce, B:234:0x05bf, B:206:0x0553, B:201:0x0537, B:196:0x0520, B:253:0x066f, B:254:0x0674, B:190:0x0504, B:185:0x04f0, B:180:0x04d4, B:175:0x04bc, B:170:0x04a4, B:255:0x0675, B:256:0x067a, B:153:0x0464, B:148:0x0450, B:143:0x0434, B:138:0x0418, B:128:0x03f7, B:257:0x067b, B:258:0x0682, B:121:0x03d9, B:259:0x0683, B:260:0x068a, B:104:0x039d, B:94:0x037c, B:89:0x0364, B:261:0x068b, B:262:0x0692, B:82:0x034b, B:263:0x0693, B:264:0x0698, B:76:0x032f, B:265:0x0699, B:266:0x069e, B:67:0x0311, B:267:0x069f, B:268:0x06a4, B:60:0x02f3, B:269:0x06a5, B:270:0x06aa, B:51:0x02d5, B:46:0x02b9, B:41:0x029d, B:36:0x0281, B:31:0x0265, B:26:0x0245), top: B:275:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:246:0x05f0 A[Catch: all -> 0x01b9, TryCatch #0 {all -> 0x01b9, blocks: (B:3:0x0014, B:4:0x019e, B:6:0x01a4, B:8:0x01ae, B:12:0x01be, B:14:0x01c8, B:15:0x01d0, B:17:0x01da, B:19:0x01e6, B:20:0x01f9, B:22:0x01ff, B:27:0x0252, B:32:0x026e, B:37:0x028a, B:42:0x02a6, B:47:0x02c2, B:52:0x02da, B:56:0x02e6, B:61:0x02fc, B:63:0x0304, B:68:0x0316, B:72:0x0322, B:77:0x0338, B:79:0x0340, B:83:0x034f, B:85:0x0357, B:90:0x036b, B:95:0x0383, B:100:0x0392, B:105:0x03a2, B:107:0x03aa, B:112:0x03bf, B:117:0x03ce, B:122:0x03de, B:124:0x03e6, B:129:0x03fe, B:134:0x040d, B:139:0x0421, B:144:0x043d, B:149:0x0457, B:154:0x046d, B:156:0x0475, B:161:0x048a, B:166:0x0499, B:171:0x04a9, B:176:0x04c1, B:181:0x04dd, B:186:0x04f7, B:191:0x050d, B:193:0x0515, B:197:0x0524, B:202:0x053c, B:207:0x055a, B:212:0x0569, B:214:0x056f, B:216:0x0577, B:218:0x057f, B:220:0x0589, B:231:0x05b6, B:235:0x05c5, B:239:0x05d4, B:243:0x05e3, B:247:0x05ff, B:251:0x060d, B:252:0x0614, B:250:0x0608, B:246:0x05f0, B:242:0x05dd, B:238:0x05ce, B:234:0x05bf, B:206:0x0553, B:201:0x0537, B:196:0x0520, B:253:0x066f, B:254:0x0674, B:190:0x0504, B:185:0x04f0, B:180:0x04d4, B:175:0x04bc, B:170:0x04a4, B:255:0x0675, B:256:0x067a, B:153:0x0464, B:148:0x0450, B:143:0x0434, B:138:0x0418, B:128:0x03f7, B:257:0x067b, B:258:0x0682, B:121:0x03d9, B:259:0x0683, B:260:0x068a, B:104:0x039d, B:94:0x037c, B:89:0x0364, B:261:0x068b, B:262:0x0692, B:82:0x034b, B:263:0x0693, B:264:0x0698, B:76:0x032f, B:265:0x0699, B:266:0x069e, B:67:0x0311, B:267:0x069f, B:268:0x06a4, B:60:0x02f3, B:269:0x06a5, B:270:0x06aa, B:51:0x02d5, B:46:0x02b9, B:41:0x029d, B:36:0x0281, B:31:0x0265, B:26:0x0245), top: B:275:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x0608 A[Catch: all -> 0x01b9, TryCatch #0 {all -> 0x01b9, blocks: (B:3:0x0014, B:4:0x019e, B:6:0x01a4, B:8:0x01ae, B:12:0x01be, B:14:0x01c8, B:15:0x01d0, B:17:0x01da, B:19:0x01e6, B:20:0x01f9, B:22:0x01ff, B:27:0x0252, B:32:0x026e, B:37:0x028a, B:42:0x02a6, B:47:0x02c2, B:52:0x02da, B:56:0x02e6, B:61:0x02fc, B:63:0x0304, B:68:0x0316, B:72:0x0322, B:77:0x0338, B:79:0x0340, B:83:0x034f, B:85:0x0357, B:90:0x036b, B:95:0x0383, B:100:0x0392, B:105:0x03a2, B:107:0x03aa, B:112:0x03bf, B:117:0x03ce, B:122:0x03de, B:124:0x03e6, B:129:0x03fe, B:134:0x040d, B:139:0x0421, B:144:0x043d, B:149:0x0457, B:154:0x046d, B:156:0x0475, B:161:0x048a, B:166:0x0499, B:171:0x04a9, B:176:0x04c1, B:181:0x04dd, B:186:0x04f7, B:191:0x050d, B:193:0x0515, B:197:0x0524, B:202:0x053c, B:207:0x055a, B:212:0x0569, B:214:0x056f, B:216:0x0577, B:218:0x057f, B:220:0x0589, B:231:0x05b6, B:235:0x05c5, B:239:0x05d4, B:243:0x05e3, B:247:0x05ff, B:251:0x060d, B:252:0x0614, B:250:0x0608, B:246:0x05f0, B:242:0x05dd, B:238:0x05ce, B:234:0x05bf, B:206:0x0553, B:201:0x0537, B:196:0x0520, B:253:0x066f, B:254:0x0674, B:190:0x0504, B:185:0x04f0, B:180:0x04d4, B:175:0x04bc, B:170:0x04a4, B:255:0x0675, B:256:0x067a, B:153:0x0464, B:148:0x0450, B:143:0x0434, B:138:0x0418, B:128:0x03f7, B:257:0x067b, B:258:0x0682, B:121:0x03d9, B:259:0x0683, B:260:0x068a, B:104:0x039d, B:94:0x037c, B:89:0x0364, B:261:0x068b, B:262:0x0692, B:82:0x034b, B:263:0x0693, B:264:0x0698, B:76:0x032f, B:265:0x0699, B:266:0x069e, B:67:0x0311, B:267:0x069f, B:268:0x06a4, B:60:0x02f3, B:269:0x06a5, B:270:0x06aa, B:51:0x02d5, B:46:0x02b9, B:41:0x029d, B:36:0x0281, B:31:0x0265, B:26:0x0245), top: B:275:0x0014 }] */
    private static final List messagesForChannel$lambda$14(String str, String str2, int i13, MessageDao_Impl messageDao_Impl, InterfaceC33687a _connection) throws Exception {
        int i14;
        int i15;
        int i16;
        int i17;
        ChannelInfoEntity channelInfoEntity;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        Integer numValueOf;
        MessageDao_Impl messageDao_Impl2 = messageDao_Impl;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            interfaceC33689cMo68212g1.mo5356p(2, i13);
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
            String str3 = "getValue(...)";
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedLocallyAt");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "remoteMentionedUserIds");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mentionedUsersId");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionCounts");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionScores");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionGroups");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "shadowed");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "i18n");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyToId");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinned");
            int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedAt");
            int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinExpires");
            int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedByUserId");
            int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "threadParticipantsIds");
            int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPushNotification");
            int iM60658N34 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipEnrichUrl");
            int iM60658N35 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderationDetails");
            int iM60658N36 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderation");
            int iM60658N37 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageTextUpdatedAt");
            int iM60658N38 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pollId");
            int iM60658N39 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "restrictedVisibility");
            int iM60658N40 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.CATEGORY_REMINDER);
            int iM60658N41 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sharedLocation");
            int iM60658N42 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelRole");
            int iM60658N43 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedForMe");
            int iM60658N44 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infocid");
            int iM60658N45 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoid");
            int iM60658N46 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infotype");
            int iM60658N47 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infomemberCount");
            int iM60658N48 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoname");
            int i18 = iM60658N12;
            C0022g c0022g = new C0022g(0);
            int i19 = iM60658N11;
            C0022g c0022g2 = new C0022g(0);
            int i24 = iM60658N10;
            C0022g c0022g3 = new C0022g(0);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g.containsKey(strMo5353J3)) {
                    c0022g.put(strMo5353J3, new ArrayList());
                }
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g2.containsKey(strMo5353J4)) {
                    c0022g2.put(strMo5353J4, new ArrayList());
                }
                String strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g3.containsKey(strMo5353J5)) {
                    c0022g3.put(strMo5353J5, new ArrayList());
                }
                iM60658N9 = iM60658N9;
            }
            int i25 = iM60658N9;
            interfaceC33689cMo68212g1.reset();
            messageDao_Impl2.m54706xafdba081(_connection, c0022g);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g2);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g3);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J7 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J8 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J9 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J10 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J11 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                int i26 = iM60658N2;
                int i27 = iM60658N3;
                SyncStatus syncStatusStringToSyncStatus = messageDao_Impl2.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N7));
                int i28 = (int) interfaceC33689cMo68212g1.getLong(iM60658N8);
                int i29 = iM60658N5;
                int i34 = i25;
                int i35 = iM60658N4;
                int i36 = (int) interfaceC33689cMo68212g1.getLong(i34);
                int i37 = i24;
                Date dateFromTimestamp = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i37) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i37)));
                int i38 = i19;
                i19 = i38;
                Date dateFromTimestamp2 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i38) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i38)));
                int i39 = i18;
                i18 = i39;
                Date dateFromTimestamp3 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i39) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i39)));
                int i44 = iM60658N13;
                iM60658N13 = i44;
                Date dateFromTimestamp4 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i44) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i44)));
                int i45 = iM60658N14;
                iM60658N14 = i45;
                Date dateFromTimestamp5 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i45) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i45)));
                int i46 = iM60658N15;
                iM60658N15 = i46;
                List<String> stringList = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i46) ? null : interfaceC33689cMo68212g1.mo5353J0(i46));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i47 = iM60658N16;
                List<String> stringList2 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i47) ? null : interfaceC33689cMo68212g1.mo5353J0(i47));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i48 = iM60658N17;
                iM60658N17 = i48;
                Map<String, Integer> mapStringToMap = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i48) ? null : interfaceC33689cMo68212g1.mo5353J0(i48));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                int i49 = iM60658N18;
                Map<String, Integer> mapStringToMap2 = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i49) ? null : interfaceC33689cMo68212g1.mo5353J0(i49));
                if (mapStringToMap2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                int i54 = iM60658N19;
                Map<String, ReactionGroupEntity> mapStringToReactionGroupEntityMap = messageDao_Impl2.__reactionGroupConverter.stringToReactionGroupEntityMap(interfaceC33689cMo68212g1.isNull(i54) ? null : interfaceC33689cMo68212g1.mo5353J0(i54));
                if (mapStringToReactionGroupEntityMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>', but it was NULL.");
                }
                int i55 = iM60658N20;
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(i55) ? null : interfaceC33689cMo68212g1.mo5353J0(i55);
                int i56 = iM60658N21;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(i56) ? null : interfaceC33689cMo68212g1.mo5353J0(i56);
                iM60658N20 = i55;
                iM60658N19 = i54;
                iM60658N21 = i56;
                int i57 = iM60658N22;
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(i57)) != 0;
                int i58 = iM60658N23;
                iM60658N22 = i57;
                Map<String, String> mapStringToStringMap = messageDao_Impl2.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(i58) ? null : interfaceC33689cMo68212g1.mo5353J0(i58));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                iM60658N23 = i58;
                int i59 = iM60658N24;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(i59)) != 0;
                int i64 = iM60658N25;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(i64)) != 0;
                int i65 = iM60658N26;
                iM60658N24 = i59;
                Map<String, Object> mapStringToMap3 = messageDao_Impl2.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i65) ? null : interfaceC33689cMo68212g1.mo5353J0(i65));
                if (mapStringToMap3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                int i66 = iM60658N27;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(i66) ? null : interfaceC33689cMo68212g1.mo5353J0(i66);
                iM60658N27 = i66;
                iM60658N25 = i64;
                int i67 = iM60658N28;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(i67)) != 0;
                int i68 = iM60658N29;
                iM60658N29 = i68;
                Date dateFromTimestamp6 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i68) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i68)));
                int i69 = iM60658N30;
                iM60658N30 = i69;
                Date dateFromTimestamp7 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i69) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i69)));
                iM60658N31 = iM60658N31;
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(iM60658N31) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N31);
                int i74 = iM60658N32;
                iM60658N32 = i74;
                List<String> stringList3 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i74) ? null : interfaceC33689cMo68212g1.mo5353J0(i74));
                if (stringList3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                iM60658N26 = i65;
                int i75 = iM60658N33;
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(i75)) != 0;
                iM60658N28 = i67;
                int i76 = iM60658N34;
                boolean z17 = ((int) interfaceC33689cMo68212g1.getLong(i76)) != 0;
                int i77 = iM60658N35;
                iM60658N33 = i75;
                ModerationDetailsEntity moderationDetailsEntityStringToModerationDetails = messageDao_Impl2.__moderationDetailsConverter.stringToModerationDetails(interfaceC33689cMo68212g1.isNull(i77) ? null : interfaceC33689cMo68212g1.mo5353J0(i77));
                int i78 = iM60658N36;
                iM60658N36 = i78;
                ModerationEntity moderationEntityStringToModeration = messageDao_Impl2.__moderationConverter.stringToModeration(interfaceC33689cMo68212g1.isNull(i78) ? null : interfaceC33689cMo68212g1.mo5353J0(i78));
                int i79 = iM60658N37;
                iM60658N37 = i79;
                Date dateFromTimestamp8 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i79) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i79)));
                iM60658N38 = iM60658N38;
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(iM60658N38) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N38);
                int i83 = iM60658N39;
                iM60658N34 = i76;
                List<String> stringList4 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i83) ? null : interfaceC33689cMo68212g1.mo5353J0(i83));
                if (stringList4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                iM60658N40 = iM60658N40;
                ReminderInfoEntity reminderInfoEntityStringToReminderInfo = messageDao_Impl2.__reminderInfoConverter.stringToReminderInfo(interfaceC33689cMo68212g1.isNull(iM60658N40) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N40));
                int i84 = iM60658N41;
                iM60658N41 = i84;
                LocationEntity locationEntityStringToLocation = messageDao_Impl2.__locationConverter.stringToLocation(interfaceC33689cMo68212g1.isNull(i84) ? null : interfaceC33689cMo68212g1.mo5353J0(i84));
                iM60658N42 = iM60658N42;
                String strMo5353J17 = interfaceC33689cMo68212g1.isNull(iM60658N42) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N42);
                iM60658N35 = i77;
                iM60658N39 = i83;
                iM60658N43 = iM60658N43;
                boolean z18 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N43)) != 0;
                iM60658N44 = iM60658N44;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    i14 = iM60658N45;
                    if (interfaceC33689cMo68212g1.isNull(i14)) {
                        i15 = iM60658N46;
                        if (interfaceC33689cMo68212g1.isNull(i15)) {
                            iM60658N42 = iM60658N42;
                            i16 = iM60658N47;
                            if (interfaceC33689cMo68212g1.isNull(i16)) {
                                iM60658N40 = iM60658N40;
                                i17 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(i17)) {
                                    iM60658N43 = iM60658N43;
                                    iM60658N44 = iM60658N44;
                                    channelInfoEntity = null;
                                } else {
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                        strMo5353J0 = null;
                                    } else {
                                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(i14)) {
                                        strMo5353J1 = null;
                                    } else {
                                        strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i14);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(i15)) {
                                        strMo5353J2 = null;
                                    } else {
                                        strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i15);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(i16)) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i16));
                                    }
                                    channelInfoEntity = new ChannelInfoEntity(strMo5353J0, strMo5353J1, strMo5353J2, numValueOf, interfaceC33689cMo68212g1.isNull(i17) ? null : interfaceC33689cMo68212g1.mo5353J0(i17));
                                }
                            } else {
                                iM60658N40 = iM60658N40;
                                i17 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i14)) {
                                    strMo5353J1 = null;
                                } else {
                                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i14);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i15)) {
                                    strMo5353J2 = null;
                                } else {
                                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i15);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    numValueOf = null;
                                } else {
                                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i16));
                                }
                                channelInfoEntity = new ChannelInfoEntity(strMo5353J0, strMo5353J1, strMo5353J2, numValueOf, interfaceC33689cMo68212g1.isNull(i17) ? null : interfaceC33689cMo68212g1.mo5353J0(i17));
                            }
                        } else {
                            iM60658N42 = iM60658N42;
                            iM60658N40 = iM60658N40;
                            i16 = iM60658N47;
                            i17 = iM60658N48;
                            if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i14)) {
                                strMo5353J1 = null;
                            } else {
                                strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i14);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                strMo5353J2 = null;
                            } else {
                                strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i15);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i16)) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i16));
                            }
                            channelInfoEntity = new ChannelInfoEntity(strMo5353J0, strMo5353J1, strMo5353J2, numValueOf, interfaceC33689cMo68212g1.isNull(i17) ? null : interfaceC33689cMo68212g1.mo5353J0(i17));
                        }
                    }
                    MessageInnerEntity messageInnerEntity = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i28, i36, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                    Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                    iM60658N46 = i15;
                    String str4 = str3;
                    AbstractC22676k.m65749i(objM73986U, str4);
                    C0022g c0022g4 = c0022g;
                    Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                    AbstractC22676k.m65749i(objM73986U2, str4);
                    iM60658N47 = i16;
                    Object objM73986U3 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                    AbstractC22676k.m65749i(objM73986U3, str4);
                    arrayList.add(new MessageEntity(messageInnerEntity, (List) objM73986U, (List) objM73986U2, (List) objM73986U3));
                    messageDao_Impl2 = messageDao_Impl;
                    iM60658N48 = i17;
                    iM60658N3 = i27;
                    c0022g = c0022g4;
                    str3 = str4;
                    iM60658N4 = i35;
                    iM60658N2 = i26;
                    iM60658N45 = i14;
                    i25 = i34;
                    iM60658N16 = i47;
                    iM60658N5 = i29;
                    i24 = i37;
                    iM60658N18 = i49;
                } else {
                    i14 = iM60658N45;
                }
                i15 = iM60658N46;
                i16 = iM60658N47;
                i17 = iM60658N48;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                }
                if (interfaceC33689cMo68212g1.isNull(i14)) {
                    strMo5353J1 = null;
                } else {
                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i14);
                }
                if (interfaceC33689cMo68212g1.isNull(i15)) {
                    strMo5353J2 = null;
                } else {
                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i15);
                }
                if (interfaceC33689cMo68212g1.isNull(i16)) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i16));
                }
                channelInfoEntity = new ChannelInfoEntity(strMo5353J0, strMo5353J1, strMo5353J2, numValueOf, interfaceC33689cMo68212g1.isNull(i17) ? null : interfaceC33689cMo68212g1.mo5353J0(i17));
                MessageInnerEntity messageInnerEntity2 = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i28, i36, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                Object objM73986U4 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                iM60658N46 = i15;
                String str5 = str3;
                AbstractC22676k.m65749i(objM73986U4, str5);
                C0022g c0022g5 = c0022g;
                Object objM73986U5 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                AbstractC22676k.m65749i(objM73986U5, str5);
                iM60658N47 = i16;
                Object objM73986U6 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                AbstractC22676k.m65749i(objM73986U6, str5);
                arrayList.add(new MessageEntity(messageInnerEntity2, (List) objM73986U4, (List) objM73986U5, (List) objM73986U6));
                messageDao_Impl2 = messageDao_Impl;
                iM60658N48 = i17;
                iM60658N3 = i27;
                c0022g = c0022g5;
                str3 = str5;
                iM60658N4 = i35;
                iM60658N2 = i26;
                iM60658N45 = i14;
                i25 = i34;
                iM60658N16 = i47;
                iM60658N5 = i29;
                i24 = i37;
                iM60658N18 = i49;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:240:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:241:0x05ef A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:245:0x05fe A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x060a  */
    /* JADX WARN: Code duplicated, block: B:249:0x060d A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x0619  */
    /* JADX WARN: Code duplicated, block: B:253:0x0620 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x0638 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    private static final List messagesForChannelEqualOrNewerThan$lambda$11(String str, String str2, MessageDao_Impl messageDao_Impl, Date date, int i13, InterfaceC33687a _connection) throws Exception {
        int i14;
        int i15;
        int i16;
        ChannelInfoEntity channelInfoEntity;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        Integer numValueOf;
        MessageDao_Impl messageDao_Impl2 = messageDao_Impl;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            Long lDateToTimestamp = messageDao_Impl2.__dateConverter.dateToTimestamp(date);
            if (lDateToTimestamp == null) {
                interfaceC33689cMo68212g1.mo5359u(2);
            } else {
                interfaceC33689cMo68212g1.mo5356p(2, lDateToTimestamp.longValue());
            }
            Long lDateToTimestamp2 = messageDao_Impl2.__dateConverter.dateToTimestamp(date);
            if (lDateToTimestamp2 == null) {
                interfaceC33689cMo68212g1.mo5359u(3);
            } else {
                interfaceC33689cMo68212g1.mo5356p(3, lDateToTimestamp2.longValue());
            }
            interfaceC33689cMo68212g1.mo5356p(4, i13);
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
            String str3 = "getValue(...)";
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedLocallyAt");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "remoteMentionedUserIds");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mentionedUsersId");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionCounts");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionScores");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionGroups");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "shadowed");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "i18n");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyToId");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinned");
            int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedAt");
            int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinExpires");
            int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedByUserId");
            int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "threadParticipantsIds");
            int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPushNotification");
            int iM60658N34 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipEnrichUrl");
            int iM60658N35 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderationDetails");
            int iM60658N36 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderation");
            int iM60658N37 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageTextUpdatedAt");
            int iM60658N38 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pollId");
            int iM60658N39 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "restrictedVisibility");
            int iM60658N40 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.CATEGORY_REMINDER);
            int iM60658N41 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sharedLocation");
            int iM60658N42 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelRole");
            int iM60658N43 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedForMe");
            int iM60658N44 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infocid");
            int iM60658N45 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoid");
            int iM60658N46 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infotype");
            int iM60658N47 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infomemberCount");
            int iM60658N48 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoname");
            int i17 = iM60658N12;
            C0022g c0022g = new C0022g(0);
            int i18 = iM60658N11;
            C0022g c0022g2 = new C0022g(0);
            int i19 = iM60658N10;
            C0022g c0022g3 = new C0022g(0);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g.containsKey(strMo5353J3)) {
                    c0022g.put(strMo5353J3, new ArrayList());
                }
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g2.containsKey(strMo5353J4)) {
                    c0022g2.put(strMo5353J4, new ArrayList());
                }
                String strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g3.containsKey(strMo5353J5)) {
                    c0022g3.put(strMo5353J5, new ArrayList());
                }
                iM60658N9 = iM60658N9;
            }
            int i24 = iM60658N9;
            interfaceC33689cMo68212g1.reset();
            messageDao_Impl2.m54706xafdba081(_connection, c0022g);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g2);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g3);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J7 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J8 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J9 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J10 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J11 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                int i25 = iM60658N2;
                SyncStatus syncStatusStringToSyncStatus = messageDao_Impl2.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N7));
                int i26 = (int) interfaceC33689cMo68212g1.getLong(iM60658N8);
                int i27 = iM60658N4;
                int i28 = i24;
                int i29 = iM60658N3;
                int i34 = (int) interfaceC33689cMo68212g1.getLong(i28);
                int i35 = i19;
                Date dateFromTimestamp = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i35) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i35)));
                int i36 = i18;
                i18 = i36;
                Date dateFromTimestamp2 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i36) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i36)));
                int i37 = i17;
                i17 = i37;
                Date dateFromTimestamp3 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i37) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i37)));
                int i38 = iM60658N13;
                iM60658N13 = i38;
                Date dateFromTimestamp4 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i38) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i38)));
                int i39 = iM60658N14;
                iM60658N14 = i39;
                Date dateFromTimestamp5 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i39) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i39)));
                int i44 = iM60658N15;
                iM60658N15 = i44;
                List<String> stringList = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i44) ? null : interfaceC33689cMo68212g1.mo5353J0(i44));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i45 = iM60658N16;
                List<String> stringList2 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i45) ? null : interfaceC33689cMo68212g1.mo5353J0(i45));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i46 = iM60658N17;
                iM60658N17 = i46;
                Map<String, Integer> mapStringToMap = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i46) ? null : interfaceC33689cMo68212g1.mo5353J0(i46));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                iM60658N18 = iM60658N18;
                Map<String, Integer> mapStringToMap2 = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N18) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N18));
                if (mapStringToMap2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                iM60658N19 = iM60658N19;
                Map<String, ReactionGroupEntity> mapStringToReactionGroupEntityMap = messageDao_Impl2.__reactionGroupConverter.stringToReactionGroupEntityMap(interfaceC33689cMo68212g1.isNull(iM60658N19) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N19));
                if (mapStringToReactionGroupEntityMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>', but it was NULL.");
                }
                iM60658N20 = iM60658N20;
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(iM60658N20) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N20);
                iM60658N21 = iM60658N21;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(iM60658N21) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N21);
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N22)) != 0;
                int i47 = iM60658N23;
                iM60658N22 = iM60658N22;
                Map<String, String> mapStringToStringMap = messageDao_Impl2.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(i47) ? null : interfaceC33689cMo68212g1.mo5353J0(i47));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                iM60658N23 = i47;
                int i48 = iM60658N24;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(i48)) != 0;
                int i49 = iM60658N5;
                int i54 = iM60658N25;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(i54)) != 0;
                int i55 = iM60658N26;
                Map<String, Object> mapStringToMap3 = messageDao_Impl2.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i55) ? null : interfaceC33689cMo68212g1.mo5353J0(i55));
                if (mapStringToMap3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                int i56 = iM60658N27;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(i56) ? null : interfaceC33689cMo68212g1.mo5353J0(i56);
                iM60658N27 = i56;
                int i57 = iM60658N28;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(i57)) != 0;
                int i58 = iM60658N29;
                iM60658N29 = i58;
                Date dateFromTimestamp6 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i58) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i58)));
                int i59 = iM60658N30;
                iM60658N30 = i59;
                Date dateFromTimestamp7 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i59) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i59)));
                iM60658N31 = iM60658N31;
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(iM60658N31) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N31);
                int i64 = iM60658N32;
                iM60658N32 = i64;
                List<String> stringList3 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i64) ? null : interfaceC33689cMo68212g1.mo5353J0(i64));
                if (stringList3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i65 = iM60658N33;
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(i65)) != 0;
                int i66 = iM60658N34;
                boolean z17 = ((int) interfaceC33689cMo68212g1.getLong(i66)) != 0;
                int i67 = iM60658N35;
                ModerationDetailsEntity moderationDetailsEntityStringToModerationDetails = messageDao_Impl2.__moderationDetailsConverter.stringToModerationDetails(interfaceC33689cMo68212g1.isNull(i67) ? null : interfaceC33689cMo68212g1.mo5353J0(i67));
                int i68 = iM60658N36;
                iM60658N36 = i68;
                ModerationEntity moderationEntityStringToModeration = messageDao_Impl2.__moderationConverter.stringToModeration(interfaceC33689cMo68212g1.isNull(i68) ? null : interfaceC33689cMo68212g1.mo5353J0(i68));
                int i69 = iM60658N37;
                iM60658N37 = i69;
                Date dateFromTimestamp8 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i69) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i69)));
                iM60658N38 = iM60658N38;
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(iM60658N38) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N38);
                int i74 = iM60658N39;
                List<String> stringList4 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i74) ? null : interfaceC33689cMo68212g1.mo5353J0(i74));
                if (stringList4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i75 = iM60658N40;
                ReminderInfoEntity reminderInfoEntityStringToReminderInfo = messageDao_Impl2.__reminderInfoConverter.stringToReminderInfo(interfaceC33689cMo68212g1.isNull(i75) ? null : interfaceC33689cMo68212g1.mo5353J0(i75));
                int i76 = iM60658N41;
                iM60658N41 = i76;
                LocationEntity locationEntityStringToLocation = messageDao_Impl2.__locationConverter.stringToLocation(interfaceC33689cMo68212g1.isNull(i76) ? null : interfaceC33689cMo68212g1.mo5353J0(i76));
                int i77 = iM60658N42;
                String strMo5353J17 = interfaceC33689cMo68212g1.isNull(i77) ? null : interfaceC33689cMo68212g1.mo5353J0(i77);
                iM60658N42 = i77;
                iM60658N40 = i75;
                iM60658N43 = iM60658N43;
                boolean z18 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N43)) != 0;
                iM60658N44 = iM60658N44;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    iM60658N45 = iM60658N45;
                    if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                        i14 = iM60658N46;
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            iM60658N43 = iM60658N43;
                            i15 = iM60658N47;
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                i67 = i67;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    iM60658N44 = iM60658N44;
                                    iM60658N45 = iM60658N45;
                                    channelInfoEntity = null;
                                } else {
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                        strMo5353J0 = null;
                                    } else {
                                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                        strMo5353J1 = null;
                                    } else {
                                        strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                                }
                            } else {
                                i67 = i67;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                }
                                if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                    strMo5353J1 = null;
                                } else {
                                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                            }
                        } else {
                            iM60658N43 = iM60658N43;
                            i67 = i67;
                            i15 = iM60658N47;
                            i16 = iM60658N48;
                            if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                            }
                            if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                strMo5353J1 = null;
                            } else {
                                strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                        }
                    }
                    MessageInnerEntity messageInnerEntity = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i26, i34, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                    Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                    iM60658N46 = i14;
                    String str4 = str3;
                    AbstractC22676k.m65749i(objM73986U, str4);
                    C0022g c0022g4 = c0022g;
                    Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                    AbstractC22676k.m65749i(objM73986U2, str4);
                    iM60658N47 = i15;
                    Object objM73986U3 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                    AbstractC22676k.m65749i(objM73986U3, str4);
                    arrayList.add(new MessageEntity(messageInnerEntity, (List) objM73986U, (List) objM73986U2, (List) objM73986U3));
                    int i78 = i67;
                    iM60658N39 = i74;
                    iM60658N5 = i49;
                    iM60658N24 = i48;
                    iM60658N25 = i54;
                    iM60658N26 = i55;
                    iM60658N28 = i57;
                    iM60658N33 = i65;
                    iM60658N34 = i66;
                    iM60658N35 = i78;
                    messageDao_Impl2 = messageDao_Impl;
                    iM60658N2 = i25;
                    c0022g = c0022g4;
                    str3 = str4;
                    iM60658N3 = i29;
                    iM60658N48 = i16;
                    i24 = i28;
                    iM60658N4 = i27;
                    i19 = i35;
                    iM60658N16 = i45;
                } else {
                    iM60658N45 = iM60658N45;
                }
                i14 = iM60658N46;
                i15 = iM60658N47;
                i16 = iM60658N48;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                }
                if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                    strMo5353J1 = null;
                } else {
                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                MessageInnerEntity messageInnerEntity2 = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i26, i34, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                Object objM73986U4 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                iM60658N46 = i14;
                String str5 = str3;
                AbstractC22676k.m65749i(objM73986U4, str5);
                C0022g c0022g5 = c0022g;
                Object objM73986U5 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                AbstractC22676k.m65749i(objM73986U5, str5);
                iM60658N47 = i15;
                Object objM73986U6 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                AbstractC22676k.m65749i(objM73986U6, str5);
                arrayList.add(new MessageEntity(messageInnerEntity2, (List) objM73986U4, (List) objM73986U5, (List) objM73986U6));
                int i79 = i67;
                iM60658N39 = i74;
                iM60658N5 = i49;
                iM60658N24 = i48;
                iM60658N25 = i54;
                iM60658N26 = i55;
                iM60658N28 = i57;
                iM60658N33 = i65;
                iM60658N34 = i66;
                iM60658N35 = i79;
                messageDao_Impl2 = messageDao_Impl;
                iM60658N2 = i25;
                c0022g = c0022g5;
                str3 = str5;
                iM60658N3 = i29;
                iM60658N48 = i16;
                i24 = i28;
                iM60658N4 = i27;
                i19 = i35;
                iM60658N16 = i45;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:240:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:241:0x05ef A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:245:0x05fe A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x060a  */
    /* JADX WARN: Code duplicated, block: B:249:0x060d A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x0619  */
    /* JADX WARN: Code duplicated, block: B:253:0x0620 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x0638 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    private static final List messagesForChannelEqualOrOlderThan$lambda$13(String str, String str2, MessageDao_Impl messageDao_Impl, Date date, int i13, InterfaceC33687a _connection) throws Exception {
        int i14;
        int i15;
        int i16;
        ChannelInfoEntity channelInfoEntity;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        Integer numValueOf;
        MessageDao_Impl messageDao_Impl2 = messageDao_Impl;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            Long lDateToTimestamp = messageDao_Impl2.__dateConverter.dateToTimestamp(date);
            if (lDateToTimestamp == null) {
                interfaceC33689cMo68212g1.mo5359u(2);
            } else {
                interfaceC33689cMo68212g1.mo5356p(2, lDateToTimestamp.longValue());
            }
            Long lDateToTimestamp2 = messageDao_Impl2.__dateConverter.dateToTimestamp(date);
            if (lDateToTimestamp2 == null) {
                interfaceC33689cMo68212g1.mo5359u(3);
            } else {
                interfaceC33689cMo68212g1.mo5356p(3, lDateToTimestamp2.longValue());
            }
            interfaceC33689cMo68212g1.mo5356p(4, i13);
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
            String str3 = "getValue(...)";
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedLocallyAt");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "remoteMentionedUserIds");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mentionedUsersId");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionCounts");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionScores");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionGroups");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "shadowed");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "i18n");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyToId");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinned");
            int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedAt");
            int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinExpires");
            int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedByUserId");
            int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "threadParticipantsIds");
            int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPushNotification");
            int iM60658N34 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipEnrichUrl");
            int iM60658N35 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderationDetails");
            int iM60658N36 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderation");
            int iM60658N37 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageTextUpdatedAt");
            int iM60658N38 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pollId");
            int iM60658N39 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "restrictedVisibility");
            int iM60658N40 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.CATEGORY_REMINDER);
            int iM60658N41 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sharedLocation");
            int iM60658N42 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelRole");
            int iM60658N43 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedForMe");
            int iM60658N44 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infocid");
            int iM60658N45 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoid");
            int iM60658N46 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infotype");
            int iM60658N47 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infomemberCount");
            int iM60658N48 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoname");
            int i17 = iM60658N12;
            C0022g c0022g = new C0022g(0);
            int i18 = iM60658N11;
            C0022g c0022g2 = new C0022g(0);
            int i19 = iM60658N10;
            C0022g c0022g3 = new C0022g(0);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g.containsKey(strMo5353J3)) {
                    c0022g.put(strMo5353J3, new ArrayList());
                }
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g2.containsKey(strMo5353J4)) {
                    c0022g2.put(strMo5353J4, new ArrayList());
                }
                String strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g3.containsKey(strMo5353J5)) {
                    c0022g3.put(strMo5353J5, new ArrayList());
                }
                iM60658N9 = iM60658N9;
            }
            int i24 = iM60658N9;
            interfaceC33689cMo68212g1.reset();
            messageDao_Impl2.m54706xafdba081(_connection, c0022g);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g2);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g3);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J7 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J8 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J9 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J10 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J11 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                int i25 = iM60658N2;
                SyncStatus syncStatusStringToSyncStatus = messageDao_Impl2.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N7));
                int i26 = (int) interfaceC33689cMo68212g1.getLong(iM60658N8);
                int i27 = iM60658N4;
                int i28 = i24;
                int i29 = iM60658N3;
                int i34 = (int) interfaceC33689cMo68212g1.getLong(i28);
                int i35 = i19;
                Date dateFromTimestamp = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i35) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i35)));
                int i36 = i18;
                i18 = i36;
                Date dateFromTimestamp2 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i36) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i36)));
                int i37 = i17;
                i17 = i37;
                Date dateFromTimestamp3 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i37) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i37)));
                int i38 = iM60658N13;
                iM60658N13 = i38;
                Date dateFromTimestamp4 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i38) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i38)));
                int i39 = iM60658N14;
                iM60658N14 = i39;
                Date dateFromTimestamp5 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i39) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i39)));
                int i44 = iM60658N15;
                iM60658N15 = i44;
                List<String> stringList = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i44) ? null : interfaceC33689cMo68212g1.mo5353J0(i44));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i45 = iM60658N16;
                List<String> stringList2 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i45) ? null : interfaceC33689cMo68212g1.mo5353J0(i45));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i46 = iM60658N17;
                iM60658N17 = i46;
                Map<String, Integer> mapStringToMap = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i46) ? null : interfaceC33689cMo68212g1.mo5353J0(i46));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                iM60658N18 = iM60658N18;
                Map<String, Integer> mapStringToMap2 = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N18) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N18));
                if (mapStringToMap2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                iM60658N19 = iM60658N19;
                Map<String, ReactionGroupEntity> mapStringToReactionGroupEntityMap = messageDao_Impl2.__reactionGroupConverter.stringToReactionGroupEntityMap(interfaceC33689cMo68212g1.isNull(iM60658N19) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N19));
                if (mapStringToReactionGroupEntityMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>', but it was NULL.");
                }
                iM60658N20 = iM60658N20;
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(iM60658N20) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N20);
                iM60658N21 = iM60658N21;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(iM60658N21) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N21);
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N22)) != 0;
                int i47 = iM60658N23;
                iM60658N22 = iM60658N22;
                Map<String, String> mapStringToStringMap = messageDao_Impl2.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(i47) ? null : interfaceC33689cMo68212g1.mo5353J0(i47));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                iM60658N23 = i47;
                int i48 = iM60658N24;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(i48)) != 0;
                int i49 = iM60658N5;
                int i54 = iM60658N25;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(i54)) != 0;
                int i55 = iM60658N26;
                Map<String, Object> mapStringToMap3 = messageDao_Impl2.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i55) ? null : interfaceC33689cMo68212g1.mo5353J0(i55));
                if (mapStringToMap3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                int i56 = iM60658N27;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(i56) ? null : interfaceC33689cMo68212g1.mo5353J0(i56);
                iM60658N27 = i56;
                int i57 = iM60658N28;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(i57)) != 0;
                int i58 = iM60658N29;
                iM60658N29 = i58;
                Date dateFromTimestamp6 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i58) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i58)));
                int i59 = iM60658N30;
                iM60658N30 = i59;
                Date dateFromTimestamp7 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i59) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i59)));
                iM60658N31 = iM60658N31;
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(iM60658N31) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N31);
                int i64 = iM60658N32;
                iM60658N32 = i64;
                List<String> stringList3 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i64) ? null : interfaceC33689cMo68212g1.mo5353J0(i64));
                if (stringList3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i65 = iM60658N33;
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(i65)) != 0;
                int i66 = iM60658N34;
                boolean z17 = ((int) interfaceC33689cMo68212g1.getLong(i66)) != 0;
                int i67 = iM60658N35;
                ModerationDetailsEntity moderationDetailsEntityStringToModerationDetails = messageDao_Impl2.__moderationDetailsConverter.stringToModerationDetails(interfaceC33689cMo68212g1.isNull(i67) ? null : interfaceC33689cMo68212g1.mo5353J0(i67));
                int i68 = iM60658N36;
                iM60658N36 = i68;
                ModerationEntity moderationEntityStringToModeration = messageDao_Impl2.__moderationConverter.stringToModeration(interfaceC33689cMo68212g1.isNull(i68) ? null : interfaceC33689cMo68212g1.mo5353J0(i68));
                int i69 = iM60658N37;
                iM60658N37 = i69;
                Date dateFromTimestamp8 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i69) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i69)));
                iM60658N38 = iM60658N38;
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(iM60658N38) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N38);
                int i74 = iM60658N39;
                List<String> stringList4 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i74) ? null : interfaceC33689cMo68212g1.mo5353J0(i74));
                if (stringList4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i75 = iM60658N40;
                ReminderInfoEntity reminderInfoEntityStringToReminderInfo = messageDao_Impl2.__reminderInfoConverter.stringToReminderInfo(interfaceC33689cMo68212g1.isNull(i75) ? null : interfaceC33689cMo68212g1.mo5353J0(i75));
                int i76 = iM60658N41;
                iM60658N41 = i76;
                LocationEntity locationEntityStringToLocation = messageDao_Impl2.__locationConverter.stringToLocation(interfaceC33689cMo68212g1.isNull(i76) ? null : interfaceC33689cMo68212g1.mo5353J0(i76));
                int i77 = iM60658N42;
                String strMo5353J17 = interfaceC33689cMo68212g1.isNull(i77) ? null : interfaceC33689cMo68212g1.mo5353J0(i77);
                iM60658N42 = i77;
                iM60658N40 = i75;
                iM60658N43 = iM60658N43;
                boolean z18 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N43)) != 0;
                iM60658N44 = iM60658N44;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    iM60658N45 = iM60658N45;
                    if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                        i14 = iM60658N46;
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            iM60658N43 = iM60658N43;
                            i15 = iM60658N47;
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                i67 = i67;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    iM60658N44 = iM60658N44;
                                    iM60658N45 = iM60658N45;
                                    channelInfoEntity = null;
                                } else {
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                        strMo5353J0 = null;
                                    } else {
                                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                        strMo5353J1 = null;
                                    } else {
                                        strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                                }
                            } else {
                                i67 = i67;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                }
                                if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                    strMo5353J1 = null;
                                } else {
                                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                            }
                        } else {
                            iM60658N43 = iM60658N43;
                            i67 = i67;
                            i15 = iM60658N47;
                            i16 = iM60658N48;
                            if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                            }
                            if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                strMo5353J1 = null;
                            } else {
                                strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                        }
                    }
                    MessageInnerEntity messageInnerEntity = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i26, i34, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                    Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                    iM60658N46 = i14;
                    String str4 = str3;
                    AbstractC22676k.m65749i(objM73986U, str4);
                    C0022g c0022g4 = c0022g;
                    Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                    AbstractC22676k.m65749i(objM73986U2, str4);
                    iM60658N47 = i15;
                    Object objM73986U3 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                    AbstractC22676k.m65749i(objM73986U3, str4);
                    arrayList.add(new MessageEntity(messageInnerEntity, (List) objM73986U, (List) objM73986U2, (List) objM73986U3));
                    int i78 = i67;
                    iM60658N39 = i74;
                    iM60658N5 = i49;
                    iM60658N24 = i48;
                    iM60658N25 = i54;
                    iM60658N26 = i55;
                    iM60658N28 = i57;
                    iM60658N33 = i65;
                    iM60658N34 = i66;
                    iM60658N35 = i78;
                    messageDao_Impl2 = messageDao_Impl;
                    iM60658N2 = i25;
                    c0022g = c0022g4;
                    str3 = str4;
                    iM60658N3 = i29;
                    iM60658N48 = i16;
                    i24 = i28;
                    iM60658N4 = i27;
                    i19 = i35;
                    iM60658N16 = i45;
                } else {
                    iM60658N45 = iM60658N45;
                }
                i14 = iM60658N46;
                i15 = iM60658N47;
                i16 = iM60658N48;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                }
                if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                    strMo5353J1 = null;
                } else {
                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                MessageInnerEntity messageInnerEntity2 = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i26, i34, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                Object objM73986U4 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                iM60658N46 = i14;
                String str5 = str3;
                AbstractC22676k.m65749i(objM73986U4, str5);
                C0022g c0022g5 = c0022g;
                Object objM73986U5 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                AbstractC22676k.m65749i(objM73986U5, str5);
                iM60658N47 = i15;
                Object objM73986U6 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                AbstractC22676k.m65749i(objM73986U6, str5);
                arrayList.add(new MessageEntity(messageInnerEntity2, (List) objM73986U4, (List) objM73986U5, (List) objM73986U6));
                int i79 = i67;
                iM60658N39 = i74;
                iM60658N5 = i49;
                iM60658N24 = i48;
                iM60658N25 = i54;
                iM60658N26 = i55;
                iM60658N28 = i57;
                iM60658N33 = i65;
                iM60658N34 = i66;
                iM60658N35 = i79;
                messageDao_Impl2 = messageDao_Impl;
                iM60658N2 = i25;
                c0022g = c0022g5;
                str3 = str5;
                iM60658N3 = i29;
                iM60658N48 = i16;
                i24 = i28;
                iM60658N4 = i27;
                i19 = i35;
                iM60658N16 = i45;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:240:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:241:0x05ef A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:245:0x05fe A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x060a  */
    /* JADX WARN: Code duplicated, block: B:249:0x060d A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x0619  */
    /* JADX WARN: Code duplicated, block: B:253:0x0620 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x0638 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    private static final List messagesForChannelNewerThan$lambda$10(String str, String str2, MessageDao_Impl messageDao_Impl, Date date, int i13, InterfaceC33687a _connection) throws Exception {
        int i14;
        int i15;
        int i16;
        ChannelInfoEntity channelInfoEntity;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        Integer numValueOf;
        MessageDao_Impl messageDao_Impl2 = messageDao_Impl;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            Long lDateToTimestamp = messageDao_Impl2.__dateConverter.dateToTimestamp(date);
            if (lDateToTimestamp == null) {
                interfaceC33689cMo68212g1.mo5359u(2);
            } else {
                interfaceC33689cMo68212g1.mo5356p(2, lDateToTimestamp.longValue());
            }
            Long lDateToTimestamp2 = messageDao_Impl2.__dateConverter.dateToTimestamp(date);
            if (lDateToTimestamp2 == null) {
                interfaceC33689cMo68212g1.mo5359u(3);
            } else {
                interfaceC33689cMo68212g1.mo5356p(3, lDateToTimestamp2.longValue());
            }
            interfaceC33689cMo68212g1.mo5356p(4, i13);
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
            String str3 = "getValue(...)";
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedLocallyAt");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "remoteMentionedUserIds");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mentionedUsersId");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionCounts");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionScores");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionGroups");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "shadowed");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "i18n");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyToId");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinned");
            int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedAt");
            int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinExpires");
            int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedByUserId");
            int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "threadParticipantsIds");
            int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPushNotification");
            int iM60658N34 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipEnrichUrl");
            int iM60658N35 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderationDetails");
            int iM60658N36 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderation");
            int iM60658N37 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageTextUpdatedAt");
            int iM60658N38 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pollId");
            int iM60658N39 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "restrictedVisibility");
            int iM60658N40 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.CATEGORY_REMINDER);
            int iM60658N41 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sharedLocation");
            int iM60658N42 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelRole");
            int iM60658N43 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedForMe");
            int iM60658N44 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infocid");
            int iM60658N45 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoid");
            int iM60658N46 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infotype");
            int iM60658N47 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infomemberCount");
            int iM60658N48 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoname");
            int i17 = iM60658N12;
            C0022g c0022g = new C0022g(0);
            int i18 = iM60658N11;
            C0022g c0022g2 = new C0022g(0);
            int i19 = iM60658N10;
            C0022g c0022g3 = new C0022g(0);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g.containsKey(strMo5353J3)) {
                    c0022g.put(strMo5353J3, new ArrayList());
                }
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g2.containsKey(strMo5353J4)) {
                    c0022g2.put(strMo5353J4, new ArrayList());
                }
                String strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g3.containsKey(strMo5353J5)) {
                    c0022g3.put(strMo5353J5, new ArrayList());
                }
                iM60658N9 = iM60658N9;
            }
            int i24 = iM60658N9;
            interfaceC33689cMo68212g1.reset();
            messageDao_Impl2.m54706xafdba081(_connection, c0022g);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g2);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g3);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J7 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J8 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J9 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J10 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J11 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                int i25 = iM60658N2;
                SyncStatus syncStatusStringToSyncStatus = messageDao_Impl2.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N7));
                int i26 = (int) interfaceC33689cMo68212g1.getLong(iM60658N8);
                int i27 = iM60658N4;
                int i28 = i24;
                int i29 = iM60658N3;
                int i34 = (int) interfaceC33689cMo68212g1.getLong(i28);
                int i35 = i19;
                Date dateFromTimestamp = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i35) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i35)));
                int i36 = i18;
                i18 = i36;
                Date dateFromTimestamp2 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i36) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i36)));
                int i37 = i17;
                i17 = i37;
                Date dateFromTimestamp3 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i37) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i37)));
                int i38 = iM60658N13;
                iM60658N13 = i38;
                Date dateFromTimestamp4 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i38) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i38)));
                int i39 = iM60658N14;
                iM60658N14 = i39;
                Date dateFromTimestamp5 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i39) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i39)));
                int i44 = iM60658N15;
                iM60658N15 = i44;
                List<String> stringList = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i44) ? null : interfaceC33689cMo68212g1.mo5353J0(i44));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i45 = iM60658N16;
                List<String> stringList2 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i45) ? null : interfaceC33689cMo68212g1.mo5353J0(i45));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i46 = iM60658N17;
                iM60658N17 = i46;
                Map<String, Integer> mapStringToMap = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i46) ? null : interfaceC33689cMo68212g1.mo5353J0(i46));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                iM60658N18 = iM60658N18;
                Map<String, Integer> mapStringToMap2 = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N18) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N18));
                if (mapStringToMap2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                iM60658N19 = iM60658N19;
                Map<String, ReactionGroupEntity> mapStringToReactionGroupEntityMap = messageDao_Impl2.__reactionGroupConverter.stringToReactionGroupEntityMap(interfaceC33689cMo68212g1.isNull(iM60658N19) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N19));
                if (mapStringToReactionGroupEntityMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>', but it was NULL.");
                }
                iM60658N20 = iM60658N20;
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(iM60658N20) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N20);
                iM60658N21 = iM60658N21;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(iM60658N21) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N21);
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N22)) != 0;
                int i47 = iM60658N23;
                iM60658N22 = iM60658N22;
                Map<String, String> mapStringToStringMap = messageDao_Impl2.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(i47) ? null : interfaceC33689cMo68212g1.mo5353J0(i47));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                iM60658N23 = i47;
                int i48 = iM60658N24;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(i48)) != 0;
                int i49 = iM60658N5;
                int i54 = iM60658N25;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(i54)) != 0;
                int i55 = iM60658N26;
                Map<String, Object> mapStringToMap3 = messageDao_Impl2.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i55) ? null : interfaceC33689cMo68212g1.mo5353J0(i55));
                if (mapStringToMap3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                int i56 = iM60658N27;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(i56) ? null : interfaceC33689cMo68212g1.mo5353J0(i56);
                iM60658N27 = i56;
                int i57 = iM60658N28;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(i57)) != 0;
                int i58 = iM60658N29;
                iM60658N29 = i58;
                Date dateFromTimestamp6 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i58) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i58)));
                int i59 = iM60658N30;
                iM60658N30 = i59;
                Date dateFromTimestamp7 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i59) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i59)));
                iM60658N31 = iM60658N31;
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(iM60658N31) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N31);
                int i64 = iM60658N32;
                iM60658N32 = i64;
                List<String> stringList3 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i64) ? null : interfaceC33689cMo68212g1.mo5353J0(i64));
                if (stringList3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i65 = iM60658N33;
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(i65)) != 0;
                int i66 = iM60658N34;
                boolean z17 = ((int) interfaceC33689cMo68212g1.getLong(i66)) != 0;
                int i67 = iM60658N35;
                ModerationDetailsEntity moderationDetailsEntityStringToModerationDetails = messageDao_Impl2.__moderationDetailsConverter.stringToModerationDetails(interfaceC33689cMo68212g1.isNull(i67) ? null : interfaceC33689cMo68212g1.mo5353J0(i67));
                int i68 = iM60658N36;
                iM60658N36 = i68;
                ModerationEntity moderationEntityStringToModeration = messageDao_Impl2.__moderationConverter.stringToModeration(interfaceC33689cMo68212g1.isNull(i68) ? null : interfaceC33689cMo68212g1.mo5353J0(i68));
                int i69 = iM60658N37;
                iM60658N37 = i69;
                Date dateFromTimestamp8 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i69) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i69)));
                iM60658N38 = iM60658N38;
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(iM60658N38) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N38);
                int i74 = iM60658N39;
                List<String> stringList4 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i74) ? null : interfaceC33689cMo68212g1.mo5353J0(i74));
                if (stringList4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i75 = iM60658N40;
                ReminderInfoEntity reminderInfoEntityStringToReminderInfo = messageDao_Impl2.__reminderInfoConverter.stringToReminderInfo(interfaceC33689cMo68212g1.isNull(i75) ? null : interfaceC33689cMo68212g1.mo5353J0(i75));
                int i76 = iM60658N41;
                iM60658N41 = i76;
                LocationEntity locationEntityStringToLocation = messageDao_Impl2.__locationConverter.stringToLocation(interfaceC33689cMo68212g1.isNull(i76) ? null : interfaceC33689cMo68212g1.mo5353J0(i76));
                int i77 = iM60658N42;
                String strMo5353J17 = interfaceC33689cMo68212g1.isNull(i77) ? null : interfaceC33689cMo68212g1.mo5353J0(i77);
                iM60658N42 = i77;
                iM60658N40 = i75;
                iM60658N43 = iM60658N43;
                boolean z18 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N43)) != 0;
                iM60658N44 = iM60658N44;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    iM60658N45 = iM60658N45;
                    if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                        i14 = iM60658N46;
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            iM60658N43 = iM60658N43;
                            i15 = iM60658N47;
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                i67 = i67;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    iM60658N44 = iM60658N44;
                                    iM60658N45 = iM60658N45;
                                    channelInfoEntity = null;
                                } else {
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                        strMo5353J0 = null;
                                    } else {
                                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                        strMo5353J1 = null;
                                    } else {
                                        strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                                }
                            } else {
                                i67 = i67;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                }
                                if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                    strMo5353J1 = null;
                                } else {
                                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                            }
                        } else {
                            iM60658N43 = iM60658N43;
                            i67 = i67;
                            i15 = iM60658N47;
                            i16 = iM60658N48;
                            if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                            }
                            if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                strMo5353J1 = null;
                            } else {
                                strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                        }
                    }
                    MessageInnerEntity messageInnerEntity = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i26, i34, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                    Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                    iM60658N46 = i14;
                    String str4 = str3;
                    AbstractC22676k.m65749i(objM73986U, str4);
                    C0022g c0022g4 = c0022g;
                    Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                    AbstractC22676k.m65749i(objM73986U2, str4);
                    iM60658N47 = i15;
                    Object objM73986U3 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                    AbstractC22676k.m65749i(objM73986U3, str4);
                    arrayList.add(new MessageEntity(messageInnerEntity, (List) objM73986U, (List) objM73986U2, (List) objM73986U3));
                    int i78 = i67;
                    iM60658N39 = i74;
                    iM60658N5 = i49;
                    iM60658N24 = i48;
                    iM60658N25 = i54;
                    iM60658N26 = i55;
                    iM60658N28 = i57;
                    iM60658N33 = i65;
                    iM60658N34 = i66;
                    iM60658N35 = i78;
                    messageDao_Impl2 = messageDao_Impl;
                    iM60658N2 = i25;
                    c0022g = c0022g4;
                    str3 = str4;
                    iM60658N3 = i29;
                    iM60658N48 = i16;
                    i24 = i28;
                    iM60658N4 = i27;
                    i19 = i35;
                    iM60658N16 = i45;
                } else {
                    iM60658N45 = iM60658N45;
                }
                i14 = iM60658N46;
                i15 = iM60658N47;
                i16 = iM60658N48;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                }
                if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                    strMo5353J1 = null;
                } else {
                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                MessageInnerEntity messageInnerEntity2 = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i26, i34, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                Object objM73986U4 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                iM60658N46 = i14;
                String str5 = str3;
                AbstractC22676k.m65749i(objM73986U4, str5);
                C0022g c0022g5 = c0022g;
                Object objM73986U5 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                AbstractC22676k.m65749i(objM73986U5, str5);
                iM60658N47 = i15;
                Object objM73986U6 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                AbstractC22676k.m65749i(objM73986U6, str5);
                arrayList.add(new MessageEntity(messageInnerEntity2, (List) objM73986U4, (List) objM73986U5, (List) objM73986U6));
                int i79 = i67;
                iM60658N39 = i74;
                iM60658N5 = i49;
                iM60658N24 = i48;
                iM60658N25 = i54;
                iM60658N26 = i55;
                iM60658N28 = i57;
                iM60658N33 = i65;
                iM60658N34 = i66;
                iM60658N35 = i79;
                messageDao_Impl2 = messageDao_Impl;
                iM60658N2 = i25;
                c0022g = c0022g5;
                str3 = str5;
                iM60658N3 = i29;
                iM60658N48 = i16;
                i24 = i28;
                iM60658N4 = i27;
                i19 = i35;
                iM60658N16 = i45;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:240:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:241:0x05ef A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:245:0x05fe A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x060a  */
    /* JADX WARN: Code duplicated, block: B:249:0x060d A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x0619  */
    /* JADX WARN: Code duplicated, block: B:253:0x0620 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x0638 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0016, B:5:0x0022, B:9:0x0030, B:11:0x0039, B:13:0x0044, B:14:0x01cb, B:16:0x01d1, B:18:0x01db, B:20:0x01e8, B:22:0x01f2, B:23:0x01fa, B:25:0x0204, B:27:0x0210, B:28:0x0223, B:30:0x0229, B:35:0x027b, B:40:0x0297, B:45:0x02b3, B:50:0x02cf, B:55:0x02eb, B:60:0x0303, B:64:0x030f, B:69:0x0325, B:71:0x032d, B:76:0x033f, B:80:0x034b, B:85:0x0361, B:87:0x0369, B:91:0x0378, B:93:0x0380, B:98:0x0394, B:102:0x03b3, B:107:0x03c2, B:112:0x03d2, B:114:0x03da, B:119:0x03ef, B:124:0x03fe, B:129:0x040e, B:131:0x0416, B:136:0x042e, B:141:0x043d, B:146:0x0451, B:151:0x046d, B:156:0x0487, B:161:0x049d, B:163:0x04a5, B:168:0x04ba, B:173:0x04c9, B:178:0x04d9, B:183:0x04f1, B:188:0x050d, B:193:0x0527, B:198:0x053d, B:200:0x0545, B:204:0x0554, B:209:0x056c, B:214:0x058a, B:219:0x0599, B:221:0x059f, B:223:0x05a7, B:225:0x05af, B:227:0x05b9, B:238:0x05e6, B:242:0x05f5, B:246:0x0604, B:250:0x0613, B:254:0x062f, B:258:0x063d, B:259:0x0644, B:257:0x0638, B:253:0x0620, B:249:0x060d, B:245:0x05fe, B:241:0x05ef, B:213:0x0583, B:208:0x0567, B:203:0x0550, B:260:0x06ad, B:261:0x06b2, B:197:0x0534, B:192:0x0520, B:187:0x0504, B:182:0x04ec, B:177:0x04d4, B:262:0x06b3, B:263:0x06b8, B:160:0x0494, B:155:0x0480, B:150:0x0464, B:145:0x0448, B:135:0x0427, B:264:0x06b9, B:265:0x06c0, B:128:0x0409, B:266:0x06c1, B:267:0x06c8, B:111:0x03cd, B:101:0x03a5, B:97:0x038d, B:268:0x06c9, B:269:0x06d0, B:90:0x0374, B:270:0x06d1, B:271:0x06d6, B:84:0x0358, B:272:0x06d7, B:273:0x06dc, B:75:0x033a, B:274:0x06dd, B:275:0x06e2, B:68:0x031c, B:276:0x06e3, B:277:0x06e8, B:59:0x02fe, B:54:0x02e2, B:49:0x02c6, B:44:0x02aa, B:39:0x028e, B:34:0x026e, B:12:0x003d, B:8:0x0029), top: B:282:0x0016 }] */
    private static final List messagesForChannelOlderThan$lambda$12(String str, String str2, MessageDao_Impl messageDao_Impl, Date date, int i13, InterfaceC33687a _connection) throws Exception {
        int i14;
        int i15;
        int i16;
        ChannelInfoEntity channelInfoEntity;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        Integer numValueOf;
        MessageDao_Impl messageDao_Impl2 = messageDao_Impl;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            Long lDateToTimestamp = messageDao_Impl2.__dateConverter.dateToTimestamp(date);
            if (lDateToTimestamp == null) {
                interfaceC33689cMo68212g1.mo5359u(2);
            } else {
                interfaceC33689cMo68212g1.mo5356p(2, lDateToTimestamp.longValue());
            }
            Long lDateToTimestamp2 = messageDao_Impl2.__dateConverter.dateToTimestamp(date);
            if (lDateToTimestamp2 == null) {
                interfaceC33689cMo68212g1.mo5359u(3);
            } else {
                interfaceC33689cMo68212g1.mo5356p(3, lDateToTimestamp2.longValue());
            }
            interfaceC33689cMo68212g1.mo5356p(4, i13);
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
            String str3 = "getValue(...)";
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedLocallyAt");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "remoteMentionedUserIds");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mentionedUsersId");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionCounts");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionScores");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionGroups");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "shadowed");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "i18n");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyToId");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinned");
            int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedAt");
            int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinExpires");
            int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedByUserId");
            int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "threadParticipantsIds");
            int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPushNotification");
            int iM60658N34 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipEnrichUrl");
            int iM60658N35 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderationDetails");
            int iM60658N36 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderation");
            int iM60658N37 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageTextUpdatedAt");
            int iM60658N38 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pollId");
            int iM60658N39 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "restrictedVisibility");
            int iM60658N40 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.CATEGORY_REMINDER);
            int iM60658N41 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sharedLocation");
            int iM60658N42 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelRole");
            int iM60658N43 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedForMe");
            int iM60658N44 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infocid");
            int iM60658N45 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoid");
            int iM60658N46 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infotype");
            int iM60658N47 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infomemberCount");
            int iM60658N48 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoname");
            int i17 = iM60658N12;
            C0022g c0022g = new C0022g(0);
            int i18 = iM60658N11;
            C0022g c0022g2 = new C0022g(0);
            int i19 = iM60658N10;
            C0022g c0022g3 = new C0022g(0);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g.containsKey(strMo5353J3)) {
                    c0022g.put(strMo5353J3, new ArrayList());
                }
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g2.containsKey(strMo5353J4)) {
                    c0022g2.put(strMo5353J4, new ArrayList());
                }
                String strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g3.containsKey(strMo5353J5)) {
                    c0022g3.put(strMo5353J5, new ArrayList());
                }
                iM60658N9 = iM60658N9;
            }
            int i24 = iM60658N9;
            interfaceC33689cMo68212g1.reset();
            messageDao_Impl2.m54706xafdba081(_connection, c0022g);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g2);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g3);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J7 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J8 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J9 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J10 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J11 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                int i25 = iM60658N2;
                SyncStatus syncStatusStringToSyncStatus = messageDao_Impl2.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N7));
                int i26 = (int) interfaceC33689cMo68212g1.getLong(iM60658N8);
                int i27 = iM60658N4;
                int i28 = i24;
                int i29 = iM60658N3;
                int i34 = (int) interfaceC33689cMo68212g1.getLong(i28);
                int i35 = i19;
                Date dateFromTimestamp = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i35) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i35)));
                int i36 = i18;
                i18 = i36;
                Date dateFromTimestamp2 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i36) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i36)));
                int i37 = i17;
                i17 = i37;
                Date dateFromTimestamp3 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i37) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i37)));
                int i38 = iM60658N13;
                iM60658N13 = i38;
                Date dateFromTimestamp4 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i38) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i38)));
                int i39 = iM60658N14;
                iM60658N14 = i39;
                Date dateFromTimestamp5 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i39) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i39)));
                int i44 = iM60658N15;
                iM60658N15 = i44;
                List<String> stringList = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i44) ? null : interfaceC33689cMo68212g1.mo5353J0(i44));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i45 = iM60658N16;
                List<String> stringList2 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i45) ? null : interfaceC33689cMo68212g1.mo5353J0(i45));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i46 = iM60658N17;
                iM60658N17 = i46;
                Map<String, Integer> mapStringToMap = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i46) ? null : interfaceC33689cMo68212g1.mo5353J0(i46));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                iM60658N18 = iM60658N18;
                Map<String, Integer> mapStringToMap2 = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N18) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N18));
                if (mapStringToMap2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                iM60658N19 = iM60658N19;
                Map<String, ReactionGroupEntity> mapStringToReactionGroupEntityMap = messageDao_Impl2.__reactionGroupConverter.stringToReactionGroupEntityMap(interfaceC33689cMo68212g1.isNull(iM60658N19) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N19));
                if (mapStringToReactionGroupEntityMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>', but it was NULL.");
                }
                iM60658N20 = iM60658N20;
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(iM60658N20) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N20);
                iM60658N21 = iM60658N21;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(iM60658N21) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N21);
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N22)) != 0;
                int i47 = iM60658N23;
                iM60658N22 = iM60658N22;
                Map<String, String> mapStringToStringMap = messageDao_Impl2.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(i47) ? null : interfaceC33689cMo68212g1.mo5353J0(i47));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                iM60658N23 = i47;
                int i48 = iM60658N24;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(i48)) != 0;
                int i49 = iM60658N5;
                int i54 = iM60658N25;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(i54)) != 0;
                int i55 = iM60658N26;
                Map<String, Object> mapStringToMap3 = messageDao_Impl2.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i55) ? null : interfaceC33689cMo68212g1.mo5353J0(i55));
                if (mapStringToMap3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                int i56 = iM60658N27;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(i56) ? null : interfaceC33689cMo68212g1.mo5353J0(i56);
                iM60658N27 = i56;
                int i57 = iM60658N28;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(i57)) != 0;
                int i58 = iM60658N29;
                iM60658N29 = i58;
                Date dateFromTimestamp6 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i58) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i58)));
                int i59 = iM60658N30;
                iM60658N30 = i59;
                Date dateFromTimestamp7 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i59) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i59)));
                iM60658N31 = iM60658N31;
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(iM60658N31) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N31);
                int i64 = iM60658N32;
                iM60658N32 = i64;
                List<String> stringList3 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i64) ? null : interfaceC33689cMo68212g1.mo5353J0(i64));
                if (stringList3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i65 = iM60658N33;
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(i65)) != 0;
                int i66 = iM60658N34;
                boolean z17 = ((int) interfaceC33689cMo68212g1.getLong(i66)) != 0;
                int i67 = iM60658N35;
                ModerationDetailsEntity moderationDetailsEntityStringToModerationDetails = messageDao_Impl2.__moderationDetailsConverter.stringToModerationDetails(interfaceC33689cMo68212g1.isNull(i67) ? null : interfaceC33689cMo68212g1.mo5353J0(i67));
                int i68 = iM60658N36;
                iM60658N36 = i68;
                ModerationEntity moderationEntityStringToModeration = messageDao_Impl2.__moderationConverter.stringToModeration(interfaceC33689cMo68212g1.isNull(i68) ? null : interfaceC33689cMo68212g1.mo5353J0(i68));
                int i69 = iM60658N37;
                iM60658N37 = i69;
                Date dateFromTimestamp8 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i69) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i69)));
                iM60658N38 = iM60658N38;
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(iM60658N38) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N38);
                int i74 = iM60658N39;
                List<String> stringList4 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i74) ? null : interfaceC33689cMo68212g1.mo5353J0(i74));
                if (stringList4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i75 = iM60658N40;
                ReminderInfoEntity reminderInfoEntityStringToReminderInfo = messageDao_Impl2.__reminderInfoConverter.stringToReminderInfo(interfaceC33689cMo68212g1.isNull(i75) ? null : interfaceC33689cMo68212g1.mo5353J0(i75));
                int i76 = iM60658N41;
                iM60658N41 = i76;
                LocationEntity locationEntityStringToLocation = messageDao_Impl2.__locationConverter.stringToLocation(interfaceC33689cMo68212g1.isNull(i76) ? null : interfaceC33689cMo68212g1.mo5353J0(i76));
                int i77 = iM60658N42;
                String strMo5353J17 = interfaceC33689cMo68212g1.isNull(i77) ? null : interfaceC33689cMo68212g1.mo5353J0(i77);
                iM60658N42 = i77;
                iM60658N40 = i75;
                iM60658N43 = iM60658N43;
                boolean z18 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N43)) != 0;
                iM60658N44 = iM60658N44;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    iM60658N45 = iM60658N45;
                    if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                        i14 = iM60658N46;
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            iM60658N43 = iM60658N43;
                            i15 = iM60658N47;
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                i67 = i67;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    iM60658N44 = iM60658N44;
                                    iM60658N45 = iM60658N45;
                                    channelInfoEntity = null;
                                } else {
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                        strMo5353J0 = null;
                                    } else {
                                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                        strMo5353J1 = null;
                                    } else {
                                        strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                                }
                            } else {
                                i67 = i67;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                }
                                if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                    strMo5353J1 = null;
                                } else {
                                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                            }
                        } else {
                            iM60658N43 = iM60658N43;
                            i67 = i67;
                            i15 = iM60658N47;
                            i16 = iM60658N48;
                            if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                            }
                            if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                strMo5353J1 = null;
                            } else {
                                strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                        }
                    }
                    MessageInnerEntity messageInnerEntity = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i26, i34, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                    Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                    iM60658N46 = i14;
                    String str4 = str3;
                    AbstractC22676k.m65749i(objM73986U, str4);
                    C0022g c0022g4 = c0022g;
                    Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                    AbstractC22676k.m65749i(objM73986U2, str4);
                    iM60658N47 = i15;
                    Object objM73986U3 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                    AbstractC22676k.m65749i(objM73986U3, str4);
                    arrayList.add(new MessageEntity(messageInnerEntity, (List) objM73986U, (List) objM73986U2, (List) objM73986U3));
                    int i78 = i67;
                    iM60658N39 = i74;
                    iM60658N5 = i49;
                    iM60658N24 = i48;
                    iM60658N25 = i54;
                    iM60658N26 = i55;
                    iM60658N28 = i57;
                    iM60658N33 = i65;
                    iM60658N34 = i66;
                    iM60658N35 = i78;
                    messageDao_Impl2 = messageDao_Impl;
                    iM60658N2 = i25;
                    c0022g = c0022g4;
                    str3 = str4;
                    iM60658N3 = i29;
                    iM60658N48 = i16;
                    i24 = i28;
                    iM60658N4 = i27;
                    i19 = i35;
                    iM60658N16 = i45;
                } else {
                    iM60658N45 = iM60658N45;
                }
                i14 = iM60658N46;
                i15 = iM60658N47;
                i16 = iM60658N48;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                }
                if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                    strMo5353J1 = null;
                } else {
                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                MessageInnerEntity messageInnerEntity2 = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i26, i34, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                Object objM73986U4 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                iM60658N46 = i14;
                String str5 = str3;
                AbstractC22676k.m65749i(objM73986U4, str5);
                C0022g c0022g5 = c0022g;
                Object objM73986U5 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                AbstractC22676k.m65749i(objM73986U5, str5);
                iM60658N47 = i15;
                Object objM73986U6 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                AbstractC22676k.m65749i(objM73986U6, str5);
                arrayList.add(new MessageEntity(messageInnerEntity2, (List) objM73986U4, (List) objM73986U5, (List) objM73986U6));
                int i79 = i67;
                iM60658N39 = i74;
                iM60658N5 = i49;
                iM60658N24 = i48;
                iM60658N25 = i54;
                iM60658N26 = i55;
                iM60658N28 = i57;
                iM60658N33 = i65;
                iM60658N34 = i66;
                iM60658N35 = i79;
                messageDao_Impl2 = messageDao_Impl;
                iM60658N2 = i25;
                c0022g = c0022g5;
                str3 = str5;
                iM60658N3 = i29;
                iM60658N48 = i16;
                i24 = i28;
                iM60658N4 = i27;
                i19 = i35;
                iM60658N16 = i45;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:232:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:233:0x05c9 A[Catch: all -> 0x01bd, TryCatch #0 {all -> 0x01bd, blocks: (B:3:0x0014, B:4:0x01a2, B:6:0x01a8, B:8:0x01b2, B:12:0x01c2, B:14:0x01cc, B:15:0x01d4, B:17:0x01de, B:19:0x01ea, B:20:0x01fd, B:22:0x0203, B:27:0x0255, B:32:0x0271, B:37:0x028d, B:42:0x02a9, B:47:0x02c5, B:52:0x02dd, B:56:0x02e9, B:61:0x02ff, B:63:0x0307, B:68:0x0319, B:72:0x0325, B:77:0x033b, B:79:0x0343, B:83:0x0352, B:85:0x035a, B:90:0x036e, B:94:0x038d, B:99:0x039c, B:104:0x03ac, B:106:0x03b4, B:111:0x03c9, B:116:0x03d8, B:121:0x03e8, B:123:0x03f0, B:128:0x0408, B:133:0x0417, B:138:0x042b, B:143:0x0447, B:148:0x0461, B:153:0x0477, B:155:0x047f, B:160:0x0494, B:165:0x04a3, B:170:0x04b3, B:175:0x04cb, B:180:0x04e7, B:185:0x0501, B:190:0x0517, B:192:0x051f, B:196:0x052e, B:201:0x0546, B:206:0x0564, B:211:0x0573, B:213:0x0579, B:215:0x0581, B:217:0x0589, B:219:0x0593, B:230:0x05c0, B:234:0x05cf, B:238:0x05de, B:242:0x05ed, B:246:0x0609, B:250:0x0617, B:251:0x061e, B:249:0x0612, B:245:0x05fa, B:241:0x05e7, B:237:0x05d8, B:233:0x05c9, B:205:0x055d, B:200:0x0541, B:195:0x052a, B:252:0x0689, B:253:0x068e, B:189:0x050e, B:184:0x04fa, B:179:0x04de, B:174:0x04c6, B:169:0x04ae, B:254:0x068f, B:255:0x0694, B:152:0x046e, B:147:0x045a, B:142:0x043e, B:137:0x0422, B:127:0x0401, B:256:0x0695, B:257:0x069c, B:120:0x03e3, B:258:0x069d, B:259:0x06a4, B:103:0x03a7, B:93:0x037f, B:89:0x0367, B:260:0x06a5, B:261:0x06ac, B:82:0x034e, B:262:0x06ad, B:263:0x06b2, B:76:0x0332, B:264:0x06b3, B:265:0x06b8, B:67:0x0314, B:266:0x06b9, B:267:0x06be, B:60:0x02f6, B:268:0x06bf, B:269:0x06c4, B:51:0x02d8, B:46:0x02bc, B:41:0x02a0, B:36:0x0284, B:31:0x0268, B:26:0x0248), top: B:274:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:237:0x05d8 A[Catch: all -> 0x01bd, TryCatch #0 {all -> 0x01bd, blocks: (B:3:0x0014, B:4:0x01a2, B:6:0x01a8, B:8:0x01b2, B:12:0x01c2, B:14:0x01cc, B:15:0x01d4, B:17:0x01de, B:19:0x01ea, B:20:0x01fd, B:22:0x0203, B:27:0x0255, B:32:0x0271, B:37:0x028d, B:42:0x02a9, B:47:0x02c5, B:52:0x02dd, B:56:0x02e9, B:61:0x02ff, B:63:0x0307, B:68:0x0319, B:72:0x0325, B:77:0x033b, B:79:0x0343, B:83:0x0352, B:85:0x035a, B:90:0x036e, B:94:0x038d, B:99:0x039c, B:104:0x03ac, B:106:0x03b4, B:111:0x03c9, B:116:0x03d8, B:121:0x03e8, B:123:0x03f0, B:128:0x0408, B:133:0x0417, B:138:0x042b, B:143:0x0447, B:148:0x0461, B:153:0x0477, B:155:0x047f, B:160:0x0494, B:165:0x04a3, B:170:0x04b3, B:175:0x04cb, B:180:0x04e7, B:185:0x0501, B:190:0x0517, B:192:0x051f, B:196:0x052e, B:201:0x0546, B:206:0x0564, B:211:0x0573, B:213:0x0579, B:215:0x0581, B:217:0x0589, B:219:0x0593, B:230:0x05c0, B:234:0x05cf, B:238:0x05de, B:242:0x05ed, B:246:0x0609, B:250:0x0617, B:251:0x061e, B:249:0x0612, B:245:0x05fa, B:241:0x05e7, B:237:0x05d8, B:233:0x05c9, B:205:0x055d, B:200:0x0541, B:195:0x052a, B:252:0x0689, B:253:0x068e, B:189:0x050e, B:184:0x04fa, B:179:0x04de, B:174:0x04c6, B:169:0x04ae, B:254:0x068f, B:255:0x0694, B:152:0x046e, B:147:0x045a, B:142:0x043e, B:137:0x0422, B:127:0x0401, B:256:0x0695, B:257:0x069c, B:120:0x03e3, B:258:0x069d, B:259:0x06a4, B:103:0x03a7, B:93:0x037f, B:89:0x0367, B:260:0x06a5, B:261:0x06ac, B:82:0x034e, B:262:0x06ad, B:263:0x06b2, B:76:0x0332, B:264:0x06b3, B:265:0x06b8, B:67:0x0314, B:266:0x06b9, B:267:0x06be, B:60:0x02f6, B:268:0x06bf, B:269:0x06c4, B:51:0x02d8, B:46:0x02bc, B:41:0x02a0, B:36:0x0284, B:31:0x0268, B:26:0x0248), top: B:274:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:241:0x05e7 A[Catch: all -> 0x01bd, TryCatch #0 {all -> 0x01bd, blocks: (B:3:0x0014, B:4:0x01a2, B:6:0x01a8, B:8:0x01b2, B:12:0x01c2, B:14:0x01cc, B:15:0x01d4, B:17:0x01de, B:19:0x01ea, B:20:0x01fd, B:22:0x0203, B:27:0x0255, B:32:0x0271, B:37:0x028d, B:42:0x02a9, B:47:0x02c5, B:52:0x02dd, B:56:0x02e9, B:61:0x02ff, B:63:0x0307, B:68:0x0319, B:72:0x0325, B:77:0x033b, B:79:0x0343, B:83:0x0352, B:85:0x035a, B:90:0x036e, B:94:0x038d, B:99:0x039c, B:104:0x03ac, B:106:0x03b4, B:111:0x03c9, B:116:0x03d8, B:121:0x03e8, B:123:0x03f0, B:128:0x0408, B:133:0x0417, B:138:0x042b, B:143:0x0447, B:148:0x0461, B:153:0x0477, B:155:0x047f, B:160:0x0494, B:165:0x04a3, B:170:0x04b3, B:175:0x04cb, B:180:0x04e7, B:185:0x0501, B:190:0x0517, B:192:0x051f, B:196:0x052e, B:201:0x0546, B:206:0x0564, B:211:0x0573, B:213:0x0579, B:215:0x0581, B:217:0x0589, B:219:0x0593, B:230:0x05c0, B:234:0x05cf, B:238:0x05de, B:242:0x05ed, B:246:0x0609, B:250:0x0617, B:251:0x061e, B:249:0x0612, B:245:0x05fa, B:241:0x05e7, B:237:0x05d8, B:233:0x05c9, B:205:0x055d, B:200:0x0541, B:195:0x052a, B:252:0x0689, B:253:0x068e, B:189:0x050e, B:184:0x04fa, B:179:0x04de, B:174:0x04c6, B:169:0x04ae, B:254:0x068f, B:255:0x0694, B:152:0x046e, B:147:0x045a, B:142:0x043e, B:137:0x0422, B:127:0x0401, B:256:0x0695, B:257:0x069c, B:120:0x03e3, B:258:0x069d, B:259:0x06a4, B:103:0x03a7, B:93:0x037f, B:89:0x0367, B:260:0x06a5, B:261:0x06ac, B:82:0x034e, B:262:0x06ad, B:263:0x06b2, B:76:0x0332, B:264:0x06b3, B:265:0x06b8, B:67:0x0314, B:266:0x06b9, B:267:0x06be, B:60:0x02f6, B:268:0x06bf, B:269:0x06c4, B:51:0x02d8, B:46:0x02bc, B:41:0x02a0, B:36:0x0284, B:31:0x0268, B:26:0x0248), top: B:274:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:245:0x05fa A[Catch: all -> 0x01bd, TryCatch #0 {all -> 0x01bd, blocks: (B:3:0x0014, B:4:0x01a2, B:6:0x01a8, B:8:0x01b2, B:12:0x01c2, B:14:0x01cc, B:15:0x01d4, B:17:0x01de, B:19:0x01ea, B:20:0x01fd, B:22:0x0203, B:27:0x0255, B:32:0x0271, B:37:0x028d, B:42:0x02a9, B:47:0x02c5, B:52:0x02dd, B:56:0x02e9, B:61:0x02ff, B:63:0x0307, B:68:0x0319, B:72:0x0325, B:77:0x033b, B:79:0x0343, B:83:0x0352, B:85:0x035a, B:90:0x036e, B:94:0x038d, B:99:0x039c, B:104:0x03ac, B:106:0x03b4, B:111:0x03c9, B:116:0x03d8, B:121:0x03e8, B:123:0x03f0, B:128:0x0408, B:133:0x0417, B:138:0x042b, B:143:0x0447, B:148:0x0461, B:153:0x0477, B:155:0x047f, B:160:0x0494, B:165:0x04a3, B:170:0x04b3, B:175:0x04cb, B:180:0x04e7, B:185:0x0501, B:190:0x0517, B:192:0x051f, B:196:0x052e, B:201:0x0546, B:206:0x0564, B:211:0x0573, B:213:0x0579, B:215:0x0581, B:217:0x0589, B:219:0x0593, B:230:0x05c0, B:234:0x05cf, B:238:0x05de, B:242:0x05ed, B:246:0x0609, B:250:0x0617, B:251:0x061e, B:249:0x0612, B:245:0x05fa, B:241:0x05e7, B:237:0x05d8, B:233:0x05c9, B:205:0x055d, B:200:0x0541, B:195:0x052a, B:252:0x0689, B:253:0x068e, B:189:0x050e, B:184:0x04fa, B:179:0x04de, B:174:0x04c6, B:169:0x04ae, B:254:0x068f, B:255:0x0694, B:152:0x046e, B:147:0x045a, B:142:0x043e, B:137:0x0422, B:127:0x0401, B:256:0x0695, B:257:0x069c, B:120:0x03e3, B:258:0x069d, B:259:0x06a4, B:103:0x03a7, B:93:0x037f, B:89:0x0367, B:260:0x06a5, B:261:0x06ac, B:82:0x034e, B:262:0x06ad, B:263:0x06b2, B:76:0x0332, B:264:0x06b3, B:265:0x06b8, B:67:0x0314, B:266:0x06b9, B:267:0x06be, B:60:0x02f6, B:268:0x06bf, B:269:0x06c4, B:51:0x02d8, B:46:0x02bc, B:41:0x02a0, B:36:0x0284, B:31:0x0268, B:26:0x0248), top: B:274:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x0612 A[Catch: all -> 0x01bd, TryCatch #0 {all -> 0x01bd, blocks: (B:3:0x0014, B:4:0x01a2, B:6:0x01a8, B:8:0x01b2, B:12:0x01c2, B:14:0x01cc, B:15:0x01d4, B:17:0x01de, B:19:0x01ea, B:20:0x01fd, B:22:0x0203, B:27:0x0255, B:32:0x0271, B:37:0x028d, B:42:0x02a9, B:47:0x02c5, B:52:0x02dd, B:56:0x02e9, B:61:0x02ff, B:63:0x0307, B:68:0x0319, B:72:0x0325, B:77:0x033b, B:79:0x0343, B:83:0x0352, B:85:0x035a, B:90:0x036e, B:94:0x038d, B:99:0x039c, B:104:0x03ac, B:106:0x03b4, B:111:0x03c9, B:116:0x03d8, B:121:0x03e8, B:123:0x03f0, B:128:0x0408, B:133:0x0417, B:138:0x042b, B:143:0x0447, B:148:0x0461, B:153:0x0477, B:155:0x047f, B:160:0x0494, B:165:0x04a3, B:170:0x04b3, B:175:0x04cb, B:180:0x04e7, B:185:0x0501, B:190:0x0517, B:192:0x051f, B:196:0x052e, B:201:0x0546, B:206:0x0564, B:211:0x0573, B:213:0x0579, B:215:0x0581, B:217:0x0589, B:219:0x0593, B:230:0x05c0, B:234:0x05cf, B:238:0x05de, B:242:0x05ed, B:246:0x0609, B:250:0x0617, B:251:0x061e, B:249:0x0612, B:245:0x05fa, B:241:0x05e7, B:237:0x05d8, B:233:0x05c9, B:205:0x055d, B:200:0x0541, B:195:0x052a, B:252:0x0689, B:253:0x068e, B:189:0x050e, B:184:0x04fa, B:179:0x04de, B:174:0x04c6, B:169:0x04ae, B:254:0x068f, B:255:0x0694, B:152:0x046e, B:147:0x045a, B:142:0x043e, B:137:0x0422, B:127:0x0401, B:256:0x0695, B:257:0x069c, B:120:0x03e3, B:258:0x069d, B:259:0x06a4, B:103:0x03a7, B:93:0x037f, B:89:0x0367, B:260:0x06a5, B:261:0x06ac, B:82:0x034e, B:262:0x06ad, B:263:0x06b2, B:76:0x0332, B:264:0x06b3, B:265:0x06b8, B:67:0x0314, B:266:0x06b9, B:267:0x06be, B:60:0x02f6, B:268:0x06bf, B:269:0x06c4, B:51:0x02d8, B:46:0x02bc, B:41:0x02a0, B:36:0x0284, B:31:0x0268, B:26:0x0248), top: B:274:0x0014 }] */
    private static final List messagesForThread$lambda$15(String str, String str2, int i13, MessageDao_Impl messageDao_Impl, InterfaceC33687a _connection) throws Exception {
        int i14;
        int i15;
        int i16;
        ChannelInfoEntity channelInfoEntity;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        Integer numValueOf;
        MessageDao_Impl messageDao_Impl2 = messageDao_Impl;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            interfaceC33689cMo68212g1.mo5354L(2, str2);
            interfaceC33689cMo68212g1.mo5356p(3, i13);
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
            String str3 = "getValue(...)";
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedLocallyAt");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "remoteMentionedUserIds");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mentionedUsersId");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionCounts");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionScores");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionGroups");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "shadowed");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "i18n");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyToId");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinned");
            int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedAt");
            int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinExpires");
            int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedByUserId");
            int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "threadParticipantsIds");
            int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPushNotification");
            int iM60658N34 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipEnrichUrl");
            int iM60658N35 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderationDetails");
            int iM60658N36 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderation");
            int iM60658N37 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageTextUpdatedAt");
            int iM60658N38 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pollId");
            int iM60658N39 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "restrictedVisibility");
            int iM60658N40 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.CATEGORY_REMINDER);
            int iM60658N41 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sharedLocation");
            int iM60658N42 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelRole");
            int iM60658N43 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedForMe");
            int iM60658N44 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infocid");
            int iM60658N45 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoid");
            int iM60658N46 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infotype");
            int iM60658N47 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infomemberCount");
            int iM60658N48 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoname");
            int i17 = iM60658N12;
            C0022g c0022g = new C0022g(0);
            int i18 = iM60658N11;
            C0022g c0022g2 = new C0022g(0);
            int i19 = iM60658N10;
            C0022g c0022g3 = new C0022g(0);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g.containsKey(strMo5353J3)) {
                    c0022g.put(strMo5353J3, new ArrayList());
                }
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g2.containsKey(strMo5353J4)) {
                    c0022g2.put(strMo5353J4, new ArrayList());
                }
                String strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g3.containsKey(strMo5353J5)) {
                    c0022g3.put(strMo5353J5, new ArrayList());
                }
                iM60658N9 = iM60658N9;
            }
            int i24 = iM60658N9;
            interfaceC33689cMo68212g1.reset();
            messageDao_Impl2.m54706xafdba081(_connection, c0022g);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g2);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g3);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J7 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J8 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J9 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J10 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J11 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                int i25 = iM60658N2;
                SyncStatus syncStatusStringToSyncStatus = messageDao_Impl2.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N7));
                int i26 = (int) interfaceC33689cMo68212g1.getLong(iM60658N8);
                int i27 = iM60658N4;
                int i28 = i24;
                int i29 = iM60658N3;
                int i34 = (int) interfaceC33689cMo68212g1.getLong(i28);
                int i35 = i19;
                Date dateFromTimestamp = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i35) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i35)));
                int i36 = i18;
                i18 = i36;
                Date dateFromTimestamp2 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i36) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i36)));
                int i37 = i17;
                i17 = i37;
                Date dateFromTimestamp3 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i37) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i37)));
                int i38 = iM60658N13;
                iM60658N13 = i38;
                Date dateFromTimestamp4 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i38) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i38)));
                int i39 = iM60658N14;
                iM60658N14 = i39;
                Date dateFromTimestamp5 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i39) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i39)));
                int i44 = iM60658N15;
                iM60658N15 = i44;
                List<String> stringList = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i44) ? null : interfaceC33689cMo68212g1.mo5353J0(i44));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i45 = iM60658N16;
                List<String> stringList2 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i45) ? null : interfaceC33689cMo68212g1.mo5353J0(i45));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i46 = iM60658N17;
                iM60658N17 = i46;
                Map<String, Integer> mapStringToMap = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i46) ? null : interfaceC33689cMo68212g1.mo5353J0(i46));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                iM60658N18 = iM60658N18;
                Map<String, Integer> mapStringToMap2 = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N18) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N18));
                if (mapStringToMap2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                iM60658N19 = iM60658N19;
                Map<String, ReactionGroupEntity> mapStringToReactionGroupEntityMap = messageDao_Impl2.__reactionGroupConverter.stringToReactionGroupEntityMap(interfaceC33689cMo68212g1.isNull(iM60658N19) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N19));
                if (mapStringToReactionGroupEntityMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>', but it was NULL.");
                }
                iM60658N20 = iM60658N20;
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(iM60658N20) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N20);
                iM60658N21 = iM60658N21;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(iM60658N21) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N21);
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N22)) != 0;
                int i47 = iM60658N23;
                iM60658N22 = iM60658N22;
                Map<String, String> mapStringToStringMap = messageDao_Impl2.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(i47) ? null : interfaceC33689cMo68212g1.mo5353J0(i47));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                iM60658N23 = i47;
                int i48 = iM60658N24;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(i48)) != 0;
                int i49 = iM60658N5;
                int i54 = iM60658N25;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(i54)) != 0;
                int i55 = iM60658N26;
                Map<String, Object> mapStringToMap3 = messageDao_Impl2.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i55) ? null : interfaceC33689cMo68212g1.mo5353J0(i55));
                if (mapStringToMap3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                int i56 = iM60658N27;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(i56) ? null : interfaceC33689cMo68212g1.mo5353J0(i56);
                iM60658N27 = i56;
                int i57 = iM60658N28;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(i57)) != 0;
                int i58 = iM60658N29;
                iM60658N29 = i58;
                Date dateFromTimestamp6 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i58) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i58)));
                int i59 = iM60658N30;
                iM60658N30 = i59;
                Date dateFromTimestamp7 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i59) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i59)));
                iM60658N31 = iM60658N31;
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(iM60658N31) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N31);
                int i64 = iM60658N32;
                iM60658N32 = i64;
                List<String> stringList3 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i64) ? null : interfaceC33689cMo68212g1.mo5353J0(i64));
                if (stringList3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i65 = iM60658N33;
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(i65)) != 0;
                int i66 = iM60658N34;
                boolean z17 = ((int) interfaceC33689cMo68212g1.getLong(i66)) != 0;
                int i67 = iM60658N35;
                ModerationDetailsEntity moderationDetailsEntityStringToModerationDetails = messageDao_Impl2.__moderationDetailsConverter.stringToModerationDetails(interfaceC33689cMo68212g1.isNull(i67) ? null : interfaceC33689cMo68212g1.mo5353J0(i67));
                int i68 = iM60658N36;
                iM60658N36 = i68;
                ModerationEntity moderationEntityStringToModeration = messageDao_Impl2.__moderationConverter.stringToModeration(interfaceC33689cMo68212g1.isNull(i68) ? null : interfaceC33689cMo68212g1.mo5353J0(i68));
                int i69 = iM60658N37;
                iM60658N37 = i69;
                Date dateFromTimestamp8 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i69) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i69)));
                iM60658N38 = iM60658N38;
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(iM60658N38) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N38);
                int i74 = iM60658N39;
                List<String> stringList4 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i74) ? null : interfaceC33689cMo68212g1.mo5353J0(i74));
                if (stringList4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i75 = iM60658N40;
                ReminderInfoEntity reminderInfoEntityStringToReminderInfo = messageDao_Impl2.__reminderInfoConverter.stringToReminderInfo(interfaceC33689cMo68212g1.isNull(i75) ? null : interfaceC33689cMo68212g1.mo5353J0(i75));
                int i76 = iM60658N41;
                iM60658N41 = i76;
                LocationEntity locationEntityStringToLocation = messageDao_Impl2.__locationConverter.stringToLocation(interfaceC33689cMo68212g1.isNull(i76) ? null : interfaceC33689cMo68212g1.mo5353J0(i76));
                int i77 = iM60658N42;
                String strMo5353J17 = interfaceC33689cMo68212g1.isNull(i77) ? null : interfaceC33689cMo68212g1.mo5353J0(i77);
                iM60658N42 = i77;
                iM60658N40 = i75;
                iM60658N43 = iM60658N43;
                boolean z18 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N43)) != 0;
                iM60658N44 = iM60658N44;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    iM60658N45 = iM60658N45;
                    if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                        i14 = iM60658N46;
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            iM60658N43 = iM60658N43;
                            i15 = iM60658N47;
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                i67 = i67;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    iM60658N44 = iM60658N44;
                                    iM60658N45 = iM60658N45;
                                    channelInfoEntity = null;
                                } else {
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                        strMo5353J0 = null;
                                    } else {
                                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                        strMo5353J1 = null;
                                    } else {
                                        strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                                }
                            } else {
                                i67 = i67;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                }
                                if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                    strMo5353J1 = null;
                                } else {
                                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                            }
                        } else {
                            iM60658N43 = iM60658N43;
                            i67 = i67;
                            i15 = iM60658N47;
                            i16 = iM60658N48;
                            if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                            }
                            if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                strMo5353J1 = null;
                            } else {
                                strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                        }
                    }
                    MessageInnerEntity messageInnerEntity = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i26, i34, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                    Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                    iM60658N46 = i14;
                    String str4 = str3;
                    AbstractC22676k.m65749i(objM73986U, str4);
                    C0022g c0022g4 = c0022g;
                    Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                    AbstractC22676k.m65749i(objM73986U2, str4);
                    iM60658N47 = i15;
                    Object objM73986U3 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                    AbstractC22676k.m65749i(objM73986U3, str4);
                    int i78 = iM60658N;
                    arrayList.add(new MessageEntity(messageInnerEntity, (List) objM73986U, (List) objM73986U2, (List) objM73986U3));
                    int i79 = i67;
                    iM60658N39 = i74;
                    iM60658N5 = i49;
                    iM60658N24 = i48;
                    iM60658N25 = i54;
                    iM60658N26 = i55;
                    iM60658N28 = i57;
                    iM60658N33 = i65;
                    iM60658N34 = i66;
                    iM60658N35 = i79;
                    iM60658N2 = i25;
                    c0022g = c0022g4;
                    iM60658N = i78;
                    iM60658N3 = i29;
                    str3 = str4;
                    iM60658N48 = i16;
                    i24 = i28;
                    iM60658N4 = i27;
                    messageDao_Impl2 = messageDao_Impl;
                    i19 = i35;
                    iM60658N16 = i45;
                } else {
                    iM60658N45 = iM60658N45;
                }
                i14 = iM60658N46;
                i15 = iM60658N47;
                i16 = iM60658N48;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                }
                if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                    strMo5353J1 = null;
                } else {
                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                MessageInnerEntity messageInnerEntity2 = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i26, i34, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                Object objM73986U4 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                iM60658N46 = i14;
                String str5 = str3;
                AbstractC22676k.m65749i(objM73986U4, str5);
                C0022g c0022g5 = c0022g;
                Object objM73986U5 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                AbstractC22676k.m65749i(objM73986U5, str5);
                iM60658N47 = i15;
                Object objM73986U6 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                AbstractC22676k.m65749i(objM73986U6, str5);
                int i710 = iM60658N;
                arrayList.add(new MessageEntity(messageInnerEntity2, (List) objM73986U4, (List) objM73986U5, (List) objM73986U6));
                int i711 = i67;
                iM60658N39 = i74;
                iM60658N5 = i49;
                iM60658N24 = i48;
                iM60658N25 = i54;
                iM60658N26 = i55;
                iM60658N28 = i57;
                iM60658N33 = i65;
                iM60658N34 = i66;
                iM60658N35 = i711;
                iM60658N2 = i25;
                c0022g = c0022g5;
                iM60658N = i710;
                iM60658N3 = i29;
                str3 = str5;
                iM60658N48 = i16;
                i24 = i28;
                iM60658N4 = i27;
                messageDao_Impl2 = messageDao_Impl;
                i19 = i35;
                iM60658N16 = i45;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ ArrayList m54724o(String str, MessageDao_Impl messageDao_Impl, Date date, int i13, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) messagesForChannelEqualOrOlderThan$lambda$13("SELECT * from stream_chat_message WHERE cid = ? AND (createdAt <= ? OR createdLocallyAt <= ?) ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END DESC LIMIT ?", str, messageDao_Impl, date, i13, interfaceC33687a);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ ArrayList m54725p(String str, int i13, MessageDao_Impl messageDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) messagesForThread$lambda$15("SELECT * from stream_chat_message WHERE parentId = ? OR id = ? ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END DESC LIMIT ?", str, i13, messageDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ ArrayList m54727r(MessageDao_Impl messageDao_Impl, SyncStatus syncStatus, int i13, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectBySyncStatus$lambda$18("SELECT * FROM stream_chat_message WHERE syncStatus = ? ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END ASC LIMIT ?", messageDao_Impl, syncStatus, i13, interfaceC33687a);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ ArrayList m54728s(String str, MessageDao_Impl messageDao_Impl, Date date, int i13, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) messagesForChannelOlderThan$lambda$12("SELECT * from stream_chat_message WHERE cid = ? AND (createdAt < ? OR createdLocallyAt < ?) ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END DESC LIMIT ?", str, messageDao_Impl, date, i13, interfaceC33687a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:210:0x0511  */
    /* JADX WARN: Code duplicated, block: B:211:0x0514 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0014, B:4:0x0197, B:6:0x019d, B:8:0x01a7, B:12:0x01b7, B:14:0x01c1, B:15:0x01c9, B:17:0x01d3, B:19:0x01df, B:21:0x01f4, B:25:0x0235, B:29:0x024d, B:33:0x0265, B:37:0x027d, B:41:0x0295, B:45:0x02a9, B:49:0x02b5, B:53:0x02c1, B:55:0x02c9, B:59:0x02d7, B:63:0x02e3, B:67:0x02ef, B:69:0x02f7, B:73:0x0305, B:75:0x030d, B:80:0x0321, B:85:0x0333, B:90:0x0342, B:94:0x034e, B:96:0x0356, B:101:0x0367, B:106:0x0376, B:110:0x0382, B:112:0x038a, B:117:0x039e, B:122:0x03ad, B:126:0x03bd, B:130:0x03d5, B:135:0x03ef, B:139:0x03fb, B:141:0x0403, B:146:0x0414, B:151:0x0423, B:155:0x042f, B:159:0x0443, B:163:0x045b, B:168:0x0475, B:172:0x0481, B:174:0x0489, B:178:0x0497, B:182:0x04ab, B:187:0x04c5, B:192:0x04d4, B:194:0x04da, B:196:0x04e2, B:198:0x04ea, B:200:0x04f2, B:208:0x050b, B:212:0x051a, B:216:0x0529, B:220:0x0538, B:224:0x054c, B:228:0x055a, B:229:0x0561, B:227:0x0555, B:223:0x0541, B:219:0x0532, B:215:0x0523, B:211:0x0514, B:186:0x04be, B:181:0x04a7, B:177:0x0493, B:230:0x059c, B:231:0x05a1, B:171:0x047d, B:167:0x046e, B:162:0x0453, B:158:0x043f, B:154:0x042b, B:232:0x05a2, B:233:0x05a7, B:138:0x03f7, B:134:0x03e8, B:129:0x03cd, B:125:0x03b5, B:116:0x0397, B:234:0x05a8, B:235:0x05af, B:109:0x037e, B:236:0x05b0, B:237:0x05b7, B:93:0x034a, B:84:0x032c, B:79:0x031a, B:238:0x05b8, B:239:0x05bf, B:72:0x0301, B:240:0x05c0, B:241:0x05c5, B:66:0x02eb, B:242:0x05c6, B:243:0x05cb, B:58:0x02d3, B:244:0x05cc, B:245:0x05d1, B:52:0x02bd, B:246:0x05d2, B:247:0x05d7, B:44:0x02a5, B:40:0x028d, B:36:0x0275, B:32:0x025d, B:28:0x0245, B:24:0x022d), top: B:252:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:214:0x0520  */
    /* JADX WARN: Code duplicated, block: B:215:0x0523 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0014, B:4:0x0197, B:6:0x019d, B:8:0x01a7, B:12:0x01b7, B:14:0x01c1, B:15:0x01c9, B:17:0x01d3, B:19:0x01df, B:21:0x01f4, B:25:0x0235, B:29:0x024d, B:33:0x0265, B:37:0x027d, B:41:0x0295, B:45:0x02a9, B:49:0x02b5, B:53:0x02c1, B:55:0x02c9, B:59:0x02d7, B:63:0x02e3, B:67:0x02ef, B:69:0x02f7, B:73:0x0305, B:75:0x030d, B:80:0x0321, B:85:0x0333, B:90:0x0342, B:94:0x034e, B:96:0x0356, B:101:0x0367, B:106:0x0376, B:110:0x0382, B:112:0x038a, B:117:0x039e, B:122:0x03ad, B:126:0x03bd, B:130:0x03d5, B:135:0x03ef, B:139:0x03fb, B:141:0x0403, B:146:0x0414, B:151:0x0423, B:155:0x042f, B:159:0x0443, B:163:0x045b, B:168:0x0475, B:172:0x0481, B:174:0x0489, B:178:0x0497, B:182:0x04ab, B:187:0x04c5, B:192:0x04d4, B:194:0x04da, B:196:0x04e2, B:198:0x04ea, B:200:0x04f2, B:208:0x050b, B:212:0x051a, B:216:0x0529, B:220:0x0538, B:224:0x054c, B:228:0x055a, B:229:0x0561, B:227:0x0555, B:223:0x0541, B:219:0x0532, B:215:0x0523, B:211:0x0514, B:186:0x04be, B:181:0x04a7, B:177:0x0493, B:230:0x059c, B:231:0x05a1, B:171:0x047d, B:167:0x046e, B:162:0x0453, B:158:0x043f, B:154:0x042b, B:232:0x05a2, B:233:0x05a7, B:138:0x03f7, B:134:0x03e8, B:129:0x03cd, B:125:0x03b5, B:116:0x0397, B:234:0x05a8, B:235:0x05af, B:109:0x037e, B:236:0x05b0, B:237:0x05b7, B:93:0x034a, B:84:0x032c, B:79:0x031a, B:238:0x05b8, B:239:0x05bf, B:72:0x0301, B:240:0x05c0, B:241:0x05c5, B:66:0x02eb, B:242:0x05c6, B:243:0x05cb, B:58:0x02d3, B:244:0x05cc, B:245:0x05d1, B:52:0x02bd, B:246:0x05d2, B:247:0x05d7, B:44:0x02a5, B:40:0x028d, B:36:0x0275, B:32:0x025d, B:28:0x0245, B:24:0x022d), top: B:252:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x052f  */
    /* JADX WARN: Code duplicated, block: B:219:0x0532 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0014, B:4:0x0197, B:6:0x019d, B:8:0x01a7, B:12:0x01b7, B:14:0x01c1, B:15:0x01c9, B:17:0x01d3, B:19:0x01df, B:21:0x01f4, B:25:0x0235, B:29:0x024d, B:33:0x0265, B:37:0x027d, B:41:0x0295, B:45:0x02a9, B:49:0x02b5, B:53:0x02c1, B:55:0x02c9, B:59:0x02d7, B:63:0x02e3, B:67:0x02ef, B:69:0x02f7, B:73:0x0305, B:75:0x030d, B:80:0x0321, B:85:0x0333, B:90:0x0342, B:94:0x034e, B:96:0x0356, B:101:0x0367, B:106:0x0376, B:110:0x0382, B:112:0x038a, B:117:0x039e, B:122:0x03ad, B:126:0x03bd, B:130:0x03d5, B:135:0x03ef, B:139:0x03fb, B:141:0x0403, B:146:0x0414, B:151:0x0423, B:155:0x042f, B:159:0x0443, B:163:0x045b, B:168:0x0475, B:172:0x0481, B:174:0x0489, B:178:0x0497, B:182:0x04ab, B:187:0x04c5, B:192:0x04d4, B:194:0x04da, B:196:0x04e2, B:198:0x04ea, B:200:0x04f2, B:208:0x050b, B:212:0x051a, B:216:0x0529, B:220:0x0538, B:224:0x054c, B:228:0x055a, B:229:0x0561, B:227:0x0555, B:223:0x0541, B:219:0x0532, B:215:0x0523, B:211:0x0514, B:186:0x04be, B:181:0x04a7, B:177:0x0493, B:230:0x059c, B:231:0x05a1, B:171:0x047d, B:167:0x046e, B:162:0x0453, B:158:0x043f, B:154:0x042b, B:232:0x05a2, B:233:0x05a7, B:138:0x03f7, B:134:0x03e8, B:129:0x03cd, B:125:0x03b5, B:116:0x0397, B:234:0x05a8, B:235:0x05af, B:109:0x037e, B:236:0x05b0, B:237:0x05b7, B:93:0x034a, B:84:0x032c, B:79:0x031a, B:238:0x05b8, B:239:0x05bf, B:72:0x0301, B:240:0x05c0, B:241:0x05c5, B:66:0x02eb, B:242:0x05c6, B:243:0x05cb, B:58:0x02d3, B:244:0x05cc, B:245:0x05d1, B:52:0x02bd, B:246:0x05d2, B:247:0x05d7, B:44:0x02a5, B:40:0x028d, B:36:0x0275, B:32:0x025d, B:28:0x0245, B:24:0x022d), top: B:252:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x053e  */
    /* JADX WARN: Code duplicated, block: B:223:0x0541 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0014, B:4:0x0197, B:6:0x019d, B:8:0x01a7, B:12:0x01b7, B:14:0x01c1, B:15:0x01c9, B:17:0x01d3, B:19:0x01df, B:21:0x01f4, B:25:0x0235, B:29:0x024d, B:33:0x0265, B:37:0x027d, B:41:0x0295, B:45:0x02a9, B:49:0x02b5, B:53:0x02c1, B:55:0x02c9, B:59:0x02d7, B:63:0x02e3, B:67:0x02ef, B:69:0x02f7, B:73:0x0305, B:75:0x030d, B:80:0x0321, B:85:0x0333, B:90:0x0342, B:94:0x034e, B:96:0x0356, B:101:0x0367, B:106:0x0376, B:110:0x0382, B:112:0x038a, B:117:0x039e, B:122:0x03ad, B:126:0x03bd, B:130:0x03d5, B:135:0x03ef, B:139:0x03fb, B:141:0x0403, B:146:0x0414, B:151:0x0423, B:155:0x042f, B:159:0x0443, B:163:0x045b, B:168:0x0475, B:172:0x0481, B:174:0x0489, B:178:0x0497, B:182:0x04ab, B:187:0x04c5, B:192:0x04d4, B:194:0x04da, B:196:0x04e2, B:198:0x04ea, B:200:0x04f2, B:208:0x050b, B:212:0x051a, B:216:0x0529, B:220:0x0538, B:224:0x054c, B:228:0x055a, B:229:0x0561, B:227:0x0555, B:223:0x0541, B:219:0x0532, B:215:0x0523, B:211:0x0514, B:186:0x04be, B:181:0x04a7, B:177:0x0493, B:230:0x059c, B:231:0x05a1, B:171:0x047d, B:167:0x046e, B:162:0x0453, B:158:0x043f, B:154:0x042b, B:232:0x05a2, B:233:0x05a7, B:138:0x03f7, B:134:0x03e8, B:129:0x03cd, B:125:0x03b5, B:116:0x0397, B:234:0x05a8, B:235:0x05af, B:109:0x037e, B:236:0x05b0, B:237:0x05b7, B:93:0x034a, B:84:0x032c, B:79:0x031a, B:238:0x05b8, B:239:0x05bf, B:72:0x0301, B:240:0x05c0, B:241:0x05c5, B:66:0x02eb, B:242:0x05c6, B:243:0x05cb, B:58:0x02d3, B:244:0x05cc, B:245:0x05d1, B:52:0x02bd, B:246:0x05d2, B:247:0x05d7, B:44:0x02a5, B:40:0x028d, B:36:0x0275, B:32:0x025d, B:28:0x0245, B:24:0x022d), top: B:252:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:227:0x0555 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0014, B:4:0x0197, B:6:0x019d, B:8:0x01a7, B:12:0x01b7, B:14:0x01c1, B:15:0x01c9, B:17:0x01d3, B:19:0x01df, B:21:0x01f4, B:25:0x0235, B:29:0x024d, B:33:0x0265, B:37:0x027d, B:41:0x0295, B:45:0x02a9, B:49:0x02b5, B:53:0x02c1, B:55:0x02c9, B:59:0x02d7, B:63:0x02e3, B:67:0x02ef, B:69:0x02f7, B:73:0x0305, B:75:0x030d, B:80:0x0321, B:85:0x0333, B:90:0x0342, B:94:0x034e, B:96:0x0356, B:101:0x0367, B:106:0x0376, B:110:0x0382, B:112:0x038a, B:117:0x039e, B:122:0x03ad, B:126:0x03bd, B:130:0x03d5, B:135:0x03ef, B:139:0x03fb, B:141:0x0403, B:146:0x0414, B:151:0x0423, B:155:0x042f, B:159:0x0443, B:163:0x045b, B:168:0x0475, B:172:0x0481, B:174:0x0489, B:178:0x0497, B:182:0x04ab, B:187:0x04c5, B:192:0x04d4, B:194:0x04da, B:196:0x04e2, B:198:0x04ea, B:200:0x04f2, B:208:0x050b, B:212:0x051a, B:216:0x0529, B:220:0x0538, B:224:0x054c, B:228:0x055a, B:229:0x0561, B:227:0x0555, B:223:0x0541, B:219:0x0532, B:215:0x0523, B:211:0x0514, B:186:0x04be, B:181:0x04a7, B:177:0x0493, B:230:0x059c, B:231:0x05a1, B:171:0x047d, B:167:0x046e, B:162:0x0453, B:158:0x043f, B:154:0x042b, B:232:0x05a2, B:233:0x05a7, B:138:0x03f7, B:134:0x03e8, B:129:0x03cd, B:125:0x03b5, B:116:0x0397, B:234:0x05a8, B:235:0x05af, B:109:0x037e, B:236:0x05b0, B:237:0x05b7, B:93:0x034a, B:84:0x032c, B:79:0x031a, B:238:0x05b8, B:239:0x05bf, B:72:0x0301, B:240:0x05c0, B:241:0x05c5, B:66:0x02eb, B:242:0x05c6, B:243:0x05cb, B:58:0x02d3, B:244:0x05cc, B:245:0x05d1, B:52:0x02bd, B:246:0x05d2, B:247:0x05d7, B:44:0x02a5, B:40:0x028d, B:36:0x0275, B:32:0x025d, B:28:0x0245, B:24:0x022d), top: B:252:0x0014 }] */
    public static final MessageEntity select$lambda$16(String str, String str2, MessageDao_Impl messageDao_Impl, InterfaceC33687a _connection) throws Exception {
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
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionCounts");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionScores");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionGroups");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "shadowed");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "i18n");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyToId");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinned");
            int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedAt");
            int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinExpires");
            int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedByUserId");
            int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "threadParticipantsIds");
            int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPushNotification");
            int iM60658N34 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipEnrichUrl");
            int iM60658N35 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderationDetails");
            int iM60658N36 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderation");
            int iM60658N37 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageTextUpdatedAt");
            int iM60658N38 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pollId");
            int iM60658N39 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "restrictedVisibility");
            int iM60658N40 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.CATEGORY_REMINDER);
            int iM60658N41 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sharedLocation");
            int iM60658N42 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelRole");
            int iM60658N43 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedForMe");
            int iM60658N44 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infocid");
            int iM60658N45 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoid");
            int iM60658N46 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infotype");
            int iM60658N47 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infomemberCount");
            int iM60658N48 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoname");
            C0022g c0022g = new C0022g(0);
            C0022g c0022g2 = new C0022g(0);
            C0022g c0022g3 = new C0022g(0);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g.containsKey(strMo5353J3)) {
                    c0022g.put(strMo5353J3, new ArrayList());
                }
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g2.containsKey(strMo5353J4)) {
                    c0022g2.put(strMo5353J4, new ArrayList());
                }
                String strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g3.containsKey(strMo5353J5)) {
                    c0022g3.put(strMo5353J5, new ArrayList());
                }
                iM60658N9 = iM60658N9;
            }
            int i17 = iM60658N9;
            interfaceC33689cMo68212g1.reset();
            messageDao_Impl.m54706xafdba081(_connection, c0022g);
            messageDao_Impl.m54708xab41a0ef(_connection, c0022g2);
            messageDao_Impl.m54708xab41a0ef(_connection, c0022g3);
            MessageEntity messageEntity = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J7 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J8 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J9 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J10 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J11 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                SyncStatus syncStatusStringToSyncStatus = messageDao_Impl.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N7));
                int i18 = (int) interfaceC33689cMo68212g1.getLong(iM60658N8);
                int i19 = (int) interfaceC33689cMo68212g1.getLong(i17);
                Date dateFromTimestamp = messageDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N10)));
                Date dateFromTimestamp2 = messageDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N11)));
                Date dateFromTimestamp3 = messageDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N12) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N12)));
                Date dateFromTimestamp4 = messageDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N13) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N13)));
                Date dateFromTimestamp5 = messageDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N14) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N14)));
                List<String> stringList = messageDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N15) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N15));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                List<String> stringList2 = messageDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N16) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N16));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                Map<String, Integer> mapStringToMap = messageDao_Impl.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N17) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N17));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                Map<String, Integer> mapStringToMap2 = messageDao_Impl.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N18) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N18));
                if (mapStringToMap2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                Map<String, ReactionGroupEntity> mapStringToReactionGroupEntityMap = messageDao_Impl.__reactionGroupConverter.stringToReactionGroupEntityMap(interfaceC33689cMo68212g1.isNull(iM60658N19) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N19));
                if (mapStringToReactionGroupEntityMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>', but it was NULL.");
                }
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(iM60658N20) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N20);
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(iM60658N21) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N21);
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N22)) != 0;
                Map<String, String> mapStringToStringMap = messageDao_Impl.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(iM60658N23) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N23));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N24)) != 0;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N25)) != 0;
                Map<String, Object> mapStringToMap3 = messageDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N26) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N26));
                if (mapStringToMap3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(iM60658N27) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N27);
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N28)) != 0;
                Date dateFromTimestamp6 = messageDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N29) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N29)));
                Date dateFromTimestamp7 = messageDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N30) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N30)));
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(iM60658N31) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N31);
                List<String> stringList3 = messageDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N32) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N32));
                if (stringList3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N33)) != 0;
                boolean z17 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N34)) != 0;
                ModerationDetailsEntity moderationDetailsEntityStringToModerationDetails = messageDao_Impl.__moderationDetailsConverter.stringToModerationDetails(interfaceC33689cMo68212g1.isNull(iM60658N35) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N35));
                ModerationEntity moderationEntityStringToModeration = messageDao_Impl.__moderationConverter.stringToModeration(interfaceC33689cMo68212g1.isNull(iM60658N36) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N36));
                Date dateFromTimestamp8 = messageDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N37) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N37)));
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(iM60658N38) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N38);
                List<String> stringList4 = messageDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N39) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N39));
                if (stringList4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                ReminderInfoEntity reminderInfoEntityStringToReminderInfo = messageDao_Impl.__reminderInfoConverter.stringToReminderInfo(interfaceC33689cMo68212g1.isNull(iM60658N40) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N40));
                LocationEntity locationEntityStringToLocation = messageDao_Impl.__locationConverter.stringToLocation(interfaceC33689cMo68212g1.isNull(iM60658N41) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N41));
                String strMo5353J17 = interfaceC33689cMo68212g1.isNull(iM60658N42) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N42);
                boolean z18 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N43)) != 0;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    i13 = iM60658N45;
                    if (interfaceC33689cMo68212g1.isNull(i13)) {
                        i14 = iM60658N46;
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            i15 = iM60658N47;
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    channelInfoEntity = null;
                                }
                                MessageInnerEntity messageInnerEntity = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i18, i19, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                                Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                                AbstractC22676k.m65749i(objM73986U, "getValue(...)");
                                Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                                AbstractC22676k.m65749i(objM73986U2, "getValue(...)");
                                Object objM73986U3 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                                AbstractC22676k.m65749i(objM73986U3, "getValue(...)");
                                messageEntity = new MessageEntity(messageInnerEntity, (List) objM73986U, (List) objM73986U2, (List) objM73986U3);
                            }
                            if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
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
                            MessageInnerEntity messageInnerEntity2 = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i18, i19, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                            Object objM73986U4 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                            AbstractC22676k.m65749i(objM73986U4, "getValue(...)");
                            Object objM73986U5 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                            AbstractC22676k.m65749i(objM73986U5, "getValue(...)");
                            Object objM73986U6 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                            AbstractC22676k.m65749i(objM73986U6, "getValue(...)");
                            messageEntity = new MessageEntity(messageInnerEntity2, (List) objM73986U4, (List) objM73986U5, (List) objM73986U6);
                        }
                        i16 = iM60658N48;
                        if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                            strMo5353J0 = null;
                        } else {
                            strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
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
                        MessageInnerEntity messageInnerEntity3 = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i18, i19, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                        Object objM73986U7 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                        AbstractC22676k.m65749i(objM73986U7, "getValue(...)");
                        Object objM73986U8 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                        AbstractC22676k.m65749i(objM73986U8, "getValue(...)");
                        Object objM73986U9 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                        AbstractC22676k.m65749i(objM73986U9, "getValue(...)");
                        messageEntity = new MessageEntity(messageInnerEntity3, (List) objM73986U7, (List) objM73986U8, (List) objM73986U9);
                    }
                    i15 = iM60658N47;
                    i16 = iM60658N48;
                    if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                        strMo5353J0 = null;
                    } else {
                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
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
                    MessageInnerEntity messageInnerEntity4 = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i18, i19, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                    Object objM73986U10 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                    AbstractC22676k.m65749i(objM73986U10, "getValue(...)");
                    Object objM73986U11 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                    AbstractC22676k.m65749i(objM73986U11, "getValue(...)");
                    Object objM73986U12 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                    AbstractC22676k.m65749i(objM73986U12, "getValue(...)");
                    messageEntity = new MessageEntity(messageInnerEntity4, (List) objM73986U10, (List) objM73986U11, (List) objM73986U12);
                } else {
                    i13 = iM60658N45;
                }
                i14 = iM60658N46;
                i15 = iM60658N47;
                i16 = iM60658N48;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
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
                MessageInnerEntity messageInnerEntity5 = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i18, i19, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                Object objM73986U13 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                AbstractC22676k.m65749i(objM73986U13, "getValue(...)");
                Object objM73986U14 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                AbstractC22676k.m65749i(objM73986U14, "getValue(...)");
                Object objM73986U15 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                AbstractC22676k.m65749i(objM73986U15, "getValue(...)");
                messageEntity = new MessageEntity(messageInnerEntity5, (List) objM73986U13, (List) objM73986U14, (List) objM73986U15);
            }
            interfaceC33689cMo68212g1.close();
            return messageEntity;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:233:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:234:0x05be A[Catch: all -> 0x01b8, TryCatch #0 {all -> 0x01b8, blocks: (B:3:0x0014, B:4:0x019d, B:6:0x01a3, B:8:0x01ad, B:12:0x01bd, B:14:0x01c7, B:15:0x01cf, B:17:0x01d9, B:19:0x01e5, B:20:0x01f8, B:22:0x01fe, B:27:0x0251, B:32:0x026d, B:37:0x0289, B:42:0x02a5, B:47:0x02c1, B:52:0x02d9, B:56:0x02e5, B:61:0x02fb, B:63:0x0303, B:68:0x0315, B:72:0x0321, B:77:0x0337, B:79:0x033f, B:83:0x034e, B:85:0x0356, B:90:0x036a, B:95:0x0382, B:100:0x0391, B:105:0x03a1, B:107:0x03a9, B:112:0x03be, B:117:0x03cd, B:122:0x03dd, B:124:0x03e5, B:129:0x03fd, B:134:0x040c, B:139:0x0420, B:144:0x043c, B:149:0x0456, B:154:0x046c, B:156:0x0474, B:161:0x0489, B:166:0x0498, B:171:0x04a8, B:176:0x04c0, B:181:0x04dc, B:186:0x04f6, B:191:0x050c, B:193:0x0514, B:197:0x0523, B:202:0x053b, B:207:0x0559, B:212:0x0568, B:214:0x056e, B:216:0x0576, B:218:0x057e, B:220:0x0588, B:231:0x05b5, B:235:0x05c4, B:239:0x05d3, B:243:0x05e2, B:247:0x05fe, B:251:0x060c, B:252:0x0613, B:250:0x0607, B:246:0x05ef, B:242:0x05dc, B:238:0x05cd, B:234:0x05be, B:206:0x0552, B:201:0x0536, B:196:0x051f, B:253:0x066e, B:254:0x0673, B:190:0x0503, B:185:0x04ef, B:180:0x04d3, B:175:0x04bb, B:170:0x04a3, B:255:0x0674, B:256:0x0679, B:153:0x0463, B:148:0x044f, B:143:0x0433, B:138:0x0417, B:128:0x03f6, B:257:0x067a, B:258:0x0681, B:121:0x03d8, B:259:0x0682, B:260:0x0689, B:104:0x039c, B:94:0x037b, B:89:0x0363, B:261:0x068a, B:262:0x0691, B:82:0x034a, B:263:0x0692, B:264:0x0697, B:76:0x032e, B:265:0x0698, B:266:0x069d, B:67:0x0310, B:267:0x069e, B:268:0x06a3, B:60:0x02f2, B:269:0x06a4, B:270:0x06a9, B:51:0x02d4, B:46:0x02b8, B:41:0x029c, B:36:0x0280, B:31:0x0264, B:26:0x0244), top: B:275:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:238:0x05cd A[Catch: all -> 0x01b8, TryCatch #0 {all -> 0x01b8, blocks: (B:3:0x0014, B:4:0x019d, B:6:0x01a3, B:8:0x01ad, B:12:0x01bd, B:14:0x01c7, B:15:0x01cf, B:17:0x01d9, B:19:0x01e5, B:20:0x01f8, B:22:0x01fe, B:27:0x0251, B:32:0x026d, B:37:0x0289, B:42:0x02a5, B:47:0x02c1, B:52:0x02d9, B:56:0x02e5, B:61:0x02fb, B:63:0x0303, B:68:0x0315, B:72:0x0321, B:77:0x0337, B:79:0x033f, B:83:0x034e, B:85:0x0356, B:90:0x036a, B:95:0x0382, B:100:0x0391, B:105:0x03a1, B:107:0x03a9, B:112:0x03be, B:117:0x03cd, B:122:0x03dd, B:124:0x03e5, B:129:0x03fd, B:134:0x040c, B:139:0x0420, B:144:0x043c, B:149:0x0456, B:154:0x046c, B:156:0x0474, B:161:0x0489, B:166:0x0498, B:171:0x04a8, B:176:0x04c0, B:181:0x04dc, B:186:0x04f6, B:191:0x050c, B:193:0x0514, B:197:0x0523, B:202:0x053b, B:207:0x0559, B:212:0x0568, B:214:0x056e, B:216:0x0576, B:218:0x057e, B:220:0x0588, B:231:0x05b5, B:235:0x05c4, B:239:0x05d3, B:243:0x05e2, B:247:0x05fe, B:251:0x060c, B:252:0x0613, B:250:0x0607, B:246:0x05ef, B:242:0x05dc, B:238:0x05cd, B:234:0x05be, B:206:0x0552, B:201:0x0536, B:196:0x051f, B:253:0x066e, B:254:0x0673, B:190:0x0503, B:185:0x04ef, B:180:0x04d3, B:175:0x04bb, B:170:0x04a3, B:255:0x0674, B:256:0x0679, B:153:0x0463, B:148:0x044f, B:143:0x0433, B:138:0x0417, B:128:0x03f6, B:257:0x067a, B:258:0x0681, B:121:0x03d8, B:259:0x0682, B:260:0x0689, B:104:0x039c, B:94:0x037b, B:89:0x0363, B:261:0x068a, B:262:0x0691, B:82:0x034a, B:263:0x0692, B:264:0x0697, B:76:0x032e, B:265:0x0698, B:266:0x069d, B:67:0x0310, B:267:0x069e, B:268:0x06a3, B:60:0x02f2, B:269:0x06a4, B:270:0x06a9, B:51:0x02d4, B:46:0x02b8, B:41:0x029c, B:36:0x0280, B:31:0x0264, B:26:0x0244), top: B:275:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:241:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:242:0x05dc A[Catch: all -> 0x01b8, TryCatch #0 {all -> 0x01b8, blocks: (B:3:0x0014, B:4:0x019d, B:6:0x01a3, B:8:0x01ad, B:12:0x01bd, B:14:0x01c7, B:15:0x01cf, B:17:0x01d9, B:19:0x01e5, B:20:0x01f8, B:22:0x01fe, B:27:0x0251, B:32:0x026d, B:37:0x0289, B:42:0x02a5, B:47:0x02c1, B:52:0x02d9, B:56:0x02e5, B:61:0x02fb, B:63:0x0303, B:68:0x0315, B:72:0x0321, B:77:0x0337, B:79:0x033f, B:83:0x034e, B:85:0x0356, B:90:0x036a, B:95:0x0382, B:100:0x0391, B:105:0x03a1, B:107:0x03a9, B:112:0x03be, B:117:0x03cd, B:122:0x03dd, B:124:0x03e5, B:129:0x03fd, B:134:0x040c, B:139:0x0420, B:144:0x043c, B:149:0x0456, B:154:0x046c, B:156:0x0474, B:161:0x0489, B:166:0x0498, B:171:0x04a8, B:176:0x04c0, B:181:0x04dc, B:186:0x04f6, B:191:0x050c, B:193:0x0514, B:197:0x0523, B:202:0x053b, B:207:0x0559, B:212:0x0568, B:214:0x056e, B:216:0x0576, B:218:0x057e, B:220:0x0588, B:231:0x05b5, B:235:0x05c4, B:239:0x05d3, B:243:0x05e2, B:247:0x05fe, B:251:0x060c, B:252:0x0613, B:250:0x0607, B:246:0x05ef, B:242:0x05dc, B:238:0x05cd, B:234:0x05be, B:206:0x0552, B:201:0x0536, B:196:0x051f, B:253:0x066e, B:254:0x0673, B:190:0x0503, B:185:0x04ef, B:180:0x04d3, B:175:0x04bb, B:170:0x04a3, B:255:0x0674, B:256:0x0679, B:153:0x0463, B:148:0x044f, B:143:0x0433, B:138:0x0417, B:128:0x03f6, B:257:0x067a, B:258:0x0681, B:121:0x03d8, B:259:0x0682, B:260:0x0689, B:104:0x039c, B:94:0x037b, B:89:0x0363, B:261:0x068a, B:262:0x0691, B:82:0x034a, B:263:0x0692, B:264:0x0697, B:76:0x032e, B:265:0x0698, B:266:0x069d, B:67:0x0310, B:267:0x069e, B:268:0x06a3, B:60:0x02f2, B:269:0x06a4, B:270:0x06a9, B:51:0x02d4, B:46:0x02b8, B:41:0x029c, B:36:0x0280, B:31:0x0264, B:26:0x0244), top: B:275:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:246:0x05ef A[Catch: all -> 0x01b8, TryCatch #0 {all -> 0x01b8, blocks: (B:3:0x0014, B:4:0x019d, B:6:0x01a3, B:8:0x01ad, B:12:0x01bd, B:14:0x01c7, B:15:0x01cf, B:17:0x01d9, B:19:0x01e5, B:20:0x01f8, B:22:0x01fe, B:27:0x0251, B:32:0x026d, B:37:0x0289, B:42:0x02a5, B:47:0x02c1, B:52:0x02d9, B:56:0x02e5, B:61:0x02fb, B:63:0x0303, B:68:0x0315, B:72:0x0321, B:77:0x0337, B:79:0x033f, B:83:0x034e, B:85:0x0356, B:90:0x036a, B:95:0x0382, B:100:0x0391, B:105:0x03a1, B:107:0x03a9, B:112:0x03be, B:117:0x03cd, B:122:0x03dd, B:124:0x03e5, B:129:0x03fd, B:134:0x040c, B:139:0x0420, B:144:0x043c, B:149:0x0456, B:154:0x046c, B:156:0x0474, B:161:0x0489, B:166:0x0498, B:171:0x04a8, B:176:0x04c0, B:181:0x04dc, B:186:0x04f6, B:191:0x050c, B:193:0x0514, B:197:0x0523, B:202:0x053b, B:207:0x0559, B:212:0x0568, B:214:0x056e, B:216:0x0576, B:218:0x057e, B:220:0x0588, B:231:0x05b5, B:235:0x05c4, B:239:0x05d3, B:243:0x05e2, B:247:0x05fe, B:251:0x060c, B:252:0x0613, B:250:0x0607, B:246:0x05ef, B:242:0x05dc, B:238:0x05cd, B:234:0x05be, B:206:0x0552, B:201:0x0536, B:196:0x051f, B:253:0x066e, B:254:0x0673, B:190:0x0503, B:185:0x04ef, B:180:0x04d3, B:175:0x04bb, B:170:0x04a3, B:255:0x0674, B:256:0x0679, B:153:0x0463, B:148:0x044f, B:143:0x0433, B:138:0x0417, B:128:0x03f6, B:257:0x067a, B:258:0x0681, B:121:0x03d8, B:259:0x0682, B:260:0x0689, B:104:0x039c, B:94:0x037b, B:89:0x0363, B:261:0x068a, B:262:0x0691, B:82:0x034a, B:263:0x0692, B:264:0x0697, B:76:0x032e, B:265:0x0698, B:266:0x069d, B:67:0x0310, B:267:0x069e, B:268:0x06a3, B:60:0x02f2, B:269:0x06a4, B:270:0x06a9, B:51:0x02d4, B:46:0x02b8, B:41:0x029c, B:36:0x0280, B:31:0x0264, B:26:0x0244), top: B:275:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x0607 A[Catch: all -> 0x01b8, TryCatch #0 {all -> 0x01b8, blocks: (B:3:0x0014, B:4:0x019d, B:6:0x01a3, B:8:0x01ad, B:12:0x01bd, B:14:0x01c7, B:15:0x01cf, B:17:0x01d9, B:19:0x01e5, B:20:0x01f8, B:22:0x01fe, B:27:0x0251, B:32:0x026d, B:37:0x0289, B:42:0x02a5, B:47:0x02c1, B:52:0x02d9, B:56:0x02e5, B:61:0x02fb, B:63:0x0303, B:68:0x0315, B:72:0x0321, B:77:0x0337, B:79:0x033f, B:83:0x034e, B:85:0x0356, B:90:0x036a, B:95:0x0382, B:100:0x0391, B:105:0x03a1, B:107:0x03a9, B:112:0x03be, B:117:0x03cd, B:122:0x03dd, B:124:0x03e5, B:129:0x03fd, B:134:0x040c, B:139:0x0420, B:144:0x043c, B:149:0x0456, B:154:0x046c, B:156:0x0474, B:161:0x0489, B:166:0x0498, B:171:0x04a8, B:176:0x04c0, B:181:0x04dc, B:186:0x04f6, B:191:0x050c, B:193:0x0514, B:197:0x0523, B:202:0x053b, B:207:0x0559, B:212:0x0568, B:214:0x056e, B:216:0x0576, B:218:0x057e, B:220:0x0588, B:231:0x05b5, B:235:0x05c4, B:239:0x05d3, B:243:0x05e2, B:247:0x05fe, B:251:0x060c, B:252:0x0613, B:250:0x0607, B:246:0x05ef, B:242:0x05dc, B:238:0x05cd, B:234:0x05be, B:206:0x0552, B:201:0x0536, B:196:0x051f, B:253:0x066e, B:254:0x0673, B:190:0x0503, B:185:0x04ef, B:180:0x04d3, B:175:0x04bb, B:170:0x04a3, B:255:0x0674, B:256:0x0679, B:153:0x0463, B:148:0x044f, B:143:0x0433, B:138:0x0417, B:128:0x03f6, B:257:0x067a, B:258:0x0681, B:121:0x03d8, B:259:0x0682, B:260:0x0689, B:104:0x039c, B:94:0x037b, B:89:0x0363, B:261:0x068a, B:262:0x0691, B:82:0x034a, B:263:0x0692, B:264:0x0697, B:76:0x032e, B:265:0x0698, B:266:0x069d, B:67:0x0310, B:267:0x069e, B:268:0x06a3, B:60:0x02f2, B:269:0x06a4, B:270:0x06a9, B:51:0x02d4, B:46:0x02b8, B:41:0x029c, B:36:0x0280, B:31:0x0264, B:26:0x0244), top: B:275:0x0014 }] */
    private static final List selectByCidAndUserId$lambda$20(String str, String str2, String str3, MessageDao_Impl messageDao_Impl, InterfaceC33687a _connection) throws Exception {
        int i13;
        int i14;
        int i15;
        int i16;
        ChannelInfoEntity channelInfoEntity;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        Integer numValueOf;
        MessageDao_Impl messageDao_Impl2 = messageDao_Impl;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            interfaceC33689cMo68212g1.mo5354L(2, str3);
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
            String str4 = "getValue(...)";
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedLocallyAt");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "remoteMentionedUserIds");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mentionedUsersId");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionCounts");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionScores");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionGroups");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "shadowed");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "i18n");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyToId");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinned");
            int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedAt");
            int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinExpires");
            int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedByUserId");
            int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "threadParticipantsIds");
            int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPushNotification");
            int iM60658N34 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipEnrichUrl");
            int iM60658N35 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderationDetails");
            int iM60658N36 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderation");
            int iM60658N37 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageTextUpdatedAt");
            int iM60658N38 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pollId");
            int iM60658N39 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "restrictedVisibility");
            int iM60658N40 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.CATEGORY_REMINDER);
            int iM60658N41 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sharedLocation");
            int iM60658N42 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelRole");
            int iM60658N43 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedForMe");
            int iM60658N44 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infocid");
            int iM60658N45 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoid");
            int iM60658N46 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infotype");
            int iM60658N47 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infomemberCount");
            int iM60658N48 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoname");
            int i17 = iM60658N12;
            C0022g c0022g = new C0022g(0);
            int i18 = iM60658N11;
            C0022g c0022g2 = new C0022g(0);
            int i19 = iM60658N10;
            C0022g c0022g3 = new C0022g(0);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g.containsKey(strMo5353J3)) {
                    c0022g.put(strMo5353J3, new ArrayList());
                }
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g2.containsKey(strMo5353J4)) {
                    c0022g2.put(strMo5353J4, new ArrayList());
                }
                String strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g3.containsKey(strMo5353J5)) {
                    c0022g3.put(strMo5353J5, new ArrayList());
                }
                iM60658N9 = iM60658N9;
            }
            int i24 = iM60658N9;
            interfaceC33689cMo68212g1.reset();
            messageDao_Impl2.m54706xafdba081(_connection, c0022g);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g2);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g3);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J7 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J8 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J9 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J10 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J11 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                int i25 = iM60658N2;
                int i26 = iM60658N3;
                SyncStatus syncStatusStringToSyncStatus = messageDao_Impl2.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N7));
                int i27 = (int) interfaceC33689cMo68212g1.getLong(iM60658N8);
                int i28 = iM60658N5;
                int i29 = i24;
                int i34 = iM60658N4;
                int i35 = (int) interfaceC33689cMo68212g1.getLong(i29);
                int i36 = i19;
                Date dateFromTimestamp = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i36) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i36)));
                int i37 = i18;
                i18 = i37;
                Date dateFromTimestamp2 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i37) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i37)));
                int i38 = i17;
                i17 = i38;
                Date dateFromTimestamp3 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i38) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i38)));
                int i39 = iM60658N13;
                iM60658N13 = i39;
                Date dateFromTimestamp4 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i39) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i39)));
                int i44 = iM60658N14;
                iM60658N14 = i44;
                Date dateFromTimestamp5 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i44) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i44)));
                int i45 = iM60658N15;
                iM60658N15 = i45;
                List<String> stringList = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i45) ? null : interfaceC33689cMo68212g1.mo5353J0(i45));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i46 = iM60658N16;
                List<String> stringList2 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i46) ? null : interfaceC33689cMo68212g1.mo5353J0(i46));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i47 = iM60658N17;
                iM60658N17 = i47;
                Map<String, Integer> mapStringToMap = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i47) ? null : interfaceC33689cMo68212g1.mo5353J0(i47));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                int i48 = iM60658N18;
                Map<String, Integer> mapStringToMap2 = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i48) ? null : interfaceC33689cMo68212g1.mo5353J0(i48));
                if (mapStringToMap2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                int i49 = iM60658N19;
                Map<String, ReactionGroupEntity> mapStringToReactionGroupEntityMap = messageDao_Impl2.__reactionGroupConverter.stringToReactionGroupEntityMap(interfaceC33689cMo68212g1.isNull(i49) ? null : interfaceC33689cMo68212g1.mo5353J0(i49));
                if (mapStringToReactionGroupEntityMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>', but it was NULL.");
                }
                int i54 = iM60658N20;
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(i54) ? null : interfaceC33689cMo68212g1.mo5353J0(i54);
                int i55 = iM60658N21;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(i55) ? null : interfaceC33689cMo68212g1.mo5353J0(i55);
                iM60658N20 = i54;
                iM60658N19 = i49;
                iM60658N21 = i55;
                int i56 = iM60658N22;
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(i56)) != 0;
                int i57 = iM60658N23;
                iM60658N22 = i56;
                Map<String, String> mapStringToStringMap = messageDao_Impl2.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(i57) ? null : interfaceC33689cMo68212g1.mo5353J0(i57));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                iM60658N23 = i57;
                int i58 = iM60658N24;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(i58)) != 0;
                int i59 = iM60658N25;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(i59)) != 0;
                int i64 = iM60658N26;
                iM60658N24 = i58;
                Map<String, Object> mapStringToMap3 = messageDao_Impl2.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i64) ? null : interfaceC33689cMo68212g1.mo5353J0(i64));
                if (mapStringToMap3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                int i65 = iM60658N27;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(i65) ? null : interfaceC33689cMo68212g1.mo5353J0(i65);
                iM60658N27 = i65;
                iM60658N25 = i59;
                int i66 = iM60658N28;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(i66)) != 0;
                int i67 = iM60658N29;
                iM60658N29 = i67;
                Date dateFromTimestamp6 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i67) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i67)));
                int i68 = iM60658N30;
                iM60658N30 = i68;
                Date dateFromTimestamp7 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i68) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i68)));
                iM60658N31 = iM60658N31;
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(iM60658N31) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N31);
                int i69 = iM60658N32;
                iM60658N32 = i69;
                List<String> stringList3 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i69) ? null : interfaceC33689cMo68212g1.mo5353J0(i69));
                if (stringList3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                iM60658N26 = i64;
                int i74 = iM60658N33;
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(i74)) != 0;
                iM60658N28 = i66;
                int i75 = iM60658N34;
                boolean z17 = ((int) interfaceC33689cMo68212g1.getLong(i75)) != 0;
                int i76 = iM60658N35;
                iM60658N33 = i74;
                ModerationDetailsEntity moderationDetailsEntityStringToModerationDetails = messageDao_Impl2.__moderationDetailsConverter.stringToModerationDetails(interfaceC33689cMo68212g1.isNull(i76) ? null : interfaceC33689cMo68212g1.mo5353J0(i76));
                int i77 = iM60658N36;
                iM60658N36 = i77;
                ModerationEntity moderationEntityStringToModeration = messageDao_Impl2.__moderationConverter.stringToModeration(interfaceC33689cMo68212g1.isNull(i77) ? null : interfaceC33689cMo68212g1.mo5353J0(i77));
                int i78 = iM60658N37;
                iM60658N37 = i78;
                Date dateFromTimestamp8 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i78) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i78)));
                iM60658N38 = iM60658N38;
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(iM60658N38) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N38);
                int i79 = iM60658N39;
                iM60658N34 = i75;
                List<String> stringList4 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i79) ? null : interfaceC33689cMo68212g1.mo5353J0(i79));
                if (stringList4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                iM60658N40 = iM60658N40;
                ReminderInfoEntity reminderInfoEntityStringToReminderInfo = messageDao_Impl2.__reminderInfoConverter.stringToReminderInfo(interfaceC33689cMo68212g1.isNull(iM60658N40) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N40));
                int i83 = iM60658N41;
                iM60658N41 = i83;
                LocationEntity locationEntityStringToLocation = messageDao_Impl2.__locationConverter.stringToLocation(interfaceC33689cMo68212g1.isNull(i83) ? null : interfaceC33689cMo68212g1.mo5353J0(i83));
                iM60658N42 = iM60658N42;
                String strMo5353J17 = interfaceC33689cMo68212g1.isNull(iM60658N42) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N42);
                iM60658N35 = i76;
                iM60658N39 = i79;
                iM60658N43 = iM60658N43;
                boolean z18 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N43)) != 0;
                iM60658N44 = iM60658N44;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    i13 = iM60658N45;
                    if (interfaceC33689cMo68212g1.isNull(i13)) {
                        i14 = iM60658N46;
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            iM60658N42 = iM60658N42;
                            i15 = iM60658N47;
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                iM60658N40 = iM60658N40;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    iM60658N43 = iM60658N43;
                                    iM60658N44 = iM60658N44;
                                    channelInfoEntity = null;
                                } else {
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                        strMo5353J0 = null;
                                    } else {
                                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
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
                                }
                            } else {
                                iM60658N40 = iM60658N40;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
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
                            }
                        } else {
                            iM60658N42 = iM60658N42;
                            iM60658N40 = iM60658N40;
                            i15 = iM60658N47;
                            i16 = iM60658N48;
                            if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
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
                        }
                    }
                    MessageInnerEntity messageInnerEntity = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i27, i35, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                    Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                    iM60658N46 = i14;
                    String str5 = str4;
                    AbstractC22676k.m65749i(objM73986U, str5);
                    C0022g c0022g4 = c0022g;
                    Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                    AbstractC22676k.m65749i(objM73986U2, str5);
                    iM60658N47 = i15;
                    Object objM73986U3 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                    AbstractC22676k.m65749i(objM73986U3, str5);
                    arrayList.add(new MessageEntity(messageInnerEntity, (List) objM73986U, (List) objM73986U2, (List) objM73986U3));
                    messageDao_Impl2 = messageDao_Impl;
                    iM60658N48 = i16;
                    iM60658N3 = i26;
                    c0022g = c0022g4;
                    str4 = str5;
                    iM60658N4 = i34;
                    iM60658N2 = i25;
                    iM60658N45 = i13;
                    i24 = i29;
                    iM60658N16 = i46;
                    iM60658N5 = i28;
                    i19 = i36;
                    iM60658N18 = i48;
                } else {
                    i13 = iM60658N45;
                }
                i14 = iM60658N46;
                i15 = iM60658N47;
                i16 = iM60658N48;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
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
                MessageInnerEntity messageInnerEntity2 = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i27, i35, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                Object objM73986U4 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                iM60658N46 = i14;
                String str6 = str4;
                AbstractC22676k.m65749i(objM73986U4, str6);
                C0022g c0022g5 = c0022g;
                Object objM73986U5 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                AbstractC22676k.m65749i(objM73986U5, str6);
                iM60658N47 = i15;
                Object objM73986U6 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                AbstractC22676k.m65749i(objM73986U6, str6);
                arrayList.add(new MessageEntity(messageInnerEntity2, (List) objM73986U4, (List) objM73986U5, (List) objM73986U6));
                messageDao_Impl2 = messageDao_Impl;
                iM60658N48 = i16;
                iM60658N3 = i26;
                c0022g = c0022g5;
                str4 = str6;
                iM60658N4 = i34;
                iM60658N2 = i25;
                iM60658N45 = i13;
                i24 = i29;
                iM60658N16 = i46;
                iM60658N5 = i28;
                i19 = i36;
                iM60658N18 = i48;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:232:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:233:0x05cc A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:3:0x0011, B:4:0x01a5, B:6:0x01ab, B:8:0x01b5, B:12:0x01c5, B:14:0x01cf, B:15:0x01d7, B:17:0x01e1, B:19:0x01ed, B:20:0x0200, B:22:0x0206, B:27:0x0258, B:32:0x0274, B:37:0x0290, B:42:0x02ac, B:47:0x02c8, B:52:0x02e0, B:56:0x02ec, B:61:0x0302, B:63:0x030a, B:68:0x031c, B:72:0x0328, B:77:0x033e, B:79:0x0346, B:83:0x0355, B:85:0x035d, B:90:0x0371, B:94:0x0390, B:99:0x039f, B:104:0x03af, B:106:0x03b7, B:111:0x03cc, B:116:0x03db, B:121:0x03eb, B:123:0x03f3, B:128:0x040b, B:133:0x041a, B:138:0x042e, B:143:0x044a, B:148:0x0464, B:153:0x047a, B:155:0x0482, B:160:0x0497, B:165:0x04a6, B:170:0x04b6, B:175:0x04ce, B:180:0x04ea, B:185:0x0504, B:190:0x051a, B:192:0x0522, B:196:0x0531, B:201:0x0549, B:206:0x0567, B:211:0x0576, B:213:0x057c, B:215:0x0584, B:217:0x058c, B:219:0x0596, B:230:0x05c3, B:234:0x05d2, B:238:0x05e1, B:242:0x05f0, B:246:0x060c, B:250:0x061a, B:251:0x0621, B:249:0x0615, B:245:0x05fd, B:241:0x05ea, B:237:0x05db, B:233:0x05cc, B:205:0x0560, B:200:0x0544, B:195:0x052d, B:252:0x068a, B:253:0x068f, B:189:0x0511, B:184:0x04fd, B:179:0x04e1, B:174:0x04c9, B:169:0x04b1, B:254:0x0690, B:255:0x0695, B:152:0x0471, B:147:0x045d, B:142:0x0441, B:137:0x0425, B:127:0x0404, B:256:0x0696, B:257:0x069d, B:120:0x03e6, B:258:0x069e, B:259:0x06a5, B:103:0x03aa, B:93:0x0382, B:89:0x036a, B:260:0x06a6, B:261:0x06ad, B:82:0x0351, B:262:0x06ae, B:263:0x06b3, B:76:0x0335, B:264:0x06b4, B:265:0x06b9, B:67:0x0317, B:266:0x06ba, B:267:0x06bf, B:60:0x02f9, B:268:0x06c0, B:269:0x06c5, B:51:0x02db, B:46:0x02bf, B:41:0x02a3, B:36:0x0287, B:31:0x026b, B:26:0x024b), top: B:274:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:237:0x05db A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:3:0x0011, B:4:0x01a5, B:6:0x01ab, B:8:0x01b5, B:12:0x01c5, B:14:0x01cf, B:15:0x01d7, B:17:0x01e1, B:19:0x01ed, B:20:0x0200, B:22:0x0206, B:27:0x0258, B:32:0x0274, B:37:0x0290, B:42:0x02ac, B:47:0x02c8, B:52:0x02e0, B:56:0x02ec, B:61:0x0302, B:63:0x030a, B:68:0x031c, B:72:0x0328, B:77:0x033e, B:79:0x0346, B:83:0x0355, B:85:0x035d, B:90:0x0371, B:94:0x0390, B:99:0x039f, B:104:0x03af, B:106:0x03b7, B:111:0x03cc, B:116:0x03db, B:121:0x03eb, B:123:0x03f3, B:128:0x040b, B:133:0x041a, B:138:0x042e, B:143:0x044a, B:148:0x0464, B:153:0x047a, B:155:0x0482, B:160:0x0497, B:165:0x04a6, B:170:0x04b6, B:175:0x04ce, B:180:0x04ea, B:185:0x0504, B:190:0x051a, B:192:0x0522, B:196:0x0531, B:201:0x0549, B:206:0x0567, B:211:0x0576, B:213:0x057c, B:215:0x0584, B:217:0x058c, B:219:0x0596, B:230:0x05c3, B:234:0x05d2, B:238:0x05e1, B:242:0x05f0, B:246:0x060c, B:250:0x061a, B:251:0x0621, B:249:0x0615, B:245:0x05fd, B:241:0x05ea, B:237:0x05db, B:233:0x05cc, B:205:0x0560, B:200:0x0544, B:195:0x052d, B:252:0x068a, B:253:0x068f, B:189:0x0511, B:184:0x04fd, B:179:0x04e1, B:174:0x04c9, B:169:0x04b1, B:254:0x0690, B:255:0x0695, B:152:0x0471, B:147:0x045d, B:142:0x0441, B:137:0x0425, B:127:0x0404, B:256:0x0696, B:257:0x069d, B:120:0x03e6, B:258:0x069e, B:259:0x06a5, B:103:0x03aa, B:93:0x0382, B:89:0x036a, B:260:0x06a6, B:261:0x06ad, B:82:0x0351, B:262:0x06ae, B:263:0x06b3, B:76:0x0335, B:264:0x06b4, B:265:0x06b9, B:67:0x0317, B:266:0x06ba, B:267:0x06bf, B:60:0x02f9, B:268:0x06c0, B:269:0x06c5, B:51:0x02db, B:46:0x02bf, B:41:0x02a3, B:36:0x0287, B:31:0x026b, B:26:0x024b), top: B:274:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:241:0x05ea A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:3:0x0011, B:4:0x01a5, B:6:0x01ab, B:8:0x01b5, B:12:0x01c5, B:14:0x01cf, B:15:0x01d7, B:17:0x01e1, B:19:0x01ed, B:20:0x0200, B:22:0x0206, B:27:0x0258, B:32:0x0274, B:37:0x0290, B:42:0x02ac, B:47:0x02c8, B:52:0x02e0, B:56:0x02ec, B:61:0x0302, B:63:0x030a, B:68:0x031c, B:72:0x0328, B:77:0x033e, B:79:0x0346, B:83:0x0355, B:85:0x035d, B:90:0x0371, B:94:0x0390, B:99:0x039f, B:104:0x03af, B:106:0x03b7, B:111:0x03cc, B:116:0x03db, B:121:0x03eb, B:123:0x03f3, B:128:0x040b, B:133:0x041a, B:138:0x042e, B:143:0x044a, B:148:0x0464, B:153:0x047a, B:155:0x0482, B:160:0x0497, B:165:0x04a6, B:170:0x04b6, B:175:0x04ce, B:180:0x04ea, B:185:0x0504, B:190:0x051a, B:192:0x0522, B:196:0x0531, B:201:0x0549, B:206:0x0567, B:211:0x0576, B:213:0x057c, B:215:0x0584, B:217:0x058c, B:219:0x0596, B:230:0x05c3, B:234:0x05d2, B:238:0x05e1, B:242:0x05f0, B:246:0x060c, B:250:0x061a, B:251:0x0621, B:249:0x0615, B:245:0x05fd, B:241:0x05ea, B:237:0x05db, B:233:0x05cc, B:205:0x0560, B:200:0x0544, B:195:0x052d, B:252:0x068a, B:253:0x068f, B:189:0x0511, B:184:0x04fd, B:179:0x04e1, B:174:0x04c9, B:169:0x04b1, B:254:0x0690, B:255:0x0695, B:152:0x0471, B:147:0x045d, B:142:0x0441, B:137:0x0425, B:127:0x0404, B:256:0x0696, B:257:0x069d, B:120:0x03e6, B:258:0x069e, B:259:0x06a5, B:103:0x03aa, B:93:0x0382, B:89:0x036a, B:260:0x06a6, B:261:0x06ad, B:82:0x0351, B:262:0x06ae, B:263:0x06b3, B:76:0x0335, B:264:0x06b4, B:265:0x06b9, B:67:0x0317, B:266:0x06ba, B:267:0x06bf, B:60:0x02f9, B:268:0x06c0, B:269:0x06c5, B:51:0x02db, B:46:0x02bf, B:41:0x02a3, B:36:0x0287, B:31:0x026b, B:26:0x024b), top: B:274:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:245:0x05fd A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:3:0x0011, B:4:0x01a5, B:6:0x01ab, B:8:0x01b5, B:12:0x01c5, B:14:0x01cf, B:15:0x01d7, B:17:0x01e1, B:19:0x01ed, B:20:0x0200, B:22:0x0206, B:27:0x0258, B:32:0x0274, B:37:0x0290, B:42:0x02ac, B:47:0x02c8, B:52:0x02e0, B:56:0x02ec, B:61:0x0302, B:63:0x030a, B:68:0x031c, B:72:0x0328, B:77:0x033e, B:79:0x0346, B:83:0x0355, B:85:0x035d, B:90:0x0371, B:94:0x0390, B:99:0x039f, B:104:0x03af, B:106:0x03b7, B:111:0x03cc, B:116:0x03db, B:121:0x03eb, B:123:0x03f3, B:128:0x040b, B:133:0x041a, B:138:0x042e, B:143:0x044a, B:148:0x0464, B:153:0x047a, B:155:0x0482, B:160:0x0497, B:165:0x04a6, B:170:0x04b6, B:175:0x04ce, B:180:0x04ea, B:185:0x0504, B:190:0x051a, B:192:0x0522, B:196:0x0531, B:201:0x0549, B:206:0x0567, B:211:0x0576, B:213:0x057c, B:215:0x0584, B:217:0x058c, B:219:0x0596, B:230:0x05c3, B:234:0x05d2, B:238:0x05e1, B:242:0x05f0, B:246:0x060c, B:250:0x061a, B:251:0x0621, B:249:0x0615, B:245:0x05fd, B:241:0x05ea, B:237:0x05db, B:233:0x05cc, B:205:0x0560, B:200:0x0544, B:195:0x052d, B:252:0x068a, B:253:0x068f, B:189:0x0511, B:184:0x04fd, B:179:0x04e1, B:174:0x04c9, B:169:0x04b1, B:254:0x0690, B:255:0x0695, B:152:0x0471, B:147:0x045d, B:142:0x0441, B:137:0x0425, B:127:0x0404, B:256:0x0696, B:257:0x069d, B:120:0x03e6, B:258:0x069e, B:259:0x06a5, B:103:0x03aa, B:93:0x0382, B:89:0x036a, B:260:0x06a6, B:261:0x06ad, B:82:0x0351, B:262:0x06ae, B:263:0x06b3, B:76:0x0335, B:264:0x06b4, B:265:0x06b9, B:67:0x0317, B:266:0x06ba, B:267:0x06bf, B:60:0x02f9, B:268:0x06c0, B:269:0x06c5, B:51:0x02db, B:46:0x02bf, B:41:0x02a3, B:36:0x0287, B:31:0x026b, B:26:0x024b), top: B:274:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x0615 A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:3:0x0011, B:4:0x01a5, B:6:0x01ab, B:8:0x01b5, B:12:0x01c5, B:14:0x01cf, B:15:0x01d7, B:17:0x01e1, B:19:0x01ed, B:20:0x0200, B:22:0x0206, B:27:0x0258, B:32:0x0274, B:37:0x0290, B:42:0x02ac, B:47:0x02c8, B:52:0x02e0, B:56:0x02ec, B:61:0x0302, B:63:0x030a, B:68:0x031c, B:72:0x0328, B:77:0x033e, B:79:0x0346, B:83:0x0355, B:85:0x035d, B:90:0x0371, B:94:0x0390, B:99:0x039f, B:104:0x03af, B:106:0x03b7, B:111:0x03cc, B:116:0x03db, B:121:0x03eb, B:123:0x03f3, B:128:0x040b, B:133:0x041a, B:138:0x042e, B:143:0x044a, B:148:0x0464, B:153:0x047a, B:155:0x0482, B:160:0x0497, B:165:0x04a6, B:170:0x04b6, B:175:0x04ce, B:180:0x04ea, B:185:0x0504, B:190:0x051a, B:192:0x0522, B:196:0x0531, B:201:0x0549, B:206:0x0567, B:211:0x0576, B:213:0x057c, B:215:0x0584, B:217:0x058c, B:219:0x0596, B:230:0x05c3, B:234:0x05d2, B:238:0x05e1, B:242:0x05f0, B:246:0x060c, B:250:0x061a, B:251:0x0621, B:249:0x0615, B:245:0x05fd, B:241:0x05ea, B:237:0x05db, B:233:0x05cc, B:205:0x0560, B:200:0x0544, B:195:0x052d, B:252:0x068a, B:253:0x068f, B:189:0x0511, B:184:0x04fd, B:179:0x04e1, B:174:0x04c9, B:169:0x04b1, B:254:0x0690, B:255:0x0695, B:152:0x0471, B:147:0x045d, B:142:0x0441, B:137:0x0425, B:127:0x0404, B:256:0x0696, B:257:0x069d, B:120:0x03e6, B:258:0x069e, B:259:0x06a5, B:103:0x03aa, B:93:0x0382, B:89:0x036a, B:260:0x06a6, B:261:0x06ad, B:82:0x0351, B:262:0x06ae, B:263:0x06b3, B:76:0x0335, B:264:0x06b4, B:265:0x06b9, B:67:0x0317, B:266:0x06ba, B:267:0x06bf, B:60:0x02f9, B:268:0x06c0, B:269:0x06c5, B:51:0x02db, B:46:0x02bf, B:41:0x02a3, B:36:0x0287, B:31:0x026b, B:26:0x024b), top: B:274:0x0011 }] */
    private static final List selectBySyncStatus$lambda$18(String str, MessageDao_Impl messageDao_Impl, SyncStatus syncStatus, int i13, InterfaceC33687a _connection) throws Exception {
        int i14;
        int i15;
        int i16;
        ChannelInfoEntity channelInfoEntity;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        Integer numValueOf;
        MessageDao_Impl messageDao_Impl2 = messageDao_Impl;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5356p(1, messageDao_Impl2.__syncStatusConverter.syncStatusToString(syncStatus));
            interfaceC33689cMo68212g1.mo5356p(2, i13);
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
            String str2 = "getValue(...)";
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedLocallyAt");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "remoteMentionedUserIds");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mentionedUsersId");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionCounts");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionScores");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionGroups");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "shadowed");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "i18n");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyToId");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinned");
            int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedAt");
            int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinExpires");
            int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedByUserId");
            int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "threadParticipantsIds");
            int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPushNotification");
            int iM60658N34 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipEnrichUrl");
            int iM60658N35 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderationDetails");
            int iM60658N36 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderation");
            int iM60658N37 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageTextUpdatedAt");
            int iM60658N38 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pollId");
            int iM60658N39 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "restrictedVisibility");
            int iM60658N40 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.CATEGORY_REMINDER);
            int iM60658N41 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sharedLocation");
            int iM60658N42 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelRole");
            int iM60658N43 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedForMe");
            int iM60658N44 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infocid");
            int iM60658N45 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoid");
            int iM60658N46 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infotype");
            int iM60658N47 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infomemberCount");
            int iM60658N48 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoname");
            int i17 = iM60658N12;
            C0022g c0022g = new C0022g(0);
            int i18 = iM60658N11;
            C0022g c0022g2 = new C0022g(0);
            int i19 = iM60658N10;
            C0022g c0022g3 = new C0022g(0);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g.containsKey(strMo5353J3)) {
                    c0022g.put(strMo5353J3, new ArrayList());
                }
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g2.containsKey(strMo5353J4)) {
                    c0022g2.put(strMo5353J4, new ArrayList());
                }
                String strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g3.containsKey(strMo5353J5)) {
                    c0022g3.put(strMo5353J5, new ArrayList());
                }
                iM60658N9 = iM60658N9;
            }
            int i24 = iM60658N9;
            interfaceC33689cMo68212g1.reset();
            messageDao_Impl2.m54706xafdba081(_connection, c0022g);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g2);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g3);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J7 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J8 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J9 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J10 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J11 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                int i25 = iM60658N2;
                SyncStatus syncStatusStringToSyncStatus = messageDao_Impl2.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N7));
                int i26 = (int) interfaceC33689cMo68212g1.getLong(iM60658N8);
                int i27 = iM60658N4;
                int i28 = i24;
                int i29 = iM60658N3;
                int i34 = (int) interfaceC33689cMo68212g1.getLong(i28);
                int i35 = i19;
                Date dateFromTimestamp = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i35) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i35)));
                int i36 = i18;
                i18 = i36;
                Date dateFromTimestamp2 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i36) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i36)));
                int i37 = i17;
                i17 = i37;
                Date dateFromTimestamp3 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i37) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i37)));
                int i38 = iM60658N13;
                iM60658N13 = i38;
                Date dateFromTimestamp4 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i38) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i38)));
                int i39 = iM60658N14;
                iM60658N14 = i39;
                Date dateFromTimestamp5 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i39) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i39)));
                int i44 = iM60658N15;
                iM60658N15 = i44;
                List<String> stringList = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i44) ? null : interfaceC33689cMo68212g1.mo5353J0(i44));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i45 = iM60658N16;
                List<String> stringList2 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i45) ? null : interfaceC33689cMo68212g1.mo5353J0(i45));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i46 = iM60658N17;
                iM60658N17 = i46;
                Map<String, Integer> mapStringToMap = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i46) ? null : interfaceC33689cMo68212g1.mo5353J0(i46));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                iM60658N18 = iM60658N18;
                Map<String, Integer> mapStringToMap2 = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N18) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N18));
                if (mapStringToMap2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                iM60658N19 = iM60658N19;
                Map<String, ReactionGroupEntity> mapStringToReactionGroupEntityMap = messageDao_Impl2.__reactionGroupConverter.stringToReactionGroupEntityMap(interfaceC33689cMo68212g1.isNull(iM60658N19) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N19));
                if (mapStringToReactionGroupEntityMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>', but it was NULL.");
                }
                iM60658N20 = iM60658N20;
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(iM60658N20) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N20);
                iM60658N21 = iM60658N21;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(iM60658N21) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N21);
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N22)) != 0;
                int i47 = iM60658N23;
                iM60658N22 = iM60658N22;
                Map<String, String> mapStringToStringMap = messageDao_Impl2.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(i47) ? null : interfaceC33689cMo68212g1.mo5353J0(i47));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                iM60658N23 = i47;
                int i48 = iM60658N24;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(i48)) != 0;
                int i49 = iM60658N5;
                int i54 = iM60658N25;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(i54)) != 0;
                int i55 = iM60658N26;
                Map<String, Object> mapStringToMap3 = messageDao_Impl2.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i55) ? null : interfaceC33689cMo68212g1.mo5353J0(i55));
                if (mapStringToMap3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                int i56 = iM60658N27;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(i56) ? null : interfaceC33689cMo68212g1.mo5353J0(i56);
                iM60658N27 = i56;
                int i57 = iM60658N28;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(i57)) != 0;
                int i58 = iM60658N29;
                iM60658N29 = i58;
                Date dateFromTimestamp6 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i58) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i58)));
                int i59 = iM60658N30;
                iM60658N30 = i59;
                Date dateFromTimestamp7 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i59) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i59)));
                iM60658N31 = iM60658N31;
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(iM60658N31) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N31);
                int i64 = iM60658N32;
                iM60658N32 = i64;
                List<String> stringList3 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i64) ? null : interfaceC33689cMo68212g1.mo5353J0(i64));
                if (stringList3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i65 = iM60658N33;
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(i65)) != 0;
                int i66 = iM60658N34;
                boolean z17 = ((int) interfaceC33689cMo68212g1.getLong(i66)) != 0;
                int i67 = iM60658N35;
                ModerationDetailsEntity moderationDetailsEntityStringToModerationDetails = messageDao_Impl2.__moderationDetailsConverter.stringToModerationDetails(interfaceC33689cMo68212g1.isNull(i67) ? null : interfaceC33689cMo68212g1.mo5353J0(i67));
                int i68 = iM60658N36;
                iM60658N36 = i68;
                ModerationEntity moderationEntityStringToModeration = messageDao_Impl2.__moderationConverter.stringToModeration(interfaceC33689cMo68212g1.isNull(i68) ? null : interfaceC33689cMo68212g1.mo5353J0(i68));
                int i69 = iM60658N37;
                iM60658N37 = i69;
                Date dateFromTimestamp8 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i69) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i69)));
                iM60658N38 = iM60658N38;
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(iM60658N38) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N38);
                int i74 = iM60658N39;
                List<String> stringList4 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i74) ? null : interfaceC33689cMo68212g1.mo5353J0(i74));
                if (stringList4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i75 = iM60658N40;
                ReminderInfoEntity reminderInfoEntityStringToReminderInfo = messageDao_Impl2.__reminderInfoConverter.stringToReminderInfo(interfaceC33689cMo68212g1.isNull(i75) ? null : interfaceC33689cMo68212g1.mo5353J0(i75));
                int i76 = iM60658N41;
                iM60658N41 = i76;
                LocationEntity locationEntityStringToLocation = messageDao_Impl2.__locationConverter.stringToLocation(interfaceC33689cMo68212g1.isNull(i76) ? null : interfaceC33689cMo68212g1.mo5353J0(i76));
                int i77 = iM60658N42;
                String strMo5353J17 = interfaceC33689cMo68212g1.isNull(i77) ? null : interfaceC33689cMo68212g1.mo5353J0(i77);
                iM60658N42 = i77;
                iM60658N40 = i75;
                iM60658N43 = iM60658N43;
                boolean z18 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N43)) != 0;
                iM60658N44 = iM60658N44;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    iM60658N45 = iM60658N45;
                    if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                        i14 = iM60658N46;
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            iM60658N43 = iM60658N43;
                            i15 = iM60658N47;
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                i67 = i67;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    iM60658N44 = iM60658N44;
                                    iM60658N45 = iM60658N45;
                                    channelInfoEntity = null;
                                } else {
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                        strMo5353J0 = null;
                                    } else {
                                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                        strMo5353J1 = null;
                                    } else {
                                        strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                                }
                            } else {
                                i67 = i67;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                }
                                if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                    strMo5353J1 = null;
                                } else {
                                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                            }
                        } else {
                            iM60658N43 = iM60658N43;
                            i67 = i67;
                            i15 = iM60658N47;
                            i16 = iM60658N48;
                            if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                            }
                            if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                strMo5353J1 = null;
                            } else {
                                strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                        }
                    }
                    MessageInnerEntity messageInnerEntity = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i26, i34, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                    Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                    iM60658N46 = i14;
                    String str3 = str2;
                    AbstractC22676k.m65749i(objM73986U, str3);
                    C0022g c0022g4 = c0022g;
                    Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                    AbstractC22676k.m65749i(objM73986U2, str3);
                    iM60658N47 = i15;
                    Object objM73986U3 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                    AbstractC22676k.m65749i(objM73986U3, str3);
                    arrayList.add(new MessageEntity(messageInnerEntity, (List) objM73986U, (List) objM73986U2, (List) objM73986U3));
                    int i78 = i67;
                    iM60658N39 = i74;
                    iM60658N5 = i49;
                    iM60658N24 = i48;
                    iM60658N25 = i54;
                    iM60658N26 = i55;
                    iM60658N28 = i57;
                    iM60658N33 = i65;
                    iM60658N34 = i66;
                    iM60658N35 = i78;
                    messageDao_Impl2 = messageDao_Impl;
                    iM60658N2 = i25;
                    c0022g = c0022g4;
                    str2 = str3;
                    iM60658N3 = i29;
                    iM60658N48 = i16;
                    i24 = i28;
                    iM60658N4 = i27;
                    i19 = i35;
                    iM60658N16 = i45;
                } else {
                    iM60658N45 = iM60658N45;
                }
                i14 = iM60658N46;
                i15 = iM60658N47;
                i16 = iM60658N48;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                }
                if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                    strMo5353J1 = null;
                } else {
                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
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
                MessageInnerEntity messageInnerEntity2 = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i26, i34, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                Object objM73986U4 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                iM60658N46 = i14;
                String str4 = str2;
                AbstractC22676k.m65749i(objM73986U4, str4);
                C0022g c0022g5 = c0022g;
                Object objM73986U5 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                AbstractC22676k.m65749i(objM73986U5, str4);
                iM60658N47 = i15;
                Object objM73986U6 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                AbstractC22676k.m65749i(objM73986U6, str4);
                arrayList.add(new MessageEntity(messageInnerEntity2, (List) objM73986U4, (List) objM73986U5, (List) objM73986U6));
                int i79 = i67;
                iM60658N39 = i74;
                iM60658N5 = i49;
                iM60658N24 = i48;
                iM60658N25 = i54;
                iM60658N26 = i55;
                iM60658N28 = i57;
                iM60658N33 = i65;
                iM60658N34 = i66;
                iM60658N35 = i79;
                messageDao_Impl2 = messageDao_Impl;
                iM60658N2 = i25;
                c0022g = c0022g5;
                str2 = str4;
                iM60658N3 = i29;
                iM60658N48 = i16;
                i24 = i28;
                iM60658N4 = i27;
                i19 = i35;
                iM60658N16 = i45;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:241:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:242:0x05ed A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:3:0x0014, B:4:0x001d, B:6:0x0023, B:9:0x0037, B:10:0x003d, B:12:0x0043, B:13:0x004f, B:14:0x01cf, B:16:0x01d5, B:18:0x01df, B:20:0x01ec, B:22:0x01f6, B:23:0x01fe, B:25:0x0208, B:27:0x0214, B:28:0x0227, B:30:0x022d, B:35:0x0280, B:40:0x029c, B:45:0x02b8, B:50:0x02d4, B:55:0x02f0, B:60:0x0308, B:64:0x0314, B:69:0x032a, B:71:0x0332, B:76:0x0344, B:80:0x0350, B:85:0x0366, B:87:0x036e, B:91:0x037d, B:93:0x0385, B:98:0x0399, B:103:0x03b1, B:108:0x03c0, B:113:0x03d0, B:115:0x03d8, B:120:0x03ed, B:125:0x03fc, B:130:0x040c, B:132:0x0414, B:137:0x042c, B:142:0x043b, B:147:0x044f, B:152:0x046b, B:157:0x0485, B:162:0x049b, B:164:0x04a3, B:169:0x04b8, B:174:0x04c7, B:179:0x04d7, B:184:0x04ef, B:189:0x050b, B:194:0x0525, B:199:0x053b, B:201:0x0543, B:205:0x0552, B:210:0x056a, B:215:0x0588, B:220:0x0597, B:222:0x059d, B:224:0x05a5, B:226:0x05ad, B:228:0x05b7, B:239:0x05e4, B:243:0x05f3, B:247:0x0602, B:251:0x0611, B:255:0x062d, B:259:0x063b, B:260:0x0642, B:258:0x0636, B:254:0x061e, B:250:0x060b, B:246:0x05fc, B:242:0x05ed, B:214:0x0581, B:209:0x0565, B:204:0x054e, B:261:0x069b, B:262:0x06a0, B:198:0x0532, B:193:0x051e, B:188:0x0502, B:183:0x04ea, B:178:0x04d2, B:263:0x06a1, B:264:0x06a6, B:161:0x0492, B:156:0x047e, B:151:0x0462, B:146:0x0446, B:136:0x0425, B:265:0x06a7, B:266:0x06ae, B:129:0x0407, B:267:0x06af, B:268:0x06b6, B:112:0x03cb, B:102:0x03aa, B:97:0x0392, B:269:0x06b7, B:270:0x06be, B:90:0x0379, B:271:0x06bf, B:272:0x06c4, B:84:0x035d, B:273:0x06c5, B:274:0x06ca, B:75:0x033f, B:275:0x06cb, B:276:0x06d0, B:68:0x0321, B:277:0x06d1, B:278:0x06d6, B:59:0x0303, B:54:0x02e7, B:49:0x02cb, B:44:0x02af, B:39:0x0293, B:34:0x0273), top: B:283:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:246:0x05fc A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:3:0x0014, B:4:0x001d, B:6:0x0023, B:9:0x0037, B:10:0x003d, B:12:0x0043, B:13:0x004f, B:14:0x01cf, B:16:0x01d5, B:18:0x01df, B:20:0x01ec, B:22:0x01f6, B:23:0x01fe, B:25:0x0208, B:27:0x0214, B:28:0x0227, B:30:0x022d, B:35:0x0280, B:40:0x029c, B:45:0x02b8, B:50:0x02d4, B:55:0x02f0, B:60:0x0308, B:64:0x0314, B:69:0x032a, B:71:0x0332, B:76:0x0344, B:80:0x0350, B:85:0x0366, B:87:0x036e, B:91:0x037d, B:93:0x0385, B:98:0x0399, B:103:0x03b1, B:108:0x03c0, B:113:0x03d0, B:115:0x03d8, B:120:0x03ed, B:125:0x03fc, B:130:0x040c, B:132:0x0414, B:137:0x042c, B:142:0x043b, B:147:0x044f, B:152:0x046b, B:157:0x0485, B:162:0x049b, B:164:0x04a3, B:169:0x04b8, B:174:0x04c7, B:179:0x04d7, B:184:0x04ef, B:189:0x050b, B:194:0x0525, B:199:0x053b, B:201:0x0543, B:205:0x0552, B:210:0x056a, B:215:0x0588, B:220:0x0597, B:222:0x059d, B:224:0x05a5, B:226:0x05ad, B:228:0x05b7, B:239:0x05e4, B:243:0x05f3, B:247:0x0602, B:251:0x0611, B:255:0x062d, B:259:0x063b, B:260:0x0642, B:258:0x0636, B:254:0x061e, B:250:0x060b, B:246:0x05fc, B:242:0x05ed, B:214:0x0581, B:209:0x0565, B:204:0x054e, B:261:0x069b, B:262:0x06a0, B:198:0x0532, B:193:0x051e, B:188:0x0502, B:183:0x04ea, B:178:0x04d2, B:263:0x06a1, B:264:0x06a6, B:161:0x0492, B:156:0x047e, B:151:0x0462, B:146:0x0446, B:136:0x0425, B:265:0x06a7, B:266:0x06ae, B:129:0x0407, B:267:0x06af, B:268:0x06b6, B:112:0x03cb, B:102:0x03aa, B:97:0x0392, B:269:0x06b7, B:270:0x06be, B:90:0x0379, B:271:0x06bf, B:272:0x06c4, B:84:0x035d, B:273:0x06c5, B:274:0x06ca, B:75:0x033f, B:275:0x06cb, B:276:0x06d0, B:68:0x0321, B:277:0x06d1, B:278:0x06d6, B:59:0x0303, B:54:0x02e7, B:49:0x02cb, B:44:0x02af, B:39:0x0293, B:34:0x0273), top: B:283:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x0608  */
    /* JADX WARN: Code duplicated, block: B:250:0x060b A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:3:0x0014, B:4:0x001d, B:6:0x0023, B:9:0x0037, B:10:0x003d, B:12:0x0043, B:13:0x004f, B:14:0x01cf, B:16:0x01d5, B:18:0x01df, B:20:0x01ec, B:22:0x01f6, B:23:0x01fe, B:25:0x0208, B:27:0x0214, B:28:0x0227, B:30:0x022d, B:35:0x0280, B:40:0x029c, B:45:0x02b8, B:50:0x02d4, B:55:0x02f0, B:60:0x0308, B:64:0x0314, B:69:0x032a, B:71:0x0332, B:76:0x0344, B:80:0x0350, B:85:0x0366, B:87:0x036e, B:91:0x037d, B:93:0x0385, B:98:0x0399, B:103:0x03b1, B:108:0x03c0, B:113:0x03d0, B:115:0x03d8, B:120:0x03ed, B:125:0x03fc, B:130:0x040c, B:132:0x0414, B:137:0x042c, B:142:0x043b, B:147:0x044f, B:152:0x046b, B:157:0x0485, B:162:0x049b, B:164:0x04a3, B:169:0x04b8, B:174:0x04c7, B:179:0x04d7, B:184:0x04ef, B:189:0x050b, B:194:0x0525, B:199:0x053b, B:201:0x0543, B:205:0x0552, B:210:0x056a, B:215:0x0588, B:220:0x0597, B:222:0x059d, B:224:0x05a5, B:226:0x05ad, B:228:0x05b7, B:239:0x05e4, B:243:0x05f3, B:247:0x0602, B:251:0x0611, B:255:0x062d, B:259:0x063b, B:260:0x0642, B:258:0x0636, B:254:0x061e, B:250:0x060b, B:246:0x05fc, B:242:0x05ed, B:214:0x0581, B:209:0x0565, B:204:0x054e, B:261:0x069b, B:262:0x06a0, B:198:0x0532, B:193:0x051e, B:188:0x0502, B:183:0x04ea, B:178:0x04d2, B:263:0x06a1, B:264:0x06a6, B:161:0x0492, B:156:0x047e, B:151:0x0462, B:146:0x0446, B:136:0x0425, B:265:0x06a7, B:266:0x06ae, B:129:0x0407, B:267:0x06af, B:268:0x06b6, B:112:0x03cb, B:102:0x03aa, B:97:0x0392, B:269:0x06b7, B:270:0x06be, B:90:0x0379, B:271:0x06bf, B:272:0x06c4, B:84:0x035d, B:273:0x06c5, B:274:0x06ca, B:75:0x033f, B:275:0x06cb, B:276:0x06d0, B:68:0x0321, B:277:0x06d1, B:278:0x06d6, B:59:0x0303, B:54:0x02e7, B:49:0x02cb, B:44:0x02af, B:39:0x0293, B:34:0x0273), top: B:283:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:253:0x0617  */
    /* JADX WARN: Code duplicated, block: B:254:0x061e A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:3:0x0014, B:4:0x001d, B:6:0x0023, B:9:0x0037, B:10:0x003d, B:12:0x0043, B:13:0x004f, B:14:0x01cf, B:16:0x01d5, B:18:0x01df, B:20:0x01ec, B:22:0x01f6, B:23:0x01fe, B:25:0x0208, B:27:0x0214, B:28:0x0227, B:30:0x022d, B:35:0x0280, B:40:0x029c, B:45:0x02b8, B:50:0x02d4, B:55:0x02f0, B:60:0x0308, B:64:0x0314, B:69:0x032a, B:71:0x0332, B:76:0x0344, B:80:0x0350, B:85:0x0366, B:87:0x036e, B:91:0x037d, B:93:0x0385, B:98:0x0399, B:103:0x03b1, B:108:0x03c0, B:113:0x03d0, B:115:0x03d8, B:120:0x03ed, B:125:0x03fc, B:130:0x040c, B:132:0x0414, B:137:0x042c, B:142:0x043b, B:147:0x044f, B:152:0x046b, B:157:0x0485, B:162:0x049b, B:164:0x04a3, B:169:0x04b8, B:174:0x04c7, B:179:0x04d7, B:184:0x04ef, B:189:0x050b, B:194:0x0525, B:199:0x053b, B:201:0x0543, B:205:0x0552, B:210:0x056a, B:215:0x0588, B:220:0x0597, B:222:0x059d, B:224:0x05a5, B:226:0x05ad, B:228:0x05b7, B:239:0x05e4, B:243:0x05f3, B:247:0x0602, B:251:0x0611, B:255:0x062d, B:259:0x063b, B:260:0x0642, B:258:0x0636, B:254:0x061e, B:250:0x060b, B:246:0x05fc, B:242:0x05ed, B:214:0x0581, B:209:0x0565, B:204:0x054e, B:261:0x069b, B:262:0x06a0, B:198:0x0532, B:193:0x051e, B:188:0x0502, B:183:0x04ea, B:178:0x04d2, B:263:0x06a1, B:264:0x06a6, B:161:0x0492, B:156:0x047e, B:151:0x0462, B:146:0x0446, B:136:0x0425, B:265:0x06a7, B:266:0x06ae, B:129:0x0407, B:267:0x06af, B:268:0x06b6, B:112:0x03cb, B:102:0x03aa, B:97:0x0392, B:269:0x06b7, B:270:0x06be, B:90:0x0379, B:271:0x06bf, B:272:0x06c4, B:84:0x035d, B:273:0x06c5, B:274:0x06ca, B:75:0x033f, B:275:0x06cb, B:276:0x06d0, B:68:0x0321, B:277:0x06d1, B:278:0x06d6, B:59:0x0303, B:54:0x02e7, B:49:0x02cb, B:44:0x02af, B:39:0x0293, B:34:0x0273), top: B:283:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:258:0x0636 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:3:0x0014, B:4:0x001d, B:6:0x0023, B:9:0x0037, B:10:0x003d, B:12:0x0043, B:13:0x004f, B:14:0x01cf, B:16:0x01d5, B:18:0x01df, B:20:0x01ec, B:22:0x01f6, B:23:0x01fe, B:25:0x0208, B:27:0x0214, B:28:0x0227, B:30:0x022d, B:35:0x0280, B:40:0x029c, B:45:0x02b8, B:50:0x02d4, B:55:0x02f0, B:60:0x0308, B:64:0x0314, B:69:0x032a, B:71:0x0332, B:76:0x0344, B:80:0x0350, B:85:0x0366, B:87:0x036e, B:91:0x037d, B:93:0x0385, B:98:0x0399, B:103:0x03b1, B:108:0x03c0, B:113:0x03d0, B:115:0x03d8, B:120:0x03ed, B:125:0x03fc, B:130:0x040c, B:132:0x0414, B:137:0x042c, B:142:0x043b, B:147:0x044f, B:152:0x046b, B:157:0x0485, B:162:0x049b, B:164:0x04a3, B:169:0x04b8, B:174:0x04c7, B:179:0x04d7, B:184:0x04ef, B:189:0x050b, B:194:0x0525, B:199:0x053b, B:201:0x0543, B:205:0x0552, B:210:0x056a, B:215:0x0588, B:220:0x0597, B:222:0x059d, B:224:0x05a5, B:226:0x05ad, B:228:0x05b7, B:239:0x05e4, B:243:0x05f3, B:247:0x0602, B:251:0x0611, B:255:0x062d, B:259:0x063b, B:260:0x0642, B:258:0x0636, B:254:0x061e, B:250:0x060b, B:246:0x05fc, B:242:0x05ed, B:214:0x0581, B:209:0x0565, B:204:0x054e, B:261:0x069b, B:262:0x06a0, B:198:0x0532, B:193:0x051e, B:188:0x0502, B:183:0x04ea, B:178:0x04d2, B:263:0x06a1, B:264:0x06a6, B:161:0x0492, B:156:0x047e, B:151:0x0462, B:146:0x0446, B:136:0x0425, B:265:0x06a7, B:266:0x06ae, B:129:0x0407, B:267:0x06af, B:268:0x06b6, B:112:0x03cb, B:102:0x03aa, B:97:0x0392, B:269:0x06b7, B:270:0x06be, B:90:0x0379, B:271:0x06bf, B:272:0x06c4, B:84:0x035d, B:273:0x06c5, B:274:0x06ca, B:75:0x033f, B:275:0x06cb, B:276:0x06d0, B:68:0x0321, B:277:0x06d1, B:278:0x06d6, B:59:0x0303, B:54:0x02e7, B:49:0x02cb, B:44:0x02af, B:39:0x0293, B:34:0x0273), top: B:283:0x0014 }] */
    private static final List selectBySyncStatusOrTypeForChannel$lambda$23(String str, String str2, List list, int i13, List list2, MessageDao_Impl messageDao_Impl, InterfaceC33687a _connection) throws Exception {
        int i14;
        int i15;
        int i16;
        int i17;
        ChannelInfoEntity channelInfoEntity;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        Integer numValueOf;
        MessageDao_Impl messageDao_Impl2 = messageDao_Impl;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            Iterator it = list.iterator();
            int i18 = 2;
            while (it.hasNext()) {
                interfaceC33689cMo68212g1.mo5356p(i18, ((Number) it.next()).intValue());
                i18++;
            }
            int i19 = i13 + 2;
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                interfaceC33689cMo68212g1.mo5354L(i19, (String) it3.next());
                i19++;
            }
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
            String str3 = "getValue(...)";
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedLocallyAt");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "remoteMentionedUserIds");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mentionedUsersId");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionCounts");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionScores");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionGroups");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "shadowed");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "i18n");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyToId");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinned");
            int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedAt");
            int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinExpires");
            int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedByUserId");
            int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "threadParticipantsIds");
            int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPushNotification");
            int iM60658N34 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipEnrichUrl");
            int iM60658N35 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderationDetails");
            int iM60658N36 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderation");
            int iM60658N37 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageTextUpdatedAt");
            int iM60658N38 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pollId");
            int iM60658N39 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "restrictedVisibility");
            int iM60658N40 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.CATEGORY_REMINDER);
            int iM60658N41 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sharedLocation");
            int iM60658N42 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelRole");
            int iM60658N43 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedForMe");
            int iM60658N44 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infocid");
            int iM60658N45 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoid");
            int iM60658N46 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infotype");
            int iM60658N47 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infomemberCount");
            int iM60658N48 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoname");
            int i24 = iM60658N12;
            C0022g c0022g = new C0022g(0);
            int i25 = iM60658N11;
            C0022g c0022g2 = new C0022g(0);
            int i26 = iM60658N10;
            C0022g c0022g3 = new C0022g(0);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g.containsKey(strMo5353J3)) {
                    c0022g.put(strMo5353J3, new ArrayList());
                }
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g2.containsKey(strMo5353J4)) {
                    c0022g2.put(strMo5353J4, new ArrayList());
                }
                String strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g3.containsKey(strMo5353J5)) {
                    c0022g3.put(strMo5353J5, new ArrayList());
                }
                iM60658N9 = iM60658N9;
            }
            int i27 = iM60658N9;
            interfaceC33689cMo68212g1.reset();
            messageDao_Impl2.m54706xafdba081(_connection, c0022g);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g2);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g3);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J7 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J8 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J9 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J10 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J11 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                int i28 = iM60658N2;
                int i29 = iM60658N3;
                SyncStatus syncStatusStringToSyncStatus = messageDao_Impl2.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N7));
                int i34 = (int) interfaceC33689cMo68212g1.getLong(iM60658N8);
                int i35 = iM60658N5;
                int i36 = i27;
                int i37 = iM60658N4;
                int i38 = (int) interfaceC33689cMo68212g1.getLong(i36);
                int i39 = i26;
                Date dateFromTimestamp = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i39) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i39)));
                int i44 = i25;
                i25 = i44;
                Date dateFromTimestamp2 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i44) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i44)));
                int i45 = i24;
                i24 = i45;
                Date dateFromTimestamp3 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i45) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i45)));
                int i46 = iM60658N13;
                iM60658N13 = i46;
                Date dateFromTimestamp4 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i46) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i46)));
                int i47 = iM60658N14;
                iM60658N14 = i47;
                Date dateFromTimestamp5 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i47) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i47)));
                int i48 = iM60658N15;
                iM60658N15 = i48;
                List<String> stringList = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i48) ? null : interfaceC33689cMo68212g1.mo5353J0(i48));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                iM60658N16 = iM60658N16;
                List<String> stringList2 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N16) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N16));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i49 = iM60658N17;
                iM60658N17 = i49;
                Map<String, Integer> mapStringToMap = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i49) ? null : interfaceC33689cMo68212g1.mo5353J0(i49));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                int i54 = iM60658N18;
                Map<String, Integer> mapStringToMap2 = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i54) ? null : interfaceC33689cMo68212g1.mo5353J0(i54));
                if (mapStringToMap2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                int i55 = iM60658N19;
                Map<String, ReactionGroupEntity> mapStringToReactionGroupEntityMap = messageDao_Impl2.__reactionGroupConverter.stringToReactionGroupEntityMap(interfaceC33689cMo68212g1.isNull(i55) ? null : interfaceC33689cMo68212g1.mo5353J0(i55));
                if (mapStringToReactionGroupEntityMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>', but it was NULL.");
                }
                int i56 = iM60658N20;
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(i56) ? null : interfaceC33689cMo68212g1.mo5353J0(i56);
                int i57 = iM60658N21;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(i57) ? null : interfaceC33689cMo68212g1.mo5353J0(i57);
                iM60658N20 = i56;
                iM60658N19 = i55;
                iM60658N21 = i57;
                int i58 = iM60658N22;
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(i58)) != 0;
                int i59 = iM60658N23;
                iM60658N22 = i58;
                Map<String, String> mapStringToStringMap = messageDao_Impl2.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(i59) ? null : interfaceC33689cMo68212g1.mo5353J0(i59));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                iM60658N23 = i59;
                int i64 = iM60658N24;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(i64)) != 0;
                int i65 = iM60658N25;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(i65)) != 0;
                int i66 = iM60658N26;
                iM60658N24 = i64;
                Map<String, Object> mapStringToMap3 = messageDao_Impl2.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i66) ? null : interfaceC33689cMo68212g1.mo5353J0(i66));
                if (mapStringToMap3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                int i67 = iM60658N27;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(i67) ? null : interfaceC33689cMo68212g1.mo5353J0(i67);
                iM60658N27 = i67;
                iM60658N25 = i65;
                int i68 = iM60658N28;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(i68)) != 0;
                int i69 = iM60658N29;
                iM60658N29 = i69;
                Date dateFromTimestamp6 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i69) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i69)));
                int i74 = iM60658N30;
                iM60658N30 = i74;
                Date dateFromTimestamp7 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i74) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i74)));
                iM60658N31 = iM60658N31;
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(iM60658N31) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N31);
                int i75 = iM60658N32;
                iM60658N32 = i75;
                List<String> stringList3 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i75) ? null : interfaceC33689cMo68212g1.mo5353J0(i75));
                if (stringList3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                iM60658N26 = i66;
                int i76 = iM60658N33;
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(i76)) != 0;
                iM60658N28 = i68;
                int i77 = iM60658N34;
                boolean z17 = ((int) interfaceC33689cMo68212g1.getLong(i77)) != 0;
                int i78 = iM60658N35;
                iM60658N33 = i76;
                ModerationDetailsEntity moderationDetailsEntityStringToModerationDetails = messageDao_Impl2.__moderationDetailsConverter.stringToModerationDetails(interfaceC33689cMo68212g1.isNull(i78) ? null : interfaceC33689cMo68212g1.mo5353J0(i78));
                int i79 = iM60658N36;
                iM60658N36 = i79;
                ModerationEntity moderationEntityStringToModeration = messageDao_Impl2.__moderationConverter.stringToModeration(interfaceC33689cMo68212g1.isNull(i79) ? null : interfaceC33689cMo68212g1.mo5353J0(i79));
                int i83 = iM60658N37;
                iM60658N37 = i83;
                Date dateFromTimestamp8 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i83) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i83)));
                iM60658N38 = iM60658N38;
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(iM60658N38) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N38);
                int i84 = iM60658N39;
                iM60658N34 = i77;
                List<String> stringList4 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i84) ? null : interfaceC33689cMo68212g1.mo5353J0(i84));
                if (stringList4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                iM60658N40 = iM60658N40;
                ReminderInfoEntity reminderInfoEntityStringToReminderInfo = messageDao_Impl2.__reminderInfoConverter.stringToReminderInfo(interfaceC33689cMo68212g1.isNull(iM60658N40) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N40));
                int i85 = iM60658N41;
                iM60658N41 = i85;
                LocationEntity locationEntityStringToLocation = messageDao_Impl2.__locationConverter.stringToLocation(interfaceC33689cMo68212g1.isNull(i85) ? null : interfaceC33689cMo68212g1.mo5353J0(i85));
                iM60658N42 = iM60658N42;
                String strMo5353J17 = interfaceC33689cMo68212g1.isNull(iM60658N42) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N42);
                iM60658N35 = i78;
                iM60658N39 = i84;
                iM60658N43 = iM60658N43;
                boolean z18 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N43)) != 0;
                iM60658N44 = iM60658N44;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    i14 = iM60658N45;
                    if (interfaceC33689cMo68212g1.isNull(i14)) {
                        i15 = iM60658N46;
                        if (interfaceC33689cMo68212g1.isNull(i15)) {
                            iM60658N42 = iM60658N42;
                            i16 = iM60658N47;
                            if (interfaceC33689cMo68212g1.isNull(i16)) {
                                iM60658N40 = iM60658N40;
                                i17 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(i17)) {
                                    iM60658N43 = iM60658N43;
                                    iM60658N44 = iM60658N44;
                                    channelInfoEntity = null;
                                } else {
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                        strMo5353J0 = null;
                                    } else {
                                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(i14)) {
                                        strMo5353J1 = null;
                                    } else {
                                        strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i14);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(i15)) {
                                        strMo5353J2 = null;
                                    } else {
                                        strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i15);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(i16)) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i16));
                                    }
                                    channelInfoEntity = new ChannelInfoEntity(strMo5353J0, strMo5353J1, strMo5353J2, numValueOf, interfaceC33689cMo68212g1.isNull(i17) ? null : interfaceC33689cMo68212g1.mo5353J0(i17));
                                }
                            } else {
                                iM60658N40 = iM60658N40;
                                i17 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i14)) {
                                    strMo5353J1 = null;
                                } else {
                                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i14);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i15)) {
                                    strMo5353J2 = null;
                                } else {
                                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i15);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    numValueOf = null;
                                } else {
                                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i16));
                                }
                                channelInfoEntity = new ChannelInfoEntity(strMo5353J0, strMo5353J1, strMo5353J2, numValueOf, interfaceC33689cMo68212g1.isNull(i17) ? null : interfaceC33689cMo68212g1.mo5353J0(i17));
                            }
                        } else {
                            iM60658N42 = iM60658N42;
                            iM60658N40 = iM60658N40;
                            i16 = iM60658N47;
                            i17 = iM60658N48;
                            if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i14)) {
                                strMo5353J1 = null;
                            } else {
                                strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i14);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                strMo5353J2 = null;
                            } else {
                                strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i15);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i16)) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i16));
                            }
                            channelInfoEntity = new ChannelInfoEntity(strMo5353J0, strMo5353J1, strMo5353J2, numValueOf, interfaceC33689cMo68212g1.isNull(i17) ? null : interfaceC33689cMo68212g1.mo5353J0(i17));
                        }
                    }
                    MessageInnerEntity messageInnerEntity = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i34, i38, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                    Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                    iM60658N46 = i15;
                    String str4 = str3;
                    AbstractC22676k.m65749i(objM73986U, str4);
                    C0022g c0022g4 = c0022g;
                    Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                    AbstractC22676k.m65749i(objM73986U2, str4);
                    iM60658N47 = i16;
                    Object objM73986U3 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                    AbstractC22676k.m65749i(objM73986U3, str4);
                    arrayList.add(new MessageEntity(messageInnerEntity, (List) objM73986U, (List) objM73986U2, (List) objM73986U3));
                    messageDao_Impl2 = messageDao_Impl;
                    iM60658N48 = i17;
                    iM60658N3 = i29;
                    c0022g = c0022g4;
                    str3 = str4;
                    iM60658N4 = i37;
                    iM60658N2 = i28;
                    iM60658N45 = i14;
                    i27 = i36;
                    iM60658N5 = i35;
                    i26 = i39;
                    iM60658N18 = i54;
                } else {
                    i14 = iM60658N45;
                }
                i15 = iM60658N46;
                i16 = iM60658N47;
                i17 = iM60658N48;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                }
                if (interfaceC33689cMo68212g1.isNull(i14)) {
                    strMo5353J1 = null;
                } else {
                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(i14);
                }
                if (interfaceC33689cMo68212g1.isNull(i15)) {
                    strMo5353J2 = null;
                } else {
                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i15);
                }
                if (interfaceC33689cMo68212g1.isNull(i16)) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i16));
                }
                channelInfoEntity = new ChannelInfoEntity(strMo5353J0, strMo5353J1, strMo5353J2, numValueOf, interfaceC33689cMo68212g1.isNull(i17) ? null : interfaceC33689cMo68212g1.mo5353J0(i17));
                MessageInnerEntity messageInnerEntity2 = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i34, i38, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                Object objM73986U4 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                iM60658N46 = i15;
                String str5 = str3;
                AbstractC22676k.m65749i(objM73986U4, str5);
                C0022g c0022g5 = c0022g;
                Object objM73986U5 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                AbstractC22676k.m65749i(objM73986U5, str5);
                iM60658N47 = i16;
                Object objM73986U6 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                AbstractC22676k.m65749i(objM73986U6, str5);
                arrayList.add(new MessageEntity(messageInnerEntity2, (List) objM73986U4, (List) objM73986U5, (List) objM73986U6));
                messageDao_Impl2 = messageDao_Impl;
                iM60658N48 = i17;
                iM60658N3 = i29;
                c0022g = c0022g5;
                str3 = str5;
                iM60658N4 = i37;
                iM60658N2 = i28;
                iM60658N45 = i14;
                i27 = i36;
                iM60658N5 = i35;
                i26 = i39;
                iM60658N18 = i54;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:233:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:234:0x05b8 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0014, B:4:0x0197, B:6:0x019d, B:8:0x01a7, B:12:0x01b7, B:14:0x01c1, B:15:0x01c9, B:17:0x01d3, B:19:0x01df, B:20:0x01f2, B:22:0x01f8, B:27:0x024b, B:32:0x0267, B:37:0x0283, B:42:0x029f, B:47:0x02bb, B:52:0x02d3, B:56:0x02df, B:61:0x02f5, B:63:0x02fd, B:68:0x030f, B:72:0x031b, B:77:0x0331, B:79:0x0339, B:83:0x0348, B:85:0x0350, B:90:0x0364, B:95:0x037c, B:100:0x038b, B:105:0x039b, B:107:0x03a3, B:112:0x03b8, B:117:0x03c7, B:122:0x03d7, B:124:0x03df, B:129:0x03f7, B:134:0x0406, B:139:0x041a, B:144:0x0436, B:149:0x0450, B:154:0x0466, B:156:0x046e, B:161:0x0483, B:166:0x0492, B:171:0x04a2, B:176:0x04ba, B:181:0x04d6, B:186:0x04f0, B:191:0x0506, B:193:0x050e, B:197:0x051d, B:202:0x0535, B:207:0x0553, B:212:0x0562, B:214:0x0568, B:216:0x0570, B:218:0x0578, B:220:0x0582, B:231:0x05af, B:235:0x05be, B:239:0x05cd, B:243:0x05dc, B:247:0x05f8, B:251:0x0606, B:252:0x060d, B:250:0x0601, B:246:0x05e9, B:242:0x05d6, B:238:0x05c7, B:234:0x05b8, B:206:0x054c, B:201:0x0530, B:196:0x0519, B:253:0x0668, B:254:0x066d, B:190:0x04fd, B:185:0x04e9, B:180:0x04cd, B:175:0x04b5, B:170:0x049d, B:255:0x066e, B:256:0x0673, B:153:0x045d, B:148:0x0449, B:143:0x042d, B:138:0x0411, B:128:0x03f0, B:257:0x0674, B:258:0x067b, B:121:0x03d2, B:259:0x067c, B:260:0x0683, B:104:0x0396, B:94:0x0375, B:89:0x035d, B:261:0x0684, B:262:0x068b, B:82:0x0344, B:263:0x068c, B:264:0x0691, B:76:0x0328, B:265:0x0692, B:266:0x0697, B:67:0x030a, B:267:0x0698, B:268:0x069d, B:60:0x02ec, B:269:0x069e, B:270:0x06a3, B:51:0x02ce, B:46:0x02b2, B:41:0x0296, B:36:0x027a, B:31:0x025e, B:26:0x023e), top: B:275:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:238:0x05c7 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0014, B:4:0x0197, B:6:0x019d, B:8:0x01a7, B:12:0x01b7, B:14:0x01c1, B:15:0x01c9, B:17:0x01d3, B:19:0x01df, B:20:0x01f2, B:22:0x01f8, B:27:0x024b, B:32:0x0267, B:37:0x0283, B:42:0x029f, B:47:0x02bb, B:52:0x02d3, B:56:0x02df, B:61:0x02f5, B:63:0x02fd, B:68:0x030f, B:72:0x031b, B:77:0x0331, B:79:0x0339, B:83:0x0348, B:85:0x0350, B:90:0x0364, B:95:0x037c, B:100:0x038b, B:105:0x039b, B:107:0x03a3, B:112:0x03b8, B:117:0x03c7, B:122:0x03d7, B:124:0x03df, B:129:0x03f7, B:134:0x0406, B:139:0x041a, B:144:0x0436, B:149:0x0450, B:154:0x0466, B:156:0x046e, B:161:0x0483, B:166:0x0492, B:171:0x04a2, B:176:0x04ba, B:181:0x04d6, B:186:0x04f0, B:191:0x0506, B:193:0x050e, B:197:0x051d, B:202:0x0535, B:207:0x0553, B:212:0x0562, B:214:0x0568, B:216:0x0570, B:218:0x0578, B:220:0x0582, B:231:0x05af, B:235:0x05be, B:239:0x05cd, B:243:0x05dc, B:247:0x05f8, B:251:0x0606, B:252:0x060d, B:250:0x0601, B:246:0x05e9, B:242:0x05d6, B:238:0x05c7, B:234:0x05b8, B:206:0x054c, B:201:0x0530, B:196:0x0519, B:253:0x0668, B:254:0x066d, B:190:0x04fd, B:185:0x04e9, B:180:0x04cd, B:175:0x04b5, B:170:0x049d, B:255:0x066e, B:256:0x0673, B:153:0x045d, B:148:0x0449, B:143:0x042d, B:138:0x0411, B:128:0x03f0, B:257:0x0674, B:258:0x067b, B:121:0x03d2, B:259:0x067c, B:260:0x0683, B:104:0x0396, B:94:0x0375, B:89:0x035d, B:261:0x0684, B:262:0x068b, B:82:0x0344, B:263:0x068c, B:264:0x0691, B:76:0x0328, B:265:0x0692, B:266:0x0697, B:67:0x030a, B:267:0x0698, B:268:0x069d, B:60:0x02ec, B:269:0x069e, B:270:0x06a3, B:51:0x02ce, B:46:0x02b2, B:41:0x0296, B:36:0x027a, B:31:0x025e, B:26:0x023e), top: B:275:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:241:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:242:0x05d6 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0014, B:4:0x0197, B:6:0x019d, B:8:0x01a7, B:12:0x01b7, B:14:0x01c1, B:15:0x01c9, B:17:0x01d3, B:19:0x01df, B:20:0x01f2, B:22:0x01f8, B:27:0x024b, B:32:0x0267, B:37:0x0283, B:42:0x029f, B:47:0x02bb, B:52:0x02d3, B:56:0x02df, B:61:0x02f5, B:63:0x02fd, B:68:0x030f, B:72:0x031b, B:77:0x0331, B:79:0x0339, B:83:0x0348, B:85:0x0350, B:90:0x0364, B:95:0x037c, B:100:0x038b, B:105:0x039b, B:107:0x03a3, B:112:0x03b8, B:117:0x03c7, B:122:0x03d7, B:124:0x03df, B:129:0x03f7, B:134:0x0406, B:139:0x041a, B:144:0x0436, B:149:0x0450, B:154:0x0466, B:156:0x046e, B:161:0x0483, B:166:0x0492, B:171:0x04a2, B:176:0x04ba, B:181:0x04d6, B:186:0x04f0, B:191:0x0506, B:193:0x050e, B:197:0x051d, B:202:0x0535, B:207:0x0553, B:212:0x0562, B:214:0x0568, B:216:0x0570, B:218:0x0578, B:220:0x0582, B:231:0x05af, B:235:0x05be, B:239:0x05cd, B:243:0x05dc, B:247:0x05f8, B:251:0x0606, B:252:0x060d, B:250:0x0601, B:246:0x05e9, B:242:0x05d6, B:238:0x05c7, B:234:0x05b8, B:206:0x054c, B:201:0x0530, B:196:0x0519, B:253:0x0668, B:254:0x066d, B:190:0x04fd, B:185:0x04e9, B:180:0x04cd, B:175:0x04b5, B:170:0x049d, B:255:0x066e, B:256:0x0673, B:153:0x045d, B:148:0x0449, B:143:0x042d, B:138:0x0411, B:128:0x03f0, B:257:0x0674, B:258:0x067b, B:121:0x03d2, B:259:0x067c, B:260:0x0683, B:104:0x0396, B:94:0x0375, B:89:0x035d, B:261:0x0684, B:262:0x068b, B:82:0x0344, B:263:0x068c, B:264:0x0691, B:76:0x0328, B:265:0x0692, B:266:0x0697, B:67:0x030a, B:267:0x0698, B:268:0x069d, B:60:0x02ec, B:269:0x069e, B:270:0x06a3, B:51:0x02ce, B:46:0x02b2, B:41:0x0296, B:36:0x027a, B:31:0x025e, B:26:0x023e), top: B:275:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:246:0x05e9 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0014, B:4:0x0197, B:6:0x019d, B:8:0x01a7, B:12:0x01b7, B:14:0x01c1, B:15:0x01c9, B:17:0x01d3, B:19:0x01df, B:20:0x01f2, B:22:0x01f8, B:27:0x024b, B:32:0x0267, B:37:0x0283, B:42:0x029f, B:47:0x02bb, B:52:0x02d3, B:56:0x02df, B:61:0x02f5, B:63:0x02fd, B:68:0x030f, B:72:0x031b, B:77:0x0331, B:79:0x0339, B:83:0x0348, B:85:0x0350, B:90:0x0364, B:95:0x037c, B:100:0x038b, B:105:0x039b, B:107:0x03a3, B:112:0x03b8, B:117:0x03c7, B:122:0x03d7, B:124:0x03df, B:129:0x03f7, B:134:0x0406, B:139:0x041a, B:144:0x0436, B:149:0x0450, B:154:0x0466, B:156:0x046e, B:161:0x0483, B:166:0x0492, B:171:0x04a2, B:176:0x04ba, B:181:0x04d6, B:186:0x04f0, B:191:0x0506, B:193:0x050e, B:197:0x051d, B:202:0x0535, B:207:0x0553, B:212:0x0562, B:214:0x0568, B:216:0x0570, B:218:0x0578, B:220:0x0582, B:231:0x05af, B:235:0x05be, B:239:0x05cd, B:243:0x05dc, B:247:0x05f8, B:251:0x0606, B:252:0x060d, B:250:0x0601, B:246:0x05e9, B:242:0x05d6, B:238:0x05c7, B:234:0x05b8, B:206:0x054c, B:201:0x0530, B:196:0x0519, B:253:0x0668, B:254:0x066d, B:190:0x04fd, B:185:0x04e9, B:180:0x04cd, B:175:0x04b5, B:170:0x049d, B:255:0x066e, B:256:0x0673, B:153:0x045d, B:148:0x0449, B:143:0x042d, B:138:0x0411, B:128:0x03f0, B:257:0x0674, B:258:0x067b, B:121:0x03d2, B:259:0x067c, B:260:0x0683, B:104:0x0396, B:94:0x0375, B:89:0x035d, B:261:0x0684, B:262:0x068b, B:82:0x0344, B:263:0x068c, B:264:0x0691, B:76:0x0328, B:265:0x0692, B:266:0x0697, B:67:0x030a, B:267:0x0698, B:268:0x069d, B:60:0x02ec, B:269:0x069e, B:270:0x06a3, B:51:0x02ce, B:46:0x02b2, B:41:0x0296, B:36:0x027a, B:31:0x025e, B:26:0x023e), top: B:275:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x0601 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0014, B:4:0x0197, B:6:0x019d, B:8:0x01a7, B:12:0x01b7, B:14:0x01c1, B:15:0x01c9, B:17:0x01d3, B:19:0x01df, B:20:0x01f2, B:22:0x01f8, B:27:0x024b, B:32:0x0267, B:37:0x0283, B:42:0x029f, B:47:0x02bb, B:52:0x02d3, B:56:0x02df, B:61:0x02f5, B:63:0x02fd, B:68:0x030f, B:72:0x031b, B:77:0x0331, B:79:0x0339, B:83:0x0348, B:85:0x0350, B:90:0x0364, B:95:0x037c, B:100:0x038b, B:105:0x039b, B:107:0x03a3, B:112:0x03b8, B:117:0x03c7, B:122:0x03d7, B:124:0x03df, B:129:0x03f7, B:134:0x0406, B:139:0x041a, B:144:0x0436, B:149:0x0450, B:154:0x0466, B:156:0x046e, B:161:0x0483, B:166:0x0492, B:171:0x04a2, B:176:0x04ba, B:181:0x04d6, B:186:0x04f0, B:191:0x0506, B:193:0x050e, B:197:0x051d, B:202:0x0535, B:207:0x0553, B:212:0x0562, B:214:0x0568, B:216:0x0570, B:218:0x0578, B:220:0x0582, B:231:0x05af, B:235:0x05be, B:239:0x05cd, B:243:0x05dc, B:247:0x05f8, B:251:0x0606, B:252:0x060d, B:250:0x0601, B:246:0x05e9, B:242:0x05d6, B:238:0x05c7, B:234:0x05b8, B:206:0x054c, B:201:0x0530, B:196:0x0519, B:253:0x0668, B:254:0x066d, B:190:0x04fd, B:185:0x04e9, B:180:0x04cd, B:175:0x04b5, B:170:0x049d, B:255:0x066e, B:256:0x0673, B:153:0x045d, B:148:0x0449, B:143:0x042d, B:138:0x0411, B:128:0x03f0, B:257:0x0674, B:258:0x067b, B:121:0x03d2, B:259:0x067c, B:260:0x0683, B:104:0x0396, B:94:0x0375, B:89:0x035d, B:261:0x0684, B:262:0x068b, B:82:0x0344, B:263:0x068c, B:264:0x0691, B:76:0x0328, B:265:0x0692, B:266:0x0697, B:67:0x030a, B:267:0x0698, B:268:0x069d, B:60:0x02ec, B:269:0x069e, B:270:0x06a3, B:51:0x02ce, B:46:0x02b2, B:41:0x0296, B:36:0x027a, B:31:0x025e, B:26:0x023e), top: B:275:0x0014 }] */
    private static final List selectByUserId$lambda$19(String str, String str2, MessageDao_Impl messageDao_Impl, InterfaceC33687a _connection) throws Exception {
        int i13;
        int i14;
        int i15;
        int i16;
        ChannelInfoEntity channelInfoEntity;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        Integer numValueOf;
        MessageDao_Impl messageDao_Impl2 = messageDao_Impl;
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
            String str3 = "getValue(...)";
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedLocallyAt");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "remoteMentionedUserIds");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mentionedUsersId");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionCounts");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionScores");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionGroups");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "shadowed");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "i18n");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyToId");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinned");
            int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedAt");
            int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinExpires");
            int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedByUserId");
            int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "threadParticipantsIds");
            int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPushNotification");
            int iM60658N34 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipEnrichUrl");
            int iM60658N35 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderationDetails");
            int iM60658N36 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderation");
            int iM60658N37 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageTextUpdatedAt");
            int iM60658N38 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pollId");
            int iM60658N39 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "restrictedVisibility");
            int iM60658N40 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.CATEGORY_REMINDER);
            int iM60658N41 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sharedLocation");
            int iM60658N42 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelRole");
            int iM60658N43 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedForMe");
            int iM60658N44 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infocid");
            int iM60658N45 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoid");
            int iM60658N46 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infotype");
            int iM60658N47 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infomemberCount");
            int iM60658N48 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoname");
            int i17 = iM60658N12;
            C0022g c0022g = new C0022g(0);
            int i18 = iM60658N11;
            C0022g c0022g2 = new C0022g(0);
            int i19 = iM60658N10;
            C0022g c0022g3 = new C0022g(0);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g.containsKey(strMo5353J3)) {
                    c0022g.put(strMo5353J3, new ArrayList());
                }
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g2.containsKey(strMo5353J4)) {
                    c0022g2.put(strMo5353J4, new ArrayList());
                }
                String strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g3.containsKey(strMo5353J5)) {
                    c0022g3.put(strMo5353J5, new ArrayList());
                }
                iM60658N9 = iM60658N9;
            }
            int i24 = iM60658N9;
            interfaceC33689cMo68212g1.reset();
            messageDao_Impl2.m54706xafdba081(_connection, c0022g);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g2);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g3);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J7 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J8 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J9 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J10 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J11 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                int i25 = iM60658N2;
                int i26 = iM60658N3;
                SyncStatus syncStatusStringToSyncStatus = messageDao_Impl2.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N7));
                int i27 = (int) interfaceC33689cMo68212g1.getLong(iM60658N8);
                int i28 = iM60658N5;
                int i29 = i24;
                int i34 = iM60658N4;
                int i35 = (int) interfaceC33689cMo68212g1.getLong(i29);
                int i36 = i19;
                Date dateFromTimestamp = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i36) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i36)));
                int i37 = i18;
                i18 = i37;
                Date dateFromTimestamp2 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i37) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i37)));
                int i38 = i17;
                i17 = i38;
                Date dateFromTimestamp3 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i38) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i38)));
                int i39 = iM60658N13;
                iM60658N13 = i39;
                Date dateFromTimestamp4 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i39) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i39)));
                int i44 = iM60658N14;
                iM60658N14 = i44;
                Date dateFromTimestamp5 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i44) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i44)));
                int i45 = iM60658N15;
                iM60658N15 = i45;
                List<String> stringList = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i45) ? null : interfaceC33689cMo68212g1.mo5353J0(i45));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i46 = iM60658N16;
                List<String> stringList2 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i46) ? null : interfaceC33689cMo68212g1.mo5353J0(i46));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i47 = iM60658N17;
                iM60658N17 = i47;
                Map<String, Integer> mapStringToMap = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i47) ? null : interfaceC33689cMo68212g1.mo5353J0(i47));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                int i48 = iM60658N18;
                Map<String, Integer> mapStringToMap2 = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i48) ? null : interfaceC33689cMo68212g1.mo5353J0(i48));
                if (mapStringToMap2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                int i49 = iM60658N19;
                Map<String, ReactionGroupEntity> mapStringToReactionGroupEntityMap = messageDao_Impl2.__reactionGroupConverter.stringToReactionGroupEntityMap(interfaceC33689cMo68212g1.isNull(i49) ? null : interfaceC33689cMo68212g1.mo5353J0(i49));
                if (mapStringToReactionGroupEntityMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>', but it was NULL.");
                }
                int i54 = iM60658N20;
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(i54) ? null : interfaceC33689cMo68212g1.mo5353J0(i54);
                int i55 = iM60658N21;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(i55) ? null : interfaceC33689cMo68212g1.mo5353J0(i55);
                iM60658N20 = i54;
                iM60658N19 = i49;
                iM60658N21 = i55;
                int i56 = iM60658N22;
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(i56)) != 0;
                int i57 = iM60658N23;
                iM60658N22 = i56;
                Map<String, String> mapStringToStringMap = messageDao_Impl2.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(i57) ? null : interfaceC33689cMo68212g1.mo5353J0(i57));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                iM60658N23 = i57;
                int i58 = iM60658N24;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(i58)) != 0;
                int i59 = iM60658N25;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(i59)) != 0;
                int i64 = iM60658N26;
                iM60658N24 = i58;
                Map<String, Object> mapStringToMap3 = messageDao_Impl2.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i64) ? null : interfaceC33689cMo68212g1.mo5353J0(i64));
                if (mapStringToMap3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                int i65 = iM60658N27;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(i65) ? null : interfaceC33689cMo68212g1.mo5353J0(i65);
                iM60658N27 = i65;
                iM60658N25 = i59;
                int i66 = iM60658N28;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(i66)) != 0;
                int i67 = iM60658N29;
                iM60658N29 = i67;
                Date dateFromTimestamp6 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i67) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i67)));
                int i68 = iM60658N30;
                iM60658N30 = i68;
                Date dateFromTimestamp7 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i68) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i68)));
                iM60658N31 = iM60658N31;
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(iM60658N31) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N31);
                int i69 = iM60658N32;
                iM60658N32 = i69;
                List<String> stringList3 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i69) ? null : interfaceC33689cMo68212g1.mo5353J0(i69));
                if (stringList3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                iM60658N26 = i64;
                int i74 = iM60658N33;
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(i74)) != 0;
                iM60658N28 = i66;
                int i75 = iM60658N34;
                boolean z17 = ((int) interfaceC33689cMo68212g1.getLong(i75)) != 0;
                int i76 = iM60658N35;
                iM60658N33 = i74;
                ModerationDetailsEntity moderationDetailsEntityStringToModerationDetails = messageDao_Impl2.__moderationDetailsConverter.stringToModerationDetails(interfaceC33689cMo68212g1.isNull(i76) ? null : interfaceC33689cMo68212g1.mo5353J0(i76));
                int i77 = iM60658N36;
                iM60658N36 = i77;
                ModerationEntity moderationEntityStringToModeration = messageDao_Impl2.__moderationConverter.stringToModeration(interfaceC33689cMo68212g1.isNull(i77) ? null : interfaceC33689cMo68212g1.mo5353J0(i77));
                int i78 = iM60658N37;
                iM60658N37 = i78;
                Date dateFromTimestamp8 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i78) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i78)));
                iM60658N38 = iM60658N38;
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(iM60658N38) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N38);
                int i79 = iM60658N39;
                iM60658N34 = i75;
                List<String> stringList4 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i79) ? null : interfaceC33689cMo68212g1.mo5353J0(i79));
                if (stringList4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                iM60658N40 = iM60658N40;
                ReminderInfoEntity reminderInfoEntityStringToReminderInfo = messageDao_Impl2.__reminderInfoConverter.stringToReminderInfo(interfaceC33689cMo68212g1.isNull(iM60658N40) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N40));
                int i83 = iM60658N41;
                iM60658N41 = i83;
                LocationEntity locationEntityStringToLocation = messageDao_Impl2.__locationConverter.stringToLocation(interfaceC33689cMo68212g1.isNull(i83) ? null : interfaceC33689cMo68212g1.mo5353J0(i83));
                iM60658N42 = iM60658N42;
                String strMo5353J17 = interfaceC33689cMo68212g1.isNull(iM60658N42) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N42);
                iM60658N35 = i76;
                iM60658N39 = i79;
                iM60658N43 = iM60658N43;
                boolean z18 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N43)) != 0;
                iM60658N44 = iM60658N44;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    i13 = iM60658N45;
                    if (interfaceC33689cMo68212g1.isNull(i13)) {
                        i14 = iM60658N46;
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            iM60658N42 = iM60658N42;
                            i15 = iM60658N47;
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                iM60658N40 = iM60658N40;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    iM60658N43 = iM60658N43;
                                    iM60658N44 = iM60658N44;
                                    channelInfoEntity = null;
                                } else {
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                        strMo5353J0 = null;
                                    } else {
                                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
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
                                }
                            } else {
                                iM60658N40 = iM60658N40;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
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
                            }
                        } else {
                            iM60658N42 = iM60658N42;
                            iM60658N40 = iM60658N40;
                            i15 = iM60658N47;
                            i16 = iM60658N48;
                            if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
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
                        }
                    }
                    MessageInnerEntity messageInnerEntity = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i27, i35, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                    Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                    iM60658N46 = i14;
                    String str4 = str3;
                    AbstractC22676k.m65749i(objM73986U, str4);
                    C0022g c0022g4 = c0022g;
                    Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                    AbstractC22676k.m65749i(objM73986U2, str4);
                    iM60658N47 = i15;
                    Object objM73986U3 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                    AbstractC22676k.m65749i(objM73986U3, str4);
                    arrayList.add(new MessageEntity(messageInnerEntity, (List) objM73986U, (List) objM73986U2, (List) objM73986U3));
                    messageDao_Impl2 = messageDao_Impl;
                    iM60658N48 = i16;
                    iM60658N3 = i26;
                    c0022g = c0022g4;
                    str3 = str4;
                    iM60658N4 = i34;
                    iM60658N2 = i25;
                    iM60658N45 = i13;
                    i24 = i29;
                    iM60658N16 = i46;
                    iM60658N5 = i28;
                    i19 = i36;
                    iM60658N18 = i48;
                } else {
                    i13 = iM60658N45;
                }
                i14 = iM60658N46;
                i15 = iM60658N47;
                i16 = iM60658N48;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
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
                MessageInnerEntity messageInnerEntity2 = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i27, i35, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                Object objM73986U4 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                iM60658N46 = i14;
                String str5 = str3;
                AbstractC22676k.m65749i(objM73986U4, str5);
                C0022g c0022g5 = c0022g;
                Object objM73986U5 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                AbstractC22676k.m65749i(objM73986U5, str5);
                iM60658N47 = i15;
                Object objM73986U6 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                AbstractC22676k.m65749i(objM73986U6, str5);
                arrayList.add(new MessageEntity(messageInnerEntity2, (List) objM73986U4, (List) objM73986U5, (List) objM73986U6));
                messageDao_Impl2 = messageDao_Impl;
                iM60658N48 = i16;
                iM60658N3 = i26;
                c0022g = c0022g5;
                str3 = str5;
                iM60658N4 = i34;
                iM60658N2 = i25;
                iM60658N45 = i13;
                i24 = i29;
                iM60658N16 = i46;
                iM60658N5 = i28;
                i19 = i36;
                iM60658N18 = i48;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:236:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:237:0x05cf A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:9:0x002b, B:10:0x01ab, B:12:0x01b1, B:14:0x01bb, B:16:0x01c8, B:18:0x01d2, B:19:0x01da, B:21:0x01e4, B:23:0x01f0, B:24:0x0203, B:26:0x0209, B:31:0x025b, B:36:0x0277, B:41:0x0293, B:46:0x02af, B:51:0x02cb, B:56:0x02e3, B:60:0x02ef, B:65:0x0305, B:67:0x030d, B:72:0x031f, B:76:0x032b, B:81:0x0341, B:83:0x0349, B:87:0x0358, B:89:0x0360, B:94:0x0374, B:98:0x0393, B:103:0x03a2, B:108:0x03b2, B:110:0x03ba, B:115:0x03cf, B:120:0x03de, B:125:0x03ee, B:127:0x03f6, B:132:0x040e, B:137:0x041d, B:142:0x0431, B:147:0x044d, B:152:0x0467, B:157:0x047d, B:159:0x0485, B:164:0x049a, B:169:0x04a9, B:174:0x04b9, B:179:0x04d1, B:184:0x04ed, B:189:0x0507, B:194:0x051d, B:196:0x0525, B:200:0x0534, B:205:0x054c, B:210:0x056a, B:215:0x0579, B:217:0x057f, B:219:0x0587, B:221:0x058f, B:223:0x0599, B:234:0x05c6, B:238:0x05d5, B:242:0x05e4, B:246:0x05f3, B:250:0x060f, B:254:0x061d, B:255:0x0624, B:253:0x0618, B:249:0x0600, B:245:0x05ed, B:241:0x05de, B:237:0x05cf, B:209:0x0563, B:204:0x0547, B:199:0x0530, B:256:0x068d, B:257:0x0692, B:193:0x0514, B:188:0x0500, B:183:0x04e4, B:178:0x04cc, B:173:0x04b4, B:258:0x0693, B:259:0x0698, B:156:0x0474, B:151:0x0460, B:146:0x0444, B:141:0x0428, B:131:0x0407, B:260:0x0699, B:261:0x06a0, B:124:0x03e9, B:262:0x06a1, B:263:0x06a8, B:107:0x03ad, B:97:0x0385, B:93:0x036d, B:264:0x06a9, B:265:0x06b0, B:86:0x0354, B:266:0x06b1, B:267:0x06b6, B:80:0x0338, B:268:0x06b7, B:269:0x06bc, B:71:0x031a, B:270:0x06bd, B:271:0x06c2, B:64:0x02fc, B:272:0x06c3, B:273:0x06c8, B:55:0x02de, B:50:0x02c2, B:45:0x02a6, B:40:0x028a, B:35:0x026e, B:30:0x024e), top: B:278:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x05db  */
    /* JADX WARN: Code duplicated, block: B:241:0x05de A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:9:0x002b, B:10:0x01ab, B:12:0x01b1, B:14:0x01bb, B:16:0x01c8, B:18:0x01d2, B:19:0x01da, B:21:0x01e4, B:23:0x01f0, B:24:0x0203, B:26:0x0209, B:31:0x025b, B:36:0x0277, B:41:0x0293, B:46:0x02af, B:51:0x02cb, B:56:0x02e3, B:60:0x02ef, B:65:0x0305, B:67:0x030d, B:72:0x031f, B:76:0x032b, B:81:0x0341, B:83:0x0349, B:87:0x0358, B:89:0x0360, B:94:0x0374, B:98:0x0393, B:103:0x03a2, B:108:0x03b2, B:110:0x03ba, B:115:0x03cf, B:120:0x03de, B:125:0x03ee, B:127:0x03f6, B:132:0x040e, B:137:0x041d, B:142:0x0431, B:147:0x044d, B:152:0x0467, B:157:0x047d, B:159:0x0485, B:164:0x049a, B:169:0x04a9, B:174:0x04b9, B:179:0x04d1, B:184:0x04ed, B:189:0x0507, B:194:0x051d, B:196:0x0525, B:200:0x0534, B:205:0x054c, B:210:0x056a, B:215:0x0579, B:217:0x057f, B:219:0x0587, B:221:0x058f, B:223:0x0599, B:234:0x05c6, B:238:0x05d5, B:242:0x05e4, B:246:0x05f3, B:250:0x060f, B:254:0x061d, B:255:0x0624, B:253:0x0618, B:249:0x0600, B:245:0x05ed, B:241:0x05de, B:237:0x05cf, B:209:0x0563, B:204:0x0547, B:199:0x0530, B:256:0x068d, B:257:0x0692, B:193:0x0514, B:188:0x0500, B:183:0x04e4, B:178:0x04cc, B:173:0x04b4, B:258:0x0693, B:259:0x0698, B:156:0x0474, B:151:0x0460, B:146:0x0444, B:141:0x0428, B:131:0x0407, B:260:0x0699, B:261:0x06a0, B:124:0x03e9, B:262:0x06a1, B:263:0x06a8, B:107:0x03ad, B:97:0x0385, B:93:0x036d, B:264:0x06a9, B:265:0x06b0, B:86:0x0354, B:266:0x06b1, B:267:0x06b6, B:80:0x0338, B:268:0x06b7, B:269:0x06bc, B:71:0x031a, B:270:0x06bd, B:271:0x06c2, B:64:0x02fc, B:272:0x06c3, B:273:0x06c8, B:55:0x02de, B:50:0x02c2, B:45:0x02a6, B:40:0x028a, B:35:0x026e, B:30:0x024e), top: B:278:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:245:0x05ed A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:9:0x002b, B:10:0x01ab, B:12:0x01b1, B:14:0x01bb, B:16:0x01c8, B:18:0x01d2, B:19:0x01da, B:21:0x01e4, B:23:0x01f0, B:24:0x0203, B:26:0x0209, B:31:0x025b, B:36:0x0277, B:41:0x0293, B:46:0x02af, B:51:0x02cb, B:56:0x02e3, B:60:0x02ef, B:65:0x0305, B:67:0x030d, B:72:0x031f, B:76:0x032b, B:81:0x0341, B:83:0x0349, B:87:0x0358, B:89:0x0360, B:94:0x0374, B:98:0x0393, B:103:0x03a2, B:108:0x03b2, B:110:0x03ba, B:115:0x03cf, B:120:0x03de, B:125:0x03ee, B:127:0x03f6, B:132:0x040e, B:137:0x041d, B:142:0x0431, B:147:0x044d, B:152:0x0467, B:157:0x047d, B:159:0x0485, B:164:0x049a, B:169:0x04a9, B:174:0x04b9, B:179:0x04d1, B:184:0x04ed, B:189:0x0507, B:194:0x051d, B:196:0x0525, B:200:0x0534, B:205:0x054c, B:210:0x056a, B:215:0x0579, B:217:0x057f, B:219:0x0587, B:221:0x058f, B:223:0x0599, B:234:0x05c6, B:238:0x05d5, B:242:0x05e4, B:246:0x05f3, B:250:0x060f, B:254:0x061d, B:255:0x0624, B:253:0x0618, B:249:0x0600, B:245:0x05ed, B:241:0x05de, B:237:0x05cf, B:209:0x0563, B:204:0x0547, B:199:0x0530, B:256:0x068d, B:257:0x0692, B:193:0x0514, B:188:0x0500, B:183:0x04e4, B:178:0x04cc, B:173:0x04b4, B:258:0x0693, B:259:0x0698, B:156:0x0474, B:151:0x0460, B:146:0x0444, B:141:0x0428, B:131:0x0407, B:260:0x0699, B:261:0x06a0, B:124:0x03e9, B:262:0x06a1, B:263:0x06a8, B:107:0x03ad, B:97:0x0385, B:93:0x036d, B:264:0x06a9, B:265:0x06b0, B:86:0x0354, B:266:0x06b1, B:267:0x06b6, B:80:0x0338, B:268:0x06b7, B:269:0x06bc, B:71:0x031a, B:270:0x06bd, B:271:0x06c2, B:64:0x02fc, B:272:0x06c3, B:273:0x06c8, B:55:0x02de, B:50:0x02c2, B:45:0x02a6, B:40:0x028a, B:35:0x026e, B:30:0x024e), top: B:278:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:249:0x0600 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:9:0x002b, B:10:0x01ab, B:12:0x01b1, B:14:0x01bb, B:16:0x01c8, B:18:0x01d2, B:19:0x01da, B:21:0x01e4, B:23:0x01f0, B:24:0x0203, B:26:0x0209, B:31:0x025b, B:36:0x0277, B:41:0x0293, B:46:0x02af, B:51:0x02cb, B:56:0x02e3, B:60:0x02ef, B:65:0x0305, B:67:0x030d, B:72:0x031f, B:76:0x032b, B:81:0x0341, B:83:0x0349, B:87:0x0358, B:89:0x0360, B:94:0x0374, B:98:0x0393, B:103:0x03a2, B:108:0x03b2, B:110:0x03ba, B:115:0x03cf, B:120:0x03de, B:125:0x03ee, B:127:0x03f6, B:132:0x040e, B:137:0x041d, B:142:0x0431, B:147:0x044d, B:152:0x0467, B:157:0x047d, B:159:0x0485, B:164:0x049a, B:169:0x04a9, B:174:0x04b9, B:179:0x04d1, B:184:0x04ed, B:189:0x0507, B:194:0x051d, B:196:0x0525, B:200:0x0534, B:205:0x054c, B:210:0x056a, B:215:0x0579, B:217:0x057f, B:219:0x0587, B:221:0x058f, B:223:0x0599, B:234:0x05c6, B:238:0x05d5, B:242:0x05e4, B:246:0x05f3, B:250:0x060f, B:254:0x061d, B:255:0x0624, B:253:0x0618, B:249:0x0600, B:245:0x05ed, B:241:0x05de, B:237:0x05cf, B:209:0x0563, B:204:0x0547, B:199:0x0530, B:256:0x068d, B:257:0x0692, B:193:0x0514, B:188:0x0500, B:183:0x04e4, B:178:0x04cc, B:173:0x04b4, B:258:0x0693, B:259:0x0698, B:156:0x0474, B:151:0x0460, B:146:0x0444, B:141:0x0428, B:131:0x0407, B:260:0x0699, B:261:0x06a0, B:124:0x03e9, B:262:0x06a1, B:263:0x06a8, B:107:0x03ad, B:97:0x0385, B:93:0x036d, B:264:0x06a9, B:265:0x06b0, B:86:0x0354, B:266:0x06b1, B:267:0x06b6, B:80:0x0338, B:268:0x06b7, B:269:0x06bc, B:71:0x031a, B:270:0x06bd, B:271:0x06c2, B:64:0x02fc, B:272:0x06c3, B:273:0x06c8, B:55:0x02de, B:50:0x02c2, B:45:0x02a6, B:40:0x028a, B:35:0x026e, B:30:0x024e), top: B:278:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:253:0x0618 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0011, B:4:0x0016, B:6:0x001c, B:9:0x002b, B:10:0x01ab, B:12:0x01b1, B:14:0x01bb, B:16:0x01c8, B:18:0x01d2, B:19:0x01da, B:21:0x01e4, B:23:0x01f0, B:24:0x0203, B:26:0x0209, B:31:0x025b, B:36:0x0277, B:41:0x0293, B:46:0x02af, B:51:0x02cb, B:56:0x02e3, B:60:0x02ef, B:65:0x0305, B:67:0x030d, B:72:0x031f, B:76:0x032b, B:81:0x0341, B:83:0x0349, B:87:0x0358, B:89:0x0360, B:94:0x0374, B:98:0x0393, B:103:0x03a2, B:108:0x03b2, B:110:0x03ba, B:115:0x03cf, B:120:0x03de, B:125:0x03ee, B:127:0x03f6, B:132:0x040e, B:137:0x041d, B:142:0x0431, B:147:0x044d, B:152:0x0467, B:157:0x047d, B:159:0x0485, B:164:0x049a, B:169:0x04a9, B:174:0x04b9, B:179:0x04d1, B:184:0x04ed, B:189:0x0507, B:194:0x051d, B:196:0x0525, B:200:0x0534, B:205:0x054c, B:210:0x056a, B:215:0x0579, B:217:0x057f, B:219:0x0587, B:221:0x058f, B:223:0x0599, B:234:0x05c6, B:238:0x05d5, B:242:0x05e4, B:246:0x05f3, B:250:0x060f, B:254:0x061d, B:255:0x0624, B:253:0x0618, B:249:0x0600, B:245:0x05ed, B:241:0x05de, B:237:0x05cf, B:209:0x0563, B:204:0x0547, B:199:0x0530, B:256:0x068d, B:257:0x0692, B:193:0x0514, B:188:0x0500, B:183:0x04e4, B:178:0x04cc, B:173:0x04b4, B:258:0x0693, B:259:0x0698, B:156:0x0474, B:151:0x0460, B:146:0x0444, B:141:0x0428, B:131:0x0407, B:260:0x0699, B:261:0x06a0, B:124:0x03e9, B:262:0x06a1, B:263:0x06a8, B:107:0x03ad, B:97:0x0385, B:93:0x036d, B:264:0x06a9, B:265:0x06b0, B:86:0x0354, B:266:0x06b1, B:267:0x06b6, B:80:0x0338, B:268:0x06b7, B:269:0x06bc, B:71:0x031a, B:270:0x06bd, B:271:0x06c2, B:64:0x02fc, B:272:0x06c3, B:273:0x06c8, B:55:0x02de, B:50:0x02c2, B:45:0x02a6, B:40:0x028a, B:35:0x026e, B:30:0x024e), top: B:278:0x0011 }] */
    private static final List selectChunked$lambda$17(String str, List list, MessageDao_Impl messageDao_Impl, InterfaceC33687a _connection) throws Exception {
        int i13;
        int i14;
        int i15;
        ChannelInfoEntity channelInfoEntity;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        Integer numValueOf;
        MessageDao_Impl messageDao_Impl2 = messageDao_Impl;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            Iterator it = list.iterator();
            int i16 = 1;
            while (it.hasNext()) {
                interfaceC33689cMo68212g1.mo5354L(i16, (String) it.next());
                i16++;
            }
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
            String str2 = "getValue(...)";
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedLocallyAt");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "remoteMentionedUserIds");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mentionedUsersId");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionCounts");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionScores");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionGroups");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "shadowed");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "i18n");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyToId");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinned");
            int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedAt");
            int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinExpires");
            int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedByUserId");
            int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "threadParticipantsIds");
            int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPushNotification");
            int iM60658N34 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipEnrichUrl");
            int iM60658N35 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderationDetails");
            int iM60658N36 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderation");
            int iM60658N37 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageTextUpdatedAt");
            int iM60658N38 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pollId");
            int iM60658N39 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "restrictedVisibility");
            int iM60658N40 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.CATEGORY_REMINDER);
            int iM60658N41 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sharedLocation");
            int iM60658N42 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelRole");
            int iM60658N43 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedForMe");
            int iM60658N44 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infocid");
            int iM60658N45 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoid");
            int iM60658N46 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infotype");
            int iM60658N47 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infomemberCount");
            int iM60658N48 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoname");
            int i17 = iM60658N12;
            C0022g c0022g = new C0022g(0);
            int i18 = iM60658N11;
            C0022g c0022g2 = new C0022g(0);
            int i19 = iM60658N10;
            C0022g c0022g3 = new C0022g(0);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g.containsKey(strMo5353J3)) {
                    c0022g.put(strMo5353J3, new ArrayList());
                }
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g2.containsKey(strMo5353J4)) {
                    c0022g2.put(strMo5353J4, new ArrayList());
                }
                String strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g3.containsKey(strMo5353J5)) {
                    c0022g3.put(strMo5353J5, new ArrayList());
                }
                iM60658N9 = iM60658N9;
            }
            int i24 = iM60658N9;
            interfaceC33689cMo68212g1.reset();
            messageDao_Impl2.m54706xafdba081(_connection, c0022g);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g2);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g3);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J7 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J8 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J9 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J10 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J11 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                int i25 = iM60658N2;
                SyncStatus syncStatusStringToSyncStatus = messageDao_Impl2.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N7));
                int i26 = (int) interfaceC33689cMo68212g1.getLong(iM60658N8);
                int i27 = iM60658N4;
                int i28 = i24;
                int i29 = iM60658N3;
                int i34 = (int) interfaceC33689cMo68212g1.getLong(i28);
                int i35 = i19;
                Date dateFromTimestamp = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i35) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i35)));
                int i36 = i18;
                i18 = i36;
                Date dateFromTimestamp2 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i36) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i36)));
                int i37 = i17;
                i17 = i37;
                Date dateFromTimestamp3 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i37) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i37)));
                int i38 = iM60658N13;
                iM60658N13 = i38;
                Date dateFromTimestamp4 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i38) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i38)));
                int i39 = iM60658N14;
                iM60658N14 = i39;
                Date dateFromTimestamp5 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i39) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i39)));
                int i44 = iM60658N15;
                iM60658N15 = i44;
                List<String> stringList = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i44) ? null : interfaceC33689cMo68212g1.mo5353J0(i44));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i45 = iM60658N16;
                List<String> stringList2 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i45) ? null : interfaceC33689cMo68212g1.mo5353J0(i45));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i46 = iM60658N17;
                iM60658N17 = i46;
                Map<String, Integer> mapStringToMap = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i46) ? null : interfaceC33689cMo68212g1.mo5353J0(i46));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                iM60658N18 = iM60658N18;
                Map<String, Integer> mapStringToMap2 = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N18) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N18));
                if (mapStringToMap2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                iM60658N19 = iM60658N19;
                Map<String, ReactionGroupEntity> mapStringToReactionGroupEntityMap = messageDao_Impl2.__reactionGroupConverter.stringToReactionGroupEntityMap(interfaceC33689cMo68212g1.isNull(iM60658N19) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N19));
                if (mapStringToReactionGroupEntityMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>', but it was NULL.");
                }
                iM60658N20 = iM60658N20;
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(iM60658N20) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N20);
                iM60658N21 = iM60658N21;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(iM60658N21) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N21);
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N22)) != 0;
                int i47 = iM60658N23;
                iM60658N22 = iM60658N22;
                Map<String, String> mapStringToStringMap = messageDao_Impl2.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(i47) ? null : interfaceC33689cMo68212g1.mo5353J0(i47));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                iM60658N23 = i47;
                int i48 = iM60658N24;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(i48)) != 0;
                int i49 = iM60658N5;
                int i54 = iM60658N25;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(i54)) != 0;
                int i55 = iM60658N26;
                Map<String, Object> mapStringToMap3 = messageDao_Impl2.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i55) ? null : interfaceC33689cMo68212g1.mo5353J0(i55));
                if (mapStringToMap3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                int i56 = iM60658N27;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(i56) ? null : interfaceC33689cMo68212g1.mo5353J0(i56);
                iM60658N27 = i56;
                int i57 = iM60658N28;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(i57)) != 0;
                int i58 = iM60658N29;
                iM60658N29 = i58;
                Date dateFromTimestamp6 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i58) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i58)));
                int i59 = iM60658N30;
                iM60658N30 = i59;
                Date dateFromTimestamp7 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i59) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i59)));
                iM60658N31 = iM60658N31;
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(iM60658N31) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N31);
                int i64 = iM60658N32;
                iM60658N32 = i64;
                List<String> stringList3 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i64) ? null : interfaceC33689cMo68212g1.mo5353J0(i64));
                if (stringList3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i65 = iM60658N33;
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(i65)) != 0;
                int i66 = iM60658N34;
                boolean z17 = ((int) interfaceC33689cMo68212g1.getLong(i66)) != 0;
                int i67 = iM60658N35;
                ModerationDetailsEntity moderationDetailsEntityStringToModerationDetails = messageDao_Impl2.__moderationDetailsConverter.stringToModerationDetails(interfaceC33689cMo68212g1.isNull(i67) ? null : interfaceC33689cMo68212g1.mo5353J0(i67));
                int i68 = iM60658N36;
                iM60658N36 = i68;
                ModerationEntity moderationEntityStringToModeration = messageDao_Impl2.__moderationConverter.stringToModeration(interfaceC33689cMo68212g1.isNull(i68) ? null : interfaceC33689cMo68212g1.mo5353J0(i68));
                int i69 = iM60658N37;
                iM60658N37 = i69;
                Date dateFromTimestamp8 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i69) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i69)));
                iM60658N38 = iM60658N38;
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(iM60658N38) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N38);
                int i74 = iM60658N39;
                List<String> stringList4 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i74) ? null : interfaceC33689cMo68212g1.mo5353J0(i74));
                if (stringList4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i75 = iM60658N40;
                ReminderInfoEntity reminderInfoEntityStringToReminderInfo = messageDao_Impl2.__reminderInfoConverter.stringToReminderInfo(interfaceC33689cMo68212g1.isNull(i75) ? null : interfaceC33689cMo68212g1.mo5353J0(i75));
                int i76 = iM60658N41;
                iM60658N41 = i76;
                LocationEntity locationEntityStringToLocation = messageDao_Impl2.__locationConverter.stringToLocation(interfaceC33689cMo68212g1.isNull(i76) ? null : interfaceC33689cMo68212g1.mo5353J0(i76));
                int i77 = iM60658N42;
                String strMo5353J17 = interfaceC33689cMo68212g1.isNull(i77) ? null : interfaceC33689cMo68212g1.mo5353J0(i77);
                iM60658N42 = i77;
                iM60658N40 = i75;
                iM60658N43 = iM60658N43;
                boolean z18 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N43)) != 0;
                iM60658N44 = iM60658N44;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    iM60658N45 = iM60658N45;
                    if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                        i13 = iM60658N46;
                        if (interfaceC33689cMo68212g1.isNull(i13)) {
                            iM60658N43 = iM60658N43;
                            i14 = iM60658N47;
                            if (interfaceC33689cMo68212g1.isNull(i14)) {
                                i67 = i67;
                                i15 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(i15)) {
                                    iM60658N44 = iM60658N44;
                                    iM60658N45 = iM60658N45;
                                    channelInfoEntity = null;
                                } else {
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                        strMo5353J0 = null;
                                    } else {
                                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                        strMo5353J1 = null;
                                    } else {
                                        strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(i13)) {
                                        strMo5353J2 = null;
                                    } else {
                                        strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i13);
                                    }
                                    if (interfaceC33689cMo68212g1.isNull(i14)) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i14));
                                    }
                                    channelInfoEntity = new ChannelInfoEntity(strMo5353J0, strMo5353J1, strMo5353J2, numValueOf, interfaceC33689cMo68212g1.isNull(i15) ? null : interfaceC33689cMo68212g1.mo5353J0(i15));
                                }
                            } else {
                                i67 = i67;
                                i15 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                                }
                                if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                    strMo5353J1 = null;
                                } else {
                                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i13)) {
                                    strMo5353J2 = null;
                                } else {
                                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i13);
                                }
                                if (interfaceC33689cMo68212g1.isNull(i14)) {
                                    numValueOf = null;
                                } else {
                                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i14));
                                }
                                channelInfoEntity = new ChannelInfoEntity(strMo5353J0, strMo5353J1, strMo5353J2, numValueOf, interfaceC33689cMo68212g1.isNull(i15) ? null : interfaceC33689cMo68212g1.mo5353J0(i15));
                            }
                        } else {
                            iM60658N43 = iM60658N43;
                            i67 = i67;
                            i14 = iM60658N47;
                            i15 = iM60658N48;
                            if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                            }
                            if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                                strMo5353J1 = null;
                            } else {
                                strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i13)) {
                                strMo5353J2 = null;
                            } else {
                                strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i13);
                            }
                            if (interfaceC33689cMo68212g1.isNull(i14)) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i14));
                            }
                            channelInfoEntity = new ChannelInfoEntity(strMo5353J0, strMo5353J1, strMo5353J2, numValueOf, interfaceC33689cMo68212g1.isNull(i15) ? null : interfaceC33689cMo68212g1.mo5353J0(i15));
                        }
                    }
                    MessageInnerEntity messageInnerEntity = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i26, i34, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                    Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                    iM60658N46 = i13;
                    String str3 = str2;
                    AbstractC22676k.m65749i(objM73986U, str3);
                    C0022g c0022g4 = c0022g;
                    Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                    AbstractC22676k.m65749i(objM73986U2, str3);
                    iM60658N47 = i14;
                    Object objM73986U3 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                    AbstractC22676k.m65749i(objM73986U3, str3);
                    arrayList.add(new MessageEntity(messageInnerEntity, (List) objM73986U, (List) objM73986U2, (List) objM73986U3));
                    int i78 = i67;
                    iM60658N39 = i74;
                    iM60658N5 = i49;
                    iM60658N24 = i48;
                    iM60658N25 = i54;
                    iM60658N26 = i55;
                    iM60658N28 = i57;
                    iM60658N33 = i65;
                    iM60658N34 = i66;
                    iM60658N35 = i78;
                    messageDao_Impl2 = messageDao_Impl;
                    iM60658N2 = i25;
                    c0022g = c0022g4;
                    str2 = str3;
                    iM60658N3 = i29;
                    iM60658N48 = i15;
                    i24 = i28;
                    iM60658N4 = i27;
                    i19 = i35;
                    iM60658N16 = i45;
                } else {
                    iM60658N45 = iM60658N45;
                }
                i13 = iM60658N46;
                i14 = iM60658N47;
                i15 = iM60658N48;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
                }
                if (interfaceC33689cMo68212g1.isNull(iM60658N45)) {
                    strMo5353J1 = null;
                } else {
                    strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N45);
                }
                if (interfaceC33689cMo68212g1.isNull(i13)) {
                    strMo5353J2 = null;
                } else {
                    strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i13);
                }
                if (interfaceC33689cMo68212g1.isNull(i14)) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i14));
                }
                channelInfoEntity = new ChannelInfoEntity(strMo5353J0, strMo5353J1, strMo5353J2, numValueOf, interfaceC33689cMo68212g1.isNull(i15) ? null : interfaceC33689cMo68212g1.mo5353J0(i15));
                MessageInnerEntity messageInnerEntity2 = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i26, i34, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                Object objM73986U4 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                iM60658N46 = i13;
                String str4 = str2;
                AbstractC22676k.m65749i(objM73986U4, str4);
                C0022g c0022g5 = c0022g;
                Object objM73986U5 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                AbstractC22676k.m65749i(objM73986U5, str4);
                iM60658N47 = i14;
                Object objM73986U6 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                AbstractC22676k.m65749i(objM73986U6, str4);
                arrayList.add(new MessageEntity(messageInnerEntity2, (List) objM73986U4, (List) objM73986U5, (List) objM73986U6));
                int i79 = i67;
                iM60658N39 = i74;
                iM60658N5 = i49;
                iM60658N24 = i48;
                iM60658N25 = i54;
                iM60658N26 = i55;
                iM60658N28 = i57;
                iM60658N33 = i65;
                iM60658N34 = i66;
                iM60658N35 = i79;
                messageDao_Impl2 = messageDao_Impl;
                iM60658N2 = i25;
                c0022g = c0022g5;
                str2 = str4;
                iM60658N3 = i29;
                iM60658N48 = i15;
                i24 = i28;
                iM60658N4 = i27;
                i19 = i35;
                iM60658N16 = i45;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final DraftMessageEntity selectDraftMessageByCid$lambda$8(String str, String str2, MessageDao_Impl messageDao_Impl, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cid");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "text");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mentionedUsersIds");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyMessageId");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "args");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            DraftMessageEntity draftMessageEntity = null;
            String strMo5353J0 = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J4 = interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                List<String> stringList = messageDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N6)) != 0;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N7)) != 0;
                String strMo5353J5 = interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8);
                String strMo5353J6 = interfaceC33689cMo68212g1.isNull(iM60658N9) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N9);
                String strMo5353J7 = interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10);
                if (!interfaceC33689cMo68212g1.isNull(iM60658N11)) {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N11);
                }
                Map<String, Object> mapStringToMap = messageDao_Impl.__extraDataConverter.stringToMap(strMo5353J0);
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                draftMessageEntity = new DraftMessageEntity(strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, stringList, z4, z13, strMo5353J5, strMo5353J6, strMo5353J7, mapStringToMap);
            }
            interfaceC33689cMo68212g1.close();
            return draftMessageEntity;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final DraftMessageEntity selectDraftMessageByParentId$lambda$9(String str, String str2, MessageDao_Impl messageDao_Impl, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cid");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "text");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mentionedUsersIds");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyMessageId");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "args");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            DraftMessageEntity draftMessageEntity = null;
            String strMo5353J0 = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J4 = interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                List<String> stringList = messageDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N6)) != 0;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N7)) != 0;
                String strMo5353J5 = interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8);
                String strMo5353J6 = interfaceC33689cMo68212g1.isNull(iM60658N9) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N9);
                String strMo5353J7 = interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10);
                if (!interfaceC33689cMo68212g1.isNull(iM60658N11)) {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N11);
                }
                Map<String, Object> mapStringToMap = messageDao_Impl.__extraDataConverter.stringToMap(strMo5353J0);
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                draftMessageEntity = new DraftMessageEntity(strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, stringList, z4, z13, strMo5353J5, strMo5353J6, strMo5353J7, mapStringToMap);
            }
            interfaceC33689cMo68212g1.close();
            return draftMessageEntity;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    private static final List selectDraftMessages$lambda$7(String str, MessageDao_Impl messageDao_Impl, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "cid");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "text");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mentionedUsersIds");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyMessageId");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "args");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J3 = interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                List<String> stringList = messageDao_Impl.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                boolean z4 = true;
                if (((int) interfaceC33689cMo68212g1.getLong(iM60658N6)) == 0) {
                    z4 = false;
                }
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N7)) != 0;
                String strMo5353J4 = interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8);
                String strMo5353J5 = interfaceC33689cMo68212g1.isNull(iM60658N9) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N9);
                String strMo5353J6 = interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10);
                Map<String, Object> mapStringToMap = messageDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N11));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                arrayList.add(new DraftMessageEntity(strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, stringList, z4, z13, strMo5353J4, strMo5353J5, strMo5353J6, mapStringToMap));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    private static final List selectIdsBySyncStatus$lambda$21(String str, MessageDao_Impl messageDao_Impl, SyncStatus syncStatus, int i13, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5356p(1, messageDao_Impl.__syncStatusConverter.syncStatusToString(syncStatus));
            interfaceC33689cMo68212g1.mo5356p(2, i13);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(interfaceC33689cMo68212g1.mo5353J0(0));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:233:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:234:0x05b8 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0014, B:4:0x0197, B:6:0x019d, B:8:0x01a7, B:12:0x01b7, B:14:0x01c1, B:15:0x01c9, B:17:0x01d3, B:19:0x01df, B:20:0x01f2, B:22:0x01f8, B:27:0x024b, B:32:0x0267, B:37:0x0283, B:42:0x029f, B:47:0x02bb, B:52:0x02d3, B:56:0x02df, B:61:0x02f5, B:63:0x02fd, B:68:0x030f, B:72:0x031b, B:77:0x0331, B:79:0x0339, B:83:0x0348, B:85:0x0350, B:90:0x0364, B:95:0x037c, B:100:0x038b, B:105:0x039b, B:107:0x03a3, B:112:0x03b8, B:117:0x03c7, B:122:0x03d7, B:124:0x03df, B:129:0x03f7, B:134:0x0406, B:139:0x041a, B:144:0x0436, B:149:0x0450, B:154:0x0466, B:156:0x046e, B:161:0x0483, B:166:0x0492, B:171:0x04a2, B:176:0x04ba, B:181:0x04d6, B:186:0x04f0, B:191:0x0506, B:193:0x050e, B:197:0x051d, B:202:0x0535, B:207:0x0553, B:212:0x0562, B:214:0x0568, B:216:0x0570, B:218:0x0578, B:220:0x0582, B:231:0x05af, B:235:0x05be, B:239:0x05cd, B:243:0x05dc, B:247:0x05f8, B:251:0x0606, B:252:0x060d, B:250:0x0601, B:246:0x05e9, B:242:0x05d6, B:238:0x05c7, B:234:0x05b8, B:206:0x054c, B:201:0x0530, B:196:0x0519, B:253:0x0668, B:254:0x066d, B:190:0x04fd, B:185:0x04e9, B:180:0x04cd, B:175:0x04b5, B:170:0x049d, B:255:0x066e, B:256:0x0673, B:153:0x045d, B:148:0x0449, B:143:0x042d, B:138:0x0411, B:128:0x03f0, B:257:0x0674, B:258:0x067b, B:121:0x03d2, B:259:0x067c, B:260:0x0683, B:104:0x0396, B:94:0x0375, B:89:0x035d, B:261:0x0684, B:262:0x068b, B:82:0x0344, B:263:0x068c, B:264:0x0691, B:76:0x0328, B:265:0x0692, B:266:0x0697, B:67:0x030a, B:267:0x0698, B:268:0x069d, B:60:0x02ec, B:269:0x069e, B:270:0x06a3, B:51:0x02ce, B:46:0x02b2, B:41:0x0296, B:36:0x027a, B:31:0x025e, B:26:0x023e), top: B:275:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:238:0x05c7 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0014, B:4:0x0197, B:6:0x019d, B:8:0x01a7, B:12:0x01b7, B:14:0x01c1, B:15:0x01c9, B:17:0x01d3, B:19:0x01df, B:20:0x01f2, B:22:0x01f8, B:27:0x024b, B:32:0x0267, B:37:0x0283, B:42:0x029f, B:47:0x02bb, B:52:0x02d3, B:56:0x02df, B:61:0x02f5, B:63:0x02fd, B:68:0x030f, B:72:0x031b, B:77:0x0331, B:79:0x0339, B:83:0x0348, B:85:0x0350, B:90:0x0364, B:95:0x037c, B:100:0x038b, B:105:0x039b, B:107:0x03a3, B:112:0x03b8, B:117:0x03c7, B:122:0x03d7, B:124:0x03df, B:129:0x03f7, B:134:0x0406, B:139:0x041a, B:144:0x0436, B:149:0x0450, B:154:0x0466, B:156:0x046e, B:161:0x0483, B:166:0x0492, B:171:0x04a2, B:176:0x04ba, B:181:0x04d6, B:186:0x04f0, B:191:0x0506, B:193:0x050e, B:197:0x051d, B:202:0x0535, B:207:0x0553, B:212:0x0562, B:214:0x0568, B:216:0x0570, B:218:0x0578, B:220:0x0582, B:231:0x05af, B:235:0x05be, B:239:0x05cd, B:243:0x05dc, B:247:0x05f8, B:251:0x0606, B:252:0x060d, B:250:0x0601, B:246:0x05e9, B:242:0x05d6, B:238:0x05c7, B:234:0x05b8, B:206:0x054c, B:201:0x0530, B:196:0x0519, B:253:0x0668, B:254:0x066d, B:190:0x04fd, B:185:0x04e9, B:180:0x04cd, B:175:0x04b5, B:170:0x049d, B:255:0x066e, B:256:0x0673, B:153:0x045d, B:148:0x0449, B:143:0x042d, B:138:0x0411, B:128:0x03f0, B:257:0x0674, B:258:0x067b, B:121:0x03d2, B:259:0x067c, B:260:0x0683, B:104:0x0396, B:94:0x0375, B:89:0x035d, B:261:0x0684, B:262:0x068b, B:82:0x0344, B:263:0x068c, B:264:0x0691, B:76:0x0328, B:265:0x0692, B:266:0x0697, B:67:0x030a, B:267:0x0698, B:268:0x069d, B:60:0x02ec, B:269:0x069e, B:270:0x06a3, B:51:0x02ce, B:46:0x02b2, B:41:0x0296, B:36:0x027a, B:31:0x025e, B:26:0x023e), top: B:275:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:241:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:242:0x05d6 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0014, B:4:0x0197, B:6:0x019d, B:8:0x01a7, B:12:0x01b7, B:14:0x01c1, B:15:0x01c9, B:17:0x01d3, B:19:0x01df, B:20:0x01f2, B:22:0x01f8, B:27:0x024b, B:32:0x0267, B:37:0x0283, B:42:0x029f, B:47:0x02bb, B:52:0x02d3, B:56:0x02df, B:61:0x02f5, B:63:0x02fd, B:68:0x030f, B:72:0x031b, B:77:0x0331, B:79:0x0339, B:83:0x0348, B:85:0x0350, B:90:0x0364, B:95:0x037c, B:100:0x038b, B:105:0x039b, B:107:0x03a3, B:112:0x03b8, B:117:0x03c7, B:122:0x03d7, B:124:0x03df, B:129:0x03f7, B:134:0x0406, B:139:0x041a, B:144:0x0436, B:149:0x0450, B:154:0x0466, B:156:0x046e, B:161:0x0483, B:166:0x0492, B:171:0x04a2, B:176:0x04ba, B:181:0x04d6, B:186:0x04f0, B:191:0x0506, B:193:0x050e, B:197:0x051d, B:202:0x0535, B:207:0x0553, B:212:0x0562, B:214:0x0568, B:216:0x0570, B:218:0x0578, B:220:0x0582, B:231:0x05af, B:235:0x05be, B:239:0x05cd, B:243:0x05dc, B:247:0x05f8, B:251:0x0606, B:252:0x060d, B:250:0x0601, B:246:0x05e9, B:242:0x05d6, B:238:0x05c7, B:234:0x05b8, B:206:0x054c, B:201:0x0530, B:196:0x0519, B:253:0x0668, B:254:0x066d, B:190:0x04fd, B:185:0x04e9, B:180:0x04cd, B:175:0x04b5, B:170:0x049d, B:255:0x066e, B:256:0x0673, B:153:0x045d, B:148:0x0449, B:143:0x042d, B:138:0x0411, B:128:0x03f0, B:257:0x0674, B:258:0x067b, B:121:0x03d2, B:259:0x067c, B:260:0x0683, B:104:0x0396, B:94:0x0375, B:89:0x035d, B:261:0x0684, B:262:0x068b, B:82:0x0344, B:263:0x068c, B:264:0x0691, B:76:0x0328, B:265:0x0692, B:266:0x0697, B:67:0x030a, B:267:0x0698, B:268:0x069d, B:60:0x02ec, B:269:0x069e, B:270:0x06a3, B:51:0x02ce, B:46:0x02b2, B:41:0x0296, B:36:0x027a, B:31:0x025e, B:26:0x023e), top: B:275:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:246:0x05e9 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0014, B:4:0x0197, B:6:0x019d, B:8:0x01a7, B:12:0x01b7, B:14:0x01c1, B:15:0x01c9, B:17:0x01d3, B:19:0x01df, B:20:0x01f2, B:22:0x01f8, B:27:0x024b, B:32:0x0267, B:37:0x0283, B:42:0x029f, B:47:0x02bb, B:52:0x02d3, B:56:0x02df, B:61:0x02f5, B:63:0x02fd, B:68:0x030f, B:72:0x031b, B:77:0x0331, B:79:0x0339, B:83:0x0348, B:85:0x0350, B:90:0x0364, B:95:0x037c, B:100:0x038b, B:105:0x039b, B:107:0x03a3, B:112:0x03b8, B:117:0x03c7, B:122:0x03d7, B:124:0x03df, B:129:0x03f7, B:134:0x0406, B:139:0x041a, B:144:0x0436, B:149:0x0450, B:154:0x0466, B:156:0x046e, B:161:0x0483, B:166:0x0492, B:171:0x04a2, B:176:0x04ba, B:181:0x04d6, B:186:0x04f0, B:191:0x0506, B:193:0x050e, B:197:0x051d, B:202:0x0535, B:207:0x0553, B:212:0x0562, B:214:0x0568, B:216:0x0570, B:218:0x0578, B:220:0x0582, B:231:0x05af, B:235:0x05be, B:239:0x05cd, B:243:0x05dc, B:247:0x05f8, B:251:0x0606, B:252:0x060d, B:250:0x0601, B:246:0x05e9, B:242:0x05d6, B:238:0x05c7, B:234:0x05b8, B:206:0x054c, B:201:0x0530, B:196:0x0519, B:253:0x0668, B:254:0x066d, B:190:0x04fd, B:185:0x04e9, B:180:0x04cd, B:175:0x04b5, B:170:0x049d, B:255:0x066e, B:256:0x0673, B:153:0x045d, B:148:0x0449, B:143:0x042d, B:138:0x0411, B:128:0x03f0, B:257:0x0674, B:258:0x067b, B:121:0x03d2, B:259:0x067c, B:260:0x0683, B:104:0x0396, B:94:0x0375, B:89:0x035d, B:261:0x0684, B:262:0x068b, B:82:0x0344, B:263:0x068c, B:264:0x0691, B:76:0x0328, B:265:0x0692, B:266:0x0697, B:67:0x030a, B:267:0x0698, B:268:0x069d, B:60:0x02ec, B:269:0x069e, B:270:0x06a3, B:51:0x02ce, B:46:0x02b2, B:41:0x0296, B:36:0x027a, B:31:0x025e, B:26:0x023e), top: B:275:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x0601 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:3:0x0014, B:4:0x0197, B:6:0x019d, B:8:0x01a7, B:12:0x01b7, B:14:0x01c1, B:15:0x01c9, B:17:0x01d3, B:19:0x01df, B:20:0x01f2, B:22:0x01f8, B:27:0x024b, B:32:0x0267, B:37:0x0283, B:42:0x029f, B:47:0x02bb, B:52:0x02d3, B:56:0x02df, B:61:0x02f5, B:63:0x02fd, B:68:0x030f, B:72:0x031b, B:77:0x0331, B:79:0x0339, B:83:0x0348, B:85:0x0350, B:90:0x0364, B:95:0x037c, B:100:0x038b, B:105:0x039b, B:107:0x03a3, B:112:0x03b8, B:117:0x03c7, B:122:0x03d7, B:124:0x03df, B:129:0x03f7, B:134:0x0406, B:139:0x041a, B:144:0x0436, B:149:0x0450, B:154:0x0466, B:156:0x046e, B:161:0x0483, B:166:0x0492, B:171:0x04a2, B:176:0x04ba, B:181:0x04d6, B:186:0x04f0, B:191:0x0506, B:193:0x050e, B:197:0x051d, B:202:0x0535, B:207:0x0553, B:212:0x0562, B:214:0x0568, B:216:0x0570, B:218:0x0578, B:220:0x0582, B:231:0x05af, B:235:0x05be, B:239:0x05cd, B:243:0x05dc, B:247:0x05f8, B:251:0x0606, B:252:0x060d, B:250:0x0601, B:246:0x05e9, B:242:0x05d6, B:238:0x05c7, B:234:0x05b8, B:206:0x054c, B:201:0x0530, B:196:0x0519, B:253:0x0668, B:254:0x066d, B:190:0x04fd, B:185:0x04e9, B:180:0x04cd, B:175:0x04b5, B:170:0x049d, B:255:0x066e, B:256:0x0673, B:153:0x045d, B:148:0x0449, B:143:0x042d, B:138:0x0411, B:128:0x03f0, B:257:0x0674, B:258:0x067b, B:121:0x03d2, B:259:0x067c, B:260:0x0683, B:104:0x0396, B:94:0x0375, B:89:0x035d, B:261:0x0684, B:262:0x068b, B:82:0x0344, B:263:0x068c, B:264:0x0691, B:76:0x0328, B:265:0x0692, B:266:0x0697, B:67:0x030a, B:267:0x0698, B:268:0x069d, B:60:0x02ec, B:269:0x069e, B:270:0x06a3, B:51:0x02ce, B:46:0x02b2, B:41:0x0296, B:36:0x027a, B:31:0x025e, B:26:0x023e), top: B:275:0x0014 }] */
    private static final List selectMessagesWithPoll$lambda$22(String str, String str2, MessageDao_Impl messageDao_Impl, InterfaceC33687a _connection) throws Exception {
        int i13;
        int i14;
        int i15;
        int i16;
        ChannelInfoEntity channelInfoEntity;
        String strMo5353J0;
        String strMo5353J1;
        String strMo5353J2;
        Integer numValueOf;
        MessageDao_Impl messageDao_Impl2 = messageDao_Impl;
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
            String str3 = "getValue(...)";
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedLocallyAt");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedAt");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "remoteMentionedUserIds");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mentionedUsersId");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionCounts");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionScores");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "reactionGroups");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "parentId");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "command");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "shadowed");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "i18n");
            int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "showInChannel");
            int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.GROUP_KEY_SILENT);
            int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "replyToId");
            int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinned");
            int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedAt");
            int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinExpires");
            int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pinnedByUserId");
            int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "threadParticipantsIds");
            int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipPushNotification");
            int iM60658N34 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "skipEnrichUrl");
            int iM60658N35 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderationDetails");
            int iM60658N36 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "moderation");
            int iM60658N37 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageTextUpdatedAt");
            int iM60658N38 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pollId");
            int iM60658N39 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "restrictedVisibility");
            int iM60658N40 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, NotificationCompat.CATEGORY_REMINDER);
            int iM60658N41 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sharedLocation");
            int iM60658N42 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channelRole");
            int iM60658N43 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deletedForMe");
            int iM60658N44 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infocid");
            int iM60658N45 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoid");
            int iM60658N46 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infotype");
            int iM60658N47 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infomemberCount");
            int iM60658N48 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "channel_infoname");
            int i17 = iM60658N12;
            C0022g c0022g = new C0022g(0);
            int i18 = iM60658N11;
            C0022g c0022g2 = new C0022g(0);
            int i19 = iM60658N10;
            C0022g c0022g3 = new C0022g(0);
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g.containsKey(strMo5353J3)) {
                    c0022g.put(strMo5353J3, new ArrayList());
                }
                String strMo5353J4 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g2.containsKey(strMo5353J4)) {
                    c0022g2.put(strMo5353J4, new ArrayList());
                }
                String strMo5353J5 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                if (!c0022g3.containsKey(strMo5353J5)) {
                    c0022g3.put(strMo5353J5, new ArrayList());
                }
                iM60658N9 = iM60658N9;
            }
            int i24 = iM60658N9;
            interfaceC33689cMo68212g1.reset();
            messageDao_Impl2.m54706xafdba081(_connection, c0022g);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g2);
            messageDao_Impl2.m54708xab41a0ef(_connection, c0022g3);
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J6 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J7 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J8 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J9 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J10 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J11 = interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                int i25 = iM60658N2;
                int i26 = iM60658N3;
                SyncStatus syncStatusStringToSyncStatus = messageDao_Impl2.__syncStatusConverter.stringToSyncStatus((int) interfaceC33689cMo68212g1.getLong(iM60658N7));
                int i27 = (int) interfaceC33689cMo68212g1.getLong(iM60658N8);
                int i28 = iM60658N5;
                int i29 = i24;
                int i34 = iM60658N4;
                int i35 = (int) interfaceC33689cMo68212g1.getLong(i29);
                int i36 = i19;
                Date dateFromTimestamp = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i36) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i36)));
                int i37 = i18;
                i18 = i37;
                Date dateFromTimestamp2 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i37) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i37)));
                int i38 = i17;
                i17 = i38;
                Date dateFromTimestamp3 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i38) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i38)));
                int i39 = iM60658N13;
                iM60658N13 = i39;
                Date dateFromTimestamp4 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i39) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i39)));
                int i44 = iM60658N14;
                iM60658N14 = i44;
                Date dateFromTimestamp5 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i44) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i44)));
                int i45 = iM60658N15;
                iM60658N15 = i45;
                List<String> stringList = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i45) ? null : interfaceC33689cMo68212g1.mo5353J0(i45));
                if (stringList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i46 = iM60658N16;
                List<String> stringList2 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i46) ? null : interfaceC33689cMo68212g1.mo5353J0(i46));
                if (stringList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                int i47 = iM60658N17;
                iM60658N17 = i47;
                Map<String, Integer> mapStringToMap = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i47) ? null : interfaceC33689cMo68212g1.mo5353J0(i47));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                int i48 = iM60658N18;
                Map<String, Integer> mapStringToMap2 = messageDao_Impl2.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i48) ? null : interfaceC33689cMo68212g1.mo5353J0(i48));
                if (mapStringToMap2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                int i49 = iM60658N19;
                Map<String, ReactionGroupEntity> mapStringToReactionGroupEntityMap = messageDao_Impl2.__reactionGroupConverter.stringToReactionGroupEntityMap(interfaceC33689cMo68212g1.isNull(i49) ? null : interfaceC33689cMo68212g1.mo5353J0(i49));
                if (mapStringToReactionGroupEntityMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.ReactionGroupEntity>', but it was NULL.");
                }
                int i54 = iM60658N20;
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(i54) ? null : interfaceC33689cMo68212g1.mo5353J0(i54);
                int i55 = iM60658N21;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(i55) ? null : interfaceC33689cMo68212g1.mo5353J0(i55);
                iM60658N20 = i54;
                iM60658N19 = i49;
                iM60658N21 = i55;
                int i56 = iM60658N22;
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(i56)) != 0;
                int i57 = iM60658N23;
                iM60658N22 = i56;
                Map<String, String> mapStringToStringMap = messageDao_Impl2.__mapConverter.stringToStringMap(interfaceC33689cMo68212g1.isNull(i57) ? null : interfaceC33689cMo68212g1.mo5353J0(i57));
                if (mapStringToStringMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.String>', but it was NULL.");
                }
                iM60658N23 = i57;
                int i58 = iM60658N24;
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(i58)) != 0;
                int i59 = iM60658N25;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(i59)) != 0;
                int i64 = iM60658N26;
                iM60658N24 = i58;
                Map<String, Object> mapStringToMap3 = messageDao_Impl2.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i64) ? null : interfaceC33689cMo68212g1.mo5353J0(i64));
                if (mapStringToMap3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                int i65 = iM60658N27;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(i65) ? null : interfaceC33689cMo68212g1.mo5353J0(i65);
                iM60658N27 = i65;
                iM60658N25 = i59;
                int i66 = iM60658N28;
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(i66)) != 0;
                int i67 = iM60658N29;
                iM60658N29 = i67;
                Date dateFromTimestamp6 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i67) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i67)));
                int i68 = iM60658N30;
                iM60658N30 = i68;
                Date dateFromTimestamp7 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i68) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i68)));
                iM60658N31 = iM60658N31;
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(iM60658N31) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N31);
                int i69 = iM60658N32;
                iM60658N32 = i69;
                List<String> stringList3 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i69) ? null : interfaceC33689cMo68212g1.mo5353J0(i69));
                if (stringList3 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                iM60658N26 = i64;
                int i74 = iM60658N33;
                boolean z16 = ((int) interfaceC33689cMo68212g1.getLong(i74)) != 0;
                iM60658N28 = i66;
                int i75 = iM60658N34;
                boolean z17 = ((int) interfaceC33689cMo68212g1.getLong(i75)) != 0;
                int i76 = iM60658N35;
                iM60658N33 = i74;
                ModerationDetailsEntity moderationDetailsEntityStringToModerationDetails = messageDao_Impl2.__moderationDetailsConverter.stringToModerationDetails(interfaceC33689cMo68212g1.isNull(i76) ? null : interfaceC33689cMo68212g1.mo5353J0(i76));
                int i77 = iM60658N36;
                iM60658N36 = i77;
                ModerationEntity moderationEntityStringToModeration = messageDao_Impl2.__moderationConverter.stringToModeration(interfaceC33689cMo68212g1.isNull(i77) ? null : interfaceC33689cMo68212g1.mo5353J0(i77));
                int i78 = iM60658N37;
                iM60658N37 = i78;
                Date dateFromTimestamp8 = messageDao_Impl2.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(i78) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(i78)));
                iM60658N38 = iM60658N38;
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(iM60658N38) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N38);
                int i79 = iM60658N39;
                iM60658N34 = i75;
                List<String> stringList4 = messageDao_Impl2.__listConverter.toStringList(interfaceC33689cMo68212g1.isNull(i79) ? null : interfaceC33689cMo68212g1.mo5353J0(i79));
                if (stringList4 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                }
                iM60658N40 = iM60658N40;
                ReminderInfoEntity reminderInfoEntityStringToReminderInfo = messageDao_Impl2.__reminderInfoConverter.stringToReminderInfo(interfaceC33689cMo68212g1.isNull(iM60658N40) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N40));
                int i83 = iM60658N41;
                iM60658N41 = i83;
                LocationEntity locationEntityStringToLocation = messageDao_Impl2.__locationConverter.stringToLocation(interfaceC33689cMo68212g1.isNull(i83) ? null : interfaceC33689cMo68212g1.mo5353J0(i83));
                iM60658N42 = iM60658N42;
                String strMo5353J17 = interfaceC33689cMo68212g1.isNull(iM60658N42) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N42);
                iM60658N35 = i76;
                iM60658N39 = i79;
                iM60658N43 = iM60658N43;
                boolean z18 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N43)) != 0;
                iM60658N44 = iM60658N44;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    i13 = iM60658N45;
                    if (interfaceC33689cMo68212g1.isNull(i13)) {
                        i14 = iM60658N46;
                        if (interfaceC33689cMo68212g1.isNull(i14)) {
                            iM60658N42 = iM60658N42;
                            i15 = iM60658N47;
                            if (interfaceC33689cMo68212g1.isNull(i15)) {
                                iM60658N40 = iM60658N40;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(i16)) {
                                    iM60658N43 = iM60658N43;
                                    iM60658N44 = iM60658N44;
                                    channelInfoEntity = null;
                                } else {
                                    if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                        strMo5353J0 = null;
                                    } else {
                                        strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
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
                                }
                            } else {
                                iM60658N40 = iM60658N40;
                                i16 = iM60658N48;
                                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                    strMo5353J0 = null;
                                } else {
                                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
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
                            }
                        } else {
                            iM60658N42 = iM60658N42;
                            iM60658N40 = iM60658N40;
                            i15 = iM60658N47;
                            i16 = iM60658N48;
                            if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                                strMo5353J0 = null;
                            } else {
                                strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
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
                        }
                    }
                    MessageInnerEntity messageInnerEntity = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i27, i35, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                    Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                    iM60658N46 = i14;
                    String str4 = str3;
                    AbstractC22676k.m65749i(objM73986U, str4);
                    C0022g c0022g4 = c0022g;
                    Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                    AbstractC22676k.m65749i(objM73986U2, str4);
                    iM60658N47 = i15;
                    Object objM73986U3 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                    AbstractC22676k.m65749i(objM73986U3, str4);
                    arrayList.add(new MessageEntity(messageInnerEntity, (List) objM73986U, (List) objM73986U2, (List) objM73986U3));
                    messageDao_Impl2 = messageDao_Impl;
                    iM60658N48 = i16;
                    iM60658N3 = i26;
                    c0022g = c0022g4;
                    str3 = str4;
                    iM60658N4 = i34;
                    iM60658N2 = i25;
                    iM60658N45 = i13;
                    i24 = i29;
                    iM60658N16 = i46;
                    iM60658N5 = i28;
                    i19 = i36;
                    iM60658N18 = i48;
                } else {
                    i13 = iM60658N45;
                }
                i14 = iM60658N46;
                i15 = iM60658N47;
                i16 = iM60658N48;
                if (interfaceC33689cMo68212g1.isNull(iM60658N44)) {
                    strMo5353J0 = null;
                } else {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N44);
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
                MessageInnerEntity messageInnerEntity2 = new MessageInnerEntity(strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, strMo5353J10, strMo5353J11, syncStatusStringToSyncStatus, i27, i35, dateFromTimestamp, dateFromTimestamp2, dateFromTimestamp3, dateFromTimestamp4, dateFromTimestamp5, stringList, stringList2, mapStringToMap, mapStringToMap2, mapStringToReactionGroupEntityMap, strMo5353J12, strMo5353J13, z4, mapStringToStringMap, z13, channelInfoEntity, z14, mapStringToMap3, strMo5353J14, z15, dateFromTimestamp6, dateFromTimestamp7, strMo5353J15, stringList3, z16, z17, moderationDetailsEntityStringToModerationDetails, moderationEntityStringToModeration, dateFromTimestamp8, strMo5353J16, stringList4, reminderInfoEntityStringToReminderInfo, locationEntityStringToLocation, strMo5353J17, z18);
                Object objM73986U4 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g);
                iM60658N46 = i14;
                String str5 = str3;
                AbstractC22676k.m65749i(objM73986U4, str5);
                C0022g c0022g5 = c0022g;
                Object objM73986U5 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g2);
                AbstractC22676k.m65749i(objM73986U5, str5);
                iM60658N47 = i15;
                Object objM73986U6 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60658N), c0022g3);
                AbstractC22676k.m65749i(objM73986U6, str5);
                arrayList.add(new MessageEntity(messageInnerEntity2, (List) objM73986U4, (List) objM73986U5, (List) objM73986U6));
                messageDao_Impl2 = messageDao_Impl;
                iM60658N48 = i16;
                iM60658N3 = i26;
                c0022g = c0022g5;
                str3 = str5;
                iM60658N4 = i34;
                iM60658N2 = i25;
                iM60658N45 = i13;
                i24 = i29;
                iM60658N16 = i46;
                iM60658N5 = i28;
                i19 = i36;
                iM60658N18 = i48;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ ArrayList m54730u(String str, int i13, MessageDao_Impl messageDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) messagesForChannel$lambda$14("SELECT * from stream_chat_message WHERE cid = ? ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END DESC LIMIT ?", str, i13, messageDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 updateMessageInnerEntity$lambda$5(MessageDao_Impl messageDao_Impl, MessageInnerEntity messageInnerEntity, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        messageDao_Impl.__updateAdapterOfMessageInnerEntity.handle(_connection, messageInnerEntity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ ArrayList m54734y(MessageDao_Impl messageDao_Impl, SyncStatus syncStatus, int i13, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) selectIdsBySyncStatus$lambda$21("SELECT id FROM stream_chat_message WHERE syncStatus = ? ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END ASC LIMIT ?", messageDao_Impl, syncStatus, i13, interfaceC33687a);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19031a(10), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object deleteAllDrafts(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19031a(11), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final void deleteAttachments(List<String> messageIds) {
        AbstractC22676k.m65750j(messageIds, "messageIds");
        AbstractC15751g.m44432L(this.__db, false, true, new C19214c(this, messageIds, 3));
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final void deleteAttachmentsChunked(List<String> messageIds) {
        AbstractC22676k.m65750j(messageIds, "messageIds");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("DELETE FROM attachment_inner_entity WHERE messageId in (");
        AbstractC29125c.m88533j(messageIds.size(), sb4);
        sb4.append(")");
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        AbstractC15751g.m44432L(this.__db, false, true, new C19212a(1, string, messageIds));
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object deleteChannelMessagesBefore(String str, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C18468h(str, this, date, 11), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object deleteDraftMessage(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C17632d(str, 5), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object deleteMessage(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C0175b(str, str2, 4), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object deleteMessages(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C17632d(str, 6), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object insert(List<MessageEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44433M = AbstractC15751g.m44433M(this.__db, new C191942(list, null), interfaceC30057d);
        return objM44433M == EnumC31071a.f128113w ? objM44433M : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object insertAttachments(List<AttachmentEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19214c(this, list, 0), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object insertDraftMessages(DraftMessageEntity draftMessageEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C16574h(24, this, draftMessageEntity), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object insertMessageInnerEntities(List<MessageInnerEntity> list, InterfaceC30057d<? super List<Long>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C19214c(this, list, 1), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object insertMessageInnerEntity(MessageInnerEntity messageInnerEntity, InterfaceC30057d<? super Long> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C19216e(this, messageInnerEntity, 1), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object insertReactions(List<ReactionEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19214c(this, list, 2), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object messagesForChannel(String str, int i13, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, true, new C19213b(str, i13, this, 1), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object messagesForChannelEqualOrNewerThan(String str, int i13, Date date, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, true, new C19217f(str, this, date, i13, 0), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object messagesForChannelEqualOrOlderThan(String str, int i13, Date date, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, true, new C19217f(str, this, date, i13, 2), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object messagesForChannelNewerThan(String str, int i13, Date date, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, true, new C19217f(str, this, date, i13, 3), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object messagesForChannelOlderThan(String str, int i13, Date date, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, true, new C19217f(str, this, date, i13, 1), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object messagesForThread(String str, int i13, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, true, new C19213b(str, i13, this, 0), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object select(List<String> list, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        return AbstractC15751g.m44433M(this.__db, new C191962(list, null), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object selectByCidAndUserId(String str, String str2, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C18468h(str, str2, this, 10), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object selectBySyncStatus(SyncStatus syncStatus, int i13, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, true, new C19215d(this, syncStatus, i13, 0), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object selectBySyncStatusOrTypeForChannel(String str, List<Integer> list, List<String> list2, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("SELECT * FROM stream_chat_message WHERE cid = ? AND (syncStatus IN (");
        int size = list.size();
        AbstractC29125c.m88533j(size, sbM53374o);
        sbM53374o.append(") OR type IN (");
        AbstractC29125c.m88533j(list2.size(), sbM53374o);
        sbM53374o.append(")) ORDER BY CASE WHEN createdAt IS NULL THEN createdLocallyAt ELSE createdAt END ASC");
        String string = sbM53374o.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return AbstractC15751g.m44434N(this.__db, true, true, new C18709z0(string, str, list, size, list2, this), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object selectByUserId(String str, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C19218g(str, this, 3), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object selectChunked(List<String> list, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("SELECT * FROM stream_chat_message WHERE id IN (");
        AbstractC29125c.m88533j(list.size(), sbM53374o);
        sbM53374o.append(")");
        String string = sbM53374o.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return AbstractC15751g.m44434N(this.__db, true, true, new C18468h(string, list, this, 9), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object selectDraftMessageByCid(String str, InterfaceC30057d<? super DraftMessageEntity> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C19218g(str, this, 0), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object selectDraftMessageByParentId(String str, InterfaceC30057d<? super DraftMessageEntity> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C19218g(str, this, 4), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object selectDraftMessages(InterfaceC30057d<? super List<DraftMessageEntity>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C17095c(this, 16), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object selectIdsBySyncStatus(SyncStatus syncStatus, int i13, InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C19215d(this, syncStatus, i13, 1), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object selectMessagesWithPoll(String str, InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C19218g(str, this, 1), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object selectWaitForAttachments(InterfaceC30057d<? super List<MessageEntity>> interfaceC30057d) {
        return AbstractC15751g.m44433M(this.__db, new C191972(null), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final void updateMessageInnerEntity(MessageInnerEntity messageInnerEntity) {
        AbstractC22676k.m65750j(messageInnerEntity, "messageInnerEntity");
        AbstractC15751g.m44432L(this.__db, false, true, new C19216e(this, messageInnerEntity, 0));
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object upsertMessageInnerEntities(List<MessageInnerEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44433M = AbstractC15751g.m44433M(this.__db, new C191982(list, null), interfaceC30057d);
        return objM44433M == EnumC31071a.f128113w ? objM44433M : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object upsertMessageInnerEntity(MessageInnerEntity messageInnerEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44433M = AbstractC15751g.m44433M(this.__db, new C191992(messageInnerEntity, null), interfaceC30057d);
        return objM44433M == EnumC31071a.f128113w ? objM44433M : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object deleteMessages(List<String> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("DELETE from stream_chat_message WHERE id IN (");
        AbstractC29125c.m88533j(list.size(), sbM53374o);
        sbM53374o.append(")");
        String string = sbM53374o.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C19212a(0, string, list), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object insert(MessageEntity messageEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44433M = AbstractC15751g.m44433M(this.__db, new C191954(messageEntity, null), interfaceC30057d);
        return objM44433M == EnumC31071a.f128113w ? objM44433M : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao
    public final Object select(String str, InterfaceC30057d<? super MessageEntity> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, true, new C19218g(str, this, 2), interfaceC30057d);
    }

    public static final Object access$insert$s302716459(MessageDao_Impl messageDao_Impl, List list, InterfaceC30057d interfaceC30057d) {
        messageDao_Impl.getClass();
        return MessageDao.insert$suspendImpl(messageDao_Impl, (List<MessageEntity>) list, (InterfaceC30057d<? super C23454a0>) interfaceC30057d);
    }
}
