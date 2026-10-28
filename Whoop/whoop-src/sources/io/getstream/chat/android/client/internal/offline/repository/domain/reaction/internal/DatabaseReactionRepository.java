package io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal;

import c93.InterfaceC4351m;
import io.getstream.chat.android.client.persistance.repository.ReactionRepository;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.SyncStatus;
import java.util.Date;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b#\u0010\"J*\u0010%\u001a\u0004\u0018\u00010\f2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b%\u0010&J&\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u001b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b)\u0010\u0010J\u0010\u0010*\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R0\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;", "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;", "reactionDao", "Lkotlin/Function2;", "", "Lq83/d;", "Lio/getstream/chat/android/models/User;", "", "getUser", "<init>", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;Lc93/m;)V", "Lio/getstream/chat/android/models/Reaction;", "reaction", "Ll83/a0;", "insertReaction", "(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;", "userId", "messageId", "Ljava/util/Date;", "deletedAt", "updateReactionsForMessageByDeletedDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "", "id", "selectReactionById", "(ILq83/d;)Ljava/lang/Object;", "", "ids", "selectReactionsByIds", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/SyncStatus;", "syncStatus", "selectReactionIdsBySyncStatus", "(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;", "selectReactionsBySyncStatus", "reactionType", "selectUserReactionToMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "selectUserReactionsToMessage", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "deleteReaction", "clear", "(Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;", "Lc93/m;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DatabaseReactionRepository implements ReactionRepository {
    private final InterfaceC4351m getUser;
    private final ReactionDao reactionDao;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectReactionById$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository", m100430f = "DatabaseReactionRepository.kt", m100431l = {64, 64}, m100432m = "selectReactionById")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192241 extends AbstractC32269c {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public C192241(InterfaceC30057d<? super C192241> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseReactionRepository.this.selectReactionById(0, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectReactionsByIds$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository", m100430f = "DatabaseReactionRepository.kt", m100431l = {73, 73}, m100432m = "selectReactionsByIds")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192251 extends AbstractC32269c {
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

        public C192251(InterfaceC30057d<? super C192251> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseReactionRepository.this.selectReactionsByIds(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectReactionsBySyncStatus$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository", m100430f = "DatabaseReactionRepository.kt", m100431l = {91, 91}, m100432m = "selectReactionsBySyncStatus")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192261 extends AbstractC32269c {
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

        public C192261(InterfaceC30057d<? super C192261> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseReactionRepository.this.selectReactionsBySyncStatus(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectUserReactionToMessage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository", m100430f = "DatabaseReactionRepository.kt", m100431l = {108, 112}, m100432m = "selectUserReactionToMessage")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192271 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C192271(InterfaceC30057d<? super C192271> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseReactionRepository.this.selectUserReactionToMessage(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectUserReactionsToMessage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository", m100430f = "DatabaseReactionRepository.kt", m100431l = {125, 126}, m100432m = "selectUserReactionsToMessage")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192281 extends AbstractC32269c {
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

        public C192281(InterfaceC30057d<? super C192281> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DatabaseReactionRepository.this.selectUserReactionsToMessage(null, null, this);
        }
    }

    public DatabaseReactionRepository(ReactionDao reactionDao, InterfaceC4351m getUser) {
        AbstractC22676k.m65750j(reactionDao, "reactionDao");
        AbstractC22676k.m65750j(getUser, "getUser");
        this.reactionDao = reactionDao;
        this.getUser = getUser;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object clear(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objDeleteAll = this.reactionDao.deleteAll(interfaceC30057d);
        return objDeleteAll == EnumC31071a.f128113w ? objDeleteAll : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object deleteReaction(Reaction reaction, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objDelete = this.reactionDao.delete(ReactionMapperKt.toEntity(reaction), interfaceC30057d);
        return objDelete == EnumC31071a.f128113w ? objDelete : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object insertReaction(Reaction reaction, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (reaction.getMessageId().length() <= 0) {
            throw new IllegalArgumentException("message id can't be empty when creating a reaction");
        }
        if (reaction.getType().length() <= 0) {
            throw new IllegalArgumentException("type can't be empty when creating a reaction");
        }
        if (reaction.getUserId().length() <= 0) {
            throw new IllegalArgumentException("user id can't be empty when creating a reaction");
        }
        Object objInsert = this.reactionDao.insert(ReactionMapperKt.toEntity(reaction), interfaceC30057d);
        return objInsert == EnumC31071a.f128113w ? objInsert : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r7 == r1) goto L23;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object selectReactionById(int r6, q83.InterfaceC30057d<? super io.getstream.chat.android.models.Reaction> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository.C192241
            if (r0 == 0) goto L13
            r0 = r7
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectReactionById$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository.C192241) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectReactionById$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectReactionById$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r7)
            goto L59
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r6 = r0.I$0
            p505ts.AbstractC34132o.m107864I(r7)
            goto L48
        L38:
            p505ts.AbstractC34132o.m107864I(r7)
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao r7 = r5.reactionDao
            r0.I$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.selectReactionById(r6, r0)
            if (r7 != r1) goto L48
            goto L58
        L48:
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity r7 = (io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity) r7
            if (r7 == 0) goto L5c
            c93.m r2 = r5.getUser
            r0.I$0 = r6
            r0.label = r3
            java.lang.Object r7 = io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionMapperKt.toModel(r7, r2, r0)
            if (r7 != r1) goto L59
        L58:
            return r1
        L59:
            io.getstream.chat.android.models.Reaction r7 = (io.getstream.chat.android.models.Reaction) r7
            return r7
        L5c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository.selectReactionById(int, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object selectReactionIdsBySyncStatus(SyncStatus syncStatus, InterfaceC30057d<? super List<Integer>> interfaceC30057d) {
        return ReactionDao.selectIdsSyncStatus$default(this.reactionDao, syncStatus, 0, interfaceC30057d, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ae -> B:26:0x00af). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final java.lang.Object selectReactionsByIds(java.util.List<java.lang.Integer> r11, q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.models.Reaction>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository.C192251
            if (r0 == 0) goto L13
            r0 = r12
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectReactionsByIds$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository.C192251) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectReactionsByIds$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectReactionsByIds$1
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
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity r7 = (io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity) r7
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
            goto Laf
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
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao r12 = r10.reactionDao
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r12 = r12.selectReactionsByIds(r11, r0)
            if (r12 != r1) goto L6c
            goto Lad
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
            if (r12 == 0) goto Lb6
            java.lang.Object r12 = r7.next()
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity r12 = (io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity) r12
            c93.m r8 = r10.getUser
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
            java.lang.Object r12 = io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionMapperKt.toModel(r12, r8, r0)
            if (r12 != r1) goto Lae
        Lad:
            return r1
        Lae:
            r8 = r4
        Laf:
            io.getstream.chat.android.models.Reaction r12 = (io.getstream.chat.android.models.Reaction) r12
            r4.add(r12)
            r4 = r8
            goto L81
        Lb6:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository.selectReactionsByIds(java.util.List, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b4 -> B:27:0x00b5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final java.lang.Object selectReactionsBySyncStatus(io.getstream.chat.android.models.SyncStatus r11, q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.models.Reaction>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository.C192261
            if (r0 == 0) goto L14
            r0 = r12
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectReactionsBySyncStatus$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository.C192261) r0
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
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectReactionsBySyncStatus$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectReactionsBySyncStatus$1
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
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity r3 = (io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity) r3
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
            goto Lb5
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
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao r1 = r10.reactionDao
            r4.L$0 = r9
            r4.label = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r2 = r11
            java.lang.Object r12 = io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao.selectSyncStatus$default(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L72
            goto Lb3
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
            if (r12 == 0) goto Lbc
            java.lang.Object r12 = r3.next()
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity r12 = (io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity) r12
            c93.m r5 = r10.getUser
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
            java.lang.Object r12 = io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionMapperKt.toModel(r12, r5, r4)
            if (r12 != r0) goto Lb4
        Lb3:
            return r0
        Lb4:
            r5 = r2
        Lb5:
            io.getstream.chat.android.models.Reaction r12 = (io.getstream.chat.android.models.Reaction) r12
            r2.add(r12)
            r2 = r5
            goto L87
        Lbc:
            java.util.List r2 = (java.util.List) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository.selectReactionsBySyncStatus(io.getstream.chat.android.models.SyncStatus, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (r10 == r1) goto L23;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object selectUserReactionToMessage(java.lang.String r7, java.lang.String r8, java.lang.String r9, q83.InterfaceC30057d<? super io.getstream.chat.android.models.Reaction> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository.C192271
            if (r0 == 0) goto L13
            r0 = r10
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectUserReactionToMessage$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository.C192271) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectUserReactionToMessage$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectUserReactionToMessage$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r10)
            goto L78
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            java.lang.Object r7 = r0.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r10)
            goto L63
        L4f:
            p505ts.AbstractC34132o.m107864I(r10)
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao r10 = r6.reactionDao
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r4
            java.lang.Object r10 = r10.selectUserReactionToMessage(r7, r8, r9, r0)
            if (r10 != r1) goto L63
            goto L77
        L63:
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity r10 = (io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity) r10
            if (r10 == 0) goto L7b
            c93.m r7 = r6.getUser
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r10 = io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionMapperKt.toModel(r10, r7, r0)
            if (r10 != r1) goto L78
        L77:
            return r1
        L78:
            io.getstream.chat.android.models.Reaction r10 = (io.getstream.chat.android.models.Reaction) r10
            return r10
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository.selectUserReactionToMessage(java.lang.String, java.lang.String, java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ba -> B:26:0x00bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final java.lang.Object selectUserReactionsToMessage(java.lang.String r10, java.lang.String r11, q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.models.Reaction>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository.C192281
            if (r0 == 0) goto L13
            r0 = r12
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectUserReactionsToMessage$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository.C192281) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectUserReactionsToMessage$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository$selectUserReactionsToMessage$1
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
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity r4 = (io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity) r4
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
            goto Lbb
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
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao r12 = r9.reactionDao
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r12 = r12.selectUserReactionsToMessage(r10, r11, r0)
            if (r12 != r1) goto L76
            goto Lb9
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
            if (r12 == 0) goto Lc2
            java.lang.Object r12 = r4.next()
            io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity r12 = (io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntity) r12
            c93.m r7 = r9.getUser
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
            java.lang.Object r12 = io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionMapperKt.toModel(r12, r7, r0)
            if (r12 != r1) goto Lba
        Lb9:
            return r1
        Lba:
            r7 = r2
        Lbb:
            io.getstream.chat.android.models.Reaction r12 = (io.getstream.chat.android.models.Reaction) r12
            r2.add(r12)
            r2 = r7
            goto L8b
        Lc2:
            java.util.List r2 = (java.util.List) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository.selectUserReactionsToMessage(java.lang.String, java.lang.String, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object updateReactionsForMessageByDeletedDate(String str, String str2, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object deleteAt = this.reactionDao.setDeleteAt(str, str2, date, interfaceC30057d);
        return deleteAt == EnumC31071a.f128113w ? deleteAt : C23454a0.f92919a;
    }
}
