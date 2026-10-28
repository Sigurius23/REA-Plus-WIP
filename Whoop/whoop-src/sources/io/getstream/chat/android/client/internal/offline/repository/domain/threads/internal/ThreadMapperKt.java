package io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal;

import c93.InterfaceC4351m;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.userread.internal.ChannelUserReadMapperKt;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.ThreadParticipant;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aª\u0001\u0010\u0010\u001a\u00020\u0000*\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042$\u0010\u000b\u001a \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042$\u0010\r\u001a \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042$\u0010\u000f\u001a \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0080@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0002\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0002\u0010\u0014\u001a8\u0010\u0010\u001a\u00020\u0012*\u00020\u00132\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0080@¢\u0006\u0004\b\u0010\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/models/Thread;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;", "toEntity", "(Lio/getstream/chat/android/models/Thread;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;", "Lkotlin/Function2;", "", "Lq83/d;", "Lio/getstream/chat/android/models/User;", "", "getUser", "Lio/getstream/chat/android/models/Message;", "getMessage", "Lio/getstream/chat/android/models/Channel;", "getChannel", "Lio/getstream/chat/android/models/DraftMessage;", "getDraftMessage", "toModel", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/ThreadParticipant;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;", "(Lio/getstream/chat/android/models/ThreadParticipant;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadMapperKt {

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadMapperKt$toModel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadMapperKt", m100430f = "ThreadMapper.kt", m100431l = {60, 62, 64, 67, 73, 74, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "toModel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192431 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        int I$6;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$16;
        Object L$17;
        Object L$18;
        Object L$19;
        Object L$2;
        Object L$20;
        Object L$21;
        Object L$22;
        Object L$23;
        Object L$24;
        Object L$25;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C192431(InterfaceC30057d<? super C192431> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ThreadMapperKt.toModel(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadMapperKt$toModel$5 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadMapperKt", m100430f = "ThreadMapper.kt", m100431l = {93}, m100432m = "toModel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192445 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C192445(InterfaceC30057d<? super C192445> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ThreadMapperKt.toModel(null, null, this);
        }
    }

    public static final ThreadEntity toEntity(Thread thread) {
        AbstractC22676k.m65750j(thread, "<this>");
        String parentMessageId = thread.getParentMessageId();
        String cid = thread.getCid();
        String createdByUserId = thread.getCreatedByUserId();
        int activeParticipantCount = thread.getActiveParticipantCount();
        int participantCount = thread.getParticipantCount();
        List<ThreadParticipant> threadParticipants = thread.getThreadParticipants();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(threadParticipants, 10));
        Iterator<T> it = threadParticipants.iterator();
        while (it.hasNext()) {
            arrayList.add(toEntity((ThreadParticipant) it.next()));
        }
        Date lastMessageAt = thread.getLastMessageAt();
        Date createdAt = thread.getCreatedAt();
        Date updatedAt = thread.getUpdatedAt();
        Date deletedAt = thread.getDeletedAt();
        String title = thread.getTitle();
        List<ChannelUserRead> read = thread.getRead();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(read, 10));
        Iterator<T> it3 = read.iterator();
        while (it3.hasNext()) {
            arrayList2.add(ChannelUserReadMapperKt.toEntity((ChannelUserRead) it3.next()));
        }
        List<Message> latestReplies = thread.getLatestReplies();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(latestReplies, 10));
        Iterator<T> it4 = latestReplies.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((Message) it4.next()).getId());
        }
        return new ThreadEntity(parentMessageId, cid, createdByUserId, activeParticipantCount, participantCount, arrayList, lastMessageAt, createdAt, updatedAt, deletedAt, title, arrayList2, arrayList3, thread.getExtraData());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0309  */
    /* JADX WARN: Code duplicated, block: B:29:0x039b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0408  */
    /* JADX WARN: Code duplicated, block: B:38:0x0455  */
    /* JADX WARN: Code duplicated, block: B:39:0x0458  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0458 -> B:40:0x046b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0558 -> B:48:0x0577). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0657 -> B:56:0x066c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object toModel(io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadEntity r71, c93.InterfaceC4351m r72, c93.InterfaceC4351m r73, c93.InterfaceC4351m r74, c93.InterfaceC4351m r75, q83.InterfaceC30057d<? super io.getstream.chat.android.models.Thread> r76) {
        /*
            Method dump skipped, instruction units count: 1834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadMapperKt.toModel(io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadEntity, c93.m, c93.m, c93.m, c93.m, q83.d):java.lang.Object");
    }

    public static final ThreadParticipantEntity toEntity(ThreadParticipant threadParticipant) {
        AbstractC22676k.m65750j(threadParticipant, "<this>");
        return new ThreadParticipantEntity(threadParticipant.getUser().getId(), threadParticipant.getLastThreadMessageAt());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object toModel(ThreadParticipantEntity threadParticipantEntity, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super ThreadParticipant> interfaceC30057d) {
        C192445 c192445;
        if (interfaceC30057d instanceof C192445) {
            c192445 = (C192445) interfaceC30057d;
            int i13 = c192445.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192445.label = i13 - Integer.MIN_VALUE;
            } else {
                c192445 = new C192445(interfaceC30057d);
            }
        } else {
            c192445 = new C192445(interfaceC30057d);
        }
        Object objInvoke = c192445.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c192445.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objInvoke);
            Object userId = threadParticipantEntity.getUserId();
            c192445.L$0 = threadParticipantEntity;
            c192445.L$1 = null;
            c192445.label = 1;
            objInvoke = interfaceC4351m.invoke(userId, c192445);
            if (objInvoke == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            threadParticipantEntity = (ThreadParticipantEntity) c192445.L$0;
            AbstractC34132o.m107864I(objInvoke);
        }
        return new ThreadParticipant((User) objInvoke, threadParticipantEntity.getLastThreadMessageAt());
    }
}
