package io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal;

import android.util.LruCache;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.extensions.internal.ThreadKt;
import io.getstream.chat.android.client.persistance.repository.ThreadsRepository;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012$\u0010\r\u001a \b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012$\u0010\u000f\u001a \b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012$\u0010\u0011\u001a \b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u0006\u0010\u0016\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010 \u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0017H\u0096@¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\fH\u0096@¢\u0006\u0004\b#\u0010$J\u001e\u0010&\u001a\u00020\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u0017H\u0096@¢\u0006\u0004\b&\u0010!J\u001a\u0010'\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0016\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b'\u0010\u001dJ$\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00172\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H\u0096@¢\u0006\u0004\b)\u0010!J\u0018\u0010+\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b+\u0010\u001dJ\u0010\u0010,\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R0\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R2\u0010\r\u001a \b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R2\u0010\u000f\u001a \b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100R2\u0010\u0011\u001a \b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00100R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;", "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;", "threadDao", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;", "threadOrderDao", "Lkotlin/Function2;", "", "Lq83/d;", "Lio/getstream/chat/android/models/User;", "", "getUser", "Lio/getstream/chat/android/models/Message;", "getMessage", "Lio/getstream/chat/android/models/Channel;", "getChannel", "Lio/getstream/chat/android/models/DraftMessage;", "getDraftMessage", "", "cacheSize", "<init>", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;Lc93/m;Lc93/m;Lc93/m;Lc93/m;I)V", "id", "", "order", "Ll83/a0;", "insertThreadOrder", "(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "selectThreadOrder", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Thread;", "threads", "insertThreads", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "message", "upsertMessageInThread", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "messages", "upsertMessagesInThread", "selectThread", "ids", "selectThreads", "cid", "deleteChannelThreads", "clear", "(Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;", "Lc93/m;", "Landroid/util/LruCache;", "cache", "Landroid/util/LruCache;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DatabaseThreadsRepository implements ThreadsRepository {
    private final LruCache<String, Thread> cache;
    private final InterfaceC4351m getChannel;
    private final InterfaceC4351m getDraftMessage;
    private final InterfaceC4351m getMessage;
    private final InterfaceC4351m getUser;
    private final ThreadDao threadDao;
    private final ThreadOrderDao threadOrderDao;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository$clear$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository", m100430f = "DatabaseThreadsRepository.kt", m100431l = {148, 149}, m100432m = "clear")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192361 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C192361(InterfaceC30057d<? super C192361> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseThreadsRepository.this.clear(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository$selectThread$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository", m100430f = "DatabaseThreadsRepository.kt", m100431l = {122, 122}, m100432m = "selectThread")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192371 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C192371(InterfaceC30057d<? super C192371> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseThreadsRepository.this.selectThread(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository$selectThreadOrder$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository", m100430f = "DatabaseThreadsRepository.kt", m100431l = {56}, m100432m = "selectThreadOrder")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192381 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C192381(InterfaceC30057d<? super C192381> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseThreadsRepository.this.selectThreadOrder(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository$selectThreads$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository", m100430f = "DatabaseThreadsRepository.kt", m100431l = {133, 133}, m100432m = "selectThreads")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192391 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
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

        public C192391(InterfaceC30057d<? super C192391> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseThreadsRepository.this.selectThreads(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository$upsertMessageInThread$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository", m100430f = "DatabaseThreadsRepository.kt", m100431l = {73, 73, 79}, m100432m = "upsertMessageInThread")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192401 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C192401(InterfaceC30057d<? super C192401> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseThreadsRepository.this.upsertMessageInThread(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository$upsertMessagesInThread$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository", m100430f = "DatabaseThreadsRepository.kt", m100431l = {92, 93, 116}, m100432m = "upsertMessagesInThread")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192411 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
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

        public C192411(InterfaceC30057d<? super C192411> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseThreadsRepository.this.upsertMessagesInThread(null, this);
        }
    }

    public DatabaseThreadsRepository(ThreadDao threadDao, ThreadOrderDao threadOrderDao, InterfaceC4351m getUser, InterfaceC4351m getMessage, InterfaceC4351m getChannel, InterfaceC4351m getDraftMessage, int i13) {
        AbstractC22676k.m65750j(threadDao, "threadDao");
        AbstractC22676k.m65750j(threadOrderDao, "threadOrderDao");
        AbstractC22676k.m65750j(getUser, "getUser");
        AbstractC22676k.m65750j(getMessage, "getMessage");
        AbstractC22676k.m65750j(getChannel, "getChannel");
        AbstractC22676k.m65750j(getDraftMessage, "getDraftMessage");
        this.threadDao = threadDao;
        this.threadOrderDao = threadOrderDao;
        this.getUser = getUser;
        this.getMessage = getMessage;
        this.getChannel = getChannel;
        this.getDraftMessage = getDraftMessage;
        this.cache = new LruCache<>(i13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r6.deleteAll(r0) == r1) goto L21;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clear(q83.InterfaceC30057d<? super l83.C23454a0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository.C192361
            if (r0 == 0) goto L13
            r0 = r6
            io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository$clear$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository.C192361) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository$clear$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository$clear$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r6)
            goto L54
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            p505ts.AbstractC34132o.m107864I(r6)
            goto L49
        L36:
            p505ts.AbstractC34132o.m107864I(r6)
            android.util.LruCache<java.lang.String, io.getstream.chat.android.models.Thread> r6 = r5.cache
            r6.evictAll()
            io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadDao r6 = r5.threadDao
            r0.label = r4
            java.lang.Object r6 = r6.deleteAll(r0)
            if (r6 != r1) goto L49
            goto L53
        L49:
            io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadOrderDao r6 = r5.threadOrderDao
            r0.label = r3
            java.lang.Object r6 = r6.deleteAll(r0)
            if (r6 != r1) goto L54
        L53:
            return r1
        L54:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository.clear(q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object deleteChannelThreads(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.cache.evictAll();
        Object objDeleteThreads = this.threadDao.deleteThreads(str, interfaceC30057d);
        return objDeleteThreads == EnumC31071a.f128113w ? objDeleteThreads : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object insertThreadOrder(String str, List<String> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objInsertThreadOrder = this.threadOrderDao.insertThreadOrder(new ThreadOrderEntity(str, list), interfaceC30057d);
        return objInsertThreadOrder == EnumC31071a.f128113w ? objInsertThreadOrder : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object insertThreads(List<Thread> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        List<Thread> list2 = list;
        for (Thread thread : list2) {
            this.cache.put(thread.getParentMessageId(), thread);
        }
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ThreadMapperKt.toEntity((Thread) it.next()));
        }
        Object objInsertThreads = this.threadDao.insertThreads(arrayList, interfaceC30057d);
        return objInsertThreads == EnumC31071a.f128113w ? objInsertThreads : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r10 == r0) goto L26;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object selectThread(java.lang.String r9, q83.InterfaceC30057d<? super io.getstream.chat.android.models.Thread> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository.C192371
            if (r0 == 0) goto L14
            r0 = r10
            io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository$selectThread$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository.C192371) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository$selectThread$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository$selectThread$1
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.result
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.label
            r7 = 0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r9 = r6.L$0
            java.lang.String r9 = (java.lang.String) r9
            p505ts.AbstractC34132o.m107864I(r10)
            goto L74
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r9 = r6.L$0
            java.lang.String r9 = (java.lang.String) r9
            p505ts.AbstractC34132o.m107864I(r10)
            goto L5b
        L41:
            p505ts.AbstractC34132o.m107864I(r10)
            android.util.LruCache<java.lang.String, io.getstream.chat.android.models.Thread> r10 = r8.cache
            java.lang.Object r10 = r10.get(r9)
            io.getstream.chat.android.models.Thread r10 = (io.getstream.chat.android.models.Thread) r10
            if (r10 != 0) goto L7b
            io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadDao r10 = r8.threadDao
            r6.L$0 = r9
            r6.label = r3
            java.lang.Object r10 = r10.selectThread(r9, r6)
            if (r10 != r0) goto L5b
            goto L73
        L5b:
            r1 = r10
            io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadEntity r1 = (io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadEntity) r1
            if (r1 == 0) goto L77
            r10 = r2
            c93.m r2 = r8.getUser
            c93.m r3 = r8.getMessage
            c93.m r4 = r8.getChannel
            c93.m r5 = r8.getDraftMessage
            r6.L$0 = r9
            r6.label = r10
            java.lang.Object r10 = io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadMapperKt.toModel(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L74
        L73:
            return r0
        L74:
            io.getstream.chat.android.models.Thread r10 = (io.getstream.chat.android.models.Thread) r10
            goto L78
        L77:
            r10 = r7
        L78:
            if (r10 != 0) goto L7b
            return r7
        L7b:
            android.util.LruCache<java.lang.String, io.getstream.chat.android.models.Thread> r0 = r8.cache
            r0.put(r9, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository.selectThread(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object selectThreadOrder(String str, InterfaceC30057d<? super List<String>> interfaceC30057d) {
        C192381 c192381;
        if (interfaceC30057d instanceof C192381) {
            c192381 = (C192381) interfaceC30057d;
            int i13 = c192381.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192381.label = i13 - Integer.MIN_VALUE;
            } else {
                c192381 = new C192381(interfaceC30057d);
            }
        } else {
            c192381 = new C192381(interfaceC30057d);
        }
        Object objSelectThreadOrder = c192381.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c192381.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectThreadOrder);
            ThreadOrderDao threadOrderDao = this.threadOrderDao;
            c192381.L$0 = null;
            c192381.label = 1;
            objSelectThreadOrder = threadOrderDao.selectThreadOrder(str, c192381);
            if (objSelectThreadOrder == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objSelectThreadOrder);
        }
        ThreadOrderEntity threadOrderEntity = (ThreadOrderEntity) objSelectThreadOrder;
        List<String> order = threadOrderEntity != null ? threadOrderEntity.getOrder() : null;
        return order == null ? C25271y.f99162w : order;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:27:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:30:0x0122  */
    /* JADX WARN: Code duplicated, block: B:32:0x0132  */
    /* JADX WARN: Code duplicated, block: B:34:0x013e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0145  */
    /* JADX WARN: Code duplicated, block: B:39:0x0153 A[LOOP:0: B:37:0x014d->B:39:0x0153, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b4 -> B:33:0x013c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0122 -> B:31:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0132 -> B:33:0x013c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final java.lang.Object selectThreads(java.util.List<java.lang.String> r18, q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.models.Thread>> r19) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository.selectThreads(java.util.List, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object upsertMessageInThread(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C192401 c192401;
        String parentId;
        Thread thread;
        Object objSelectThread;
        Message message2;
        String str;
        ThreadDao threadDao;
        ThreadEntity entity;
        if (interfaceC30057d instanceof C192401) {
            c192401 = (C192401) interfaceC30057d;
            int i13 = c192401.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192401.label = i13 - Integer.MIN_VALUE;
            } else {
                c192401 = new C192401(interfaceC30057d);
            }
        } else {
            c192401 = new C192401(interfaceC30057d);
        }
        C192401 c192402 = c192401;
        Object obj = c192402.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c192402.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            parentId = message.getParentId();
            if (parentId == null) {
                return c23454a0;
            }
            thread = this.cache.get(parentId);
            if (thread == null) {
                ThreadDao threadDao2 = this.threadDao;
                c192402.L$0 = message;
                c192402.L$1 = parentId;
                c192402.label = 1;
                objSelectThread = threadDao2.selectThread(parentId, c192402);
                if (objSelectThread != enumC31071a) {
                }
            } else {
                Thread threadUpsertReply = ThreadKt.upsertReply(thread, message);
                this.cache.put(parentId, threadUpsertReply);
                threadDao = this.threadDao;
                entity = ThreadMapperKt.toEntity(threadUpsertReply);
                c192402.L$0 = null;
                c192402.L$1 = null;
                c192402.L$2 = null;
                c192402.L$3 = null;
                c192402.label = 3;
                if (threadDao.insertThread(entity, c192402) != enumC31071a) {
                    return c23454a0;
                }
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            String str2 = (String) c192402.L$1;
            Message message3 = (Message) c192402.L$0;
            AbstractC34132o.m107864I(obj);
            parentId = str2;
            message = message3;
            objSelectThread = obj;
        } else if (i14 == 2) {
            str = (String) c192402.L$1;
            message2 = (Message) c192402.L$0;
            AbstractC34132o.m107864I(obj);
            Thread thread2 = (Thread) obj;
            parentId = str;
            message = message2;
            thread = thread2;
            if (thread == null) {
                return c23454a0;
            }
            Thread threadUpsertReply2 = ThreadKt.upsertReply(thread, message);
            this.cache.put(parentId, threadUpsertReply2);
            threadDao = this.threadDao;
            entity = ThreadMapperKt.toEntity(threadUpsertReply2);
            c192402.L$0 = null;
            c192402.L$1 = null;
            c192402.L$2 = null;
            c192402.L$3 = null;
            c192402.label = 3;
            if (threadDao.insertThread(entity, c192402) != enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return c23454a0;
        ThreadEntity threadEntity = (ThreadEntity) objSelectThread;
        if (threadEntity != null) {
            InterfaceC4351m interfaceC4351m = this.getUser;
            InterfaceC4351m interfaceC4351m2 = this.getMessage;
            InterfaceC4351m interfaceC4351m3 = this.getChannel;
            InterfaceC4351m interfaceC4351m4 = this.getDraftMessage;
            c192402.L$0 = message;
            c192402.L$1 = parentId;
            c192402.label = 2;
            Object model = ThreadMapperKt.toModel(threadEntity, interfaceC4351m, interfaceC4351m2, interfaceC4351m3, interfaceC4351m4, c192402);
            if (model != enumC31071a) {
                message2 = message;
                str = parentId;
                obj = model;
                Thread thread3 = (Thread) obj;
                parentId = str;
                message = message2;
                thread = thread3;
                if (thread == null) {
                    return c23454a0;
                }
                Thread threadUpsertReply3 = ThreadKt.upsertReply(thread, message);
                this.cache.put(parentId, threadUpsertReply3);
                threadDao = this.threadDao;
                entity = ThreadMapperKt.toEntity(threadUpsertReply3);
                c192402.L$0 = null;
                c192402.L$1 = null;
                c192402.L$2 = null;
                c192402.L$3 = null;
                c192402.label = 3;
                if (threadDao.insertThread(entity, c192402) != enumC31071a) {
                    return c23454a0;
                }
            }
        } else {
            thread = null;
            if (thread == null) {
                return c23454a0;
            }
            Thread threadUpsertReply4 = ThreadKt.upsertReply(thread, message);
            this.cache.put(parentId, threadUpsertReply4);
            threadDao = this.threadDao;
            entity = ThreadMapperKt.toEntity(threadUpsertReply4);
            c192402.L$0 = null;
            c192402.L$1 = null;
            c192402.L$2 = null;
            c192402.L$3 = null;
            c192402.label = 3;
            if (threadDao.insertThread(entity, c192402) != enumC31071a) {
                return c23454a0;
            }
        }
        return enumC31071a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0176  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01b9 -> B:51:0x01bd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final java.lang.Object upsertMessagesInThread(java.util.List<io.getstream.chat.android.models.Message> r20, q83.InterfaceC30057d<? super l83.C23454a0> r21) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository.upsertMessagesInThread(java.util.List, q83.d):java.lang.Object");
    }

    public /* synthetic */ DatabaseThreadsRepository(ThreadDao threadDao, ThreadOrderDao threadOrderDao, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, InterfaceC4351m interfaceC4351m4, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(threadDao, threadOrderDao, interfaceC4351m, interfaceC4351m2, interfaceC4351m3, interfaceC4351m4, (i14 & 64) != 0 ? 1000 : i13);
    }
}
