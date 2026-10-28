package io.getstream.chat.android.models;

import androidx.profileinstaller.ProfileVerifier;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import java.util.Date;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b \n\u0002\u0010\u000f\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b!\u0010\"J\u0016\u0010@\u001a\b\u0012\u0002\b\u0003\u0018\u00010A2\u0006\u0010B\u001a\u00020\u0006H\u0016J\t\u0010C\u001a\u00020\u0004HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\u000bHÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010J\u001a\u00020\u0004HÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\t\u0010L\u001a\u00020\u0014HÆ\u0003J\t\u0010M\u001a\u00020\u0014HÆ\u0003J\t\u0010N\u001a\u00020\u0014HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010P\u001a\u00020\u0006HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011HÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u0015\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fHÆ\u0003Jã\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00062\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fHÆ\u0001J\u0013\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010Y\u001a\u00020\u0004HÖ\u0001J\t\u0010Z\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0011\u0010\u0016\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0011\u0010\u0018\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u0010&R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011¢\u0006\b\n\u0000\u001a\u0004\b9\u00101R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010>\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b?\u0010$¨\u0006["}, m65681d2 = {"Lio/getstream/chat/android/models/Thread;", "Lio/getstream/chat/android/models/CustomObject;", "Lio/getstream/chat/android/models/querysort/ComparableFieldProvider;", "activeParticipantCount", "", "cid", "", "channel", "Lio/getstream/chat/android/models/Channel;", "parentMessageId", "parentMessage", "Lio/getstream/chat/android/models/Message;", "createdByUserId", "createdBy", "Lio/getstream/chat/android/models/User;", "participantCount", "threadParticipants", "", "Lio/getstream/chat/android/models/ThreadParticipant;", "lastMessageAt", "Ljava/util/Date;", "createdAt", "updatedAt", "deletedAt", "title", "latestReplies", "read", "Lio/getstream/chat/android/models/ChannelUserRead;", "draft", "Lio/getstream/chat/android/models/DraftMessage;", "extraData", "", "", "<init>", "(ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;)V", "getActiveParticipantCount", "()I", "getCid", "()Ljava/lang/String;", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "getParentMessageId", "getParentMessage", "()Lio/getstream/chat/android/models/Message;", "getCreatedByUserId", "getCreatedBy", "()Lio/getstream/chat/android/models/User;", "getParticipantCount", "getThreadParticipants", "()Ljava/util/List;", "getLastMessageAt", "()Ljava/util/Date;", "getCreatedAt", "getUpdatedAt", "getDeletedAt", "getTitle", "getLatestReplies", "getRead", "getDraft", "()Lio/getstream/chat/android/models/DraftMessage;", "getExtraData", "()Ljava/util/Map;", "replyCount", "getReplyCount", "getComparableField", "", "fieldName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class Thread implements CustomObject, ComparableFieldProvider {
    private final int activeParticipantCount;
    private final Channel channel;
    private final String cid;
    private final Date createdAt;
    private final User createdBy;
    private final String createdByUserId;
    private final Date deletedAt;
    private final DraftMessage draft;
    private final Map<String, Object> extraData;
    private final Date lastMessageAt;
    private final List<Message> latestReplies;
    private final Message parentMessage;
    private final String parentMessageId;
    private final int participantCount;
    private final List<ChannelUserRead> read;
    private final List<ThreadParticipant> threadParticipants;
    private final String title;
    private final Date updatedAt;

    public Thread(int i13, String cid, Channel channel, String parentMessageId, Message parentMessage, String createdByUserId, User user, int i14, List<ThreadParticipant> threadParticipants, Date lastMessageAt, Date createdAt, Date updatedAt, Date date, String title, List<Message> latestReplies, List<ChannelUserRead> read, DraftMessage draftMessage, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(parentMessageId, "parentMessageId");
        AbstractC22676k.m65750j(parentMessage, "parentMessage");
        AbstractC22676k.m65750j(createdByUserId, "createdByUserId");
        AbstractC22676k.m65750j(threadParticipants, "threadParticipants");
        AbstractC22676k.m65750j(lastMessageAt, "lastMessageAt");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(latestReplies, "latestReplies");
        AbstractC22676k.m65750j(read, "read");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.activeParticipantCount = i13;
        this.cid = cid;
        this.channel = channel;
        this.parentMessageId = parentMessageId;
        this.parentMessage = parentMessage;
        this.createdByUserId = createdByUserId;
        this.createdBy = user;
        this.participantCount = i14;
        this.threadParticipants = threadParticipants;
        this.lastMessageAt = lastMessageAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = date;
        this.title = title;
        this.latestReplies = latestReplies;
        this.read = read;
        this.draft = draftMessage;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Thread copy$default(Thread thread, int i13, String str, Channel channel, String str2, Message message, String str3, User user, int i14, List list, Date date, Date date2, Date date3, Date date4, String str4, List list2, List list3, DraftMessage draftMessage, Map map, int i15, Object obj) {
        Map map2;
        DraftMessage draftMessage2;
        int i16 = (i15 & 1) != 0 ? thread.activeParticipantCount : i13;
        String str5 = (i15 & 2) != 0 ? thread.cid : str;
        Channel channel2 = (i15 & 4) != 0 ? thread.channel : channel;
        String str6 = (i15 & 8) != 0 ? thread.parentMessageId : str2;
        Message message2 = (i15 & 16) != 0 ? thread.parentMessage : message;
        String str7 = (i15 & 32) != 0 ? thread.createdByUserId : str3;
        User user2 = (i15 & 64) != 0 ? thread.createdBy : user;
        int i17 = (i15 & 128) != 0 ? thread.participantCount : i14;
        List list4 = (i15 & 256) != 0 ? thread.threadParticipants : list;
        Date date5 = (i15 & 512) != 0 ? thread.lastMessageAt : date;
        Date date6 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? thread.createdAt : date2;
        Date date7 = (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? thread.updatedAt : date3;
        Date date8 = (i15 & 4096) != 0 ? thread.deletedAt : date4;
        String str8 = (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? thread.title : str4;
        int i18 = i16;
        List list5 = (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? thread.latestReplies : list2;
        List list6 = (i15 & 32768) != 0 ? thread.read : list3;
        DraftMessage draftMessage3 = (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? thread.draft : draftMessage;
        if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            draftMessage2 = draftMessage3;
            map2 = thread.extraData;
        } else {
            map2 = map;
            draftMessage2 = draftMessage3;
        }
        return thread.copy(i18, str5, channel2, str6, message2, str7, user2, i17, list4, date5, date6, date7, date8, str8, list5, list6, draftMessage2, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getActiveParticipantCount() {
        return this.activeParticipantCount;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getLastMessageAt() {
        return this.lastMessageAt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Message> component15() {
        return this.latestReplies;
    }

    public final List<ChannelUserRead> component16() {
        return this.read;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final DraftMessage getDraft() {
        return this.draft;
    }

    public final Map<String, Object> component18() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Channel getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Message getParentMessage() {
        return this.parentMessage;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCreatedByUserId() {
        return this.createdByUserId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final User getCreatedBy() {
        return this.createdBy;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getParticipantCount() {
        return this.participantCount;
    }

    public final List<ThreadParticipant> component9() {
        return this.threadParticipants;
    }

    public final Thread copy(int activeParticipantCount, String cid, Channel channel, String parentMessageId, Message parentMessage, String createdByUserId, User createdBy, int participantCount, List<ThreadParticipant> threadParticipants, Date lastMessageAt, Date createdAt, Date updatedAt, Date deletedAt, String title, List<Message> latestReplies, List<ChannelUserRead> read, DraftMessage draft, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(parentMessageId, "parentMessageId");
        AbstractC22676k.m65750j(parentMessage, "parentMessage");
        AbstractC22676k.m65750j(createdByUserId, "createdByUserId");
        AbstractC22676k.m65750j(threadParticipants, "threadParticipants");
        AbstractC22676k.m65750j(lastMessageAt, "lastMessageAt");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(latestReplies, "latestReplies");
        AbstractC22676k.m65750j(read, "read");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new Thread(activeParticipantCount, cid, channel, parentMessageId, parentMessage, createdByUserId, createdBy, participantCount, threadParticipants, lastMessageAt, createdAt, updatedAt, deletedAt, title, latestReplies, read, draft, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Thread)) {
            return false;
        }
        Thread thread = (Thread) other;
        return this.activeParticipantCount == thread.activeParticipantCount && AbstractC22676k.m65745e(this.cid, thread.cid) && AbstractC22676k.m65745e(this.channel, thread.channel) && AbstractC22676k.m65745e(this.parentMessageId, thread.parentMessageId) && AbstractC22676k.m65745e(this.parentMessage, thread.parentMessage) && AbstractC22676k.m65745e(this.createdByUserId, thread.createdByUserId) && AbstractC22676k.m65745e(this.createdBy, thread.createdBy) && this.participantCount == thread.participantCount && AbstractC22676k.m65745e(this.threadParticipants, thread.threadParticipants) && AbstractC22676k.m65745e(this.lastMessageAt, thread.lastMessageAt) && AbstractC22676k.m65745e(this.createdAt, thread.createdAt) && AbstractC22676k.m65745e(this.updatedAt, thread.updatedAt) && AbstractC22676k.m65745e(this.deletedAt, thread.deletedAt) && AbstractC22676k.m65745e(this.title, thread.title) && AbstractC22676k.m65745e(this.latestReplies, thread.latestReplies) && AbstractC22676k.m65745e(this.read, thread.read) && AbstractC22676k.m65745e(this.draft, thread.draft) && AbstractC22676k.m65745e(this.extraData, thread.extraData);
    }

    public final int getActiveParticipantCount() {
        return this.activeParticipantCount;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final String getCid() {
        return this.cid;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return java.lang.Integer.valueOf(r1.activeParticipantCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r2.equals("created_at") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r2.equals("participant_count") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r2.equals("lastMessageAt") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r2.equals("createdAt") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        return r1.createdAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r2.equals("participantCount") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        return java.lang.Integer.valueOf(r1.participantCount);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r2.equals("reply_count") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        if (r2.equals("last_message_at") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        return r1.lastMessageAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
    
        if (r2.equals("parentMessageId") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
    
        if (r2.equals("updated_at") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0090, code lost:
    
        if (r2.equals("replyCount") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009b, code lost:
    
        return java.lang.Integer.valueOf(getReplyCount());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a2, code lost:
    
        if (r2.equals("parent_message_id") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a7, code lost:
    
        return r1.parentMessageId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ae, code lost:
    
        if (r2.equals("updatedAt") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c3, code lost:
    
        return r1.updatedAt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r2.equals("active_participant_count") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r2.equals("activeParticipantCount") == false) goto L58;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.getstream.chat.android.models.querysort.ComparableFieldProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Comparable<?> getComparableField(java.lang.String r2) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.models.Thread.getComparableField(java.lang.String):java.lang.Comparable");
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final User getCreatedBy() {
        return this.createdBy;
    }

    public final String getCreatedByUserId() {
        return this.createdByUserId;
    }

    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final DraftMessage getDraft() {
        return this.draft;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public <T> T getExtraValue(String str, T t14) {
        return (T) super.getExtraValue(str, t14);
    }

    public final Date getLastMessageAt() {
        return this.lastMessageAt;
    }

    public final List<Message> getLatestReplies() {
        return this.latestReplies;
    }

    public final Message getParentMessage() {
        return this.parentMessage;
    }

    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    public final int getParticipantCount() {
        return this.participantCount;
    }

    public final List<ChannelUserRead> getRead() {
        return this.read;
    }

    public final int getReplyCount() {
        return this.parentMessage.getReplyCount();
    }

    public final List<ThreadParticipant> getThreadParticipants() {
        return this.threadParticipants;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Integer.hashCode(this.activeParticipantCount) * 31, 31, this.cid);
        Channel channel = this.channel;
        int iM30450d2 = AbstractC11266d.m30450d((this.parentMessage.hashCode() + AbstractC11266d.m30450d((iM30450d + (channel == null ? 0 : channel.hashCode())) * 31, 31, this.parentMessageId)) * 31, 31, this.createdByUserId);
        User user = this.createdBy;
        int iM124373c = AbstractC38963t7.m124373c(this.updatedAt, AbstractC38963t7.m124373c(this.createdAt, AbstractC38963t7.m124373c(this.lastMessageAt, AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.participantCount, (iM30450d2 + (user == null ? 0 : user.hashCode())) * 31, 31), 31, this.threadParticipants), 31), 31), 31);
        Date date = this.deletedAt;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d((iM124373c + (date == null ? 0 : date.hashCode())) * 31, 31, this.title), 31, this.latestReplies), 31, this.read);
        DraftMessage draftMessage = this.draft;
        return this.extraData.hashCode() + ((iM31983b + (draftMessage != null ? draftMessage.hashCode() : 0)) * 31);
    }

    public String toString() {
        int i13 = this.activeParticipantCount;
        String str = this.cid;
        Channel channel = this.channel;
        String str2 = this.parentMessageId;
        Message message = this.parentMessage;
        String str3 = this.createdByUserId;
        User user = this.createdBy;
        int i14 = this.participantCount;
        List<ThreadParticipant> list = this.threadParticipants;
        Date date = this.lastMessageAt;
        Date date2 = this.createdAt;
        Date date3 = this.updatedAt;
        Date date4 = this.deletedAt;
        String str4 = this.title;
        List<Message> list2 = this.latestReplies;
        List<ChannelUserRead> list3 = this.read;
        DraftMessage draftMessage = this.draft;
        Map<String, Object> map = this.extraData;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "Thread(activeParticipantCount=", ", cid=", str, ", channel=");
        sbM53373n.append(channel);
        sbM53373n.append(", parentMessageId=");
        sbM53373n.append(str2);
        sbM53373n.append(", parentMessage=");
        sbM53373n.append(message);
        sbM53373n.append(", createdByUserId=");
        sbM53373n.append(str3);
        sbM53373n.append(", createdBy=");
        sbM53373n.append(user);
        sbM53373n.append(", participantCount=");
        sbM53373n.append(i14);
        sbM53373n.append(", threadParticipants=");
        sbM53373n.append(list);
        sbM53373n.append(", lastMessageAt=");
        sbM53373n.append(date);
        sbM53373n.append(", createdAt=");
        AbstractC17176i.m48512n(sbM53373n, date2, ", updatedAt=", date3, ", deletedAt=");
        sbM53373n.append(date4);
        sbM53373n.append(", title=");
        sbM53373n.append(str4);
        sbM53373n.append(", latestReplies=");
        AbstractC21702c.m61148s(sbM53373n, list2, ", read=", list3, ", draft=");
        sbM53373n.append(draftMessage);
        sbM53373n.append(", extraData=");
        sbM53373n.append(map);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    public /* synthetic */ Thread(int i13, String str, Channel channel, String str2, Message message, String str3, User user, int i14, List list, Date date, Date date2, Date date3, Date date4, String str4, List list2, List list3, DraftMessage draftMessage, Map map, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, channel, str2, message, str3, user, i14, list, date, date2, date3, date4, str4, list2, list3, draftMessage, (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? C25272z.f99163w : map);
    }
}
