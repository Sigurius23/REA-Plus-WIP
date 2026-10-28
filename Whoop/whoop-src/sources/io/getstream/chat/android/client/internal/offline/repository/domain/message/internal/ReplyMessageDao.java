package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.ReplyAttachmentEntity;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\ba\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0097@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\r\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H§@¢\u0006\u0004\b\r\u0010\u000bJ\u001e\u0010\u0010\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H§@¢\u0006\u0004\b\u0010\u0010\u000bJ\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\fH§@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tH§@¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;", "", "", "id", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;", "selectById", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "replyMessageEntities", "Ll83/a0;", "insert", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;", "insertInnerEntity", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;", "attachmentEntities", "insertAttachments", "replyMessageInnerEntity", "delete", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;Lq83/d;)Ljava/lang/Object;", "deleteAll", "(Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ReplyMessageDao {

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao$insert$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao", m100430f = "ReplyMessageDao.kt", m100431l = {36, 37}, m100432m = "insert$suspendImpl")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192071 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C192071(InterfaceC30057d<? super C192071> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReplyMessageDao.insert$suspendImpl(ReplyMessageDao.this, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        if (r6.insertInnerEntity(r8, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object insert$suspendImpl(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao r6, java.util.List<io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageEntity> r7, q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            boolean r0 = r8 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao.C192071
            if (r0 == 0) goto L13
            r0 = r8
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao$insert$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao.C192071) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao$insert$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao$insert$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r0.L$0
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao r6 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao) r6
            p505ts.AbstractC34132o.m107864I(r8)
            goto Lad
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            java.lang.Object r6 = r0.L$1
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r0.L$0
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao r6 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao) r6
            p505ts.AbstractC34132o.m107864I(r8)
            goto L7a
        L48:
            p505ts.AbstractC34132o.m107864I(r8)
            r8 = r7
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L57:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r8.next()
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageEntity r5 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageEntity) r5
            java.util.List r5 = r5.getAttachments()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            m83.AbstractC25265s.m74141p0(r2, r5)
            goto L57
        L6d:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r6.insertAttachments(r2, r0)
            if (r8 != r1) goto L7a
            goto Lac
        L7a:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r2 = 10
            int r2 = m83.AbstractC25267u.m74163i0(r7, r2)
            r8.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L8b:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L9f
            java.lang.Object r2 = r7.next()
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageEntity r2 = (io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageEntity) r2
            io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageInnerEntity r2 = r2.getReplyMessageInnerEntity()
            r8.add(r2)
            goto L8b
        L9f:
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r6 = r6.insertInnerEntity(r8, r0)
            if (r6 != r1) goto Lad
        Lac:
            return r1
        Lad:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao.insert$suspendImpl(io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao, java.util.List, q83.d):java.lang.Object");
    }

    Object delete(ReplyMessageInnerEntity replyMessageInnerEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    default Object insert(List<ReplyMessageEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return insert$suspendImpl(this, list, interfaceC30057d);
    }

    Object insertAttachments(List<ReplyAttachmentEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertInnerEntity(List<ReplyMessageInnerEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object selectById(String str, InterfaceC30057d<? super ReplyMessageEntity> interfaceC30057d);
}
