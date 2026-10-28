package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.channelinfo.internal.ChannelInfoEntity;
import io.getstream.chat.android.models.SyncStatus;
import java.util.Date;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bY\b\u0081\b\u0018\u00002\u00020\u0001B©\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u001a\u0012\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001c\u0012\u0006\u0010\"\u001a\u00020\u001a\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b/\u00100J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\nHÆ\u0003J\t\u0010e\u001a\u00020\fHÆ\u0003J\t\u0010f\u001a\u00020\fHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015HÆ\u0003J\u000f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u001aHÆ\u0003J\u0015\u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001cHÆ\u0003J\t\u0010r\u001a\u00020\u001aHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\t\u0010t\u001a\u00020\u001aHÆ\u0003J\u0015\u0010u\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001cHÆ\u0003J\t\u0010v\u001a\u00020\u001aHÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010(HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010-HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¸\u0003\u0010\u0081\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u001a2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001a2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0015\u0010\u0082\u0001\u001a\u00020\u001a2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0084\u0001\u001a\u00020\fHÖ\u0001J\n\u0010\u0085\u0001\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u00102R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00102R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010>R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bA\u0010>R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bB\u0010>R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\b\n\u0000\u001a\u0004\bE\u0010DR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u00102R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\u001d\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\bL\u0010IR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010 \u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\bO\u0010IR\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bP\u0010KR\u0011\u0010\"\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010IR\u0013\u0010#\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bR\u0010>R\u0013\u0010$\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bS\u0010>R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u00102R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\b\n\u0000\u001a\u0004\bU\u0010DR\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0013\u0010)\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bX\u0010>R\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u00102R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010DR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0013\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u00102¨\u0006\u0086\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;", "", "id", "", "cid", "userId", "text", "html", "type", "syncStatus", "Lio/getstream/chat/android/models/SyncStatus;", "replyCount", "", "deletedReplyCount", "createdAt", "Ljava/util/Date;", "createdLocallyAt", "updatedAt", "updatedLocallyAt", "deletedAt", "remoteMentionedUserIds", "", "mentionedUsersId", "parentId", "command", "shadowed", "", "i18n", "", "showInChannel", "channelInfo", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;", NotificationCompat.GROUP_KEY_SILENT, "extraData", "pinned", "pinnedAt", "pinExpires", "pinnedByUserId", "threadParticipantsIds", "moderationDetails", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;", "messageTextUpdatedAt", "pollId", "restrictedVisibility", NotificationCompat.CATEGORY_REMINDER, "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;", "channelRole", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCid", "getUserId", "getText", "getHtml", "getType", "getSyncStatus", "()Lio/getstream/chat/android/models/SyncStatus;", "getReplyCount", "()I", "getDeletedReplyCount", "getCreatedAt", "()Ljava/util/Date;", "getCreatedLocallyAt", "getUpdatedAt", "getUpdatedLocallyAt", "getDeletedAt", "getRemoteMentionedUserIds", "()Ljava/util/List;", "getMentionedUsersId", "getParentId", "getCommand", "getShadowed", "()Z", "getI18n", "()Ljava/util/Map;", "getShowInChannel", "getChannelInfo", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;", "getSilent", "getExtraData", "getPinned", "getPinnedAt", "getPinExpires", "getPinnedByUserId", "getThreadParticipantsIds", "getModerationDetails", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;", "getMessageTextUpdatedAt", "getPollId", "getRestrictedVisibility", "getReminder", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;", "getChannelRole", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ReplyMessageInnerEntity {
    private final ChannelInfoEntity channelInfo;
    private final String channelRole;
    private final String cid;
    private final String command;
    private final Date createdAt;
    private final Date createdLocallyAt;
    private final Date deletedAt;
    private final int deletedReplyCount;
    private final Map<String, Object> extraData;
    private final String html;
    private final Map<String, String> i18n;
    private final String id;
    private final List<String> mentionedUsersId;
    private final Date messageTextUpdatedAt;
    private final ModerationDetailsEntity moderationDetails;
    private final String parentId;
    private final Date pinExpires;
    private final boolean pinned;
    private final Date pinnedAt;
    private final String pinnedByUserId;
    private final String pollId;
    private final ReminderInfoEntity reminder;
    private final List<String> remoteMentionedUserIds;
    private final int replyCount;
    private final List<String> restrictedVisibility;
    private final boolean shadowed;
    private final boolean showInChannel;
    private final boolean silent;
    private final SyncStatus syncStatus;
    private final String text;
    private final List<String> threadParticipantsIds;
    private final String type;
    private final Date updatedAt;
    private final Date updatedLocallyAt;
    private final String userId;

    public ReplyMessageInnerEntity(String id4, String cid, String userId, String text, String html, String type, SyncStatus syncStatus, int i13, int i14, Date date, Date date2, Date date3, Date date4, Date date5, List<String> remoteMentionedUserIds, List<String> mentionedUsersId, String str, String str2, boolean z4, Map<String, String> i18n, boolean z13, ChannelInfoEntity channelInfoEntity, boolean z14, Map<String, ? extends Object> extraData, boolean z15, Date date6, Date date7, String str3, List<String> threadParticipantsIds, ModerationDetailsEntity moderationDetailsEntity, Date date8, String str4, List<String> restrictedVisibility, ReminderInfoEntity reminderInfoEntity, String str5) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(html, "html");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(syncStatus, "syncStatus");
        AbstractC22676k.m65750j(remoteMentionedUserIds, "remoteMentionedUserIds");
        AbstractC22676k.m65750j(mentionedUsersId, "mentionedUsersId");
        AbstractC22676k.m65750j(i18n, "i18n");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(threadParticipantsIds, "threadParticipantsIds");
        AbstractC22676k.m65750j(restrictedVisibility, "restrictedVisibility");
        this.id = id4;
        this.cid = cid;
        this.userId = userId;
        this.text = text;
        this.html = html;
        this.type = type;
        this.syncStatus = syncStatus;
        this.replyCount = i13;
        this.deletedReplyCount = i14;
        this.createdAt = date;
        this.createdLocallyAt = date2;
        this.updatedAt = date3;
        this.updatedLocallyAt = date4;
        this.deletedAt = date5;
        this.remoteMentionedUserIds = remoteMentionedUserIds;
        this.mentionedUsersId = mentionedUsersId;
        this.parentId = str;
        this.command = str2;
        this.shadowed = z4;
        this.i18n = i18n;
        this.showInChannel = z13;
        this.channelInfo = channelInfoEntity;
        this.silent = z14;
        this.extraData = extraData;
        this.pinned = z15;
        this.pinnedAt = date6;
        this.pinExpires = date7;
        this.pinnedByUserId = str3;
        this.threadParticipantsIds = threadParticipantsIds;
        this.moderationDetails = moderationDetailsEntity;
        this.messageTextUpdatedAt = date8;
        this.pollId = str4;
        this.restrictedVisibility = restrictedVisibility;
        this.reminder = reminderInfoEntity;
        this.channelRole = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReplyMessageInnerEntity copy$default(ReplyMessageInnerEntity replyMessageInnerEntity, String str, String str2, String str3, String str4, String str5, String str6, SyncStatus syncStatus, int i13, int i14, Date date, Date date2, Date date3, Date date4, Date date5, List list, List list2, String str7, String str8, boolean z4, Map map, boolean z13, ChannelInfoEntity channelInfoEntity, boolean z14, Map map2, boolean z15, Date date6, Date date7, String str9, List list3, ModerationDetailsEntity moderationDetailsEntity, Date date8, String str10, List list4, ReminderInfoEntity reminderInfoEntity, String str11, int i15, int i16, Object obj) {
        String str12;
        ReminderInfoEntity reminderInfoEntity2;
        String str13 = (i15 & 1) != 0 ? replyMessageInnerEntity.id : str;
        String str14 = (i15 & 2) != 0 ? replyMessageInnerEntity.cid : str2;
        String str15 = (i15 & 4) != 0 ? replyMessageInnerEntity.userId : str3;
        String str16 = (i15 & 8) != 0 ? replyMessageInnerEntity.text : str4;
        String str17 = (i15 & 16) != 0 ? replyMessageInnerEntity.html : str5;
        String str18 = (i15 & 32) != 0 ? replyMessageInnerEntity.type : str6;
        SyncStatus syncStatus2 = (i15 & 64) != 0 ? replyMessageInnerEntity.syncStatus : syncStatus;
        int i17 = (i15 & 128) != 0 ? replyMessageInnerEntity.replyCount : i13;
        int i18 = (i15 & 256) != 0 ? replyMessageInnerEntity.deletedReplyCount : i14;
        Date date9 = (i15 & 512) != 0 ? replyMessageInnerEntity.createdAt : date;
        Date date10 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? replyMessageInnerEntity.createdLocallyAt : date2;
        Date date11 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? replyMessageInnerEntity.updatedAt : date3;
        Date date12 = (i15 & 4096) != 0 ? replyMessageInnerEntity.updatedLocallyAt : date4;
        Date date13 = (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? replyMessageInnerEntity.deletedAt : date5;
        String str19 = str13;
        List list5 = (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? replyMessageInnerEntity.remoteMentionedUserIds : list;
        List list6 = (i15 & 32768) != 0 ? replyMessageInnerEntity.mentionedUsersId : list2;
        String str20 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? replyMessageInnerEntity.parentId : str7;
        String str21 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? replyMessageInnerEntity.command : str8;
        boolean z16 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? replyMessageInnerEntity.shadowed : z4;
        Map map3 = (i15 & 524288) != 0 ? replyMessageInnerEntity.i18n : map;
        boolean z17 = (i15 & 1048576) != 0 ? replyMessageInnerEntity.showInChannel : z13;
        ChannelInfoEntity channelInfoEntity2 = (i15 & 2097152) != 0 ? replyMessageInnerEntity.channelInfo : channelInfoEntity;
        boolean z18 = (i15 & 4194304) != 0 ? replyMessageInnerEntity.silent : z14;
        Map map4 = (i15 & 8388608) != 0 ? replyMessageInnerEntity.extraData : map2;
        boolean z19 = (i15 & 16777216) != 0 ? replyMessageInnerEntity.pinned : z15;
        Date date14 = (i15 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? replyMessageInnerEntity.pinnedAt : date6;
        Date date15 = (i15 & 67108864) != 0 ? replyMessageInnerEntity.pinExpires : date7;
        String str22 = (i15 & 134217728) != 0 ? replyMessageInnerEntity.pinnedByUserId : str9;
        List list7 = (i15 & 268435456) != 0 ? replyMessageInnerEntity.threadParticipantsIds : list3;
        ModerationDetailsEntity moderationDetailsEntity2 = (i15 & 536870912) != 0 ? replyMessageInnerEntity.moderationDetails : moderationDetailsEntity;
        Date date16 = (i15 & 1073741824) != 0 ? replyMessageInnerEntity.messageTextUpdatedAt : date8;
        String str23 = (i15 & Integer.MIN_VALUE) != 0 ? replyMessageInnerEntity.pollId : str10;
        List list8 = (i16 & 1) != 0 ? replyMessageInnerEntity.restrictedVisibility : list4;
        ReminderInfoEntity reminderInfoEntity3 = (i16 & 2) != 0 ? replyMessageInnerEntity.reminder : reminderInfoEntity;
        if ((i16 & 4) != 0) {
            reminderInfoEntity2 = reminderInfoEntity3;
            str12 = replyMessageInnerEntity.channelRole;
        } else {
            str12 = str11;
            reminderInfoEntity2 = reminderInfoEntity3;
        }
        return replyMessageInnerEntity.copy(str19, str14, str15, str16, str17, str18, syncStatus2, i17, i18, date9, date10, date11, date12, date13, list5, list6, str20, str21, z16, map3, z17, channelInfoEntity2, z18, map4, z19, date14, date15, str22, list7, moderationDetailsEntity2, date16, str23, list8, reminderInfoEntity2, str12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Date getCreatedLocallyAt() {
        return this.createdLocallyAt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Date getUpdatedLocallyAt() {
        return this.updatedLocallyAt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final List<String> component15() {
        return this.remoteMentionedUserIds;
    }

    public final List<String> component16() {
        return this.mentionedUsersId;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getShadowed() {
        return this.shadowed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    public final Map<String, String> component20() {
        return this.i18n;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final boolean getShowInChannel() {
        return this.showInChannel;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final ChannelInfoEntity getChannelInfo() {
        return this.channelInfo;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getSilent() {
        return this.silent;
    }

    public final Map<String, Object> component24() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getPinned() {
        return this.pinned;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Date getPinnedAt() {
        return this.pinnedAt;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Date getPinExpires() {
        return this.pinExpires;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getPinnedByUserId() {
        return this.pinnedByUserId;
    }

    public final List<String> component29() {
        return this.threadParticipantsIds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final ModerationDetailsEntity getModerationDetails() {
        return this.moderationDetails;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Date getMessageTextUpdatedAt() {
        return this.messageTextUpdatedAt;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getPollId() {
        return this.pollId;
    }

    public final List<String> component33() {
        return this.restrictedVisibility;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final ReminderInfoEntity getReminder() {
        return this.reminder;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getChannelRole() {
        return this.channelRole;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getReplyCount() {
        return this.replyCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getDeletedReplyCount() {
        return this.deletedReplyCount;
    }

    public final ReplyMessageInnerEntity copy(String id4, String cid, String userId, String text, String html, String type, SyncStatus syncStatus, int replyCount, int deletedReplyCount, Date createdAt, Date createdLocallyAt, Date updatedAt, Date updatedLocallyAt, Date deletedAt, List<String> remoteMentionedUserIds, List<String> mentionedUsersId, String parentId, String command, boolean shadowed, Map<String, String> i18n, boolean showInChannel, ChannelInfoEntity channelInfo, boolean silent, Map<String, ? extends Object> extraData, boolean pinned, Date pinnedAt, Date pinExpires, String pinnedByUserId, List<String> threadParticipantsIds, ModerationDetailsEntity moderationDetails, Date messageTextUpdatedAt, String pollId, List<String> restrictedVisibility, ReminderInfoEntity reminder, String channelRole) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(html, "html");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(syncStatus, "syncStatus");
        AbstractC22676k.m65750j(remoteMentionedUserIds, "remoteMentionedUserIds");
        AbstractC22676k.m65750j(mentionedUsersId, "mentionedUsersId");
        AbstractC22676k.m65750j(i18n, "i18n");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(threadParticipantsIds, "threadParticipantsIds");
        AbstractC22676k.m65750j(restrictedVisibility, "restrictedVisibility");
        return new ReplyMessageInnerEntity(id4, cid, userId, text, html, type, syncStatus, replyCount, deletedReplyCount, createdAt, createdLocallyAt, updatedAt, updatedLocallyAt, deletedAt, remoteMentionedUserIds, mentionedUsersId, parentId, command, shadowed, i18n, showInChannel, channelInfo, silent, extraData, pinned, pinnedAt, pinExpires, pinnedByUserId, threadParticipantsIds, moderationDetails, messageTextUpdatedAt, pollId, restrictedVisibility, reminder, channelRole);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplyMessageInnerEntity)) {
            return false;
        }
        ReplyMessageInnerEntity replyMessageInnerEntity = (ReplyMessageInnerEntity) other;
        return AbstractC22676k.m65745e(this.id, replyMessageInnerEntity.id) && AbstractC22676k.m65745e(this.cid, replyMessageInnerEntity.cid) && AbstractC22676k.m65745e(this.userId, replyMessageInnerEntity.userId) && AbstractC22676k.m65745e(this.text, replyMessageInnerEntity.text) && AbstractC22676k.m65745e(this.html, replyMessageInnerEntity.html) && AbstractC22676k.m65745e(this.type, replyMessageInnerEntity.type) && this.syncStatus == replyMessageInnerEntity.syncStatus && this.replyCount == replyMessageInnerEntity.replyCount && this.deletedReplyCount == replyMessageInnerEntity.deletedReplyCount && AbstractC22676k.m65745e(this.createdAt, replyMessageInnerEntity.createdAt) && AbstractC22676k.m65745e(this.createdLocallyAt, replyMessageInnerEntity.createdLocallyAt) && AbstractC22676k.m65745e(this.updatedAt, replyMessageInnerEntity.updatedAt) && AbstractC22676k.m65745e(this.updatedLocallyAt, replyMessageInnerEntity.updatedLocallyAt) && AbstractC22676k.m65745e(this.deletedAt, replyMessageInnerEntity.deletedAt) && AbstractC22676k.m65745e(this.remoteMentionedUserIds, replyMessageInnerEntity.remoteMentionedUserIds) && AbstractC22676k.m65745e(this.mentionedUsersId, replyMessageInnerEntity.mentionedUsersId) && AbstractC22676k.m65745e(this.parentId, replyMessageInnerEntity.parentId) && AbstractC22676k.m65745e(this.command, replyMessageInnerEntity.command) && this.shadowed == replyMessageInnerEntity.shadowed && AbstractC22676k.m65745e(this.i18n, replyMessageInnerEntity.i18n) && this.showInChannel == replyMessageInnerEntity.showInChannel && AbstractC22676k.m65745e(this.channelInfo, replyMessageInnerEntity.channelInfo) && this.silent == replyMessageInnerEntity.silent && AbstractC22676k.m65745e(this.extraData, replyMessageInnerEntity.extraData) && this.pinned == replyMessageInnerEntity.pinned && AbstractC22676k.m65745e(this.pinnedAt, replyMessageInnerEntity.pinnedAt) && AbstractC22676k.m65745e(this.pinExpires, replyMessageInnerEntity.pinExpires) && AbstractC22676k.m65745e(this.pinnedByUserId, replyMessageInnerEntity.pinnedByUserId) && AbstractC22676k.m65745e(this.threadParticipantsIds, replyMessageInnerEntity.threadParticipantsIds) && AbstractC22676k.m65745e(this.moderationDetails, replyMessageInnerEntity.moderationDetails) && AbstractC22676k.m65745e(this.messageTextUpdatedAt, replyMessageInnerEntity.messageTextUpdatedAt) && AbstractC22676k.m65745e(this.pollId, replyMessageInnerEntity.pollId) && AbstractC22676k.m65745e(this.restrictedVisibility, replyMessageInnerEntity.restrictedVisibility) && AbstractC22676k.m65745e(this.reminder, replyMessageInnerEntity.reminder) && AbstractC22676k.m65745e(this.channelRole, replyMessageInnerEntity.channelRole);
    }

    public final ChannelInfoEntity getChannelInfo() {
        return this.channelInfo;
    }

    public final String getChannelRole() {
        return this.channelRole;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getCommand() {
        return this.command;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getCreatedLocallyAt() {
        return this.createdLocallyAt;
    }

    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final int getDeletedReplyCount() {
        return this.deletedReplyCount;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getHtml() {
        return this.html;
    }

    public final Map<String, String> getI18n() {
        return this.i18n;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getMentionedUsersId() {
        return this.mentionedUsersId;
    }

    public final Date getMessageTextUpdatedAt() {
        return this.messageTextUpdatedAt;
    }

    public final ModerationDetailsEntity getModerationDetails() {
        return this.moderationDetails;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final Date getPinExpires() {
        return this.pinExpires;
    }

    public final boolean getPinned() {
        return this.pinned;
    }

    public final Date getPinnedAt() {
        return this.pinnedAt;
    }

    public final String getPinnedByUserId() {
        return this.pinnedByUserId;
    }

    public final String getPollId() {
        return this.pollId;
    }

    public final ReminderInfoEntity getReminder() {
        return this.reminder;
    }

    public final List<String> getRemoteMentionedUserIds() {
        return this.remoteMentionedUserIds;
    }

    public final int getReplyCount() {
        return this.replyCount;
    }

    public final List<String> getRestrictedVisibility() {
        return this.restrictedVisibility;
    }

    public final boolean getShadowed() {
        return this.shadowed;
    }

    public final boolean getShowInChannel() {
        return this.showInChannel;
    }

    public final boolean getSilent() {
        return this.silent;
    }

    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    public final String getText() {
        return this.text;
    }

    public final List<String> getThreadParticipantsIds() {
        return this.threadParticipantsIds;
    }

    public final String getType() {
        return this.type;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final Date getUpdatedLocallyAt() {
        return this.updatedLocallyAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.deletedReplyCount, AbstractC11266d.m30448b(this.replyCount, (this.syncStatus.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.cid), 31, this.userId), 31, this.text), 31, this.html), 31, this.type)) * 31, 31), 31);
        Date date = this.createdAt;
        int iHashCode = (iM30448b + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.createdLocallyAt;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.updatedLocallyAt;
        int iHashCode4 = (iHashCode3 + (date4 == null ? 0 : date4.hashCode())) * 31;
        Date date5 = this.deletedAt;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode4 + (date5 == null ? 0 : date5.hashCode())) * 31, 31, this.remoteMentionedUserIds), 31, this.mentionedUsersId);
        String str = this.parentId;
        int iHashCode5 = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.command;
        int iM8289b = AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.i18n, AbstractC2875y.m8289b((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.shadowed), 31), 31, this.showInChannel);
        ChannelInfoEntity channelInfoEntity = this.channelInfo;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.extraData, AbstractC2875y.m8289b((iM8289b + (channelInfoEntity == null ? 0 : channelInfoEntity.hashCode())) * 31, 31, this.silent), 31), 31, this.pinned);
        Date date6 = this.pinnedAt;
        int iHashCode6 = (iM8289b2 + (date6 == null ? 0 : date6.hashCode())) * 31;
        Date date7 = this.pinExpires;
        int iHashCode7 = (iHashCode6 + (date7 == null ? 0 : date7.hashCode())) * 31;
        String str3 = this.pinnedByUserId;
        int iM31983b2 = AbstractC11895b.m31983b((iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.threadParticipantsIds);
        ModerationDetailsEntity moderationDetailsEntity = this.moderationDetails;
        int iHashCode8 = (iM31983b2 + (moderationDetailsEntity == null ? 0 : moderationDetailsEntity.hashCode())) * 31;
        Date date8 = this.messageTextUpdatedAt;
        int iHashCode9 = (iHashCode8 + (date8 == null ? 0 : date8.hashCode())) * 31;
        String str4 = this.pollId;
        int iM31983b3 = AbstractC11895b.m31983b((iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.restrictedVisibility);
        ReminderInfoEntity reminderInfoEntity = this.reminder;
        int iHashCode10 = (iM31983b3 + (reminderInfoEntity == null ? 0 : reminderInfoEntity.hashCode())) * 31;
        String str5 = this.channelRole;
        return iHashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.cid;
        String str3 = this.userId;
        String str4 = this.text;
        String str5 = this.html;
        String str6 = this.type;
        SyncStatus syncStatus = this.syncStatus;
        int i13 = this.replyCount;
        int i14 = this.deletedReplyCount;
        Date date = this.createdAt;
        Date date2 = this.createdLocallyAt;
        Date date3 = this.updatedAt;
        Date date4 = this.updatedLocallyAt;
        Date date5 = this.deletedAt;
        List<String> list = this.remoteMentionedUserIds;
        List<String> list2 = this.mentionedUsersId;
        String str7 = this.parentId;
        String str8 = this.command;
        boolean z4 = this.shadowed;
        Map<String, String> map = this.i18n;
        boolean z13 = this.showInChannel;
        ChannelInfoEntity channelInfoEntity = this.channelInfo;
        boolean z14 = this.silent;
        Map<String, Object> map2 = this.extraData;
        boolean z15 = this.pinned;
        Date date6 = this.pinnedAt;
        Date date7 = this.pinExpires;
        String str9 = this.pinnedByUserId;
        List<String> list3 = this.threadParticipantsIds;
        ModerationDetailsEntity moderationDetailsEntity = this.moderationDetails;
        Date date8 = this.messageTextUpdatedAt;
        String str10 = this.pollId;
        List<String> list4 = this.restrictedVisibility;
        ReminderInfoEntity reminderInfoEntity = this.reminder;
        String str11 = this.channelRole;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ReplyMessageInnerEntity(id=", str, ", cid=", str2, ", userId=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", text=", str4, ", html=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", type=", str6, ", syncStatus=");
        sbM32001t.append(syncStatus);
        sbM32001t.append(", replyCount=");
        sbM32001t.append(i13);
        sbM32001t.append(", deletedReplyCount=");
        sbM32001t.append(i14);
        sbM32001t.append(", createdAt=");
        sbM32001t.append(date);
        sbM32001t.append(", createdLocallyAt=");
        AbstractC17176i.m48512n(sbM32001t, date2, ", updatedAt=", date3, ", updatedLocallyAt=");
        AbstractC17176i.m48512n(sbM32001t, date4, ", deletedAt=", date5, ", remoteMentionedUserIds=");
        AbstractC21702c.m61148s(sbM32001t, list, ", mentionedUsersId=", list2, ", parentId=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", command=", str8, ", shadowed=");
        sbM32001t.append(z4);
        sbM32001t.append(", i18n=");
        sbM32001t.append(map);
        sbM32001t.append(", showInChannel=");
        sbM32001t.append(z13);
        sbM32001t.append(", channelInfo=");
        sbM32001t.append(channelInfoEntity);
        sbM32001t.append(", silent=");
        sbM32001t.append(z14);
        sbM32001t.append(", extraData=");
        sbM32001t.append(map2);
        sbM32001t.append(", pinned=");
        sbM32001t.append(z15);
        sbM32001t.append(", pinnedAt=");
        sbM32001t.append(date6);
        sbM32001t.append(", pinExpires=");
        sbM32001t.append(date7);
        sbM32001t.append(", pinnedByUserId=");
        sbM32001t.append(str9);
        sbM32001t.append(", threadParticipantsIds=");
        sbM32001t.append(list3);
        sbM32001t.append(", moderationDetails=");
        sbM32001t.append(moderationDetailsEntity);
        sbM32001t.append(", messageTextUpdatedAt=");
        sbM32001t.append(date8);
        sbM32001t.append(", pollId=");
        sbM32001t.append(str10);
        sbM32001t.append(", restrictedVisibility=");
        sbM32001t.append(list4);
        sbM32001t.append(", reminder=");
        sbM32001t.append(reminderInfoEntity);
        sbM32001t.append(", channelRole=");
        return AbstractC25012a.m73376i(str11, ")", sbM32001t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ReplyMessageInnerEntity(String str, String str2, String str3, String str4, String str5, String str6, SyncStatus syncStatus, int i13, int i14, Date date, Date date2, Date date3, Date date4, Date date5, List list, List list2, String str7, String str8, boolean z4, Map map, boolean z13, ChannelInfoEntity channelInfoEntity, boolean z14, Map map2, boolean z15, Date date6, Date date7, String str9, List list3, ModerationDetailsEntity moderationDetailsEntity, Date date8, String str10, List list4, ReminderInfoEntity reminderInfoEntity, String str11, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        String str12 = (i15 & 8) != 0 ? "" : str4;
        String str13 = (i15 & 16) != 0 ? "" : str5;
        String str14 = (i15 & 32) != 0 ? "" : str6;
        SyncStatus syncStatus2 = (i15 & 64) != 0 ? SyncStatus.COMPLETED : syncStatus;
        int i17 = (i15 & 128) != 0 ? 0 : i13;
        int i18 = (i15 & 256) != 0 ? 0 : i14;
        Date date9 = (i15 & 512) != 0 ? null : date;
        Date date10 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : date2;
        Date date11 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : date3;
        Date date12 = (i15 & 4096) != 0 ? null : date4;
        Date date13 = (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : date5;
        int i19 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
        C25271y c25271y = C25271y.f99162w;
        List list5 = i19 != 0 ? c25271y : list;
        List list6 = (32768 & i15) != 0 ? c25271y : list2;
        String str15 = (65536 & i15) != 0 ? null : str7;
        String str16 = (131072 & i15) != 0 ? null : str8;
        boolean z16 = (262144 & i15) != 0 ? false : z4;
        int i24 = 524288 & i15;
        C25272z c25272z = C25272z.f99163w;
        this(str, str2, str3, str12, str13, str14, syncStatus2, i17, i18, date9, date10, date11, date12, date13, list5, list6, str15, str16, z16, i24 != 0 ? c25272z : map, (1048576 & i15) != 0 ? false : z13, (2097152 & i15) != 0 ? null : channelInfoEntity, (4194304 & i15) != 0 ? false : z14, (8388608 & i15) != 0 ? c25272z : map2, z15, (33554432 & i15) != 0 ? null : date6, (67108864 & i15) != 0 ? null : date7, str9, (268435456 & i15) != 0 ? c25271y : list3, (536870912 & i15) != 0 ? null : moderationDetailsEntity, (i15 & 1073741824) != 0 ? null : date8, str10, (i16 & 1) != 0 ? c25271y : list4, (i16 & 2) != 0 ? null : reminderInfoEntity, (i16 & 4) != 0 ? null : str11);
    }
}
